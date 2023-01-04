import numpy as py
import pandas as pd
import matplotlib.pyplot as plt
from pandas.io.formats import style
import seaborn as sns
import matplotlib.font_manager as fm
import folium

font_dirs = ['/usr/share/fonts/truetype/nanum', ]
font_files = fm.findSystemFonts(fontpaths=font_dirs)

for font_file in font_files:
    fm.fontManager.addfont(font_file)


corona1 = pd.read_csv("C:/Users/rlawl/OneDrive/바탕 화면/test/data/서울시 코로나19 확진자 현황1.csv")
#print(corona1.head())
#print(corona1.info())

corona_del_col = corona1.drop(columns=['국적','환자정보','조치사항'])

#print(corona_del_col.info())

#print(corona_del_col['확진일'])

month = []
day = []

for data in corona_del_col['확진일']:
    month.append(data.split('.')[0])
    day.append(data.split('.')[1])

corona_del_col['month'] = month
corona_del_col['day'] = day

corona_del_col['month'].astype('int64')
corona_del_col['day'].astype('int64')

print(corona_del_col['month'])

order = []
for i in range(1,11) :
    order.append(str(i))
print(order)

plt.figure(figsize=(10,5))

sns.set(style="darkgrid")
ax = sns.countplot(x="month", data=corona_del_col, palette = "Set2",order = order)
#plt.show()
#corona_del_col['month'].value_counts().plot(kind="bar")

print(corona_del_col['month'].value_counts()) #내림차순 정렬

order2 = []
for i in range(1,32):
    order2.append(str(i))

plt.figure(figsize=(20,10))
sns.set(style="darkgrid")
ax = sns.countplot(x="day", data = corona_del_col[corona_del_col['month'] == '8'], palette='rocket_r', order = order2)
corona_max = corona_del_col[corona_del_col['month']=='8']['day'].value_counts().mean()
print(corona_max)
print(corona_del_col['지역'])

#plt.show()
plt.rcParams['axes.unicode_minus'] = False
plt.rcParams['font.family'] = 'NanumGothic'
plt.figure(figsize=(20,10))
# 한글 출력을 위해서 폰트 옵션을 설정합니다.

ax = sns.countplot(x="지역", data=corona_del_col, palette="Set2")


corona_out_region = corona_del_col.replace({'종랑구':'중랑구','한국':'기타'})
ax = sns.countplot(x="지역", data=corona_out_region, palette="Set2")
#plt.show()
print(corona_out_region[corona_del_col['month']=='8'])

plt.figure(figsize=(20,10))
ax = sns.countplot(x='지역', data= corona_out_region[corona_del_col['month']=='8'], palette="Set2")
#plt.show()

corona_out_region['month'][corona_out_region['지역']=='관악구']

plt.figure(figsize=(10,5))
sns.set(style="darkgrid")
ax = sns.countplot(x="month", data=corona_out_region[corona_out_region['지역'] == '관악구'], palette="Set2", order = order)
#plt.show()
map_osm = folium.Map(location=[37.529622, 126.984307], zoom_start=11)


RCS = pd.read_csv("C:/Users/rlawl/OneDrive/바탕 화면/test/data/서울시 행정구역 시군구 정보 (좌표계_ WGS1984).csv")
print(RCS[RCS['시군구명_한글']=='중구'])

corona_seoul = corona_out_region.drop(corona_out_region[corona_out_region['지역']=='타시도'].index)
corona_seoul = corona_seoul.drop(corona_out_region[corona_out_region['지역']=='기타'].index)

for region in set(corona_seoul['지역']):
    count = len(corona_seoul[corona_seoul['지역']==region])
    RCS_region = RCS[RCS['시군구명_한글']==region]

    marker = folium.CircleMarker([RCS_region['위도'], RCS_region['경도']], # 위치
                                  radius=count/10 + 10,                 # 범위
                                  color='#3186cc',            # 선 색상
                                  fill_color='#3186cc',       # 면 색상
                                  popup=' '.join((region, str(count), '명'))) # 팝업 설정
    
    marker.add_to(map_osm)

map_osm.save('map.html')


top = corona_out_region[corona_del_col['month'] == '6']['지역'].value_counts()

corona_max_6 = top.index[0]
print(corona_max_6)
plt.show()

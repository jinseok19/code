import numpy as np
import pandas as pd

# 예시) 시리즈 데이터를 만드는 방법.
series = pd.Series([1,2,3,4], index = ['a', 'b', 'c', 'd'], name="Title")
print(series, "\n")


# 국가별 인구 수 시리즈 데이터를 딕셔너리를 사용하여 만들어보세요.
dict = {

    'korea' : 5180,
    'japan' : 12718,
    'china' : 141500,
    'usa' : 32676


}
country = pd.Series(dict)
print(country)

 #########################################################
import numpy as np
import pandas as pd

# 두 개의 시리즈 데이터가 있습니다.
print("Population series data:")
population_dict = {
    'korea': 5180,
    'japan': 12718,
    'china': 141500,
    'usa': 32676
}
population = pd.Series(population_dict)
print(population, "\n")

print("GDP series data:")
gdp_dict = {
    'korea': 169320000,
    'japan': 516700000,
    'china': 1409250000,
    'usa': 2041280000,
}
gdp = pd.Series(gdp_dict)
print(gdp, "\n")


# 이곳에서 2개의 시리즈 값이 들어간 데이터프레임을 생성합니다.
print("Country DataFrame")
country = pd.DataFrame({
    'population' : population,
    'gdp' : gdp
})
print(country)

#########################################################################

import numpy as np
import pandas as pd

print("Masking & query")
df = pd.DataFrame(np.random.rand(5, 2), columns=["A", "B"])
print(df, "\n")

# 데이터 프레임에서 A컬럼값이 0.5보다 작고 B컬럼 값이 0.3보다 큰값들을 구해봅시다.
# 마스킹 연산을 활용하여 출력해보세요!
print(df[(df['A']<0.5) & (df['B']>0.3)])

# query 함수를 활용하여 출력해보세요!
print(df.query("A<0.5 and B>0.3"))

#########################################################################

import numpy as np
import pandas as pd

# GDP와 인구수 시리즈 값이 들어간 데이터프레임을 생성합니다.
population = pd.Series({'korea': 5180,'japan': 12718,'china': 141500,'usa': 32676})
gdp = pd.Series({'korea': 169320000,'japan': 516700000,'china': 1409250000,'usa': 2041280000})
print("Country DataFrame")
country = pd.DataFrame({"population" : population,"gdp" : gdp})
print(country)


# 데이터프레임에 gdp per capita 칼럼을 추가하고 출력합니다.
gdp_per_capita = country['gdp']/country['population']
country['gdp per capita'] = gdp_per_capita
print(country)

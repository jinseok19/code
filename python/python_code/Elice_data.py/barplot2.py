from matplotlib import pyplot as plt
import numpy as np

x = np.random.rand(3)
y = np.random.rand(3)
z = np.random.rand(3)

data = [x, y, z]

plt.subplot()

a = np.arange(3)
values = ['A','B','C']
for i in a:
    plt.bar(a, data[i],
    bottom=np.sum(data[:i], axis=0)
    )
plt.xticks(a, values)
plt.show()
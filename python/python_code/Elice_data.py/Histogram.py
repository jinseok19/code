from matplotlib import pyplot as plt
import numpy as np


weight = [68, 81, 64, 56, 78, 74, 61, 77, 66, 68, 59, 71,
        80, 59, 67, 81, 69, 73, 69, 74, 70, 65]
weight2 = [52, 67, 84, 66, 58, 78, 71, 57, 76, 62, 51, 79,
        69, 64, 76, 57, 63, 53, 79, 64, 50, 61]
plt.subplot(2,2,4)
plt.hist((weight, weight2), histtype='bar', bottom=10)
plt.title('histtype - bar')

plt.subplot(2,2,1)
plt.hist((weight, weight2), histtype='barstacked')

plt.title('histtype - barstacked')

plt.subplot(2,2,2)
plt.hist((weight, weight2), histtype='step')
plt.title('histtype - step')

plt.subplot(2,2,3)
plt.hist((weight, weight2), histtype='stepfilled',bottom=10)
plt.title('histtype - stepfilled')
plt.show()


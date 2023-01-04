from matplotlib import pyplot as plt

import numpy as np

x = np.arange(15)
plt.subplot()
plt.plot(x, x, linestyle = "-")
#solid
plt.plot(x, x+2, linestyle = "--")
# dashed
plt.plot(x, x+4, linestyle = "-.")
# dashdot
plt.plot(x, x+6, linestyle = ":")
# dotted
plt.show()

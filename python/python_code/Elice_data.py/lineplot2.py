from matplotlib import pyplot as plt
import numpy as np


x = np.arange(15)
y = x**2

plt.plot(
		
	x, y,
	linestyle = ":",
	marker = "*",
	color = "#524FA1"
)
plt.show()
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
fig, ax = plt.subplots()

x = np.arange(15)
y = x**2

ax.plot(

  x, y,
  linestyle = ":",
  marker="*",
  color="#524FA1"


)
plt.show()


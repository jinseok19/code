
import sys
import cv2

img = cv2.imread('C:/Users/rlawl/OneDrive/바탕 화면/coding/opencv/ch01/cat.bmp')

cv2.namedWindow('image')
cv2.imshow('image',img)
cv2.destroyAllWindows()
cv2.waitKey(1)


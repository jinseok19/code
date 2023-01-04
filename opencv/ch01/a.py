
import sys
import cv2

img = cv2.imread('cat.bmp')

cv2.namedWindow('image')
cv2.imshow('image',img)
cv2.destroyAllWindows()
cv2.waitKey(1)


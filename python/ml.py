import cv2 
cam=cv2.VideoCapture(0)
while True:
	success,frame=cam.read()
	if success:
		cv2.imshow("My video",frame)
	if cv2.waitKey(1)==27:
		break
    	
cam.release()
cv2.destroyAllWindows()



package com.tencent.ttpic.facedetect;

import android.graphics.PointF;
import java.util.List;

public abstract interface FaceDetector$FaceDetectListener
{
  public abstract void onFaceDetectResult(List<List<PointF>> paramList);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.facedetect.FaceDetector.FaceDetectListener
 * JD-Core Version:    0.6.2
 */
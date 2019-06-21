package com.tencent.ttpic.facedetect;

import android.graphics.PointF;
import com.tencent.faceBeauty.FaceParam;
import java.util.List;

public class FaceParams
{
  private float[] faceAngles;
  private FaceParam faceParam;
  private List<PointF> facePoints;

  public float[] getFaceAngles()
  {
    return this.faceAngles;
  }

  public FaceParam getFaceParam()
  {
    return this.faceParam;
  }

  public List<PointF> getFacePoints()
  {
    return this.facePoints;
  }

  public void setFaceAngles(float[] paramArrayOfFloat)
  {
    this.faceAngles = paramArrayOfFloat;
  }

  public void setFaceParam(FaceParam paramFaceParam)
  {
    this.faceParam = paramFaceParam;
  }

  public void setFacePoints(List<PointF> paramList)
  {
    this.facePoints = paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.facedetect.FaceParams
 * JD-Core Version:    0.6.2
 */
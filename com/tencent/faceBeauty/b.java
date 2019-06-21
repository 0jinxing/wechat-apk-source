package com.tencent.faceBeauty;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.util.i;
import java.util.ArrayList;
import java.util.List;

public abstract class b
{
  public static final int FACE_FEATURE_NUM = 83;
  public static final String TAG = "FaceDetect";
  protected int faceCount = 0;
  protected boolean mDetectedFace;
  public List<FaceParam> mFaceParams = new ArrayList();
  protected List<Boolean> mFemale = new ArrayList();
  protected boolean mGetFaceFeatures = false;
  protected boolean mGetFaceGender = false;

  public static Rect boundingRect(int[][] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfInt[paramInt1][0];
    int j = paramArrayOfInt[paramInt1][1];
    paramInt1++;
    int k = j;
    int m = i;
    if (paramInt1 <= paramInt2)
    {
      int n;
      int i1;
      label48: int i2;
      int i3;
      if (paramArrayOfInt[paramInt1][0] < i)
      {
        n = paramArrayOfInt[paramInt1][0];
        i1 = m;
        if (paramArrayOfInt[paramInt1][1] >= j)
          break label120;
        i2 = paramArrayOfInt[paramInt1][1];
        i3 = k;
      }
      while (true)
      {
        paramInt1++;
        m = i1;
        i = n;
        k = i3;
        j = i2;
        break;
        i1 = m;
        n = i;
        if (paramArrayOfInt[paramInt1][0] <= m)
          break label48;
        i1 = paramArrayOfInt[paramInt1][0];
        n = i;
        break label48;
        label120: i3 = k;
        i2 = j;
        if (paramArrayOfInt[paramInt1][1] > k)
        {
          i3 = paramArrayOfInt[paramInt1][1];
          i2 = j;
        }
      }
    }
    return new Rect(i, j, m, k);
  }

  public final void detectFace(Bitmap paramBitmap)
  {
    long l = System.currentTimeMillis();
    doDetectFace(paramBitmap);
    i.k("FaceDetect", "detectFace() :" + (System.currentTimeMillis() - l));
  }

  public final boolean detectedFace()
  {
    return this.mDetectedFace;
  }

  protected abstract void doDetectFace(Bitmap paramBitmap);

  protected abstract void doInitial();

  protected abstract void doRelease();

  public Rect getEyes(int paramInt)
  {
    if (paramInt > this.mFaceParams.size() - 1);
    for (Rect localRect = null; ; localRect = ((FaceParam)this.mFaceParams.get(paramInt)).bJp)
      return localRect;
  }

  public int getFaceCount()
  {
    return this.faceCount;
  }

  public int[][] getFaceFeatures(int paramInt)
  {
    if (paramInt > this.mFaceParams.size() - 1);
    for (int[][] arrayOfInt = null; ; arrayOfInt = ((FaceParam)this.mFaceParams.get(paramInt)).bJr)
      return arrayOfInt;
  }

  public boolean getFaceFemale(int paramInt)
  {
    if (paramInt > this.mFemale.size() - 1);
    for (boolean bool = false; ; bool = ((Boolean)this.mFemale.get(paramInt)).booleanValue())
      return bool;
  }

  public FaceParam getFaceParams(int paramInt)
  {
    if (paramInt > this.mFaceParams.size() - 1);
    for (FaceParam localFaceParam = null; ; localFaceParam = (FaceParam)this.mFaceParams.get(paramInt))
      return localFaceParam;
  }

  public Rect getFaces(int paramInt)
  {
    if (paramInt > this.mFaceParams.size() - 1);
    for (Rect localRect = null; ; localRect = ((FaceParam)this.mFaceParams.get(paramInt)).bJk)
      return localRect;
  }

  public Point getLeftEyeCenters(int paramInt)
  {
    if (paramInt > this.mFaceParams.size() - 1);
    for (Point localPoint = null; ; localPoint = ((FaceParam)this.mFaceParams.get(paramInt)).bJn)
      return localPoint;
  }

  public Rect getLeftEyes(int paramInt)
  {
    if (paramInt > this.mFaceParams.size() - 1);
    for (Rect localRect = null; ; localRect = ((FaceParam)this.mFaceParams.get(paramInt)).bJl)
      return localRect;
  }

  public Rect getMouths(int paramInt)
  {
    if (paramInt > this.mFaceParams.size() - 1);
    for (Rect localRect = null; ; localRect = ((FaceParam)this.mFaceParams.get(paramInt)).bJq)
      return localRect;
  }

  public Point getRightEyeCenters(int paramInt)
  {
    if (paramInt > this.mFaceParams.size() - 1);
    for (Point localPoint = null; ; localPoint = ((FaceParam)this.mFaceParams.get(paramInt)).bJo)
      return localPoint;
  }

  public Rect getRightEyes(int paramInt)
  {
    if (paramInt > this.mFaceParams.size() - 1);
    for (Rect localRect = null; ; localRect = ((FaceParam)this.mFaceParams.get(paramInt)).bJm)
      return localRect;
  }

  public void needDetectFaceFeatures(boolean paramBoolean)
  {
    this.mGetFaceFeatures = paramBoolean;
  }

  public void needDetectFaceGender(boolean paramBoolean)
  {
    this.mGetFaceGender = paramBoolean;
  }

  public final void release()
  {
    doRelease();
  }

  public void resizeData(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < this.faceCount; i++)
    {
      FaceParam localFaceParam = (FaceParam)this.mFaceParams.get(i);
      if ((localFaceParam.height != paramInt2) || (localFaceParam.width != paramInt1))
      {
        float f1 = paramInt1 / localFaceParam.width;
        float f2 = paramInt2 / localFaceParam.height;
        localFaceParam.height = ((int)(localFaceParam.height * f2));
        localFaceParam.width = ((int)(localFaceParam.width * f1));
        Object localObject = localFaceParam.bJk;
        ((Rect)localObject).left = ((int)(((Rect)localObject).left * f1));
        ((Rect)localObject).top = ((int)(((Rect)localObject).top * f2));
        ((Rect)localObject).right = ((int)(((Rect)localObject).right * f1));
        ((Rect)localObject).bottom = ((int)(((Rect)localObject).bottom * f2));
        localObject = localFaceParam.bJl;
        ((Rect)localObject).left = ((int)(((Rect)localObject).left * f1));
        ((Rect)localObject).top = ((int)(((Rect)localObject).top * f2));
        ((Rect)localObject).right = ((int)(((Rect)localObject).right * f1));
        ((Rect)localObject).bottom = ((int)(((Rect)localObject).bottom * f2));
        localObject = localFaceParam.bJn;
        ((Point)localObject).x = ((int)(((Point)localObject).x * f1));
        ((Point)localObject).y = ((int)(((Point)localObject).y * f2));
        localObject = localFaceParam.bJm;
        ((Rect)localObject).left = ((int)(((Rect)localObject).left * f1));
        ((Rect)localObject).top = ((int)(((Rect)localObject).top * f2));
        ((Rect)localObject).right = ((int)(((Rect)localObject).right * f1));
        ((Rect)localObject).bottom = ((int)(((Rect)localObject).bottom * f2));
        localObject = localFaceParam.bJo;
        ((Point)localObject).x = ((int)(((Point)localObject).x * f1));
        ((Point)localObject).y = ((int)(((Point)localObject).y * f2));
        localObject = localFaceParam.bJp;
        ((Rect)localObject).left = ((int)(((Rect)localObject).left * f1));
        ((Rect)localObject).top = ((int)(((Rect)localObject).top * f2));
        ((Rect)localObject).right = ((int)(((Rect)localObject).right * f1));
        ((Rect)localObject).bottom = ((int)(((Rect)localObject).bottom * f2));
        localObject = localFaceParam.bJq;
        ((Rect)localObject).left = ((int)(((Rect)localObject).left * f1));
        ((Rect)localObject).top = ((int)(((Rect)localObject).top * f2));
        ((Rect)localObject).right = ((int)(((Rect)localObject).right * f1));
        ((Rect)localObject).bottom = ((int)(((Rect)localObject).bottom * f2));
        if (localFaceParam.bJr != null)
        {
          localObject = localFaceParam.bJr;
          for (int j = 0; j < localObject.length; j++)
          {
            localObject[j][0] = ((int)(localObject[j][0] * f1));
            localObject[j][1] = ((int)(localObject[j][1] * f2));
          }
        }
        localFaceParam.height = paramInt2;
        localFaceParam.width = paramInt1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.faceBeauty.b
 * JD-Core Version:    0.6.2
 */
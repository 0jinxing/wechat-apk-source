package com.tencent.ttpic.util.youtu;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.faceBeauty.FaceParam;
import com.tencent.faceBeauty.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import java.util.List;

public class TTpicBitmapFaceDetect extends b
{
  private volatile boolean inited;
  private long mNativeObjPtr;

  public TTpicBitmapFaceDetect()
  {
    AppMethodBeat.i(84365);
    if (YTFaceDetectorBase.getInstance().initFaceTrack() != 0)
    {
      this.inited = false;
      AppMethodBeat.o(84365);
    }
    while (true)
    {
      return;
      if (YTFaceDetectorBase.getInstance().initPicFaceDetect() != 0)
      {
        this.inited = false;
        AppMethodBeat.o(84365);
      }
      else
      {
        nativeConstructor();
        this.inited = true;
        AppMethodBeat.o(84365);
      }
    }
  }

  private void detectParam(Bitmap paramBitmap, boolean paramBoolean, Rect paramRect, Point paramPoint1, Point paramPoint2)
  {
    AppMethodBeat.i(84367);
    this.mDetectedFace = false;
    this.mFaceParams.clear();
    this.faceCount = 0;
    if ((!this.inited) || (!BitmapUtils.isLegal(paramBitmap)))
    {
      AppMethodBeat.o(84367);
      return;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    int k;
    if (i > j)
    {
      k = i;
      k /= 512;
      if (k > 0)
        break label1062;
      k = 1;
    }
    label1032: label1043: label1049: label1062: 
    while (true)
    {
      Bitmap localBitmap;
      int m;
      try
      {
        localBitmap = Bitmap.createBitmap(i / k, j / k, Bitmap.Config.ARGB_8888);
        Object localObject = new android/graphics/Canvas;
        ((Canvas)localObject).<init>(localBitmap);
        Rect localRect1 = new android/graphics/Rect;
        localRect1.<init>(0, 0, i, j);
        Rect localRect2 = new android/graphics/Rect;
        localRect2.<init>(0, 0, i / k, j / k);
        ((Canvas)localObject).drawBitmap(paramBitmap, localRect1, localRect2, null);
        if (!paramBoolean)
          break label1032;
        if (paramRect != null)
          break label994;
        paramBitmap = nativeDetectBitmapByEyes(localBitmap, paramPoint1.x / k, paramPoint1.y / k, paramPoint2.x / k, paramPoint2.y / k);
        this.faceCount = size(paramBitmap);
        m = 0;
        if (m >= this.faceCount)
          break label1049;
        paramPoint1 = paramBitmap[m];
        this.mDetectedFace = true;
        paramRect = new FaceParam();
        paramPoint2 = new Rect();
        paramRect.bJk = paramPoint2;
        paramPoint2.left = (paramPoint1.x * k);
        paramPoint2.top = (paramPoint1.y * k);
        paramPoint2.right = (paramPoint1.x * k + paramPoint1.w * k);
        paramPoint2.bottom = (paramPoint1.y * k + paramPoint1.h * k);
        if (paramPoint2.left < 0)
          paramPoint2.left = 0;
        if (paramPoint2.top < 0)
          paramPoint2.top = 0;
        if (paramPoint2.right > i)
          paramPoint2.right = i;
        if (paramPoint2.bottom > j)
          paramPoint2.bottom = j;
        int n = (int)(paramPoint1.h * k * 0.16D);
        int i1 = (int)(n * 2.0D);
        paramPoint2 = new Rect();
        paramRect.bJl = paramPoint2;
        paramPoint2.left = (paramPoint1.leftEyeX * k - i1 / 2);
        paramPoint2.right = (paramPoint2.left + i1);
        paramPoint2.top = (paramPoint1.leftEyeY * k - n / 2);
        paramPoint2.bottom = (paramPoint2.top + n);
        paramRect.bJn = new Point(paramPoint1.leftEyeX * k, paramPoint1.leftEyeY * k);
        localObject = new Rect();
        paramRect.bJm = ((Rect)localObject);
        ((Rect)localObject).left = (paramPoint1.rightEyeX * k - i1 / 2);
        ((Rect)localObject).right = (i1 + ((Rect)localObject).left);
        ((Rect)localObject).top = (paramPoint1.rightEyeY * k - n / 2);
        ((Rect)localObject).bottom = (n + ((Rect)localObject).top);
        paramRect.bJo = new Point(paramPoint1.rightEyeX * k, paramPoint1.rightEyeY * k);
        localRect2 = new Rect();
        paramRect.bJp = localRect2;
        localRect2.left = paramPoint2.left;
        localRect2.top = paramPoint2.top;
        localRect2.right = ((Rect)localObject).right;
        localRect2.bottom = ((Rect)localObject).bottom;
        if (localRect2.left < 0)
          localRect2.left = 0;
        if (localRect2.top < 0)
          localRect2.top = 0;
        if (localRect2.right > i)
          localRect2.right = i;
        if (localRect2.bottom > j)
          localRect2.bottom = j;
        i1 = (int)(paramPoint1.w * k * 0.4D);
        n = (int)(paramPoint1.h * k * 0.16D);
        paramPoint2 = new Rect();
        paramRect.bJq = paramPoint2;
        paramPoint2.left = (paramPoint1.mouthX * k - i1 / 2);
        paramPoint2.top = (paramPoint1.mouthY * k - n / 2);
        paramPoint2.right = (paramPoint2.left + i1);
        paramPoint2.bottom = (paramPoint2.top + n);
        paramRect.width = i;
        paramRect.height = j;
        this.mFaceParams.add(paramRect);
        if (this.mGetFaceGender)
          this.mFemale.add(Boolean.TRUE);
        if (!this.mGetFaceFeatures)
          break label1043;
        paramPoint1 = nativeGetFeatures(m);
        paramRect.bJr = paramPoint1;
        n = size(paramPoint1);
        i1 = 0;
        if (i1 >= n)
          break label1043;
        paramPoint1[i1][0] *= k;
        paramPoint1[i1][1] *= k;
        i1++;
        continue;
        k = j;
      }
      catch (OutOfMemoryError paramBitmap)
      {
        AppMethodBeat.o(84367);
      }
      break;
      label994: paramBitmap = nativeDetectBitmapByFace(localBitmap, paramRect.left / k, paramRect.top / k, paramRect.width() / k, paramRect.height() / k);
      continue;
      paramBitmap = nativeDetectBitmap(localBitmap, false);
      continue;
      m++;
      continue;
      localBitmap.recycle();
      AppMethodBeat.o(84367);
      break;
    }
  }

  private native boolean nativeConstructor();

  private native void nativeDestructor();

  private native TTImageFeature[] nativeDetectBitmap(Bitmap paramBitmap, boolean paramBoolean);

  private native TTImageFeature[] nativeDetectBitmapByEyes(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  private native TTImageFeature[] nativeDetectBitmapByFace(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  private native float[] nativeGetAngles(int paramInt);

  private native int[][] nativeGetFeatures(int paramInt);

  private native int[][] nativeGetShapePoints(int paramInt);

  private native int nativeInit(String paramString);

  public void destroy()
  {
    AppMethodBeat.i(84366);
    if (this.inited)
    {
      nativeDestructor();
      this.inited = false;
    }
    AppMethodBeat.o(84366);
  }

  public void detectFaceByManual(Bitmap paramBitmap, Point paramPoint1, Point paramPoint2)
  {
    AppMethodBeat.i(84369);
    detectParam(paramBitmap, true, null, paramPoint1, paramPoint2);
    AppMethodBeat.o(84369);
  }

  public void detectFaceByManual(Bitmap paramBitmap, Rect paramRect, Point paramPoint1, Point paramPoint2)
  {
    AppMethodBeat.i(84370);
    detectParam(paramBitmap, true, paramRect, paramPoint1, paramPoint2);
    AppMethodBeat.o(84370);
  }

  public void doDetectFace(Bitmap paramBitmap)
  {
    AppMethodBeat.i(84368);
    detectParam(paramBitmap, false, null, null, null);
    AppMethodBeat.o(84368);
  }

  public void doInitial()
  {
  }

  public void doRelease()
  {
  }

  public float[] getFaceAngles(int paramInt)
  {
    AppMethodBeat.i(84371);
    float[] arrayOfFloat = nativeGetAngles(paramInt);
    for (paramInt = 0; paramInt < arrayOfFloat.length; paramInt++)
      arrayOfFloat[paramInt] = ((float)(arrayOfFloat[paramInt] * 3.141592653589793D / 180.0D));
    AppMethodBeat.o(84371);
    return arrayOfFloat;
  }

  public int size(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null);
    for (int i = 0; ; i = paramArrayOfObject.length)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.youtu.TTpicBitmapFaceDetect
 * JD-Core Version:    0.6.2
 */
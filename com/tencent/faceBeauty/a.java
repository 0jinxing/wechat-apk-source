package com.tencent.faceBeauty;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.FaceDetector;
import android.media.FaceDetector.Face;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class a extends b
{
  private void a(PointF paramPointF, float paramFloat, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(86275);
    FaceParam localFaceParam = new FaceParam();
    Rect localRect1 = new Rect();
    localFaceParam.bJk = localRect1;
    localRect1.left = ((int)(paramPointF.x - paramFloat * 1.2D));
    localRect1.top = ((int)(paramPointF.y - paramFloat * 0.9D));
    localRect1.right = ((int)(paramPointF.x + paramFloat * 1.2D));
    localRect1.bottom = ((int)(paramPointF.y + paramFloat * 1.4D));
    if (localRect1.left < 0)
      localRect1.left = 0;
    if (localRect1.top < 0)
      localRect1.top = 0;
    if (localRect1.right > paramInt1)
      localRect1.right = paramInt1;
    if (localRect1.bottom > paramInt2)
      localRect1.bottom = paramInt2;
    Rect localRect2 = new Rect();
    localFaceParam.bJp = localRect2;
    localRect2.left = ((int)(paramPointF.x - 0.8D * paramFloat));
    localRect2.top = ((int)(paramPointF.y - paramFloat * 0.2D));
    localRect2.right = ((int)(paramPointF.x + 0.8D * paramFloat));
    localRect2.bottom = ((int)(paramPointF.y + paramFloat * 0.28D));
    if (localRect2.left < 0)
      localRect2.left = 0;
    if (localRect2.top < 0)
      localRect2.top = 0;
    if (localRect2.right > paramInt1)
      localRect2.right = paramInt1;
    if (localRect2.bottom > paramInt2)
      localRect2.bottom = paramInt2;
    paramPointF = new Rect();
    localFaceParam.bJl = paramPointF;
    paramPointF.left = localRect2.left;
    paramPointF.right = (localRect2.width() * 3 / 7 + paramPointF.left);
    localRect2.top -= localRect2.height() / 6;
    paramPointF.bottom = (localRect2.height() * 4 / 3 + paramPointF.top);
    localFaceParam.bJn = new Point(paramPointF.centerX(), paramPointF.centerY());
    paramPointF = new Rect(paramPointF);
    localFaceParam.bJm = paramPointF;
    paramPointF.left += localRect2.width() * 2 / 3;
    int i = paramPointF.right;
    paramPointF.right = (localRect2.width() * 2 / 3 + i);
    localFaceParam.bJo = new Point(paramPointF.centerX(), paramPointF.centerY());
    paramPointF = new Rect();
    localFaceParam.bJq = paramPointF;
    paramPointF.left = ((int)(localRect1.left + localRect1.width() * 0.6D / 2.0D));
    paramPointF.top = ((int)(localRect1.top + localRect1.height() * 0.72D));
    paramPointF.right = ((int)(localRect1.width() * 0.4D) + paramPointF.left);
    paramPointF.bottom = ((int)(localRect1.height() * 0.16D) + paramPointF.top);
    localFaceParam.width = paramInt1;
    localFaceParam.height = paramInt2;
    this.mFaceParams.add(localFaceParam);
    AppMethodBeat.o(86275);
  }

  protected final void doDetectFace(Bitmap paramBitmap)
  {
    AppMethodBeat.i(86274);
    this.mDetectedFace = false;
    this.mFaceParams.clear();
    this.faceCount = 0;
    if (paramBitmap == null)
      AppMethodBeat.o(86274);
    while (true)
    {
      return;
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      PointF localPointF = new PointF();
      int k;
      Object localObject1;
      Object localObject2;
      int m;
      if (paramBitmap.getConfig() == Bitmap.Config.RGB_565)
      {
        k = 1;
        localObject1 = new FaceDetector(paramBitmap.getWidth(), paramBitmap.getHeight(), 10);
        localObject2 = new FaceDetector.Face[10];
        m = ((FaceDetector)localObject1).findFaces(paramBitmap, (FaceDetector.Face[])localObject2);
        paramBitmap.recycle();
        this.faceCount = m;
      }
      float f3;
      for (int n = 0; ; n++)
      {
        int i2;
        while (true)
        {
          if (n >= this.faceCount)
            break label395;
          localObject1 = localObject2[n];
          float f1 = ((FaceDetector.Face)localObject1).eyesDistance();
          int i1 = n + 1;
          i2 = n;
          while (i1 < this.faceCount)
          {
            float f2 = localObject2[i1].eyesDistance();
            f3 = f1;
            if (f2 > f1)
            {
              f3 = f2;
              i2 = i1;
            }
            i1++;
            f1 = f3;
          }
          if (i > j)
          {
            n = i;
            i1 = n / 512;
            n = i1;
            if (i1 <= 0)
              n = 1;
          }
          try
          {
            localObject2 = Bitmap.createBitmap(i / n, j / n, Bitmap.Config.RGB_565);
            localObject1 = new android/graphics/Canvas;
            ((Canvas)localObject1).<init>((Bitmap)localObject2);
            Rect localRect1 = new android/graphics/Rect;
            localRect1.<init>(0, 0, i, j);
            Rect localRect2 = new android/graphics/Rect;
            localRect2.<init>(0, 0, i / n, j / n);
            ((Canvas)localObject1).drawBitmap(paramBitmap, localRect1, localRect2, null);
            paramBitmap = (Bitmap)localObject2;
            k = n;
            break;
            n = j;
          }
          catch (OutOfMemoryError localOutOfMemoryError)
          {
            localPointF.x = (paramBitmap.getWidth() / 2);
            localPointF.y = (paramBitmap.getHeight() / 2);
            a(localPointF, paramBitmap.getWidth() / 4, i, j);
            AppMethodBeat.o(86274);
          }
        }
        break;
        if (i2 != n)
        {
          paramBitmap = localOutOfMemoryError[i2];
          localOutOfMemoryError[i2] = localObject1;
          localOutOfMemoryError[n] = paramBitmap;
        }
      }
      label395: for (n = 0; n < m; n++)
      {
        this.mDetectedFace = true;
        localOutOfMemoryError[n].getMidPoint(localPointF);
        f3 = localOutOfMemoryError[n].eyesDistance();
        localPointF.x *= k;
        localPointF.y *= k;
        a(localPointF, f3 * k, i, j);
      }
      AppMethodBeat.o(86274);
    }
  }

  protected final void doInitial()
  {
  }

  protected final void doRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.faceBeauty.a
 * JD-Core Version:    0.6.2
 */
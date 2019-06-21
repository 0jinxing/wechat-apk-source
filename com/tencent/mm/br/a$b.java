package com.tencent.mm.br;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.n;
import com.tencent.mm.api.s.a;
import com.tencent.mm.cache.d;
import com.tencent.mm.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

final class a$b
  implements Runnable
{
  n vxb;
  boolean vxc;

  a$b(a parama, n paramn, boolean paramBoolean)
  {
    this.vxb = paramn;
    this.vxc = paramBoolean;
  }

  private static Bitmap a(Bitmap paramBitmap, Rect paramRect, float paramFloat, BitmapFactory.Options paramOptions, Matrix paramMatrix)
  {
    AppMethodBeat.i(116320);
    try
    {
      Bitmap localBitmap;
      if ((paramBitmap.getWidth() - paramRect.width() > 9) || (paramBitmap.getHeight() - paramRect.height() > 9))
        localBitmap = Bitmap.createBitmap(paramBitmap, paramRect.left, paramRect.top, paramRect.width(), paramRect.height(), paramMatrix, true);
      for (paramBitmap = localBitmap; ; paramBitmap = localBitmap)
      {
        AppMethodBeat.o(116320);
        return paramBitmap;
        localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), paramMatrix, true);
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.DrawingPresenter", localOutOfMemoryError, "", new Object[0]);
        float f1 = 1920.0F / paramOptions.outHeight;
        float f2 = 1920.0F / paramOptions.outWidth;
        if (f1 > f2)
          f2 = f1;
        while (true)
        {
          paramMatrix.reset();
          paramMatrix.postScale(f2, f2, 0.0F, 0.0F);
          paramMatrix.postRotate(-paramFloat);
          if ((paramBitmap.getWidth() - paramRect.width() <= 9) && (paramBitmap.getHeight() - paramRect.height() <= 9))
            break label223;
          paramBitmap = Bitmap.createBitmap(paramBitmap, paramRect.left, paramRect.top, paramRect.width(), paramRect.height(), paramMatrix, true);
          break;
        }
        label223: paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), paramMatrix, true);
      }
    }
  }

  public final void run()
  {
    AppMethodBeat.i(116319);
    label274: Object localObject4;
    try
    {
      if (Looper.myLooper() == null)
        Looper.prepare();
      Iterator localIterator1 = this.vwV.vwO.iterator();
      while (localIterator1.hasNext())
        ((b)localIterator1.next()).CK();
    }
    catch (Exception localException1)
    {
      this.vxb.onError(localException1);
      try
      {
        Iterator localIterator2 = this.vwV.vwO.iterator();
        while (localIterator2.hasNext())
          ((b)localIterator2.next()).onFinish();
      }
      catch (Exception localException2)
      {
        AppMethodBeat.o(116319);
      }
      Bitmap localBitmap1;
      while (true)
      {
        return;
        localObject3 = null;
        int i;
        int j;
        if (!this.vwV.vwM.getBaseBoardView().dMM())
        {
          i = this.vwV.vwM.getBaseBoardView().getAliveRect().width();
          j = this.vwV.vwM.getBaseBoardView().getAliveRect().height();
          localObject1 = localObject3;
          if (i > 0)
          {
            localObject1 = localObject3;
            if (j <= 0);
          }
        }
        for (Object localObject1 = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888); ; localBitmap1 = this.vwV.vwQ)
        {
          if (localObject1 != null)
            break label274;
          localObject3 = this.vxb;
          localObject1 = new java/lang/NullPointerException;
          ((NullPointerException)localObject1).<init>("bitmap is null!");
          ((n)localObject3).onError((Exception)localObject1);
          try
          {
            localObject1 = this.vwV.vwO.iterator();
            while (((Iterator)localObject1).hasNext())
              ((b)((Iterator)localObject1).next()).onFinish();
          }
          catch (Exception localException3)
          {
            AppMethodBeat.o(116319);
          }
          break;
        }
        this.vwV.onDestroy();
        AppMethodBeat.o(116319);
      }
      localObject3 = new android/graphics/Canvas;
      ((Canvas)localObject3).<init>(localBitmap1);
      localObject4 = this.vwV.vwO.iterator();
      while (((Iterator)localObject4).hasNext())
        ((b)((Iterator)localObject4).next()).CI().b((Canvas)localObject3);
    }
    finally
    {
      try
      {
        Object localObject3 = this.vwV.vwO.iterator();
        while (((Iterator)localObject3).hasNext())
          ((b)((Iterator)localObject3).next()).onFinish();
      }
      catch (Exception localException5)
      {
      }
    }
    while (true)
    {
      AppMethodBeat.o(116319);
      throw localBitmap2;
      BitmapFactory.Options localOptions = new android/graphics/BitmapFactory$Options;
      localOptions.<init>();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(this.vwV.ccP.path, localOptions);
      float f1 = localOptions.outHeight * 1.0F / localBitmap2.getHeight();
      float f2 = localOptions.outWidth * 1.0F / localBitmap2.getWidth();
      if (f1 > f2);
      while (true)
      {
        f2 = f1;
        if (f1 == 0.0F)
          f2 = 1.0F;
        f1 = this.vwV.vwM.getBaseBoardView().b(this.vwV.vwM.getBaseBoardView().getMainMatrix());
        Matrix localMatrix = new android/graphics/Matrix;
        localMatrix.<init>();
        localMatrix.postScale(f2, f2, 0.0F, 0.0F);
        localMatrix.postRotate(-f1);
        localObject4 = new android/graphics/Rect;
        ((Rect)localObject4).<init>(this.vwV.vwM.getBaseBoardView().getAliveRect());
        ab.i("MicroMsg.DrawingPresenter", "[saveEditPhoto] clipRectF:%s w:%s h:%s", new Object[] { localObject4, Integer.valueOf(localBitmap2.getWidth()), Integer.valueOf(localBitmap2.getHeight()) });
        if (((Rect)localObject4).left < 0)
          ((Rect)localObject4).left = 0;
        if (((Rect)localObject4).top < 0)
          ((Rect)localObject4).top = 0;
        if (((Rect)localObject4).bottom < 0)
          ((Rect)localObject4).bottom = 0;
        if (((Rect)localObject4).right < 0)
          ((Rect)localObject4).right = 0;
        if (((Rect)localObject4).bottom > localBitmap2.getHeight())
          ((Rect)localObject4).bottom = localBitmap2.getHeight();
        if (((Rect)localObject4).right > localBitmap2.getWidth())
          ((Rect)localObject4).right = localBitmap2.getWidth();
        Object localObject2 = a(localBitmap2, (Rect)localObject4, f1, localOptions, localMatrix);
        this.vxb.b((Bitmap)localObject2, this.vxc);
        try
        {
          localObject2 = this.vwV.vwO.iterator();
          while (((Iterator)localObject2).hasNext())
            ((b)((Iterator)localObject2).next()).onFinish();
        }
        catch (Exception localException4)
        {
          AppMethodBeat.o(116319);
        }
        break;
        f1 = f2;
      }
      this.vwV.onDestroy();
      AppMethodBeat.o(116319);
      break;
      this.vwV.onDestroy();
      AppMethodBeat.o(116319);
      break;
      this.vwV.onDestroy();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.br.a.b
 * JD-Core Version:    0.6.2
 */
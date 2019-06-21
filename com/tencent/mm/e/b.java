package com.tencent.mm.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cache.d;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class b<T extends d>
{
  public static final b cjg = new b.1();
  private boolean bYT;
  public boolean bZq;
  public com.tencent.mm.br.b cjc;
  private Matrix cjd;
  Rect cje;
  private Bitmap cjf;
  private Canvas cjh = new Canvas();
  private Runnable cji;
  PointF cjj = new PointF();
  private PointF cjk = new PointF();
  private Context mContext;
  float[] values = new float[9];

  private float a(Matrix paramMatrix, int paramInt)
  {
    paramMatrix.getValues(this.values);
    return this.values[paramInt];
  }

  protected static int p(MotionEvent paramMotionEvent)
  {
    int i = 0;
    if (paramMotionEvent.getPointerCount() > 1)
    {
      int j = (int)(paramMotionEvent.getX(0) - paramMotionEvent.getX(1));
      i = (int)(paramMotionEvent.getY(0) - paramMotionEvent.getY(1));
      i = (int)Math.sqrt(i * i + j * j);
    }
    return i;
  }

  protected static int[] q(MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = new int[2];
    if (paramMotionEvent.getPointerCount() > 1)
    {
      arrayOfInt[0] = ((int)(paramMotionEvent.getX(0) - paramMotionEvent.getX(1)));
      arrayOfInt[1] = ((int)(paramMotionEvent.getY(0) - paramMotionEvent.getY(1)));
    }
    return arrayOfInt;
  }

  protected final float[] A(float paramFloat1, float paramFloat2)
  {
    Matrix localMatrix = new Matrix(this.cjd);
    this.cjd.invert(localMatrix);
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    localMatrix.mapPoints(arrayOfFloat);
    return arrayOfFloat;
  }

  protected final float[] B(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    this.cjd.mapPoints(arrayOfFloat);
    return arrayOfFloat;
  }

  public abstract a CG();

  public abstract void CH();

  public final T CI()
  {
    return this.cjc.a(CG());
  }

  public void CJ()
  {
    ab.i("MicroMsg.BaseArtist" + CG(), "[onSelected] ");
  }

  public final void CK()
  {
    if ((this.cjf != null) && (!this.cjf.isRecycled()))
      this.cjf.recycle();
  }

  public boolean CL()
  {
    boolean bool = true;
    try
    {
      int i = CI().ac(true);
      if (i > 0);
      while (true)
      {
        return bool;
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
        bool = false;
    }
  }

  protected final Bitmap CM()
  {
    Rect localRect;
    int i;
    if ((this.cjf == null) || (this.cjf.isRecycled()))
    {
      localRect = this.cjc.dlT().getBaseBoardView().getImageBitmapRect();
      if ((!localRect.isEmpty()) && (this.cjc.dlT().getBaseBoardView().dMM()))
        break label113;
      i = this.cjc.dlT().getBaseBoardView().getBoardRect().width();
    }
    for (int j = this.cjc.dlT().getBaseBoardView().getBoardRect().height(); ; j = localRect.height())
    {
      this.cjf = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_4444);
      return this.cjf;
      label113: i = localRect.width();
    }
  }

  protected final boolean CN()
  {
    if (this.cjc.dlU().CG() == CG());
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void CO()
  {
    if (CI().pop() != null)
      CI().CO();
    this.cjc.dlT().removeCallbacks(this.cji);
    com.tencent.mm.view.a locala = this.cjc.dlT();
    Runnable local2 = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(116148);
        b.this.CH();
        b.this.CP();
        b.a(b.this);
        AppMethodBeat.o(116148);
      }
    };
    this.cji = local2;
    locala.postDelayed(local2, 66L);
  }

  public final void CP()
  {
    this.cjc.dlT().getBaseBoardView().postInvalidate();
  }

  public final void CQ()
  {
    this.cjc.dlT().getBaseFooterView().postInvalidate();
  }

  public final void a(Canvas paramCanvas)
  {
    if ((this.cjf != null) && (!this.cjf.isRecycled()))
      paramCanvas.drawBitmap(this.cjf, 0.0F, 0.0F, null);
  }

  public void a(com.tencent.mm.br.b paramb, Matrix paramMatrix, Rect paramRect)
  {
    ab.i("MicroMsg.BaseArtist" + CG(), "[onCreate]");
    this.bZq = true;
    this.mContext = paramb.getContext();
    this.cjc = paramb;
    this.cjd = paramMatrix;
    this.cje = paramRect;
  }

  public final float b(Matrix paramMatrix)
  {
    return (float)Math.round(Math.atan2(a(paramMatrix, 1), a(paramMatrix, 0)) * 57.295779513082323D);
  }

  public void bk(boolean paramBoolean)
  {
    this.cjh.setBitmap(CM());
    d locald = CI();
    if (locald != null)
      locald.a(this.cjh, paramBoolean);
    while (true)
    {
      return;
      ab.i("MicroMsg.BaseArtist", "updateCache: cache is null");
    }
  }

  protected final Rect getBoardRect()
  {
    return this.cjc.dlT().getBaseBoardView().getBoardRect();
  }

  public final Matrix getMainMatrix()
  {
    return this.cjc.dlT().getBaseBoardView().getMainMatrix();
  }

  public final float getRotation()
  {
    return (float)Math.round(Math.atan2(a(this.cjd, 1), a(this.cjd, 0)) * 57.295779513082323D);
  }

  public final float getScale()
  {
    float f1 = a(this.cjd, 3);
    float f2 = a(this.cjd, 0);
    return (float)Math.sqrt(f1 * f1 + f2 * f2);
  }

  public final boolean isAlive()
  {
    if ((this.bZq) && (this.bYT));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final void o(Bitmap paramBitmap)
  {
    if ((CM() != null) && (!CM().isRecycled()))
      CM().recycle();
    this.cjf = paramBitmap;
  }

  public boolean o(MotionEvent paramMotionEvent)
  {
    if (s(paramMotionEvent))
      r(paramMotionEvent);
    return false;
  }

  public void onDestroy()
  {
    this.bZq = false;
    this.bYT = false;
    ab.i("MicroMsg.BaseArtist" + CG(), "[onDestroy]");
    CK();
  }

  public abstract void onDraw(Canvas paramCanvas);

  public final void onFinish()
  {
    ab.i("MicroMsg.BaseArtist", "[onFinish] type:%s", new Object[] { CG() });
    this.bYT = false;
    this.bZq = false;
    d locald = CI();
    if (locald != null)
      locald.by(true);
    while (true)
    {
      CK();
      return;
      ab.e("MicroMsg.BaseArtist", "[onFinish] type:%s cache is null", new Object[] { CG() });
    }
  }

  protected final void r(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getPointerCount() > 1)
    {
      this.cjk.x = paramMotionEvent.getX(1);
      this.cjk.y = paramMotionEvent.getY(1);
    }
    label141: label166: 
    while (true)
    {
      if (paramMotionEvent.getActionMasked() == 6)
      {
        if ((paramMotionEvent.getPointerCount() <= 1) || (1 - paramMotionEvent.getActionIndex() < 0) || (1 - paramMotionEvent.getActionIndex() >= paramMotionEvent.getPointerCount()))
          break label141;
        this.cjj.x = paramMotionEvent.getX(1 - paramMotionEvent.getActionIndex());
      }
      for (this.cjj.y = paramMotionEvent.getY(1 - paramMotionEvent.getActionIndex()); ; this.cjj.y = paramMotionEvent.getY(0))
      {
        return;
        if (paramMotionEvent.getPointerCount() != 1)
          break label166;
        this.cjj.x = paramMotionEvent.getX(0);
        this.cjj.y = paramMotionEvent.getY(0);
        break;
        this.cjj.x = paramMotionEvent.getX(0);
      }
    }
  }

  protected final boolean s(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramMotionEvent.getPointerCount() > 1)
      if ((Math.abs(this.cjj.x - paramMotionEvent.getX(0)) <= 3.0F) && (Math.abs(this.cjj.y - paramMotionEvent.getY(0)) <= 3.0F) && (Math.abs(this.cjk.x - paramMotionEvent.getX(1)) <= 3.0F))
      {
        bool2 = bool1;
        if (Math.abs(this.cjk.y - paramMotionEvent.getY(1)) <= 3.0F);
      }
      else
      {
        bool2 = true;
      }
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (paramMotionEvent.getPointerCount() == 1)
        if (Math.abs(this.cjj.x - paramMotionEvent.getX(0)) <= 3.0F)
        {
          bool2 = bool1;
          if (Math.abs(this.cjj.y - paramMotionEvent.getY(0)) <= 3.0F);
        }
        else
        {
          bool2 = true;
        }
    }
  }

  public final void setOneFingerMoveEnable(boolean paramBoolean)
  {
    this.cjc.dlT().getBaseBoardView().setOneFingerMoveEnable(paramBoolean);
  }

  public void zC()
  {
    ab.i("MicroMsg.BaseArtist" + CG(), "[onAlive] isAlive:%s", new Object[] { Boolean.valueOf(this.bYT) });
    if (this.bYT)
      return;
    this.bYT = true;
    d locald = CI();
    if (locald != null)
    {
      locald.Je();
      locald.by(false);
    }
    while (true)
    {
      this.cjf = CM();
      break;
      ab.e("MicroMsg.BaseArtist", "[onAlive] type:%s cache is null", new Object[] { CG() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.b
 * JD-Core Version:    0.6.2
 */
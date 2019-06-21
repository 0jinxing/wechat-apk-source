package com.tencent.mm.view.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.s.a;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.sdk.platformtools.ab;

public class a extends View
{
  protected Matrix AbS;
  public Rect AbT;
  private Rect AbU;
  private Rect AbV;
  private Runnable AbW;
  protected float AbX;
  protected float AbY;
  private boolean AbZ;
  private boolean cjF;
  private com.tencent.mm.br.b cjc;
  protected Matrix cjd;
  private Rect cje;
  private Rect eHd;
  private float eHj;
  private float lbS;
  private float lbT;
  float[] values;

  public a(Context paramContext, com.tencent.mm.br.b paramb)
  {
    super(paramContext);
    AppMethodBeat.i(116402);
    this.eHj = 1.0F;
    this.AbZ = true;
    this.cjF = false;
    this.values = new float[9];
    this.cjc = paramb;
    this.cjd = new Matrix();
    this.AbS = new Matrix();
    this.cje = new Rect();
    this.AbT = new Rect();
    this.AbU = new Rect();
    this.eHd = new Rect();
    this.AbV = new Rect();
    paramContext = paramb.dlV();
    if (paramContext != null)
    {
      this.eHd.set(0, 0, paramContext.getWidth(), paramContext.getHeight());
      this.cje.set(this.eHd);
      this.AbV.set(this.eHd);
    }
    if ((!dMM()) && (paramb.getConfig().rect != null))
    {
      paramContext = paramb.getConfig().rect;
      this.cje.set(0, 0, paramContext.width(), paramContext.height());
      this.cjd.postTranslate(0.0F, paramContext.top);
    }
    AppMethodBeat.o(116402);
  }

  private float a(Matrix paramMatrix, int paramInt)
  {
    AppMethodBeat.i(116412);
    paramMatrix.getValues(this.values);
    float f = this.values[paramInt];
    AppMethodBeat.o(116412);
    return f;
  }

  protected void V(MotionEvent paramMotionEvent)
  {
  }

  public final void a(a.b paramb, float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(116409);
    Object localObject = getCurImageRect();
    int i = (int)((RectF)localObject).centerX();
    int j = (int)((RectF)localObject).centerY();
    int k = getBoardRect().centerX();
    int m = getBoardRect().centerY();
    if (paramFloat % 180.0F == 0.0F)
    {
      f = ((RectF)localObject).width() * 1.0F / ((RectF)localObject).height();
      if (f >= getBoardRect().width() * 1.0F / getBoardRect().height())
        break label200;
      getBoardRect().width();
      f = getBoardRect().height();
      label112: if (paramFloat % 180.0F != 0.0F)
        break label224;
    }
    label200: label224: for (float f = f * 1.0F / ((RectF)localObject).height(); ; f = f * 1.0F / ((RectF)localObject).width())
    {
      localObject = new a.a(this, f, k - i, m - j, i, j, paramFloat, paramBoolean);
      ((a.a)localObject).Ace = paramb;
      ((a.a)localObject).play();
      AppMethodBeat.o(116409);
      return;
      f = ((RectF)localObject).height() * 1.0F / ((RectF)localObject).width();
      break;
      getBoardRect().height();
      f = getBoardRect().width() / f;
      break label112;
    }
  }

  public final float b(Matrix paramMatrix)
  {
    AppMethodBeat.i(116415);
    float f = (float)Math.round(Math.atan2(a(paramMatrix, 1), a(paramMatrix, 0)) * 57.295779513082323D);
    AppMethodBeat.o(116415);
    return f;
  }

  protected final float d(Matrix paramMatrix)
  {
    AppMethodBeat.i(116413);
    float f1 = a(paramMatrix, 3);
    float f2 = a(paramMatrix, 0);
    f1 = (float)Math.sqrt(f1 * f1 + f2 * f2);
    AppMethodBeat.o(116413);
    return f1;
  }

  protected boolean dML()
  {
    return this.AbZ;
  }

  public boolean dMM()
  {
    return true;
  }

  public final void dMN()
  {
    AppMethodBeat.i(116408);
    Object localObject = getRawImageRect();
    float f2;
    if (b(this.cjd) % 180.0F == 0.0F)
    {
      f1 = ((Rect)localObject).width() * 1.0F / ((Rect)localObject).height();
      if (f1 >= getBoardRect().width() * 1.0F / getBoardRect().height())
        break label301;
      f1 = getBoardRect().width() / f1;
      f2 = getBoardRect().height();
      label84: if (b(this.cjd) % 180.0F != 0.0F)
        break label328;
      f2 = 1.0F * f2 / ((Rect)localObject).height();
      label110: if (b(this.cjd) % 180.0F != 0.0F)
        break label341;
    }
    label301: label328: label341: for (float f1 = f1 * 1.0F / ((Rect)localObject).height(); ; f1 = f1 * 1.0F / ((Rect)localObject).width())
    {
      int i = ((Rect)localObject).centerX();
      int j = ((Rect)localObject).centerY();
      this.cjd.postScale(f2, f2, i, j);
      localObject = getCurImageRect();
      int k = (int)((RectF)localObject).centerX();
      i = (int)((RectF)localObject).centerY();
      int m = getBoardRect().centerX();
      j = getBoardRect().centerY();
      this.cjd.postTranslate(m - k, j - i);
      this.AbS.set(this.cjd);
      this.AbX = (d(this.AbS) * 3.0F);
      this.AbY = (d(this.AbS) * 1.0F);
      if (this.AbX < f1)
        this.AbX = (f1 * 1.2F);
      AppMethodBeat.o(116408);
      return;
      f1 = ((Rect)localObject).height() * 1.0F / ((Rect)localObject).width();
      break;
      float f3 = getBoardRect().height();
      f2 = getBoardRect().width() / f1;
      f1 = f3;
      break label84;
      f2 = 1.0F * f2 / ((Rect)localObject).width();
      break label110;
    }
  }

  public Rect getAliveRect()
  {
    return this.cje;
  }

  public Rect getBoardRect()
  {
    AppMethodBeat.i(116407);
    if (this.AbT == null)
      this.AbT = new Rect();
    Rect localRect = this.AbT;
    AppMethodBeat.o(116407);
    return localRect;
  }

  public RectF getCurImageRect()
  {
    AppMethodBeat.i(116410);
    RectF localRectF = new RectF(getRawImageRect());
    this.cjd.mapRect(localRectF);
    AppMethodBeat.o(116410);
    return localRectF;
  }

  public float getCurScale()
  {
    AppMethodBeat.i(116414);
    float f = d(this.cjd);
    AppMethodBeat.o(116414);
    return f;
  }

  public Rect getImageBitmapRect()
  {
    return this.AbV;
  }

  public float getInitScale()
  {
    AppMethodBeat.i(116406);
    float f;
    if (dMM())
    {
      f = this.eHj;
      AppMethodBeat.o(116406);
    }
    while (true)
    {
      return f;
      f = 1.0F;
      AppMethodBeat.o(116406);
    }
  }

  public Matrix getMainMatrix()
  {
    return this.cjd;
  }

  public float getMaxScale()
  {
    return this.AbX;
  }

  public float getMinScale()
  {
    return this.AbY;
  }

  public com.tencent.mm.br.b getPresenter()
  {
    return this.cjc;
  }

  public Rect getRawBoardRect()
  {
    return this.AbU;
  }

  public Rect getRawImageRect()
  {
    return this.eHd;
  }

  public final void o(Rect paramRect)
  {
    AppMethodBeat.i(116411);
    this.eHd.set(paramRect);
    this.cje.set(paramRect);
    ab.i("MicroMsg.BaseBoardView", "[resetImageRect] rect");
    AppMethodBeat.o(116411);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116404);
    super.onDraw(paramCanvas);
    paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    paramCanvas.setMatrix(this.cjd);
    getPresenter().onDraw(paramCanvas);
    AppMethodBeat.o(116404);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(116403);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ab.i("changelcai", "[onLayout] %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.AbT.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.AbU.set(this.AbT);
    }
    AppMethodBeat.o(116403);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(116405);
    Object localObject;
    if (getPresenter().dlW())
    {
      if (paramMotionEvent.getAction() == 0)
      {
        this.lbS = paramMotionEvent.getX();
        this.lbT = paramMotionEvent.getY();
      }
      if (paramMotionEvent.getAction() != 1)
        break label299;
      removeCallbacks(this.AbW);
      long l = 0L;
      if (this.cjF)
        l = 700L;
      if (getPresenter().dlU().CG() == com.tencent.mm.e.a.ciY)
        break label151;
      localObject = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(116395);
          if (a.this.getPresenter().dlT().ccT)
          {
            a.this.getPresenter().dlT().setFooterVisible(false);
            a.this.getPresenter().dlT().setActionBarVisible(false);
            AppMethodBeat.o(116395);
          }
          while (true)
          {
            return;
            a.this.getPresenter().dlT().setFooterVisible(true);
            a.this.getPresenter().dlT().setActionBarVisible(true);
            AppMethodBeat.o(116395);
          }
        }
      };
      this.AbW = ((Runnable)localObject);
      postDelayed((Runnable)localObject, l);
      this.cjF = false;
    }
    while (true)
    {
      if ((!getPresenter().G(paramMotionEvent)) && (dMM()))
        V(paramMotionEvent);
      AppMethodBeat.o(116405);
      return true;
      label151: getPresenter().dlT().rj(true);
      if (getPresenter().dlT().ccT)
      {
        getPresenter().dlT().setFooterVisible(false);
        getPresenter().dlT().setActionBarVisible(false);
      }
      label297: 
      while (true)
      {
        getPresenter().dlT().getBaseFooterView().dMS();
        break;
        localObject = getPresenter().dlT();
        if ((((com.tencent.mm.view.a)localObject).odY.getVisibility() == 0) || (((com.tencent.mm.view.a)localObject).getTextEditView().getVisibility() == 0));
        for (int i = 1; ; i = 0)
        {
          if (i != 0)
            break label297;
          getPresenter().dlT().setFooterVisible(true);
          getPresenter().dlT().setActionBarVisible(true);
          break;
        }
      }
      label299: if (paramMotionEvent.getAction() == 2)
      {
        if ((Math.abs(paramMotionEvent.getX() - this.lbS) >= 3.0F) || (Math.abs(paramMotionEvent.getY() - this.lbT) >= 3.0F))
        {
          this.cjF = true;
          removeCallbacks(this.AbW);
          if (getPresenter().dlT().ccT)
          {
            getPresenter().dlT().setFooterVisible(false);
            getPresenter().dlT().setActionBarVisible(false);
          }
        }
        this.lbS = paramMotionEvent.getX();
        this.lbT = paramMotionEvent.getY();
      }
    }
  }

  public void setOneFingerMoveEnable(boolean paramBoolean)
  {
    this.AbZ = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.b.a
 * JD-Core Version:    0.6.2
 */
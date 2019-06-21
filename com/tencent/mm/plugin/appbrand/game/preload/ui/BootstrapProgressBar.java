package com.tencent.mm.plugin.appbrand.game.preload.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.LinearInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class BootstrapProgressBar extends View
  implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener
{
  private Paint htJ;
  private Paint htK;
  private Paint htL;
  private float htM;
  private float htN;
  private float htO;
  private boolean htP;
  private boolean htQ;
  private boolean htR;
  private boolean htS;
  private boolean htT;
  private ValueAnimator htU;
  private Paint htV;
  private Canvas htW;
  private Bitmap htX;
  private Bitmap htY;
  private int htZ;

  public BootstrapProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(130310);
    this.htM = 0.0F;
    this.htN = 0.0F;
    this.htO = 100.0F;
    this.htP = true;
    this.htQ = true;
    this.htR = true;
    this.htS = true;
    this.htT = true;
    aBE();
    AppMethodBeat.o(130310);
  }

  public BootstrapProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(130311);
    this.htM = 0.0F;
    this.htN = 0.0F;
    this.htO = 100.0F;
    this.htP = true;
    this.htQ = true;
    this.htR = true;
    this.htS = true;
    this.htT = true;
    aBE();
    AppMethodBeat.o(130311);
  }

  private void aBE()
  {
    AppMethodBeat.i(130312);
    ValueAnimator.setFrameDelay(15L);
    this.htV = new Paint();
    this.htJ = new Paint();
    this.htJ.setStyle(Paint.Style.FILL);
    this.htJ.setAntiAlias(true);
    this.htK = new Paint();
    this.htK.setStyle(Paint.Style.FILL);
    this.htK.setAntiAlias(true);
    this.htL = new Paint();
    this.htL.setStyle(Paint.Style.FILL);
    this.htL.setARGB(38, 0, 0, 0);
    setProgress(this.htM);
    setMaxProgress(this.htO);
    AppMethodBeat.o(130312);
  }

  private void aBF()
  {
    AppMethodBeat.i(130316);
    if ((!this.htP) || (!this.htQ))
      AppMethodBeat.o(130316);
    while (true)
    {
      return;
      clearAnimation();
      this.htU = ValueAnimator.ofFloat(new float[] { 0.0F, 0.0F });
      this.htU.setDuration(300L);
      this.htU.setRepeatCount(-1);
      this.htU.setRepeatMode(1);
      this.htU.setInterpolator(new LinearInterpolator());
      this.htU.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          AppMethodBeat.i(130309);
          BootstrapProgressBar.this.invalidate();
          AppMethodBeat.o(130309);
        }
      });
      this.htU.start();
      AppMethodBeat.o(130316);
    }
  }

  public float getMaxProgress()
  {
    return this.htO;
  }

  public float getProgress()
  {
    return this.htM;
  }

  public void onAnimationCancel(Animator paramAnimator)
  {
  }

  public void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(130315);
    aBF();
    AppMethodBeat.o(130315);
  }

  public void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public void onAnimationStart(Animator paramAnimator)
  {
  }

  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(130314);
    this.htN = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    invalidate();
    AppMethodBeat.o(130314);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(130319);
    float f1 = getWidth();
    float f2 = getHeight();
    if ((f1 <= 0.0F) || (f2 <= 0.0F))
    {
      AppMethodBeat.o(130319);
      return;
    }
    if (this.htX == null)
      this.htX = Bitmap.createBitmap((int)f1, (int)f2, Bitmap.Config.ARGB_8888);
    if (this.htW == null)
      this.htW = new Canvas(this.htX);
    this.htW.drawColor(0, PorterDuff.Mode.CLEAR);
    float f3 = this.htM / this.htO;
    int i = (int)(f1 * f3);
    float f4 = 0.0F;
    float f5 = (float)(System.currentTimeMillis() % 370L) / 370.0F;
    float f6 = f4;
    if (this.htP)
    {
      f6 = f4;
      if (this.htQ)
        f6 = 2.0F * f2 * (1.0F - f5);
    }
    if (f3 < 1.0F)
    {
      this.htW.save();
      localObject1 = new Path();
      ((Path)localObject1).moveTo(0.0F, 0.0F);
      ((Path)localObject1).lineTo(i, 0.0F);
      ((Path)localObject1).lineTo(i - f2, f2);
      ((Path)localObject1).lineTo(0.0F, f2);
      this.htW.clipPath((Path)localObject1);
    }
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (this.htP)
    {
      if (this.htY == null)
      {
        localObject2 = this.htK;
        localObject3 = this.htJ;
        localObject4 = Bitmap.createBitmap((int)f2 * 2, (int)f2, Bitmap.Config.ARGB_8888);
        localObject5 = new Canvas((Bitmap)localObject4);
        localObject1 = new Path();
        ((Path)localObject1).moveTo(0.0F, 0.0F);
        ((Path)localObject1).lineTo(f2, 0.0F);
        ((Path)localObject1).lineTo(0.0F, f2);
        ((Canvas)localObject5).drawPath((Path)localObject1, (Paint)localObject2);
        ((Path)localObject1).reset();
        ((Path)localObject1).moveTo(0.0F + f2, 0.0F);
        ((Path)localObject1).lineTo(0.0F, f2);
        ((Path)localObject1).lineTo(0.0F + f2, f2);
        ((Path)localObject1).lineTo(0.0F + 2.0F * f2, 0.0F);
        ((Canvas)localObject5).drawPath((Path)localObject1, (Paint)localObject3);
        f4 = 0.0F + 2.0F * f2;
        ((Path)localObject1).reset();
        ((Path)localObject1).moveTo(f4, 0.0F);
        ((Path)localObject1).lineTo(f4 - f2, f2);
        ((Path)localObject1).lineTo(f4, f2);
        ((Canvas)localObject5).drawPath((Path)localObject1, (Paint)localObject2);
        this.htY = ((Bitmap)localObject4);
      }
      for (f6 = 0.0F - f6; f6 < i; f6 += this.htY.getWidth())
        this.htW.drawBitmap(this.htY, f6, 0.0F, this.htV);
    }
    this.htW.drawRect(0.0F, 0.0F, i, f2, this.htJ);
    if (f3 < 1.0F)
      this.htW.restore();
    Object localObject1 = new Path();
    ((Path)localObject1).moveTo(0.0F, 0.0F);
    ((Path)localObject1).lineTo(f1, 0.0F);
    ((Path)localObject1).lineTo(f1, f2);
    ((Path)localObject1).lineTo(0.0F, f2);
    this.htW.drawPath((Path)localObject1, this.htL);
    if (this.htR);
    for (f6 = f2 / 2.0F; ; f6 = 0.0F)
    {
      localObject2 = this.htX;
      boolean bool1 = this.htT;
      boolean bool2 = this.htS;
      localObject3 = Bitmap.createBitmap(((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight(), Bitmap.Config.ARGB_8888);
      localObject4 = new Canvas((Bitmap)localObject3);
      localObject1 = new Paint();
      Rect localRect1 = new Rect(0, 0, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight());
      localObject5 = new Rect(0, 0, ((Bitmap)localObject2).getWidth() / 2, ((Bitmap)localObject2).getHeight());
      Rect localRect2 = new Rect(((Bitmap)localObject2).getWidth() / 2, 0, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight());
      ((Paint)localObject1).setAntiAlias(true);
      ((Paint)localObject1).setColor(-1);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      ((Canvas)localObject4).drawARGB(0, 0, 0, 0);
      ((Canvas)localObject4).drawRoundRect(new RectF(localRect1), f6, f6, (Paint)localObject1);
      if (!bool2)
        ((Canvas)localObject4).drawRect((Rect)localObject5, (Paint)localObject1);
      if (!bool1)
        ((Canvas)localObject4).drawRect(localRect2, (Paint)localObject1);
      ((Paint)localObject1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      ((Canvas)localObject4).drawBitmap((Bitmap)localObject2, localRect1, localRect1, (Paint)localObject1);
      paramCanvas.drawBitmap((Bitmap)localObject3, 0.0F, 0.0F, this.htV);
      AppMethodBeat.o(130319);
      break;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(130317);
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getSize(paramInt2));
    AppMethodBeat.o(130317);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(130318);
    if (paramInt2 != paramInt4)
      this.htY = null;
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(130318);
  }

  public void setAnimated(boolean paramBoolean)
  {
    AppMethodBeat.i(130322);
    this.htQ = paramBoolean;
    invalidate();
    aBF();
    AppMethodBeat.o(130322);
  }

  public void setMaxProgress(float paramFloat)
  {
    AppMethodBeat.i(130323);
    if (getProgress() <= paramFloat)
    {
      this.htO = paramFloat;
      invalidate();
      AppMethodBeat.o(130323);
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException(String.format("MaxProgress cant be smaller than the current progress %d<%d", new Object[] { Float.valueOf(getProgress()), Float.valueOf(paramFloat) }));
    AppMethodBeat.o(130323);
    throw localIllegalArgumentException;
  }

  @SuppressLint({"DefaultLocale"})
  public void setProgress(float paramFloat)
  {
    AppMethodBeat.i(130320);
    float f;
    if (paramFloat < 0.0F)
    {
      f = 0.0F;
      this.htM = f;
      if (!this.htQ)
        break label142;
      clearAnimation();
      this.htU = ValueAnimator.ofFloat(new float[] { this.htN, this.htM });
      this.htU.setDuration(300L);
      this.htU.setRepeatCount(0);
      this.htU.setRepeatMode(1);
      this.htU.setInterpolator(new LinearInterpolator());
      this.htU.addUpdateListener(this);
      this.htU.addListener(this);
      this.htU.start();
      AppMethodBeat.o(130320);
    }
    while (true)
    {
      return;
      f = paramFloat;
      if (paramFloat <= this.htO)
        break;
      f = 100.0F;
      break;
      label142: this.htN = f;
      invalidate();
      AppMethodBeat.o(130320);
    }
  }

  public void setProgressColor(int paramInt)
  {
    AppMethodBeat.i(130313);
    this.htZ = paramInt;
    this.htJ.setColor(this.htZ);
    Paint localPaint = this.htK;
    paramInt = this.htZ;
    localPaint.setColor(Color.rgb((int)(Color.red(paramInt) * 0.7F + Color.red(-16777216) * 0.3F) / 1, (int)(Color.green(paramInt) * 0.7F + Color.green(-16777216) * 0.3F) / 1, (int)(Color.blue(paramInt) * 0.7F + Color.blue(-16777216) * 0.3F) / 1));
    this.htY = null;
    this.htX = null;
    this.htW = null;
    invalidate();
    AppMethodBeat.o(130313);
  }

  public void setStriped(boolean paramBoolean)
  {
    AppMethodBeat.i(130321);
    this.htP = paramBoolean;
    invalidate();
    aBF();
    AppMethodBeat.o(130321);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.preload.ui.BootstrapProgressBar
 * JD-Core Version:    0.6.2
 */
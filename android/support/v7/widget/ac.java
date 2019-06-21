package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.s;
import android.view.MotionEvent;

final class ac extends RecyclerView.h
  implements RecyclerView.l
{
  private static final int[] EMPTY_STATE_SET = new int[0];
  private static final int[] PRESSED_STATE_SET = { 16842919 };
  private int SG = 0;
  int aiA = 0;
  RecyclerView aiB;
  boolean aiC = false;
  boolean aiD = false;
  private final int[] aiE = new int[2];
  private final int[] aiF = new int[2];
  final ValueAnimator aiG = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
  int aiH = 0;
  private final RecyclerView.m aiI = new ac.2(this);
  final int aik;
  private final StateListDrawable ail;
  private final Drawable aim;
  private final int ain;
  private final int aio;
  private final StateListDrawable aip;
  private final Drawable aiq;
  private final int air;
  private final int ais;
  int ait;
  int aiu;
  float aiv;
  int aiw;
  int aix;
  float aiy;
  int aiz = 0;
  private final int hz;
  private final Runnable mHideRunnable = new ac.1(this);
  int mState = 0;

  ac(RecyclerView paramRecyclerView, StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2, int paramInt1, int paramInt2, int paramInt3)
  {
    this.ail = paramStateListDrawable1;
    this.aim = paramDrawable1;
    this.aip = paramStateListDrawable2;
    this.aiq = paramDrawable2;
    this.ain = Math.max(paramInt1, paramStateListDrawable1.getIntrinsicWidth());
    this.aio = Math.max(paramInt1, paramDrawable1.getIntrinsicWidth());
    this.air = Math.max(paramInt1, paramStateListDrawable2.getIntrinsicWidth());
    this.ais = Math.max(paramInt1, paramDrawable2.getIntrinsicWidth());
    this.aik = paramInt2;
    this.hz = paramInt3;
    this.ail.setAlpha(255);
    this.aim.setAlpha(255);
    this.aiG.addListener(new a((byte)0));
    this.aiG.addUpdateListener(new ac.b(this, (byte)0));
    if (this.aiB != paramRecyclerView)
    {
      if (this.aiB != null)
      {
        this.aiB.c(this);
        this.aiB.b(this);
        this.aiB.b(this.aiI);
        ic();
      }
      this.aiB = paramRecyclerView;
      if (this.aiB != null)
      {
        this.aiB.a(this);
        this.aiB.a(this);
        this.aiB.a(this.aiI);
      }
    }
  }

  private static int a(float paramFloat1, float paramFloat2, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = paramArrayOfInt[1] - paramArrayOfInt[0];
    if (j == 0)
      paramInt1 = i;
    while (true)
    {
      return paramInt1;
      paramFloat1 = (paramFloat2 - paramFloat1) / j;
      j = paramInt1 - paramInt3;
      paramInt3 = (int)(paramFloat1 * j);
      paramInt2 += paramInt3;
      paramInt1 = i;
      if (paramInt2 < j)
      {
        paramInt1 = i;
        if (paramInt2 >= 0)
          paramInt1 = paramInt3;
      }
    }
  }

  private void bL(int paramInt)
  {
    ic();
    this.aiB.postDelayed(this.mHideRunnable, paramInt);
  }

  private boolean ib()
  {
    boolean bool = true;
    if (s.T(this.aiB) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private void ic()
  {
    this.aiB.removeCallbacks(this.mHideRunnable);
  }

  private void show()
  {
    switch (this.aiH)
    {
    case 1:
    case 2:
    default:
    case 3:
    case 0:
    }
    while (true)
    {
      return;
      this.aiG.cancel();
      this.aiH = 1;
      this.aiG.setFloatValues(new float[] { ((Float)this.aiG.getAnimatedValue()).floatValue(), 1.0F });
      this.aiG.setDuration(500L);
      this.aiG.setStartDelay(0L);
      this.aiG.start();
    }
  }

  private boolean v(float paramFloat1, float paramFloat2)
  {
    if (ib())
    {
      if (paramFloat1 > this.ain / 2)
        break label72;
      if ((paramFloat2 < this.aiu - this.ait / 2) || (paramFloat2 > this.aiu + this.ait / 2))
        break label72;
    }
    label72: for (boolean bool = true; ; bool = false)
    {
      return bool;
      if (paramFloat1 >= this.aiz - this.ain)
        break;
    }
  }

  private boolean w(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat2 >= this.aiA - this.air) && (paramFloat1 >= this.aix - this.aiw / 2) && (paramFloat1 <= this.aix + this.aiw / 2));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView)
  {
    if ((this.aiz != this.aiB.getWidth()) || (this.aiA != this.aiB.getHeight()))
    {
      this.aiz = this.aiB.getWidth();
      this.aiA = this.aiB.getHeight();
      setState(0);
    }
    label299: label342: 
    while (true)
    {
      return;
      int i;
      int j;
      if (this.aiH != 0)
        if (this.aiC)
        {
          i = this.aiz - this.ain;
          j = this.aiu - this.ait / 2;
          this.ail.setBounds(0, 0, this.ain, this.ait);
          this.aim.setBounds(0, 0, this.aio, this.aiA);
          if (!ib())
            break label299;
          this.aim.draw(paramCanvas);
          paramCanvas.translate(this.ain, j);
          paramCanvas.scale(-1.0F, 1.0F);
          this.ail.draw(paramCanvas);
          paramCanvas.scale(1.0F, 1.0F);
          paramCanvas.translate(-this.ain, -j);
        }
      while (true)
      {
        if (!this.aiD)
          break label342;
        i = this.aiA - this.air;
        j = this.aix - this.aiw / 2;
        this.aip.setBounds(0, 0, this.aiw, this.air);
        this.aiq.setBounds(0, 0, this.aiz, this.ais);
        paramCanvas.translate(0.0F, i);
        this.aiq.draw(paramCanvas);
        paramCanvas.translate(j, 0.0F);
        this.aip.draw(paramCanvas);
        paramCanvas.translate(-j, -i);
        break;
        break;
        paramCanvas.translate(i, 0.0F);
        this.aim.draw(paramCanvas);
        paramCanvas.translate(0.0F, j);
        this.ail.draw(paramCanvas);
        paramCanvas.translate(-i, -j);
      }
    }
  }

  public final void ab(boolean paramBoolean)
  {
  }

  public final boolean h(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    boolean bool2;
    if (this.mState == 1)
    {
      bool2 = v(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool3 = w(paramMotionEvent.getX(), paramMotionEvent.getY());
      if ((paramMotionEvent.getAction() == 0) && ((bool2) || (bool3)))
        if (bool3)
        {
          this.SG = 1;
          this.aiy = ((int)paramMotionEvent.getX());
          setState(2);
        }
    }
    while (true)
    {
      return bool1;
      if (!bool2)
        break;
      this.SG = 2;
      this.aiv = ((int)paramMotionEvent.getY());
      break;
      bool1 = false;
      continue;
      if (this.mState != 2)
        bool1 = false;
    }
  }

  public final void i(MotionEvent paramMotionEvent)
  {
    if (this.mState == 0);
    while (true)
    {
      return;
      if (paramMotionEvent.getAction() == 0)
      {
        boolean bool1 = v(paramMotionEvent.getX(), paramMotionEvent.getY());
        boolean bool2 = w(paramMotionEvent.getX(), paramMotionEvent.getY());
        if ((bool1) || (bool2))
        {
          if (bool2)
          {
            this.SG = 1;
            this.aiy = ((int)paramMotionEvent.getX());
          }
          while (true)
          {
            setState(2);
            break;
            if (bool1)
            {
              this.SG = 2;
              this.aiv = ((int)paramMotionEvent.getY());
            }
          }
        }
      }
      else if ((paramMotionEvent.getAction() == 1) && (this.mState == 2))
      {
        this.aiv = 0.0F;
        this.aiy = 0.0F;
        setState(1);
        this.SG = 0;
      }
      else if ((paramMotionEvent.getAction() == 2) && (this.mState == 2))
      {
        show();
        float f;
        int i;
        if (this.SG == 1)
        {
          f = paramMotionEvent.getX();
          this.aiF[0] = this.hz;
          this.aiF[1] = (this.aiz - this.hz);
          int[] arrayOfInt = this.aiF;
          f = Math.max(arrayOfInt[0], Math.min(arrayOfInt[1], f));
          if (Math.abs(this.aix - f) >= 2.0F)
          {
            i = a(this.aiy, f, arrayOfInt, this.aiB.computeHorizontalScrollRange(), this.aiB.computeHorizontalScrollOffset(), this.aiz);
            if (i != 0)
              this.aiB.scrollBy(i, 0);
            this.aiy = f;
          }
        }
        if (this.SG == 2)
        {
          f = paramMotionEvent.getY();
          this.aiE[0] = this.hz;
          this.aiE[1] = (this.aiA - this.hz);
          paramMotionEvent = this.aiE;
          f = Math.max(paramMotionEvent[0], Math.min(paramMotionEvent[1], f));
          if (Math.abs(this.aiu - f) >= 2.0F)
          {
            i = a(this.aiv, f, paramMotionEvent, this.aiB.computeVerticalScrollRange(), this.aiB.computeVerticalScrollOffset(), this.aiA);
            if (i != 0)
              this.aiB.scrollBy(0, i);
            this.aiv = f;
          }
        }
      }
    }
  }

  final void setState(int paramInt)
  {
    if ((paramInt == 2) && (this.mState != 2))
    {
      this.ail.setState(PRESSED_STATE_SET);
      ic();
    }
    if (paramInt == 0)
    {
      this.aiB.invalidate();
      if ((this.mState != 2) || (paramInt == 2))
        break label83;
      this.ail.setState(EMPTY_STATE_SET);
      bL(1200);
    }
    while (true)
    {
      this.mState = paramInt;
      return;
      show();
      break;
      label83: if (paramInt == 1)
        bL(1500);
    }
  }

  final class a extends AnimatorListenerAdapter
  {
    private boolean xH = false;

    private a()
    {
    }

    public final void onAnimationCancel(Animator paramAnimator)
    {
      this.xH = true;
    }

    public final void onAnimationEnd(Animator paramAnimator)
    {
      if (this.xH)
        this.xH = false;
      while (true)
      {
        return;
        if (((Float)ac.a(ac.this).getAnimatedValue()).floatValue() == 0.0F)
        {
          ac.a(ac.this, 0);
          ac.b(ac.this);
        }
        else
        {
          ac.a(ac.this, 2);
          ac.c(ac.this);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ac
 * JD-Core Version:    0.6.2
 */
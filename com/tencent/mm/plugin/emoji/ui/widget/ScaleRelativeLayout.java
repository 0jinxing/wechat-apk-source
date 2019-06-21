package com.tencent.mm.plugin.emoji.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ScaleRelativeLayout extends RelativeLayout
{
  public float aJf = 3.0F;
  private float aJg = 0.5F;
  private float lgA = 1.0F;
  private float lgB = 1.0F;
  private float lgC = 0.0F;
  private float lgD = 0.0F;
  public float lgE = 6.0F;
  private float lgF = 0.3F;
  private boolean lgG = false;
  private ValueAnimator lgH;

  public ScaleRelativeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ScaleRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(53862);
    int i = paramCanvas.getWidth();
    int j = paramCanvas.getHeight();
    paramCanvas.save();
    paramCanvas.scale(this.lgA, this.lgA, i / 2, j / 2);
    super.dispatchDraw(paramCanvas);
    paramCanvas.restore();
    AppMethodBeat.o(53862);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(53860);
    if (paramMotionEvent.getPointerCount() > 1)
      AppMethodBeat.o(53860);
    while (true)
    {
      return bool;
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(53860);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(53861);
    if ((!this.lgG) && (paramMotionEvent.getPointerCount() == 2))
    {
      this.lgG = true;
      this.lgC = ((float)Math.hypot(paramMotionEvent.getX(0) - paramMotionEvent.getX(1), paramMotionEvent.getY(0) - paramMotionEvent.getY(1)));
      this.lgB = this.lgA;
    }
    switch (paramMotionEvent.getActionMasked())
    {
    case 3:
    case 4:
    case 5:
    default:
    case 2:
    case 6:
      while (true)
      {
        if (this.lgC <= 0.0F)
          this.lgC = 0.1F;
        postInvalidate();
        AppMethodBeat.o(53861);
        return true;
        if (paramMotionEvent.getPointerCount() == 2)
        {
          f1 = (float)Math.hypot(paramMotionEvent.getX(0) - paramMotionEvent.getX(1), paramMotionEvent.getY(0) - paramMotionEvent.getY(1));
          f2 = this.lgB * f1 / this.lgC;
          if (f2 > this.lgE)
          {
            f2 = this.lgE;
            this.lgD = (this.lgC * f2);
          }
          while (true)
          {
            this.lgA = f2;
            if (this.lgH == null)
              break;
            this.lgH.cancel();
            break;
            if (f2 < this.lgF)
            {
              f2 = this.lgF;
              this.lgD = (this.lgC * f2);
            }
            else
            {
              this.lgD = f1;
            }
          }
          if (paramMotionEvent.getPointerCount() == 2)
          {
            this.lgC = this.lgD;
            this.lgB = this.lgA;
            this.lgG = false;
          }
        }
      }
    case 1:
    }
    float f1 = this.lgA;
    float f2 = this.lgA;
    if (this.lgA < this.aJg)
      f2 = this.aJg;
    while (true)
    {
      if (this.lgH != null)
        this.lgH.cancel();
      this.lgH = ValueAnimator.ofFloat(new float[] { f1, f2 });
      this.lgH.addUpdateListener(new ScaleRelativeLayout.1(this));
      this.lgH.start();
      break;
      if (this.lgA > this.aJf)
        f2 = this.aJf;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout
 * JD-Core Version:    0.6.2
 */
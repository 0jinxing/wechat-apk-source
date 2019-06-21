package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

final class TabLayout$d extends LinearLayout
{
  private int sA;
  private final Paint sB;
  int sC = -1;
  float sD;
  private int sE = -1;
  private int sF = -1;
  private int sG = -1;
  private ValueAnimator sH;

  TabLayout$d(TabLayout paramTabLayout, Context paramContext)
  {
    super(paramContext);
    setWillNotDraw(false);
    this.sB = new Paint();
  }

  private void ct()
  {
    View localView = getChildAt(this.sC);
    int i;
    int j;
    if ((localView != null) && (localView.getWidth() > 0))
    {
      i = localView.getLeft();
      j = localView.getRight();
      if ((this.sD <= 0.0F) || (this.sC >= getChildCount() - 1))
        break label145;
      localView = getChildAt(this.sC + 1);
      float f1 = this.sD;
      float f2 = localView.getLeft();
      float f3 = this.sD;
      i = (int)(i * (1.0F - f3) + f1 * f2);
      f2 = this.sD;
      f3 = localView.getRight();
      f1 = this.sD;
      j = (int)(j * (1.0F - f1) + f3 * f2);
    }
    label145: 
    while (true)
    {
      n(i, j);
      return;
      i = -1;
      j = -1;
    }
  }

  final void ah(int paramInt)
  {
    if (this.sB.getColor() != paramInt)
    {
      this.sB.setColor(paramInt);
      s.R(this);
    }
  }

  final void ai(int paramInt)
  {
    if (this.sA != paramInt)
    {
      this.sA = paramInt;
      s.R(this);
    }
  }

  final void c(int paramInt, float paramFloat)
  {
    if ((this.sH != null) && (this.sH.isRunning()))
      this.sH.cancel();
    this.sC = paramInt;
    this.sD = paramFloat;
    ct();
  }

  public final void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((this.sF >= 0) && (this.sG > this.sF))
      paramCanvas.drawRect(this.sF, getHeight() - this.sA, this.sG, getHeight(), this.sB);
  }

  final void n(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != this.sF) || (paramInt2 != this.sG))
    {
      this.sF = paramInt1;
      this.sG = paramInt2;
      s.R(this);
    }
  }

  final void o(int paramInt1, int paramInt2)
  {
    if ((this.sH != null) && (this.sH.isRunning()))
      this.sH.cancel();
    int i;
    Object localObject;
    if (s.T(this) == 1)
    {
      i = 1;
      localObject = getChildAt(paramInt1);
      if (localObject != null)
        break label56;
      ct();
    }
    label257: 
    while (true)
    {
      return;
      i = 0;
      break;
      label56: int j = ((View)localObject).getLeft();
      int k = ((View)localObject).getRight();
      int m;
      if (Math.abs(paramInt1 - this.sC) <= 1)
      {
        i = this.sF;
        m = this.sG;
      }
      while (true)
      {
        if ((i == j) && (m == k))
          break label257;
        localObject = new ValueAnimator();
        this.sH = ((ValueAnimator)localObject);
        ((ValueAnimator)localObject).setInterpolator(a.mg);
        ((ValueAnimator)localObject).setDuration(paramInt2);
        ((ValueAnimator)localObject).setFloatValues(new float[] { 0.0F, 1.0F });
        ((ValueAnimator)localObject).addUpdateListener(new TabLayout.d.1(this, i, j, m, k));
        ((ValueAnimator)localObject).addListener(new TabLayout.d.2(this, paramInt1));
        ((ValueAnimator)localObject).start();
        break;
        m = this.sy.ad(24);
        if (paramInt1 < this.sC)
        {
          if (i == 0)
          {
            i = k + m;
            m = i;
          }
        }
        else if (i != 0)
        {
          i = k + m;
          m = i;
        }
        else
        {
          i = j - m;
          m = i;
        }
      }
    }
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.sH != null) && (this.sH.isRunning()))
    {
      this.sH.cancel();
      long l = this.sH.getDuration();
      paramInt1 = this.sC;
      float f = this.sH.getAnimatedFraction();
      o(paramInt1, Math.round((float)l * (1.0F - f)));
    }
    while (true)
    {
      return;
      ct();
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824)
      return;
    int i;
    int j;
    int k;
    label49: Object localObject;
    if ((this.sy.mMode == 1) && (this.sy.sl == 1))
    {
      i = getChildCount();
      j = 0;
      k = 0;
      if (j < i)
      {
        localObject = getChildAt(j);
        if (((View)localObject).getVisibility() != 0)
          break label233;
      }
    }
    label131: label216: label230: label233: for (int m = Math.max(k, ((View)localObject).getMeasuredWidth()); ; m = k)
    {
      j++;
      k = m;
      break label49;
      if (k <= 0)
        break;
      m = this.sy.ad(16);
      int n;
      if (k * i <= getMeasuredWidth() - m * 2)
      {
        m = 0;
        j = 0;
        n = m;
        if (j >= i)
          break label216;
        localObject = (LinearLayout.LayoutParams)getChildAt(j).getLayoutParams();
        if ((((LinearLayout.LayoutParams)localObject).width == k) && (((LinearLayout.LayoutParams)localObject).weight == 0.0F))
          break label230;
        ((LinearLayout.LayoutParams)localObject).width = k;
        ((LinearLayout.LayoutParams)localObject).weight = 0.0F;
        m = 1;
      }
      while (true)
      {
        j++;
        break label131;
        this.sy.sl = 0;
        this.sy.r(false);
        n = 1;
        if (n == 0)
          break;
        super.onMeasure(paramInt1, paramInt2);
        break;
        break;
      }
    }
  }

  public final void onRtlPropertiesChanged(int paramInt)
  {
    super.onRtlPropertiesChanged(paramInt);
    if ((Build.VERSION.SDK_INT < 23) && (this.sE != paramInt))
    {
      requestLayout();
      this.sE = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TabLayout.d
 * JD-Core Version:    0.6.2
 */
package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v4.view.x;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

abstract class a extends ViewGroup
{
  private boolean acA;
  private boolean acB;
  protected final a acu = new a();
  protected final Context acv;
  protected ActionMenuView acw;
  protected ActionMenuPresenter acx;
  protected int acy;
  protected w acz;

  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = new TypedValue();
    if ((paramContext.getTheme().resolveAttribute(2130772134, paramAttributeSet, true)) && (paramAttributeSet.resourceId != 0));
    for (this.acv = new ContextThemeWrapper(paramContext, paramAttributeSet.resourceId); ; this.acv = paramContext)
      return;
  }

  protected static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 = (paramInt3 - j) / 2 + paramInt2;
    if (paramBoolean)
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    while (true)
    {
      paramInt1 = i;
      if (paramBoolean)
        paramInt1 = -i;
      return paramInt1;
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    }
  }

  protected static int c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean)
      paramInt1 -= paramInt2;
    while (true)
    {
      return paramInt1;
      paramInt1 += paramInt2;
    }
  }

  protected static int j(View paramView, int paramInt1, int paramInt2)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth() + 0);
  }

  public w c(int paramInt, long paramLong)
  {
    if (this.acz != null)
      this.acz.cancel();
    w localw;
    if (paramInt == 0)
    {
      if (getVisibility() != 0)
        setAlpha(0.0F);
      localw = s.ab(this).t(1.0F);
      localw.l(paramLong);
      localw.a(this.acu.a(localw, paramInt));
    }
    while (true)
    {
      return localw;
      localw = s.ab(this).t(0.0F);
      localw.l(paramLong);
      localw.a(this.acu.a(localw, paramInt));
    }
  }

  public int getAnimatedVisibility()
  {
    if (this.acz != null);
    for (int i = this.acu.BD; ; i = getVisibility())
      return i;
  }

  public int getContentHeight()
  {
    return this.acy;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = getContext().obtainStyledAttributes(null, android.support.v7.a.a.a.ActionBar, 2130772135, 0);
    setContentHeight(paramConfiguration.getLayoutDimension(0, 0));
    paramConfiguration.recycle();
    if (this.acx != null)
      this.acx.gY();
  }

  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9)
      this.acB = false;
    if (!this.acB)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool))
        this.acB = true;
    }
    if ((i == 10) || (i == 3))
      this.acB = false;
    return true;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.acA = false;
    if (!this.acA)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool))
        this.acA = true;
    }
    if ((i == 1) || (i == 3))
      this.acA = false;
    return true;
  }

  public void setContentHeight(int paramInt)
  {
    this.acy = paramInt;
    requestLayout();
  }

  public void setVisibility(int paramInt)
  {
    if (paramInt != getVisibility())
    {
      if (this.acz != null)
        this.acz.cancel();
      super.setVisibility(paramInt);
    }
  }

  public boolean showOverflowMenu()
  {
    if (this.acx != null);
    for (boolean bool = this.acx.showOverflowMenu(); ; bool = false)
      return bool;
  }

  protected final class a
    implements x
  {
    int BD;
    private boolean xH = false;

    protected a()
    {
    }

    public final a a(w paramw, int paramInt)
    {
      a.this.acz = paramw;
      this.BD = paramInt;
      return this;
    }

    public final void aA(View paramView)
    {
      if (this.xH);
      while (true)
      {
        return;
        a.this.acz = null;
        a.a(a.this, this.BD);
      }
    }

    public final void aB(View paramView)
    {
      this.xH = true;
    }

    public final void az(View paramView)
    {
      a.a(a.this);
      this.xH = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a
 * JD-Core Version:    0.6.2
 */
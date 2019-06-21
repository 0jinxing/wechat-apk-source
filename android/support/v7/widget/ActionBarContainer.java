package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer extends FrameLayout
{
  Drawable abb;
  private boolean acE;
  private View acF;
  private View acG;
  private View acH;
  Drawable acI;
  Drawable acJ;
  boolean acK;
  boolean acL;
  private int mHeight;

  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject;
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = new d(this);
      s.a(this, (Drawable)localObject);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.ActionBar);
      this.abb = paramContext.getDrawable(10);
      this.acI = paramContext.getDrawable(11);
      this.mHeight = paramContext.getDimensionPixelSize(0, -1);
      if (getId() == 2131820667)
      {
        this.acK = true;
        this.acJ = paramContext.getDrawable(12);
      }
      paramContext.recycle();
      if (!this.acK)
        break label137;
      if (this.acJ != null)
        break label131;
      bool = true;
    }
    while (true)
    {
      setWillNotDraw(bool);
      return;
      localObject = new c(this);
      break;
      label131: bool = false;
      continue;
      label137: if ((this.abb == null) && (this.acI == null))
        bool = true;
      else
        bool = false;
    }
  }

  private static boolean aU(View paramView)
  {
    if ((paramView == null) || (paramView.getVisibility() == 8) || (paramView.getMeasuredHeight() == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static int aV(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    int j = localLayoutParams.topMargin;
    return localLayoutParams.bottomMargin + (i + j);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.abb != null) && (this.abb.isStateful()))
      this.abb.setState(getDrawableState());
    if ((this.acI != null) && (this.acI.isStateful()))
      this.acI.setState(getDrawableState());
    if ((this.acJ != null) && (this.acJ.isStateful()))
      this.acJ.setState(getDrawableState());
  }

  public View getTabContainer()
  {
    return this.acF;
  }

  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if (this.abb != null)
      this.abb.jumpToCurrentState();
    if (this.acI != null)
      this.acI.jumpToCurrentState();
    if (this.acJ != null)
      this.acJ.jumpToCurrentState();
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.acG = findViewById(2131820941);
    this.acH = findViewById(2131820942);
  }

  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    super.onHoverEvent(paramMotionEvent);
    return true;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.acE) || (super.onInterceptTouchEvent(paramMotionEvent)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = this.acF;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      paramBoolean = true;
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        paramInt2 = getMeasuredHeight();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        localView.layout(paramInt1, paramInt2 - localView.getMeasuredHeight() - localLayoutParams.bottomMargin, paramInt3, paramInt2 - localLayoutParams.bottomMargin);
      }
      if (!this.acK)
        break label143;
      if (this.acJ == null)
        break label323;
      this.acJ.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
      paramInt1 = i;
    }
    while (true)
    {
      if (paramInt1 != 0)
        invalidate();
      return;
      paramBoolean = false;
      break;
      label143: if (this.abb != null)
        if (this.acG.getVisibility() == 0)
          this.abb.setBounds(this.acG.getLeft(), this.acG.getTop(), this.acG.getRight(), this.acG.getBottom());
      label195: for (paramInt1 = 1; ; paramInt1 = 0)
      {
        this.acL = paramBoolean;
        if ((paramBoolean) && (this.acI != null))
        {
          this.acI.setBounds(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          paramInt1 = i;
          break;
          if ((this.acH != null) && (this.acH.getVisibility() == 0))
          {
            this.abb.setBounds(this.acH.getLeft(), this.acH.getTop(), this.acH.getRight(), this.acH.getBottom());
            break label195;
          }
          this.abb.setBounds(0, 0, 0, 0);
          break label195;
        }
        break;
      }
      label323: paramInt1 = 0;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (this.acG == null)
    {
      i = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == -2147483648)
      {
        i = paramInt2;
        if (this.mHeight >= 0)
          i = View.MeasureSpec.makeMeasureSpec(Math.min(this.mHeight, View.MeasureSpec.getSize(paramInt2)), -2147483648);
      }
    }
    super.onMeasure(paramInt1, i);
    if (this.acG == null);
    do
    {
      return;
      paramInt2 = View.MeasureSpec.getMode(i);
    }
    while ((this.acF == null) || (this.acF.getVisibility() == 8) || (paramInt2 == 1073741824));
    if (!aU(this.acG))
    {
      paramInt1 = aV(this.acG);
      label108: if (paramInt2 != -2147483648)
        break label169;
    }
    label169: for (paramInt2 = View.MeasureSpec.getSize(i); ; paramInt2 = 2147483647)
    {
      setMeasuredDimension(getMeasuredWidth(), Math.min(paramInt1 + aV(this.acF), paramInt2));
      break;
      if (!aU(this.acH))
      {
        paramInt1 = aV(this.acH);
        break label108;
      }
      paramInt1 = 0;
      break label108;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }

  public void setPrimaryBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.abb != null)
    {
      this.abb.setCallback(null);
      unscheduleDrawable(this.abb);
    }
    this.abb = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (this.acG != null)
        this.abb.setBounds(this.acG.getLeft(), this.acG.getTop(), this.acG.getRight(), this.acG.getBottom());
    }
    if (this.acK)
      if (this.acJ != null);
    while (true)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.abb != null) || (this.acI != null))
        bool = false;
    }
  }

  public void setSplitBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.acJ != null)
    {
      this.acJ.setCallback(null);
      unscheduleDrawable(this.acJ);
    }
    this.acJ = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if ((this.acK) && (this.acJ != null))
        this.acJ.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
    if (this.acK)
      if (this.acJ != null);
    while (true)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.abb != null) || (this.acI != null))
        bool = false;
    }
  }

  public void setStackedBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.acI != null)
    {
      this.acI.setCallback(null);
      unscheduleDrawable(this.acI);
    }
    this.acI = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if ((this.acL) && (this.acI != null))
        this.acI.setBounds(this.acF.getLeft(), this.acF.getTop(), this.acF.getRight(), this.acF.getBottom());
    }
    if (this.acK)
      if (this.acJ != null);
    while (true)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.abb != null) || (this.acI != null))
        bool = false;
    }
  }

  public void setTabContainer(au paramau)
  {
    if (this.acF != null)
      removeView(this.acF);
    this.acF = paramau;
    if (paramau != null)
    {
      addView(paramau);
      ViewGroup.LayoutParams localLayoutParams = paramau.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      paramau.setAllowCollapse(false);
    }
  }

  public void setTransitioning(boolean paramBoolean)
  {
    this.acE = paramBoolean;
    if (paramBoolean);
    for (int i = 393216; ; i = 262144)
    {
      setDescendantFocusability(i);
      return;
    }
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      if (this.abb != null)
        this.abb.setVisible(bool, false);
      if (this.acI != null)
        this.acI.setVisible(bool, false);
      if (this.acJ != null)
        this.acJ.setVisible(bool, false);
      return;
    }
  }

  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }

  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt)
  {
    if (paramInt != 0);
    for (paramView = super.startActionModeForChild(paramView, paramCallback, paramInt); ; paramView = null)
      return paramView;
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if (((paramDrawable == this.abb) && (!this.acK)) || ((paramDrawable == this.acI) && (this.acL)) || ((paramDrawable == this.acJ) && (this.acK)) || (super.verifyDrawable(paramDrawable)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActionBarContainer
 * JD-Core Version:    0.6.2
 */
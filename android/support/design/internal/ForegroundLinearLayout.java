package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.a.a;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;

public class ForegroundLinearLayout extends LinearLayoutCompat
{
  private Drawable lt;
  private final Rect lu = new Rect();
  private final Rect lv = new Rect();
  private int lw = 119;
  protected boolean lx = true;
  boolean ly = false;

  public ForegroundLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ForegroundLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.ForegroundLinearLayout, paramInt, 0);
    this.lw = paramAttributeSet.getInt(1, this.lw);
    paramContext = paramAttributeSet.getDrawable(0);
    if (paramContext != null)
      setForeground(paramContext);
    this.lx = paramAttributeSet.getBoolean(2, true);
    paramAttributeSet.recycle();
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Drawable localDrawable;
    Rect localRect1;
    Rect localRect2;
    int i;
    int j;
    if (this.lt != null)
    {
      localDrawable = this.lt;
      if (this.ly)
      {
        this.ly = false;
        localRect1 = this.lu;
        localRect2 = this.lv;
        i = getRight() - getLeft();
        j = getBottom() - getTop();
        if (!this.lx)
          break label109;
        localRect1.set(0, 0, i, j);
      }
    }
    while (true)
    {
      Gravity.apply(this.lw, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight(), localRect1, localRect2);
      localDrawable.setBounds(localRect2);
      localDrawable.draw(paramCanvas);
      return;
      label109: localRect1.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), j - getPaddingBottom());
    }
  }

  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    super.drawableHotspotChanged(paramFloat1, paramFloat2);
    if (this.lt != null)
      this.lt.setHotspot(paramFloat1, paramFloat2);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.lt != null) && (this.lt.isStateful()))
      this.lt.setState(getDrawableState());
  }

  public Drawable getForeground()
  {
    return this.lt;
  }

  public int getForegroundGravity()
  {
    return this.lw;
  }

  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if (this.lt != null)
      this.lt.jumpToCurrentState();
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.ly |= paramBoolean;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.ly = true;
  }

  public void setForeground(Drawable paramDrawable)
  {
    if (this.lt != paramDrawable)
    {
      if (this.lt != null)
      {
        this.lt.setCallback(null);
        unscheduleDrawable(this.lt);
      }
      this.lt = paramDrawable;
      if (paramDrawable == null)
        break label96;
      setWillNotDraw(false);
      paramDrawable.setCallback(this);
      if (paramDrawable.isStateful())
        paramDrawable.setState(getDrawableState());
      if (this.lw == 119)
        paramDrawable.getPadding(new Rect());
    }
    while (true)
    {
      requestLayout();
      invalidate();
      return;
      label96: setWillNotDraw(true);
    }
  }

  public void setForegroundGravity(int paramInt)
  {
    if (this.lw != paramInt)
    {
      if ((0x800007 & paramInt) != 0)
        break label77;
      paramInt = 0x800003 | paramInt;
    }
    label77: 
    while (true)
    {
      int i = paramInt;
      if ((paramInt & 0x70) == 0)
        i = paramInt | 0x30;
      this.lw = i;
      if ((this.lw == 119) && (this.lt != null))
      {
        Rect localRect = new Rect();
        this.lt.getPadding(localRect);
      }
      requestLayout();
      return;
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.lt));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.internal.ForegroundLinearLayout
 * JD-Core Version:    0.6.2
 */
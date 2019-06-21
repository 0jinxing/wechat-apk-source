package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.a.a;
import android.support.v4.view.aa;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout extends FrameLayout
{
  Drawable lX;
  Rect lY;
  private Rect mTempRect = new Rect();

  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.ScrimInsetsFrameLayout, paramInt, 2131493828);
    this.lX = paramContext.getDrawable(0);
    paramContext.recycle();
    setWillNotDraw(true);
    s.a(this, new ScrimInsetsFrameLayout.1(this));
  }

  protected void a(aa paramaa)
  {
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    if ((this.lY != null) && (this.lX != null))
    {
      int k = paramCanvas.save();
      paramCanvas.translate(getScrollX(), getScrollY());
      this.mTempRect.set(0, 0, i, this.lY.top);
      this.lX.setBounds(this.mTempRect);
      this.lX.draw(paramCanvas);
      this.mTempRect.set(0, j - this.lY.bottom, i, j);
      this.lX.setBounds(this.mTempRect);
      this.lX.draw(paramCanvas);
      this.mTempRect.set(0, this.lY.top, this.lY.left, j - this.lY.bottom);
      this.lX.setBounds(this.mTempRect);
      this.lX.draw(paramCanvas);
      this.mTempRect.set(i - this.lY.right, this.lY.top, i, j - this.lY.bottom);
      this.lX.setBounds(this.mTempRect);
      this.lX.draw(paramCanvas);
      paramCanvas.restoreToCount(k);
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.lX != null)
      this.lX.setCallback(this);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.lX != null)
      this.lX.setCallback(null);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.internal.ScrimInsetsFrameLayout
 * JD-Core Version:    0.6.2
 */
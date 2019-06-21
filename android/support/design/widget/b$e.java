package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.a.a;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.widget.FrameLayout;

class b$e extends FrameLayout
{
  private b.d mV;
  private b.c mW;

  b$e(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.SnackbarLayout);
    if (paramContext.hasValue(1))
      s.h(this, paramContext.getDimensionPixelSize(1, 0));
    paramContext.recycle();
    setClickable(true);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    s.ak(this);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.mW != null)
      this.mW.bH();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.mV != null)
      this.mV.bI();
  }

  void setOnAttachStateChangeListener(b.c paramc)
  {
    this.mW = paramc;
  }

  void setOnLayoutChangeListener(b.d paramd)
  {
    this.mV = paramd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.b.e
 * JD-Core Version:    0.6.2
 */
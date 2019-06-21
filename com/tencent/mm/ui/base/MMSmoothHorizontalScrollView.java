package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMSmoothHorizontalScrollView extends HorizontalScrollView
{
  private Interpolator mJ;
  private float mLastMotionX;
  private Rect mRect;
  private TranslateAnimation pCM;
  private View yxk;

  public MMSmoothHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106794);
    this.mRect = new Rect();
    this.mJ = new DecelerateInterpolator();
    setFadingEdgeLength(0);
    AppMethodBeat.o(106794);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(106795);
    if (getChildCount() > 0)
      this.yxk = getChildAt(0);
    AppMethodBeat.o(106795);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(106796);
    boolean bool;
    if (this.yxk == null)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(106796);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    label427: 
    while (true)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(106796);
      break;
      this.mLastMotionX = paramMotionEvent.getX();
      continue;
      float f = paramMotionEvent.getX();
      if (this.mLastMotionX == 0.0F)
        this.mLastMotionX = f;
      i = (int)(this.mLastMotionX - f) / 2;
      scrollBy(i, 0);
      this.mLastMotionX = f;
      int k = this.yxk.getMeasuredWidth();
      int m = getWidth();
      int n = getPaddingLeft();
      int i1 = getPaddingRight();
      int i2 = getScrollX();
      if ((i2 == 0) || (i2 == k - (m - n - i1)))
        j = 1;
      if (j != 0)
      {
        if (this.mRect.isEmpty())
          this.mRect.set(this.yxk.getLeft(), this.yxk.getTop(), this.yxk.getRight(), this.yxk.getBottom());
        this.yxk.layout(this.yxk.getLeft() - i, this.yxk.getTop(), this.yxk.getRight() - i, this.yxk.getBottom());
        continue;
        this.mLastMotionX = 0.0F;
        if (!this.mRect.isEmpty());
        for (j = i; ; j = 0)
        {
          if (j == 0)
            break label427;
          this.pCM = new TranslateAnimation(this.yxk.getLeft(), this.mRect.left, 0.0F, 0.0F);
          this.pCM.setInterpolator(this.mJ);
          this.pCM.setDuration(Math.abs(this.yxk.getLeft() - this.mRect.left));
          this.yxk.startAnimation(this.pCM);
          this.yxk.layout(this.mRect.left, this.mRect.top, this.mRect.right, this.mRect.bottom);
          this.mRect.setEmpty();
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMSmoothHorizontalScrollView
 * JD-Core Version:    0.6.2
 */
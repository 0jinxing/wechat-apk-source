package com.tencent.xweb.extension.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ClickableFrameLayout extends FrameLayout
{
  private GestureDetector iay;
  private View.OnClickListener mOnClickListener;

  public ClickableFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ClickableFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.mOnClickListener != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void setGestureDetector(GestureDetector paramGestureDetector)
  {
    this.iay = paramGestureDetector;
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(84558);
    super.setOnClickListener(paramOnClickListener);
    this.mOnClickListener = paramOnClickListener;
    AppMethodBeat.o(84558);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.ClickableFrameLayout
 * JD-Core Version:    0.6.2
 */
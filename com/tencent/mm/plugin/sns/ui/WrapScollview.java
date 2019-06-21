package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WrapScollview extends ScrollView
{
  private View contentView;
  private boolean rEz = true;

  public WrapScollview(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public WrapScollview(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected int computeScrollDeltaToGetChildRectOnScreen(Rect paramRect)
  {
    AppMethodBeat.i(39931);
    int i;
    if (!this.rEz)
    {
      i = 0;
      AppMethodBeat.o(39931);
    }
    while (true)
    {
      return i;
      i = super.computeScrollDeltaToGetChildRectOnScreen(paramRect);
      AppMethodBeat.o(39931);
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    boolean bool = false;
    AppMethodBeat.i(39930);
    if (this.contentView != null)
    {
      View localView = this.contentView;
      float f1 = paramMotionEvent.getRawX();
      float f2 = paramMotionEvent.getRawY();
      int[] arrayOfInt = new int[2];
      localView.getLocationOnScreen(arrayOfInt);
      int j = arrayOfInt[0];
      int k = localView.getWidth();
      int m = arrayOfInt[1];
      int n = localView.getHeight();
      if ((j < f1) && (f1 < k + j) && (m < f2) && (f2 < n + m))
      {
        if (i == 0)
          break label130;
        AppMethodBeat.o(39930);
      }
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label130: bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(39930);
    }
  }

  public void setContentView(View paramView)
  {
    this.contentView = paramView;
  }

  public void setDoComputeScrollDeltaToGetChildRectOnScreen(boolean paramBoolean)
  {
    this.rEz = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.WrapScollview
 * JD-Core Version:    0.6.2
 */
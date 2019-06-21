package com.tencent.mm.plugin.emoji.ui;

import android.graphics.Rect;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TouchInterceptorListView$1 extends GestureDetector.SimpleOnGestureListener
{
  TouchInterceptorListView$1(TouchInterceptorListView paramTouchInterceptorListView)
  {
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(53526);
    boolean bool;
    if (TouchInterceptorListView.a(this.lcr) != null)
    {
      if (paramFloat1 > 1000.0F)
      {
        paramMotionEvent1 = TouchInterceptorListView.b(this.lcr);
        TouchInterceptorListView.a(this.lcr).getDrawingRect(paramMotionEvent1);
        if (paramMotionEvent2.getX() > paramMotionEvent1.right * 2 / 3)
        {
          TouchInterceptorListView.c(this.lcr);
          TouchInterceptorListView.e(this.lcr);
          TouchInterceptorListView.d(this.lcr);
          TouchInterceptorListView.f(this.lcr);
        }
      }
      bool = true;
      AppMethodBeat.o(53526);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(53526);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.TouchInterceptorListView.1
 * JD-Core Version:    0.6.2
 */
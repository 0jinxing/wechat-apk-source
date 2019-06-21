package com.tencent.xweb.extension.video;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;

final class d$14
  implements View.OnTouchListener
{
  d$14(d paramd)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(84589);
    if (!d.c(this.AOs))
      AppMethodBeat.o(84589);
    while (true)
    {
      return bool;
      switch (paramMotionEvent.getAction() & 0xFF)
      {
      case 2:
      case 3:
      case 4:
      default:
      case 5:
      case 1:
      case 6:
      }
      while (true)
      {
        if ((paramMotionEvent.getAction() == 1) && (d.d(this.AOs) == 3))
        {
          double d = d.a(this.AOs) * d.e(this.AOs) / 100.0D;
          this.AOs.f(d, true);
          d.b(this.AOs).evaluateJavascript(String.format("xwebVideoBridge.xwebToJS_Video_Seek(%f);", new Object[] { Double.valueOf(d) }), new d.14.1(this));
          d.f(this.AOs);
        }
        if (d.g(this.AOs) != 1)
          break label241;
        bool = d.h(this.AOs).onTouchEvent(paramMotionEvent);
        AppMethodBeat.o(84589);
        break;
        if (paramMotionEvent.getPointerCount() == 2)
        {
          d.a(this.AOs, 1);
          continue;
          d.a(this.AOs, 0);
          continue;
          d.a(this.AOs, 0);
        }
      }
      label241: bool = d.i(this.AOs).onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(84589);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.d.14
 * JD-Core Version:    0.6.2
 */
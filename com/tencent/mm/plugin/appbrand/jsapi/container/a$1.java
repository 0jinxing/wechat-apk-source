package com.tencent.mm.plugin.appbrand.jsapi.container;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.s.d;

final class a$1
  implements View.OnTouchListener
{
  a$1(a parama)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(126276);
    if (paramMotionEvent.getAction() != 0)
      d.a((ViewGroup)paramView, paramMotionEvent);
    AppMethodBeat.o(126276);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.container.a.1
 * JD-Core Version:    0.6.2
 */
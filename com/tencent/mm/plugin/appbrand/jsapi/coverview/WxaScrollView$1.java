package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaScrollView$1 extends ScrollView
{
  WxaScrollView$1(WxaScrollView paramWxaScrollView, Context paramContext)
  {
    super(paramContext);
  }

  protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(126321);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (WxaScrollView.a(this.hJl) != null)
      WxaScrollView.a(this.hJl).p(this.hJl, paramInt1, paramInt2);
    AppMethodBeat.o(126321);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(126322);
    boolean bool;
    switch (paramMotionEvent.getAction())
    {
    case 0:
    case 1:
    default:
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(126322);
    case 2:
    }
    while (true)
    {
      return bool;
      if (WxaScrollView.b(this.hJl))
        break;
      d.e("MicroMsg.WxaScrollView", "can not move");
      bool = false;
      AppMethodBeat.o(126322);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView.1
 * JD-Core Version:    0.6.2
 */
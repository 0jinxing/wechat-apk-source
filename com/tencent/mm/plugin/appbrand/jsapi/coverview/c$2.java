package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.e;

final class c$2
  implements View.OnTouchListener
{
  c$2(c paramc, v.b paramb, e parame)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(126294);
    boolean bool = "webview".equals(this.hAt.getString("sendTo", null));
    a.a(this.hCK, paramMotionEvent, this.hAt.getString("data", ""), bool);
    AppMethodBeat.o(126294);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.c.2
 * JD-Core Version:    0.6.2
 */
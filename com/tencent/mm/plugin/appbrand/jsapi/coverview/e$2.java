package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;

final class e$2
  implements View.OnTouchListener
{
  e$2(e parame, v.b paramb, com.tencent.mm.plugin.appbrand.jsapi.e parame1)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(126304);
    boolean bool = "webview".equals(this.hAt.getString("sendTo", null));
    a.a(this.hCK, paramMotionEvent, this.hAt.getString("data", ""), bool);
    AppMethodBeat.o(126304);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.e.2
 * JD-Core Version:    0.6.2
 */
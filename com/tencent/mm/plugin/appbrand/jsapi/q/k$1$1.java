package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.g.d;

final class k$1$1 extends g.c
{
  k$1$1(k.1 param1, WindowManager.LayoutParams paramLayoutParams, Activity paramActivity)
  {
  }

  public final void a(g.d paramd)
  {
    AppMethodBeat.i(126429);
    this.hXM.screenBrightness = this.hXN.hXL.hXJ;
    this.val$activity.getWindow().setAttributes(this.hXM);
    AppMethodBeat.o(126429);
  }

  public final void onResume()
  {
    AppMethodBeat.i(126430);
    this.hXM.screenBrightness = this.hXN.hXL.hXK;
    this.val$activity.getWindow().setAttributes(this.hXM);
    AppMethodBeat.o(126430);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.k.1.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;

final class f$1
  implements MMActivity.a
{
  f$1(f paramf, MMActivity paramMMActivity, String paramString1, String paramString2, s params, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131450);
    if (paramInt1 == 0)
      if (paramInt2 == -1)
      {
        h.bQ(this.cgq, this.cgq.getResources().getString(2131297050));
        f.b(this.val$appId, this.bSt, "", 1, paramInt2);
        ab.i("MicroMsg.JsApiShareTimeline", "result is success");
        this.hsj.M(this.eIl, this.hWC.j("success", null));
        AppMethodBeat.o(131450);
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiShareTimeline", "result is cancel");
      this.hsj.M(this.eIl, this.hWC.j("cancel", null));
      f.b(this.val$appId, this.bSt, "", 3, paramInt2);
      AppMethodBeat.o(131450);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.f.1
 * JD-Core Version:    0.6.2
 */
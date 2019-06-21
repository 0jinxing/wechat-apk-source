package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.w;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;

final class f$2
  implements View.OnClickListener
{
  f$2(f paramf, u paramu)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(101966);
    ab.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do know the auth auto fill data protocol");
    paramView = this.hCx.mContext.getString(2131305810);
    paramView = paramView + aa.dor();
    ab.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do open url:".concat(String.valueOf(paramView)));
    ((w)this.hCx.B(w.class)).a(this.hCx.mContext, paramView, null);
    AppMethodBeat.o(101966);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.a.f.2
 * JD-Core Version:    0.6.2
 */
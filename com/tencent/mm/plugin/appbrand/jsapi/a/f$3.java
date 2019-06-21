package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.protocal.protobuf.fw;
import com.tencent.mm.sdk.platformtools.ab;

final class f$3
  implements DialogInterface.OnClickListener
{
  f$3(f paramf, fw paramfw, u paramu, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(101967);
    ab.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do not accept the auto fill data protocol");
    this.hCE.vIb = false;
    this.hCx.M(this.eIl, this.hCI.j("cancel", null));
    f.a(this.hCx, this.hCE);
    AppMethodBeat.o(101967);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.a.f.3
 * JD-Core Version:    0.6.2
 */
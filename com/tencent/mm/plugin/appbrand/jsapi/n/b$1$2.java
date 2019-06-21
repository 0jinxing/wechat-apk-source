package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;

final class b$1$2
  implements DialogInterface.OnCancelListener
{
  b$1$2(b.1 param1)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(74782);
    this.hUV.hsD.M(this.hUV.eIl, this.hUV.hUT.j("cancel", null));
    AppMethodBeat.o(74782);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.b.1.2
 * JD-Core Version:    0.6.2
 */
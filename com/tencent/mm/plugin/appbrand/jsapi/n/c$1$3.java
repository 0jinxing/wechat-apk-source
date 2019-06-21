package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

final class c$1$3
  implements DialogInterface.OnCancelListener
{
  c$1$3(c.1 param1)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(74791);
    paramDialogInterface = new HashMap();
    paramDialogInterface.put("confirm", Boolean.FALSE);
    paramDialogInterface.put("cancel", Boolean.TRUE);
    this.hVe.hsD.M(this.hVe.eIl, this.hVe.hVd.j("ok", paramDialogInterface));
    AppMethodBeat.o(74791);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.c.1.3
 * JD-Core Version:    0.6.2
 */
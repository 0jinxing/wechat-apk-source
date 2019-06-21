package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

final class c$1$1
  implements DialogInterface.OnClickListener
{
  c$1$1(c.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(74789);
    paramDialogInterface = new HashMap();
    paramDialogInterface.put("confirm", Boolean.TRUE);
    paramDialogInterface.put("cancel", Boolean.FALSE);
    this.hVe.hsD.M(this.hVe.eIl, this.hVe.hVd.j("ok", paramDialogInterface));
    AppMethodBeat.o(74789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.c.1.1
 * JD-Core Version:    0.6.2
 */
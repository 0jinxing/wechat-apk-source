package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

final class c$1$2
  implements DialogInterface.OnClickListener
{
  c$1$2(c.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(74790);
    HashMap localHashMap = new HashMap();
    localHashMap.put("confirm", Boolean.FALSE);
    localHashMap.put("cancel", Boolean.TRUE);
    paramDialogInterface.dismiss();
    this.hVe.hsD.M(this.hVe.eIl, this.hVe.hVd.j("ok", localHashMap));
    AppMethodBeat.o(74790);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.c.1.2
 * JD-Core Version:    0.6.2
 */
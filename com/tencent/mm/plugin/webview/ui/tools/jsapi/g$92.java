package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

final class g$92
  implements ao.b.a
{
  g$92(g paramg, Intent paramIntent)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(9158);
    g.l(this.uHd);
    if (g.i(this.uHd) == null)
    {
      ab.w("MicroMsg.MsgHandler", "getNow callback, msghandler has already been detached!");
      g.a(this.uHd, g.j(this.uHd), "profile:fail", null);
      AppMethodBeat.o(9158);
      return;
    }
    if (g.m(this.uHd) != null)
      g.m(this.uHd).dismiss();
    ad localad = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(paramString);
    if ((localad == null) || ((int)localad.ewQ <= 0))
      localad = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoK(paramString);
    while (true)
    {
      if ((localad == null) || ((int)localad.ewQ <= 0))
        paramBoolean = false;
      while (true)
      {
        if (paramBoolean)
          break label219;
        Toast.makeText(ah.getContext(), g.i(this.uHd).getString(2131299997, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
        g.a(this.uHd, g.j(this.uHd), "profile:fail", null);
        AppMethodBeat.o(9158);
        break;
        paramString = localad.field_username;
      }
      label219: b.U(paramString, 3);
      o.acv().pZ(paramString);
      this.val$intent.addFlags(268435456);
      this.val$intent.putExtra("Contact_User", paramString);
      if (localad.dsf())
        if (g.n(this.uHd) != null)
          break label359;
      label359: for (int i = 42; ; i = g.n(this.uHd).getInt("Contact_Scene", 42))
      {
        h.pYm.X(10298, localad.field_username + "," + i);
        this.val$intent.putExtra("Contact_Scene", i);
        g.a(this.uHd, this.val$intent);
        g.a(this.uHd, g.j(this.uHd), "profile:ok", null);
        AppMethodBeat.o(9158);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.92
 * JD-Core Version:    0.6.2
 */
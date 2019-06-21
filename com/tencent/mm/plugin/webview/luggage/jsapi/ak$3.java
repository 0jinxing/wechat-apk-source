package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

final class ak$3
  implements ao.b.a
{
  ak$3(ak paramak, Context paramContext, bc.a parama, ProgressDialog paramProgressDialog, Intent paramIntent)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(6352);
    if (this.val$context == null)
    {
      ab.w("MicroMsg.JsApiProfile", "getNow callback, msghandler has already been detached!");
      this.kOx.d("fail", null);
      AppMethodBeat.o(6352);
    }
    while (true)
    {
      return;
      if (this.eiD != null)
        this.eiD.dismiss();
      ad localad1 = ((j)g.K(j.class)).XM().aoO(paramString);
      ad localad2;
      if (localad1 != null)
      {
        localad2 = localad1;
        if ((int)localad1.ewQ > 0);
      }
      else
      {
        localad2 = ((j)g.K(j.class)).XM().aoK(paramString);
      }
      if ((localad2 == null) || ((int)localad2.ewQ <= 0))
        paramBoolean = false;
      while (true)
      {
        if (paramBoolean)
          break label167;
        l.q(new ak.3.1(this));
        this.kOx.d("fail", null);
        AppMethodBeat.o(6352);
        break;
        paramString = localad2.field_username;
      }
      label167: b.U(paramString, 3);
      o.acv().pZ(paramString);
      this.val$intent.addFlags(268435456);
      this.val$intent.putExtra("Contact_User", paramString);
      if (localad2.dsf())
      {
        h.pYm.X(10298, localad2.field_username + ",42");
        this.val$intent.putExtra("Contact_Scene", 42);
      }
      com.tencent.mm.plugin.webview.a.a.gkE.c(this.val$intent, this.val$context);
      this.kOx.d(null, null);
      AppMethodBeat.o(6352);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ak.3
 * JD-Core Version:    0.6.2
 */
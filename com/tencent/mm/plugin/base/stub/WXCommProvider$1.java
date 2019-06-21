package com.tencent.mm.plugin.base.stub;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;

public class WXCommProvider$1 extends BroadcastReceiver
{
  WXCommProvider$1(WXCommProvider paramWXCommProvider)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(18162);
    if (System.currentTimeMillis() - ao.vdh >= 600000L)
      ab.e("MicroMsg.AppUtil", "hy: get comm model time expired");
    for (paramContext = null; ; paramContext = ao.vdg)
    {
      if (paramContext != null)
      {
        ab.i("MicroMsg.WXCommProvider", "hy: has wxcomm query request. start to continue requesting");
        paramContext = this.jDR.a(paramContext.uri, paramContext.projection, paramContext.selection, paramContext.selectionArgs, paramContext.vde, paramContext.code, paramContext.vdf);
        if (paramContext != null)
          paramContext.close();
        p.dhH();
      }
      AppMethodBeat.o(18162);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXCommProvider.1
 * JD-Core Version:    0.6.2
 */
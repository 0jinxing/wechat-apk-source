package com.tencent.mm.plugin.wallet_index.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1 extends BroadcastReceiver
{
  a$1(a parama)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(48219);
    paramContext = paramIntent.getAction();
    if ("com.tencent.mm.gwallet.ACTION_PAY_RESPONSE".equals(paramContext))
    {
      paramContext = this.tRx;
      a.b(this.tRx);
      a.a(paramContext, com.tencent.mm.plugin.wallet_index.b.a.a.a(paramIntent, a.a(this.tRx)));
      AppMethodBeat.o(48219);
    }
    while (true)
    {
      return;
      if ("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE".equals(paramContext))
      {
        boolean bool = paramIntent.getBooleanExtra("is_direct", true);
        a.b(this.tRx);
        com.tencent.mm.plugin.wallet_index.b.a.a.a(paramIntent, new a.1.1(this, bool));
      }
      AppMethodBeat.o(48219);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.a.1
 * JD-Core Version:    0.6.2
 */
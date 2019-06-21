package com.tencent.mm.plugin.multitalk.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;

final class f$2 extends BroadcastReceiver
{
  f$2(f paramf)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(53941);
    if (!this.oGB.bRd())
      AppMethodBeat.o(53941);
    while (true)
    {
      return;
      if (paramIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
      {
        f.h(this.oGB).removeCallbacksAndMessages(null);
        f.h(this.oGB).postDelayed(new f.2.1(this), 8000L);
        AppMethodBeat.o(53941);
      }
      else
      {
        int i = j.z(paramContext, paramIntent);
        ab.i("MicroMsg.MT.MultiTalkManager", "phone state %d", new Object[] { Integer.valueOf(i) });
        if (i == 0)
        {
          al.d(new f.2.2(this));
          AppMethodBeat.o(53941);
        }
        else
        {
          al.d(new f.2.3(this));
          AppMethodBeat.o(53941);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.f.2
 * JD-Core Version:    0.6.2
 */
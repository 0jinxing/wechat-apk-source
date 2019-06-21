package com.tencent.mm.plugin.card.b;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Map;

final class i$a$2 extends BroadcastReceiver
{
  i$a$2(i.a parama)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(87704);
    if (paramIntent == null)
    {
      ab.i("MicroMsg.CardLbsOrBluetooth", "Receive intent failed");
      AppMethodBeat.o(87704);
    }
    while (true)
    {
      return;
      paramContext = BluetoothAdapter.getDefaultAdapter();
      if (paramContext != null)
      {
        int i = paramContext.getState();
        ab.d("MicroMsg.CardLbsOrBluetooth", "state:%d", new Object[] { Integer.valueOf(i) });
        if (i == 12)
        {
          this.kbx.kbs = true;
          al.n(this.kbx.kbv, this.kbx.kbu);
          AppMethodBeat.o(87704);
        }
        else if (i == 10)
        {
          al.af(this.kbx.kbv);
          this.kbx.kbs = false;
          this.kbx.kbt.clear();
        }
      }
      else
      {
        AppMethodBeat.o(87704);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.i.a.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.k;
import com.tencent.mm.network.aa;
import com.tencent.mm.network.aa.a;
import com.tencent.mm.sdk.platformtools.ab;

@k
@JgClassChecked(author=20, fComment="checked", lastDate="20140819", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class MMReceivers$ConnectionReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(57774);
    if (paramContext == null)
      AppMethodBeat.o(57774);
    while (true)
    {
      return;
      ab.i("MicroMsg.ConnectionReceiver", "onReceive threadID: " + Thread.currentThread().getId());
      if (!b.c(paramContext, "connection", true))
      {
        MMReceivers.AlarmReceiver.bs(paramContext);
        ab.dot();
        AppMethodBeat.o(57774);
      }
      else if (aa.ann() == null)
      {
        AppMethodBeat.o(57774);
      }
      else
      {
        paramIntent = (ConnectivityManager)paramContext.getSystemService("connectivity");
        paramContext = null;
        try
        {
          paramIntent = paramIntent.getActiveNetworkInfo();
          paramContext = paramIntent;
          if ((paramContext == null) || (paramContext.getState() != NetworkInfo.State.CONNECTED))
            if (paramContext == null)
            {
              paramIntent = "null";
              ab.i("MicroMsg.ConnectionReceiver", "NetworkAvailable: false, state:%s", new Object[] { paramIntent });
              paramIntent = aa.ann();
              if (paramContext != null)
                paramContext.getTypeName();
              if (paramContext != null)
                paramContext.getSubtypeName();
              paramIntent.bt(false);
              AppMethodBeat.o(57774);
            }
        }
        catch (Exception paramIntent)
        {
          while (true)
          {
            ab.e("MicroMsg.ConnectionReceiver", "getActiveNetworkInfo failed. exception: %s", new Object[] { paramIntent.getMessage() });
            continue;
            paramIntent = paramContext.getState();
          }
          ab.i("MicroMsg.ConnectionReceiver", "NetworkAvailable: true");
          paramIntent = aa.ann();
          paramContext.getTypeName();
          paramContext.getSubtypeName();
          paramIntent.bt(true);
          AppMethodBeat.o(57774);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MMReceivers.ConnectionReceiver
 * JD-Core Version:    0.6.2
 */
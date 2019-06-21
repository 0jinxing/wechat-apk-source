package com.tencent.mm.booter;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Set;

@com.tencent.mm.kernel.k
@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class BluetoothReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(15836);
    if ((paramContext == null) || (paramIntent == null) || (bo.isNullOrNil(paramIntent.getAction())))
      AppMethodBeat.o(15836);
    while (true)
    {
      return;
      paramContext = BluetoothAdapter.getDefaultAdapter();
      if (paramContext == null)
      {
        ab.d("MicroMsg.BluetoothReceiver", "getDefaultAdapter == null");
        AppMethodBeat.o(15836);
      }
      else
      {
        paramContext = paramContext.getBondedDevices();
        if ((paramContext == null) || (paramContext.size() == 0))
        {
          ab.d("MicroMsg.BluetoothReceiver", "getBondedDevices == null");
          AppMethodBeat.o(15836);
        }
        else if (bo.isNullOrNil(paramIntent.getAction()))
        {
          AppMethodBeat.o(15836);
        }
        else
        {
          ab.d("MicroMsg.BluetoothReceiver", "dkbt action :" + paramIntent.getAction());
          if (!aw.RK())
            AppMethodBeat.o(15836);
          else
            try
            {
              i = paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
              ab.d("MicroMsg.BluetoothReceiver", "dkbt  action :" + paramIntent.getAction() + " state:" + i + " isBluetoothScoOn :" + aw.ZL().KP() + " " + aw.ZL().KT());
              if (paramIntent.getAction().equalsIgnoreCase("android.media.SCO_AUDIO_STATE_CHANGED"))
              {
                ab.d("MicroMsg.BluetoothReceiver", "just STATE_CHANGED not real STATE_UPDATED" + paramIntent.getAction());
                AppMethodBeat.o(15836);
              }
            }
            catch (Exception paramContext)
            {
              int i;
              while (true)
              {
                ab.e("MicroMsg.BluetoothReceiver", "%s", new Object[] { bo.l(paramContext) });
                i = 0;
              }
              if (i == 1)
              {
                ab.d("MicroMsg.BluetoothReceiver", "sco connected!");
                paramContext = aw.ZL();
                ab.i("MicroMsg.MMAudioManager", "dkbt bluetoothStartSucc %s", new Object[] { paramContext.KT() });
                g.epc = true;
                paramContext.iI(1);
                AppMethodBeat.o(15836);
              }
              else
              {
                if (i == 0)
                {
                  ab.d("MicroMsg.BluetoothReceiver", "sco disconnected!getStopBluetoothInBR = %s", new Object[] { Integer.valueOf(q.etn.erJ) });
                  if (q.etn.erJ == 1)
                    aw.ZL().KN();
                  aw.ZL().KL();
                }
                AppMethodBeat.o(15836);
              }
            }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.BluetoothReceiver
 * JD-Core Version:    0.6.2
 */
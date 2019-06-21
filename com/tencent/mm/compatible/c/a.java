package com.tencent.mm.compatible.c;

import android.media.AudioManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public static boolean a(AudioManager paramAudioManager)
  {
    boolean bool = false;
    AppMethodBeat.i(92902);
    if (!paramAudioManager.isBluetoothScoAvailableOffCall())
      AppMethodBeat.o(92902);
    while (true)
    {
      return bool;
      if (ax.Ex())
      {
        AppMethodBeat.o(92902);
      }
      else
      {
        ab.i("MicroMsg.BluetoothUtil", "start DeviceInfo mCommonInfo getStartBluetoothSco:%s ", new Object[] { Integer.valueOf(q.etn.erL) });
        if (((q.etn.erL == 1) || (q.etn.erL == -1)) && (!paramAudioManager.isBluetoothScoOn()))
        {
          ab.i("MicroMsg.BluetoothUtil", "BluetoothUtil am.isBluetoothScoOn is false and startBluetoothSco, stack: %s", new Object[] { bo.dpG() });
          paramAudioManager.startBluetoothSco();
        }
        AppMethodBeat.o(92902);
        bool = true;
      }
    }
  }

  public static boolean b(AudioManager paramAudioManager)
  {
    boolean bool = false;
    AppMethodBeat.i(92903);
    if (ax.Ex())
      AppMethodBeat.o(92903);
    while (true)
    {
      return bool;
      ab.i("MicroMsg.BluetoothUtil", "stop DeviceInfo mCommonInfo getStartBluetoothSco:%s,getStopBluetoothInBU:%s ", new Object[] { Integer.valueOf(q.etn.erL), Integer.valueOf(q.etn.erK) });
      if (((q.etn.erK == 1) || (q.etn.erL == -1)) && (paramAudioManager.isBluetoothScoOn()))
      {
        ab.i("MicroMsg.BluetoothUtil", "BluetoothUtil stopBluetoothSco stack: %s", new Object[] { bo.dpG() });
        paramAudioManager.stopBluetoothSco();
      }
      AppMethodBeat.o(92903);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.voip.model;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class VoipMgr$16 extends PhoneStateListener
{
  VoipMgr$16(VoipMgr paramVoipMgr)
  {
  }

  public final void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    AppMethodBeat.i(4478);
    super.onSignalStrengthsChanged(paramSignalStrength);
    super.onSignalStrengthsChanged(paramSignalStrength);
    paramSignalStrength = paramSignalStrength.toString().split(" ");
    try
    {
      if ((VoipMgr.j(this.sSn).getNetworkType() == 13) && (paramSignalStrength.length > 9))
        VoipMgr.cJP()[0] = bo.ank(paramSignalStrength[9]);
      AppMethodBeat.o(4478);
      return;
    }
    catch (Exception paramSignalStrength)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Voip.VoipMgr", paramSignalStrength, "", new Object[0]);
        AppMethodBeat.o(4478);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.16
 * JD-Core Version:    0.6.2
 */
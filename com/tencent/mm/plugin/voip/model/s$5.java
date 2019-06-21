package com.tencent.mm.plugin.voip.model;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class s$5 extends PhoneStateListener
{
  s$5(s params, TelephonyManager paramTelephonyManager)
  {
  }

  public final void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    int i = 100;
    AppMethodBeat.i(4647);
    super.onSignalStrengthsChanged(paramSignalStrength);
    String[] arrayOfString = paramSignalStrength.toString().split(" ");
    if (this.sTx.getNetworkType() == 13)
    {
      if ((arrayOfString != null) && (arrayOfString.length >= 10))
        s.Gz(bo.getInt(arrayOfString[9], -141) + 140);
      this.sTw.sTn = "LTE";
      if (s.access$400() <= 100)
        break label157;
      label82: s.Gz(i);
      if (s.access$400() >= 0)
        break label164;
    }
    label157: label164: for (i = 0; ; i = s.access$400())
    {
      s.Gz(i);
      s.f(this.sTw);
      AppMethodBeat.o(4647);
      return;
      int j = paramSignalStrength.getGsmSignalStrength();
      if ((paramSignalStrength.isGsm()) && (j == 99))
      {
        s.Gz(-1);
        break;
      }
      s.Gz((int)(j * 3.225807F));
      break;
      i = s.access$400();
      break label82;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.s.5
 * JD-Core Version:    0.6.2
 */
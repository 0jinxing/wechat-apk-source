package com.tencent.mars.comm;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

public class NetStatusUtil$StrengthListener extends PhoneStateListener
{
  public void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    super.onSignalStrengthsChanged(paramSignalStrength);
    if (!paramSignalStrength.isGsm())
      NetStatusUtil.access$002(paramSignalStrength.getCdmaDbm());
    while (true)
    {
      return;
      NetStatusUtil.access$002(paramSignalStrength.getGsmSignalStrength());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mars.comm.NetStatusUtil.StrengthListener
 * JD-Core Version:    0.6.2
 */
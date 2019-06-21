package com.tencent.tmassistantsdk.downloadservice;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

class NetworkMonitorReceiver$1 extends ak
{
  NetworkMonitorReceiver$1(NetworkMonitorReceiver paramNetworkMonitorReceiver)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(75770);
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
    case 67:
    }
    while (true)
    {
      AppMethodBeat.o(75770);
      return;
      this.this$0.notifyNetworkChanged();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.1
 * JD-Core Version:    0.6.2
 */
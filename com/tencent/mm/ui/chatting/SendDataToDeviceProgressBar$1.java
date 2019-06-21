package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class SendDataToDeviceProgressBar$1
  implements Runnable
{
  SendDataToDeviceProgressBar$1(SendDataToDeviceProgressBar paramSendDataToDeviceProgressBar)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30998);
    this.yMh.invalidate();
    AppMethodBeat.o(30998);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.SendDataToDeviceProgressBar.1
 * JD-Core Version:    0.6.2
 */
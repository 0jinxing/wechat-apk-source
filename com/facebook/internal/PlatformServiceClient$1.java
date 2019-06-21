package com.facebook.internal;

import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

class PlatformServiceClient$1 extends Handler
{
  PlatformServiceClient$1(PlatformServiceClient paramPlatformServiceClient)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(96654);
    this.this$0.handleMessage(paramMessage);
    AppMethodBeat.o(96654);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.internal.PlatformServiceClient.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ipcinvoker;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseIPCService$2
  implements Runnable
{
  BaseIPCService$2(BaseIPCService paramBaseIPCService)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114000);
    Process.killProcess(Process.myPid());
    AppMethodBeat.o(114000);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.BaseIPCService.2
 * JD-Core Version:    0.6.2
 */
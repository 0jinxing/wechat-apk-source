package com.tencent.mm.plugin.wepkg.ipc;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WepkgMainProcessService$2 extends a.a
{
  WepkgMainProcessService$2(WepkgMainProcessService paramWepkgMainProcessService)
  {
  }

  public final void r(Message paramMessage)
  {
    AppMethodBeat.i(63481);
    WepkgMainProcessService.a(this.uWI).send(paramMessage);
    AppMethodBeat.o(63481);
  }

  public final void x(Bundle paramBundle)
  {
    AppMethodBeat.i(63482);
    WepkgMainProcessService.as(paramBundle).asP();
    AppMethodBeat.o(63482);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService.2
 * JD-Core Version:    0.6.2
 */
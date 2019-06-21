package com.tencent.mm.booter;

import com.tencent.mars.comm.WakerLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class CoreService$4$1
  implements ap.a
{
  CoreService$4$1(CoreService.4 param4)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(57728);
    CoreService.i(this.ebN.ebM).unLock();
    AppMethodBeat.o(57728);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.CoreService.4.1
 * JD-Core Version:    0.6.2
 */
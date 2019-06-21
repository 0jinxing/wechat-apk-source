package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.af.b;

final class CoreService$1
  implements af.b
{
  CoreService$1(CoreService paramCoreService)
  {
  }

  public final void cancel()
  {
    AppMethodBeat.i(57724);
    MMReceivers.AlarmReceiver.bq(this.ebM.getApplicationContext());
    AppMethodBeat.o(57724);
  }

  public final void prepare()
  {
    AppMethodBeat.i(57723);
    MMReceivers.AlarmReceiver.bp(this.ebM.getApplicationContext());
    AppMethodBeat.o(57723);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.CoreService.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1$1
  implements Runnable
{
  c$1$1(c.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132057);
    ab.i("MicroMsg.AppBrand.Precondition.FromClientPreconditionProcess", "finish(), before send result, ui finishing %b, ui destroyed %b", new Object[] { Boolean.valueOf(this.ijO.ijN.isFinishing()), Boolean.valueOf(this.ijO.ijN.aHN()) });
    ResultReceiver localResultReceiver = (ResultReceiver)c.a(this.ijO.ijN).getParcelableExtra("extra_result_receiver");
    if (localResultReceiver != null)
      localResultReceiver.send(-1, Bundle.EMPTY);
    c.b(this.ijO.ijN);
    AppMethodBeat.o(132057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.c.1.1
 * JD-Core Version:    0.6.2
 */
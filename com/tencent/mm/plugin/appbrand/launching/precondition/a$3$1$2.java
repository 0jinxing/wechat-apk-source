package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.gdpr.b;

final class a$3$1$2
  implements b
{
  a$3$1$2(a.3.1 param1, Runnable paramRunnable)
  {
  }

  public final void kL(int paramInt)
  {
    AppMethodBeat.i(132051);
    if (paramInt == 0)
    {
      this.ijL.run();
      AppMethodBeat.o(132051);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.appbrand.ipc.a.a(this.ijK.ijJ.ijF.getBaseContext(), this.ijK.ijJ.ijF.getBaseContext().getString(2131297119), this.ijK.ijJ.ijF.getBaseContext().getString(2131297120), this.ijK.ijJ.ijF.getBaseContext().getString(2131296994), null, null, null, null);
      this.ijK.ijJ.ijF.finish();
      AppMethodBeat.o(132051);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.a.3.1.2
 * JD-Core Version:    0.6.2
 */
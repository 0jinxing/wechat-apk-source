package com.tencent.mm.plugin.appbrand.launching.precondition;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;

final class a$3
  implements Runnable
{
  a$3(a parama, LaunchParcel paramLaunchParcel, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132053);
    com.tencent.mm.plugin.appbrand.s.e.aNX();
    new com.tencent.mm.plugin.appbrand.launching.e(this.ijI, this.hRk, new a.3.1(this)).run();
    AppMethodBeat.o(132053);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.a.3
 * JD-Core Version:    0.6.2
 */
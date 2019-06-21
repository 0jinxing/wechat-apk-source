package com.tencent.mm.plugin.ext.provider;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.d;

final class ExtControlProviderNearBy$2
  implements Runnable
{
  ExtControlProviderNearBy$2(ExtControlProviderNearBy paramExtControlProviderNearBy)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20363);
    if (ExtControlProviderNearBy.a(this.lQB) == null)
      ExtControlProviderNearBy.a(this.lQB, d.agz());
    ExtControlProviderNearBy.a(this.lQB).a(ExtControlProviderNearBy.b(this.lQB), true);
    AppMethodBeat.o(20363);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class p
{
  static void aVi()
  {
    AppMethodBeat.i(79563);
    m localm = new m();
    g.RO().eJo.a(localm, 0);
    dir();
    AppMethodBeat.o(79563);
  }

  private static void dir()
  {
    AppMethodBeat.i(79562);
    if (!g.RN().QY())
      AppMethodBeat.o(79562);
    while (true)
    {
      return;
      long l = bo.anT();
      g.RP().Ry().set(ac.a.xMe, Long.valueOf(l + 86400L));
      AppMethodBeat.o(79562);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.p
 * JD-Core Version:    0.6.2
 */
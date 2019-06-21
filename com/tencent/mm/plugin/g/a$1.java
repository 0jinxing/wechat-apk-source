package com.tencent.mm.plugin.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.c;
import com.tencent.mm.al.f;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.protocal.protobuf.mw;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements Runnable
{
  a$1(mw parammw1, mw parammw2, mw parammw3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79084);
    g.a locala = new g.a();
    long l1 = -1L;
    f.afu();
    long l2 = l1;
    if (f.afw() != null)
    {
      l2 = l1;
      if (this.ksV != null)
      {
        f.afu();
        f.afw().a(this.ksV, this.ksW, this.ksX);
        l2 = locala.Mr();
      }
    }
    ab.d("MicroMsg.PinCdnTransport", "dkrsa setautoauthtick [%d %d]", new Object[] { Long.valueOf(locala.Mr()), Long.valueOf(l2) });
    AppMethodBeat.o(79084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.g.a.1
 * JD-Core Version:    0.6.2
 */
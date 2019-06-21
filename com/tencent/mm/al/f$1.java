package com.tencent.mm.al;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.mw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class f$1
  implements c
{
  f$1(f paramf)
  {
  }

  public final void a(mw parammw1, mw parammw2, mw parammw3)
  {
    AppMethodBeat.i(78074);
    ab.d("MicroMsg.SubCoreCdnTransport", "cdntra infoUpdate dns info " + parammw1.toString() + " getCore().engine:" + f.afy());
    if (f.afy() != null)
    {
      f.afy().a(parammw1, parammw2, parammw3, null, null, null);
      g.RS().aa(new f.1.1(this));
    }
    AppMethodBeat.o(78074);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.f.1
 * JD-Core Version:    0.6.2
 */
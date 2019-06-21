package com.tencent.mm.plugin.sns.ui.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.a;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.sdk.platformtools.bo;

final class b$2
  implements b.f
{
  b$2(b paramb)
  {
  }

  public final void b(com.tencent.mm.plugin.sight.decode.a.b paramb, long paramLong)
  {
    AppMethodBeat.i(40089);
    int i = (int)paramb.cle();
    if ((this.rGP.rqn != null) && (paramLong >= 3L))
    {
      this.rGP.rqn.c(this.rGP.ros.field_snsId, bo.yz(), false);
      this.rGP.rqn.f(this.rGP.ros.field_snsId, i, false);
      this.rGP.rqn.T(this.rGP.ros.field_snsId, this.rGP.ros.field_snsId);
    }
    this.rGP.rGD.qzM.setOnDecodeDurationListener(null);
    AppMethodBeat.o(40089);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c.a.b.2
 * JD-Core Version:    0.6.2
 */
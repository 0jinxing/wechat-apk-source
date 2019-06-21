package com.tencent.mm.plugin.aa.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.aa.a.a;
import com.tencent.mm.protocal.protobuf.v;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class PaylistAAUI$13$1
  implements n.c
{
  PaylistAAUI$13$1(PaylistAAUI.13 param13)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(40878);
    paraml.add(0, 1, 1, 2131301919);
    if ((!bo.isNullOrNil(PaylistAAUI.g(this.gpH.gpC))) && (PaylistAAUI.g(this.gpH.gpC).equals(r.Yz())) && (this.gpH.gpG.state == a.gkZ) && (this.gpH.gpG.vAn < this.gpH.gpG.vAl))
      paraml.add(0, 2, 1, 2131296336);
    AppMethodBeat.o(40878);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI.13.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.product.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nd;
import com.tencent.mm.g.a.nd.b;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.protocal.protobuf.cx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class f$2
  implements Runnable
{
  f$2(f paramf, nd paramnd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44057);
    ab.d("MicroMsg.MallProductUI", "JSOAUTH errCode[%s], isAccept[%s]", new Object[] { Integer.valueOf(this.piP.cJm.errCode), Boolean.valueOf(this.piP.cJm.cJn) });
    if (this.piP.cJm.errCode == 0)
    {
      c localc = f.c(this.piO);
      nd localnd = this.piP;
      cx localcx = new cx();
      localcx.jBB = localnd.cJm.userName;
      localcx.vEV = localnd.cJm.cJp;
      localcx.vEW = localnd.cJm.cJq;
      localcx.guO = localnd.cJm.cJr;
      localcx.guP = localnd.cJm.cJs;
      localcx.guW = localnd.cJm.cJt;
      localcx.naq = localnd.cJm.cJu;
      if ((!bo.isNullOrNil(localcx.jBB)) && (!bo.isNullOrNil(localcx.vEV)))
        localc.pgU = localcx;
    }
    f.d(this.piO);
    AppMethodBeat.o(44057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.f.2
 * JD-Core Version:    0.6.2
 */
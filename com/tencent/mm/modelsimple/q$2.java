package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.c;
import com.tencent.mm.protocal.j.e;
import com.tencent.mm.protocal.protobuf.cjj;
import com.tencent.mm.protocal.protobuf.fv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class q$2
  implements bk.a
{
  q$2(q paramq, j.e parame)
  {
  }

  public final void a(com.tencent.mm.network.e parame)
  {
    AppMethodBeat.i(123439);
    if ((parame == null) || (parame.adg() == null) || (this.fPo.LA(1) == null) || (this.fPo.LA(2) == null) || (this.fPo.LA(3) == null) || (this.fPo.vxV == null) || (this.fPo.vxV.xid == null))
    {
      com.tencent.mm.plugin.report.e.pXa.a(148L, 8L, 1L, false);
      ab.e("MicroMsg.NetSceneManualAuth", "[arthurdan.NetSceneManualAuthCrash] fatal error dispatcher == null || null == dispatcher.getAccInfo() || null == resp.getSession() || null == resp.rImpl || null == resp.rImpl.AuthSectResp !!!");
      AppMethodBeat.o(123439);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneManualAuth", "summerauth NetSceneLocalProxy setSessionInfo session:%s, %s, %s uin:%d", new Object[] { bo.anv(bo.ca(this.fPo.LA(1))), bo.anv(bo.ca(this.fPo.LA(2))), bo.anv(bo.ca(this.fPo.LA(3))), Integer.valueOf(this.fPo.vxV.xid.luF) });
      parame.adg().a(this.fPo.LA(1), this.fPo.LA(2), this.fPo.LA(3), this.fPo.vxV.xid.luF);
      AppMethodBeat.o(123439);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.q.2
 * JD-Core Version:    0.6.2
 */
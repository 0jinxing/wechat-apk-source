package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cz;
import com.tencent.mm.protocal.protobuf.lw;
import com.tencent.mm.protocal.protobuf.lx;
import com.tencent.mm.sdk.platformtools.ab;
import d.a.a.c;
import java.util.LinkedList;

public final class j extends m
  implements k
{
  private f ehi;
  private b gme;
  public lx pOW;

  public j(cz paramcz, String paramString)
  {
    AppMethodBeat.i(44741);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new lw();
    ((b.a)localObject).fsK = new lx();
    ((b.a)localObject).fsI = 2504;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2fsucpage";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.gme = ((b.a)localObject).acD();
    localObject = (lw)this.gme.fsG.fsP;
    ((lw)localObject).vPn = paramcz;
    ((lw)localObject).vPC = paramString;
    ab.i("MicroMsg.NetSceneBusiF2fSucpage", "NetSceneBusiF2fSucpage suc_page_extend %s req %s", new Object[] { paramString, a.a(paramcz) });
    AppMethodBeat.o(44741);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44742);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(44742);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44743);
    ab.i("MicroMsg.NetSceneBusiF2fSucpage", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pOW = ((lx)((b)paramq).fsH.fsP);
    paramq = new StringBuffer();
    if (this.pOW.tBw != null)
    {
      paramq.append("response: " + this.pOW.vPQ);
      paramq.append("is_show_btn: " + this.pOW.tBw.wex);
      if (this.pOW.tBw.wew != null)
        paramq.append("single_exposure_info_list " + this.pOW.tBw.wew.size());
    }
    ab.i("MicroMsg.NetSceneBusiF2fSucpage", "ret_code: %s, ret_msg: %s %s", new Object[] { Integer.valueOf(this.pOW.kdT), this.pOW.kdU, paramq.toString() });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(44743);
  }

  public final int getType()
  {
    return 2504;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.j
 * JD-Core Version:    0.6.2
 */
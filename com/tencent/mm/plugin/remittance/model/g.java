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
import com.tencent.mm.protocal.protobuf.lq;
import com.tencent.mm.protocal.protobuf.lr;
import com.tencent.mm.sdk.platformtools.ab;

public final class g extends m
  implements k
{
  private f ehi;
  private b gme;
  lq pOK;
  public lr pOL;
  public c pOM;
  public d pON;
  public boolean pOO;
  public String pOP;
  public boolean pOQ;
  public int pOR;

  public g(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt4, c paramc, d paramd)
  {
    AppMethodBeat.i(44732);
    this.pOO = false;
    this.pOP = "";
    this.pOQ = false;
    this.pOR = 0;
    this.pOP = (System.currentTimeMillis() + paramInt1);
    b.a locala = new b.a();
    this.pOR = paramInt1;
    locala.fsJ = new lq();
    locala.fsK = new lr();
    locala.fsI = 2677;
    locala.uri = "/cgi-bin/mmpay-bin/busif2fgetfavor";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.pOK = ((lq)this.gme.fsG.fsP);
    this.pOK.nUf = paramInt1;
    this.pOK.cIb = paramInt2;
    this.pOK.pOA = paramInt3;
    this.pOK.vPl = paramString1;
    this.pOK.pPW = paramString2;
    this.pOK.pOB = paramString3;
    this.pOK.pPZ = paramString4;
    this.pOK.vFf = paramString5;
    this.pOK.pOC = paramString6;
    this.pOK.vPm = paramInt4;
    this.pOM = paramc;
    this.pON = paramd;
    paramString1 = new StringBuffer();
    paramString1.append(String.format("request.amount %s", new Object[] { Integer.valueOf(this.pOK.nUf) }));
    paramString1.append(String.format("request.channel %s", new Object[] { Integer.valueOf(this.pOK.cIb) }));
    paramString1.append(String.format("request.scan_scene %s", new Object[] { Integer.valueOf(this.pOK.pOA) }));
    paramString1.append(String.format("request.receiver_desc %s", new Object[] { this.pOK.vPl }));
    paramString1.append(String.format("request.mch_name %s", new Object[] { this.pOK.pPW }));
    paramString1.append(String.format("request.favor_req_sign %s", new Object[] { this.pOK.pOB }));
    paramString1.append(String.format("request.receiver_openid %s", new Object[] { this.pOK.pPZ }));
    paramString1.append(String.format("request.receiver_username %s", new Object[] { this.pOK.vFf }));
    paramString1.append(String.format("request.favor_req_extend %s", new Object[] { this.pOK.pOC }));
    paramString1.append(String.format("request.fail_click_cell %s", new Object[] { Integer.valueOf(this.pOK.vPm) }));
    ab.i("MicroMsg.NetSceneBusiF2fGetFavor", "NetSceneBusiF2fGetFavor req %s", new Object[] { paramString1.toString() });
    AppMethodBeat.o(44732);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44733);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(44733);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44734);
    ab.i("MicroMsg.NetSceneBusiF2fGetFavor", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pOL = ((lr)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBusiF2fGetFavor", "ret_code: %s, ret_msg: %s favor_comm_resp : %s", new Object[] { Integer.valueOf(this.pOL.kdT), this.pOL.kdU, a.a(this.pOL.pOE) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(44734);
  }

  public final int getType()
  {
    return 2677;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.g
 * JD-Core Version:    0.6.2
 */
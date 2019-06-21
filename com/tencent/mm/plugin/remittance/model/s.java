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
import com.tencent.mm.protocal.protobuf.py;
import com.tencent.mm.protocal.protobuf.pz;
import com.tencent.mm.sdk.platformtools.ab;

public final class s extends m
  implements k
{
  private f ehi;
  private b gme;
  public pz pPj;

  public s(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, String paramString5)
  {
    AppMethodBeat.i(44764);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new py();
    ((b.a)localObject).fsK = new pz();
    ((b.a)localObject).fsI = 1779;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/transferoldpaycheck";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.gme = ((b.a)localObject).acD();
    localObject = (py)this.gme.fsG.fsP;
    ((py)localObject).cBT = paramString1;
    ((py)localObject).vWY = paramString2;
    ((py)localObject).pQe = paramString3;
    ((py)localObject).pPZ = paramString4;
    ((py)localObject).pSg = paramLong;
    ((py)localObject).vWF = paramString5;
    ab.i("MicroMsg.NetSceneRemittancePayCheck", "reqKey: %s, transfer: %s, fee: %s", new Object[] { paramString1, paramString2, Long.valueOf(paramLong) });
    AppMethodBeat.o(44764);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44765);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(44765);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44766);
    ab.i("MicroMsg.NetSceneRemittancePayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pPj = ((pz)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneRemittancePayCheck", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.pPj.kCl), this.pPj.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(44766);
  }

  public final int getType()
  {
    return 1779;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.s
 * JD-Core Version:    0.6.2
 */
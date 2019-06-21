package com.tencent.mm.plugin.wallet_ecard.a;

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
import com.tencent.mm.protocal.protobuf.je;
import com.tencent.mm.protocal.protobuf.jf;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  private b ehh;
  private f ehi;
  public jf tQh;

  public c(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    AppMethodBeat.i(48055);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new je();
    ((b.a)localObject).fsK = new jf();
    ((b.a)localObject).fsI = 1986;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/bindecard";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (je)this.ehh.fsG.fsP;
    ((je)localObject).vKZ = paramString1;
    ((je)localObject).vLa = paramString2;
    ((je)localObject).tCi = paramString3;
    ((je)localObject).vLb = paramString4;
    ((je)localObject).cHF = paramInt;
    ab.i("MicroMsg.NetSceneBindECard", "cardType: %s, reqSerial: %s, openScene: %s, verifyCode: %s, bindToken: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), paramString3, paramString4 });
    AppMethodBeat.o(48055);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48057);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48057);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(48056);
    ab.i("MicroMsg.NetSceneBindECard", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.tQh = ((jf)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBindECard", "ret_code: %d, ret_msg: %s", new Object[] { Integer.valueOf(this.tQh.kdT), this.tQh.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(48056);
  }

  public final int getType()
  {
    return 1986;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.a.c
 * JD-Core Version:    0.6.2
 */
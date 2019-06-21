package com.tencent.mm.plugin.wallet_core.c.a;

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
import com.tencent.mm.protocal.protobuf.biy;
import com.tencent.mm.protocal.protobuf.biz;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private b ehh;
  private f ehi;

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    AppMethodBeat.i(46560);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new biy();
    ((b.a)localObject).fsK = new biz();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibgcheckjsapisign";
    ((b.a)localObject).fsI = 1767;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (biy)this.ehh.fsG.fsP;
    ((biy)localObject).fKh = paramString1;
    ((biy)localObject).vYP = paramString4;
    ((biy)localObject).vYO = paramString2;
    ((biy)localObject).vYQ = paramString5;
    ((biy)localObject).vYR = paramString6;
    ((biy)localObject).vLo = paramString3;
    ((biy)localObject).vXP = paramString7;
    AppMethodBeat.o(46560);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46562);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46562);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46561);
    ab.i("MicroMsg.NetSceneIbgCheckJsapi", "check jsapi: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramArrayOfByte = (biz)((b)paramq).fsH.fsP;
    paramInt1 = paramInt3;
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramInt2 == 0)
      {
        paramInt1 = paramArrayOfByte.luT;
        paramq = paramArrayOfByte.luU;
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt1, paramq, this);
    AppMethodBeat.o(46561);
  }

  public final int getType()
  {
    return 1767;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.a.a
 * JD-Core Version:    0.6.2
 */
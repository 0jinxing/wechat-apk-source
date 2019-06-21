package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.byf;
import com.tencent.mm.protocal.protobuf.byg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class x extends m
  implements k
{
  public final b ehh;
  private f ehi;

  public x(String paramString1, String paramString2, int paramInt, SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    AppMethodBeat.i(123477);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new byf();
    ((b.a)localObject).fsK = new byg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/newsetpasswd";
    ((b.a)localObject).fsI = 383;
    ((b.a)localObject).fsL = 180;
    ((b.a)localObject).fsM = 1000000180;
    this.ehh = ((b.a)localObject).acD();
    localObject = (byf)this.ehh.fsG.fsP;
    ((byf)localObject).luH = bo.and(paramString1);
    ((byf)localObject).wdB = paramString2;
    ((byf)localObject).wXE = paramInt;
    ((byf)localObject).vHH = paramSKBuiltinBuffer_t;
    ab.d("MicroMsg.NetSceneSetPwd", "summersetpwd md5:%s ticket:%s, type:%d, authkey:%s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), bo.ca(aa.a(paramSKBuiltinBuffer_t)) });
    AppMethodBeat.o(123477);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(123478);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(123478);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(123479);
    ab.d("MicroMsg.NetSceneSetPwd", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(123479);
  }

  public final int getType()
  {
    return 383;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.x
 * JD-Core Version:    0.6.2
 */
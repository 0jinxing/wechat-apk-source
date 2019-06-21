package com.tencent.mm.modelsimple;

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
import com.tencent.mm.protocal.protobuf.bre;
import com.tencent.mm.protocal.protobuf.bxz;
import com.tencent.mm.protocal.protobuf.bya;
import com.tencent.mm.sdk.platformtools.ab;

public final class w extends m
  implements k
{
  private f ehi;
  public final b fAT;

  public w(int paramInt, bre parambre)
  {
    AppMethodBeat.i(16603);
    ab.i("MicroMsg.NetSceneSetMsgRemind", "[NetSceneSetMsgRemind] opType:%s RemindId:%s time:%s Type:%s SubType:%s", new Object[] { Integer.valueOf(paramInt), parambre.wTy, Integer.valueOf(parambre.lvf), Integer.valueOf(parambre.jCt), Integer.valueOf(parambre.wOI) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bxz();
    ((b.a)localObject).fsK = new bya();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/setmsgremind";
    ((b.a)localObject).fsI = 525;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.fAT = ((b.a)localObject).acD();
    localObject = (bxz)this.fAT.fsG.fsP;
    int i = paramInt;
    if (paramInt == 0)
      i = 1;
    ((bxz)localObject).nbk = i;
    ((bxz)localObject).wXC = parambre;
    AppMethodBeat.o(16603);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16604);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(16604);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16605);
    if ((paramInt2 == 0) && (paramInt3 == 0))
      ab.i("MicroMsg.NetSceneSetMsgRemind", "[onGYNetEnd] RemindId:%s", new Object[] { ((bya)this.fAT.fsH.fsP).wTy });
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(16605);
      return;
      ab.e("MicroMsg.NetSceneSetMsgRemind", "[onGYNetEnd] errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    }
  }

  public final int getType()
  {
    return 525;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.w
 * JD-Core Version:    0.6.2
 */
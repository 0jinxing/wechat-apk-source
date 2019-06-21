package com.tencent.mm.plugin.account.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.jg;
import com.tencent.mm.protocal.protobuf.jh;

public final class d extends m
  implements k
{
  public static int gyK = 1;
  public static int gyL = 2;
  private b ehh;
  private f ehi;

  public d(int paramInt, String paramString)
  {
    AppMethodBeat.i(124676);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new jg();
    ((b.a)localObject).fsK = new jh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindemail";
    ((b.a)localObject).fsI = 256;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (jg)this.ehh.fsG.fsP;
    ((jg)localObject).OpCode = paramInt;
    ((jg)localObject).vLe = paramString;
    AppMethodBeat.o(124676);
  }

  public final int Ah()
  {
    return ((jg)this.ehh.fsG.fsP).OpCode;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(124677);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(124677);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(124678);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(124678);
  }

  public final int getType()
  {
    return 256;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.d
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.talkroom.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.yw;
import com.tencent.mm.protocal.protobuf.yx;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  private int sceneType;

  public b(int paramInt1, long paramLong, String paramString, int paramInt2)
  {
    AppMethodBeat.i(25872);
    this.sceneType = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new yw();
    ((b.a)localObject).fsK = new yx();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/exittalkroom";
    ((b.a)localObject).fsI = 333;
    ((b.a)localObject).fsL = 148;
    ((b.a)localObject).fsM = 1000000148;
    this.ehh = ((b.a)localObject).acD();
    localObject = (yw)this.ehh.fsG.fsP;
    ((yw)localObject).wel = paramString;
    ((yw)localObject).wem = paramInt1;
    ((yw)localObject).wen = paramLong;
    ((yw)localObject).Scene = paramInt2;
    AppMethodBeat.o(25872);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(25873);
    ab.d("MicroMsg.NetSceneExitTalkRoom", "doScene %d", new Object[] { Integer.valueOf(this.sceneType) });
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(25873);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25874);
    ab.d("MicroMsg.NetSceneExitTalkRoom", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25874);
    }
    while (true)
    {
      return;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25874);
    }
  }

  public final int getType()
  {
    return 333;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.b.b
 * JD-Core Version:    0.6.2
 */
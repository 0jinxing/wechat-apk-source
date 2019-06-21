package com.tencent.mm.plugin.talkroom.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cgj;
import com.tencent.mm.protocal.protobuf.cgk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class e extends f
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  private final String nNq;
  private int sceneType;

  public e(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(25882);
    this.sceneType = 0;
    this.sceneType = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cgj();
    ((b.a)localObject).fsK = new cgk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/talknoop";
    ((b.a)localObject).fsI = 335;
    ((b.a)localObject).fsL = 149;
    ((b.a)localObject).fsM = 1000000149;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cgj)this.ehh.fsG.fsP;
    ((cgj)localObject).wem = paramInt1;
    ((cgj)localObject).wen = paramLong;
    ((cgj)localObject).vEr = ((int)bo.anT());
    this.nNq = paramString;
    ((cgj)localObject).Scene = paramInt2;
    AppMethodBeat.o(25882);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(25883);
    ab.d("MicroMsg.NetSceneTalkNoop", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(25883);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25884);
    ab.d("MicroMsg.NetSceneTalkNoop", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25884);
    }
    while (true)
    {
      return;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25884);
    }
  }

  public final String cED()
  {
    return this.nNq;
  }

  public final int cEE()
  {
    return this.sceneType;
  }

  public final int getType()
  {
    return 335;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.b.e
 * JD-Core Version:    0.6.2
 */
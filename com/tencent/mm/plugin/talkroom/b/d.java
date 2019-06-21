package com.tencent.mm.plugin.talkroom.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cgh;
import com.tencent.mm.protocal.protobuf.cgi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class d extends f
{
  public int actionType;
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  private final String nNq;
  private int sceneType;
  public int syE;

  public d(int paramInt1, long paramLong, int paramInt2, String paramString, int paramInt3)
  {
    AppMethodBeat.i(25879);
    this.sceneType = 0;
    this.sceneType = paramInt3;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cgh();
    ((b.a)localObject).fsK = new cgi();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/talkmicaction";
    ((b.a)localObject).fsI = 334;
    ((b.a)localObject).fsL = 146;
    ((b.a)localObject).fsM = 1000000146;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cgh)this.ehh.fsG.fsP;
    ((cgh)localObject).wem = paramInt1;
    ((cgh)localObject).wen = paramLong;
    ((cgh)localObject).wkB = paramInt2;
    ((cgh)localObject).vEr = ((int)bo.anT());
    this.actionType = paramInt2;
    this.nNq = paramString;
    ((cgh)localObject).Scene = paramInt3;
    AppMethodBeat.o(25879);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(25880);
    ab.d("MicroMsg.NetSceneTalkMicAction", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(25880);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25881);
    ab.d("MicroMsg.NetSceneTalkMicAction", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25881);
    }
    while (true)
    {
      return;
      this.syE = ((cgi)this.ehh.fsH.fsP).weo;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25881);
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
    return 334;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.b.d
 * JD-Core Version:    0.6.2
 */
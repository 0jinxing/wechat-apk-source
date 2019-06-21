package com.tencent.mm.plugin.location.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.awl;
import com.tencent.mm.protocal.protobuf.awm;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  public String aIm;
  public final com.tencent.mm.ai.b ehh;
  private f ehi;
  public int errCode;
  public int errType;
  private Runnable fPK;
  public String hwA;
  public String nJs;

  public b(String paramString)
  {
    AppMethodBeat.i(113412);
    this.nJs = "";
    b.a locala = new b.a();
    locala.fsJ = new awl();
    locala.fsK = new awm();
    locala.uri = "/cgi-bin/micromsg-bin/jointrackroom";
    locala.fsI = 490;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((awl)this.ehh.fsG.fsP).wAT = paramString;
    ab.d("MicroMsg.NetSceneJoinTrackRoom", "chatNameId:".concat(String.valueOf(paramString)));
    AppMethodBeat.o(113412);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(113413);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(113413);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(113414);
    this.errType = paramInt2;
    this.errCode = paramInt3;
    this.aIm = paramString;
    if (((com.tencent.mm.ai.b)paramq).fsH.fsP != null);
    for (paramq = (awm)((com.tencent.mm.ai.b)paramq).fsH.fsP; ; paramq = null)
    {
      ab.d("MicroMsg.NetSceneJoinTrackRoom", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      if (((paramInt3 == 0) || (paramInt3 >= 1000)) && (paramq != null))
      {
        this.nJs = paramq.weu;
        ab.d("MicroMsg.NetSceneJoinTrackRoom", "get trackRoomid %s", new Object[] { this.nJs });
      }
      if (paramq != null)
        this.hwA = paramq.vKq;
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      if (this.fPK != null)
        this.fPK.run();
      AppMethodBeat.o(113414);
      return;
    }
  }

  public final int getType()
  {
    return 490;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.a.b
 * JD-Core Version:    0.6.2
 */
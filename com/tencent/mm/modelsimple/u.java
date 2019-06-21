package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bkt;
import com.tencent.mm.protocal.protobuf.buf;
import com.tencent.mm.protocal.protobuf.bug;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class u extends m
  implements k
{
  public long cvx;
  public b ehh;
  private f ehi;
  public int errCode;
  public int errType;
  private final long fPJ;
  private Runnable fPK;

  public u(float paramFloat1, float paramFloat2, long paramLong)
  {
    AppMethodBeat.i(78588);
    this.fPJ = 60000L;
    this.cvx = -1L;
    bkt localbkt = new bkt();
    localbkt.vRp = paramFloat1;
    localbkt.vRq = paramFloat2;
    localbkt.wfJ = 1;
    localbkt.wfG = 0;
    a(localbkt, 1, -10000.0F, -10000.0F);
    this.cvx = paramLong;
    AppMethodBeat.o(78588);
  }

  public u(bkt parambkt, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(78590);
    this.fPJ = 60000L;
    this.cvx = -1L;
    a(parambkt, 0, paramFloat1, paramFloat2);
    AppMethodBeat.o(78590);
  }

  public u(buf parambuf)
  {
    AppMethodBeat.i(78589);
    this.fPJ = 60000L;
    this.cvx = -1L;
    b.a locala = new b.a();
    locala.fsJ = parambuf;
    locala.fsK = new bug();
    locala.uri = "/cgi-bin/micromsg-bin/scanstreetview";
    locala.fsI = 424;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(78589);
  }

  private void a(bkt parambkt, int paramInt, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(78591);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new buf();
    ((b.a)localObject).fsK = new bug();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/scanstreetview";
    ((b.a)localObject).fsI = 424;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (buf)this.ehh.fsG.fsP;
    ((buf)localObject).wVW = parambkt;
    ((buf)localObject).Scene = paramInt;
    ((buf)localObject).wVX = paramFloat1;
    ((buf)localObject).wVY = paramFloat2;
    AppMethodBeat.o(78591);
  }

  public static String tu(String paramString)
  {
    AppMethodBeat.i(78595);
    paramString = br.z(paramString, "streetview");
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(78595);
    }
    while (true)
    {
      return paramString;
      paramString = (String)paramString.get(".streetview.link");
      AppMethodBeat.o(78595);
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78592);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78592);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78594);
    ab.d("MicroMsg.NetSceneScanStreetView", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.errType = paramInt2;
    this.errCode = paramInt3;
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    while (true)
    {
      ab.d("MicroMsg.NetSceneScanStreetView", "xml is %s", new Object[] { ajC().vOt });
      if (this.fPK != null)
        this.fPK.run();
      AppMethodBeat.o(78594);
      return;
      ab.e("MicroMsg.NetSceneScanStreetView", "callback null");
    }
  }

  public final void a(m.a parama)
  {
  }

  public final int acn()
  {
    return 10;
  }

  public final bug ajC()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (bug localbug = (bug)this.ehh.fsH.fsP; ; localbug = null)
      return localbug;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(78593);
    if (((buf)((b)paramq).fsG.fsP).wVW == null)
    {
      ab.e("MicroMsg.NetSceneScanStreetView", "req.rImpl.UserPos == null");
      paramq = m.b.ftv;
      AppMethodBeat.o(78593);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(78593);
    }
  }

  public final int getType()
  {
    return 424;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.u
 * JD-Core Version:    0.6.2
 */
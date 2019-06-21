package com.tencent.mm.plugin.appbrand.k;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.csy;
import com.tencent.mm.protocal.protobuf.csz;
import com.tencent.mm.protocal.protobuf.cta;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Locale;

public final class b extends m
  implements k
{
  private f eIc;
  private com.tencent.mm.ai.b fpJ;
  private csz ioc;

  public b()
  {
    AppMethodBeat.i(132309);
    b.a locala = new b.a();
    locala.fsJ = new csy();
    locala.fsK = new csz();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/weappsearchtitle";
    locala.fsI = 1170;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fpJ = locala.acD();
    AppMethodBeat.o(132309);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(132310);
    ab.i("MicroMsg.NetSceneGetWeAppSearchTitle", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.fpJ, this);
    AppMethodBeat.o(132310);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(132311);
    ab.i("MicroMsg.NetSceneGetWeAppSearchTitle", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ioc = ((csz)this.fpJ.fsH.fsP);
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.ioc.xqh == null)
      AppMethodBeat.o(132311);
    while (true)
    {
      return;
      paramString = g.RP().Ry();
      paramString.set(ac.a.xQf, Locale.getDefault().getLanguage());
      paramString.set(ac.a.xQg, this.ioc.xqh.nzz);
      paramString.set(ac.a.xQh, this.ioc.xqh.xqg);
      paramString.set(ac.a.xQi, Long.valueOf(System.currentTimeMillis()));
      AppMethodBeat.o(132311);
    }
  }

  public final int getType()
  {
    return 1170;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.k.b
 * JD-Core Version:    0.6.2
 */
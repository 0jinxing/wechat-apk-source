package com.tencent.mm.modelappbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.ig;
import com.tencent.mm.g.a.ig.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.csw;
import com.tencent.mm.protocal.protobuf.csx;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class r extends com.tencent.mm.plugin.websearch.api.b
  implements k
{
  private f eIc;
  private com.tencent.mm.ai.b fpJ;
  private csx fpM;

  public r(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93740);
    this.Kg = paramString;
    this.gOW = paramInt1;
    this.tZt = paramInt2;
    if (!bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.NetSceneWeAppSuggest", "Constructors: query = %s", new Object[] { paramString });
      Object localObject = new b.a();
      ((b.a)localObject).fsI = 1173;
      ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/weappsearchsuggestion";
      ((b.a)localObject).fsJ = new csw();
      ((b.a)localObject).fsK = new csx();
      this.fpJ = ((b.a)localObject).acD();
      localObject = (csw)this.fpJ.fsG.fsP;
      ((csw)localObject).query = paramString;
      paramString = new ig();
      a.xxA.m(paramString);
      ((csw)localObject).wCu = paramString.cDp.cDq;
      paramString = g.RP().Ry().get(ac.a.xQh, null);
      if ((paramString != null) && ((paramString instanceof String)))
        ((csw)localObject).xqg = ((String)paramString);
      ((csw)localObject).wCy = b.fpD;
      ((csw)localObject).xqb = b.fpE;
      AppMethodBeat.o(93740);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.NetSceneWeAppSuggest", "keyword is unavailable");
      AppMethodBeat.o(93740);
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(93742);
    this.eIc = paramf;
    int i = a(parame, this.fpJ, this);
    AppMethodBeat.o(93742);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93741);
    ab.i("MicroMsg.NetSceneWeAppSuggest", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(93741);
    }
    while (true)
    {
      return;
      this.fpM = ((csx)this.fpJ.fsH.fsP);
      if (this.fpM != null)
        ab.v("MicroMsg.NetSceneWeAppSuggest", "return data\n%s", new Object[] { this.fpM.vOy });
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(93741);
    }
  }

  public final String abH()
  {
    if (this.fpM != null);
    for (String str = this.fpM.vOy; ; str = "")
      return str;
  }

  public final int getType()
  {
    return 1173;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.r
 * JD-Core Version:    0.6.2
 */
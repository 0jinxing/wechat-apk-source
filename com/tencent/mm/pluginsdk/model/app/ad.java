package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aze;
import com.tencent.mm.protocal.protobuf.azf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class ad extends m
  implements k
{
  public b ehh;
  private f ehi;

  public ad(int paramInt, String paramString)
  {
    AppMethodBeat.i(79381);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aze();
    ((b.a)localObject).fsK = new azf();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/getserviceapplist";
    ((b.a)localObject).fsI = 1060;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aze)this.ehh.fsG.fsP;
    ((aze)localObject).offset = paramInt;
    ((aze)localObject).limit = 20;
    ((aze)localObject).lang = paramString;
    g.RQ();
    ((aze)localObject).wCY = String.valueOf(((Integer)g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue());
    AppMethodBeat.o(79381);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(79383);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneGetServiceAppList", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(79383);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79382);
    ab.d("MicroMsg.NetSceneGetServiceAppList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(79382);
  }

  public final int getType()
  {
    return 1060;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ad
 * JD-Core Version:    0.6.2
 */
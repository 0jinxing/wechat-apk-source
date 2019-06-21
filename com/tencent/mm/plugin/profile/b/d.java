package com.tencent.mm.plugin.profile.b;

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
import com.tencent.mm.protocal.protobuf.cfr;
import com.tencent.mm.protocal.protobuf.cfs;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends m
  implements k
{
  public b ehh;
  private f ehi;

  public d(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(14672);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cfr();
    ((b.a)localObject).fsK = new cfs();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/switchbrand";
    ((b.a)localObject).fsI = 1394;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cfr)this.ehh.fsG.fsP;
    ((cfr)localObject).vNb = paramString;
    ((cfr)localObject).xeS = paramBoolean;
    AppMethodBeat.o(14672);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(14674);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneSwitchBrand", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(14674);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(14673);
    ab.d("MicroMsg.brandservice.NetSceneSwitchBrand", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(14673);
  }

  public final cfs cay()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (cfs localcfs = (cfs)this.ehh.fsH.fsP; ; localcfs = null)
      return localcfs;
  }

  public final cfr caz()
  {
    if ((this.ehh != null) && (this.ehh.fsG.fsP != null));
    for (cfr localcfr = (cfr)this.ehh.fsG.fsP; ; localcfr = null)
      return localcfr;
  }

  public final int getType()
  {
    return 1394;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.b.d
 * JD-Core Version:    0.6.2
 */
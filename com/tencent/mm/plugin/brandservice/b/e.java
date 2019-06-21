package com.tencent.mm.plugin.brandservice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.adu;
import com.tencent.mm.protocal.protobuf.adv;
import com.tencent.mm.protocal.protobuf.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class e extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  LinkedList<String> jKy;

  public e()
  {
    AppMethodBeat.i(13836);
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new adu();
    ((b.a)localObject1).fsK = new adv();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/getapplist";
    ((b.a)localObject1).fsI = 387;
    ((b.a)localObject1).fsL = 0;
    ((b.a)localObject1).fsM = 0;
    this.ehh = ((b.a)localObject1).acD();
    this.jKy = new LinkedList();
    adu localadu = (adu)this.ehh.fsG.fsP;
    g.RQ();
    Object localObject2 = g.RP().Ry().get(196610, null);
    if (localObject2 == null);
    for (localObject1 = "null"; ; localObject1 = localObject2.toString())
    {
      ab.i("MicroMsg.BrandService.BrandServiceApplication", "get config, key[%d], value[%s]", new Object[] { Integer.valueOf(196610), localObject1 });
      localadu.wlU = bo.a((Integer)localObject2, 0);
      ab.i("MicroMsg.BrandService.NetSceneGetAppList", "info: request hash code %d", new Object[] { Integer.valueOf(localadu.wlU) });
      AppMethodBeat.o(13836);
      return;
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(13838);
    this.ehi = paramf;
    ab.i("MicroMsg.BrandService.NetSceneGetAppList", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(13838);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13837);
    ab.w("MicroMsg.BrandService.NetSceneGetAppList", "on scene end code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (adv)this.ehh.fsH.fsP;
      ab.i("MicroMsg.BrandService.NetSceneGetAppList", "ok, hash code is %d, count is %d", new Object[] { Integer.valueOf(paramq.wlU), Integer.valueOf(paramq.jBv) });
      com.tencent.mm.plugin.brandservice.b.h(196610, Integer.valueOf(paramq.wlU));
      paramArrayOfByte = paramq.jBw.iterator();
      while (paramArrayOfByte.hasNext())
      {
        paramq = (ah)paramArrayOfByte.next();
        this.jKy.add(paramq.jBB);
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(13837);
  }

  public final int getType()
  {
    return 387;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.e
 * JD-Core Version:    0.6.2
 */
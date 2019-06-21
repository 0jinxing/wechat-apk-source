package com.tencent.mm.plugin.brandservice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ah;
import com.tencent.mm.protocal.protobuf.bxl;
import com.tencent.mm.protocal.protobuf.bxm;
import com.tencent.mm.protocal.protobuf.lk;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  public j(List<lk> paramList)
  {
    AppMethodBeat.i(13852);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bxl();
    ((b.a)localObject).fsK = new bxm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/setapplist";
    ((b.a)localObject).fsI = 386;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bxl)this.ehh.fsG.fsP;
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (lk)localIterator.next();
      ah localah = new ah();
      localah.jBB = paramList.userName;
      localLinkedList.add(localah);
    }
    ((bxl)localObject).jBv = localLinkedList.size();
    ((bxl)localObject).jBw = localLinkedList;
    ab.i("MicroMsg.BrandService.NetSceneSetAppList", "info: upload size %d, toString %s", new Object[] { Integer.valueOf(localLinkedList.size()), localLinkedList.toString() });
    AppMethodBeat.o(13852);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(13854);
    this.ehi = paramf;
    ab.i("MicroMsg.BrandService.NetSceneSetAppList", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(13854);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13853);
    ab.i("MicroMsg.BrandService.NetSceneSetAppList", "on scene end code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bxm)this.ehh.fsH.fsP;
      ab.i("MicroMsg.BrandService.NetSceneSetAppList", "ok, hash code is %d", new Object[] { Integer.valueOf(paramq.wlU) });
      com.tencent.mm.plugin.brandservice.b.h(196610, Integer.valueOf(paramq.wlU));
      com.tencent.mm.plugin.brandservice.b.h(196611, Boolean.FALSE);
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(13853);
      return;
      com.tencent.mm.plugin.brandservice.b.h(196611, Boolean.TRUE);
    }
  }

  public final int getType()
  {
    return 386;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.j
 * JD-Core Version:    0.6.2
 */
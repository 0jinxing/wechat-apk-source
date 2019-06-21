package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.aus;
import com.tencent.mm.protocal.protobuf.awn;
import com.tencent.mm.protocal.protobuf.awo;
import com.tencent.mm.protocal.protobuf.axb;
import com.tencent.mm.protocal.protobuf.axc;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class u extends m
  implements k
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;

  public u(List<axc> paramList)
  {
    AppMethodBeat.i(6625);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new awn();
    ((b.a)localObject).fsK = new awo();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/jslog";
    ((b.a)localObject).fsI = 1803;
    this.ehh = ((b.a)localObject).acD();
    awn localawn = (awn)this.ehh.fsG.fsP;
    localObject = new axb();
    ((axb)localObject).vOz = d.vxj;
    ((axb)localObject).vOA = d.vxi;
    ((axb)localObject).vOB = d.vxl;
    ((axb)localObject).vOC = d.vxm;
    ((axb)localObject).vOD = aa.dor();
    ((axb)localObject).wBk = ((int)(System.currentTimeMillis() / 1000L));
    localawn.vDV = ((axb)localObject);
    localawn.vDW.addAll(paramList);
    AppMethodBeat.o(6625);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(6627);
    this.ehi = paramf;
    ab.d("MicroMsg.NetSceneJsLog", "doScene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6627);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6626);
    ab.i("MicroMsg.NetSceneJsLog", "onGYNetEnd, netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    awo localawo;
    StringBuilder localStringBuilder;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      localawo = (awo)((b)paramq).fsH.fsP;
      ab.i("MicroMsg.NetSceneJsLog", "received InvalidLogList: ");
      localStringBuilder = new StringBuilder("{ ");
      if (!bo.ek(localawo.wAU))
        break label167;
      localStringBuilder.append("{  }");
    }
    while (true)
    {
      localStringBuilder.append(" }");
      ab.i("MicroMsg.NetSceneJsLog", localStringBuilder.toString());
      f.a.cXv();
      f.ea(localawo.wAU);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(6626);
      return;
      label167: paramArrayOfByte = localawo.wAU.iterator();
      while (paramArrayOfByte.hasNext())
      {
        paramq = (aus)paramArrayOfByte.next();
        localStringBuilder.append(String.format(" { logId(%d), interval(%d) },", new Object[] { Integer.valueOf(paramq.wyT), Integer.valueOf(paramq.wyU) }));
      }
    }
  }

  public final int getType()
  {
    return 1803;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.u
 * JD-Core Version:    0.6.2
 */
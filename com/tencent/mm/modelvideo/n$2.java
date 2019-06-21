package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.al.f;
import com.tencent.mm.g.b.a.j;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.plugin.video.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

final class n$2
  implements Runnable
{
  n$2(n paramn, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, long paramLong1, long paramLong2, int paramInt2, int paramInt3, String paramString6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50753);
    com.tencent.mm.plugin.sight.base.a locala = d.WR(this.bSt);
    if (locala == null)
    {
      ab.w("MicroMsg.SubCoreMediaRpt", "get media info is null. %s", new Object[] { this.bSt });
      AppMethodBeat.o(50753);
    }
    while (true)
    {
      return;
      int i = e.cs(this.bSt);
      Object localObject1 = null;
      if (this.fWq != null)
      {
        localObject2 = new StringBuffer();
        localObject1 = this.fWq;
        int j = localObject1.length;
        for (k = 0; k < j; k++)
          ((StringBuffer)localObject2).append(localObject1[k]).append("|");
        localObject1 = ((StringBuffer)localObject2).toString();
      }
      int k = at.gD(ah.getContext());
      f.afy();
      Object localObject2 = com.tencent.mm.al.a.rJ(this.bSt);
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(this.fkv).append(",").append(this.fWr).append(",");
      localStringBuffer.append(this.fWs).append(",").append(this.fWt).append(",");
      localStringBuffer.append(this.fWu).append(",").append(k).append(",");
      localStringBuffer.append((String)localObject2).append(",").append(this.fEG).append(",");
      localStringBuffer.append(this.fWv).append(",").append(i).append(",");
      localStringBuffer.append(locala.eWK).append(",").append(locala.videoBitrate / 1000).append(",");
      localStringBuffer.append(locala.fzS / 1000).append(",").append(locala.eTk).append(",");
      localStringBuffer.append(locala.width).append(",").append(locala.height).append(",");
      localStringBuffer.append((String)localObject1).append(",").append(locala.qwV).append(",");
      localStringBuffer.append(this.fWw).append(",").append(this.fWx).append(",");
      localStringBuffer.append(c.abR(this.fWy));
      ab.i("MicroMsg.SubCoreMediaRpt", "download video rpt %s ", new Object[] { localStringBuffer.toString() });
      new j(localStringBuffer.toString()).ajK();
      AppMethodBeat.o(50753);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.n.2
 * JD-Core Version:    0.6.2
 */
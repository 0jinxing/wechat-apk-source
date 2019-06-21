package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.g.b.a.bc;
import com.tencent.mm.plugin.sight.base.a;
import com.tencent.mm.plugin.video.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class n$1
  implements Runnable
{
  n$1(n paramn, String paramString, com.tencent.mm.i.d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50752);
    n.a locala = (n.a)n.a(this.fWp).remove(this.val$key);
    if (locala == null)
      AppMethodBeat.o(50752);
    while (true)
    {
      return;
      int i = e.cs(locala.fWA);
      a locala1 = com.tencent.mm.plugin.sight.base.d.WR(locala.fWA);
      a locala2;
      int j;
      if (!bo.isNullOrNil(locala.fWz))
      {
        locala2 = com.tencent.mm.plugin.sight.base.d.WR(locala.fWz);
        j = e.cs(locala.fWz);
      }
      while (true)
      {
        if ((locala2 != null) && (locala1 != null))
          break label121;
        ab.w("MicroMsg.SubCoreMediaRpt", "upload video but media info is null. %s", new Object[] { locala.fWA });
        AppMethodBeat.o(50752);
        break;
        j = i;
        locala2 = locala1;
      }
      label121: int k = at.gD(ah.getContext());
      long l1;
      if (this.fWo.field_startTime != 0L)
      {
        l1 = this.fWo.field_startTime;
        if (this.fWo.field_endTime == 0L)
          break label248;
      }
      label248: for (long l2 = this.fWo.field_endTime; ; l2 = bo.anU())
      {
        localObject1 = null;
        if (this.fWo.field_usedSvrIps == null)
          break label263;
        localObject1 = new StringBuffer();
        localObject2 = this.fWo.field_usedSvrIps;
        int m = localObject2.length;
        for (int n = 0; n < m; n++)
          ((StringBuffer)localObject1).append(localObject2[n]).append("|");
        l1 = locala.startTime;
        break;
      }
      Object localObject1 = ((StringBuffer)localObject1).toString();
      label263: Object localObject2 = new StringBuffer();
      ((StringBuffer)localObject2).append(locala.toUser).append(",").append(locala.dqJ).append(",");
      ((StringBuffer)localObject2).append(k).append(",").append(this.fWo.field_fileId).append(",");
      ((StringBuffer)localObject2).append(this.fWo.field_mp4identifymd5).append(",").append(c.abR(locala.fWB)).append(",");
      ((StringBuffer)localObject2).append(l1).append(",").append(l2).append(",");
      ((StringBuffer)localObject2).append(j).append(",").append(locala2.eWK).append(",");
      ((StringBuffer)localObject2).append(locala2.videoBitrate / 1000).append(",").append(locala2.fzS / 1000).append(",");
      ((StringBuffer)localObject2).append(locala2.eTk).append(",").append(locala2.width).append(",");
      ((StringBuffer)localObject2).append(locala2.height).append(",").append(locala.fWC).append(",");
      ((StringBuffer)localObject2).append(i).append(",").append(locala1.eWK).append(",");
      ((StringBuffer)localObject2).append(locala1.videoBitrate / 1000).append(",").append(locala1.fzS / 1000).append(",");
      ((StringBuffer)localObject2).append(locala1.eTk).append(",").append(locala1.width).append(",");
      ((StringBuffer)localObject2).append(locala1.height).append(",").append(locala.fWD).append(",");
      ((StringBuffer)localObject2).append((String)localObject1).append(",").append(locala2.qwV).append(",").append(this.fWo.field_fileUrl);
      ab.i("MicroMsg.SubCoreMediaRpt", "upload video rpt %s", new Object[] { ((StringBuffer)localObject2).toString() });
      new bc(((StringBuffer)localObject2).toString()).ajK();
      n.cD(locala1.videoBitrate, locala.fWD);
      AppMethodBeat.o(50752);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.n.1
 * JD-Core Version:    0.6.2
 */
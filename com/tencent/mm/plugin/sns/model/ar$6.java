package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.Map;

final class ar$6
  implements Runnable
{
  ar$6(ar paramar, ay paramay, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36650);
    Object localObject = af.cnF().YT(this.qNd.cwT);
    ay localay = this.qNd;
    if (localObject != null)
    {
      localObject = ((n)localObject).field_userName;
      localay.qNS = ((String)localObject);
      ab.i("MicroMsg.SnsVideoService", "offer [%b] video task[%s] to queue ", new Object[] { Boolean.valueOf(this.qNe), this.qNd });
      if (!this.qNe)
        break label124;
      this.qNb.qMX.offerFirst(this.qNd);
    }
    while (true)
    {
      this.qNb.qMY.put(this.qNd.fUL, this.qNd);
      AppMethodBeat.o(36650);
      return;
      localObject = "";
      break;
      label124: this.qNb.qMX.offerLast(this.qNd);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ar.6
 * JD-Core Version:    0.6.2
 */
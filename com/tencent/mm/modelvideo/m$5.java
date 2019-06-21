package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.b;
import com.tencent.mm.al.f;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class m$5
  implements Runnable
{
  public m$5(m paramm, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50741);
    synchronized (m.a(this.fWk))
    {
      Object localObject2 = (String)m.b(this.fWk).get(Long.valueOf(this.fWj));
      ab.i("MicroMsg.SightMassSendService", "cancel item, massSendId %d, cdnClientId %s", new Object[] { Long.valueOf(this.fWj), localObject2 });
      if ("done_upload_cdn_client_id".equals(localObject2))
      {
        ab.w("MicroMsg.SightMassSendService", "doing mass send cgi, ignore cancel!");
        AppMethodBeat.o(50741);
        return;
      }
      if (!bo.isNullOrNil((String)localObject2))
      {
        m.b(this.fWk).put(Long.valueOf(this.fWj), "");
        f.afx().rN((String)localObject2);
        this.fWk.e(this.fWj, 0, 0);
      }
      t localt = o.all();
      long l = this.fWj;
      if (localt.fni.delete("videoinfo2", "masssendid= ?", new String[] { String.valueOf(l) }) > 0)
      {
        localObject2 = new com/tencent/mm/modelvideo/t$a$a;
        ((t.a.a)localObject2).<init>("DELETE_".concat(String.valueOf(l)), t.a.b.fXw, t.a.c.fXz, 3, l);
        localt.fry.cF(localObject2);
        localt.fry.doNotify();
      }
      AppMethodBeat.o(50741);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.m.5
 * JD-Core Version:    0.6.2
 */
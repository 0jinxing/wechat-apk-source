package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.o;
import com.tencent.mm.af.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.biz.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.q;
import java.util.LinkedList;

final class f$4
  implements Runnable
{
  f$4(f paramf, q paramq, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void run()
  {
    long l1 = 0L;
    AppMethodBeat.i(14173);
    long l2 = l1;
    long l3;
    if (this.jEl.drC())
    {
      l3 = l1;
      l2 = l1;
    }
    while (true)
    {
      try
      {
        Object localObject = ((a)g.K(a.class)).b(this.jEl.field_msgId, this.jEl.field_content);
        if (localObject == null)
          break label254;
        l3 = l1;
        l2 = l1;
        if (bo.ek(((o)localObject).fjr))
          break label254;
        l3 = l1;
        l2 = l1;
        localObject = (p)((o)localObject).fjr.get(this.gvp);
        l3 = l1;
        l2 = l1;
        if (bo.isNullOrNil(((p)localObject).url))
          break label254;
        l3 = l1;
        l2 = l1;
        localObject = Uri.parse(((p)localObject).url);
        l3 = l1;
        l2 = l1;
        l1 = bo.getLong(((Uri)localObject).getQueryParameter("mid"), 0L);
        l3 = l1;
        l2 = l1;
        i = bo.getInt(((Uri)localObject).getQueryParameter("idx"), 0);
        this.jOh.a(this.jEl.field_talker, l1, i, this.jOk, this.jOl);
        AppMethodBeat.o(14173);
        return;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        ab.w("MicroMsg.BizTimeLineReport", "reportBizTimelineOp exp %s", new Object[] { localUnsupportedOperationException.getMessage() });
        i = 0;
        l1 = l3;
        continue;
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.BizTimeLineReport", "reportBizTimelineOp exp %s", new Object[] { localException.getMessage() });
      }
      int i = 0;
      l1 = l2;
      continue;
      label254: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.f.4
 * JD-Core Version:    0.6.2
 */
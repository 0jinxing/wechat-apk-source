package com.tencent.mm.plugin.brandservice.ui.timeline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.cd.h;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r.a;
import com.tencent.mm.storage.r.b;
import com.tencent.mm.storage.r.c;
import com.tencent.mm.storage.t;
import java.util.List;

final class e$1
  implements r.c
{
  e$1(e parame)
  {
  }

  public final void a(Object paramObject, r.a parama)
  {
    AppMethodBeat.i(14147);
    if (parama != null)
    {
      if ((parama.xId != r.b.xIf) || (parama.jOa == null))
        break label58;
      e.a(this.jNU).add(0, parama.jOa);
    }
    while (true)
    {
      this.jNU.notifyDataSetChanged();
      AppMethodBeat.o(14147);
      return;
      label58: if (parama.xId == r.b.xIg)
      {
        parama = this.jNU;
        paramObject = parama.aWp();
        if (paramObject != null)
        {
          parama.iKa.clear();
          List localList = parama.iKa;
          parama = z.aeY();
          long l = paramObject.field_createTime;
          localList.addAll(t.p(parama.fni.query("BizTimeLineSingleMsgInfo", null, "createTime>=?", new String[] { String.valueOf(l) }, null, null, "createTime DESC")));
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.e.1
 * JD-Core Version:    0.6.2
 */
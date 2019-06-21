package com.tencent.mm.plugin.brandservice.ui.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.cd.h;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class c$1
  implements Runnable
{
  c$1(q paramq)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14450);
    if ((c.aEd().containsKey(Long.valueOf(this.jEl.field_msgId))) && (!c.sH(((Integer)c.aEd().get(Long.valueOf(this.jEl.field_msgId))).intValue())))
      AppMethodBeat.o(14450);
    while (true)
    {
      return;
      List localList1 = z.aeX().ah(5, this.jEl.field_orderFlag);
      Object localObject = z.aeX();
      long l = this.jEl.field_orderFlag;
      List localList2 = r.p(((r)localObject).fni.query("BizTimeLineInfo", null, "orderFlag>?", new String[] { String.valueOf(l) }, null, null, "orderFlag DESC limit 5"));
      localObject = new LinkedList();
      ((List)localObject).addAll(localList1);
      ((List)localObject).add(this.jEl);
      ((List)localObject).addAll(localList2);
      c.bc((List)localObject);
      AppMethodBeat.o(14450);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.b.c.1
 * JD-Core Version:    0.6.2
 */
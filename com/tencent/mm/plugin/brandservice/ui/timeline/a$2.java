package com.tencent.mm.plugin.brandservice.ui.timeline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r;
import java.util.Collection;
import java.util.List;

final class a$2
  implements Runnable
{
  a$2(a parama, int paramInt)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(14099);
    if ((this.gvp == this.jNG.getCount() - 1) && (!this.jNG.jNE))
    {
      ab.i("MicroMsg.BizTimeLineAdapter", "loadMoreData %d/%d", new Object[] { Integer.valueOf(this.gvp), Integer.valueOf(this.jNG.getCount()) });
      a locala = this.jNG;
      Object localObject = locala.aWp();
      int j = i;
      if (localObject != null)
      {
        localObject = z.aeX().ah(10, ((q)localObject).field_orderFlag);
        com.tencent.mm.plugin.brandservice.ui.b.c.aX((List)localObject);
        locala.iKa.addAll((Collection)localObject);
        locala.notifyDataSetChanged();
        j = i;
        if (((List)localObject).size() > 0)
          j = 1;
      }
      if (j == 0)
      {
        this.jNG.jNE = true;
        a.a(this.jNG).aWB();
        AppMethodBeat.o(14099);
      }
    }
    while (true)
    {
      return;
      this.jNG.jNp.KB();
      AppMethodBeat.o(14099);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.2
 * JD-Core Version:    0.6.2
 */
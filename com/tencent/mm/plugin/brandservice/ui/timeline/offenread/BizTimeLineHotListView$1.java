package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bfe;
import java.util.HashMap;
import java.util.List;

final class BizTimeLineHotListView$1
  implements Runnable
{
  BizTimeLineHotListView$1(BizTimeLineHotListView paramBizTimeLineHotListView, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14280);
    int i = this.jQi.getCurrentPage();
    int j = f.rb(i);
    int k = f.rc(i);
    int m = j;
    if (i == 0)
      m = j + 1;
    if ((m <= k) && (m < this.jQh.size()))
    {
      b localb = (b)this.jQh.get(m);
      e locale;
      bfe localbfe;
      if (localb != null)
      {
        locale = BizTimeLineHotListView.a(this.jQi);
        if (localb != null)
        {
          localbfe = (bfe)locale.jQB.get(localb.vGE);
          if (localbfe != null)
            break label207;
          localbfe = new bfe();
          localbfe.vNN = localb.vGE;
          if (!localb.jQz)
            break label202;
        }
      }
      label202: for (j = 1; ; j = 0)
      {
        localbfe.wIV = j;
        localbfe.wIW = ((int)(System.currentTimeMillis() / 1000L));
        localbfe.mXP = (localb.position - 1);
        localbfe.kaG = 1;
        locale.jQB.put(localb.vGE, localbfe);
        m++;
        break;
      }
      label207: if (localb.jQz);
      for (j = 1; ; j = 0)
      {
        localbfe.wIV = j;
        localbfe.wIW = ((int)(System.currentTimeMillis() / 1000L));
        localbfe.mXP = (localb.position - 1);
        localbfe.kaG += 1;
        break;
      }
    }
    AppMethodBeat.o(14280);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView.1
 * JD-Core Version:    0.6.2
 */
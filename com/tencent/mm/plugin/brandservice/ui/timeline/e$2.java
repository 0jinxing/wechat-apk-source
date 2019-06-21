package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.t;
import java.util.Collection;
import java.util.List;

final class e$2
  implements Runnable
{
  e$2(e parame, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14148);
    Object localObject1;
    if ((this.gvp == this.jNU.getCount() - 1) && (!this.jNU.jNE))
    {
      ab.i("MicroMsg.BizTimeLineAdapter", "loadMoreData %d/%d", new Object[] { Integer.valueOf(this.gvp), Integer.valueOf(this.jNU.getCount()) });
      localObject1 = this.jNU;
      q localq = ((e)localObject1).aWp();
      if (localq == null)
        break label206;
      Object localObject2 = z.aeY();
      long l = localq.field_createTime;
      localObject2 = t.p(((t)localObject2).fni.query("BizTimeLineSingleMsgInfo", null, "createTime<?", new String[] { String.valueOf(l) }, null, null, "createTime DESC limit 20"));
      ((e)localObject1).iKa.addAll((Collection)localObject2);
      ((e)localObject1).notifyDataSetChanged();
      if (((List)localObject2).size() <= 0)
        break label206;
    }
    label206: for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        this.jNU.jNE = true;
        localObject1 = e.b(this.jNU);
        if (((BizTimeLineNewMsgUI)localObject1).jNV != null)
        {
          ((BizTimeLineNewMsgUI)localObject1).jNW.setVisibility(8);
          ((BizTimeLineNewMsgUI)localObject1).jNX.setText(((BizTimeLineNewMsgUI)localObject1).getString(2131297676));
        }
      }
      AppMethodBeat.o(14148);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.e.2
 * JD-Core Version:    0.6.2
 */
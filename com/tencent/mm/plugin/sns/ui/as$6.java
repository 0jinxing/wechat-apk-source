package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.protocal.protobuf.TimeLineObject;

final class as$6
  implements View.OnClickListener
{
  as$6(as paramas)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39206);
    if ((paramView.getTag() instanceof TimeLineObject))
    {
      paramView = (TimeLineObject)paramView.getTag();
      if (as.ZH(paramView.Id))
        break label108;
      h.pYm.X(10090, "1,0");
      if ((!com.tencent.mm.r.a.bJ(as.a(this.rvF))) && (!com.tencent.mm.r.a.bH(as.a(this.rvF))))
      {
        paramView = g.a(af.getAccPath(), paramView, 8);
        paramView.fKm = as.b(this.rvF);
        com.tencent.mm.aw.a.b(paramView);
      }
    }
    while (true)
    {
      this.rvF.notifyDataSetChanged();
      AppMethodBeat.o(39206);
      return;
      label108: h.pYm.X(10231, "1");
      com.tencent.mm.aw.a.aic();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.as.6
 * JD-Core Version:    0.6.2
 */
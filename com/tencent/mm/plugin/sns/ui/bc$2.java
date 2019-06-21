package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.g;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class bc$2
  implements View.OnClickListener
{
  bc$2(bc parambc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39863);
    boolean bool = paramView.getTag() instanceof q;
    ab.d("MicroMsg.TimeLineClickEvent", "musicRedirectListener click ".concat(String.valueOf(bool)));
    if (!bool)
    {
      AppMethodBeat.o(39863);
      return;
    }
    q localq = (q)paramView.getTag();
    TimeLineObject localTimeLineObject = localq.rin;
    label147: String str;
    if (!bc.Wi(localTimeLineObject.Id))
      if ((!com.tencent.mm.r.a.bJ(this.rDG.context)) && (!com.tencent.mm.r.a.bH(this.rDG.context)))
      {
        h.pYm.X(10090, "1,0");
        if (localTimeLineObject.xfI.wbK.size() > 0)
        {
          bau localbau = (bau)localTimeLineObject.xfI.wbK.get(0);
          if (this.rDG.cvd != 0)
            break label262;
          paramView = b.lY(738);
          b localb = paramView.tx(localTimeLineObject.Id).tx(localTimeLineObject.jBB);
          if (localTimeLineObject.xfH != null)
            break label272;
          str = "";
          label178: localb.tx(str).tx(localbau.Title).tx(localbau.Desc).tx("");
          paramView.ajK();
        }
        if (!localq.rio)
          break label285;
        com.tencent.mm.aw.a.a(g.a(af.getAccPath(), localTimeLineObject, 9));
      }
    while (true)
    {
      if (this.rDG.rDr != null)
        this.rDG.rDr.ctb();
      AppMethodBeat.o(39863);
      break;
      label262: paramView = b.lZ(738);
      break label147;
      label272: str = localTimeLineObject.xfH.Id;
      break label178;
      label285: com.tencent.mm.aw.a.b(g.a(af.getAccPath(), localTimeLineObject, 1));
      continue;
      h.pYm.X(10231, "1");
      com.tencent.mm.aw.a.aic();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.2
 * JD-Core Version:    0.6.2
 */
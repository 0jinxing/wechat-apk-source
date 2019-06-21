package com.tencent.mm.plugin.topstory.ui.home;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.protocal.protobuf.cht;

final class b$11
  implements View.OnClickListener
{
  b$11(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1589);
    if (this.sCf.sBY)
      AppMethodBeat.o(1589);
    while (true)
    {
      return;
      this.sCf.sBY = true;
      this.sCf.fR(36, 3);
      com.tencent.mm.plugin.report.e.pXa.e(15449, new Object[] { Integer.valueOf(0) });
      if (this.sCf.sBP.getVisibility() == 0)
      {
        this.sCf.sBP.setVisibility(8);
        paramView = new cht();
        paramView.cJb = ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cFe();
        paramView.xgz = ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cFf();
        an.a(paramView, 106, 5, 0, System.currentTimeMillis() / 1000L, "");
        ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cFh();
      }
      AppMethodBeat.o(1589);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.11
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizTimeLineNewMsgUI$6
  implements View.OnClickListener
{
  BizTimeLineNewMsgUI$6(BizTimeLineNewMsgUI paramBizTimeLineNewMsgUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14161);
    BizTimeLineNewMsgUI.f(this.jOc).setOnClickListener(null);
    BizTimeLineNewMsgUI.a(this.jOc).jNT = true;
    BizTimeLineNewMsgUI.a(this.jOc).sh(BizTimeLineNewMsgUI.a(this.jOc).getCount() - 1);
    BizTimeLineNewMsgUI.g(this.jOc).setVisibility(0);
    BizTimeLineNewMsgUI.h(this.jOc).setText(this.jOc.getString(2131297669));
    BizTimeLineNewMsgUI.f(this.jOc).setBackgroundColor(this.jOc.getResources().getColor(2131689753));
    BizTimeLineNewMsgUI.i(this.jOc).setVisibility(8);
    AppMethodBeat.o(14161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI.6
 * JD-Core Version:    0.6.2
 */
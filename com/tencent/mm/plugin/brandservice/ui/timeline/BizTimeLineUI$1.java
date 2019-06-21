package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BizTimeLineUI$1
  implements View.OnClickListener
{
  BizTimeLineUI$1(BizTimeLineUI paramBizTimeLineUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14183);
    paramView = new Intent(this.jOK.mController.ylL, BizTimeLineNewMsgUI.class);
    paramView.putExtra("biz_time_line_line_enter_scene", 1);
    this.jOK.startActivity(paramView);
    AppMethodBeat.o(14183);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI.1
 * JD-Core Version:    0.6.2
 */
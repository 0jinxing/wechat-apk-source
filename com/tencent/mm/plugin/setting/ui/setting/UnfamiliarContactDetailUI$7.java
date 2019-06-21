package com.tencent.mm.plugin.setting.ui.setting;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class UnfamiliarContactDetailUI$7
  implements View.OnClickListener
{
  UnfamiliarContactDetailUI$7(UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127641);
    h.a(this.qpX.mController.ylL, true, this.qpX.mController.ylL.getString(2131304153), this.qpX.mController.ylL.getString(2131298502), this.qpX.mController.ylL.getString(2131296881), this.qpX.mController.ylL.getString(2131296868), new UnfamiliarContactDetailUI.7.1(this), null, 2131689665, 0);
    AppMethodBeat.o(127641);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.7
 * JD-Core Version:    0.6.2
 */
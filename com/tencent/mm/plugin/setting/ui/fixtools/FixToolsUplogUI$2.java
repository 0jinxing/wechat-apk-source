package com.tencent.mm.plugin.setting.ui.fixtools;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.q;

final class FixToolsUplogUI$2
  implements View.OnClickListener
{
  FixToolsUplogUI$2(FixToolsUplogUI paramFixToolsUplogUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(126895);
    h.pYm.a(873L, 16L, 1L, false);
    paramView = new Intent(this.qkt.mController.ylL, FixToolsUpLogUploadingUI.class);
    paramView.putExtra("date", FixToolsUplogUI.access$100());
    MMWizardActivity.J(this.qkt, paramView);
    AppMethodBeat.o(126895);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.2
 * JD-Core Version:    0.6.2
 */
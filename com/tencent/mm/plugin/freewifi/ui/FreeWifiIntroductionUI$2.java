package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.z;

final class FreeWifiIntroductionUI$2
  implements View.OnClickListener
{
  FreeWifiIntroductionUI$2(FreeWifiIntroductionUI paramFreeWifiIntroductionUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20999);
    aw.ZK();
    c.Ry().set(303104, Integer.valueOf(1));
    paramView = this.mzw.getIntent();
    paramView.setClass(this.mzw, FreeWifiEntryUI.class);
    this.mzw.startActivity(paramView);
    this.mzw.finish();
    AppMethodBeat.o(20999);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiIntroductionUI.2
 * JD-Core Version:    0.6.2
 */
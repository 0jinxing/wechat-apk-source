package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SettingsPersonalInfoUI$2
  implements View.OnClickListener
{
  SettingsPersonalInfoUI$2(SettingsPersonalInfoUI paramSettingsPersonalInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127366);
    paramView = new Intent(this.qoh, PreviewHdHeadImg.class);
    this.qoh.mController.ylL.startActivity(paramView);
    AppMethodBeat.o(127366);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI.2
 * JD-Core Version:    0.6.2
 */
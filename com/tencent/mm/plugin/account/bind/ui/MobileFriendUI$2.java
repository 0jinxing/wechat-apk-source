package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.q;

final class MobileFriendUI$2
  implements View.OnClickListener
{
  MobileFriendUI$2(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13720);
    paramView = new Intent(this.gtZ.mController.ylL, BindMContactIntroUI.class);
    paramView.putExtra("key_upload_scene", 6);
    MMWizardActivity.J(this.gtZ, paramView);
    AppMethodBeat.o(13720);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.2
 * JD-Core Version:    0.6.2
 */
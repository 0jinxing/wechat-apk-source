package com.tencent.mm.plugin.subapp.ui.friend;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.bind.ui.MobileFriendUI;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.q;

final class FMessageConversationUI$3
  implements View.OnClickListener
{
  FMessageConversationUI$3(FMessageConversationUI paramFMessageConversationUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25360);
    if (l.apS() != l.a.gvz)
    {
      paramView = new Intent(this.stR.mController.ylL, BindMContactIntroUI.class);
      paramView.putExtra("key_upload_scene", 5);
      MMWizardActivity.J(this.stR.mController.ylL, paramView);
      AppMethodBeat.o(25360);
    }
    while (true)
    {
      return;
      this.stR.startActivity(new Intent(this.stR.mController.ylL, MobileFriendUI.class));
      AppMethodBeat.o(25360);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI.3
 * JD-Core Version:    0.6.2
 */
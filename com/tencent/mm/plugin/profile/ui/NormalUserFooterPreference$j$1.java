package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.ui.MMActivity;

final class NormalUserFooterPreference$j$1
  implements View.OnClickListener
{
  NormalUserFooterPreference$j$1(NormalUserFooterPreference.j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23725);
    NormalUserFooterPreference.b(this.ppd.poR).getIntent().removeExtra("Accept_NewFriend_FromOutside");
    paramView = new Intent(NormalUserFooterPreference.b(this.ppd.poR), SayHiWithSnsPermissionUI.class);
    paramView.putExtra("Contact_User", NormalUserFooterPreference.a(this.ppd.poR).field_username);
    paramView.putExtra("Contact_Nick", NormalUserFooterPreference.a(this.ppd.poR).field_nickname);
    paramView.putExtra("Contact_RemarkName", NormalUserFooterPreference.a(this.ppd.poR).field_conRemark);
    if ((NormalUserFooterPreference.l(this.ppd.poR) == 14) || (NormalUserFooterPreference.l(this.ppd.poR) == 8))
      paramView.putExtra("Contact_RoomNickname", NormalUserFooterPreference.b(this.ppd.poR).getIntent().getStringExtra("Contact_RoomNickname"));
    paramView.putExtra("Contact_Scene", NormalUserFooterPreference.l(this.ppd.poR));
    paramView.putExtra("Verify_ticket", NormalUserFooterPreference.y(this.ppd.poR));
    paramView.putExtra("sayhi_with_sns_perm_send_verify", false);
    paramView.putExtra("sayhi_with_sns_perm_add_remark", true);
    paramView.putExtra("sayhi_with_sns_perm_set_label", true);
    NormalUserFooterPreference.b(this.ppd.poR).startActivityForResult(paramView, 0);
    AppMethodBeat.o(23725);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.j.1
 * JD-Core Version:    0.6.2
 */
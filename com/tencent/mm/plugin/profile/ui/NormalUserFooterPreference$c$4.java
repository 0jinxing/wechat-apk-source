package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.ui.applet.a.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.b;

final class NormalUserFooterPreference$c$4
  implements a.b
{
  NormalUserFooterPreference$c$4(NormalUserFooterPreference.c paramc, String paramString1, String paramString2)
  {
  }

  public final boolean vQ(String paramString)
  {
    AppMethodBeat.i(23702);
    String str = NormalUserFooterPreference.b(this.ppa.poR).getIntent().getStringExtra("room_name");
    Intent localIntent = new Intent(NormalUserFooterPreference.b(this.ppa.poR), SayHiWithSnsPermissionUI.class);
    localIntent.putExtra("Contact_User", NormalUserFooterPreference.a(this.ppa.poR).field_username);
    localIntent.putExtra("Contact_Nick", NormalUserFooterPreference.a(this.ppa.poR).field_nickname);
    localIntent.putExtra("Contact_RemarkName", NormalUserFooterPreference.a(this.ppa.poR).field_conRemark);
    if ((NormalUserFooterPreference.l(this.ppa.poR) == 14) || (NormalUserFooterPreference.l(this.ppa.poR) == 8))
      localIntent.putExtra("Contact_RoomNickname", NormalUserFooterPreference.b(this.ppa.poR).getIntent().getStringExtra("Contact_RoomNickname"));
    localIntent.putExtra("Contact_Scene", NormalUserFooterPreference.l(this.ppa.poR));
    localIntent.putExtra("room_name", str);
    localIntent.putExtra("source_from_user_name", this.pkr);
    localIntent.putExtra("source_from_nick_name", this.pks);
    localIntent.putExtra("sayhi_with_sns_perm_send_verify", true);
    localIntent.putExtra("sayhi_with_sns_perm_add_remark", true);
    localIntent.putExtra("sayhi_with_sns_perm_set_label", false);
    localIntent.putExtra(e.b.yfT, paramString);
    NormalUserFooterPreference.b(this.ppa.poR).startActivityForResult(localIntent, 0);
    AppMethodBeat.o(23702);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.c.4
 * JD-Core Version:    0.6.2
 */
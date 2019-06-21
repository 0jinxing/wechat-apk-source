package com.tencent.mm.plugin.profile;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI;
import com.tencent.mm.pluginsdk.ui.applet.a.b;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.b;

final class a$13
  implements a.b
{
  a$13(a parama, MMActivity paramMMActivity, ad paramad, int paramInt, String paramString1, String paramString2)
  {
  }

  public final boolean vQ(String paramString)
  {
    AppMethodBeat.i(23218);
    String str = this.cgq.getIntent().getStringExtra("room_name");
    Intent localIntent = new Intent(this.cgq, SayHiWithSnsPermissionUI.class);
    localIntent.putExtra("Contact_User", this.emj.field_username);
    localIntent.putExtra("Contact_Nick", this.emj.field_nickname);
    localIntent.putExtra("Contact_RemarkName", this.emj.field_conRemark);
    if ((this.pkq == 14) || (this.pkq == 8))
      localIntent.putExtra("Contact_RoomNickname", this.cgq.getIntent().getStringExtra("Contact_RoomNickname"));
    localIntent.putExtra("Contact_Scene", this.pkq);
    localIntent.putExtra("room_name", str);
    localIntent.putExtra("source_from_user_name", this.pkr);
    localIntent.putExtra("source_from_nick_name", this.pks);
    localIntent.putExtra("sayhi_with_sns_perm_send_verify", true);
    localIntent.putExtra("sayhi_with_sns_perm_add_remark", true);
    localIntent.putExtra("sayhi_with_sns_perm_set_label", false);
    localIntent.putExtra(e.b.yfT, paramString);
    this.cgq.startActivity(localIntent);
    AppMethodBeat.o(23218);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.13
 * JD-Core Version:    0.6.2
 */
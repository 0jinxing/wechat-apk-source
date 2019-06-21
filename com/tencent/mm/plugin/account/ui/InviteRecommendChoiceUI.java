package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class InviteRecommendChoiceUI extends MMPreference
{
  private f ehK;

  public final int JC()
  {
    return 2131165245;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(124903);
    paramf = paramPreference.mKey;
    if (paramf.equals("settings_invite_qq_friends"))
    {
      paramf = new Intent(this, RecommendFriendUI.class);
      paramf.putExtra("recommend_type", Integer.toString(0));
      startActivity(paramf);
    }
    while (true)
    {
      AppMethodBeat.o(124903);
      return false;
      if (paramf.equals("settings_recommend_by_mail"))
      {
        paramf = new Intent(this, RecommendFriendUI.class);
        paramf.putExtra("recommend_type", Integer.toString(2));
        startActivity(paramf);
      }
      else if (paramf.equals("settings_recommend_by_mb"))
      {
        paramf = new Intent(this, RecommendFriendUI.class);
        paramf.putExtra("recommend_type", Integer.toString(1));
        startActivity(paramf);
      }
      else if (paramf.equals("settings_invite_mobile_friends"))
      {
        paramf = new Intent("android.intent.action.VIEW");
        paramf.putExtra("sms_body", getString(2131300655, new Object[] { g.RP().Ry().get(2, null) }));
        paramf.setType("vnd.android-dir/mms-sms");
        if (bo.k(this, paramf))
          startActivity(paramf);
        else
          Toast.makeText(this, 2131302910, 1).show();
      }
      else if (paramf.equals("settings_invite_facebook_friends"))
      {
        startActivity(new Intent(this, InviteFacebookFriendsUI.class));
      }
    }
  }

  public final boolean aqT()
  {
    return false;
  }

  public final void initView()
  {
    AppMethodBeat.i(124904);
    setMMTitle(2131302941);
    this.ehK = this.yCw;
    IconPreference localIconPreference = (IconPreference)this.ehK.aqO("settings_invite_facebook_friends");
    b.ahN();
    this.ehK.d(localIconPreference);
    localIconPreference = (IconPreference)this.ehK.aqO("settings_invite_qq_friends");
    if (r.Yy() == 0)
      this.ehK.d(localIconPreference);
    localIconPreference = (IconPreference)this.ehK.aqO("settings_recommend_by_mail");
    if (r.Yy() == 0)
      this.ehK.d(localIconPreference);
    localIconPreference = (IconPreference)this.ehK.aqO("settings_recommend_by_mb");
    if (((j)g.K(j.class)).XU().RA("@t.qq.com") == null)
      this.ehK.d(localIconPreference);
    setBackBtn(new InviteRecommendChoiceUI.1(this));
    AppMethodBeat.o(124904);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124902);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(124902);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteRecommendChoiceUI
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI;
import com.tencent.mm.plugin.account.bind.ui.MobileFriendUI;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class AddMoreFriendsByOtherWayUI extends MMPreference
{
  private f ehK;

  public final int JC()
  {
    return 2131165186;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    int i = 0;
    AppMethodBeat.i(25501);
    ab.d("MicroMsg.AddMoreFriendsByOthersUI", "click %s", new Object[] { paramPreference.mKey });
    boolean bool;
    if ("find_friends_by_mobile".equals(paramPreference.mKey))
      if (l.apS() != l.a.gvz)
      {
        paramf = new Intent(this, BindMContactIntroUI.class);
        paramf.putExtra("key_upload_scene", 6);
        MMWizardActivity.J(this, paramf);
        AppMethodBeat.o(25501);
        bool = true;
      }
    while (true)
    {
      return bool;
      startActivity(new Intent(this, MobileFriendUI.class));
      AppMethodBeat.o(25501);
      bool = true;
      continue;
      if ("find_friends_by_google_account".equals(paramPreference.mKey))
      {
        if (TextUtils.isEmpty((String)g.RP().Ry().get(208903, null)));
        while (true)
        {
          if (i != 0)
            break label188;
          paramf = new Intent(this, BindGoogleContactUI.class);
          paramf.putExtra("enter_scene", 1);
          MMWizardActivity.J(this, paramf);
          AppMethodBeat.o(25501);
          bool = true;
          break;
          i = 1;
        }
        label188: paramf = new Intent(this, GoogleFriendUI.class);
        paramf.putExtra("enter_scene", 1);
        startActivity(paramf);
        AppMethodBeat.o(25501);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(25501);
        bool = false;
      }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final void initView()
  {
    AppMethodBeat.i(25502);
    setMMTitle(2131296410);
    this.ehK = this.yCw;
    setBackBtn(new AddMoreFriendsByOtherWayUI.1(this));
    AppMethodBeat.o(25502);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25499);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(25499);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(25503);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(25503);
    return bool;
  }

  public void onResume()
  {
    AppMethodBeat.i(25500);
    super.onResume();
    if ((IconPreference)this.ehK.aqO("find_friends_by_google_account") != null)
      if ((r.YK() & 0x800000) != 0)
        break label77;
    label77: for (int i = 1; ; i = 0)
    {
      if ((i == 0) || (!bo.gT(this)))
        this.ehK.aqP("find_friends_by_google_account");
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(25500);
      return;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsByOtherWayUI
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.bind.ui.MobileFriendUI;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.m;
import com.tencent.mm.r.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceInfoCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;
import java.util.Map;

public class AddMoreFriendsUI extends MMPreference
{
  private f ehK;
  private final int svd = 4;
  private final int sve = 9;

  public final int JC()
  {
    return 2131165185;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(25512);
    boolean bool;
    if ("find_friends_by_qrcode".equals(paramPreference.mKey))
    {
      paramf = new Intent();
      paramf.putExtra("BaseScanUI_select_scan_mode", 1);
      paramf.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
      paramf.setFlags(65536);
      h.pYm.e(11265, new Object[] { Integer.valueOf(1) });
      if ((!a.bI(this)) && (!com.tencent.mm.bg.e.akI()))
        com.tencent.mm.bp.d.b(this, "scanner", ".ui.BaseScanUI", paramf);
      AppMethodBeat.o(25512);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ("find_friends_by_other_way".equals(paramPreference.mKey))
      {
        if (l.apS() != l.a.gvz)
        {
          paramf = new Intent(this, BindMContactIntroUI.class);
          paramf.putExtra("key_upload_scene", 6);
          MMWizardActivity.J(this, paramf);
          AppMethodBeat.o(25512);
          bool = true;
        }
        else
        {
          startActivity(new Intent(this, MobileFriendUI.class));
          AppMethodBeat.o(25512);
          bool = true;
        }
      }
      else
      {
        if ("find_friends_by_web".equals(paramPreference.mKey))
        {
          if (aa.HU(0))
          {
            ((m)com.tencent.mm.kernel.g.K(m.class)).a(ah.getContext(), new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(25504);
                Intent localIntent = aa.cVd();
                localIntent.putExtra("KRightBtn", true);
                localIntent.putExtra("ftsneedkeyboard", true);
                localIntent.putExtra("key_load_js_without_delay", true);
                localIntent.putExtra("ftsType", 1);
                localIntent.putExtra("ftsbizscene", 9);
                Map localMap = aa.d(9, true, 0);
                Object localObject = aa.HP(bo.ank((String)localMap.get("scene")));
                localMap.put("sessionId", localObject);
                localMap.put("subSessionId", localObject);
                localIntent.putExtra("sessionId", (String)localObject);
                localIntent.putExtra("subSessionId", (String)localObject);
                localIntent.putExtra("rawUrl", aa.E(localMap));
                localObject = null;
                if (Build.VERSION.SDK_INT >= 21)
                  localObject = ActivityOptions.makeSceneTransitionAnimation(AddMoreFriendsUI.this, new Pair[0]).toBundle();
                com.tencent.mm.bp.d.a(AddMoreFriendsUI.this, "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", localIntent, (Bundle)localObject);
                AppMethodBeat.o(25504);
              }
            });
            paramPreference.setEnabled(false);
          }
          while (true)
          {
            AppMethodBeat.o(25512);
            bool = true;
            break;
            ab.e("MicroMsg.AddMoreFriendsUI", "fts h5 template not avail");
          }
        }
        if ("find_friends_by_radar".equals(paramPreference.mKey))
        {
          com.tencent.mm.bp.d.H(this, "radar", ".ui.RadarSearchUI");
          AppMethodBeat.o(25512);
          bool = true;
        }
        else if ("find_friends_create_pwdgroup".equals(paramPreference.mKey))
        {
          h.pYm.e(11140, new Object[] { Integer.valueOf(1) });
          com.tencent.mm.bp.d.H(this, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
          AppMethodBeat.o(25512);
          bool = true;
        }
        else if ("find_friends_by_invite".equals(paramPreference.mKey))
        {
          int i = getIntent().getIntExtra("invite_friend_scene", 4);
          h.pYm.e(14034, new Object[] { Integer.valueOf(i) });
          paramf = new Intent(this, InviteFriendsBy3rdUI.class);
          paramf.putExtra("Invite_friends", i);
          startActivity(paramf);
          AppMethodBeat.o(25512);
          bool = true;
        }
        else if ("find_friends_by_ww".equals(paramPreference.mKey))
        {
          paramPreference = new Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
          paramf = null;
          if (Build.VERSION.SDK_INT >= 21)
            paramf = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
          com.tencent.mm.plugin.fts.a.d.b(this.mController.ylL, ".ui.FTSAddWw", paramPreference, paramf);
          AppMethodBeat.o(25512);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(25512);
          bool = false;
        }
      }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final void initView()
  {
    AppMethodBeat.i(25513);
    setMMTitle(2131296410);
    this.ehK = this.yCw;
    AddFriendItemPreference localAddFriendItemPreference = new AddFriendItemPreference(this.mController.ylL);
    localAddFriendItemPreference.setKey("find_friends_by_invite");
    localAddFriendItemPreference.setTitle(2131299805);
    localAddFriendItemPreference.fa();
    localAddFriendItemPreference.setSummary(2131299806);
    if ((bo.getInt(com.tencent.mm.m.g.Nu().getValue("InviteFriendsControlFlags"), 0) & 0x4) > 0)
      this.ehK.a(localAddFriendItemPreference, 4);
    dyb();
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(25505);
        AddMoreFriendsUI.this.finish();
        AppMethodBeat.o(25505);
        return true;
      }
    });
    AppMethodBeat.o(25513);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25508);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(25508);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(25511);
    super.onDestroy();
    AppMethodBeat.o(25511);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(25514);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(25514);
    return bool;
  }

  public void onPause()
  {
    AppMethodBeat.i(25510);
    super.onPause();
    AppMethodBeat.o(25510);
  }

  public void onResume()
  {
    AppMethodBeat.i(25509);
    super.onResume();
    Object localObject;
    PreferenceInfoCategory localPreferenceInfoCategory;
    String str1;
    if (!com.tencent.mm.bp.d.afj("brandservice"))
    {
      this.ehK.ce("find_friends_by_web", true);
      this.ehK.notifyDataSetChanged();
      localObject = (AddFriendSearchPreference)this.ehK.aqO("find_friends_by_input");
      ((AddFriendSearchPreference)localObject).suV = getString(2131298757);
      ((AddFriendSearchPreference)localObject).suX = new AddMoreFriendsUI.3(this);
      localPreferenceInfoCategory = (PreferenceInfoCategory)this.ehK.aqO("find_friends_info");
      str1 = r.Yz();
      String str2 = r.YA();
      aw.ZK();
      localObject = av.amN((String)com.tencent.mm.model.c.Ry().get(6, null));
      if (bo.isNullOrNil(str2))
        break label245;
      localObject = getString(2131299821, new Object[] { str2 });
    }
    while (true)
    {
      localPreferenceInfoCategory.setTitle((CharSequence)localObject);
      localObject = new AddMoreFriendsUI.4(this);
      localPreferenceInfoCategory.yDo = ((View.OnClickListener)localObject);
      localPreferenceInfoCategory.yDp = ((View.OnClickListener)localObject);
      ((AddFriendItemPreference)this.ehK.aqO("find_friends_create_pwdgroup")).qlf = 8;
      com.tencent.mm.cj.c.aNX();
      if (this.yCw != null)
      {
        localObject = this.yCw.aqO("find_friends_by_web");
        if (localObject != null)
          ((Preference)localObject).setEnabled(true);
      }
      AppMethodBeat.o(25509);
      return;
      this.ehK.ce("find_friends_by_web", false);
      break;
      label245: if (!ad.aoA(str1))
        localObject = getString(2131299821, new Object[] { str1 });
      else if (!bo.isNullOrNil((String)localObject))
        localObject = getString(2131299822, new Object[] { av.amM((String)localObject) });
      else
        localObject = getString(2131299823);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.subapp.ui.openapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.h;
import com.tencent.mm.az.h.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class AppProfileUI extends MMPreference
  implements k.a
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private ak handler = null;
  private com.tencent.mm.pluginsdk.model.app.f neJ;
  private AppHeaderPreference.a suF;

  private static void a(com.tencent.mm.pluginsdk.model.app.f paramf, boolean paramBoolean)
  {
    AppMethodBeat.i(25462);
    LinkedList localLinkedList = new LinkedList();
    StringBuilder localStringBuilder = new StringBuilder().append(paramf.field_appId).append(",");
    if (paramBoolean);
    for (paramf = "1"; ; paramf = "2")
    {
      localLinkedList.add(new h.a(10165, paramf));
      aw.ZK();
      c.XL().c(new h(localLinkedList));
      AppMethodBeat.o(25462);
      return;
    }
  }

  private void cDM()
  {
    AppMethodBeat.i(25459);
    this.handler = new AppProfileUI.3(this);
    this.handler.sendEmptyMessageDelayed(0, 30L);
    AppMethodBeat.o(25459);
  }

  private void refresh()
  {
    boolean bool = true;
    AppMethodBeat.i(25458);
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165191);
    AppHeaderPreference localAppHeaderPreference;
    AppHeaderPreference.a locala;
    if (this.neJ.field_status == 1)
    {
      this.ehK.aqP("app_profile_add");
      localAppHeaderPreference = (AppHeaderPreference)this.ehK.aqO("app_profile_header");
      locala = this.suF;
      if (this.neJ.field_status != 1)
        break label110;
    }
    while (true)
    {
      localAppHeaderPreference.a(locala, bool);
      AppMethodBeat.o(25458);
      return;
      this.ehK.aqP("app_profile_remove");
      break;
      label110: bool = false;
    }
  }

  public final int JC()
  {
    return 2131165191;
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(25461);
    if (paramString.equals(this.neJ.field_appId))
      initView();
    AppMethodBeat.o(25461);
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(25460);
    paramf = paramPreference.mKey;
    ab.i("MicroMsg.AppProfileUI", paramf + " item has been clicked!");
    if (paramf.equals("app_profile_add"))
    {
      this.neJ.field_status = 1;
      this.neJ.field_modifyTime = System.currentTimeMillis();
      am.bYJ().a(this.neJ, new String[0]);
      refresh();
      a(this.neJ, true);
      cDM();
      AppMethodBeat.o(25460);
    }
    while (true)
    {
      return bool;
      if (paramf.equals("app_profile_remove"))
      {
        this.neJ.field_status = 0;
        this.neJ.field_modifyTime = System.currentTimeMillis();
        am.bYJ().a(this.neJ, new String[0]);
        refresh();
        a(this.neJ, false);
        cDM();
        AppMethodBeat.o(25460);
      }
      else
      {
        AppMethodBeat.o(25460);
        bool = false;
      }
    }
  }

  public final void initView()
  {
    boolean bool = true;
    AppMethodBeat.i(25457);
    this.suF = new AppProfileUI.1(this);
    this.neJ = g.bT(getIntent().getStringExtra("AppProfileUI_AppId"), true);
    if (this.neJ != null);
    while (true)
    {
      Assert.assertTrue("initView : appInfo does not exist", bool);
      setMMTitle(2131297023);
      this.ehK = this.yCw;
      setBackBtn(new AppProfileUI.2(this));
      refresh();
      AppMethodBeat.o(25457);
      return;
      bool = false;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25454);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(25454);
  }

  public void onPause()
  {
    AppMethodBeat.i(25456);
    am.bYJ().d(this);
    super.onPause();
    AppMethodBeat.o(25456);
  }

  public void onResume()
  {
    AppMethodBeat.i(25455);
    super.onResume();
    am.bYJ().c(this);
    AppMethodBeat.o(25455);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI
 * JD-Core Version:    0.6.2
 */
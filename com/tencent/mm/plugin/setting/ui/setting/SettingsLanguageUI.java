package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.ui.LanguagePreference;
import com.tencent.mm.plugin.account.ui.LanguagePreference.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SettingsLanguageUI extends MMPreference
{
  private static final String[] qno = z.qno;
  private f ehK;
  private String gGN;
  private List<LanguagePreference.a> qnp;
  private boolean qnq = false;

  private void ciP()
  {
    int i = 0;
    AppMethodBeat.i(127243);
    this.ehK.removeAll();
    Object localObject1 = getResources().getStringArray(2131755024);
    this.gGN = aa.h(getSharedPreferences(ah.doA(), 0));
    this.qnp = new ArrayList();
    while (i < qno.length)
    {
      localObject2 = qno[i];
      this.qnp.add(new LanguagePreference.a(localObject1[i], "", (String)localObject2, this.gGN.equalsIgnoreCase((String)localObject2)));
      i++;
    }
    Object localObject2 = this.qnp.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (LanguagePreference.a)((Iterator)localObject2).next();
      LanguagePreference localLanguagePreference = new LanguagePreference(this);
      localLanguagePreference.a((LanguagePreference.a)localObject1);
      this.ehK.b(localLanguagePreference);
    }
    localObject1 = new PreferenceCategory(this);
    this.ehK.b((Preference)localObject1);
    this.ehK.notifyDataSetChanged();
    AppMethodBeat.o(127243);
  }

  public final int JC()
  {
    return -1;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(127244);
    LanguagePreference.a locala;
    boolean bool;
    if ((paramPreference instanceof LanguagePreference))
    {
      locala = ((LanguagePreference)paramPreference).gBB;
      if (locala == null)
      {
        AppMethodBeat.o(127244);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      this.gGN = locala.gBE;
      paramPreference = this.qnp.iterator();
      while (paramPreference.hasNext())
        ((LanguagePreference.a)paramPreference.next()).gBF = false;
      locala.gBF = true;
      paramf.notifyDataSetChanged();
      AppMethodBeat.o(127244);
      bool = true;
      continue;
      AppMethodBeat.o(127244);
      bool = false;
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127242);
    setMMTitle(2131303119);
    setBackBtn(new SettingsLanguageUI.1(this));
    a(0, getString(2131303118), new SettingsLanguageUI.2(this), q.b.ymu);
    this.qnq = getIntent().getBooleanExtra("not_auth_setting", false);
    ciP();
    AppMethodBeat.o(127242);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127240);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    initView();
    AppMethodBeat.o(127240);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127241);
    super.onDestroy();
    AppMethodBeat.o(127241);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI
 * JD-Core Version:    0.6.2
 */
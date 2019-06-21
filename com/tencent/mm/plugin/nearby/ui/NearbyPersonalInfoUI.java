package com.tencent.mm.plugin.nearby.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Html;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bp;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.nearby.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.ChoicePreference;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class NearbyPersonalInfoUI extends MMPreference
{
  private int dtS = -1;
  private f ehK;

  private void bVg()
  {
    AppMethodBeat.i(55491);
    int i = bo.a((Integer)g.RP().Ry().get(12290, null), 0);
    ChoicePreference localChoicePreference = (ChoicePreference)this.ehK.aqO("settings_sex");
    localChoicePreference.setTitle(Html.fromHtml(getString(2131303251) + "<font color='red'>*</font>"));
    switch (i)
    {
    default:
      localChoicePreference.setValue("unknown");
      AppMethodBeat.o(55491);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      localChoicePreference.setValue("male");
      AppMethodBeat.o(55491);
      continue;
      localChoicePreference.setValue("female");
      AppMethodBeat.o(55491);
    }
  }

  public final int JC()
  {
    return 2131165251;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(55490);
    paramf = paramPreference.mKey;
    if ("settings_district".equals(paramf))
    {
      a.gkE.b(null, this);
      AppMethodBeat.o(55490);
    }
    while (true)
    {
      return bool;
      if ("settings_signature".equals(paramf))
      {
        a.gkE.bf(this);
        overridePendingTransition(2131034229, 2131034228);
        AppMethodBeat.o(55490);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(55490);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(55488);
    setMMTitle(2131301643);
    this.ehK = this.yCw;
    ((KeyValuePreference)this.ehK.aqO("settings_signature")).yCj = false;
    setBackBtn(new NearbyPersonalInfoUI.1(this));
    addTextOptionMenu(0, getString(2131296989), new NearbyPersonalInfoUI.2(this));
    ((ChoicePreference)this.ehK.aqO("settings_sex")).yBv = new NearbyPersonalInfoUI.3(this);
    bVg();
    AppMethodBeat.o(55488);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(55486);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(55486);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(55487);
    super.onDestroy();
    AppMethodBeat.o(55487);
  }

  public void onResume()
  {
    AppMethodBeat.i(55489);
    Object localObject1 = bp.aao();
    Object localObject2 = ((bp)localObject1).getProvince();
    Object localObject3 = ((bp)localObject1).getCity();
    localObject1 = this.ehK.aqO("settings_district");
    ((Preference)localObject1).setSummary(s.mL((String)localObject2) + " " + (String)localObject3);
    ((Preference)localObject1).setTitle(Html.fromHtml(getString(2131303071) + "<font color='red'>*</font>"));
    localObject3 = this.ehK.aqO("settings_signature");
    localObject1 = bo.nullAsNil((String)g.RP().Ry().get(12291, null));
    localObject2 = localObject1;
    if (((String)localObject1).length() <= 0)
      localObject2 = getString(2131303260);
    ((Preference)localObject3).setSummary(j.b(this, (CharSequence)localObject2));
    super.onResume();
    AppMethodBeat.o(55489);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI
 * JD-Core Version:    0.6.2
 */
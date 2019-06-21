package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bp;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.DialogPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;

public class SettingsPersonalMoreUI extends MMPreference
  implements n.b
{
  private int dtS = -1;
  private f ehK;

  private void ciZ()
  {
    AppMethodBeat.i(127387);
    Preference localPreference = this.ehK.aqO("settings_signature");
    String str1 = bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(12291, null));
    String str2 = str1;
    if (str1.length() <= 0)
      str2 = getString(2131303260);
    localPreference.setSummary(com.tencent.mm.pluginsdk.ui.e.j.b(this, str2));
    AppMethodBeat.o(127387);
  }

  public final int JC()
  {
    return 2131165288;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(127389);
    int i = bo.g(paramObject, 0);
    ab.d("SettingsPersonalMoreUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    if ((paramn != com.tencent.mm.kernel.g.RP().Ry()) || (i <= 0))
    {
      ab.e("SettingsPersonalMoreUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(127389);
    }
    while (true)
    {
      return;
      if (12291 == i)
        ciZ();
      AppMethodBeat.o(127389);
    }
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(127388);
    paramf = paramPreference.mKey;
    if (paramf.equals("settings_district"))
    {
      b.gkE.b(new Intent(), this.mController.ylL);
      AppMethodBeat.o(127388);
    }
    while (true)
    {
      return bool;
      if (paramf.equals("settings_signature"))
      {
        startActivity(new Intent(this, EditSignatureUI.class));
        AppMethodBeat.o(127388);
      }
      else if (paramf.equals("settings_linkedin"))
      {
        paramf = new Intent(this, BindLinkedInUI.class);
        paramf.putExtra("oversea_entry", true);
        startActivity(paramf);
        AppMethodBeat.o(127388);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(127388);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127384);
    setMMTitle(2131303197);
    this.ehK = this.yCw;
    ((DialogPreference)this.ehK.aqO("settings_sex")).yBv = new SettingsPersonalMoreUI.1(this);
    setBackBtn(new SettingsPersonalMoreUI.2(this));
    AppMethodBeat.o(127384);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127383);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127383);
  }

  public void onPause()
  {
    AppMethodBeat.i(127386);
    super.onPause();
    bp localbp = bp.aao();
    if (this.dtS != -1)
      localbp.dtS = this.dtS;
    ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XL().c(new j.a(1, bp.a(localbp)));
    AppMethodBeat.o(127386);
  }

  public void onResume()
  {
    int i = 1;
    AppMethodBeat.i(127385);
    super.onResume();
    int j = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(12290, null), 0);
    Object localObject1 = (DialogPreference)this.ehK.aqO("settings_sex");
    label161: int k;
    switch (j)
    {
    default:
      ((DialogPreference)localObject1).setValue("unknown");
      Object localObject2 = bp.aao();
      localObject1 = bo.nullAsNil(((bp)localObject2).getProvince());
      localObject2 = bo.nullAsNil(((bp)localObject2).getCity());
      this.ehK.aqO("settings_district").setSummary(s.mL((String)localObject1) + " " + (String)localObject2);
      ciZ();
      if ((r.YK() & 0x1000000) == 0)
      {
        j = 1;
        localObject1 = com.tencent.mm.m.g.Nu().getValue("LinkedinPluginClose");
        if ((!bo.isNullOrNil((String)localObject1)) && (Integer.valueOf((String)localObject1).intValue() != 0))
          break label243;
        k = 1;
        label191: if ((j != 0) && (k != 0))
          break label249;
        this.ehK.ce("settings_linkedin", true);
        AppMethodBeat.o(127385);
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      ((DialogPreference)localObject1).setValue("male");
      break;
      ((DialogPreference)localObject1).setValue("female");
      break;
      j = 0;
      break label161;
      label243: k = 0;
      break label191;
      label249: localObject1 = this.ehK.aqO("settings_linkedin");
      if (!bo.isNullOrNil((String)com.tencent.mm.kernel.g.RP().Ry().get(286721, null)));
      for (j = i; ; j = 0)
      {
        if (j != 0)
          break label313;
        ((Preference)localObject1).setSummary(getString(2131303122));
        AppMethodBeat.o(127385);
        break;
      }
      label313: if ((r.YD() & 0x400000) == 0)
      {
        ((Preference)localObject1).setSummary(getString(2131303123));
        AppMethodBeat.o(127385);
      }
      else
      {
        ((Preference)localObject1).setSummary(getString(2131303124));
        AppMethodBeat.o(127385);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI
 * JD-Core Version:    0.6.2
 */
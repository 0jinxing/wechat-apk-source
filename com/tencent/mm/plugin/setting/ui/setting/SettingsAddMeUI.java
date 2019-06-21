package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.preference.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SettingsAddMeUI extends MMPreference
{
  private f ehK;
  private HashMap<Integer, Integer> gsc;
  private long kFU;
  private int qmL;
  private int status;

  public SettingsAddMeUI()
  {
    AppMethodBeat.i(127169);
    this.gsc = new HashMap();
    AppMethodBeat.o(127169);
  }

  private boolean Be(int paramInt)
  {
    if ((this.status & paramInt) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void e(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(127174);
    ab.d("MicroMsg.SettingsAddMeUI", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.status |= paramInt1;
      if (!paramBoolean)
        break label101;
    }
    label101: for (paramInt1 = 1; ; paramInt1 = 2)
    {
      this.gsc.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      AppMethodBeat.o(127174);
      return;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }

  private void f(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(127175);
    ab.d("MicroMsg.SettingsAddMeUI", "switch ext change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.kFU |= paramInt1;
      if (!paramBoolean)
        break label103;
    }
    label103: for (paramInt1 = 1; ; paramInt1 = 2)
    {
      this.gsc.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      AppMethodBeat.o(127175);
      return;
      this.kFU &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }

  public final int JC()
  {
    return 2131165272;
  }

  public final h a(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(127170);
    paramSharedPreferences = new com.tencent.mm.ui.base.preference.a(this, this.nDp, paramSharedPreferences);
    AppMethodBeat.o(127170);
    return paramSharedPreferences;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = true;
    AppMethodBeat.i(127173);
    paramPreference = paramPreference.mKey;
    ab.i("MicroMsg.SettingsAddMeUI", paramPreference + " item has been clicked!");
    if (paramPreference.equals("settings_find_me_by_QQ"))
      if (!((CheckBoxPreference)paramf.aqO("settings_find_me_by_QQ")).isChecked())
      {
        bool6 = true;
        e(bool6, 8, 2);
        e(bool6, 16, 3);
        AppMethodBeat.o(127173);
        bool6 = bool7;
      }
    while (true)
    {
      return bool6;
      bool6 = false;
      break;
      if (paramPreference.equals("settings_find_me_by_weixin"))
      {
        if (!((CheckBoxPreference)paramf.aqO("settings_find_me_by_weixin")).isChecked())
          bool6 = true;
        ab.d("MicroMsg.SettingsAddMeUI", "switch plug change : open = " + bool6 + " item value = 512 functionId = 25");
        if (bool6)
        {
          this.qmL |= 512;
          label192: if (!bool6)
            break label245;
        }
        label245: for (int i = 1; ; i = 2)
        {
          this.gsc.put(Integer.valueOf(25), Integer.valueOf(i));
          AppMethodBeat.o(127173);
          bool6 = bool7;
          break;
          this.qmL &= -513;
          break label192;
        }
      }
      if (paramPreference.equals("settings_find_me_by_mobile"))
      {
        bool6 = bool1;
        if (!((CheckBoxPreference)paramf.aqO("settings_find_me_by_mobile")).isChecked())
          bool6 = true;
        e(bool6, 512, 8);
        AppMethodBeat.o(127173);
        bool6 = bool7;
      }
      else if (paramPreference.equals("settings_find_me_by_google"))
      {
        bool6 = bool2;
        if (!((CheckBoxPreference)paramf.aqO("settings_find_me_by_google")).isChecked())
          bool6 = true;
        e(bool6, 524288, 30);
        AppMethodBeat.o(127173);
        bool6 = bool7;
      }
      else if (paramPreference.equals("settings_add_me_by_chatroom"))
      {
        bool6 = bool3;
        if (!((CheckBoxPreference)paramf.aqO("settings_add_me_by_chatroom")).isChecked())
          bool6 = true;
        f(bool6, 1, 38);
        AppMethodBeat.o(127173);
        bool6 = bool7;
      }
      else if (paramPreference.equals("settings_add_me_by_qrcode"))
      {
        bool6 = bool4;
        if (!((CheckBoxPreference)paramf.aqO("settings_add_me_by_qrcode")).isChecked())
          bool6 = true;
        f(bool6, 2, 39);
        AppMethodBeat.o(127173);
        bool6 = bool7;
      }
      else if (paramPreference.equals("settings_add_me_by_namecard"))
      {
        bool6 = bool5;
        if (!((CheckBoxPreference)paramf.aqO("settings_add_me_by_namecard")).isChecked())
          bool6 = true;
        f(bool6, 4, 40);
        AppMethodBeat.o(127173);
        bool6 = bool7;
      }
      else
      {
        AppMethodBeat.o(127173);
        bool6 = false;
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127176);
    setMMTitle(2131303037);
    setBackBtn(new SettingsAddMeUI.1(this));
    ab.d("MicroMsg.SettingsAddMeUI", "plug:" + this.qmL + ",status:" + this.status + ",extstatus:" + this.kFU);
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165272);
    Object localObject1 = (Integer)g.RP().Ry().get(9, null);
    Object localObject2 = (CheckBoxPreference)this.ehK.aqO("settings_find_me_by_QQ");
    ((Preference)localObject2).yDf = false;
    boolean bool;
    if ((localObject1 != null) && (((Integer)localObject1).intValue() != 0))
      if ((!Be(8)) || (!Be(16)))
      {
        bool = true;
        ((CheckBoxPreference)localObject2).uOT = bool;
        label163: localObject2 = (String)g.RP().Ry().get(6, null);
        localObject1 = (CheckBoxPreference)this.ehK.aqO("settings_find_me_by_mobile");
        ((Preference)localObject1).yDf = false;
        if ((localObject2 == null) || (((String)localObject2).length() <= 0))
          break label491;
        if (Be(512))
          break label486;
        bool = true;
        label222: ((CheckBoxPreference)localObject1).uOT = bool;
        label227: localObject1 = (CheckBoxPreference)this.ehK.aqO("settings_find_me_by_weixin");
        ((Preference)localObject1).yDf = false;
        if ((this.qmL & 0x200) == 0)
          break label505;
        ((CheckBoxPreference)localObject1).uOT = false;
        label263: localObject2 = (CheckBoxPreference)this.ehK.aqO("settings_find_me_by_google");
        if (Be(524288))
          break label513;
        bool = true;
        label289: ((CheckBoxPreference)localObject2).uOT = bool;
        ((Preference)localObject2).yDf = false;
        localObject1 = (String)g.RP().Ry().get(208903, null);
        if ((!bo.gT(this)) || (TextUtils.isEmpty((CharSequence)localObject1)))
          this.ehK.d((Preference)localObject2);
        localObject1 = (CheckBoxPreference)this.ehK.aqO("settings_add_me_by_chatroom");
        ((Preference)localObject1).yDf = false;
        if ((this.kFU & 1L) == 0L)
          break label518;
        ((CheckBoxPreference)localObject1).uOT = false;
        label376: localObject1 = (CheckBoxPreference)this.ehK.aqO("settings_add_me_by_qrcode");
        ((Preference)localObject1).yDf = false;
        if ((this.kFU & 0x2) == 0L)
          break label526;
        ((CheckBoxPreference)localObject1).uOT = false;
        label414: localObject1 = (CheckBoxPreference)this.ehK.aqO("settings_add_me_by_namecard");
        ((Preference)localObject1).yDf = false;
        if ((this.kFU & 0x4) == 0L)
          break label534;
      }
    label513: label518: label526: label534: for (((CheckBoxPreference)localObject1).uOT = false; ; ((CheckBoxPreference)localObject1).uOT = true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(127176);
      return;
      bool = false;
      break;
      this.ehK.d((Preference)localObject2);
      break label163;
      label486: bool = false;
      break label222;
      label491: this.ehK.d((Preference)localObject1);
      break label227;
      label505: ((CheckBoxPreference)localObject1).uOT = true;
      break label263;
      bool = false;
      break label289;
      ((CheckBoxPreference)localObject1).uOT = true;
      break label376;
      ((CheckBoxPreference)localObject1).uOT = true;
      break label414;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127171);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    this.qmL = r.YF();
    this.status = r.YD();
    this.kFU = r.YE();
    initView();
    AppMethodBeat.o(127171);
  }

  public void onPause()
  {
    AppMethodBeat.i(127172);
    super.onPause();
    ab.d("MicroMsg.SettingsAddMeUI", "plug:" + this.qmL + ",status:" + this.status + ",extstatus:" + this.kFU);
    g.RP().Ry().set(7, Integer.valueOf(this.status));
    g.RP().Ry().set(40, Integer.valueOf(this.qmL));
    g.RP().Ry().set(147457, Long.valueOf(this.kFU));
    Iterator localIterator = this.gsc.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new act();
      ((act)localObject).wkw = i;
      ((act)localObject).pvD = j;
      ((j)g.K(j.class)).XL().c(new j.a(23, (com.tencent.mm.bt.a)localObject));
      ab.d("MicroMsg.SettingsAddMeUI", "switch  " + i + " " + j);
    }
    this.gsc.clear();
    AppMethodBeat.o(127172);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI
 * JD-Core Version:    0.6.2
 */
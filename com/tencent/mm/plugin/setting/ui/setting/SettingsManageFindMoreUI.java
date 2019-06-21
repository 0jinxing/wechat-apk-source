package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.g.a.qp;
import com.tencent.mm.g.a.qp.b;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.websearch.api.m;
import com.tencent.mm.pluginsdk.f.f.b;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SettingsManageFindMoreUI extends MMPreference
{
  private HashMap<Integer, Integer> gsc;
  private long kFU;
  private HashMap<Integer, Integer> qnC;
  private HashMap<Integer, Integer> qnD;
  private int qnE;

  public SettingsManageFindMoreUI()
  {
    AppMethodBeat.i(127271);
    this.gsc = new HashMap();
    this.qnC = new HashMap();
    this.qnD = new HashMap();
    AppMethodBeat.o(127271);
  }

  private void B(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(127278);
    ab.i("MicroMsg.SettingsManageFindMoreUI", "switch plugin flag, open %s, flag %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (!paramBoolean)
    {
      this.qnE |= paramInt;
      AppMethodBeat.o(127278);
    }
    while (true)
    {
      return;
      this.qnE &= (paramInt ^ 0xFFFFFFFF);
      AppMethodBeat.o(127278);
    }
  }

  private boolean Cn(int paramInt)
  {
    if ((this.kFU & paramInt) != 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean Co(int paramInt)
  {
    if ((this.qnE & paramInt) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void bHT()
  {
    AppMethodBeat.i(127279);
    Iterator localIterator = this.qnD.keySet().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if ((this.qnC.containsKey(Integer.valueOf(i))) && (this.qnC.get(Integer.valueOf(i)) != this.qnD.get(Integer.valueOf(i))))
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(15185, new Object[] { Integer.valueOf(i), this.qnD.get(Integer.valueOf(i)) });
        if (i == 0)
          if (((Integer)this.qnD.get(Integer.valueOf(i))).intValue() == 0)
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWt, Integer.valueOf(-1));
          else if (((Integer)this.qnD.get(Integer.valueOf(i))).intValue() == 1)
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWt, Integer.valueOf(1));
      }
    }
    AppMethodBeat.o(127279);
  }

  private void f(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(127276);
    ab.i("MicroMsg.SettingsManageFindMoreUI", "switch ext change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.kFU &= (paramInt1 ^ 0xFFFFFFFF);
      if (!paramBoolean)
        break label103;
    }
    label103: for (paramInt1 = 1; ; paramInt1 = 2)
    {
      this.gsc.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      AppMethodBeat.o(127276);
      return;
      this.kFU |= paramInt1;
      break;
    }
  }

  public final int JC()
  {
    return 2131165282;
  }

  public final com.tencent.mm.ui.base.preference.h a(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(127273);
    paramSharedPreferences = new com.tencent.mm.ui.base.preference.a(this, this.nDp, paramSharedPreferences);
    AppMethodBeat.o(127273);
    return paramSharedPreferences;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    int i = 0;
    AppMethodBeat.i(127274);
    if (!(paramPreference instanceof CheckBoxPreference))
    {
      AppMethodBeat.o(127274);
      return true;
    }
    paramf = (CheckBoxPreference)paramPreference;
    paramPreference = paramPreference.mKey;
    ab.i("MicroMsg.SettingsManageFindMoreUI", "click pref key %s", new Object[] { paramPreference });
    int j = -1;
    if (paramPreference.equals("settings_sns_switch"))
    {
      B(paramf.isChecked(), 32768);
      j = 0;
    }
    while (true)
    {
      if (paramf.isChecked())
        i = 1;
      if (j >= 0)
        this.qnD.put(Integer.valueOf(j), Integer.valueOf(i));
      AppMethodBeat.o(127274);
      break;
      if (paramPreference.equals("settings_scan_switch"))
      {
        f(paramf.isChecked(), 1048576, 49);
        j = 1;
      }
      else if (paramPreference.equals("settings_search_switch"))
      {
        if (!paramf.isChecked())
        {
          if (((m)com.tencent.mm.kernel.g.K(m.class)).b(this, new SettingsManageFindMoreUI.1(this, paramf)))
            al.n(new SettingsManageFindMoreUI.2(this, paramf), 500L);
          j = 3;
        }
        else
        {
          f(paramf.isChecked(), 2097152, 50);
          j = 3;
        }
      }
      else if (paramPreference.equals("settings_shopping_switch"))
      {
        j = 6;
        f(paramf.isChecked(), 4194304, 51);
      }
      else
      {
        if (paramPreference.equals("settings_game_switch"))
        {
          f(paramf.isChecked(), 8388608, 52);
          paramPreference = com.tencent.mm.plugin.report.service.h.pYm;
          if (paramf.isChecked());
          for (long l = 0L; ; l = 1L)
          {
            paramPreference.a(848L, l, 1L, false);
            j = 7;
            break;
          }
        }
        if (paramPreference.equals("settings_miniprogram_switch"))
        {
          j = 8;
          f(paramf.isChecked(), 16777216, 53);
        }
        else if (paramPreference.equals("settings_wechatout_switch"))
        {
          j = 9;
          f(paramf.isChecked(), 33554432, 54);
        }
        else if (paramPreference.equals("settings_shake_switch"))
        {
          j = 2;
          B(paramf.isChecked(), 256);
        }
        else if (paramPreference.equals("settings_nearby_switch"))
        {
          j = 4;
          B(paramf.isChecked(), 512);
        }
        else if (paramPreference.equals("settings_look_switch"))
        {
          ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.a.class)).bK("labs_browse", paramf.isChecked());
          if (paramf.isChecked())
          {
            this.kFU &= -67108865L;
            j = 10;
          }
          else
          {
            this.kFU |= 67108864L;
            j = 10;
          }
        }
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(127277);
    super.finish();
    ab.i("MicroMsg.SettingsManageFindMoreUI", "oplog extstatus:" + this.kFU + ",pluginFlag:" + this.qnE);
    com.tencent.mm.kernel.g.RP().Ry().set(147457, Long.valueOf(this.kFU));
    com.tencent.mm.kernel.g.RP().Ry().set(34, Integer.valueOf(this.qnE));
    Iterator localIterator = this.gsc.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new act();
      ((act)localObject).wkw = i;
      ((act)localObject).pvD = j;
      ((j)com.tencent.mm.kernel.g.K(j.class)).XL().c(new j.a(23, (com.tencent.mm.bt.a)localObject));
      ab.d("MicroMsg.SettingsManageFindMoreUI", "switch  " + i + " " + j);
    }
    this.gsc.clear();
    ((j)com.tencent.mm.kernel.g.K(j.class)).XL().c(new k("", "", "", "", "", "", "", "", this.qnE, "", ""));
    bHT();
    AppMethodBeat.o(127277);
  }

  public final void initView()
  {
    AppMethodBeat.i(127275);
    setMMTitle(2131303131);
    setBackBtn(new SettingsManageFindMoreUI.3(this));
    Object localObject1 = (CheckBoxPreference)this.yCw.aqO("settings_sns_switch");
    ((Preference)localObject1).yDf = false;
    boolean bool1 = Co(32768);
    ab.i("MicroMsg.SettingsManageFindMoreUI", "openSns %s", new Object[] { Boolean.valueOf(bool1) });
    label146: label219: label252: boolean bool2;
    if (bool1)
    {
      ((CheckBoxPreference)localObject1).uOT = true;
      this.qnC.put(Integer.valueOf(0), Integer.valueOf(1));
      localObject1 = (CheckBoxPreference)this.yCw.aqO("settings_scan_switch");
      ((Preference)localObject1).yDf = false;
      if (!Cn(1048576))
        break label988;
      ((CheckBoxPreference)localObject1).uOT = false;
      this.qnC.put(Integer.valueOf(1), Integer.valueOf(0));
      localObject1 = (CheckBoxPreference)this.yCw.aqO("settings_shake_switch");
      ((Preference)localObject1).yDf = false;
      bool1 = Co(256);
      ab.i("MicroMsg.SettingsManageFindMoreUI", "openShake %s", new Object[] { Boolean.valueOf(bool1) });
      if (!bool1)
        break label1012;
      ((CheckBoxPreference)localObject1).uOT = true;
      this.qnC.put(Integer.valueOf(2), Integer.valueOf(1));
      localObject1 = (CheckBoxPreference)this.yCw.aqO("settings_look_switch");
      ((Preference)localObject1).yDf = false;
      if (Cn(67108864))
        break label1036;
      bool1 = true;
      if (!com.tencent.mm.au.b.sO((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null)))
        break label1357;
      this.yCw.ce("settings_look_switch", true);
      ab.i("MicroMsg.SettingsManageFindMoreUI", "european user");
      bool2 = false;
      bool1 = false;
    }
    label405: label815: label1330: 
    while (true)
    {
      ab.i("MicroMsg.SettingsManageFindMoreUI", "isInExperiment %s ,openLook %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      label355: label494: String str;
      if ((bool2) && (bool1))
      {
        ((CheckBoxPreference)localObject1).uOT = true;
        this.qnC.put(Integer.valueOf(10), Integer.valueOf(1));
        localObject1 = (CheckBoxPreference)this.yCw.aqO("settings_search_switch");
        ((Preference)localObject1).yDf = false;
        if (!Cn(2097152))
          break label1099;
        ((CheckBoxPreference)localObject1).uOT = false;
        this.qnC.put(Integer.valueOf(3), Integer.valueOf(0));
        localObject1 = (CheckBoxPreference)this.yCw.aqO("settings_nearby_switch");
        ((Preference)localObject1).yDf = false;
        bool1 = Co(512);
        ab.i("MicroMsg.SettingsManageFindMoreUI", "openNearby %s", new Object[] { Boolean.valueOf(bool1) });
        if (!bool1)
          break label1123;
        ((CheckBoxPreference)localObject1).uOT = true;
        this.qnC.put(Integer.valueOf(4), Integer.valueOf(1));
        label478: if (!aa.doo())
          break label1147;
        localObject1 = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigName");
        str = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigIconUrl");
        localObject2 = com.tencent.mm.pluginsdk.f.f.vdy;
        if (localObject2 == null)
          break label1351;
      }
      label707: label1351: for (Object localObject2 = ((f.b)localObject2).cDA(); ; localObject2 = null)
      {
        if (!bo.Q(new String[] { localObject1, str, localObject2 }));
        for (bool1 = true; ; bool1 = false)
        {
          ab.i("MicroMsg.SettingsManageFindMoreUI", "showShopping %s", new Object[] { Boolean.valueOf(bool1) });
          localObject1 = (CheckBoxPreference)this.yCw.aqO("settings_shopping_switch");
          ((Preference)localObject1).yDf = false;
          if (bool1)
          {
            this.yCw.ce("settings_shopping_switch", false);
            label605: if (!Cn(4194304))
              break label1194;
            ((CheckBoxPreference)localObject1).uOT = false;
            this.qnC.put(Integer.valueOf(6), Integer.valueOf(0));
            label636: localObject2 = a.a.bDb();
            localObject1 = (CheckBoxPreference)this.yCw.aqO("settings_game_switch");
            ((Preference)localObject1).yDf = false;
            if ((localObject2 == null) || (!((com.tencent.mm.plugin.game.a.a)localObject2).bCS()))
              break label1244;
            if (!Cn(8388608))
              break label1219;
            ((CheckBoxPreference)localObject1).uOT = false;
            this.qnC.put(Integer.valueOf(7), Integer.valueOf(0));
            localObject1 = new qp();
            ((qp)localObject1).cMH.cMJ = true;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
            bool1 = ((qp)localObject1).cMI.cMK;
            ab.i("MicroMsg.SettingsManageFindMoreUI", "shouldShowMiniProgram %s", new Object[] { Boolean.valueOf(bool1) });
            localObject1 = (CheckBoxPreference)this.yCw.aqO("settings_miniprogram_switch");
            ((Preference)localObject1).yDf = false;
            if (!bool1)
              break label1284;
            if (!Cn(16777216))
              break label1259;
            ((CheckBoxPreference)localObject1).uOT = false;
            this.qnC.put(Integer.valueOf(8), Integer.valueOf(0));
            localObject1 = (CheckBoxPreference)this.yCw.aqO("settings_wechatout_switch");
            if (com.tencent.mm.m.g.Nu().getInt("WCOEntranceSwitch", 0) <= 0)
              break label1300;
            bool1 = true;
            label846: ab.i("MicroMsg.SettingsManageFindMoreUI", "showWeChatOut %s", new Object[] { Boolean.valueOf(bool1) });
            if (!bool1)
              break label1330;
            ((Preference)localObject1).yDf = false;
            if (!Cn(33554432))
              break label1305;
            ((CheckBoxPreference)localObject1).uOT = false;
            this.qnC.put(Integer.valueOf(9), Integer.valueOf(0));
          }
          while (true)
          {
            localObject1 = this.yCw.aqO("settings_switch_bottom_tip");
            if (com.tencent.mm.au.b.sO((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null)))
              ((Preference)localObject1).setTitle(2131303135);
            this.yCw.notifyDataSetChanged();
            AppMethodBeat.o(127275);
            return;
            ((CheckBoxPreference)localObject1).uOT = false;
            this.qnC.put(Integer.valueOf(0), Integer.valueOf(0));
            break;
            label988: ((CheckBoxPreference)localObject1).uOT = true;
            this.qnC.put(Integer.valueOf(1), Integer.valueOf(1));
            break label146;
            label1012: ((CheckBoxPreference)localObject1).uOT = false;
            this.qnC.put(Integer.valueOf(2), Integer.valueOf(0));
            break label219;
            bool1 = false;
            break label252;
            if (!bool2)
            {
              this.yCw.ce("settings_look_switch", true);
              break label355;
            }
            this.yCw.ce("settings_look_switch", false);
            ((CheckBoxPreference)localObject1).uOT = false;
            this.qnC.put(Integer.valueOf(10), Integer.valueOf(0));
            break label355;
            label1099: ((CheckBoxPreference)localObject1).uOT = true;
            this.qnC.put(Integer.valueOf(3), Integer.valueOf(1));
            break label405;
            label1123: ((CheckBoxPreference)localObject1).uOT = false;
            this.qnC.put(Integer.valueOf(4), Integer.valueOf(0));
            break label478;
            label1147: if (aa.dop())
            {
              localObject1 = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigNameHKTW");
              break label494;
            }
            localObject1 = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigNameEN");
            break label494;
            this.yCw.ce("settings_shopping_switch", true);
            break label605;
            ((CheckBoxPreference)localObject1).uOT = true;
            this.qnC.put(Integer.valueOf(6), Integer.valueOf(1));
            break label636;
            ((CheckBoxPreference)localObject1).uOT = true;
            this.qnC.put(Integer.valueOf(7), Integer.valueOf(1));
            break label707;
            label1244: this.yCw.ce("settings_game_switch", true);
            break label707;
            label1259: ((CheckBoxPreference)localObject1).uOT = true;
            this.qnC.put(Integer.valueOf(8), Integer.valueOf(1));
            break label815;
            this.yCw.ce("settings_miniprogram_switch", true);
            break label815;
            bool1 = false;
            break label846;
            ((CheckBoxPreference)localObject1).uOT = true;
            this.qnC.put(Integer.valueOf(9), Integer.valueOf(1));
            continue;
            this.yCw.ce("settings_wechatout_switch", true);
          }
        }
      }
      label1219: label1357: bool2 = true;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127272);
    super.onCreate(paramBundle);
    this.kFU = r.YE();
    this.qnE = r.YK();
    ab.i("MicroMsg.SettingsManageFindMoreUI", "onCreate extStatus %d, pluginFlag %d", new Object[] { Long.valueOf(this.kFU), Integer.valueOf(this.qnE) });
    initView();
    AppMethodBeat.o(127272);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI
 * JD-Core Version:    0.6.2
 */
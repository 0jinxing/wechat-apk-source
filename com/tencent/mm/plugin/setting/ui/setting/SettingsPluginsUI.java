package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ax.c;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.r.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.PluginTextPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SettingsPluginsUI extends MMPreference
{
  private static int qok;
  private static HashMap<String, Integer> qol;
  private f ehK;
  private boolean qom;
  private boolean qon;

  static
  {
    AppMethodBeat.i(127406);
    qok = 1;
    qol = new SettingsPluginsUI.1();
    AppMethodBeat.o(127406);
  }

  public final int JC()
  {
    return 2131165290;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = false;
    AppMethodBeat.i(127405);
    String str = paramPreference.mKey;
    if ((str != null) && (str.equals("display_in_addr_book")))
    {
      bool = ((CheckBoxPreference)paramf.aqO(str)).isChecked();
      com.tencent.mm.kernel.g.RP().Ry().set(35, Boolean.valueOf(bool));
      AppMethodBeat.o(127405);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((paramPreference instanceof PluginPreference))
      {
        paramPreference = ((PluginPreference)paramPreference).qlc;
        if (("feedsapp".equals(paramPreference)) && (this.qom))
          com.tencent.mm.kernel.g.RP().Ry().set(-2046825369, Boolean.FALSE);
        paramf = new Intent();
        if (("gh_43f2581f6fd6".equals(paramPreference)) && (this.qon))
        {
          a.bVt();
          com.tencent.mm.ax.d.lR(com.tencent.mm.ax.b.fKD);
          paramf.putExtra("key_from_wesport_plugin_newtips", true);
        }
        paramf.putExtra("Contact_User", paramPreference);
        com.tencent.mm.bp.d.b(this, "profile", ".ui.ContactInfoUI", paramf);
        h.pYm.e(12846, new Object[] { qol.get(paramPreference) });
        ab.i("MicroMsg.SettingsPluginsUI", "click id:%s, kvID:%d", new Object[] { paramPreference, qol.get(paramPreference) });
        AppMethodBeat.o(127405);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(127405);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127402);
    setMMTitle(2131303205);
    setBackBtn(new SettingsPluginsUI.2(this));
    AppMethodBeat.o(127402);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127400);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    initView();
    h.pYm.e(14098, new Object[] { Integer.valueOf(5) });
    h.pYm.e(12846, new Object[] { Integer.valueOf(qok) });
    ao.a.flu.ai("gh_43f2581f6fd6", "");
    AppMethodBeat.o(127400);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127401);
    super.onDestroy();
    AppMethodBeat.o(127401);
  }

  public void onPause()
  {
    AppMethodBeat.i(127404);
    super.onPause();
    AppMethodBeat.o(127404);
  }

  public void onResume()
  {
    int i = 0;
    AppMethodBeat.i(127403);
    super.onResume();
    this.ehK.removeAll();
    Object localObject1 = new PreferenceSmallCategory(this);
    this.ehK.b((Preference)localObject1);
    localObject1 = new ArrayList();
    Object localObject2 = new ArrayList();
    boolean bool1 = r.Ze();
    boolean bool2 = bool1;
    label158: label172: label225: label239: Object localObject4;
    if (!bool1)
    {
      if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("BindQQSwitch"), 1) == 1)
        bool2 = true;
    }
    else
    {
      if (!bool2)
        ab.i("MicroMsg.SettingsPluginsUI", "summerqq BindQQSwitch off");
      if ((bool2) && (com.tencent.mm.bp.d.afj("qqmail")))
      {
        localObject3 = new PluginPreference(this);
        if (((PluginPreference)localObject3).Ww("qqmail"))
        {
          ((PluginPreference)localObject3).setTitle(((PluginPreference)localObject3).qld);
          if ((r.YK() & 0x1) != 0)
            break label759;
          j = 1;
          if (j == 0)
            break label765;
          ((List)localObject1).add(localObject3);
        }
      }
      if (com.tencent.mm.bp.d.afj("readerapp"))
      {
        localObject3 = new PluginPreference(this);
        if (((PluginPreference)localObject3).Ww("newsapp"))
        {
          ((PluginPreference)localObject3).setTitle(((PluginPreference)localObject3).qld);
          if ((r.YK() & 0x80000) != 0)
            break label783;
          j = 1;
          if (j == 0)
            break label789;
          ((List)localObject1).add(localObject3);
        }
      }
      localObject3 = new PluginPreference(this);
      if (((PluginPreference)localObject3).Ww("facebookapp"))
      {
        ((PluginPreference)localObject3).setTitle(((PluginPreference)localObject3).qld);
        if ((r.YK() & 0x2000) != 0)
          break label807;
        j = 1;
        label283: if (j == 0)
          break label813;
        ((List)localObject1).add(localObject3);
      }
      label297: if (com.tencent.mm.bp.d.afj("masssend"))
      {
        localObject3 = new PluginPreference(this);
        if (((PluginPreference)localObject3).Ww("masssendapp"))
        {
          ((PluginPreference)localObject3).setTitle(((PluginPreference)localObject3).qld);
          if ((r.YK() & 0x10000) != 0)
            break label831;
          j = 1;
          label350: if (j == 0)
            break label837;
          ((List)localObject1).add(localObject3);
        }
      }
      label364: localObject3 = new PluginPreference(this);
      localObject4 = getString(2131299400);
      ((PluginPreference)localObject3).qlc = "gh_43f2581f6fd6";
      ((PluginPreference)localObject3).qld = ((String)localObject4);
      ((PluginPreference)localObject3).setKey("settings_plugins_list_#" + ((PluginPreference)localObject3).qlc);
      ((PluginPreference)localObject3).setTitle(((PluginPreference)localObject3).qld);
      if (!((com.tencent.mm.plugin.sport.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.sport.a.b.class)).cvY())
        break label849;
      ((List)localObject1).add(localObject3);
      label459: a.bVv();
      this.qon = c.lQ(com.tencent.mm.ax.b.fKD);
      ((PluginPreference)localObject3).qlg = this.qon;
      localObject3 = com.tencent.mm.m.g.Nu().getValue("LinkedinPluginClose");
      if ((bo.isNullOrNil((String)localObject3)) || (Integer.valueOf((String)localObject3).intValue() == 0))
      {
        localObject3 = new PluginPreference(this);
        if (((PluginPreference)localObject3).Ww("linkedinplugin"))
        {
          ((PluginPreference)localObject3).setTitle(((PluginPreference)localObject3).qld);
          if ((r.YK() & 0x1000000) != 0)
            break label861;
        }
      }
    }
    String str;
    label783: label789: label807: label813: label831: label837: label849: label861: for (int j = 1; ; j = 0)
    {
      if (!bo.isNullOrNil((String)com.tencent.mm.kernel.g.RP().Ry().get(286721, null)))
        i = 1;
      if ((j != 0) && (i != 0))
        ((List)localObject1).add(localObject3);
      if (!((List)localObject1).isEmpty())
      {
        localObject3 = new PluginTextPreference(this);
        ((PluginTextPreference)localObject3).yCV = 2131231915;
        ((PluginTextPreference)localObject3).NV(2131303212);
        this.ehK.b((Preference)localObject3);
      }
      str = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xRJ, "");
      Iterator localIterator = ((List)localObject1).iterator();
      for (localObject1 = null; localIterator.hasNext(); localObject1 = localObject3)
      {
        localObject4 = (PluginPreference)localIterator.next();
        ((PluginPreference)localObject4).lXY = 255;
        localObject3 = localObject1;
        if (str.contains(((PluginPreference)localObject4).qlc))
        {
          ((PluginPreference)localObject4).qlg = true;
          localObject3 = localObject1;
          if (localObject1 == null)
            localObject3 = localObject4;
        }
        this.ehK.b((Preference)localObject4);
      }
      bool2 = false;
      break;
      label759: j = 0;
      break label158;
      label765: if (!com.tencent.mm.au.b.ahM())
        break label172;
      ((List)localObject2).add(localObject3);
      break label172;
      j = 0;
      break label225;
      if (!com.tencent.mm.au.b.ahM())
        break label239;
      ((List)localObject2).add(localObject3);
      break label239;
      j = 0;
      break label283;
      if (!com.tencent.mm.au.b.ahL())
        break label297;
      ((List)localObject2).add(localObject3);
      break label297;
      j = 0;
      break label350;
      ((List)localObject2).add(localObject3);
      break label364;
      ((List)localObject2).add(localObject3);
      break label459;
    }
    Object localObject3 = new PreferenceSmallCategory(this);
    this.ehK.b((Preference)localObject3);
    localObject3 = new PluginTextPreference(this);
    ((PluginTextPreference)localObject3).yCV = 2131231916;
    ((PluginTextPreference)localObject3).NV(2131303220);
    this.ehK.b((Preference)localObject3);
    if (((List)localObject2).isEmpty())
    {
      localObject3 = new PluginEmptyTextPreference(this);
      this.ehK.b((Preference)localObject3);
    }
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = (PluginPreference)((Iterator)localObject2).next();
      ((PluginPreference)localObject4).lXY = 136;
      localObject3 = localObject1;
      if (str.contains(((PluginPreference)localObject4).qlc))
      {
        ((PluginPreference)localObject4).qlg = true;
        localObject3 = localObject1;
        if (localObject1 == null)
          localObject3 = localObject4;
      }
      this.ehK.b((Preference)localObject4);
      localObject1 = localObject3;
    }
    localObject3 = new PreferenceSmallCategory(this);
    this.ehK.b((Preference)localObject3);
    if (localObject1 != null)
      setSelection(this.ehK.aqQ(((Preference)localObject1).mKey));
    AppMethodBeat.o(127403);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI
 * JD-Core Version:    0.6.2
 */
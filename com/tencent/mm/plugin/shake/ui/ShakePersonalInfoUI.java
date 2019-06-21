package com.tencent.mm.plugin.shake.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.d;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.shake.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class ShakePersonalInfoUI extends MMPreference
{
  private f ehK;

  public final int JC()
  {
    return 2131165296;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(24772);
    paramf = paramPreference.mKey;
    if ("shake_item_default_bgimg".equals(paramf))
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(4110, Boolean.TRUE);
      h.bQ(this, getResources().getString(2131303462));
    }
    if ("shake_item_change_bgimg".equals(paramf))
      com.tencent.mm.pluginsdk.ui.tools.n.a(this, 1, null);
    if ("shake_item_sound".equals(paramf))
    {
      aw.ZK();
      bool = bo.d((Boolean)com.tencent.mm.model.c.Ry().get(4112, null));
      aw.ZK();
      paramPreference = com.tencent.mm.model.c.Ry();
      if (bool)
        break label255;
    }
    label255: for (boolean bool = true; ; bool = false)
    {
      paramPreference.set(4112, Boolean.valueOf(bool));
      if ("say_hi_list_shake_title".equals(paramf))
      {
        paramPreference = new Intent(this, ShakeSayHiListUI.class);
        paramPreference.putExtra("IntentSayHiType", 1);
        startActivity(paramPreference);
      }
      if ("shake_item_histoty_list".equals(paramf))
      {
        paramPreference = new Intent(this, ShakeItemListUI.class);
        paramPreference.putExtra("_key_show_type_", 100);
        paramPreference.putExtra("_key_title_", getString(2131303424));
        startActivity(paramPreference);
      }
      if ("shake_msg_list".equals(paramf))
      {
        paramf = new Intent(this, ShakeMsgListUI.class);
        paramf.putExtra("shake_msg_from", 2);
        paramf.putExtra("shake_msg_list_title", getString(2131303484));
        startActivity(paramf);
      }
      AppMethodBeat.o(24772);
      return false;
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(24769);
    setMMTitle(2131303425);
    this.ehK = this.yCw;
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("shake_item_sound");
    aw.ZK();
    if (com.tencent.mm.model.c.Ry().get(4112, null) == null)
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(4112, Boolean.TRUE);
    }
    aw.ZK();
    localCheckBoxPreference.uOT = bo.d((Boolean)com.tencent.mm.model.c.Ry().get(4112, null));
    setBackBtn(new ShakePersonalInfoUI.1(this));
    if (!d.aim())
      this.ehK.aqP("shake_item_shake_music_list");
    AppMethodBeat.o(24769);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(24773);
    switch (paramInt1)
    {
    default:
      AppMethodBeat.o(24773);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      if (paramIntent == null)
      {
        AppMethodBeat.o(24773);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("CropImageMode", 4);
        localIntent.putExtra("CropImage_Filter", true);
        localIntent.putExtra("CropImage_DirectlyIntoFilter", true);
        StringBuilder localStringBuilder = new StringBuilder();
        aw.ZK();
        localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.model.c.XW() + "custom_shake_img_filename.jpg");
        a.gkE.a(localIntent, 2, this, paramIntent);
        AppMethodBeat.o(24773);
        continue;
        if (paramIntent == null)
        {
          AppMethodBeat.o(24773);
        }
        else
        {
          paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(4110, Boolean.FALSE);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(4111, paramIntent);
          AppMethodBeat.o(24773);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24767);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(24767);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24768);
    a.gkF.BS();
    super.onDestroy();
    AppMethodBeat.o(24768);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(24771);
    boolean bool;
    if (paramInt == 4)
    {
      finish();
      bool = true;
      AppMethodBeat.o(24771);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(24771);
    }
  }

  public void onResume()
  {
    boolean bool = false;
    AppMethodBeat.i(24770);
    super.onResume();
    if (aw.RK())
      a.gkF.BS();
    if (this.ehK.aqO("shake_item_shake_tv_list") == null)
    {
      ab.e("MicroMsg.mmui.MMPreference", "shake_tv_list preference is null");
      AppMethodBeat.o(24770);
    }
    while (true)
    {
      return;
      if (bo.getInt(g.Nv().O("ShowConfig", "showShakeTV"), 0) == 1)
        bool = true;
      ab.d("MicroMsg.ConfigListDecoder", "isShowShakeTV : ".concat(String.valueOf(bool)));
      if ((!bool) && (!ae.giq))
        this.ehK.ce("shake_item_shake_tv_list", true);
      AppMethodBeat.o(24770);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI
 * JD-Core Version:    0.6.2
 */
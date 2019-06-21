package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.b.e;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class SettingsAboutTimelineUI extends MMPreference
{
  private String ecX = "";
  private f ehK;
  private boolean qmv = false;
  private boolean qmw = false;

  public final int JC()
  {
    return 2131165271;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(127139);
    paramf = paramPreference.mKey;
    if (paramf.equals("timline_outside_permiss"))
    {
      paramPreference = new Intent();
      paramPreference.putExtra("k_sns_tag_id", 4L);
      paramPreference.putExtra("k_sns_from_settings_about_sns", 1);
      d.b(this, "sns", ".ui.SnsBlackDetailUI", paramPreference);
    }
    if (paramf.equals("timeline_black_permiss"))
    {
      paramPreference = new Intent();
      paramPreference.putExtra("k_sns_tag_id", 5L);
      paramPreference.putExtra("k_sns_from_settings_about_sns", 2);
      d.b(this, "sns", ".ui.SnsTagDetailUI", paramPreference);
    }
    if (paramf.equals("timeline_stranger_show"))
      if (this.qmw)
        break label156;
    label156: for (boolean bool = true; ; bool = false)
    {
      this.qmw = bool;
      if (n.qFy != null)
        n.qFy.bh(this.ecX, this.qmw);
      this.qmv = true;
      AppMethodBeat.o(127139);
      return false;
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127141);
    this.ehK = this.yCw;
    setMMTitle(2131303199);
    setBackBtn(new SettingsAboutTimelineUI.1(this));
    this.ecX = r.Yz();
    AppMethodBeat.o(127141);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127137);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127137);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127140);
    super.onDestroy();
    ccl localccl;
    if ((this.qmv) && (n.qFy != null))
    {
      localccl = n.qFy.bi(this.ecX, this.qmw);
      if (localccl == null)
        AppMethodBeat.o(127140);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.SettingsAboutTimelineUI", "userinfo " + localccl.toString());
      ((j)g.K(j.class)).XL().c(new j.a(51, localccl));
      AppMethodBeat.o(127140);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(127138);
    super.onResume();
    Object localObject = new ccl();
    if (n.qFy != null)
      localObject = n.qFy.WX(this.ecX);
    if (localObject == null)
      ab.e("MicroMsg.SettingsAboutTimelineUI", "userinfo is null");
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(127138);
      return;
      int i = ((ccl)localObject).xbQ;
      localObject = (CheckBoxPreference)this.ehK.aqO("timeline_stranger_show");
      if (localObject != null)
      {
        if ((i & 0x1) > 0);
        SharedPreferences localSharedPreferences;
        for (boolean bool = true; ; bool = false)
        {
          this.qmw = bool;
          localSharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
          if (this.qmw)
            break label169;
          ((CheckBoxPreference)localObject).uOT = true;
          localSharedPreferences.edit().putBoolean("timeline_stranger_show", true).commit();
          break;
        }
        label169: ((CheckBoxPreference)localObject).uOT = false;
        localSharedPreferences.edit().putBoolean("timeline_stranger_show", false).commit();
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutTimelineUI
 * JD-Core Version:    0.6.2
 */
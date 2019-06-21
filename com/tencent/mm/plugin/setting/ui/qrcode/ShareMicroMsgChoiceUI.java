package com.tencent.mm.plugin.setting.ui.qrcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class ShareMicroMsgChoiceUI extends MMPreference
{
  private f ehK;

  public final int JC()
  {
    return 2131165297;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(126915);
    paramf = paramPreference.mKey;
    if (paramf.equals("share_micromsg_qzone"))
      if (bo.h((Integer)g.RP().Ry().get(9, null)) != 0)
      {
        paramf = new Intent(this, ShowQRCodeStep1UI.class);
        paramf.putExtra("show_to", 2);
        startActivity(paramf);
      }
    while (true)
    {
      AppMethodBeat.o(126915);
      return false;
      h.g(this, 2131302927, 2131297061);
      continue;
      if (paramf.equals("share_micromsg_to_sina"))
      {
        paramf = new Intent(this, ShowQRCodeStep1UI.class);
        paramf.putExtra("show_to", 3);
        startActivity(paramf);
      }
      else if (paramf.equals("share_micromsg_to_fuckbook"))
      {
        paramf = new Intent(this, ShowQRCodeStep1UI.class);
        paramf.putExtra("show_to", 4);
        startActivity(paramf);
      }
    }
  }

  public final boolean aqT()
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130970667;
  }

  public final void initView()
  {
    AppMethodBeat.i(126914);
    setMMTitle(2131302952);
    this.ehK = this.yCw;
    setBackBtn(new ShareMicroMsgChoiceUI.1(this));
    ((IconPreference)this.ehK.aqO("share_micromsg_to_sina")).drawable = a.g(this, 2130840185);
    ((j)g.K(j.class)).XU().RA("@t.qq.com");
    int i;
    IconPreference localIconPreference;
    if (bo.h((Integer)g.RP().Ry().get(9, null)) != 0)
    {
      i = 1;
      localIconPreference = (IconPreference)this.ehK.aqO("share_micromsg_qzone");
      if (i != 0)
        break label170;
      this.ehK.d(localIconPreference);
      label128: localIconPreference = (IconPreference)this.ehK.aqO("share_micromsg_to_fuckbook");
      if (!r.YX())
        break label183;
      localIconPreference.drawable = a.g(this, 2130840184);
      AppMethodBeat.o(126914);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label170: localIconPreference.drawable = a.g(this, 2130840109);
      break label128;
      label183: this.ehK.d(localIconPreference);
      AppMethodBeat.o(126914);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(126913);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(126913);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShareMicroMsgChoiceUI
 * JD-Core Version:    0.6.2
 */
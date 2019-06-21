package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.b.e;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.e.h;

final class SettingsPrivacyUI$2
  implements View.OnClickListener
{
  SettingsPrivacyUI$2(SettingsPrivacyUI paramSettingsPrivacyUI, LinearLayout paramLinearLayout)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127409);
    for (int i = 0; i < this.qmm.getChildCount(); i++)
    {
      localObject = (TextView)this.qmm.getChildAt(i);
      if (2131823800 != ((TextView)localObject).getId())
        ((TextView)localObject).setCompoundDrawablesWithIntrinsicBounds(2131231852, 0, 0, 0);
    }
    ((TextView)paramView).setCompoundDrawablesWithIntrinsicBounds(2131231853, 0, 0, 0);
    Object localObject = new ccl();
    if (n.qFy != null)
      localObject = n.qFy.WX(SettingsPrivacyUI.b(this.qoy));
    if (localObject == null)
    {
      ab.e("MicroMsg.SettingPrivacy", "userinfo is null");
      AppMethodBeat.o(127409);
    }
    while (true)
    {
      return;
      i = ((Integer)paramView.getTag()).intValue();
      ab.i("MicroMsg.SettingPrivacy", "settings_silence_update_mode choice: %d", new Object[] { Integer.valueOf(i) });
      if (i == 0)
      {
        if (SettingsPrivacyUI.c(this.qoy) == e.h.yga)
          h.pYm.e(14090, new Object[] { Integer.valueOf(4) });
        SettingsPrivacyUI.a(this.qoy, false);
        SettingsPrivacyUI.b(this.qoy, true);
        SettingsPrivacyUI.c(this.qoy, false);
        SettingsPrivacyUI.d(this.qoy);
      }
      while (true)
      {
        if (n.qFy != null)
          n.qFy.a(SettingsPrivacyUI.b(this.qoy), SettingsPrivacyUI.e(this.qoy), SettingsPrivacyUI.f(this.qoy), SettingsPrivacyUI.g(this.qoy), SettingsPrivacyUI.h(this.qoy));
        if (n.qFy == null)
          break label576;
        localObject = n.qFy.b(SettingsPrivacyUI.b(this.qoy), SettingsPrivacyUI.e(this.qoy), SettingsPrivacyUI.f(this.qoy), SettingsPrivacyUI.g(this.qoy), SettingsPrivacyUI.h(this.qoy));
        if (localObject != null)
          break label524;
        ab.e("MicroMsg.SettingPrivacy", "userinfo in null !");
        AppMethodBeat.o(127409);
        break;
        if (i == 1)
        {
          if (SettingsPrivacyUI.c(this.qoy) == e.h.yga)
            h.pYm.e(14090, new Object[] { Integer.valueOf(5) });
          SettingsPrivacyUI.a(this.qoy, true);
          SettingsPrivacyUI.b(this.qoy, false);
          SettingsPrivacyUI.c(this.qoy, false);
          SettingsPrivacyUI.d(this.qoy);
        }
        else if (i == 3)
        {
          SettingsPrivacyUI.a(this.qoy, false);
          SettingsPrivacyUI.b(this.qoy, false);
          SettingsPrivacyUI.c(this.qoy, true);
          SettingsPrivacyUI.d(this.qoy);
        }
        else
        {
          if (SettingsPrivacyUI.c(this.qoy) == e.h.yga)
            h.pYm.e(14090, new Object[] { Integer.valueOf(6) });
          SettingsPrivacyUI.a(this.qoy, false);
          SettingsPrivacyUI.b(this.qoy, false);
          SettingsPrivacyUI.c(this.qoy, false);
          SettingsPrivacyUI.d(this.qoy);
        }
      }
      label524: ab.d("MicroMsg.SettingPrivacy", "dancy userinfo " + localObject.toString());
      ((j)g.K(j.class)).XL().c(new j.a(51, (a)localObject));
      label576: paramView.post(new SettingsPrivacyUI.2.1(this));
      AppMethodBeat.o(127409);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI.2
 * JD-Core Version:    0.6.2
 */
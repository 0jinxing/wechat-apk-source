package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

final class SettingsAboutSystemUI$10
  implements View.OnClickListener
{
  SettingsAboutSystemUI$10(SettingsAboutSystemUI paramSettingsAboutSystemUI, LinearLayout paramLinearLayout)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 0;
    AppMethodBeat.i(127121);
    Object localObject;
    for (int j = 0; j < this.qmm.getChildCount(); j++)
    {
      localObject = (TextView)this.qmm.getChildAt(j);
      if (2131823800 != ((TextView)localObject).getId())
        ((TextView)localObject).setCompoundDrawablesWithIntrinsicBounds(2131231852, 0, 0, 0);
    }
    ((TextView)paramView).setCompoundDrawablesWithIntrinsicBounds(2131231853, 0, 0, 0);
    int k = ((Integer)g.RP().Ry().get(7, Integer.valueOf(0))).intValue();
    int m = ((Integer)paramView.getTag()).intValue();
    ab.d("MicroMsg.SettingsAboutSystemUI", "settings_silence_update_mode choice: %d", new Object[] { Integer.valueOf(m) });
    if (m == 0)
    {
      j = 1;
      if ((k & 0x1000000) != 0)
        break label160;
    }
    label160: for (int n = 1; ; n = 0)
    {
      if (j != n)
        break label166;
      AppMethodBeat.o(127121);
      return;
      j = 0;
      break;
    }
    label166: j = i;
    if (m == 0)
      j = 1;
    if (j != 0)
    {
      n = 0xFEFFFFFF & k;
      label186: if (j != 0)
        break label298;
    }
    label298: for (j = 1; ; j = 2)
    {
      g.RP().Ry().set(7, Integer.valueOf(n));
      localObject = new act();
      ((act)localObject).wkw = 35;
      ((act)localObject).pvD = j;
      ((j)g.K(j.class)).XL().c(new j.a(23, (a)localObject));
      b.gkF.BS();
      paramView.post(new SettingsAboutSystemUI.10.1(this));
      AppMethodBeat.o(127121);
      break;
      n = k | 0x1000000;
      break label186;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.10
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.e.b;

final class NormalUserFooterPreference$f$1
  implements View.OnClickListener
{
  NormalUserFooterPreference$f$1(NormalUserFooterPreference.f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23711);
    com.tencent.mm.plugin.normsg.a.b.oTO.ae(1, 1, 5);
    paramView = new Intent();
    paramView.putExtra("Contact_User", NormalUserFooterPreference.a(this.ppb.poR).field_username);
    paramView.putExtra("Contact_Scene", NormalUserFooterPreference.l(this.ppb.poR));
    paramView.putExtra(e.b.yfT, NormalUserFooterPreference.a(this.ppb.poR).dus);
    com.tencent.mm.plugin.profile.b.gkE.a(paramView, this.ppb.poR.mContext);
    AppMethodBeat.o(23711);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.f.1
 * JD-Core Version:    0.6.2
 */
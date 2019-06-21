package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.u;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

final class NormalUserFooterPreference$c$2
  implements View.OnClickListener
{
  NormalUserFooterPreference$c$2(NormalUserFooterPreference.c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23700);
    if (NormalUserFooterPreference.b(this.ppa.poR).getIntent() != null)
    {
      paramView = NormalUserFooterPreference.b(this.ppa.poR).getIntent().getStringExtra("key_ww_add_session_id");
      if (!bo.isNullOrNil(paramView))
      {
        u localu = new u();
        localu.eP(paramView);
        localu.cXR = 0L;
        localu.cXT = 1L;
        localu.ajK();
      }
    }
    this.ppa.cbs();
    if (NormalUserFooterPreference.E(this.ppa.poR) != 0)
      h.pYm.e(11263, new Object[] { Integer.valueOf(NormalUserFooterPreference.E(this.ppa.poR)), NormalUserFooterPreference.a(this.ppa.poR).field_username });
    AppMethodBeat.o(23700);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.c.2
 * JD-Core Version:    0.6.2
 */
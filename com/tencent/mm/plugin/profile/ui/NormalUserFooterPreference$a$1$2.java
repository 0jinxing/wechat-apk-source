package com.tencent.mm.plugin.profile.ui;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.profile.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class NormalUserFooterPreference$a$1$2
  implements n.c
{
  NormalUserFooterPreference$a$1$2(NormalUserFooterPreference.a.1 param1)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(23675);
    h.pYm.e(16055, new Object[] { Integer.valueOf(c.am(NormalUserFooterPreference.b(this.poT.poS.poR).getIntent())), Integer.valueOf(7) });
    if (ad.aox(NormalUserFooterPreference.a(this.poT.poS.poR).field_username))
    {
      paraml.ax(1, 2131298767, 2131231014);
      if (!NormalUserFooterPreference.a(this.poT.poS.poR).Oc())
        break label292;
      str = NormalUserFooterPreference.b(this.poT.poS.poR).getResources().getString(2131298740);
      label125: paraml.a(2, str, 2131231017);
      if (!ad.aox(NormalUserFooterPreference.a(this.poT.poS.poR).field_username))
        paraml.ax(3, 2131298604, 2131231005);
      paraml.ax(4, 2131298664, 2131231019);
      paraml.ax(9, 2131297652, 2131230987);
      if (!NormalUserFooterPreference.a(this.poT.poS.poR).Oa())
        break label317;
    }
    label292: label317: for (String str = NormalUserFooterPreference.b(this.poT.poS.poR).getString(2131298599); ; str = NormalUserFooterPreference.b(this.poT.poS.poR).getString(2131298594))
    {
      paraml.a(5, str, 2131230983);
      if (!NormalUserFooterPreference.c(this.poT.poS.poR))
        paraml.ax(6, 2131297533, 2131230990);
      paraml.ax(7, 2131298439, 2131230991);
      AppMethodBeat.o(23675);
      return;
      paraml.ax(1, 2131298589, 2131231014);
      break;
      str = NormalUserFooterPreference.b(this.poT.poS.poR).getResources().getString(2131298524);
      break label125;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.a.1.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class NormalUserFooterPreference$a$11$2
  implements n.c
{
  NormalUserFooterPreference$a$11$2(NormalUserFooterPreference.a.11 param11)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(23687);
    if (!this.poX.poV)
    {
      if (ad.aox(NormalUserFooterPreference.a(this.poX.poS.poR).field_username))
        paraml.ax(1, 2131298767, 2131231014);
    }
    else
    {
      if (this.poX.poW)
        break label140;
      if (!NormalUserFooterPreference.a(this.poX.poS.poR).Oa())
        break label108;
      paraml.ax(8, 2131298599, 2131230983);
      AppMethodBeat.o(23687);
    }
    while (true)
    {
      return;
      paraml.ax(1, 2131298589, 2131231014);
      break;
      label108: if (!t.mX(NormalUserFooterPreference.a(this.poX.poS.poR).field_username))
        paraml.ax(5, 2131298594, 2131230983);
      label140: AppMethodBeat.o(23687);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.a.11.2
 * JD-Core Version:    0.6.2
 */
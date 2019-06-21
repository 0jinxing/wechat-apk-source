package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.a;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.sdk.platformtools.bo;

final class SnsCommentDetailUI$25
  implements b.f
{
  SnsCommentDetailUI$25(SnsCommentDetailUI paramSnsCommentDetailUI, n paramn, aj paramaj)
  {
  }

  public final void b(b paramb, long paramLong)
  {
    AppMethodBeat.i(38807);
    if (SnsCommentDetailUI.r(this.rqN) == null)
      AppMethodBeat.o(38807);
    while (true)
    {
      return;
      int i = (int)paramb.cle();
      SnsCommentDetailUI.r(this.rqN).c(this.rhJ.field_snsId, bo.yz(), false);
      SnsCommentDetailUI.r(this.rqN).f(this.rhJ.field_snsId, i, false);
      if (paramLong >= 3L)
      {
        SnsCommentDetailUI.r(this.rqN).T(this.rhJ.field_snsId, this.rhJ.field_snsId);
        this.rqW.qzM.setOnDecodeDurationListener(null);
      }
      AppMethodBeat.o(38807);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.25
 * JD-Core Version:    0.6.2
 */
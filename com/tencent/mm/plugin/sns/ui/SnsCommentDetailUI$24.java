package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.storage.n;

final class SnsCommentDetailUI$24
  implements b.e
{
  SnsCommentDetailUI$24(SnsCommentDetailUI paramSnsCommentDetailUI, n paramn)
  {
  }

  public final void c(b paramb, int paramInt)
  {
    AppMethodBeat.i(38806);
    if (paramInt != -1)
      if (SnsCommentDetailUI.r(this.rqN) == null)
        AppMethodBeat.o(38806);
    while (true)
    {
      return;
      SnsCommentDetailUI.r(this.rqN).u(this.rhJ.field_snsId, false);
      AppMethodBeat.o(38806);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.24
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsStrangerCommentDetailUI$3
  implements SnsCommentFooter.b
{
  SnsStrangerCommentDetailUI$3(SnsStrangerCommentDetailUI paramSnsStrangerCommentDetailUI)
  {
  }

  public final void Zr(String paramString)
  {
    AppMethodBeat.i(39313);
    ab.v("MicroMsg.SnsStrangerCommentDetailUI", "comment send requested");
    SnsStrangerCommentDetailUI.a(this.rxw, true);
    SnsStrangerCommentDetailUI.a(this.rxw, SnsStrangerCommentDetailUI.k(this.rxw), paramString);
    AppMethodBeat.o(39313);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.3
 * JD-Core Version:    0.6.2
 */
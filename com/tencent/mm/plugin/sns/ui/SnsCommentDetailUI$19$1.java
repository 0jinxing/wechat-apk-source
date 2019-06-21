package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsCommentDetailUI$19$1
  implements Runnable
{
  SnsCommentDetailUI$19$1(SnsCommentDetailUI.19 param19, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38798);
    if ((this.fCJ) && (!this.rqO.rqN.isFinishing()) && (this.rqO.rqN.rqK < 5))
      this.rqO.rqN.csX();
    SnsCommentDetailUI localSnsCommentDetailUI = this.rqO.rqN;
    localSnsCommentDetailUI.rqK += 1;
    AppMethodBeat.o(38798);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.19.1
 * JD-Core Version:    0.6.2
 */
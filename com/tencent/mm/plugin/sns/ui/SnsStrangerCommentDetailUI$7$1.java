package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class SnsStrangerCommentDetailUI$7$1
  implements Runnable
{
  SnsStrangerCommentDetailUI$7$1(SnsStrangerCommentDetailUI.7 param7)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39317);
    ab.v("MicroMsg.SnsStrangerCommentDetailUI", "comment notify");
    SnsStrangerCommentDetailUI.d(this.rxx.rxw).a(null, null);
    if (SnsStrangerCommentDetailUI.e(this.rxx.rxw))
    {
      SnsStrangerCommentDetailUI.a(this.rxx.rxw, false);
      SnsStrangerCommentDetailUI localSnsStrangerCommentDetailUI = this.rxx.rxw;
      af.bCo().postDelayed(new SnsStrangerCommentDetailUI.8(localSnsStrangerCommentDetailUI), 10L);
    }
    AppMethodBeat.o(39317);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.7.1
 * JD-Core Version:    0.6.2
 */
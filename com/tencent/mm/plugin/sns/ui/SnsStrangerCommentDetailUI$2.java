package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class SnsStrangerCommentDetailUI$2
  implements Runnable
{
  int rro = -1;
  int rrp = 10;

  SnsStrangerCommentDetailUI$2(SnsStrangerCommentDetailUI paramSnsStrangerCommentDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39312);
    if (!SnsStrangerCommentDetailUI.h(this.rxw))
      this.rrp = 10;
    SnsStrangerCommentDetailUI.i(this.rxw);
    ab.e("MicroMsg.SnsStrangerCommentDetailUI", "list.bottom:" + SnsStrangerCommentDetailUI.a(this.rxw).getBottom() + " footer.top" + SnsStrangerCommentDetailUI.a(this.rxw).getTop());
    int i = SnsStrangerCommentDetailUI.j(this.rxw).getTop();
    int j = this.rrp;
    this.rrp = (j - 1);
    if ((j > 0) && ((this.rro != i) || (SnsStrangerCommentDetailUI.a(this.rxw).getBottom() == SnsStrangerCommentDetailUI.g(this.rxw))))
      new ak().postDelayed(this, 30L);
    this.rro = i;
    BackwardSupportUtil.c.b(SnsStrangerCommentDetailUI.a(this.rxw), SnsStrangerCommentDetailUI.a(this.rxw).getCount() - 1);
    AppMethodBeat.o(39312);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.2
 * JD-Core Version:    0.6.2
 */
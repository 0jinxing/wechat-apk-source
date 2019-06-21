package com.tencent.mm.ui.chatting.l.a;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.d;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.chatting.f.d.a;
import com.tencent.mm.ui.chatting.f.d.d;
import com.tencent.mm.ui.chatting.f.e;
import com.tencent.mm.ui.chatting.view.MMChattingListView;
import java.util.List;

public final class b extends a
{
  private long yNB;
  private int zam;

  public b(com.tencent.mm.ui.chatting.d.a parama, e parame)
  {
    super(parama, parame);
    AppMethodBeat.i(32717);
    this.yNB = ((d)this.cgL.aF(d.class)).dDz();
    AppMethodBeat.o(32717);
  }

  private int dHg()
  {
    AppMethodBeat.i(32719);
    int i = ((r)this.cgL.aF(r.class)).dEx();
    AppMethodBeat.o(32719);
    return i;
  }

  public final void a(MMChattingListView paramMMChattingListView, d.d<bi> paramd)
  {
    AppMethodBeat.i(32718);
    super.a(paramMMChattingListView, paramd);
    d.a locala = paramd.yYA;
    int i = paramd.yYB.size();
    int j = paramd.enb;
    int k;
    switch (b.1.yZG[locala.ordinal()])
    {
    case 3:
    default:
      ab.i("MicroMsg.ChattingLoader.ChattingBizDataPresenter", "[onViewUpdate] result:%s", new Object[] { paramd.toString() });
      paramd = this.cgL.getTalkerUserName();
      long l = ((j)g.K(j.class)).Yo().QQ(paramd);
      aw.ZK();
      k = com.tencent.mm.model.c.XO().s(paramd, 0L, l);
      ab.i("MicroMsg.ChattingLoader.ChattingBizDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", new Object[] { paramd, Long.valueOf(l), Integer.valueOf(k) });
      if (j - k > i)
        break;
    case 2:
    case 4:
    case 1:
    }
    for (boolean bool = true; ; bool = false)
    {
      paramMMChattingListView.setIsTopShowAll(bool);
      paramMMChattingListView.setIsBottomShowAll(true);
      AppMethodBeat.o(32718);
      return;
      paramMMChattingListView.qc(false);
      k = paramMMChattingListView.getCurCount();
      int m = paramMMChattingListView.getPreCount();
      k.a(paramMMChattingListView.getListView(), k - m + 1, dHg() + paramMMChattingListView.getTopHeight(), false);
      k = paramMMChattingListView.getCurCount() - paramMMChattingListView.getPreCount();
      if (k <= 0)
        break;
      ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).Ow(k);
      break;
      paramMMChattingListView.qd(false);
      k.a(paramMMChattingListView.getListView(), paramMMChattingListView.getPreCount() + 1, paramMMChattingListView.getListView().getHeight() - dHg(), false);
      break;
      this.cgL.qp(false);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.a.b
 * JD-Core Version:    0.6.2
 */
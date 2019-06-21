package com.tencent.mm.ui.chatting.f;

import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.chatting.c.b.q;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.view.MMChattingListView;

public final class b
  implements f<bi>
{
  private a cgL;
  private MMChattingListView yYq;
  public b.a yYr;

  public b(a parama, MMChattingListView paramMMChattingListView)
  {
    this.yYq = paramMMChattingListView;
    this.cgL = parama;
  }

  public final void a(d.d paramd)
  {
    AppMethodBeat.i(32479);
    if (!this.cgL.caA)
    {
      ab.e("MicroMsg.ChattingLoader.ChattingViewCallback", "[onViewUpdate] this ChattingUI has been in background!");
      AppMethodBeat.o(32479);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ChattingLoader.ChattingViewCallback", "[onViewUpdate] result:%s", new Object[] { paramd.toString() });
      if (this.cgL.yTx.keyboardState() == 1)
      {
        ab.i("MicroMsg.ChattingLoader.ChattingViewCallback", "keyboard is shown! scroll to last");
        this.cgL.qp(true);
      }
      if (paramd.yYA != d.a.yYu)
      {
        MMChattingListView localMMChattingListView = this.yYq;
        MMPullDownView.d((ViewGroup)localMMChattingListView.ywu, 4);
        MMPullDownView.d((ViewGroup)localMMChattingListView.yho, 4);
      }
      ((q)this.cgL.aF(q.class)).startTimer();
      if (this.yYr != null)
        this.yYr.a(this.yYq, paramd);
      AppMethodBeat.o(32479);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.f.b
 * JD-Core Version:    0.6.2
 */
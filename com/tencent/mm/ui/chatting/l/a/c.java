package com.tencent.mm.ui.chatting.l.a;

import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.chatting.c.b.s;
import com.tencent.mm.ui.chatting.f.d;
import com.tencent.mm.ui.chatting.f.d.a;
import com.tencent.mm.ui.chatting.f.d.d;
import com.tencent.mm.ui.chatting.l.b;
import com.tencent.mm.ui.chatting.l.e;
import com.tencent.mm.ui.chatting.view.MMChattingListView;
import java.util.List;

public final class c extends a
{
  private boolean zan = false;
  private boolean zao = false;

  public c(com.tencent.mm.ui.chatting.d.a parama, d paramd)
  {
    super(parama, paramd);
  }

  private int dHg()
  {
    AppMethodBeat.i(32728);
    int i = ((r)this.cgL.aF(r.class)).dEx();
    AppMethodBeat.o(32728);
    return i;
  }

  protected final e a(d.a parama, Bundle paramBundle, d.d paramd)
  {
    AppMethodBeat.i(32726);
    if ((paramBundle != null) && (paramBundle.getInt("SCENE") == 1));
    for (boolean bool = true; ; bool = false)
    {
      parama = new b(this.cgL.getTalkerUserName(), parama, paramBundle, this.zah, this.yZQ, this.yZR, this.zag, paramd, bool);
      AppMethodBeat.o(32726);
      return parama;
    }
  }

  public final void a(d.a parama, boolean paramBoolean, Bundle paramBundle)
  {
    boolean bool1 = true;
    AppMethodBeat.i(32725);
    Bundle localBundle1;
    Bundle localBundle2;
    if (parama == d.a.yYu)
    {
      localBundle1 = paramBundle;
      if (paramBundle == null)
        localBundle1 = new Bundle();
      if (this.zan)
      {
        ab.w("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "[onLoad] has tongue position before");
        localBundle1.putBoolean("has_position_tongue", true);
        localBundle2 = localBundle1;
      }
    }
    do
    {
      while (true)
      {
        super.a(parama, paramBoolean, localBundle2);
        AppMethodBeat.o(32725);
        return;
        localBundle2 = localBundle1;
        if (this.zao)
        {
          localBundle1.putBoolean("has_position_search", true);
          localBundle2 = localBundle1;
        }
      }
      localBundle2 = paramBundle;
    }
    while (parama != d.a.yYw);
    if ((paramBundle != null) && (paramBundle.getInt("SCENE") == 2))
    {
      bool2 = true;
      label126: this.zan = bool2;
      if ((paramBundle == null) || (paramBundle.getInt("SCENE") != 1))
        break label175;
    }
    label175: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.zao = bool2;
      ab.i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "[onLoad] has tongue position!");
      localBundle2 = paramBundle;
      break;
      bool2 = false;
      break label126;
    }
  }

  public final void a(MMChattingListView paramMMChattingListView, d.d<bi> paramd)
  {
    AppMethodBeat.i(32727);
    int i = paramd.yYB.size();
    int j = paramd.enb;
    int k = paramd.selection;
    SparseArray localSparseArray = paramd.yYD;
    d.a locala = paramd.yYA;
    bi localbi1 = (bi)localSparseArray.get(0);
    bi localbi2 = (bi)localSparseArray.get(localSparseArray.size() - 1);
    super.a(paramMMChattingListView, paramd);
    if (paramd.yYA != d.a.yYu)
      paramMMChattingListView.getListView().setTranscriptMode(0);
    if ((localSparseArray.size() <= 6) && (j > 6))
      ab.e("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "[onViewUpdate] may be err! talker:%s", new Object[] { this.cgL.getTalkerUserName() });
    long l1;
    int m;
    int n;
    switch (c.1.yZG[paramd.yYA.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
      label611: 
      do
      {
        while (true)
        {
          paramMMChattingListView.setIsTopShowAll(true);
          paramMMChattingListView.setIsBottomShowAll(true);
          l1 = 0L;
          if (localbi1 != null)
            l1 = localbi1.field_createTime;
          long l2 = 0L;
          if (localbi2 != null)
            l2 = localbi2.field_createTime;
          ab.i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "[onViewUpdate] talker:%s action:%s loadedCount:%s allCount:%s selection:%s lastTopCreateTime:%s lastBottomCreateTime:%s", new Object[] { this.cgL.getTalkerUserName(), locala, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l1), Long.valueOf(l2) });
          g.RS().aa(new c.a(this, paramMMChattingListView, this.cgL.getTalkerUserName(), l1, l2, (byte)0));
          AppMethodBeat.o(32727);
          return;
          paramMMChattingListView.qd(false);
          this.cgL.qp(true);
          continue;
          if ((paramd.yYz != null) && (paramd.yYz.getBoolean("need_scroll_to_bottom", false)))
          {
            paramMMChattingListView.qd(false);
            this.cgL.qp(true);
            this.zan = false;
          }
          this.zao = false;
        }
        if ((paramd.yYz != null) && (paramd.yYz.getBoolean("load_bottom", false)))
        {
          this.cgL.qp(true);
          ((s)this.cgL.aF(s.class)).dEA();
          ab.i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "after enter load bottom!");
        }
        while (true)
        {
          paramMMChattingListView.qd(false);
          break;
          m = paramMMChattingListView.getPreCount() + 1;
          n = paramMMChattingListView.getListView().getHeight() - dHg() - paramMMChattingListView.getBottomHeight();
          this.cgL.ho(m, n);
          ab.i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "selection:" + m + " offset:" + n + " curCount:" + paramMMChattingListView.getCurCount() + " preCount:" + paramMMChattingListView.getPreCount());
        }
        if ((paramd.yYz != null) && (paramd.yYz.getInt("SCENE") == 1));
        for (n = 1; ; n = 0)
        {
          if (n == 0)
            break label611;
          Pj(paramd.selection);
          ab.i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "isFromSearch! selection:" + paramd.selection);
          break;
        }
      }
      while (paramd.yYz == null);
      paramMMChattingListView.a(false, null);
      l1 = paramd.yYz.getLong("MSG_ID", 0L);
      n = localSparseArray.size() - 1;
      label646: if (n >= 0)
      {
        bi localbi3 = (bi)localSparseArray.get(n);
        if ((localbi3 == null) || (localbi3.field_msgId != l1))
          break;
      }
      break;
    case 5:
    }
    while (true)
    {
      n = Math.max(0, n);
      paramd.selection = n;
      ((h)this.cgL.aF(h.class)).Ov(paramd.selection);
      Pj(paramd.selection);
      ab.i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "pos:" + n + " msgId:" + l1);
      break;
      n--;
      break label646;
      paramMMChattingListView.qc(false);
      m = paramMMChattingListView.getCurCount() - paramMMChattingListView.getPreCount();
      this.cgL.ho(m + 1, dHg() + paramMMChattingListView.getTopHeight());
      n = paramMMChattingListView.getCurCount() - paramMMChattingListView.getPreCount();
      ab.i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "select:" + m + " curCount:" + paramMMChattingListView.getCurCount() + " preCount:" + paramMMChattingListView.getPreCount());
      if (n <= 0)
        break;
      ((h)this.cgL.aF(h.class)).Ow(n);
      break;
      n = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.a.c
 * JD-Core Version:    0.6.2
 */
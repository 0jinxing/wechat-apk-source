package com.tencent.mm.ui.chatting.l.a;

import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.chatting.f.d.a;
import com.tencent.mm.ui.chatting.f.d.d;
import com.tencent.mm.ui.chatting.view.MMChattingListView;
import java.util.List;

public final class d extends a
{
  private int zam = 0;
  private volatile long zaw = 0L;
  private volatile long zax = 0L;
  private volatile long zay = 0L;

  public d(com.tencent.mm.ui.chatting.d.a parama, com.tencent.mm.ui.chatting.f.e parame)
  {
    super(parama, parame);
  }

  private int dHg()
  {
    AppMethodBeat.i(32733);
    int i = ((r)this.cgL.aF(r.class)).dEx();
    AppMethodBeat.o(32733);
    return i;
  }

  protected final com.tencent.mm.ui.chatting.l.e a(d.a parama, Bundle paramBundle, d.d paramd)
  {
    AppMethodBeat.i(32731);
    Object localObject = null;
    aw.ZK();
    int i = com.tencent.mm.model.c.XO().Rp(this.cgL.getTalkerUserName());
    switch (d.2.yZG[parama.ordinal()])
    {
    default:
      parama = localObject;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    int j;
    int k;
    label209: boolean bool;
    while (true)
    {
      this.zam = i;
      AppMethodBeat.o(32731);
      while (true)
      {
        return parama;
        parama = new com.tencent.mm.ui.chatting.l.c(this.cgL.getTalkerUserName(), 16, i);
        break;
        parama = new com.tencent.mm.ui.chatting.l.c(this.cgL.getTalkerUserName(), this.zag + 48, i);
        break;
        j = i - this.zam;
        parama = this.cgL.getTalkerUserName();
        k = this.zag;
        if (j > 0);
        while (true)
        {
          parama = new com.tencent.mm.ui.chatting.l.c(parama, j + k, i);
          break;
          j = 0;
        }
        if (paramBundle != null)
          break label209;
        ab.w("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "null == sourceArgs!");
        parama = null;
        AppMethodBeat.o(32731);
      }
      if (paramBundle.getInt("SCENE", 0) != 1)
        break label628;
      ab.i("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "[handlePositionForSearch]");
      if (paramBundle == null)
      {
        ab.w("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "[handleEnter] sourceArgs is null!");
        parama = new com.tencent.mm.ui.chatting.l.d(this.cgL.getTalkerUserName(), this.zaw, this.zax);
      }
      else
      {
        parama = this.cgL.getTalkerUserName();
        l = paramBundle.getLong("MSG_ID");
        bool = paramBundle.getBoolean("IS_LOAD_ALL", false);
        aw.ZK();
        paramBundle = com.tencent.mm.model.c.XO().jf(l);
        if (paramBundle.field_msgId == l)
          break;
        ab.w("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "get msg info by id %d error", new Object[] { Long.valueOf(l) });
        parama = new com.tencent.mm.ui.chatting.l.d(this.cgL.getTalkerUserName(), this.zaw, this.zax);
      }
    }
    long l = paramBundle.field_createTime;
    if ((l < this.zaw) || (l > this.zax))
    {
      this.zaw = l;
      this.zay = ((j)g.K(j.class)).bOr().Rt(parama);
      if (bool)
      {
        this.zax = this.zay;
        label427: aw.ZK();
        j = com.tencent.mm.model.c.XO().s(parama, this.zaw, this.zax);
        ab.v("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "reset position, reload count %d", new Object[] { Integer.valueOf(j) });
        if (j >= 48)
          break label749;
        ab.d("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "reload count less than on scene, bottom not more data, try up to load more data, and reset selection, old top msg create time %d, old selection %d", new Object[] { Long.valueOf(this.zaw), Integer.valueOf(0) });
        aw.ZK();
        this.zaw = com.tencent.mm.model.c.XO().f(parama, this.zaw, 48);
        aw.ZK();
        j = com.tencent.mm.model.c.XO().s(parama, this.zaw, l);
      }
    }
    while (true)
    {
      paramd.selection = j;
      parama = new com.tencent.mm.ui.chatting.l.d(this.cgL.getTalkerUserName(), this.zaw, this.zax);
      break;
      aw.ZK();
      this.zax = com.tencent.mm.model.c.XO().g(parama, l, 48);
      break label427;
      aw.ZK();
      j = com.tencent.mm.model.c.XO().s(parama, this.zaw, l);
      continue;
      label628: parama = localObject;
      if (paramBundle.getInt("SCENE", 0) != 2)
        break;
      if (paramBundle == null)
      {
        ab.e("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "[handlePositionForTongue] sourceArgs == null");
        parama = new com.tencent.mm.ui.chatting.l.c(this.cgL.getTalkerUserName(), this.zag, i);
        break;
      }
      k = paramBundle.getInt("MSG_POSITION");
      j = i - k;
      ab.i("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "[handlePositionForTongue] totalCount:%s position:%s count:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j) });
      parama = new com.tencent.mm.ui.chatting.l.c(this.cgL.getTalkerUserName(), j, i);
      break;
      label749: j = 0;
    }
  }

  public final void a(MMChattingListView paramMMChattingListView, d.d<bi> paramd)
  {
    AppMethodBeat.i(32732);
    super.a(paramMMChattingListView, paramd);
    d.a locala = paramd.yYA;
    Object localObject = paramd.yYD;
    int i = paramd.yYB.size();
    int j = paramd.enb;
    final int k = paramd.selection;
    final Bundle localBundle = paramd.yYz;
    bi localbi = (bi)((SparseArray)localObject).get(0);
    localObject = (bi)((SparseArray)localObject).get(((SparseArray)localObject).size() - 1);
    if (localbi != null)
      this.zaw = localbi.field_createTime;
    if (localObject != null)
      this.zax = ((cy)localObject).field_createTime;
    switch (d.2.yZG[locala.ordinal()])
    {
    case 3:
    default:
      if (locala != d.a.yYv)
      {
        ab.i("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "[onViewUpdate] mode:%s lastTopMsgCreateTime:%s lastBottomMsgCreateTime:%s loadedCount:%s allCount:%s selection:%s", new Object[] { locala, Long.valueOf(this.zaw), Long.valueOf(this.zax), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        paramd = this.cgL.getTalkerUserName();
        long l = ((j)g.K(j.class)).Yo().QQ(paramd);
        aw.ZK();
        k = com.tencent.mm.model.c.XO().s(paramd, 0L, l);
        ab.i("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", new Object[] { paramd, Long.valueOf(l), Integer.valueOf(k) });
        if (j - k > i)
          break label511;
      }
      break;
    case 2:
    case 5:
    case 1:
    case 4:
    }
    label511: for (boolean bool = true; ; bool = false)
    {
      paramMMChattingListView.setIsTopShowAll(bool);
      paramMMChattingListView.setIsBottomShowAll(true);
      AppMethodBeat.o(32732);
      return;
      paramMMChattingListView.qc(false);
      int m = paramMMChattingListView.getCurCount();
      int n = paramMMChattingListView.getPreCount();
      k.a(paramMMChattingListView.getListView(), m - n + 1, dHg() + paramMMChattingListView.getTopHeight(), false);
      m = paramMMChattingListView.getCurCount() - paramMMChattingListView.getPreCount();
      if (m <= 0)
        break;
      ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).Ow(m);
      break;
      paramMMChattingListView.qd(false);
      k.a(paramMMChattingListView.getListView(), paramMMChattingListView.getPreCount() + 1, paramMMChattingListView.getListView().getHeight() - dHg(), false);
      break;
      this.cgL.qp(false);
      break;
      k = localBundle.getInt("MSG_POSITION");
      k = Math.max(0, paramMMChattingListView.getCurCount() - (paramd.enb - k));
      paramd.selection = k;
      paramMMChattingListView.getListView().post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(32729);
          com.tencent.mm.ui.chatting.c.b.h localh = (com.tencent.mm.ui.chatting.c.b.h)d.this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
          if (localBundle.getInt("SCENE", 0) == 1)
          {
            d.this.Pj(k);
            AppMethodBeat.o(32729);
          }
          while (true)
          {
            return;
            if (localBundle.getInt("SCENE", 0) == 2)
            {
              localh.Ov(k);
              d.this.cgL.bY(k);
            }
            AppMethodBeat.o(32729);
          }
        }
      });
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.a.d
 * JD-Core Version:    0.6.2
 */
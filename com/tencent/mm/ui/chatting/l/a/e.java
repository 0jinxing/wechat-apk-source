package com.tencent.mm.ui.chatting.l.a;

import android.os.Bundle;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.chatting.f.d.a;
import com.tencent.mm.ui.chatting.f.d.d;
import com.tencent.mm.ui.chatting.view.MMChattingListView;

public final class e extends a
{
  private String talker;
  private boolean zaB;
  private Runnable zaC;
  private volatile long zaw;
  private volatile long zax;
  private volatile long zay;

  public e(com.tencent.mm.ui.chatting.d.a parama, com.tencent.mm.ui.chatting.f.d paramd)
  {
    super(parama, paramd);
    AppMethodBeat.i(32736);
    this.zaw = 0L;
    this.zax = 0L;
    this.zay = 0L;
    this.talker = this.cgL.getTalkerUserName();
    ab.i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[ChattingSearchDataPresenter] talker:%s", new Object[] { this.talker });
    AppMethodBeat.o(32736);
  }

  private int dHg()
  {
    AppMethodBeat.i(32739);
    int i = ((r)this.cgL.aF(r.class)).dEx();
    AppMethodBeat.o(32739);
    return i;
  }

  protected final com.tencent.mm.ui.chatting.l.e a(d.a parama, Bundle paramBundle, d.d paramd)
  {
    AppMethodBeat.i(32737);
    int i;
    int j;
    long l;
    switch (e.2.yZG[parama.ordinal()])
    {
    default:
      i = 0;
      j = 0;
    case 1:
    case 2:
      while (true)
      {
        ab.i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "mode[%s] query topCreateTime[%d] downCreateTime[%d], lastCreateTime[%d], topInc[%d], bottomInc[%d]", new Object[] { parama, Long.valueOf(this.zaw), Long.valueOf(this.zax), Long.valueOf(this.zay), Integer.valueOf(j), Integer.valueOf(i) });
        parama = new com.tencent.mm.ui.chatting.l.d(this.cgL.getTalkerUserName(), this.zaw, this.zax);
        AppMethodBeat.o(32737);
        return parama;
        if (paramBundle == null)
        {
          ab.w("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[handleEnter] sourceArgs is null!");
          i = 0;
          j = 0;
        }
        else
        {
          l = paramBundle.getLong("MSG_ID");
          this.zaB = paramBundle.getBoolean("IS_LOAD_ALL", false);
          aw.ZK();
          paramBundle = c.XO().jf(l);
          if (paramBundle.field_msgId == l)
            break;
          ab.w("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "get msg info by id %d error", new Object[] { Long.valueOf(l) });
          i = 0;
          j = 0;
        }
      }
      l = paramBundle.field_createTime;
      if ((l < this.zaw) || (l > this.zax))
      {
        this.zaw = l;
        this.zay = ((j)g.K(j.class)).bOr().Rt(this.talker);
        if (this.zaB)
        {
          this.zax = this.zay;
          label312: aw.ZK();
          i = c.XO().s(this.talker, this.zaw, this.zax);
          ab.v("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "reset position, reload count %d", new Object[] { Integer.valueOf(i) });
          if (i >= 48)
            break label818;
          ab.d("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "reload count less than on scene, bottom not more data, try up to load more data, and reset selection, old top msg create time %d, old selection %d", new Object[] { Long.valueOf(this.zaw), Integer.valueOf(0) });
          aw.ZK();
          this.zaw = c.XO().f(this.talker, this.zaw, 48);
          aw.ZK();
          i = c.XO().s(this.talker, this.zaw, l);
        }
      }
      break;
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      paramd.selection = i;
      i = 0;
      j = 0;
      break;
      aw.ZK();
      this.zax = c.XO().g(this.talker, l, 48);
      break label312;
      aw.ZK();
      i = c.XO().s(this.talker, this.zaw, l);
      continue;
      aw.ZK();
      l = c.XO().f(this.talker, this.zaw, 48);
      aw.ZK();
      j = Math.max(0, c.XO().s(this.talker, l, this.zaw) - 1);
      this.zaw = l;
      i = 0;
      break;
      aw.ZK();
      l = c.XO().g(this.talker, this.zax, 48);
      aw.ZK();
      i = Math.max(0, c.XO().s(this.talker, this.zax, l) - 1);
      this.zax = l;
      j = 0;
      break;
      this.zay = ((j)g.K(j.class)).bOr().Rt(this.talker);
      aw.ZK();
      i = Math.max(0, c.XO().s(this.talker, this.zax, this.zay) - 1);
      if ((this.zaB) || (i <= 480));
      for (this.zax = this.zay; ; this.zax = this.zay)
      {
        do
        {
          j = 0;
          break;
          paramBundle = ((j)g.K(j.class)).bOr().Rb(this.talker);
        }
        while ((paramBundle.field_isSend != 1) || (this.zay == paramBundle.field_createTime));
        this.zay = paramBundle.field_createTime;
        aw.ZK();
        this.zaw = c.XO().f(this.talker, this.zaw, 48);
      }
      label818: i = 0;
    }
  }

  public final void a(MMChattingListView paramMMChattingListView, d.d<bi> paramd)
  {
    boolean bool1 = true;
    AppMethodBeat.i(32738);
    super.a(paramMMChattingListView, paramd);
    Object localObject = paramd.yYA;
    int i = paramd.selection;
    paramMMChattingListView.getListView().setTranscriptMode(0);
    switch (e.2.yZG[localObject.ordinal()])
    {
    default:
      if (this.cgL.getLastVisiblePosition() == paramd.yYC - 1)
        paramMMChattingListView.getListView().setTranscriptMode(1);
      paramMMChattingListView.setBottomViewVisible(true);
      long l = ((j)g.K(j.class)).bOr().Rs(this.talker);
      ab.i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[isShowTopAll] firstMsgCreateTime:%s lastTopMsgCreateTime:%s", new Object[] { Long.valueOf(l), Long.valueOf(this.zaw) });
      if (this.zaw <= l)
      {
        bool2 = true;
        label167: paramMMChattingListView.setIsTopShowAll(bool2);
        if (this.zax < this.zay)
          break label430;
      }
      break;
    case 3:
    case 4:
    case 1:
    case 2:
    }
    label430: for (boolean bool2 = bool1; ; bool2 = false)
    {
      paramMMChattingListView.setIsBottomShowAll(bool2);
      AppMethodBeat.o(32738);
      return;
      paramMMChattingListView.qc(false);
      i = paramMMChattingListView.getCurCount();
      int j = paramMMChattingListView.getPreCount();
      k.a(paramMMChattingListView.getListView(), i - j + 1, dHg() + paramMMChattingListView.getTopHeight(), false);
      i = paramMMChattingListView.getCurCount() - paramMMChattingListView.getPreCount();
      if (i <= 0)
        break;
      ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).Ow(i);
      break;
      paramMMChattingListView.qd(false);
      k.a(paramMMChattingListView.getListView(), paramMMChattingListView.getPreCount() + 1, paramMMChattingListView.getListView().getHeight() - dHg(), false);
      break;
      if (i < 0)
        break;
      bool2 = this.cgL.yTx.getBooleanExtra("need_hight_item", false).booleanValue();
      Pj(i);
      if (!bool2)
        break;
      this.cgL.yTx.getLongExtra("msg_local_id", -1L);
      ab.i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[matteHighLightItem] position:%s", new Object[] { Integer.valueOf(i) });
      al.af(this.zaC);
      localObject = new e.1(this, i, paramMMChattingListView);
      this.zaC = ((Runnable)localObject);
      al.n((Runnable)localObject, 500L);
      break;
      bool2 = false;
      break label167;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.a.e
 * JD-Core Version:    0.6.2
 */
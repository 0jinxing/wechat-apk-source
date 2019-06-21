package com.tencent.mm.ui.chatting.c;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.af;
import com.tencent.mm.ui.chatting.c.b.ac;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.chatting.c.b.s;
import com.tencent.mm.ui.chatting.c.b.z;

@com.tencent.mm.ui.chatting.c.a.a(dFp=ac.class)
@Deprecated
public final class ak extends a
  implements be.a, ac
{
  public static int yRY = 350;
  public boolean yRZ;
  public boolean ySa;
  public boolean ySb;
  private com.tencent.mm.sdk.b.c ySc;
  private boolean ySd;

  public final void a(com.tencent.mm.storage.ak paramak, be parambe)
  {
    AppMethodBeat.i(31715);
    ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify cvs.getUsername[%s] tid[%d]", new Object[] { paramak.field_username, Long.valueOf(Thread.currentThread().getId()) });
    if (!this.cgL.caA)
    {
      ab.w("MicroMsg.ChattingUI.SilenceMsgComponent", "[onMsgChangeNotify] ChattingUI is not in Foreground!!");
      AppMethodBeat.o(31715);
    }
    int i;
    bi localbi1;
    while (true)
    {
      return;
      if ((!this.cgL.dFx()) || (!this.cgL.sRl.field_username.equals(paramak.field_username)))
        break label1110;
      parambe = (com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
      i = paramak.field_msgCount;
      j = parambe.dCP();
      ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify newCvsCount[%d], total[%d], dealHistoryGetMsg[%b], UnDeliverCount[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(this.yRZ), Integer.valueOf(paramak.field_UnDeliverCount) });
      if (i <= j)
        break label1110;
      localbi1 = paramak.xXq;
      if ((localbi1 == null) || (localbi1.field_msgId == 0L))
      {
        AppMethodBeat.o(31715);
      }
      else
      {
        if (i - j > 1)
          this.ySd = true;
        k = localbi1.field_flag;
        ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify receive get msg svrId[%d], seq[%d], flag[%d], stack[%s]", new Object[] { Long.valueOf(localbi1.field_msgSvrId), Long.valueOf(localbi1.field_msgSeq), Integer.valueOf(k), bo.dpG() });
        if ((k & 0x2) == 0)
        {
          AppMethodBeat.o(31715);
        }
        else if ((this.cgL.getListView() == null) || (parambe == null) || (this.cgL.yTz == null))
        {
          ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr something is null %s %s %s", new Object[] { this.cgL.getListView(), parambe, this.cgL.yTz });
          AppMethodBeat.o(31715);
        }
        else
        {
          if ((k & 0x4) != 0)
            break label763;
          ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify down dealHistoryGetMsg: %b", new Object[] { Boolean.valueOf(this.yRZ) });
          if (!this.yRZ)
            break;
          ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify down but dealHistoryGetMsg so ignore");
          AppMethodBeat.o(31715);
        }
      }
    }
    int k = this.cgL.getFirstVisiblePosition();
    int m = parambe.getCount();
    int n = parambe.getCount();
    int i1 = n - m;
    ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify down talker[%s],firstVisiblePosition:%d, new oldTotal[%d,%d,%d], now preCount:[%d,%d,%d] fromcount:%d, needCheckHistoryTips:%b", new Object[] { this.cgL.sRl.field_username, Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(i - j), Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(i1), Integer.valueOf(0), Boolean.valueOf(this.ySa) });
    if (i1 > 1)
    {
      paramak = this.cgL.getListView();
      j = paramak.getFirstVisiblePosition();
      i = paramak.getChildCount();
      if ((k >= j) && (k <= i + j - 1))
        break label741;
      paramak = paramak.getAdapter().getView(k, null, paramak);
      label592: if (paramak != null)
        break label754;
    }
    label741: label754: for (int j = 0; ; j = paramak.getTop())
    {
      i = j - this.cgL.yTz.getBottomHeight();
      this.cgL.getListView().setAdapter(this.cgL.getListView().getAdapter());
      this.cgL.ho(k, i);
      ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition %s firstView %s scrollY %s %s", new Object[] { Integer.valueOf(k), paramak, Integer.valueOf(j), Integer.valueOf(i) });
      this.cgL.getListView().post(new ak.2(this, k, i, parambe));
      this.cgL.getListView().postDelayed(new ak.3(this, k, i, parambe), 200L);
      AppMethodBeat.o(31715);
      break;
      paramak = paramak.getChildAt(k - j);
      break label592;
    }
    label763: m = this.cgL.getFirstVisiblePosition();
    i1 = this.cgL.getLastVisiblePosition();
    bi localbi2 = parambe.Ou(m);
    bi localbi3 = parambe.Ou(i1);
    n = parambe.getCount();
    int i2 = parambe.getCount();
    k = i - j;
    int i3 = i2 - n;
    ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up talker[%s],new oldTotal[%d,%d,%d], now preCount:[%d,%d,%d] fromcount:%d needCheckHistoryTips:%b", new Object[] { this.cgL.sRl.field_username, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i2), Integer.valueOf(n), Integer.valueOf(i3), Integer.valueOf(0), Boolean.valueOf(this.ySa) });
    if ((localbi3 != null) && (localbi3.field_msgId != 0L) && (localbi3.field_createTime < localbi1.field_createTime))
      ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr lastVisibleMsg getCreateTime < lastInsert msg");
    while (true)
    {
      this.cgL.yTz.dCB();
      if (paramak.field_UnDeliverCount <= 0)
        ((s)this.cgL.aF(s.class)).dEz();
      if (this.ySa)
      {
        this.ySa = false;
        this.cgL.yTz.setIsBottomShowAll(false);
        boolean bool = ((z)this.cgL.aF(z.class)).dES();
        this.cgL.yTz.setBottomViewVisible(bool);
        this.cgL.yTz.qd(false);
        ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify set needCheckHistoryTips[%b]", new Object[] { Boolean.valueOf(this.ySa) });
        com.tencent.mm.ui.chatting.d.a.dFz().postDelayed(new ak.5(this, paramak), 500L);
      }
      label1110: AppMethodBeat.o(31715);
      break;
      if (i3 > 0)
      {
        parambe.Ow(i3);
        long l1;
        if (localbi2 == null)
        {
          l1 = -1L;
          label1142: if (localbi3 != null)
            break label1313;
        }
        label1313: for (long l2 = -1L; ; l2 = localbi3.field_createTime)
        {
          ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition %s, lastVisiblePosition %s, createtime[%s, %s, %s]", new Object[] { Integer.valueOf(m), Integer.valueOf(i1), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(localbi1.field_createTime) });
          ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up nowCount > preCount on set select:%d position %d, firstVisiblePosition %s", new Object[] { Integer.valueOf(i3), Integer.valueOf(i3 + 1), Integer.valueOf(m) });
          this.cgL.ho(i3 + 1, ((r)this.cgL.aF(r.class)).dEx() + this.cgL.yTz.getTopHeight());
          al.d(new ak.4(this, i3));
          break;
          l1 = localbi2.field_createTime;
          break label1142;
        }
      }
      ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up incTotal incCount[%d, %d, %d] keep same", new Object[] { Integer.valueOf(k), Integer.valueOf(i3), Integer.valueOf(0) });
    }
  }

  public final void bk(bi parambi)
  {
    AppMethodBeat.i(31716);
    long l1;
    boolean bool;
    Object localObject;
    long l2;
    label77: int i;
    label96: long l3;
    int j;
    if ((parambi != null) && (parambi.field_msgId != 0L))
    {
      l1 = parambi.field_msgSeq;
      if ((parambi.field_flag & 0x4) == 0)
        break label339;
      bool = true;
      aw.ZK();
      localObject = com.tencent.mm.model.c.XR().aoZ(this.cgL.sRl.field_username);
      if (localObject == null)
        break label367;
      if (!bool)
        break label345;
      l2 = ((at)localObject).field_firstUnDeliverSeq;
      if ((!bool) || (l2 != 0L))
        break label361;
      i = ((at)localObject).field_UnDeliverCount;
      l3 = l2;
      j = i;
      if (bool)
      {
        l3 = l2;
        j = i;
        if (l2 > l1)
        {
          localObject = ((j)g.K(j.class)).bOr().ae(this.cgL.sRl.field_username, l1);
          l3 = l2;
          j = i;
          if (localObject != null)
          {
            l3 = l2;
            j = i;
            if (((cy)localObject).field_msgSeq < l1)
            {
              ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr getChatroomMsgWithFaultMsg revised filterSeq[%d] to [%d]", new Object[] { Long.valueOf(l2), Long.valueOf(((cy)localObject).field_msgSeq) });
              l3 = ((cy)localObject).field_msgSeq;
              j = i;
            }
          }
        }
      }
    }
    while (true)
    {
      ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr getChatroomMsgWithFaultMsg filterSeq[%d], lastSeq[%d], needCount[%d], flag[%d], up[%b]", new Object[] { Long.valueOf(l3), Long.valueOf(l1), Integer.valueOf(j), Integer.valueOf(parambi.field_flag), Boolean.valueOf(bool) });
      this.yRZ = false;
      parambi = this.cgL.sRl.field_username;
      int k = (int)l3;
      int m = (int)l1;
      if (bool);
      for (i = 1; ; i = 0)
      {
        new com.tencent.mm.plugin.chatroom.a.a(parambi, k, m, j, i);
        AppMethodBeat.o(31716);
        return;
        label339: bool = false;
        break;
        label345: l2 = ((at)localObject).field_lastSeq;
        break label77;
      }
      label361: i = 0;
      break label96;
      label367: j = 0;
      l3 = 0L;
    }
  }

  public final void dxB()
  {
  }

  public final void dxC()
  {
    AppMethodBeat.i(31719);
    com.tencent.mm.sdk.b.a.xxA.d(this.ySc);
    aw.ZK();
    com.tencent.mm.model.c.XR().b(this);
    AppMethodBeat.o(31719);
  }

  public final void dxx()
  {
    AppMethodBeat.i(31718);
    this.yRZ = false;
    this.ySb = this.cgL.dFx();
    this.yRZ = false;
    this.ySa = false;
    AppMethodBeat.o(31718);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(31717);
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 0);
    label716: label722: label875: label889: label895: 
    while (true)
    {
      Object localObject;
      try
      {
        paramAbsListView = this.cgL.getChildAt(this.cgL.getFirstVisiblePosition());
        if ((paramAbsListView != null) && (paramAbsListView.getTop() == 0))
        {
          ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange forceTopLoadData true");
          if (!this.cgL.dFx())
            break label875;
          paramAbsListView = ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).Ou(0);
          if ((paramAbsListView != null) && (paramAbsListView.field_msgId != 0L))
          {
            ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange check fault[%d, %d, %d, %d, %d, %d, %d, %s]", new Object[] { Integer.valueOf(paramAbsListView.field_flag), Integer.valueOf(paramAbsListView.field_isSend), Long.valueOf(paramAbsListView.field_msgId), Long.valueOf(paramAbsListView.field_msgSvrId), Long.valueOf(paramAbsListView.field_msgSeq), Long.valueOf(paramAbsListView.field_createTime), Integer.valueOf(paramAbsListView.getType()), paramAbsListView.field_talker });
            if (((paramAbsListView.field_flag & 0x1) != 0) && ((paramAbsListView.field_flag & 0x4) != 0))
              this.cgL.yTz.dCA();
          }
          AppMethodBeat.o(31717);
          return;
        }
        if ((!this.cgL.dFx()) || (this.cgL.getChildAt(this.cgL.getListView().getChildCount() - 1) == null))
          break label875;
        localObject = (com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
        if (this.cgL.getLastVisiblePosition() != this.cgL.getListView().getAdapter().getCount() - 1)
          break label875;
        paramAbsListView = null;
        paramInt = 1;
        if (paramInt >= 5)
          break label895;
        paramAbsListView = ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).Ou(((com.tencent.mm.ui.chatting.c.b.h)localObject).getCount() - paramInt);
        if ((paramAbsListView != null) && (paramAbsListView.field_msgId != 0L) && ((paramAbsListView.field_flag & 0x1) != 0))
        {
          ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault found i[%s]", new Object[] { Integer.valueOf(paramInt) });
          if ((paramAbsListView == null) || (paramAbsListView.field_msgId == 0L))
            break label716;
          localObject = ((j)g.K(j.class)).bOr().R(paramAbsListView.field_talker, paramAbsListView.field_msgSeq);
          if ((((cy)localObject).field_msgId == 0L) || (((cy)localObject).field_msgId != paramAbsListView.field_msgId) || ((((cy)localObject).field_flag & 0x1) != 0))
            continue;
          ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange found msg not fault msgId[%s] flag[%s]", new Object[] { Long.valueOf(((cy)localObject).field_msgId), Integer.valueOf(((cy)localObject).field_flag) });
          AppMethodBeat.o(31717);
          continue;
        }
      }
      catch (Exception paramAbsListView)
      {
        ab.printErrStackTrace("MicroMsg.ChattingUI.SilenceMsgComponent", paramAbsListView, "silenceMsgImp handleIdelScrollChange", new Object[0]);
        AppMethodBeat.o(31717);
        continue;
        paramInt++;
        continue;
        ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault[%d, %d, %d, %d, %d, %d, %d, %s]", new Object[] { Integer.valueOf(paramAbsListView.field_flag), Integer.valueOf(paramAbsListView.field_isSend), Long.valueOf(paramAbsListView.field_msgId), Long.valueOf(paramAbsListView.field_msgSvrId), Long.valueOf(paramAbsListView.field_msgSeq), Long.valueOf(paramAbsListView.field_createTime), Integer.valueOf(paramAbsListView.getType()), paramAbsListView.field_talker });
        if (((paramAbsListView.field_flag & 0x1) != 0) && ((paramAbsListView.field_flag & 0x4) == 0))
        {
          ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange forceBottomLoadData");
          this.cgL.yTz.setIsBottomShowAll(false);
          this.cgL.yTz.setBottomViewVisible(true);
          this.cgL.yTz.qd(true);
          ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault found");
          localObject = aw.RS();
          ak.1 local1 = new com/tencent/mm/ui/chatting/c/ak$1;
          local1.<init>(this, paramAbsListView);
          ((al)localObject).aa(local1);
          AppMethodBeat.o(31717);
          continue;
        }
        AppMethodBeat.o(31717);
        continue;
      }
      if (paramAbsListView != null)
      {
        paramInt = 1;
        if ((paramAbsListView.field_flag & 0x2) == 0)
          break label889;
      }
      for (int i = 1; ; i = 0)
      {
        if ((i & paramInt) != 0)
        {
          aw.ZK();
          localObject = com.tencent.mm.model.c.XO().Rb(paramAbsListView.field_talker);
          if ((localObject != null) && (((cy)localObject).field_msgId != 0L) && (((cy)localObject).field_createTime > paramAbsListView.field_createTime))
            ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault[%d, %d, %d, %d, %d, %d, %d, %s] not need notify", new Object[] { Integer.valueOf(((cy)localObject).field_flag), Integer.valueOf(((cy)localObject).field_isSend), Long.valueOf(((cy)localObject).field_msgId), Long.valueOf(((cy)localObject).field_msgSvrId), Long.valueOf(((cy)localObject).field_msgSeq), Long.valueOf(((cy)localObject).field_createTime), Integer.valueOf(((bi)localObject).getType()), ((cy)localObject).field_talker });
        }
        AppMethodBeat.o(31717);
        break;
        paramInt = 0;
        break label722;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ak
 * JD-Core Version:    0.6.2
 */
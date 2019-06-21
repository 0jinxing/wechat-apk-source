package com.tencent.mm.ui.chatting.c;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aq.a.1;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.j.a.a.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.w;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.p;
import com.tencent.mm.ui.chatting.c.b.s;
import com.tencent.mm.ui.chatting.f.d.a;
import java.util.HashSet;

@com.tencent.mm.ui.chatting.c.a.a(dFp=p.class)
public class r extends a
  implements n.b, p
{
  private Handler mMainHandler;
  private r.a yPZ;
  private HashSet<String> yQa;
  private volatile bi yQb;
  private com.tencent.mm.ui.chatting.c.b.h yQc;

  public r()
  {
    AppMethodBeat.i(31445);
    this.yQa = new HashSet();
    this.mMainHandler = new r.3(this, Looper.getMainLooper());
    AppMethodBeat.o(31445);
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(31452);
    paramn = (b.a)paramObject;
    paramObject = paramn.username;
    boolean bool = paramn.oqE;
    if (!paramObject.equals(this.cgL.getTalkerUserName()))
      AppMethodBeat.o(31452);
    while (true)
    {
      return;
      ab.i("MicroMsg.GetChatroomComponent", "[onNotifyChange] talker:%s id:%s isInsertForWrap:%s", new Object[] { this.cgL.getTalkerUserName(), Integer.valueOf(paramn.id), Boolean.valueOf(paramn.oqE) });
      if ((paramInt == 4) && (!bool))
      {
        ab.i("MicroMsg.GetChatroomComponent", "[onNotifyChange] resetDataPresenter! username:".concat(String.valueOf(paramObject)));
        this.mMainHandler.sendEmptyMessage(8);
      }
      if ((!bool) && ((paramInt == 2) || (paramInt == 4)))
      {
        paramn = ((j)g.K(j.class)).bOm().QN(this.cgL.getTalkerUserName());
        long l1 = paramn.field_lastPushSeq;
        long l2 = paramn.field_lastLocalSeq;
        com.tencent.mm.aq.b.agG().a(this.cgL.getTalkerUserName(), l2 + 1L, l1, 0, null);
      }
      AppMethodBeat.o(31452);
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31449);
    super.dDh();
    ((j)g.K(j.class)).bOm().b(this);
    AppMethodBeat.o(31449);
  }

  public final boolean dEi()
  {
    AppMethodBeat.i(31450);
    boolean bool = ((j)g.K(j.class)).bOm().QL(this.cgL.getTalkerUserName());
    AppMethodBeat.o(31450);
    return bool;
  }

  public final void dEj()
  {
    boolean bool1 = false;
    AppMethodBeat.i(31451);
    if (this.yQb == null)
    {
      ab.e("MicroMsg.GetChatroomComponent", "[goBackToHistory] null == mLastSeqMsg! talker:%s", new Object[] { this.cgL.getTalkerUserName() });
      AppMethodBeat.o(31451);
      return;
    }
    long l1 = System.currentTimeMillis();
    c localc = ((j)g.K(j.class)).bOm().f(this.cgL.getTalkerUserName(), this.yQb.field_createTime, false);
    Object localObject = bo.anv(this.yQb.field_content);
    boolean bool2;
    label102: int i;
    if (localc == null)
    {
      bool2 = true;
      ab.i("MicroMsg.GetChatroomComponent", "[goBackToHistory] msgInfo content:%s null == seqBlock?:%s time:%s", new Object[] { localObject, Boolean.valueOf(bool2), Long.valueOf(this.yQb.field_createTime) });
      if (localc != null)
        break label493;
      if (this.yQc == null)
        this.yQc = ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class));
      i = ((s)this.cgL.aF(s.class)).dEy();
      if (this.yQc.getCount() < i)
        break label452;
      localObject = this.yQc.Ou(this.yQc.getCount() - 1);
      if (localObject != null)
        break label362;
      ab.w("MicroMsg.GetChatroomComponent", "[findPosition] msg is null");
      label234: i = 0;
      ab.i("MicroMsg.GetChatroomComponent", "[goBackToHistory] findPosition:%s", new Object[] { Integer.valueOf(i) });
      this.cgL.bY(i);
      ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).Ov(i);
    }
    while (true)
    {
      ((s)this.cgL.aF(s.class)).dEz();
      long l2 = System.currentTimeMillis();
      bool2 = bool1;
      if (localc == null)
        bool2 = true;
      ab.i("MicroMsg.GetChatroomComponent", "[goBackToHistory] cost:%s null == seqBlock?:%s", new Object[] { Long.valueOf(l2 - l1), Boolean.valueOf(bool2) });
      AppMethodBeat.o(31451);
      break;
      bool2 = false;
      break label102;
      label362: l2 = ((j)g.K(j.class)).bOr().f(this.cgL.getTalkerUserName(), ((cy)localObject).field_createTime, i);
      for (i = this.yQc.getCount() - 1; ; i--)
      {
        if (i < 0)
          break label450;
        localObject = this.yQc.Ou(i);
        if ((localObject != null) && (((cy)localObject).field_createTime == l2))
          break;
      }
      label450: break label234;
      label452: localObject = new Bundle();
      ((Bundle)localObject).putInt("MSG_POSITION_UNREAD_COUNT", i);
      this.cgL.yTx.dBQ().a(d.a.yYw, true, (Bundle)localObject);
      break label234;
      label493: this.cgL.bY(0);
      this.cgL.getListView().postDelayed(new r.2(this), 166L);
    }
  }

  public final void dxC()
  {
    AppMethodBeat.i(31448);
    super.dxC();
    if (!this.cgL.dFx())
      AppMethodBeat.o(31448);
    while (true)
    {
      return;
      d.xDG.remove(this.yPZ);
      ((j)g.K(j.class)).bOm().b(this);
      if (!this.yQa.contains(this.cgL.getTalkerUserName()))
      {
        d.post(new a.1(com.tencent.mm.aq.a.agF(), this.cgL.getTalkerUserName()), "checkDirtyBlock");
        this.yQa.add(this.cgL.getTalkerUserName());
      }
      AppMethodBeat.o(31448);
    }
  }

  public final void dxx()
  {
    AppMethodBeat.i(31446);
    super.dxx();
    if (!this.cgL.dFx())
      AppMethodBeat.o(31446);
    while (true)
    {
      return;
      g.RS().aa(new r.1(this));
      AppMethodBeat.o(31446);
    }
  }

  public final void dxy()
  {
    AppMethodBeat.i(31447);
    super.dxy();
    if (!this.cgL.dFx())
      AppMethodBeat.o(31447);
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      ((j)g.K(j.class)).bOm().a(this, g.RS().oAl.getLooper());
      this.yPZ = new r.a(this, this.cgL.getTalkerUserName(), (byte)0);
      d.g(this.yPZ, "[GetChatroomComponent]");
      ab.i("MicroMsg.GetChatroomComponent", "[onChattingEnterAnimStart] cost:%sms talker:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), this.cgL.getTalkerUserName() });
      AppMethodBeat.o(31447);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.r
 * JD-Core Version:    0.6.2
 */
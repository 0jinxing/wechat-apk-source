package com.tencent.mm.ui.chatting.c;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.n;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.expt.roomexpt.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;

final class k$7
  implements Runnable
{
  k$7(k paramk, String paramString, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    boolean bool = false;
    AppMethodBeat.i(31350);
    int i;
    Object localObject1;
    Object localObject2;
    int j;
    int k;
    int m;
    int n;
    if (!bo.isNullOrNil(this.yPn))
    {
      i = n.mA(this.yPn);
      aw.ZK();
      localObject1 = c.XO().w(this.yPn, k.b(this.yPk), k.c(this.yPk));
      if ((localObject1 == null) || (!((Cursor)localObject1).moveToFirst()))
        break label494;
      localObject2 = new bi();
      j = 0;
      k = 0;
      do
      {
        ((bi)localObject2).d((Cursor)localObject1);
        if (((cy)localObject2).field_isSend != 1)
          break;
        m = k + 1;
        n = j;
        j = n;
        k = m;
      }
      while (((Cursor)localObject1).moveToNext());
    }
    while (true)
    {
      if (localObject1 != null)
        ((Cursor)localObject1).close();
      ab.d("MicroMsg.ChattingUI.ChattingReportComponent", "dkchatmsg MuteRoomKvStat, muteRoomName:%s, stayTime:%d, memberNum:%d, newMsg:%d, sendMsgNum:%d, unreadMsgNum:%d, backToHistoryState:%d, isMute:%d  ,session:%s", new Object[] { this.yPn, Long.valueOf(k.c(this.yPk) - k.b(this.yPk)), Integer.valueOf(i), Integer.valueOf(k.a(this.yPk) + n), Integer.valueOf(m), Integer.valueOf(k.a(this.yPk)), Integer.valueOf(this.yPo), Integer.valueOf(this.yPp), this.yPk.cgL.dFt() });
      com.tencent.mm.plugin.report.service.h.pYm.e(12077, new Object[] { this.yPn, Long.valueOf(k.c(this.yPk) - k.b(this.yPk)), Integer.valueOf(i), Integer.valueOf(n + k.a(this.yPk)), Integer.valueOf(m), Integer.valueOf(k.a(this.yPk)), Integer.valueOf(this.yPo), Integer.valueOf(this.yPp), this.yPk.cgL.dFt(), Integer.valueOf(k.d(this.yPk)) });
      localObject2 = s.mJ(this.yPn);
      d locald = (d)g.K(d.class);
      localObject1 = this.yPn;
      long l1 = k.c(this.yPk);
      long l2 = k.b(this.yPk);
      n = k.a(this.yPk);
      if (this.yPp == 1)
        bool = true;
      locald.a((String)localObject1, (String)localObject2, l1 - l2, n, m, bool);
      AppMethodBeat.o(31350);
      return;
      n = j + 1;
      m = k;
      break;
      label494: n = 0;
      m = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.k.7
 * JD-Core Version:    0.6.2
 */
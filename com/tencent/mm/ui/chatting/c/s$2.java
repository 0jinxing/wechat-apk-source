package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.d;
import com.tencent.mm.at.e;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelcontrol.c;
import com.tencent.mm.plugin.comm.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.h;

final class s$2
  implements ap.a
{
  s$2(s params)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(31455);
    if (this.yQh.cgL == null)
      AppMethodBeat.o(31455);
    while (true)
    {
      return false;
      boolean bool = com.tencent.mm.plugin.priority.a.a.a.a.bZv();
      int i = this.yQh.cgL.getFirstVisiblePosition();
      int j = this.yQh.cgL.getHeaderViewsCount();
      int k = this.yQh.cgL.getLastVisiblePosition();
      int m = this.yQh.cgL.getHeaderViewsCount();
      h localh = (h)this.yQh.cgL.aF(h.class);
      i = Math.max(i - j, 0);
      m = Math.max(Math.min(k - m, localh.getCount()), 0);
      ab.d("MicroMsg.ChattingUI.GetImageComponent", "first: " + i + " last: " + m);
      if (m < i)
      {
        ab.d("MicroMsg.ChattingUI.GetImageComponent", "start timer to wait listview refresh");
        s.a(this.yQh).ae(1000L, 1000L);
        AppMethodBeat.o(31455);
      }
      else
      {
        o.ahm().fDr = true;
        while (i <= m)
        {
          bi localbi = localh.Ou(i);
          if ((localbi != null) && (localbi.field_isSend == 0) && (localbi.drE()))
          {
            e locale = o.ahl().fI(localbi.field_msgSvrId);
            if ((!locale.agP()) && (localbi.dJF != 2))
              if (localbi.dJF != 1)
              {
                if (bool)
                {
                  c.afC();
                  if (!c.u(localbi));
                }
              }
              else
                ((b)com.tencent.mm.kernel.g.K(b.class)).a(localbi, new s.a(this.yQh, localbi, locale, i));
          }
          i++;
        }
        o.ahm().agN();
        AppMethodBeat.o(31455);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.s.2
 * JD-Core Version:    0.6.2
 */
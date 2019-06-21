package com.tencent.mm.ui.chatting.i;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.chatting.a.c.c;
import com.tencent.mm.ui.chatting.e.b.b;
import com.tencent.mm.ui.gridviewheaders.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

final class d$1
  implements Runnable
{
  d$1(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32538);
    LinkedList localLinkedList = new LinkedList();
    aw.ZK();
    Cursor localCursor = com.tencent.mm.model.c.XO().cu(this.yZh.emo, this.yZh.eot);
    if (localCursor == null)
    {
      ab.e("MicroMsg.FileHistoryListPresenter", "[loadData] cursor is null!");
      AppMethodBeat.o(32538);
      return;
    }
    if (t.kH(this.yZh.emo))
      aw.ZK();
    Object localObject2;
    for (u localu = com.tencent.mm.model.c.XV().oa(this.yZh.emo); ; localObject2 = null)
      while (true)
      {
        long l1 = 0L;
        try
        {
          while (localCursor.moveToNext())
          {
            bi localbi = new com/tencent/mm/storage/bi;
            localbi.<init>();
            localbi.d(localCursor);
            Object localObject3 = localbi.field_content;
            if (localObject3 != null)
            {
              j.b localb = j.b.me((String)localObject3);
              if (localb != null)
              {
                if (6 == localb.type);
                for (int i = 1; i != 0; i = 0)
                {
                  localObject3 = new java/util/Date;
                  ((Date)localObject3).<init>(localbi.field_createTime);
                  long l2 = a.dJg().b((Date)localObject3);
                  if (l1 != l2)
                  {
                    localObject3 = new com/tencent/mm/ui/chatting/a/c$c;
                    ((c.c)localObject3).<init>(localbi.field_createTime);
                    localLinkedList.add(localObject3);
                    localObject3 = this.yZh;
                    ((d)localObject3).yZg += 1;
                  }
                  Object localObject4 = d.b(localbi, t.kH(this.yZh.emo));
                  ad localad = ((j)g.K(j.class)).XM().aoO((String)localObject4);
                  localObject3 = "";
                  if (localu != null)
                    localObject3 = localu.mJ((String)localObject4);
                  i = com.tencent.mm.plugin.fav.ui.c.LX(localb.fgp);
                  localObject4 = new com/tencent/mm/ui/chatting/i/d$a;
                  ((d.a)localObject4).<init>(this.yZh, localbi.field_createTime, localb.type, localb.title, localbi.field_msgId, localad.field_username, localad.Oi(), localad.field_conRemark, (String)localObject3);
                  ((d.a)localObject4).iconRes = i;
                  ((d.a)localObject4).desc = bo.ga(localb.fgo);
                  localLinkedList.add(localObject4);
                  l1 = l2;
                  break;
                }
              }
            }
          }
          localCursor.close();
          this.yZh.iPr.addAll(localLinkedList);
          this.yZh.yZa = this.yZh.iPr;
          localLinkedList.clear();
          ab.i("MicroMsg.FileHistoryListPresenter", "[loadData] data:%s", new Object[] { Integer.valueOf(this.yZh.iPr.size()) });
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(32537);
              if (d.1.this.yZh.yYY != null)
                d.1.this.yZh.yYY.p(d.1.this.kve, d.1.this.yZh.iPr.size());
              AppMethodBeat.o(32537);
            }
          });
          AppMethodBeat.o(32538);
          break;
        }
        finally
        {
          localCursor.close();
          AppMethodBeat.o(32538);
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.d.1
 * JD-Core Version:    0.6.2
 */
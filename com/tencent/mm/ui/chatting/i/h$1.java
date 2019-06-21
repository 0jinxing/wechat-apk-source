package com.tencent.mm.ui.chatting.i;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fav.a.b;
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
import java.util.HashSet;
import java.util.LinkedList;

final class h$1
  implements Runnable
{
  h$1(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32641);
    LinkedList localLinkedList = new LinkedList();
    aw.ZK();
    Cursor localCursor = com.tencent.mm.model.c.XO().cu(this.yZB.emo, this.yZB.eot);
    if (localCursor == null)
    {
      ab.e("MicroMsg.UrlHistoryListPresenter", "[loadData] cursor is null!");
      AppMethodBeat.o(32641);
      return;
    }
    if (t.kH(this.yZB.emo))
      aw.ZK();
    for (u localu = com.tencent.mm.model.c.XV().oa(this.yZB.emo); ; localu = null)
    {
      long l1 = 0L;
      try
      {
        while (localCursor.moveToNext())
        {
          bi localbi = new com/tencent/mm/storage/bi;
          localbi.<init>();
          localbi.d(localCursor);
          Object localObject1 = localbi.field_content;
          if (localObject1 != null)
          {
            j.b localb = j.b.me((String)localObject1);
            if (localb != null)
            {
              localObject1 = this.yZB;
              int i = localb.type;
              ((h)localObject1).getType();
              if (((h)localObject1).yZA.contains(Integer.valueOf(i)))
              {
                localObject1 = new java/util/Date;
                ((Date)localObject1).<init>(localbi.field_createTime);
                long l2 = a.dJg().b((Date)localObject1);
                if (l1 != l2)
                {
                  localObject1 = new com/tencent/mm/ui/chatting/a/c$c;
                  ((c.c)localObject1).<init>(localbi.field_createTime);
                  localLinkedList.add(localObject1);
                  localObject1 = this.yZB;
                  ((h)localObject1).yZg += 1;
                }
                localObject1 = h.b(localbi, t.kH(this.yZB.emo));
                ad localad = ((j)g.K(j.class)).XM().aoO((String)localObject1);
                String str = "";
                if (localu != null)
                  str = localu.mJ((String)localObject1);
                i = com.tencent.mm.plugin.fav.ui.c.LX(localb.fgp);
                localObject1 = b.getAppName(this.yZB.mContext, localb.cMg);
                aw.ZK();
                Object localObject3 = com.tencent.mm.model.c.XM().aoO(localb.cMg);
                if ((localObject3 == null) || (!((ap)localObject3).field_username.equals(localb.cMg)))
                {
                  ao.a.flu.a(localb.cMg, "", null);
                  label390: localObject3 = new com/tencent/mm/ui/chatting/i/h$a;
                  ((h.a)localObject3).<init>(this.yZB, localbi.field_createTime, localb.type, localb.title, localbi.field_msgId, localad.field_username, localad.Oi(), localad.field_conRemark, str);
                  if (!bo.isNullOrNil((String)localObject1))
                    break label525;
                  localObject1 = localb.description;
                  label456: ((h.a)localObject3).source = ((String)localObject1);
                  ((h.a)localObject3).appId = localb.appId;
                  if (!bo.isNullOrNil(localbi.field_imgPath))
                    break label528;
                }
                label525: label528: for (((h.a)localObject3).imagePath = localb.thumburl; ; ((h.a)localObject3).imagePath = localbi.field_imgPath)
                {
                  ((h.a)localObject3).iconRes = i;
                  localLinkedList.add(localObject3);
                  l1 = l2;
                  break;
                  localObject1 = ((ad)localObject3).Oj();
                  break label390;
                  break label456;
                }
              }
            }
          }
        }
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(32641);
      }
      localCursor.close();
      this.yZB.iPr.addAll(localLinkedList);
      this.yZB.yZa = this.yZB.iPr;
      localLinkedList.clear();
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(32640);
          if (h.1.this.yZB.yYY != null)
            h.1.this.yZB.yYY.p(h.1.this.kve, h.1.this.yZB.iPr.size());
          AppMethodBeat.o(32640);
        }
      });
      AppMethodBeat.o(32641);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.h.1
 * JD-Core Version:    0.6.2
 */
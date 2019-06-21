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
import com.tencent.mm.ui.gridviewheaders.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

final class f$1
  implements Runnable
{
  f$1(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32611);
    LinkedList localLinkedList = new LinkedList();
    aw.ZK();
    Cursor localCursor = com.tencent.mm.model.c.XO().cu(this.yZt.emo, this.yZt.eot);
    if (localCursor == null)
    {
      ab.e("MicroMsg.MusicHistoryListPresenter", "[loadData] cursor is null!");
      AppMethodBeat.o(32611);
      return;
    }
    if (t.kH(this.yZt.emo))
      aw.ZK();
    for (u localu = com.tencent.mm.model.c.XV().oa(this.yZt.emo); ; localu = null)
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
            Object localObject1 = localbi.field_content;
            if (localObject1 != null)
            {
              j.b localb = j.b.me((String)localObject1);
              if (localb != null)
              {
                int i;
                label156: long l2;
                Object localObject3;
                if (3 == localb.type)
                {
                  i = 1;
                  if (i != 0)
                  {
                    localObject1 = new java/util/Date;
                    ((Date)localObject1).<init>(localbi.field_createTime);
                    l2 = a.dJg().b((Date)localObject1);
                    if (l1 != l2)
                    {
                      localObject1 = new com/tencent/mm/ui/chatting/a/c$c;
                      ((c.c)localObject1).<init>(localbi.field_createTime);
                      localLinkedList.add(localObject1);
                      localObject1 = this.yZt;
                      ((f)localObject1).yZg += 1;
                    }
                    localObject1 = f.b(localbi, t.kH(this.yZt.emo));
                    ad localad = ((j)g.K(j.class)).XM().aoO((String)localObject1);
                    String str = "";
                    if (localu != null)
                      str = localu.mJ((String)localObject1);
                    i = com.tencent.mm.plugin.fav.ui.c.LX(localb.fgp);
                    localObject1 = b.getAppName(this.yZt.mContext, localb.cMg);
                    aw.ZK();
                    localObject3 = com.tencent.mm.model.c.XM().aoO(localb.cMg);
                    if ((localObject3 == null) || (!((ap)localObject3).field_username.equals(localb.cMg)))
                    {
                      ao.a.flu.a(localb.cMg, "", null);
                      label372: localObject3 = new com/tencent/mm/ui/chatting/i/f$a;
                      ((f.a)localObject3).<init>(this.yZt, localbi.field_createTime, localb.type, localb.title, localbi.field_msgId, localad.field_username, localad.Oi(), localad.field_conRemark, str);
                      if (!bo.isNullOrNil((String)localObject1))
                        break label502;
                      localObject1 = localb.description;
                    }
                  }
                }
                else
                {
                  label502: 
                  while (true)
                  {
                    ((f.a)localObject3).source = ((String)localObject1);
                    ((f.a)localObject3).appId = localb.appId;
                    ((f.a)localObject3).imagePath = localbi.field_imgPath;
                    ((f.a)localObject3).iconRes = i;
                    localLinkedList.add(localObject3);
                    l1 = l2;
                    break;
                    i = 0;
                    break label156;
                    localObject1 = ((ad)localObject3).Oj();
                    break label372;
                  }
                }
              }
            }
          }
          localCursor.close();
          this.yZt.iPr.addAll(localLinkedList);
          this.yZt.yZa = this.yZt.iPr;
          localLinkedList.clear();
          al.d(new f.1.1(this));
          AppMethodBeat.o(32611);
          break;
        }
        finally
        {
          localCursor.close();
          AppMethodBeat.o(32611);
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.f.1
 * JD-Core Version:    0.6.2
 */
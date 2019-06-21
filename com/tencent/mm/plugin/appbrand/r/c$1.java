package com.tencent.mm.plugin.appbrand.r;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.u;
import java.util.LinkedList;

final class c$1
  implements Runnable
{
  c$1(String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(93771);
    c.aNP().clear();
    if (t.kH(this.ewn));
    label509: Object localObject2;
    for (u localu = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(this.ewn); ; localObject2 = null)
    {
      int i = 100;
      int j = 0;
      while (i >= 100)
      {
        Cursor localCursor = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().cv(this.ewn, j);
        if (localCursor != null);
        while (true)
        {
          Object localObject3;
          try
          {
            i = localCursor.getCount();
            if ((localCursor == null) || (!localCursor.moveToNext()))
              break;
            bi localbi = new com/tencent/mm/storage/bi;
            localbi.<init>();
            localbi.setMsgId(localCursor.getLong(0));
            localbi.eI(localCursor.getLong(1));
            localbi.eJ(localCursor.getLong(2));
            localbi.setContent(localCursor.getString(3));
            localbi.hO(localCursor.getInt(4));
            localbi.jv(localCursor.getString(5));
            str = localbi.field_content;
            if (str == null)
              continue;
            j.b localb = j.b.me(str);
            if ((localb == null) || (!c.pY(localb.type)))
              continue;
            localObject3 = c.a(localbi, t.kH(this.ewn), this.ewn);
            Object localObject4 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO((String)localObject3);
            str = "";
            if (localu != null)
              str = localu.mJ((String)localObject3);
            localObject3 = new com/tencent/mm/plugin/appbrand/r/e;
            ((e)localObject3).<init>(localbi.field_createTime, localb.type, localb.title, localbi.field_msgId, ((ap)localObject4).field_username, ((ad)localObject4).Oi(), ((ap)localObject4).field_conRemark, str, bo.bc(localb.fiQ, localb.appId), localb, localbi.field_msgSvrId);
            ((e)localObject3).desc = localb.title;
            localObject4 = ((d)com.tencent.mm.kernel.g.K(d.class)).zb(((e)localObject3).cJM.fiP);
            if (localObject4 == null)
              break label509;
            str = ((WxaAttributes)localObject4).field_nickname;
            ((e)localObject3).title = str;
            if (localObject4 == null)
              break label522;
            str = ((WxaAttributes)localObject4).field_brandIconURL;
            ((e)localObject3).imagePath = str;
            if (localb.fiR != 1)
            {
              str = o.ahl().c(localbi.field_imgPath, false, true);
              if (!bo.isNullOrNil(str))
                ((e)localObject3).iQW = "file://".concat(String.valueOf(str));
            }
            c.aNP().add(localObject3);
            continue;
          }
          finally
          {
            if (localCursor != null)
              localCursor.close();
            AppMethodBeat.o(93771);
          }
          i = 0;
          continue;
          String str = ((e)localObject3).cJM.cMh;
          continue;
          label522: str = ((e)localObject3).cJM.fjb;
        }
        if (localCursor != null)
          localCursor.close();
        j += i;
      }
      ab.i("MicroMsg.AppBrandHistoryListLogic", "[loadData] data:%s", new Object[] { Integer.valueOf(c.aNP().size()) });
      al.d(new c.1.1(this));
      AppMethodBeat.o(93771);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.c.1
 * JD-Core Version:    0.6.2
 */
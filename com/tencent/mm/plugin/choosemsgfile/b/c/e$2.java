package com.tencent.mm.plugin.choosemsgfile.b.c;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.choosemsgfile.b.b.i;
import com.tencent.mm.plugin.choosemsgfile.b.b.k;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.gridviewheaders.a;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class e$2
  implements Runnable
{
  e$2(e parame, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(54347);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = ((j)g.K(j.class)).bOr().cu(this.kuZ.edV, -1);
    if (localCursor == null)
    {
      ab.e("MicroMsg.ChooseMsgFileListUIController", "[loadData] cursor is null!");
      AppMethodBeat.o(54347);
      return;
    }
    List localList = b.HJ(this.kvd);
    long l1 = 0L;
    label387: label393: 
    while (true)
    {
      try
      {
        if (localCursor.moveToNext())
        {
          bi localbi = new com/tencent/mm/storage/bi;
          localbi.<init>();
          localbi.d(localCursor);
          Object localObject2 = localbi.field_content;
          if (localObject2 == null)
            break label393;
          localObject2 = j.b.me((String)localObject2);
          if ((localObject2 == null) || (((j.b)localObject2).type != 6))
            break label393;
          localObject2 = new com/tencent/mm/plugin/choosemsgfile/b/b/k;
          ((k)localObject2).<init>(this.kuZ.kuY, localbi, this.kuZ.edV);
          if (localList.size() == 0)
          {
            i = 1;
            if (i == 0)
              continue;
            localObject3 = new java/util/Date;
            ((Date)localObject3).<init>(localbi.field_createTime);
            long l2 = a.dJg().b((Date)localObject3);
            if (l1 != l2)
            {
              localObject3 = new com/tencent/mm/plugin/choosemsgfile/b/b/i;
              ((i)localObject3).<init>(this.kuZ.kuY, localbi.field_createTime);
              localLinkedList.add(localObject3);
            }
            localLinkedList.add(localObject2);
            l1 = l2;
            continue;
          }
          Object localObject3 = localList.iterator();
          if (!((Iterator)localObject3).hasNext())
            break label387;
          String str = (String)((Iterator)localObject3).next();
          boolean bool = ((k)localObject2).getFileName().endsWith(str);
          if (!bool)
            continue;
          i = 1;
          continue;
        }
        localCursor.close();
        this.kuZ.iJL.addAll(localLinkedList);
        localLinkedList.clear();
        ab.i("MicroMsg.ChooseMsgFileListUIController", "[loadData] data:%s", new Object[] { Integer.valueOf(this.kuZ.iJL.size()) });
        al.d(new e.2.1(this));
        AppMethodBeat.o(54347);
        break;
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(54347);
      }
      int i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.e.2
 * JD-Core Version:    0.6.2
 */
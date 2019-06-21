package com.tencent.mm.plugin.choosemsgfile.b.c;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.choosemsgfile.b.b.c;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

final class f$5
  implements Runnable
{
  f$5(f paramf, String paramString1, String paramString2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(54367);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = ((j)g.K(j.class)).bOr().cw(this.kvm.edV, this.kvm.Lp);
    if (localCursor == null)
    {
      ab.e("MicroMsg.ChooseMsgFileUIController", "[loadData] NULL == cursor ");
      AppMethodBeat.o(54367);
      return;
    }
    long l1 = 0L;
    label714: 
    while (true)
    {
      Object localObject3;
      try
      {
        Object localObject4;
        if (localCursor.moveToNext())
        {
          f.b(this.kvm);
          localObject2 = new com/tencent/mm/storage/bi;
          ((bi)localObject2).<init>();
          ((bi)localObject2).d(localCursor);
          localObject3 = b.a(this.kvm.kvi, (bi)localObject2, this.kvm.edV, this.hXt, this.kvd);
          if (localObject3 == null)
            break label714;
          localObject4 = new java/util/Date;
          ((Date)localObject4).<init>(((cy)localObject2).field_createTime);
          l2 = com.tencent.mm.ui.gridviewheaders.a.dJg().b((Date)localObject4);
          if (l1 != l2)
          {
            localObject4 = new com/tencent/mm/plugin/choosemsgfile/b/b/c;
            ((c)localObject4).<init>(this.kvm.kvi, ((cy)localObject2).field_createTime);
            localLinkedList.add(localObject4);
            f.c(this.kvm);
          }
          localLinkedList.add(localObject3);
          l1 = l2;
          continue;
        }
        localCursor.close();
        localObject3 = new LinkedList();
        if (localLinkedList.size() - this.kvm.kvl != 200)
          break label602;
        l1 = ((com.tencent.mm.plugin.choosemsgfile.b.b.a)localLinkedList.get(0)).getTimeStamp();
        com.tencent.mm.ui.gridviewheaders.a.dJg();
        l2 = com.tencent.mm.ui.gridviewheaders.a.nv(l1);
        ab.i("MicroMsg.ChooseMsgFileUIController", "[loadData] list size:%s start:%s end:%s", new Object[] { Integer.valueOf(localLinkedList.size()), Long.valueOf(l2), Long.valueOf(l1) });
        localCursor = ((j)g.K(j.class)).bOr().q(this.kvm.edV, l2, l1);
        Object localObject2 = new Date(l1);
        l1 = com.tencent.mm.ui.gridviewheaders.a.dJg().b((Date)localObject2);
        if (localCursor == null)
          break label592;
        try
        {
          if (!localCursor.moveToNext())
            break label592;
          f.b(this.kvm);
          localObject4 = new com/tencent/mm/storage/bi;
          ((bi)localObject4).<init>();
          ((bi)localObject4).d(localCursor);
          com.tencent.mm.plugin.choosemsgfile.b.b.a locala = b.a(this.kvm.kvi, (bi)localObject4, this.kvm.edV, this.hXt, this.kvd);
          if (locala == null)
            continue;
          Object localObject5 = new java/util/Date;
          ((Date)localObject5).<init>(((cy)localObject4).field_createTime);
          l2 = com.tencent.mm.ui.gridviewheaders.a.dJg().b((Date)localObject5);
          if ((l1 != l2) && (com.tencent.mm.ui.gridviewheaders.a.dJg().b((Date)localObject2) != l2))
          {
            localObject5 = new com/tencent/mm/plugin/choosemsgfile/b/b/c;
            ((c)localObject5).<init>(this.kvm.kvi, ((cy)localObject4).field_createTime);
            ((LinkedList)localObject3).add(localObject5);
            f.c(this.kvm);
            ((LinkedList)localObject3).add(locala);
            l1 = l2;
            continue;
          }
        }
        finally
        {
          if (localCursor == null);
        }
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(54367);
      }
      long l2 = l1;
      if (localCollection.size() > 0)
      {
        l2 = l1;
        if (((LinkedList)localObject3).size() == 0)
        {
          ((LinkedList)localObject3).add(0, localCollection.remove(0));
          l2 = l1;
          continue;
          label592: if (localCursor != null)
            localCursor.close();
          label602: int i = localCollection.size();
          int j = ((LinkedList)localObject3).size();
          this.kvm.iPr.addAll(0, (Collection)localObject3);
          this.kvm.iPr.addAll(((LinkedList)localObject3).size(), localCollection);
          localCollection.clear();
          ((LinkedList)localObject3).clear();
          this.kvm.kvl = 0;
          ab.i("MicroMsg.ChooseMsgFileUIController", "[loadData] %s", new Object[] { Integer.valueOf(this.kvm.iPr.size()) });
          al.d(new f.5.1(this, i + j));
          AppMethodBeat.o(54367);
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.f.5
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.plugin.backup.b.f.b;
import com.tencent.mm.plugin.backup.c.b.3;
import com.tencent.mm.plugin.backup.c.b.4;
import com.tencent.mm.plugin.backup.h.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class a$2
  implements Runnable
{
  public a$2(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17222);
    ab.i("MicroMsg.BackupMoveChooseServer", "start calculateChooseConvSize");
    this.jta.jsS = new com.tencent.mm.plugin.backup.c.b();
    com.tencent.mm.plugin.backup.c.b localb = this.jta.jsS;
    LinkedList localLinkedList = this.jta.aSW();
    a locala = this.jta;
    long l1 = b.aSZ().aSu().jrc;
    long l2 = bo.anU();
    String str = (String)d.aUr().aUs().Ry().get(2, null);
    int i = 0;
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      f.b localb1 = (f.b)localIterator.next();
      if (localb1.jri >= 0L)
      {
        i++;
      }
      else
      {
        if (localb.a(localb1, str, l1))
          break label262;
        int j = i + 1;
        i = j;
        if (!localb.jrv)
        {
          i = j;
          if (locala != null)
          {
            al.d(new b.3(localb, locala, localLinkedList, localb1.aSE(), j));
            i = j;
          }
        }
      }
    }
    ab.i("MicroMsg.BackupCalculator", "calculChooseConvSize all, userSize:%d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    if ((!localb.jrv) && (locala != null))
      al.d(new b.4(localb, locala, localLinkedList));
    ab.d("MicroMsg.BackupCalculator", "calculChooseConvSize loading time[%d]", new Object[] { Long.valueOf(bo.gb(l2)) });
    label262: AppMethodBeat.o(17222);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.a.2
 * JD-Core Version:    0.6.2
 */
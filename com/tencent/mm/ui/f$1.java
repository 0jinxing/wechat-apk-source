package com.tencent.mm.ui;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

final class f$1
  implements f.d
{
  f$1(f paramf)
  {
  }

  public final void dwG()
  {
    AppMethodBeat.i(29171);
    Object localObject1;
    Object localObject2;
    if (f.a(this.ygC, f.b(this.ygC)))
    {
      localObject1 = new HashSet(f.b(this.ygC).size());
      localObject2 = f.b(this.ygC).values().iterator();
      while (((Iterator)localObject2).hasNext())
        ((HashSet)localObject1).add(((f.b)((Iterator)localObject2).next()).object);
      ab.i(this.ygC.TAG, "newcursor all event is delete");
      f.c(this.ygC).c(((HashSet)localObject1).toArray(), null);
    }
    while (true)
    {
      f.b(this.ygC).clear();
      AppMethodBeat.o(29171);
      return;
      long l;
      if (!f.b(this.ygC).containsKey(this.ygC.ygB))
      {
        l = System.currentTimeMillis();
        localObject2 = this.ygC.dwA();
        localObject1 = this.ygC.a(new HashSet(f.b(this.ygC).values()), (SparseArray[])localObject2);
        int i = localObject2.length;
        if (i > 1)
          for (int j = 0; j < i; j++)
            ab.i(this.ygC.TAG, "newcursor %d  refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", new Object[] { Integer.valueOf(j), Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(localObject2[j].size()), Integer.valueOf(localObject1[j].size()) });
        ab.i(this.ygC.TAG, "newcursor refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(localObject2[0].size()), Integer.valueOf(localObject1[0].size()) });
        Iterator localIterator = f.b(this.ygC).values().iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (f.b)localIterator.next();
          if (localObject2 != null)
          {
            if (((f.b)localObject2).ygF != null)
              ab.i(this.ygC.TAG, "newcursor notify cache update : key : %s ", new Object[] { ((f.b)localObject2).object });
            f.c(this.ygC).c(((f.b)localObject2).object, (a)((f.b)localObject2).ygF);
          }
          else
          {
            ab.e(this.ygC.TAG, "newcursor event is null ! ");
          }
        }
        this.ygC.a((SparseArray[])localObject1);
        ab.i(this.ygC.TAG, "newcursor after resort new pos size :%d  ", new Object[] { Integer.valueOf(f.c(this.ygC).dvp()[0].size()) });
      }
      else
      {
        l = System.currentTimeMillis();
        f.a(this.ygC, new f.c(this.ygC, this.ygC.dwz()), true, false);
        ab.i(this.ygC.TAG, "cache unuseful,reset cursor,last : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.1
 * JD-Core Version:    0.6.2
 */
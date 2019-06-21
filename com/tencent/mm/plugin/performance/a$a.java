package com.tencent.mm.plugin.performance;

import android.widget.Toast;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a$a
  implements Runnable
{
  public boolean pfc;

  a$a(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111021);
    Object localObject = new LinkedList();
    int i = a.a(this.pfb, this.pfc, (List)localObject);
    int j;
    if (i > 0)
    {
      Iterator localIterator = ((List)localObject).iterator();
      j = 0;
      while (localIterator.hasNext())
      {
        localObject = (a.b)localIterator.next();
        long l = ((a.b)localObject).pff / i;
        if (l > 0L)
        {
          ArrayList localArrayList = new ArrayList(4);
          IDKey localIDKey = new IDKey();
          localIDKey.SetID(1013);
          localIDKey.SetKey(a.a(l, (a.b)localObject));
          localIDKey.SetValue(1L);
          localArrayList.add(localIDKey);
          localIDKey = new IDKey();
          localIDKey.SetValue(l);
          localIDKey.SetID(1013);
          localIDKey.SetKey(a.a((a.b)localObject));
          localArrayList.add(localIDKey);
          localIDKey = new IDKey();
          localIDKey.SetID(1013);
          localIDKey.SetKey(a.b((a.b)localObject));
          localIDKey.SetValue(1L);
          localArrayList.add(localIDKey);
          e.pXa.b(localArrayList, false);
          if (l <= 1000L)
            break label285;
          j = 1;
        }
      }
    }
    label285: 
    while (true)
    {
      break;
      if ((j != 0) && (bp.dpJ()))
        Toast.makeText(ah.getContext(), String.format("微信后台 %s min严重耗电!", new Object[] { Integer.valueOf(i) }), 10000).show();
      a.a(this.pfb);
      AppMethodBeat.o(111021);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.a.a
 * JD-Core Version:    0.6.2
 */
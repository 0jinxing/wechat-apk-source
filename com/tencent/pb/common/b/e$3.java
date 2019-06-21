package com.tencent.pb.common.b;

import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class e$3
  implements Runnable
{
  e$3(e parame, d paramd, int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void run()
  {
    Set localSet = (Set)e.b(this.AlY).get(this.AlZ.getType());
    if ((localSet != null) && (localSet.size() > 0))
    {
      Object localObject = new HashSet();
      ((Set)localObject).addAll(localSet);
      Iterator localIterator = ((Set)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (b)localIterator.next();
        if ((localObject != null) && (localSet.contains(localObject)))
          ((b)localObject).a(this.crc, this.crd, this.ftO, this.AlZ);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.e.3
 * JD-Core Version:    0.6.2
 */
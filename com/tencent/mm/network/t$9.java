package com.tencent.mm.network;

import com.tencent.mars.BaseEvent;
import com.tencent.mars.mm.MMLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class t$9 extends bj<Object>
{
  t$9(t paramt, Object paramObject, Map paramMap1, Map paramMap2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    super(3000L, paramObject, (byte)0);
  }

  public final Object run()
  {
    AppMethodBeat.i(58560);
    Object localObject = this.gdn.entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      try
      {
        MMLogic.saveAuthLongIPs((String)localEntry.getKey(), (String[])((ArrayList)localEntry.getValue()).toArray(new String[0]));
      }
      catch (Throwable localThrowable)
      {
        MMLogic.saveAuthLongIPs((String)localEntry.getKey(), (String[])((ArrayList)localEntry.getValue()).toArray(new String[0]));
      }
    }
    Iterator localIterator = this.gdo.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      MMLogic.saveAuthShortIPs((String)((Map.Entry)localObject).getKey(), (String[])((ArrayList)((Map.Entry)localObject).getValue()).toArray(new String[0]));
    }
    MMLogic.saveAuthPorts(this.gdp, this.gdq);
    BaseEvent.onNetworkChange();
    AppMethodBeat.o(58560);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t.9
 * JD-Core Version:    0.6.2
 */
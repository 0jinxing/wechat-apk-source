package com.tencent.liteav;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.network.a.a.a;
import com.tencent.liteav.network.a.b;
import com.tencent.liteav.network.a.c;
import com.tencent.liteav.network.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

class d$1
  implements Runnable
{
  d$1(d paramd, String paramString)
  {
  }

  public void run()
  {
    boolean bool1 = false;
    AppMethodBeat.i(66802);
    try
    {
      Object localObject1 = a.c();
      Object localObject2 = new com/tencent/liteav/network/a/b;
      ((b)localObject2).<init>(this.a, true);
      localObject2 = ((c)localObject1).a((b)localObject2, null);
      int i = localObject2.length;
      int j = 0;
      boolean bool2 = bool1;
      HashMap localHashMap;
      if (j < i)
      {
        localObject1 = localObject2[j];
        if ((((e)localObject1).a()) && (d.c(((e)localObject1).a)))
          bool2 = true;
      }
      else
      {
        localHashMap = d.g();
        localObject1 = this.a;
        if (!bool2)
          break label151;
      }
      label151: for (localObject2 = d.a.b; ; localObject2 = d.a.c)
      {
        localHashMap.put(localObject1, localObject2);
        localObject2 = d.h();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        TXCLog.d((String)localObject2, this.a + " isTencent " + bool2);
        AppMethodBeat.o(66802);
        return;
        j++;
        break;
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(66802);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.d.1
 * JD-Core Version:    0.6.2
 */
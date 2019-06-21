package com.tencent.liteav.network;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import org.json.JSONObject;

class c$1 extends Thread
{
  c$1(c paramc, String paramString1, String paramString2, int paramInt)
  {
    super(paramString1);
  }

  public void run()
  {
    AppMethodBeat.i(67619);
    if (this.c.a == null)
      AppMethodBeat.o(67619);
    while (true)
    {
      return;
      ArrayList localArrayList1 = new ArrayList();
      int i = 0;
      Object localObject2 = localArrayList1;
      Object localObject3;
      if (i < 5)
        localObject3 = localArrayList1;
      try
      {
        localObject2 = c.a(this.c, this.a, this.b);
        try
        {
          localObject3 = new org/json/JSONObject;
          ((JSONObject)localObject3).<init>((String)localObject2);
          if (((JSONObject)localObject3).has("use"))
          {
            int j = ((JSONObject)localObject3).getInt("use");
            if (j == 0)
            {
              localObject2 = localArrayList1;
              this.c.a.onFetchDone(0, (ArrayList)localObject2);
              AppMethodBeat.o(67619);
            }
          }
        }
        catch (Exception localException2)
        {
          do
          {
            localArrayList2 = localArrayList1;
            localArrayList1 = c.a(this.c, (String)localObject2);
            if (localArrayList1 == null)
              break;
            localObject2 = localArrayList1;
            localArrayList2 = localArrayList1;
          }
          while (localArrayList1.size() > 0);
          localArrayList2 = localArrayList1;
          sleep(1000L, 0);
        }
        i++;
      }
      catch (Exception localException1)
      {
        while (true)
        {
          ArrayList localArrayList2;
          Object localObject1 = localArrayList2;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.c.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class i$1
  implements Runnable
{
  public i$1(i parami, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125770);
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("receive data:");
      ((StringBuilder)localObject1).append(this.cbz);
      s.zX();
      int i = 100;
      int j = 3;
      int k = j;
      int m = i;
      Object localObject2;
      long l;
      if (s.co(this.cbz))
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(this.cbz);
        if (!((JSONObject)localObject1).isNull("mid"))
        {
          localObject2 = ((JSONObject)localObject1).optString("mid");
          if ((s.cp((String)localObject2)) && (!s.cp(this.cby.zR())))
          {
            i.a(this.cby).cbr = ((String)localObject2);
            i.a(this.cby).cbq = s.aK(i.zT());
            i.a(this.cby).bFQ = s.getImei(i.zT());
            if (((JSONObject)localObject1).isNull("ts"))
              break label348;
            l = ((JSONObject)localObject1).optLong("ts");
            if (l <= 0L);
          }
        }
      }
      label348: for (i.a(this.cby).cbs = l; ; i.a(this.cby).cbs = System.currentTimeMillis())
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("new mid midEntity:");
        ((StringBuilder)localObject2).append(i.a(this.cby).toString());
        s.zX();
        r.aI(i.zT()).b(i.a(this.cby));
        m = i;
        if (!((JSONObject)localObject1).isNull(a.cbb))
          m = ((JSONObject)localObject1).getInt(a.cbb);
        if (!((JSONObject)localObject1).isNull(a.cbc))
          j = ((JSONObject)localObject1).getInt(a.cbc);
        j.cbA = ((JSONObject)localObject1).optInt("disable", 0);
        j.cbB = ((JSONObject)localObject1).optInt("limit", 0);
        k = j;
        localObject2 = r.aI(i.zT());
        localObject1 = ((r)localObject2).zW();
        if (m > 0)
          ((a)localObject1).caX = m;
        if (k > 0)
          ((a)localObject1).caY = k;
        ((a)localObject1).caV = System.currentTimeMillis();
        ((a)localObject1).caW = 0;
        ((r)localObject2).b((a)localObject1);
        AppMethodBeat.o(125770);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        s.zZ();
        AppMethodBeat.o(125770);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.i.1
 * JD-Core Version:    0.6.2
 */
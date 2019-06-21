package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class p$1 extends v.a
{
  p$1(p paramp)
  {
  }

  public final void onComplete()
  {
    this.pup.status = this.pup.puo;
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(67963);
    paramString = this.pup.callbacks.iterator();
    while (paramString.hasNext())
      ((p.a)paramString.next()).onComplete();
    AppMethodBeat.o(67963);
  }

  public final void onSuccess(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(67962);
    p localp = this.pup;
    int i = bo.getInt((String)paramMap.get(".Response.result.Count"), 0);
    if (i > 0)
    {
      int j;
      int k;
      Object localObject1;
      if (localp.puk.ptp.size() == 0)
      {
        j = 1;
        k = 0;
        if (k >= i)
          break label463;
        localObject1 = new StringBuilder(".Response.result.List.item");
        if (k <= 0)
          break label325;
      }
      String str2;
      Object localObject2;
      int m;
      int n;
      label325: for (paramString = String.valueOf(k); ; paramString = "")
      {
        paramString = paramString + ".";
        String str1 = (String)paramMap.get(paramString + "Del");
        str2 = (String)paramMap.get(paramString + "Freq");
        localObject2 = (String)paramMap.get(paramString + "Name");
        localObject1 = (String)paramMap.get(paramString + "Addr");
        if ((localObject1 == null) || (((String)localObject1).length() == 0))
          break label398;
        if (localObject2 != null)
        {
          paramString = (String)localObject2;
          if (((String)localObject2).length() != 0);
        }
        else
        {
          paramString = (String)localObject1;
        }
        m = ((String)localObject1).hashCode();
        if (!str1.equals("0"))
          break label404;
        localObject2 = localp.puk.ptp;
        for (n = 0; (j == 0) && (n < ((List)localObject2).size()) && (((o)((List)localObject2).get(n)).puf != m); n++);
        j = 0;
        break;
      }
      if ((n >= ((List)localObject2).size()) || (j != 0))
      {
        localObject2 = new o();
        ((o)localObject2).puf = m;
        ((o)localObject2).name = paramString;
        ((o)localObject2).nJq = ((String)localObject1);
        ((o)localObject2).pug = bo.getInt(str2, 0);
        localp.puk.a((o)localObject2);
      }
      label398: label404: label461: 
      while (true)
      {
        k++;
        break;
        paramString = localp.puk.ptp.iterator();
        for (n = 0; ; n++)
        {
          if (!paramString.hasNext())
            break label461;
          if (((o)paramString.next()).puf == m)
          {
            localp.puk.Bo(n);
            break;
          }
        }
      }
      label463: localp.puk.Vc((String)paramMap.get(".Response.result.SyncInfo"));
      localp.save();
    }
    if (((String)paramMap.get(".Response.result.ContinueFlag")).equals("1"))
    {
      new ak().postDelayed(new p.1.1(this), 0L);
      AppMethodBeat.o(67962);
    }
    while (true)
    {
      return;
      this.pup.pui = bo.anU();
      paramString = this.pup.callbacks.iterator();
      while (paramString.hasNext())
        ((p.a)paramString.next()).onComplete();
      AppMethodBeat.o(67962);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.p.1
 * JD-Core Version:    0.6.2
 */
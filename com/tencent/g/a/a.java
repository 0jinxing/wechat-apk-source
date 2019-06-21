package com.tencent.g.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  private HashMap<String, Object> AHN;
  c AHO;
  private Object xHI;

  public a()
  {
    AppMethodBeat.i(127742);
    this.AHN = new HashMap();
    this.xHI = new Object();
    AppMethodBeat.o(127742);
  }

  private void a(e parame)
  {
    AppMethodBeat.i(127745);
    String str;
    if ((parame != null) && (parame.cFW != null))
    {
      System.currentTimeMillis();
      str = parame.cFW;
    }
    while (true)
    {
      synchronized (this.xHI)
      {
        localObject2 = this.AHN.get(str);
        if (localObject2 == null)
          break label180;
        if ((localObject2 instanceof d))
        {
          locald = (d)localObject2;
          localObject2 = null;
          if (locald != null)
            locald.eR(str, parame.AHQ);
          if (localObject2 != null)
          {
            localObject2 = ((LinkedList)localObject2).iterator();
            if (((Iterator)localObject2).hasNext())
            {
              ((d)((Iterator)localObject2).next()).eR(str, parame.AHQ);
              continue;
            }
          }
        }
        else
        {
          if (!(localObject2 instanceof List))
            break label180;
          localObject2 = (LinkedList)((LinkedList)localObject2).clone();
          locald = null;
        }
      }
      this.AHO.a(parame);
      AppMethodBeat.o(127745);
      return;
      label180: Object localObject2 = null;
      d locald = null;
    }
  }

  public final void a(d paramd, String[] paramArrayOfString)
  {
    AppMethodBeat.i(127743);
    if (paramArrayOfString == null)
      AppMethodBeat.o(127743);
    while (true)
    {
      return;
      while (true)
      {
        Object localObject2;
        Object localObject3;
        synchronized (this.xHI)
        {
          int i = paramArrayOfString.length;
          int j = 0;
          if (j >= i)
            break label205;
          localObject2 = paramArrayOfString[j];
          if (localObject2 != null)
          {
            localObject3 = this.AHN.get(localObject2);
            if (localObject3 == null)
              this.AHN.put(localObject2, paramd);
          }
          else
          {
            j++;
            continue;
          }
          if ((localObject3 instanceof d))
          {
            localObject3 = (d)localObject3;
            if (localObject3 == paramd)
            {
              AppMethodBeat.o(127743);
              break;
            }
            LinkedList localLinkedList = new java/util/LinkedList;
            localLinkedList.<init>();
            localLinkedList.add(localObject3);
            localLinkedList.add(paramd);
            this.AHN.put(localObject2, localLinkedList);
          }
        }
        if ((localObject3 instanceof List))
        {
          localObject2 = (LinkedList)localObject3;
          if (((LinkedList)localObject2).indexOf(paramd) >= 0)
          {
            AppMethodBeat.o(127743);
            break;
          }
          ((LinkedList)localObject2).add(paramd);
        }
      }
      label205: AppMethodBeat.o(127743);
    }
  }

  public final void c(String paramString, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(127744);
    e locale = (e)this.AHO.dSE();
    locale.cFW = paramString;
    locale.AHQ = paramInt;
    locale.arg1 = 0;
    locale.arg2 = 0;
    locale.obj = paramObject;
    a(locale);
    AppMethodBeat.o(127744);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.g.a.a
 * JD-Core Version:    0.6.2
 */
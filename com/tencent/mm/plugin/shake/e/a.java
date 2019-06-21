package com.tencent.mm.plugin.shake.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a
{
  public LinkedList<a.a> fPL;

  public a()
  {
    AppMethodBeat.i(24945);
    this.fPL = new LinkedList();
    AppMethodBeat.o(24945);
  }

  private static a.a a(Map<String, String> paramMap, int paramInt, String paramString)
  {
    AppMethodBeat.i(24947);
    a.a locala = new a.a(paramInt);
    locala.title = bo.nullAsNil((String)paramMap.get(paramString + ".title"));
    locala.summary = bo.nullAsNil((String)paramMap.get(paramString + ".summary"));
    String str = paramString + ".thumburl";
    int i = 0;
    if (i < 100)
    {
      StringBuilder localStringBuilder = new StringBuilder().append(str);
      if (i > 0);
      for (Object localObject = Integer.valueOf(i); ; localObject = "")
      {
        localObject = (String)paramMap.get(localObject);
        if (bo.isNullOrNil((String)localObject))
          break label196;
        locala.qwO.add(localObject);
        i++;
        break;
      }
    }
    label196: switch (paramInt)
    {
    default:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(24947);
      return locala;
      locala.qwN = bo.nullAsNil((String)paramMap.get(paramString + ".h5url.link"));
      locala.qwP = bo.nullAsNil((String)paramMap.get(paramString + ".h5url.title"));
      locala.qwQ = bo.nullAsNil((String)paramMap.get(paramString + ".h5url.username"));
      continue;
      locala.qwN = bo.nullAsNil((String)paramMap.get(paramString + ".bizprofile.username"));
      locala.qwP = bo.nullAsNil((String)paramMap.get(paramString + ".bizprofile.showchat"));
      continue;
      locala.qwN = bo.nullAsNil((String)paramMap.get(paramString + ".nativepay.wx_pay_url"));
      continue;
      locala.qwN = bo.nullAsNil((String)paramMap.get(paramString + ".product.product_id"));
    }
  }

  public static LinkedList<a> l(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(24946);
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    int j = 0;
    a locala;
    Object localObject1;
    Object localObject2;
    int k;
    Object localObject3;
    if (i < 1000)
    {
      locala = new a();
      localObject1 = new StringBuilder().append(paramString).append(".actionlist");
      if (i > 0)
      {
        localObject2 = Integer.valueOf(i);
        String str = localObject2;
        localObject1 = new LinkedList();
        k = 0;
        if (k >= 1000)
          break label514;
        localObject3 = new StringBuilder().append(str).append(".action");
        if (k <= 0)
          break label193;
      }
      label184: label193: for (localObject2 = Integer.valueOf(k); ; localObject2 = "")
      {
        localObject3 = localObject2;
        if (!bo.isNullOrNil((String)paramMap.get((String)localObject3 + ".type")))
          break label223;
        if (j == 0)
          break label200;
        AppMethodBeat.o(24946);
        return localLinkedList;
        localObject2 = "";
        break;
      }
      label200: locala.fPL = ((LinkedList)localObject1);
      j = 1;
    }
    label514: 
    while (true)
    {
      label210: localLinkedList.add(locala);
      i++;
      break;
      while (true)
      {
        label223: int m;
        try
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          m = Integer.valueOf((String)paramMap.get((String)localObject3 + ".type")).intValue();
          localObject2 = null;
          if (m != 2)
            break label428;
          localObject2 = new a.a(m);
          ((a.a)localObject2).qwN = bo.nullAsNil((String)paramMap.get((String)localObject3 + ".comment.id"));
          ((a.a)localObject2).title = bo.nullAsNil((String)paramMap.get((String)localObject3 + ".comment.title"));
          if (localObject2 != null)
            ((LinkedList)localObject1).add(localObject2);
          k++;
          j = 0;
        }
        catch (Exception localException)
        {
          new StringBuilder("Exception in parseActionList: ").append(localException.getMessage());
          if (j != 0)
          {
            AppMethodBeat.o(24946);
            break label184;
          }
          locala.fPL = ((LinkedList)localObject1);
          j = 1;
        }
        break label210;
        label428: a.a locala1;
        if (m == 3)
          locala1 = a(paramMap, m, (String)localObject3);
        else if (m == 4)
          locala1 = a(paramMap, m, (String)localObject3);
        else if (m == 5)
          locala1 = a(paramMap, m, (String)localObject3);
        else if (m == 6)
          locala1 = a(paramMap, m, (String)localObject3);
      }
      AppMethodBeat.o(24946);
      break label184;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.e.a
 * JD-Core Version:    0.6.2
 */
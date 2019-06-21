package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class l
{
  public static boolean a(a.a parama)
  {
    AppMethodBeat.i(80860);
    boolean bool;
    if (!bo.isNullOrNil(parama.key))
    {
      bool = true;
      AppMethodBeat.o(80860);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80860);
    }
  }

  public static boolean b(List<a> paramList, Map<String, a.a> paramMap)
  {
    AppMethodBeat.i(80859);
    boolean bool1;
    if ((paramMap == null) || (paramMap.size() <= 0) || (paramList == null))
    {
      AppMethodBeat.o(80859);
      bool1 = false;
    }
    while (true)
    {
      return bool1;
      int i = 0;
      boolean bool2;
      for (bool1 = false; i < paramList.size(); bool1 = bool2)
      {
        bool2 = bool1;
        if (paramList.get(i) != null)
        {
          LinkedList localLinkedList = ((a)paramList.get(i)).fPL;
          int j = 0;
          bool2 = false;
          if (j < localLinkedList.size())
          {
            a.a locala1 = (a.a)localLinkedList.get(j);
            if (a(locala1))
            {
              a.a locala2 = (a.a)paramMap.get(locala1.key);
              if (locala2 != null)
              {
                ab.i("MicroMsg.ProductUpdateLogic", "Updating action , info: key=" + locala1.key);
                localLinkedList.remove(j);
                localLinkedList.add(j, locala2);
                bool2 = true;
                bool1 = true;
              }
            }
            while (true)
            {
              j++;
              break;
              bool2 = true;
            }
          }
          ((a)paramList.get(i)).pZj = bool2;
          bool2 = bool1;
        }
        i++;
      }
      AppMethodBeat.o(80859);
    }
  }

  public static LinkedList<String> cU(List<a> paramList)
  {
    AppMethodBeat.i(80857);
    LinkedList localLinkedList1 = new LinkedList();
    for (int i = 0; i < paramList.size(); i++)
    {
      LinkedList localLinkedList2 = ((a)paramList.get(i)).fPL;
      for (int j = 0; j < localLinkedList2.size(); j++)
      {
        a.a locala = (a.a)localLinkedList2.get(j);
        if (a(locala))
          localLinkedList1.add(locala.key);
      }
    }
    AppMethodBeat.o(80857);
    return localLinkedList1;
  }

  public static Map<String, a.a> cV(List<String> paramList)
  {
    AppMethodBeat.i(80858);
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < paramList.size(); i++)
    {
      Object localObject = (String)paramList.get(i);
      ab.d("MicroMsg.ProductUpdateLogic", "toUpdateXmlList info: i=" + i + ";" + bo.nullAsNil((String)localObject));
      localObject = a.m(br.z((String)localObject, "action"), ".action");
      if ((localObject != null) && (((a.a)localObject).showType != 2))
        localHashMap.put(((a.a)localObject).key, localObject);
    }
    AppMethodBeat.o(80858);
    return localHashMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.l
 * JD-Core Version:    0.6.2
 */
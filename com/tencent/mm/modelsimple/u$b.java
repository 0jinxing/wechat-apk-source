package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Map;

public final class u$b
{
  public String desc;
  public LinkedList<u.a> fPL;
  public String title;

  public static LinkedList<u.a> f(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(78587);
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    Object localObject1;
    Object localObject2;
    if (i < 1000)
    {
      localObject1 = new StringBuilder().append(paramString).append(".action");
      if (i > 0)
      {
        localObject2 = Integer.valueOf(i);
        localObject2 = localObject2;
      }
    }
    while (true)
    {
      try
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        int j = Integer.valueOf((String)paramMap.get((String)localObject2 + ".$type")).intValue();
        localObject1 = new u.a();
        if (j == 5)
        {
          ((u.a)localObject1).ffv = bo.nullAsNil((String)paramMap.get((String)localObject2 + ".iconurl"));
          ((u.a)localObject1).desc = bo.nullAsNil((String)paramMap.get((String)localObject2 + ".desc"));
          ((u.a)localObject1).link = bo.nullAsNil((String)paramMap.get((String)localObject2 + ".link"));
          if ((!bo.isNullOrNil(((u.a)localObject1).ffv)) || (!bo.isNullOrNil(((u.a)localObject1).desc)) || (!bo.isNullOrNil(((u.a)localObject1).link)))
            continue;
          AppMethodBeat.o(78587);
          return localLinkedList;
          localObject2 = "";
        }
      }
      catch (Exception paramMap)
      {
        ab.w("MicroMsg.NetSceneScanStreetView", "parseVendorsFromXml() " + paramMap.getMessage());
        AppMethodBeat.o(78587);
        continue;
        AppMethodBeat.o(78587);
        continue;
        localLinkedList.add(localObject1);
        i++;
      }
      break;
      AppMethodBeat.o(78587);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.u.b
 * JD-Core Version:    0.6.2
 */
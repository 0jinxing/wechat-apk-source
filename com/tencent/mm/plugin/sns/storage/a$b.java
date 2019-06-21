package com.tencent.mm.plugin.sns.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a$b
{
  private List<a.b.a> qTW;
  public Map<String, List<a.b.a>> qTX;

  public a$b()
  {
    AppMethodBeat.i(36895);
    this.qTW = new ArrayList();
    this.qTX = new HashMap();
    AppMethodBeat.o(36895);
  }

  public a$b(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(36896);
    this.qTW = new ArrayList();
    this.qTX = new HashMap();
    String str = paramString + ".dislikeInfo.ReasonList";
    int i = 0;
    paramString = str + ".Reason";
    if (i > 0)
      paramString = paramString + i;
    while (true)
    {
      if (paramMap.get(paramString + ".ReasonId") != null)
      {
        this.qTW.add(new a.b.a(bo.bc((String)paramMap.get(paramString + ".Wording.zh"), ""), bo.bc((String)paramMap.get(paramString + ".Wording.tw"), ""), bo.bc((String)paramMap.get(paramString + ".Wording.en"), ""), bo.ank((String)paramMap.get(paramString + ".ReasonId"))));
        i++;
        break;
      }
      AppMethodBeat.o(36896);
      return;
    }
  }

  public final List<a.b.a> coJ()
  {
    AppMethodBeat.i(36894);
    Object localObject = aa.gw(ah.getContext());
    if ((!"zh_CN".equals(localObject)) && (!"zh_TW".equals(localObject)) && (!"zh_HK".equals(localObject)))
      localObject = "en";
    while (true)
    {
      if (!this.qTX.containsKey(localObject))
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = this.qTW.iterator();
        while (localIterator.hasNext())
        {
          a.b.a locala = (a.b.a)localIterator.next();
          if (("zh_CN".equals(localObject)) && (!bo.isNullOrNil(locala.qTZ)))
            localArrayList.add(locala);
          else if ((("zh_TW".equals(localObject)) || ("zh_HK".equals(localObject))) && (!bo.isNullOrNil(locala.qUa)))
            localArrayList.add(locala);
          else if (("en".equals(localObject)) && (!bo.isNullOrNil(locala.qUb)))
            localArrayList.add(locala);
        }
        this.qTX.put(localObject, localArrayList);
      }
      localObject = (List)this.qTX.get(localObject);
      AppMethodBeat.o(36894);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.a.b
 * JD-Core Version:    0.6.2
 */
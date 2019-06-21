package com.tencent.mm.m;

import android.view.ContextMenu.ContextMenuInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class d
{
  public static final int[] evX = { 1 };
  HashMap<String, HashMap<String, String>> evY;
  public Map<String, String> evZ;
  private int id;
  int version;

  public d(int paramInt)
  {
    AppMethodBeat.i(57867);
    this.evY = new HashMap();
    this.evZ = null;
    this.id = paramInt;
    AppMethodBeat.o(57867);
  }

  private static LinkedList<a> c(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(57869);
    LinkedList localLinkedList = null;
    int i = 0;
    Object localObject1 = new StringBuilder().append(paramString);
    Object localObject2;
    if (i == 0)
    {
      localObject2 = "";
      label30: String str = localObject2;
      if (paramMap.get(str) == null)
        break label206;
      localObject2 = str + ".id";
      localObject1 = str + ".title";
      str = str + ".url";
      if (!paramMap.containsKey(localObject2))
        break label206;
      localObject2 = new a((String)paramMap.get(localObject2), (String)paramMap.get(localObject1), (String)paramMap.get(str));
      if (localLinkedList != null)
        break label213;
      localLinkedList = new LinkedList();
    }
    label206: label213: 
    while (true)
    {
      localLinkedList.add(localObject2);
      i++;
      break;
      localObject2 = Integer.valueOf(i);
      break label30;
      AppMethodBeat.o(57869);
      return localLinkedList;
    }
  }

  public static LinkedList<a> g(Map<String, String> paramMap)
  {
    AppMethodBeat.i(57870);
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = new StringBuilder(".ConfigList.Config");
    if (i == 0);
    for (Object localObject3 = ""; ; localObject3 = Integer.valueOf(i))
    {
      localObject2 = localObject3;
      if (paramMap.get((String)localObject2 + ".$name") == null)
        break label238;
      if (!((String)paramMap.get((String)localObject2 + ".$name")).equalsIgnoreCase("JDWebViewMenu"))
        break label246;
      localObject3 = c(paramMap, (String)localObject2 + ".menuItems.menuItem");
      localObject2 = c(paramMap, (String)localObject2 + ".menuItems.newMenuItem");
      if (localObject3 != null)
        break;
      AppMethodBeat.o(57870);
      localObject1 = localObject2;
      label162: return localObject1;
    }
    localObject1 = localObject3;
    if (localObject2 != null)
    {
      localObject1 = localObject3;
      if (((LinkedList)localObject2).size() > 0)
      {
        ab.d("MicroMsg.ConfigListInfo", "has menuItem2, %s, %s", new Object[] { Integer.valueOf(((LinkedList)localObject3).size()), Integer.valueOf(((LinkedList)localObject2).size()) });
        ((LinkedList)localObject3).addAll((Collection)localObject2);
        localObject1 = localObject3;
      }
    }
    label238: label246: 
    while (true)
    {
      i++;
      break;
      AppMethodBeat.o(57870);
      break label162;
    }
  }

  static boolean kB(String paramString)
  {
    AppMethodBeat.i(57868);
    try
    {
      bool = bo.isNullOrNil(paramString);
      if (bool)
      {
        AppMethodBeat.o(57868);
        bool = false;
      }
      while (true)
      {
        return bool;
        Object localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        if (!bo.isNullOrNil(paramString))
        {
          paramString = paramString.split(",");
          if ((paramString != null) && (paramString.length > 0))
            for (int i = 0; i < paramString.length; i++)
              if (!bo.isNullOrNil(paramString[i]))
                ((List)localObject).add(paramString[i]);
        }
        paramString = aa.dor();
        bool = bo.isNullOrNil(paramString);
        if (bool)
        {
          AppMethodBeat.o(57868);
          bool = false;
        }
        else
        {
          ab.d("MicroMsg.ConfigListInfo", "locale is ".concat(String.valueOf(paramString)));
          Iterator localIterator = ((List)localObject).iterator();
          do
          {
            if (!localIterator.hasNext())
              break label274;
            localObject = (String)localIterator.next();
            if ((((String)localObject).trim().toLowerCase().equals("other")) && (!paramString.equals("zh_CN")))
            {
              ab.d("MicroMsg.ConfigListInfo", "find other");
              AppMethodBeat.o(57868);
              bool = true;
              break;
            }
          }
          while (!((String)localObject).trim().toLowerCase().equals(paramString.trim().toLowerCase()));
          ab.d("MicroMsg.ConfigListInfo", "find ");
          AppMethodBeat.o(57868);
          bool = true;
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.ConfigListInfo", "exception:%s", new Object[] { bo.l(paramString) });
        ab.d("MicroMsg.ConfigListInfo", "isContainLocale failed " + paramString.getMessage());
        label274: AppMethodBeat.o(57868);
        boolean bool = false;
      }
    }
  }

  public static final class a
  {
    public String id;
    public String title;
    public String url;

    public a(String paramString1, String paramString2, String paramString3)
    {
      this.id = paramString1;
      this.title = paramString2;
      this.url = paramString3;
    }
  }

  public static final class b
    implements ContextMenu.ContextMenuInfo
  {
    private static int ewa = 10000;
    public final int id;
    public final String key;
    public final String title;

    public b(String paramString1, String paramString2)
    {
      AppMethodBeat.i(57866);
      int i = ewa;
      ewa = i + 1;
      this.id = i;
      this.key = paramString1;
      this.title = paramString2;
      AppMethodBeat.o(57866);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.m.d
 * JD-Core Version:    0.6.2
 */
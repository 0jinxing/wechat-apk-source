package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class i$a
{
  public int fMk = 0;
  public int hitCount = 0;

  public static Map<String, a> abV(String paramString)
  {
    AppMethodBeat.i(4367);
    String[] arrayOfString = null;
    Object localObject1 = null;
    ab.d("PostTaskTenMinutesLogicState", "xml ".concat(String.valueOf(paramString)));
    Object localObject2 = arrayOfString;
    if (paramString != null);
    try
    {
      Object localObject4 = br.z(paramString, "voiptenmin");
      localObject2 = arrayOfString;
      if (localObject4 != null)
      {
        localObject2 = arrayOfString;
        if (((Map)localObject4).size() > 0)
        {
          paramString = new java/util/HashMap;
          paramString.<init>();
        }
      }
      while (true)
      {
        String str;
        try
        {
          localObject1 = ((Map)localObject4).entrySet().iterator();
          if (!((Iterator)localObject1).hasNext())
            break;
          localObject4 = (Map.Entry)((Iterator)localObject1).next();
          str = (String)((Map.Entry)localObject4).getKey();
          if (str == null)
            break;
          arrayOfString = str.split("\\.");
          ab.d("PostTaskTenMinutesLogicState", "key is ".concat(String.valueOf(str)));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("array is ");
          ab.d("PostTaskTenMinutesLogicState", arrayOfString.length);
          if ((str == null) || (arrayOfString.length < 4))
            continue;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("getValue is ");
          ab.d("PostTaskTenMinutesLogicState", (String)((Map.Entry)localObject4).getValue() + "array[1] " + arrayOfString[2]);
          if (!paramString.containsKey(arrayOfString[2]))
            break label357;
          localObject2 = (a)paramString.get(arrayOfString[2]);
          if (!str.contains("hitcount"))
            break label368;
          ((a)localObject2).hitCount = bo.getInt((String)((Map.Entry)localObject4).getValue(), 0);
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("hitCount ");
          ab.d("PostTaskTenMinutesLogicState", ((a)localObject2).hitCount + "sendCount " + ((a)localObject2).fMk);
          paramString.put(arrayOfString[2], localObject2);
          continue;
        }
        catch (Exception localException)
        {
          localObject1 = paramString;
          paramString = localException;
          localObject3 = localObject1;
        }
        ab.e("PostTaskTenMinutesLogicState", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(4367);
        return localObject3;
        label357: localObject3 = new a();
        continue;
        label368: if (str.contains("sendcount"))
          ((a)localObject3).fMk = bo.getInt((String)((Map.Entry)localObject4).getValue(), 0);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        Object localObject3 = localObject1;
        continue;
        localObject3 = paramString;
      }
    }
  }

  public static String ah(Map<String, a> paramMap)
  {
    AppMethodBeat.i(4366);
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramMap != null)
      try
      {
        if (paramMap.size() > 0)
        {
          localStringBuilder.append("<voiptenmin>");
          Iterator localIterator = paramMap.entrySet().iterator();
          while (localIterator.hasNext())
          {
            Object localObject = (Map.Entry)localIterator.next();
            paramMap = ((Map.Entry)localObject).getKey();
            localObject = (a)((Map.Entry)localObject).getValue();
            localStringBuilder.append("<".concat(String.valueOf(paramMap)));
            localStringBuilder.append(" hitcount = \"");
            localStringBuilder.append(((a)localObject).hitCount);
            localStringBuilder.append("\"");
            localStringBuilder.append(" sendcount = \"");
            localStringBuilder.append(((a)localObject).fMk);
            localStringBuilder.append("\"");
            localStringBuilder.append("/>");
          }
        }
      }
      catch (Exception paramMap)
      {
        ab.e("PostTaskTenMinutesLogicState", "exception:%s", new Object[] { bo.l(paramMap) });
        paramMap = null;
        AppMethodBeat.o(4366);
      }
    while (true)
    {
      return paramMap;
      localStringBuilder.append("</voiptenmin>");
      ab.d("PostTaskTenMinutesLogicState", "mapToXml " + localStringBuilder.toString());
      paramMap = localStringBuilder.toString();
      AppMethodBeat.o(4366);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.i.a
 * JD-Core Version:    0.6.2
 */
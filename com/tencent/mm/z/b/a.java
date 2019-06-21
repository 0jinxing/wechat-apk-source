package com.tencent.mm.z.b;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public class a extends b<JSONObject, Bundle, JSONObject>
  implements e
{
  public a(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }

  private static void d(Map paramMap)
  {
    AppMethodBeat.i(115301);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = ((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      if (((localObject2 instanceof String)) && ((localObject1 instanceof Map)))
      {
        d((Map)localObject1);
        paramMap.put(localObject2, new JSONObject((Map)localObject1));
      }
    }
    AppMethodBeat.o(115301);
  }

  public final JSONObject a(boolean paramBoolean, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(115300);
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(this.name);
    ((StringBuilder)localObject1).append(":");
    if (paramBoolean);
    for (Object localObject2 = "ok"; ; localObject2 = "fail")
    {
      ((StringBuilder)localObject1).append((String)localObject2);
      if (!TextUtils.isEmpty(paramString))
      {
        ((StringBuilder)localObject1).append(":");
        ((StringBuilder)localObject1).append(bo.nullAsNil(paramString));
      }
      paramString = new HashMap();
      paramString.put("errMsg", ((StringBuilder)localObject1).toString());
      if (paramBundle == null)
        break;
      localObject2 = paramBundle.keySet();
      if ((localObject2 == null) || (((Set)localObject2).isEmpty()))
        break;
      localObject2 = ((Set)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        paramString.put(localObject1, paramBundle.get((String)localObject1));
      }
    }
    d(paramString);
    paramString = new JSONObject(paramString);
    AppMethodBeat.o(115300);
    return paramString;
  }

  public final JSONObject a(boolean paramBoolean, String paramString, Map<String, ? extends Object> paramMap)
  {
    AppMethodBeat.i(115299);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.name);
    localStringBuilder.append(":");
    if (paramBoolean);
    for (String str = "ok"; ; str = "fail")
    {
      localStringBuilder.append(str);
      if (!TextUtils.isEmpty(paramString))
      {
        localStringBuilder.append(":");
        localStringBuilder.append(bo.nullAsNil(paramString));
      }
      paramString = new HashMap();
      paramString.put("errMsg", localStringBuilder.toString());
      if (paramMap != null)
        paramString.putAll(paramMap);
      d(paramString);
      paramString = new JSONObject(paramString);
      AppMethodBeat.o(115299);
      return paramString;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.b.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.maps.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class cl
{
  private JSONObject a;

  public final String a()
  {
    try
    {
      AppMethodBeat.i(98644);
      String str;
      if (this.a == null)
      {
        str = "";
        AppMethodBeat.o(98644);
      }
      while (true)
      {
        return str;
        str = this.a.toString();
        AppMethodBeat.o(98644);
      }
    }
    finally
    {
    }
  }

  public final String a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    JSONObject localJSONObject;
    ArrayList localArrayList;
    while (true)
    {
      try
      {
        AppMethodBeat.i(98647);
        if ((this.a == null) || (TextUtils.isEmpty(paramString1)))
        {
          paramString1 = "";
          AppMethodBeat.o(98647);
          return paramString1;
        }
        localJSONObject = this.a.optJSONObject("data");
        if (localJSONObject == null)
        {
          paramString1 = "";
          AppMethodBeat.o(98647);
          continue;
        }
      }
      finally
      {
      }
      localJSONObject = localJSONObject.optJSONObject(paramString1);
      if (localJSONObject == null)
      {
        paramString1 = "";
        AppMethodBeat.o(98647);
      }
      else
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        paramString1 = localJSONObject.keys();
        while (true)
        {
          if (!paramString1.hasNext())
            break label201;
          String str = (String)paramString1.next();
          if (!TextUtils.isEmpty(str))
          {
            if (str.equals("deviceid"))
            {
              paramString1 = localJSONObject.optString("deviceid");
              AppMethodBeat.o(98647);
              break;
            }
            cl.a locala = new com/tencent/tencentmap/mapsdk/maps/a/cl$a;
            locala.<init>(this, str, paramInt, paramString2, paramString3, paramString4, paramString5);
            if (locala.b)
              localArrayList.add(locala);
          }
        }
        label201: if (localArrayList.size() == 0)
        {
          paramString1 = "";
          AppMethodBeat.o(98647);
        }
        else
        {
          if (localArrayList.size() != 1)
            break;
          paramString1 = localJSONObject.optString(((cl.a)localArrayList.get(0)).a);
          AppMethodBeat.o(98647);
        }
      }
    }
    paramString1 = (cl.a)localArrayList.get(0);
    paramInt = 1;
    label275: boolean bool;
    if (paramInt < localArrayList.size())
    {
      paramString2 = (cl.a)localArrayList.get(paramInt);
      if (paramString1.b)
        if (paramString2.c != paramString1.c)
        {
          bool = paramString2.c;
          label322: if (!bool)
            break label439;
          paramString1 = paramString2;
        }
    }
    label439: 
    while (true)
    {
      paramInt++;
      break label275;
      if (paramString2.d != paramString1.d)
      {
        bool = paramString2.d;
        break label322;
      }
      if (paramString2.e != paramString1.e)
      {
        bool = paramString2.e;
        break label322;
      }
      if (paramString2.f != paramString1.f)
      {
        bool = paramString2.f;
        break label322;
      }
      if (paramString2.g != paramString1.g)
      {
        bool = paramString2.g;
        break label322;
      }
      bool = true;
      break label322;
      paramString1 = localJSONObject.optString(paramString1.a);
      AppMethodBeat.o(98647);
      break;
    }
  }

  public final void a(String paramString)
  {
    JSONObject localJSONObject1;
    try
    {
      AppMethodBeat.i(98645);
      if (TextUtils.isEmpty(paramString))
        AppMethodBeat.o(98645);
      while (true)
      {
        return;
        try
        {
          localJSONObject1 = new org/json/JSONObject;
          localJSONObject1.<init>(paramString);
          if (this.a != null)
            break;
          this.a = localJSONObject1;
          AppMethodBeat.o(98645);
        }
        catch (Throwable paramString)
        {
          AppMethodBeat.o(98645);
        }
      }
    }
    finally
    {
    }
    paramString = localJSONObject1.optJSONObject("data");
    String str1 = localJSONObject1.optString("version");
    JSONObject localJSONObject2;
    if ((paramString != null) && (!TextUtils.isEmpty(str1)))
    {
      localJSONObject2 = this.a.optJSONObject("data");
      if (localJSONObject2 != null)
        break label136;
      this.a.putOpt("data", paramString);
    }
    while (true)
    {
      this.a.putOpt("version", str1);
      AppMethodBeat.o(98645);
      break;
      label136: Iterator localIterator = paramString.keys();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        if (!TextUtils.isEmpty(str2))
        {
          localJSONObject1 = paramString.optJSONObject(str2);
          if (localJSONObject1 != null)
            localJSONObject2.putOpt(str2, localJSONObject1);
        }
      }
    }
  }

  public final void b()
  {
    try
    {
      this.a = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String c()
  {
    try
    {
      AppMethodBeat.i(98646);
      String str;
      if (this.a != null)
      {
        str = this.a.optString("version");
        AppMethodBeat.o(98646);
      }
      while (true)
      {
        return str;
        str = "";
        AppMethodBeat.o(98646);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cl
 * JD-Core Version:    0.6.2
 */
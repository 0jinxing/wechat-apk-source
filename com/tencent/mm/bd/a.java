package com.tencent.mm.bd;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.plugin.appbrand.r.r;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;
import org.json.JSONObject;

public final class a
{
  public static int a(JSONObject paramJSONObject, String paramString, Context paramContext)
  {
    AppMethodBeat.i(91302);
    int i;
    int j;
    if (paramJSONObject == null)
    {
      i = 0;
      j = i;
      if (i == 0)
      {
        if (!paramString.equals(paramContext.getString(2131302836)))
          break label52;
        j = 2;
      }
    }
    while (true)
    {
      AppMethodBeat.o(91302);
      return j;
      i = paramJSONObject.optInt("businessType");
      break;
      label52: if (paramString.equals(paramContext.getString(2131302840)))
      {
        j = 8;
      }
      else if (paramString.equals(paramContext.getString(2131302837)))
      {
        j = 1;
      }
      else
      {
        ab.i("MicroMsg.FTS.FTSExportLogic", "option " + paramString + " no type");
        j = i;
      }
    }
  }

  public static boolean aO(String paramString1, String paramString2)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(91304);
    if (paramString1 == paramString2)
    {
      AppMethodBeat.o(91304);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (TextUtils.isEmpty(paramString1))
      {
        AppMethodBeat.o(91304);
      }
      else
      {
        if (!paramString1.startsWith(paramString2))
          break;
        AppMethodBeat.o(91304);
        bool = true;
      }
    }
    if (TextUtils.isEmpty(paramString1));
    StringBuilder localStringBuilder;
    for (paramString1 = ""; ; paramString1 = localStringBuilder.toString())
    {
      bool = paramString1.startsWith(paramString2);
      AppMethodBeat.o(91304);
      break;
      localStringBuilder = new StringBuilder(paramString1.length());
      while (i < paramString1.length())
      {
        localStringBuilder.append(SpellMap.r(paramString1.charAt(i)));
        i++;
      }
    }
  }

  public static Drawable b(int paramInt, Context paramContext)
  {
    AppMethodBeat.i(91303);
    int i = 2131231996;
    switch (paramInt)
    {
    default:
      paramInt = i;
    case 1:
    case 8:
    case 2:
    case 64:
    case 256:
    case 384:
    case 512:
    case 1024:
    case 12582912:
    case 16777728:
    case 16777248:
    }
    while (true)
    {
      paramContext = paramContext.getResources().getDrawable(paramInt);
      AppMethodBeat.o(91303);
      return paramContext;
      paramInt = 2131231994;
      continue;
      paramInt = 2131231991;
      continue;
      paramInt = 2131231980;
      continue;
      paramInt = 2131231990;
      continue;
      paramInt = 2131231985;
      continue;
      paramInt = 2131231992;
      continue;
      paramInt = 2131231993;
      continue;
      paramInt = 2131231999;
      continue;
      paramInt = 2131232000;
      continue;
      paramInt = 2131231995;
    }
  }

  public static String b(int paramInt, Map<String, String> paramMap)
  {
    AppMethodBeat.i(91301);
    switch (paramInt)
    {
    default:
      paramMap = aa.E(paramMap);
      AppMethodBeat.o(91301);
    case 201:
    case 21:
    }
    while (true)
    {
      return paramMap;
      paramMap = r.E(paramMap);
      AppMethodBeat.o(91301);
      continue;
      paramMap = aa.d(paramMap, 1);
      AppMethodBeat.o(91301);
    }
  }

  public static Map<String, String> cA(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91300);
    Map localMap;
    switch (paramInt1)
    {
    default:
      localMap = aa.d(paramInt1, false, paramInt2);
      AppMethodBeat.o(91300);
    case 201:
    }
    while (true)
    {
      return localMap;
      localMap = r.d(paramInt1, false, paramInt2);
      AppMethodBeat.o(91300);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bd.a
 * JD-Core Version:    0.6.2
 */
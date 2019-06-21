package com.tencent.mm.plugin.appbrand.r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g
{
  private static DisplayMetrics iQY;

  static
  {
    AppMethodBeat.i(91161);
    iQY = ah.getContext().getResources().getDisplayMetrics();
    AppMethodBeat.o(91161);
  }

  public static int Ee(String paramString)
  {
    AppMethodBeat.i(91146);
    int i = by(paramString, 0);
    AppMethodBeat.o(91146);
    return i;
  }

  public static int Ef(String paramString)
  {
    AppMethodBeat.i(91147);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = new IllegalArgumentException("colorString isEmpty");
      AppMethodBeat.o(91147);
      throw paramString;
    }
    int i;
    if (f.iQX.containsKey(paramString))
    {
      i = ((Integer)f.iQX.get(paramString)).intValue();
      AppMethodBeat.o(91147);
    }
    while (true)
    {
      return i;
      if (paramString.charAt(0) == '#')
      {
        Object localObject = paramString;
        if (paramString.length() == 4)
        {
          localObject = new StringBuilder(paramString);
          ((StringBuilder)localObject).insert(2, paramString.charAt(1));
          ((StringBuilder)localObject).insert(4, paramString.charAt(2));
          ((StringBuilder)localObject).insert(6, paramString.charAt(3));
          localObject = ((StringBuilder)localObject).toString();
        }
        if (((String)localObject).length() == 7);
        for (long l = Long.parseLong(((String)localObject).substring(1), 16) | 0xFF000000; ; l = Long.parseLong(((String)localObject).substring(1, 7), 16) | Long.parseLong(((String)localObject).substring(7, 9), 16) << 24)
        {
          i = (int)l;
          AppMethodBeat.o(91147);
          break;
          if (((String)localObject).length() != 9)
          {
            ab.c("MicroMsg.JsValueUtil", "hy: Unknown color, given string is %s", new Object[] { localObject });
            paramString = new IllegalArgumentException("Unknown color");
            AppMethodBeat.o(91147);
            throw paramString;
          }
        }
      }
      i = Color.parseColor(paramString);
      AppMethodBeat.o(91147);
    }
  }

  public static float a(JSONObject paramJSONObject, String paramString, float paramFloat)
  {
    AppMethodBeat.i(91153);
    if (paramJSONObject == null)
      AppMethodBeat.o(91153);
    while (true)
    {
      return paramFloat;
      double d = paramFloat;
      try
      {
        float f = av((float)paramJSONObject.optDouble(paramString, d));
        paramFloat = f;
        AppMethodBeat.o(91153);
      }
      catch (Exception paramJSONObject)
      {
        AppMethodBeat.o(91153);
      }
    }
  }

  public static int a(JSONArray paramJSONArray, int paramInt)
  {
    AppMethodBeat.i(91154);
    paramInt = b(paramJSONArray, paramInt);
    AppMethodBeat.o(91154);
    return paramInt;
  }

  public static int a(JSONObject paramJSONObject, String paramString, int paramInt)
  {
    AppMethodBeat.i(91150);
    if (paramJSONObject == null)
      AppMethodBeat.o(91150);
    while (true)
    {
      return paramInt;
      try
      {
        int i = Math.round(av((float)paramJSONObject.getDouble(paramString)));
        paramInt = i;
        AppMethodBeat.o(91150);
      }
      catch (Exception paramJSONObject)
      {
        AppMethodBeat.o(91150);
      }
    }
  }

  public static float aNQ()
  {
    if (iQY == null);
    for (float f = 1.0F; ; f = iQY.density)
      return f;
  }

  public static float au(float paramFloat)
  {
    if (iQY == null);
    while (true)
    {
      return paramFloat;
      paramFloat /= iQY.density;
    }
  }

  public static float av(float paramFloat)
  {
    if (iQY == null);
    while (true)
    {
      return paramFloat;
      paramFloat *= iQY.density;
    }
  }

  private static int b(JSONArray paramJSONArray, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(91155);
    if (paramJSONArray == null)
    {
      AppMethodBeat.o(91155);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      try
      {
        paramInt = Math.round(av((float)paramJSONArray.getDouble(paramInt)));
        AppMethodBeat.o(91155);
      }
      catch (Exception paramJSONArray)
      {
        AppMethodBeat.o(91155);
        paramInt = i;
      }
    }
  }

  public static int by(String paramString, int paramInt)
  {
    AppMethodBeat.i(91145);
    try
    {
      int i = Ef(paramString);
      paramInt = i;
      AppMethodBeat.o(91145);
      return paramInt;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(91145);
    }
  }

  public static float c(JSONArray paramJSONArray, int paramInt)
  {
    AppMethodBeat.i(91158);
    float f = av((float)paramJSONArray.getDouble(paramInt));
    AppMethodBeat.o(91158);
    return f;
  }

  public static float d(JSONArray paramJSONArray, int paramInt)
  {
    AppMethodBeat.i(91159);
    float f = e(paramJSONArray, paramInt);
    AppMethodBeat.o(91159);
    return f;
  }

  private static float e(JSONArray paramJSONArray, int paramInt)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(91160);
    if (paramJSONArray == null)
      AppMethodBeat.o(91160);
    while (true)
    {
      return f1;
      try
      {
        float f2 = av((float)paramJSONArray.getDouble(paramInt));
        f1 = f2;
        AppMethodBeat.o(91160);
      }
      catch (Exception paramJSONArray)
      {
        AppMethodBeat.o(91160);
      }
    }
  }

  public static int f(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(91149);
    int i = a(paramJSONObject, paramString, 0);
    AppMethodBeat.o(91149);
    return i;
  }

  public static int g(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(91151);
    int i = Math.round(av((float)paramJSONObject.getDouble(paramString)));
    AppMethodBeat.o(91151);
    return i;
  }

  public static float h(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(91152);
    float f = a(paramJSONObject, paramString, 0.0F);
    AppMethodBeat.o(91152);
    return f;
  }

  public static float i(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(91157);
    float f = av((float)paramJSONObject.getDouble(paramString));
    AppMethodBeat.o(91157);
    return f;
  }

  public static int n(JSONArray paramJSONArray)
  {
    int i = 0;
    AppMethodBeat.i(91144);
    if ((paramJSONArray == null) || (paramJSONArray.length() < 3))
    {
      AppMethodBeat.o(91144);
      return i;
    }
    if (paramJSONArray.length() == 3);
    for (i = Color.rgb(paramJSONArray.optInt(0) & 0xFF, paramJSONArray.optInt(1) & 0xFF, paramJSONArray.optInt(2) & 0xFF); ; i = Color.argb(paramJSONArray.optInt(3) & 0xFF, paramJSONArray.optInt(0) & 0xFF, paramJSONArray.optInt(1) & 0xFF, paramJSONArray.optInt(2) & 0xFF))
    {
      AppMethodBeat.o(91144);
      break;
    }
  }

  public static int o(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(91156);
    int i = Math.round(av((float)paramJSONArray.getDouble(0)));
    AppMethodBeat.o(91156);
    return i;
  }

  public static int pZ(int paramInt)
  {
    AppMethodBeat.i(91148);
    if (iQY == null)
      AppMethodBeat.o(91148);
    while (true)
    {
      return paramInt;
      paramInt = (int)Math.ceil(paramInt / iQY.density);
      AppMethodBeat.o(91148);
    }
  }

  public static int qa(int paramInt)
  {
    if (iQY == null);
    while (true)
    {
      return paramInt;
      paramInt = (int)(paramInt / iQY.density);
    }
  }

  public static int qb(int paramInt)
  {
    if (iQY == null);
    while (true)
    {
      return paramInt;
      paramInt = (int)(iQY.density * paramInt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.g
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.au;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public final class b
{
  private static Map<String, String> fHA = null;
  private static String fHB = null;
  private static Map<String, b.a> fHz = null;

  public static List<b.a> G(Context paramContext, String paramString)
  {
    Context localContext1 = null;
    AppMethodBeat.i(59958);
    try
    {
      paramContext = paramContext.getResources().getConfiguration().locale.getLanguage();
      if (paramContext != null)
      {
        localContext2 = paramContext;
        localContext1 = paramContext;
        if (paramContext.equals(fHB));
      }
      else
      {
        localContext1 = paramContext;
        fHz = null;
        localContext2 = paramContext;
      }
      if (fHz == null)
      {
        fHB = localContext2;
        sL(paramString);
      }
      paramContext = new ArrayList(fHz.values());
      AppMethodBeat.o(59958);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
        Context localContext2 = localContext1;
    }
  }

  public static boolean ahK()
  {
    AppMethodBeat.i(59951);
    boolean bool;
    if ((!aa.don()) && (!aa.dor().equals("en")))
    {
      bool = true;
      AppMethodBeat.o(59951);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59951);
    }
  }

  public static boolean ahL()
  {
    AppMethodBeat.i(59952);
    boolean bool = bo.gT(ah.getContext());
    AppMethodBeat.o(59952);
    return bool;
  }

  public static boolean ahM()
  {
    AppMethodBeat.i(59953);
    boolean bool;
    if ((r.Yy() == 0) && (bo.gT(ah.getContext())))
    {
      bool = false;
      AppMethodBeat.o(59953);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(59953);
    }
  }

  public static boolean ahN()
  {
    return false;
  }

  public static boolean ahO()
  {
    boolean bool = true;
    AppMethodBeat.i(59954);
    if (!aa.dor().equals("zh_CN"))
      AppMethodBeat.o(59954);
    while (true)
    {
      return bool;
      TimeZone localTimeZone1 = TimeZone.getDefault();
      TimeZone localTimeZone2 = TimeZone.getTimeZone("GMT+08:00");
      if (localTimeZone1.getRawOffset() != localTimeZone2.getRawOffset())
      {
        AppMethodBeat.o(59954);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(59954);
      }
    }
  }

  public static boolean ahP()
  {
    AppMethodBeat.i(138448);
    boolean bool = bo.gT(ah.getContext());
    AppMethodBeat.o(138448);
    return bool;
  }

  public static b.a k(Context paramContext, String paramString1, String paramString2)
  {
    Context localContext1 = null;
    AppMethodBeat.i(59957);
    try
    {
      paramContext = paramContext.getResources().getConfiguration().locale.getLanguage();
      if (paramContext != null)
      {
        localContext2 = paramContext;
        localContext1 = paramContext;
        if (paramContext.equals(fHB));
      }
      else
      {
        localContext1 = paramContext;
        fHz = null;
        localContext2 = paramContext;
      }
      if ((fHz == null) || (fHA == null))
      {
        fHB = localContext2;
        sL(paramString2);
      }
      paramContext = (b.a)fHz.get(paramString1.toUpperCase() + (String)fHA.get(paramString1.toUpperCase()));
      AppMethodBeat.o(59957);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
        Context localContext2 = localContext1;
    }
  }

  public static String l(Context paramContext, String paramString1, String paramString2)
  {
    Context localContext1 = null;
    AppMethodBeat.i(59961);
    try
    {
      paramContext = paramContext.getResources().getConfiguration().locale.getLanguage();
      if (paramContext != null)
      {
        localContext2 = paramContext;
        localContext1 = paramContext;
        if (paramContext.equals(fHB));
      }
      else
      {
        localContext1 = paramContext;
        fHz = null;
        localContext2 = paramContext;
      }
      if (fHz == null)
      {
        fHB = localContext2;
        sL(paramString2);
      }
      paramString2 = fHz.values().iterator();
      while (paramString2.hasNext())
      {
        paramContext = (b.a)paramString2.next();
        if (paramContext.fHD.equals(paramString1))
        {
          paramContext = paramContext.fHE;
          AppMethodBeat.o(59961);
        }
      }
      while (true)
      {
        return paramContext;
        paramContext = "";
        AppMethodBeat.o(59961);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        Context localContext2 = localContext1;
    }
  }

  public static String m(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(59962);
    try
    {
      String str = paramContext.getResources().getConfiguration().locale.getLanguage();
      if (str != null)
      {
        paramContext = str;
        localObject = str;
        if (str.equals(fHB));
      }
      else
      {
        localObject = str;
        fHz = null;
        paramContext = str;
      }
      if (fHz == null)
      {
        fHB = paramContext;
        sL(paramString2);
      }
      paramString2 = fHz.values().iterator();
      while (paramString2.hasNext())
      {
        paramContext = (b.a)paramString2.next();
        if (paramContext.fHD.equals(paramString1))
        {
          paramContext = paramContext.fHC;
          AppMethodBeat.o(59962);
        }
      }
      while (true)
      {
        return paramContext;
        paramContext = "";
        AppMethodBeat.o(59962);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        paramContext = localObject;
    }
  }

  private static void sL(String paramString)
  {
    AppMethodBeat.i(59956);
    fHz = new HashMap();
    fHA = new HashMap();
    String[] arrayOfString = bo.nullAsNil(paramString).trim().split(",");
    int i = 0;
    while (i < arrayOfString.length)
    {
      paramString = arrayOfString[i].trim().split(":");
      if (paramString.length < 4)
      {
        ab.e("MicroMsg.InternationaPluginlLogic", "this country item has problem %s", paramString);
        i++;
      }
      else
      {
        if (!aa.dop());
        for (paramString = new b.a(paramString[0], paramString[1], paramString[2], paramString[3], paramString[3].charAt(0)); ; paramString = new b.a(paramString[0], paramString[1], paramString[2], paramString[3], a.sK(paramString[2])))
        {
          fHz.put(paramString.fHC + paramString.fHD, paramString);
          fHA.put(paramString.fHC, paramString.fHD);
          break;
        }
      }
    }
    AppMethodBeat.o(59956);
  }

  public static boolean sM(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(59959);
    if ((paramString != null) && (paramString.length() > 1) && (paramString.startsWith("+")) && (!paramString.startsWith("+86")))
      AppMethodBeat.o(59959);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59959);
    }
  }

  public static String sN(String paramString)
  {
    AppMethodBeat.i(59960);
    if ((paramString.startsWith("+886")) || (paramString.startsWith("+86")))
    {
      paramString = "zh-TW";
      AppMethodBeat.o(59960);
    }
    while (true)
    {
      return paramString;
      if ((paramString.startsWith("+852")) || (paramString.startsWith("+853")))
      {
        paramString = "zh-HK";
        AppMethodBeat.o(59960);
      }
      else if (paramString.startsWith("+81"))
      {
        paramString = "ja";
        AppMethodBeat.o(59960);
      }
      else if (paramString.startsWith("+82"))
      {
        paramString = "ko";
        AppMethodBeat.o(59960);
      }
      else if (paramString.startsWith("+66"))
      {
        paramString = "th";
        AppMethodBeat.o(59960);
      }
      else if (paramString.startsWith("+84"))
      {
        paramString = "vi";
        AppMethodBeat.o(59960);
      }
      else if (paramString.startsWith("+62"))
      {
        paramString = "id";
        AppMethodBeat.o(59960);
      }
      else if (paramString.startsWith("+55"))
      {
        paramString = "pt";
        AppMethodBeat.o(59960);
      }
      else if (paramString.startsWith("+34"))
      {
        paramString = "es-419";
        AppMethodBeat.o(59960);
      }
      else
      {
        paramString = "en";
        AppMethodBeat.o(59960);
      }
    }
  }

  public static boolean sO(String paramString)
  {
    AppMethodBeat.i(59963);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && (new HashSet(Arrays.asList("AT,BE,BG,CY,CZ,HR,DK,EE,FI,FR,DE,GR,HU,IE,IT,LV,RO,LT,LU,MT,NL,PL,PT,SK,SI,ES,SE,GB,IS,LI,NO,CH,TR".split(","))).contains(paramString.toUpperCase())))
    {
      bool = true;
      AppMethodBeat.o(59963);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59963);
    }
  }

  public static boolean sP(String paramString)
  {
    AppMethodBeat.i(59964);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && (new HashSet(Arrays.asList("43,32,359,357,420,385,45,372,358,33,49,30,36,353,39,371,40,370,352,356,31,48,351,421,386,34,46,44,354,423,47,41,90".split(","))).contains(paramString)))
    {
      bool = true;
      AppMethodBeat.o(59964);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59964);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.au.b
 * JD-Core Version:    0.6.2
 */
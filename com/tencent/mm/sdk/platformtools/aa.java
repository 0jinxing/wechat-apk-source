package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

public final class aa
{
  public static Locale xyO;

  static
  {
    AppMethodBeat.i(115235);
    if (Build.VERSION.SDK_INT < 24);
    for (xyO = Locale.getDefault(); ; xyO = LocaleList.getDefault().get(0))
    {
      Locale.setDefault(xyO);
      AppMethodBeat.o(115235);
      return;
    }
  }

  public static void a(Context paramContext, Locale paramLocale)
  {
    AppMethodBeat.i(115223);
    try
    {
      paramContext = paramContext.getResources();
      Configuration localConfiguration = paramContext.getConfiguration();
      DisplayMetrics localDisplayMetrics = paramContext.getDisplayMetrics();
      localConfiguration.locale = paramLocale;
      paramContext.updateConfiguration(localConfiguration, localDisplayMetrics);
      Resources.getSystem().updateConfiguration(localConfiguration, localDisplayMetrics);
      AppMethodBeat.o(115223);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LocaleUtil", paramContext, "updateApplicationResourceLocale err~~~", new Object[0]);
        AppMethodBeat.o(115223);
      }
    }
  }

  public static boolean amv(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(115219);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(115219);
    while (true)
    {
      return bool;
      if ((paramString.equalsIgnoreCase("zh_TW")) || (paramString.equalsIgnoreCase("zh_HK")) || (paramString.equalsIgnoreCase("zh_CN")) || (paramString.equalsIgnoreCase("en")) || (paramString.equalsIgnoreCase("th")) || (paramString.equals("id")) || (paramString.equals("in")) || (paramString.equals("vi")) || (paramString.equalsIgnoreCase("pt")) || (paramString.equalsIgnoreCase("es")) || (paramString.equalsIgnoreCase("ru")) || (paramString.equalsIgnoreCase("ar")) || (paramString.equalsIgnoreCase("ja")) || (paramString.equalsIgnoreCase("it")) || (paramString.equalsIgnoreCase("ko")) || (paramString.equalsIgnoreCase("ms")) || (paramString.equalsIgnoreCase("tr")) || (paramString.equalsIgnoreCase("de")) || (paramString.equalsIgnoreCase("fr")) || (paramString.equalsIgnoreCase("my")) || (paramString.equalsIgnoreCase("lo")))
      {
        bool = true;
        AppMethodBeat.o(115219);
      }
      else
      {
        AppMethodBeat.o(115219);
      }
    }
  }

  public static Locale amw(String paramString)
  {
    AppMethodBeat.i(115225);
    if (paramString.equals("zh_TW"))
    {
      paramString = Locale.TAIWAN;
      AppMethodBeat.o(115225);
    }
    while (true)
    {
      return paramString;
      if (paramString.equals("zh_HK"))
      {
        paramString = new Locale("zh", "HK");
        AppMethodBeat.o(115225);
      }
      else if (paramString.equals("en"))
      {
        paramString = Locale.ENGLISH;
        AppMethodBeat.o(115225);
      }
      else if (paramString.equals("zh_CN"))
      {
        paramString = Locale.CHINA;
        AppMethodBeat.o(115225);
      }
      else if ((paramString.equalsIgnoreCase("th")) || (paramString.equalsIgnoreCase("id")) || (paramString.equalsIgnoreCase("in")) || (paramString.equalsIgnoreCase("vi")) || (paramString.equalsIgnoreCase("pt")) || (paramString.equalsIgnoreCase("es")) || (paramString.equalsIgnoreCase("ru")) || (paramString.equalsIgnoreCase("ar")) || (paramString.equalsIgnoreCase("ja")) || (paramString.equalsIgnoreCase("it")) || (paramString.equalsIgnoreCase("ko")) || (paramString.equalsIgnoreCase("ms")) || (paramString.equalsIgnoreCase("tr")) || (paramString.equalsIgnoreCase("de")) || (paramString.equalsIgnoreCase("fr")) || (paramString.equalsIgnoreCase("my")) || (paramString.equalsIgnoreCase("lo")))
      {
        paramString = new Locale(paramString);
        AppMethodBeat.o(115225);
      }
      else
      {
        ab.e("MicroMsg.LocaleUtil", "transLanguageToLocale country = ".concat(String.valueOf(paramString)));
        paramString = Locale.ENGLISH;
        AppMethodBeat.o(115225);
      }
    }
  }

  private static String amx(String paramString)
  {
    AppMethodBeat.i(115227);
    String str1 = Locale.getDefault().getLanguage().trim();
    String str2 = str1 + "_" + Locale.getDefault().getCountry().trim();
    if (str1.equals("en"))
    {
      AppMethodBeat.o(115227);
      paramString = str1;
    }
    while (true)
    {
      return paramString;
      if (str2.equals("zh_TW"))
      {
        paramString = "zh_TW";
        AppMethodBeat.o(115227);
      }
      else if (str2.equals("zh_HK"))
      {
        paramString = "zh_HK";
        AppMethodBeat.o(115227);
      }
      else if (str2.equals("zh_CN"))
      {
        paramString = "zh_CN";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("th"))
      {
        paramString = "th";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("id"))
      {
        paramString = "id";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("in"))
      {
        paramString = "id";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("vi"))
      {
        paramString = "vi";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("pt"))
      {
        paramString = "pt";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("es"))
      {
        paramString = "es";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("ru"))
      {
        paramString = "ru";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("ar"))
      {
        paramString = "ar";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("ja"))
      {
        paramString = "ja";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("it"))
      {
        paramString = "it";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("ko"))
      {
        paramString = "ko";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("ms"))
      {
        paramString = "ms";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("tr"))
      {
        paramString = "tr";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("de"))
      {
        paramString = "de";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("fr"))
      {
        paramString = "fr";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("my"))
      {
        paramString = "my";
        AppMethodBeat.o(115227);
      }
      else if (str1.equals("lo"))
      {
        paramString = "lo";
        AppMethodBeat.o(115227);
      }
      else
      {
        AppMethodBeat.o(115227);
      }
    }
  }

  public static String c(Locale paramLocale)
  {
    AppMethodBeat.i(115224);
    String str = paramLocale.getLanguage();
    if (str.equals("zh"))
    {
      paramLocale = str + "_" + paramLocale.getCountry().toUpperCase();
      AppMethodBeat.o(115224);
    }
    while (true)
    {
      return paramLocale;
      AppMethodBeat.o(115224);
      paramLocale = str;
    }
  }

  public static void c(SharedPreferences paramSharedPreferences, String paramString)
  {
    AppMethodBeat.i(115231);
    if (paramSharedPreferences.edit().putString("language_key", paramString).commit())
    {
      bk.setProperty("language_key", paramString);
      ab.w("MicroMsg.LocaleUtil", "save application lang as:".concat(String.valueOf(paramString)));
      AppMethodBeat.o(115231);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.LocaleUtil", "saving application lang failed");
      AppMethodBeat.o(115231);
    }
  }

  public static boolean don()
  {
    AppMethodBeat.i(115220);
    String str = dor();
    boolean bool;
    if ((str.equals("zh_CN")) || (str.equals("zh_TW")) || (str.equals("zh_HK")))
    {
      bool = true;
      AppMethodBeat.o(115220);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115220);
    }
  }

  public static boolean doo()
  {
    AppMethodBeat.i(115221);
    boolean bool;
    if (dor().equals("zh_CN"))
    {
      bool = true;
      AppMethodBeat.o(115221);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115221);
    }
  }

  public static boolean dop()
  {
    AppMethodBeat.i(115222);
    boolean bool;
    if ((dor().equals("zh_TW")) || (dor().equals("zh_HK")))
    {
      bool = true;
      AppMethodBeat.o(115222);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115222);
    }
  }

  public static String doq()
  {
    AppMethodBeat.i(115226);
    String str = Locale.getDefault().getCountry().trim();
    AppMethodBeat.o(115226);
    return str;
  }

  public static String dor()
  {
    AppMethodBeat.i(115228);
    String str = bo.nullAsNil(bk.getProperty("language_key"));
    if ((str.length() > 0) && (!str.equals("language_default")))
      AppMethodBeat.o(115228);
    while (true)
    {
      return str;
      str = amx("en");
      AppMethodBeat.o(115228);
    }
  }

  public static String g(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(115229);
    paramSharedPreferences = bo.nullAsNil(paramSharedPreferences.getString("language_key", null));
    if ((paramSharedPreferences.length() > 0) && (!paramSharedPreferences.equals("language_default")))
    {
      bk.setProperty("language_key", paramSharedPreferences);
      AppMethodBeat.o(115229);
    }
    while (true)
    {
      return paramSharedPreferences;
      paramSharedPreferences = amx("en");
      bk.setProperty("language_key", paramSharedPreferences);
      AppMethodBeat.o(115229);
    }
  }

  public static String gw(Context paramContext)
  {
    AppMethodBeat.i(115232);
    paramContext = h(paramContext.getSharedPreferences(ah.doA(), 0));
    String str = dor();
    if (paramContext.equalsIgnoreCase("language_default"))
      paramContext = str;
    while (true)
    {
      AppMethodBeat.o(115232);
      return paramContext;
    }
  }

  public static String gx(Context paramContext)
  {
    AppMethodBeat.i(115233);
    String[] arrayOfString1 = paramContext.getResources().getStringArray(2131755024);
    String str = h(paramContext.getSharedPreferences(ah.doA(), 0));
    if (str == null)
    {
      paramContext = paramContext.getString(2131296962);
      AppMethodBeat.o(115233);
    }
    while (true)
    {
      return paramContext;
      String[] arrayOfString2 = z.qno;
      int i = arrayOfString2.length;
      int j = 0;
      for (int k = 0; ; k++)
      {
        if (j >= i)
          break label104;
        if (arrayOfString2[j].equals(str))
        {
          paramContext = arrayOfString1[k];
          AppMethodBeat.o(115233);
          break;
        }
        j++;
      }
      label104: paramContext = paramContext.getString(2131296962);
      AppMethodBeat.o(115233);
    }
  }

  public static String h(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(115230);
    paramSharedPreferences = bo.nullAsNil(paramSharedPreferences.getString("language_key", null));
    if (!bo.isNullOrNil(paramSharedPreferences))
      AppMethodBeat.o(115230);
    while (true)
    {
      return paramSharedPreferences;
      paramSharedPreferences = "language_default";
      AppMethodBeat.o(115230);
    }
  }

  public static Locale initLanguage(Context paramContext)
  {
    AppMethodBeat.i(115234);
    Object localObject = g(paramContext.getSharedPreferences(ah.doA(), 0));
    if (((String)localObject).equals("language_default"))
    {
      a(paramContext, Locale.ENGLISH);
      paramContext = Locale.getDefault();
      AppMethodBeat.o(115234);
    }
    while (true)
    {
      return paramContext;
      localObject = amw((String)localObject);
      a(paramContext, (Locale)localObject);
      AppMethodBeat.o(115234);
      paramContext = (Context)localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.aa
 * JD-Core Version:    0.6.2
 */
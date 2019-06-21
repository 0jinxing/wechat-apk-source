package com.tencent.xweb;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.a.b;
import com.tencent.xweb.c.k;
import com.tencent.xweb.c.k.a;
import com.tencent.xweb.util.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

public final class a
{
  static boolean ALK;
  static String ALM;
  static Map<String, Object> ALN;
  static String[] ALO;

  static
  {
    AppMethodBeat.i(3794);
    ALK = false;
    ALM = "";
    ALN = new HashMap();
    ALO = new String[] { "disable_url_watchdog" };
    AppMethodBeat.o(3794);
  }

  private static Map<String, String> I(String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(3774);
    init();
    if ((paramString == null) || (paramString.isEmpty()))
    {
      paramString = new HashMap();
      AppMethodBeat.o(3774);
    }
    while (true)
    {
      return paramString;
      paramString = paramMap.get(paramString);
      if ((paramString instanceof HashMap))
      {
        paramString = (Map)paramString;
        AppMethodBeat.o(3774);
      }
      else
      {
        paramString = new HashMap();
        AppMethodBeat.o(3774);
      }
    }
  }

  private static void J(String paramString, Map<String, Object> paramMap)
  {
    try
    {
      AppMethodBeat.i(3791);
      ALM = paramString;
      ALN = paramMap;
      dTQ();
      AppMethodBeat.o(3791);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public static void Sv(int paramInt)
  {
    AppMethodBeat.i(3771);
    XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit().putInt("cStrSpKeyConfigPeriod", paramInt).commit();
    AppMethodBeat.o(3771);
  }

  public static void a(com.tencent.xweb.c.a.a[] paramArrayOfa, String paramString)
  {
    AppMethodBeat.i(3783);
    a(paramArrayOfa, paramString, false);
    AppMethodBeat.o(3783);
  }

  public static void a(com.tencent.xweb.c.a.a[] paramArrayOfa, String paramString, boolean paramBoolean)
  {
    HashMap localHashMap1;
    HashMap localHashMap2;
    HashMap localHashMap3;
    HashMap localHashMap4;
    HashMap localHashMap5;
    HashMap localHashMap6;
    try
    {
      AppMethodBeat.i(3784);
      init();
      if (paramString == null)
        AppMethodBeat.o(3784);
      while (true)
      {
        return;
        localHashMap1 = new java/util/HashMap;
        localHashMap1.<init>();
        localHashMap2 = new java/util/HashMap;
        localHashMap2.<init>();
        localHashMap3 = new java/util/HashMap;
        localHashMap3.<init>();
        localHashMap4 = new java/util/HashMap;
        localHashMap4.<init>();
        localHashMap5 = new java/util/HashMap;
        localHashMap5.<init>();
        localHashMap6 = new java/util/HashMap;
        localHashMap6.<init>();
        localHashMap6.put("setwebtype", localHashMap1);
        localHashMap6.put("setjscore", localHashMap2);
        localHashMap6.put("setfullscreenvideo", localHashMap3);
        localHashMap6.put("setTraceSampleRatioInTenThousand", localHashMap4);
        localHashMap6.put("setEnabledTraceCategory", localHashMap5);
        if ((paramArrayOfa != null) && (paramArrayOfa.length != 0))
          break;
        J(paramString, localHashMap6);
        AppMethodBeat.o(3784);
      }
    }
    finally
    {
    }
    int i = -1;
    int j = 0;
    int k;
    int m;
    String[] arrayOfString;
    label489: Object localObject2;
    label560: String str;
    if (j < paramArrayOfa.length)
    {
      k = i;
      if (paramArrayOfa[j] == null)
        break label1145;
      if (paramBoolean)
      {
        if (!"revertToVersion".equals(paramArrayOfa[j].AOL))
          break label489;
        m = 1;
      }
      while (true)
      {
        k = i;
        if (m != 0)
          break label1145;
        k = i;
        if (!paramArrayOfa[j].AOK.dUw())
          break label1145;
        Object localObject1 = (a.a)k.f(WebView.d.ANb).excute("STR_CMD_EXXCUTE_CMD_FROM_CONFIG", new Object[] { paramArrayOfa[j] });
        if (localObject1 != null)
        {
          k = i;
          if (((a.a)localObject1).ALP)
            break label1145;
        }
        k = i;
        if (paramArrayOfa[j].AOM == null)
          break label1145;
        boolean bool = paramArrayOfa[j].AOL.equals("setConfigPeriod");
        m = i;
        if (bool);
        try
        {
          m = Integer.parseInt(paramArrayOfa[j].AOM);
          k = m;
          if (paramArrayOfa[j].AON == null)
            break label1145;
          k = m;
          if (paramArrayOfa[j].AON.isEmpty())
            break label1145;
          arrayOfString = paramArrayOfa[j].AON.split(",");
          if (paramArrayOfa[j].AOL.equals("setwebtype"))
          {
            k = 0;
            i = 0;
            while (i < arrayOfString.length)
            {
              localObject1 = arrayOfString[i].trim();
              int n = k;
              if (localObject1 != null)
              {
                n = k;
                if (!((String)localObject1).isEmpty())
                {
                  n = k;
                  if (!localHashMap1.containsKey(localObject1))
                  {
                    localHashMap1.put(localObject1, paramArrayOfa[j].AOM);
                    n = 1;
                  }
                }
              }
              i++;
              k = n;
              continue;
              m = 0;
            }
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("parse pariod cmdvalue to int failed , value is ");
            Log.e("CommandCfg", paramArrayOfa[j].AOM);
            m = i;
          }
          if ((k != 0) && (paramArrayOfa[j].AOK.APa > 0))
            f.nI(199L);
        }
      }
      while (true)
      {
        j++;
        i = m;
        break;
        if (paramArrayOfa[j].AOL.equals("setjscore"))
        {
          for (i = 0; i < arrayOfString.length; i++)
          {
            localObject2 = arrayOfString[i].trim();
            if ((localObject2 != null) && (!((String)localObject2).isEmpty()) && (!localHashMap2.containsKey(localObject2)))
              localHashMap2.put(localObject2, paramArrayOfa[j].AOM);
          }
        }
        else if (paramArrayOfa[j].AOL.equals("setfullscreenvideo"))
        {
          for (i = 0; i < arrayOfString.length; i++)
          {
            localObject2 = arrayOfString[i].trim();
            if ((localObject2 != null) && (!((String)localObject2).isEmpty()) && (!localHashMap3.containsKey(localObject2)))
              localHashMap3.put(localObject2, paramArrayOfa[j].AOM);
          }
        }
        else if (paramArrayOfa[j].AOL.equals("setTraceSampleRatioInTenThousand"))
        {
          for (i = 0; i < arrayOfString.length; i++)
          {
            localObject2 = arrayOfString[i].trim();
            if ((localObject2 != null) && (!((String)localObject2).isEmpty()) && (!localHashMap4.containsKey(localObject2)))
              localHashMap4.put(localObject2, paramArrayOfa[j].AOM);
          }
        }
        else
        {
          if (!paramArrayOfa[j].AOL.equals("setEnabledTraceCategory"))
            break label918;
          for (i = 0; i < arrayOfString.length; i++)
          {
            localObject2 = arrayOfString[i].trim();
            if ((localObject2 != null) && (!((String)localObject2).isEmpty()) && (!localHashMap5.containsKey(localObject2)))
              localHashMap5.put(localObject2, paramArrayOfa[j].AOM);
          }
        }
      }
      label918: str = paramArrayOfa[j].AOL;
      localObject2 = paramArrayOfa[j].AOM;
      if (!paramArrayOfa[j].AOL.equals("executeCommand"))
        break label1152;
      localObject2 = avb(paramArrayOfa[j].AOM);
      k = m;
      if (localObject2 == null)
        break label1145;
      k = m;
      if (localObject2.length < 2)
        break label1145;
      str = localObject2[0];
      localObject2 = localObject2[1];
    }
    label1152: 
    while (true)
    {
      k = m;
      if (!TextUtils.isEmpty(str))
      {
        Map localMap = I(str, localHashMap6);
        Object localObject3;
        if (localMap != null)
        {
          localObject3 = localMap;
          if (!localMap.isEmpty());
        }
        else
        {
          localObject3 = new java/util/HashMap;
          ((HashMap)localObject3).<init>();
          localHashMap6.put(str, localObject3);
        }
        for (i = 0; ; i++)
        {
          k = m;
          if (i >= arrayOfString.length)
            break;
          str = arrayOfString[i].trim();
          if ((str != null) && (!str.isEmpty()) && (!((Map)localObject3).containsKey(str)))
            ((Map)localObject3).put(str, localObject2);
        }
        Sv(i);
        J(paramString, localHashMap6);
        AppMethodBeat.o(3784);
        break;
      }
      label1145: m = k;
      break label560;
    }
  }

  private static Map<String, String> auT(String paramString)
  {
    try
    {
      AppMethodBeat.i(3773);
      paramString = I(paramString, ALN);
      AppMethodBeat.o(3773);
      return paramString;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public static WebView.d auU(String paramString)
  {
    AppMethodBeat.i(3775);
    init();
    paramString = avc(iG("setwebtype", paramString));
    AppMethodBeat.o(3775);
    return paramString;
  }

  public static i.a auV(String paramString)
  {
    AppMethodBeat.i(3776);
    init();
    paramString = avd(iG("setjscore", paramString));
    AppMethodBeat.o(3776);
    return paramString;
  }

  public static WebView.a auW(String paramString)
  {
    AppMethodBeat.i(3777);
    init();
    paramString = ave(iG("setfullscreenvideo", paramString));
    AppMethodBeat.o(3777);
    return paramString;
  }

  public static d.a auX(String paramString)
  {
    AppMethodBeat.i(3778);
    init();
    paramString = avf(iG("fr_" + paramString.toLowerCase(), "tools"));
    AppMethodBeat.o(3778);
    return paramString;
  }

  public static int auY(String paramString)
  {
    AppMethodBeat.i(3779);
    init();
    paramString = iG("setTraceSampleRatioInTenThousand", paramString);
    int i;
    if ((TextUtils.isEmpty(paramString)) || (!TextUtils.isDigitsOnly(paramString)))
    {
      i = 0;
      AppMethodBeat.o(3779);
    }
    while (true)
    {
      return i;
      i = Integer.parseInt(paramString);
      AppMethodBeat.o(3779);
    }
  }

  public static String auZ(String paramString)
  {
    AppMethodBeat.i(3780);
    init();
    paramString = iG("setEnabledTraceCategory", paramString);
    AppMethodBeat.o(3780);
    return paramString;
  }

  public static String ava(String paramString)
  {
    AppMethodBeat.i(3781);
    String str1 = WebView.getCurStrModule();
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
      str2 = "tools";
    paramString = iG(paramString, str2);
    AppMethodBeat.o(3781);
    return paramString;
  }

  public static String[] avb(String paramString)
  {
    AppMethodBeat.i(3785);
    String[] arrayOfString = new String[2];
    if ((paramString == null) || (!paramString.contains(":")))
    {
      paramString = null;
      AppMethodBeat.o(3785);
      return paramString;
    }
    int i = paramString.indexOf(':');
    arrayOfString[0] = paramString.substring(0, i);
    if (paramString.length() - 1 <= i)
      arrayOfString[1] = "";
    while (true)
    {
      AppMethodBeat.o(3785);
      paramString = arrayOfString;
      break;
      arrayOfString[1] = paramString.substring(i + 1);
    }
  }

  private static WebView.d avc(String paramString)
  {
    AppMethodBeat.i(3786);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      paramString = WebView.d.ANa;
      AppMethodBeat.o(3786);
    }
    while (true)
    {
      return paramString;
      WebView.d locald = WebView.d.ANa;
      try
      {
        paramString = WebView.d.valueOf(paramString);
        AppMethodBeat.o(3786);
      }
      catch (Exception paramString)
      {
        while (true)
          paramString = locald;
      }
    }
  }

  private static i.a avd(String paramString)
  {
    AppMethodBeat.i(3787);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      paramString = i.a.AMd;
      AppMethodBeat.o(3787);
    }
    while (true)
    {
      return paramString;
      i.a locala = i.a.AMd;
      try
      {
        paramString = i.a.valueOf(paramString);
        AppMethodBeat.o(3787);
      }
      catch (Exception paramString)
      {
        while (true)
          paramString = locala;
      }
    }
  }

  private static WebView.a ave(String paramString)
  {
    AppMethodBeat.i(3788);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      paramString = WebView.a.AMY;
      AppMethodBeat.o(3788);
    }
    while (true)
    {
      return paramString;
      WebView.a locala = WebView.a.AMY;
      try
      {
        paramString = WebView.a.valueOf(paramString);
        AppMethodBeat.o(3788);
      }
      catch (Exception paramString)
      {
        while (true)
          paramString = locala;
      }
    }
  }

  public static d.a avf(String paramString)
  {
    AppMethodBeat.i(3789);
    d.a locala = d.a.ALW;
    if ((paramString == null) || (paramString.isEmpty()))
    {
      AppMethodBeat.o(3789);
      paramString = locala;
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = d.a.valueOf(paramString);
        AppMethodBeat.o(3789);
      }
      catch (Exception paramString)
      {
        while (true)
          paramString = d.a.ALW;
      }
    }
  }

  private static String bc(Map<String, String> paramMap)
  {
    AppMethodBeat.i(3790);
    if (paramMap == null)
    {
      paramMap = "";
      AppMethodBeat.o(3790);
    }
    while (true)
    {
      return paramMap;
      StringBuilder localStringBuilder = new StringBuilder(128);
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap = (Map.Entry)localIterator.next();
        if (localStringBuilder.length() != 0)
          localStringBuilder.append(";");
        localStringBuilder.append((String)paramMap.getKey());
        localStringBuilder.append(":");
        localStringBuilder.append((String)paramMap.getValue());
      }
      paramMap = localStringBuilder.toString();
      AppMethodBeat.o(3790);
    }
  }

  private static void dTM()
  {
    while (true)
    {
      Object localObject2;
      String str1;
      String str2;
      HashMap localHashMap;
      try
      {
        AppMethodBeat.i(3768);
        ALN.clear();
        SharedPreferences localSharedPreferences = XWalkEnvironment.getMMKVSharedTransportOld("XWEB.CMDCFG");
        ALM = localSharedPreferences.getString("cStrTAGConfigVer", "");
        localObject2 = localSharedPreferences.getAll();
        if ((localObject2 == null) || (((Map)localObject2).size() == 0))
        {
          AppMethodBeat.o(3768);
          return;
        }
        Iterator localIterator = ((Map)localObject2).entrySet().iterator();
        if (!localIterator.hasNext())
          break label291;
        str1 = (String)((Map.Entry)localIterator.next()).getKey();
        str2 = localSharedPreferences.getString(str1, "");
        if ((str1 == null) || (str2 == null))
          continue;
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        if ((str2 == null) || (str2.isEmpty()))
        {
          if (localHashMap.size() != 0)
            break label276;
          ALN.put(str1, str2);
          continue;
        }
      }
      finally
      {
      }
      for (String[] arrayOfString : str2.split(";"))
        if ((arrayOfString != null) && (!arrayOfString.isEmpty()))
        {
          arrayOfString = arrayOfString.split(":");
          if ((arrayOfString.length == 2) && (arrayOfString[0] != null) && (arrayOfString[1] != null))
            localHashMap.put(arrayOfString[0], arrayOfString[1]);
        }
      continue;
      label276: ALN.put(str1, localHashMap);
      continue;
      label291: AppMethodBeat.o(3768);
    }
  }

  private static String dTN()
  {
    while (true)
    {
      StringBuilder localStringBuilder;
      try
      {
        AppMethodBeat.i(3770);
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(512);
        Object localObject1 = ALN.keySet();
        if (localObject1 == null)
        {
          localObject1 = "";
          AppMethodBeat.o(3770);
          return localObject1;
        }
        Iterator localIterator = ((Set)localObject1).iterator();
        if (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          if (TextUtils.isEmpty(str2))
            continue;
          Object localObject3 = bc(auT(str2));
          localObject1 = localObject3;
          if (localObject3 == null)
            localObject1 = "";
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localStringBuilder.append(str2 + " : ");
          localStringBuilder.append((String)localObject1);
          localStringBuilder.append("\n");
          continue;
        }
      }
      finally
      {
      }
      String str1 = localStringBuilder.toString();
      AppMethodBeat.o(3770);
    }
  }

  public static int dTO()
  {
    int i = -1;
    AppMethodBeat.i(3772);
    int j = XWalkEnvironment.getSharedPreferencesForUpdateConfig().getInt("cStrSpKeyConfigPeriod", -1);
    if (j <= 30)
      AppMethodBeat.o(3772);
    while (true)
    {
      return i;
      i = j * 60 * 1000;
      AppMethodBeat.o(3772);
    }
  }

  private static void dTP()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(3792);
        Object localObject1 = XWalkEnvironment.getMMKVSharedTransportOld("XWEB.CMDCFG").getAll();
        if ((localObject1 == null) || (((Map)localObject1).size() == 0))
        {
          AppMethodBeat.o(3792);
          return;
        }
        localObject3 = ((Map)localObject1).entrySet().iterator();
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        if (((Iterator)localObject3).hasNext())
        {
          ((ArrayList)localObject1).add((String)((Map.Entry)((Iterator)localObject3).next()).getKey());
          continue;
        }
      }
      finally
      {
      }
      Object localObject3 = XWalkEnvironment.getMMKVSharedTransportOld("XWEB.CMDCFG").edit();
      Iterator localIterator = localObject2.iterator();
      while (localIterator.hasNext())
        ((SharedPreferences.Editor)localObject3).remove((String)localIterator.next());
      ((SharedPreferences.Editor)localObject3).commit();
      AppMethodBeat.o(3792);
    }
  }

  private static void dTQ()
  {
    while (true)
    {
      Map.Entry localEntry;
      Object localObject2;
      try
      {
        AppMethodBeat.i(3793);
        dTP();
        SharedPreferences.Editor localEditor = XWalkEnvironment.getMMKVSharedTransportOld("XWEB.CMDCFG").edit();
        localEditor.putString("cStrTAGConfigVer", ALM);
        Iterator localIterator = ALN.entrySet().iterator();
        if (!localIterator.hasNext())
          break;
        localEntry = (Map.Entry)localIterator.next();
        if ((localEntry.getKey() == null) || (((String)localEntry.getKey()).isEmpty()))
          continue;
        localObject2 = localEntry.getValue();
        if (localObject2 == null)
          continue;
        boolean bool = localObject2 instanceof Map;
        if (bool)
        {
          try
          {
            Map localMap = (Map)localObject2;
            if (localMap == null)
              continue;
            localEditor.putString((String)localEntry.getKey(), bc(localMap));
          }
          catch (Exception localException)
          {
            localEditor.putString((String)localEntry.getKey(), localObject2.toString());
          }
          continue;
        }
      }
      finally
      {
      }
      localObject1.putString((String)localEntry.getKey(), localObject2.toString());
    }
    localObject1.commit();
    XWalkEnvironment.addXWalkInitializeLog(dTN());
    AppMethodBeat.o(3793);
  }

  public static String getAbstractInfo()
  {
    AppMethodBeat.i(3769);
    init();
    String str = dTN();
    AppMethodBeat.o(3769);
    return str;
  }

  public static String iG(String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(3782);
      init();
      paramString1 = auT(paramString1);
      if ((paramString1 == null) || (paramString2 == null))
      {
        paramString1 = "";
        AppMethodBeat.o(3782);
      }
      while (true)
      {
        return paramString1;
        paramString1 = (String)paramString1.get(paramString2);
        AppMethodBeat.o(3782);
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  private static void init()
  {
    AppMethodBeat.i(3767);
    if (ALK)
      AppMethodBeat.o(3767);
    while (true)
    {
      return;
      ALK = true;
      dTM();
      AppMethodBeat.o(3767);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.a
 * JD-Core Version:    0.6.2
 */
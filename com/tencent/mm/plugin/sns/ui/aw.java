package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class aw
{
  private static HashMap<Long, Long> jZc;
  private static HashMap<Long, String> jZd;
  private static Map<String, List<String>> nnv;
  private static Map<String, List<String>> nnw;

  static
  {
    AppMethodBeat.i(39614);
    nnv = new HashMap();
    nnw = new HashMap();
    jZc = new HashMap();
    jZd = new HashMap();
    AppMethodBeat.o(39614);
  }

  private static String V(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(39609);
    paramContext = paramContext.getResources().getStringArray(2131755061);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("");
    for (int i = 0; i < paramContext.length; i++)
      localArrayList.add(paramContext[i]);
    if (paramInt >= localArrayList.size())
    {
      paramContext = "";
      AppMethodBeat.o(39609);
    }
    while (true)
    {
      return paramContext;
      paramContext = (String)localArrayList.get(paramInt);
      AppMethodBeat.o(39609);
    }
  }

  public static CharSequence a(Context paramContext, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(39611);
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    if (paramLong < 3600000L)
    {
      paramContext = "";
      AppMethodBeat.o(39611);
    }
    while (true)
    {
      return paramContext;
      localGregorianCalendar = new GregorianCalendar(localGregorianCalendar.get(1), localGregorianCalendar.get(2), localGregorianCalendar.get(5));
      long l = paramLong - localGregorianCalendar.getTimeInMillis();
      if ((l > 0L) && (l <= 86400000L) && (paramBoolean))
      {
        paramContext = paramContext.getString(2131299977);
        AppMethodBeat.o(39611);
      }
      else
      {
        l = paramLong - localGregorianCalendar.getTimeInMillis() + 86400000L;
        if ((l > 0L) && (l <= 86400000L) && (paramBoolean))
        {
          paramContext = paramContext.getString(2131299986);
          AppMethodBeat.o(39611);
        }
        else
        {
          new GregorianCalendar().setTimeInMillis(paramLong);
          paramContext = DateFormat.format(paramContext.getString(2131299934), paramLong);
          AppMethodBeat.o(39611);
        }
      }
    }
  }

  private static void aS(Context paramContext, String paramString)
  {
    AppMethodBeat.i(39608);
    String[] arrayOfString = paramContext.getResources().getStringArray(2131755061);
    paramContext = new ArrayList();
    paramContext.add("");
    for (int i = 0; i < arrayOfString.length; i++)
      paramContext.add(arrayOfString[i]);
    nnw.put(paramString, paramContext);
    AppMethodBeat.o(39608);
  }

  public static void clean()
  {
    try
    {
      AppMethodBeat.i(39606);
      jZc.clear();
      jZd.clear();
      AppMethodBeat.o(39606);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static int getYear()
  {
    AppMethodBeat.i(39613);
    int i = new GregorianCalendar().get(1);
    AppMethodBeat.o(39613);
    return i;
  }

  public static String h(Context paramContext, long paramLong)
  {
    while (true)
    {
      GregorianCalendar localGregorianCalendar1;
      long l1;
      try
      {
        AppMethodBeat.i(39607);
        localGregorianCalendar1 = new java/util/GregorianCalendar;
        localGregorianCalendar1.<init>();
        if (paramLong < 3600000L)
        {
          paramContext = "";
          AppMethodBeat.o(39607);
          return paramContext;
        }
        l1 = localGregorianCalendar1.getTimeInMillis();
        if (!jZc.containsKey(Long.valueOf(paramLong)))
          break label134;
        if (l1 - ((Long)jZc.get(Long.valueOf(paramLong))).longValue() < 60000L)
        {
          if (!jZd.containsKey(Long.valueOf(paramLong)))
            break label134;
          paramContext = (String)jZd.get(Long.valueOf(paramLong));
          AppMethodBeat.o(39607);
          continue;
        }
      }
      finally
      {
      }
      jZc.remove(Long.valueOf(paramLong));
      label134: int i;
      int j;
      if ((l1 - paramLong) / 3600000L == 0L)
      {
        i = (int)((l1 - paramLong) / 60000L);
        j = i;
        if (i <= 0)
          j = 1;
        paramContext = paramContext.getResources().getQuantityString(2131361802, j, new Object[] { Integer.valueOf(j) });
        jZd.put(Long.valueOf(paramLong), paramContext);
        jZc.put(Long.valueOf(paramLong), Long.valueOf(l1));
        AppMethodBeat.o(39607);
      }
      else
      {
        GregorianCalendar localGregorianCalendar2 = new java/util/GregorianCalendar;
        localGregorianCalendar2.<init>(localGregorianCalendar1.get(1), localGregorianCalendar1.get(2), localGregorianCalendar1.get(5));
        long l2 = paramLong - localGregorianCalendar2.getTimeInMillis();
        if ((l2 > 0L) && (l2 <= 86400000L))
        {
          i = (int)((l1 - paramLong) / 3600000L);
          j = i;
          if (i <= 0)
            j = 1;
          paramContext = paramContext.getResources().getQuantityString(2131361801, j, new Object[] { Integer.valueOf(j) });
          jZd.put(Long.valueOf(paramLong), paramContext);
          jZc.put(Long.valueOf(paramLong), Long.valueOf(l1));
          AppMethodBeat.o(39607);
        }
        else
        {
          l2 = paramLong - localGregorianCalendar2.getTimeInMillis() + 86400000L;
          if ((l2 > 0L) && (l2 <= 86400000L))
          {
            paramContext = paramContext.getString(2131299986);
            jZd.put(Long.valueOf(paramLong), paramContext);
            jZc.put(Long.valueOf(paramLong), Long.valueOf(l1));
            AppMethodBeat.o(39607);
          }
          else
          {
            i = (int)((localGregorianCalendar2.getTimeInMillis() + 86400000L - paramLong) / 86400000L);
            j = i;
            if (i <= 0)
              j = 1;
            paramContext = paramContext.getResources().getQuantityString(2131361803, j, new Object[] { Integer.valueOf(j) });
            jZd.put(Long.valueOf(paramLong), paramContext);
            jZc.put(Long.valueOf(paramLong), Long.valueOf(l1));
            AppMethodBeat.o(39607);
          }
        }
      }
    }
  }

  private static CharSequence i(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(39603);
    paramContext = DateFormat.format(paramContext.getString(2131299964), paramLong);
    AppMethodBeat.o(39603);
    return paramContext;
  }

  public static CharSequence kL(long paramLong)
  {
    AppMethodBeat.i(39612);
    Object localObject = new GregorianCalendar();
    long l1 = paramLong - new GregorianCalendar(((GregorianCalendar)localObject).get(1), ((GregorianCalendar)localObject).get(2), ((GregorianCalendar)localObject).get(5)).getTimeInMillis();
    int i;
    if ((l1 > 0L) && (l1 <= 86400000L))
    {
      i = 1;
      if (i == 0)
        break label88;
      localObject = ah.getContext().getResources().getString(2131299977);
      AppMethodBeat.o(39612);
    }
    while (true)
    {
      return localObject;
      i = 0;
      break;
      label88: localObject = new GregorianCalendar();
      GregorianCalendar localGregorianCalendar = new GregorianCalendar(((GregorianCalendar)localObject).get(1), ((GregorianCalendar)localObject).get(2), ((GregorianCalendar)localObject).get(5));
      int j = ((GregorianCalendar)localObject).get(7) - 1;
      i = j;
      if (j == 0)
        i = 7;
      l1 = localGregorianCalendar.getTimeInMillis();
      long l2 = i;
      long l3 = localGregorianCalendar.getTimeInMillis();
      long l4 = 7 - i;
      if ((paramLong >= l1 - l2 * 86400000L) && (paramLong < l3 + l4 * 86400000L));
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label230;
        localObject = ah.getContext().getResources().getString(2131299943);
        AppMethodBeat.o(39612);
        break;
      }
      label230: localObject = DateFormat.format(ah.getContext().getString(2131300015), paramLong);
      AppMethodBeat.o(39612);
    }
  }

  public static String l(Context paramContext, long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(39604);
    Object localObject = Calendar.getInstance();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    int j;
    int k;
    label64: int m;
    label92: label122: int n;
    if (((Calendar)localObject).get(1) == localCalendar.get(1))
    {
      j = 1;
      if ((j == 0) || (((Calendar)localObject).get(2) != localCalendar.get(2)))
        break label248;
      k = 1;
      if ((j == 0) || (k == 0) || (((Calendar)localObject).get(5) != localCalendar.get(5)))
        break label254;
      m = 1;
      if ((j == 0) || (k == 0) || (((Calendar)localObject).get(5) - 1 != localCalendar.get(5)))
        break label260;
      k = 1;
      if (k != 0)
        break label523;
      if ((j == 0) || (((Calendar)localObject).get(2) - 1 != localCalendar.get(2)))
        break label266;
      n = 1;
    }
    while (true)
    {
      label152: if (n != 0)
      {
        ((Calendar)localObject).add(5, -1);
        k = i;
        if (((Calendar)localObject).get(1) == localCalendar.get(1))
        {
          k = i;
          if (((Calendar)localObject).get(2) == localCalendar.get(2))
          {
            k = i;
            if (((Calendar)localObject).get(5) == localCalendar.get(5))
              k = 1;
          }
        }
      }
      label260: label266: label523: 
      while (true)
      {
        if (m != 0)
        {
          paramContext = (String)i(paramContext, paramLong);
          AppMethodBeat.o(39604);
        }
        while (true)
        {
          return paramContext;
          j = 0;
          break;
          label248: k = 0;
          break label64;
          label254: m = 0;
          break label92;
          k = 0;
          break label122;
          if (((Calendar)localObject).get(1) - localCalendar.get(1) != 1)
            break label526;
          n = 1;
          break label152;
          if (k == 0)
            break label338;
          paramContext = paramContext.getString(2131299986) + " " + (String)i(paramContext, paramLong);
          AppMethodBeat.o(39604);
        }
        label338: if (j != 0);
        for (String str = (String)DateFormat.format(paramContext.getString(2131299933), paramLong); ; str = (String)DateFormat.format(paramContext.getString(2131299952), paramLong))
        {
          localObject = str;
          if (str.indexOf("-") > 0)
          {
            k = localCalendar.get(2);
            n = localCalendar.get(5);
            localObject = V(paramContext, k + 1);
            str = n + " " + (String)localObject;
            localObject = str;
            if (j == 0)
              localObject = str + " " + localCalendar.get(1);
          }
          paramContext = (String)localObject + " " + (String)i(paramContext, paramLong);
          AppMethodBeat.o(39604);
          break;
        }
      }
      label526: n = 0;
    }
  }

  public static String m(Context paramContext, long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(39605);
    Object localObject = Calendar.getInstance();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    int j;
    int k;
    label64: int m;
    label92: label122: int n;
    if (((Calendar)localObject).get(1) == localCalendar.get(1))
    {
      j = 1;
      if ((j == 0) || (((Calendar)localObject).get(2) != localCalendar.get(2)))
        break label248;
      k = 1;
      if ((j == 0) || (k == 0) || (((Calendar)localObject).get(5) != localCalendar.get(5)))
        break label254;
      m = 1;
      if ((j == 0) || (k == 0) || (((Calendar)localObject).get(5) - 1 != localCalendar.get(5)))
        break label260;
      k = 1;
      if (k != 0)
        break label500;
      if ((j == 0) || (((Calendar)localObject).get(2) - 1 != localCalendar.get(2)))
        break label266;
      n = 1;
    }
    while (true)
    {
      label152: if (n != 0)
      {
        ((Calendar)localObject).add(5, -1);
        k = i;
        if (((Calendar)localObject).get(1) == localCalendar.get(1))
        {
          k = i;
          if (((Calendar)localObject).get(2) == localCalendar.get(2))
          {
            k = i;
            if (((Calendar)localObject).get(5) == localCalendar.get(5))
              k = 1;
          }
        }
      }
      label260: label266: label500: 
      while (true)
      {
        if (m != 0)
        {
          paramContext = (String)i(paramContext, paramLong);
          AppMethodBeat.o(39605);
        }
        while (true)
        {
          return paramContext;
          j = 0;
          break;
          label248: k = 0;
          break label64;
          label254: m = 0;
          break label92;
          k = 0;
          break label122;
          if (((Calendar)localObject).get(1) - localCalendar.get(1) != 1)
            break label503;
          n = 1;
          break label152;
          if (k != 0)
          {
            paramContext = paramContext.getString(2131299986) + " " + (String)i(paramContext, paramLong);
            AppMethodBeat.o(39605);
          }
          else
          {
            String str = (String)DateFormat.format(paramContext.getString(2131299952), paramLong);
            localObject = str;
            if (str.indexOf("-") > 0)
            {
              n = localCalendar.get(2);
              k = localCalendar.get(5);
              localObject = V(paramContext, n + 1);
              str = k + " " + (String)localObject;
              localObject = str;
              if (j == 0)
                localObject = str + " " + localCalendar.get(1);
            }
            paramContext = (String)localObject + " " + (String)i(paramContext, paramLong);
            AppMethodBeat.o(39605);
          }
        }
      }
      label503: n = 0;
    }
  }

  public static String x(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(39610);
    if (nnw.get(paramString2) == null)
      aS(paramContext, paramString2);
    int i = bo.getInt(paramString1, 0);
    paramString1 = (List)nnw.get(paramString2);
    if ((i >= paramString1.size()) || (paramString1.get(i) == null) || (((String)paramString1.get(i)).equals("")))
      aS(paramContext, paramString2);
    paramContext = (List)nnw.get(paramString2);
    if (i < paramContext.size())
    {
      paramContext = (String)paramContext.get(i);
      AppMethodBeat.o(39610);
    }
    while (true)
    {
      return paramContext;
      paramContext = "";
      AppMethodBeat.o(39610);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.aw
 * JD-Core Version:    0.6.2
 */
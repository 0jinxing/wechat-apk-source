package com.tencent.mm.plugin.fts.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.DatabaseUtils;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.emoji.b.a;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private static final HashMap<String, String> mCH;
  private static String[] mCI;

  static
  {
    AppMethodBeat.i(114209);
    mCH = new HashMap();
    mCI = new String[] { "wxid_", "wx_", "gh_" };
    AppMethodBeat.o(114209);
  }

  public static final String B(String[] paramArrayOfString)
  {
    AppMethodBeat.i(114193);
    StringBuilder localStringBuilder = new StringBuilder(32);
    int i = paramArrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str = paramArrayOfString[j];
      localStringBuilder.append("\"");
      localStringBuilder.append(str);
      int k = str.charAt(str.length() - 1);
      if ((k >= 48) && (k <= 57))
      {
        k = 1;
        label75: if (k == 0)
          break label139;
        localStringBuilder.append("\"* ");
      }
      while (true)
      {
        j++;
        break;
        if ((k >= 65) && (k <= 90))
        {
          k = 1;
          break label75;
        }
        if ((k >= 97) && (k <= 122))
        {
          k = 1;
          break label75;
        }
        k = 0;
        break label75;
        label139: localStringBuilder.append("\" ");
      }
    }
    paramArrayOfString = localStringBuilder.toString().trim();
    AppMethodBeat.o(114193);
    return paramArrayOfString;
  }

  public static String C(String[] paramArrayOfString)
  {
    AppMethodBeat.i(114201);
    StringBuilder localStringBuilder = new StringBuilder(256);
    localStringBuilder.append('(');
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      localStringBuilder.append(DatabaseUtils.sqlEscapeString(str) + ',');
    }
    localStringBuilder.setCharAt(localStringBuilder.length() - 1, ')');
    paramArrayOfString = localStringBuilder.toString();
    AppMethodBeat.o(114201);
    return paramArrayOfString;
  }

  public static boolean L(long paramLong1, long paramLong2)
  {
    boolean bool = false;
    AppMethodBeat.i(114205);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong1);
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    paramLong1 = localCalendar.getTimeInMillis();
    localCalendar.setTimeInMillis(paramLong2);
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    if (paramLong1 == localCalendar.getTimeInMillis())
    {
      bool = true;
      AppMethodBeat.o(114205);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(114205);
    }
  }

  public static String LC(String paramString)
  {
    AppMethodBeat.i(114206);
    ad localad = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(paramString);
    if (localad != null)
      if (!bo.isNullOrNil(localad.field_conRemark))
      {
        paramString = localad.field_conRemark;
        AppMethodBeat.o(114206);
      }
    while (true)
    {
      return paramString;
      if (!bo.isNullOrNil(localad.field_nickname))
      {
        paramString = localad.field_nickname;
        AppMethodBeat.o(114206);
      }
      else if (t.mN(localad.field_username))
      {
        paramString = ((c)com.tencent.mm.kernel.g.K(c.class)).XV().mJ(paramString);
        if (!bo.isNullOrNil(paramString))
          AppMethodBeat.o(114206);
      }
      else
      {
        paramString = localad.field_username;
        AppMethodBeat.o(114206);
        continue;
        AppMethodBeat.o(114206);
      }
    }
  }

  public static String MZ(String paramString)
  {
    AppMethodBeat.i(114189);
    if (t.mN(paramString))
      AppMethodBeat.o(114189);
    while (true)
    {
      return paramString;
      ad localad = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(paramString);
      if (localad == null)
      {
        AppMethodBeat.o(114189);
      }
      else if (!bo.isNullOrNil(localad.field_conRemarkPYFull))
      {
        paramString = localad.field_conRemarkPYFull;
        AppMethodBeat.o(114189);
      }
      else if (!bo.isNullOrNil(localad.Hu()))
      {
        paramString = localad.Hu();
        AppMethodBeat.o(114189);
      }
      else if (!bo.isNullOrNil(localad.Hq()))
      {
        paramString = localad.Hq();
        AppMethodBeat.o(114189);
      }
      else
      {
        AppMethodBeat.o(114189);
      }
    }
  }

  public static final String Na(String paramString)
  {
    AppMethodBeat.i(114196);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(114196);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.trim();
      paramString = g.Nf(((a)com.tencent.mm.kernel.g.K(a.class)).dE(paramString, " "));
      AppMethodBeat.o(114196);
    }
  }

  public static final String Nb(String paramString)
  {
    AppMethodBeat.i(114197);
    paramString = g.Nf(paramString.toLowerCase());
    AppMethodBeat.o(114197);
    return paramString;
  }

  public static final String Nc(String paramString)
  {
    AppMethodBeat.i(114198);
    if (paramString != null)
    {
      paramString = paramString.replace('*', ' ').trim();
      AppMethodBeat.o(114198);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(114198);
    }
  }

  public static boolean Nd(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(114203);
    if (paramString == null)
      AppMethodBeat.o(114203);
    while (true)
    {
      return bool;
      if ((paramString.length() < 20) && (paramString.matches("^[0-9]+$")))
      {
        bool = true;
        AppMethodBeat.o(114203);
      }
      else
      {
        AppMethodBeat.o(114203);
      }
    }
  }

  public static boolean Ne(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(114204);
    if (paramString == null)
      AppMethodBeat.o(114204);
    while (true)
    {
      return bool;
      if ((paramString.length() < 20) && (paramString.matches("^[A-Za-z0-9\\-_]+$")))
      {
        bool = true;
        AppMethodBeat.o(114204);
      }
      else
      {
        AppMethodBeat.o(114204);
      }
    }
  }

  public static int a(Map<Integer, Integer> paramMap, int paramInt1, int paramInt2)
  {
    int i = 2147483647;
    AppMethodBeat.i(114194);
    if (paramInt1 == paramInt2)
    {
      paramInt1 = 0;
      AppMethodBeat.o(114194);
      return paramInt1;
    }
    Integer localInteger = (Integer)paramMap.get(Integer.valueOf(paramInt1));
    if (localInteger == null)
    {
      paramInt1 = 2147483647;
      label45: paramMap = (Integer)paramMap.get(Integer.valueOf(paramInt2));
      if (paramMap != null)
        break label86;
    }
    label86: for (paramInt2 = i; ; paramInt2 = paramMap.intValue())
    {
      paramInt1 -= paramInt2;
      AppMethodBeat.o(114194);
      break;
      paramInt1 = localInteger.intValue();
      break label45;
    }
  }

  public static List<l> a(List<l> paramList, Map<Integer, Integer> paramMap)
  {
    AppMethodBeat.i(114195);
    d.1 local1 = new d.1(paramMap);
    paramMap = new l();
    paramMap.type = 131073;
    int i = Collections.binarySearch(paramList, paramMap, local1);
    paramMap.type = 131074;
    int j = Collections.binarySearch(paramList, paramMap, local1);
    int k = i;
    if (i < 0)
    {
      i = -i - 1;
      if (j >= 0)
        break label126;
      k = -j - 1;
    }
    while (true)
    {
      paramList = paramList.subList(i, k);
      AppMethodBeat.o(114195);
      return paramList;
      do
        k--;
      while ((k >= 0) && (((l)paramList.get(k)).type == 131073));
      i = k + 1;
      break;
      label126: int m = paramList.size();
      for (k = j + 1; (k < m) && (((l)paramList.get(k)).type == 131074); k++);
    }
  }

  public static String aL(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(114200);
    if (paramString == null)
    {
      AppMethodBeat.o(114200);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      String str = Na(paramString).toLowerCase();
      ArrayList localArrayList1 = new ArrayList();
      int i = 0;
      int j = 0;
      if (i < str.length())
      {
        char c = str.charAt(i);
        if (g.t(c))
        {
          String[] arrayOfString = (String[])g.mDn.get(String.valueOf(c));
          if ((arrayOfString != null) && (arrayOfString.length > 0) && (arrayOfString[0].length() > 0))
          {
            ArrayList localArrayList2 = new ArrayList();
            j = 0;
            if (j < arrayOfString.length)
            {
              if (paramBoolean);
              for (paramString = arrayOfString[j].substring(0, 1); ; paramString = arrayOfString[j])
              {
                if (!localArrayList2.contains(paramString))
                  localArrayList2.add(paramString);
                j++;
                break;
              }
            }
            localArrayList1.add(bo.c(localArrayList2, "‏"));
            j = 1;
          }
        }
        while (true)
        {
          i++;
          break;
          localArrayList1.add(" ");
          continue;
          localArrayList1.add(" ");
        }
      }
      if (j != 0)
      {
        paramString = bo.c(localArrayList1, "‍");
        AppMethodBeat.o(114200);
      }
      else
      {
        AppMethodBeat.o(114200);
        paramString = null;
      }
    }
  }

  public static void b(Context paramContext, String paramString, Intent paramIntent, Bundle paramBundle)
  {
    AppMethodBeat.i(114208);
    Intent localIntent = paramIntent;
    if (paramIntent == null);
    try
    {
      localIntent = new android/content/Intent;
      localIntent.<init>();
      paramIntent = new java/lang/StringBuilder;
      paramIntent.<init>();
      String str = ah.doz() + ".plugin.fts";
      paramIntent = paramString;
      if (paramString.startsWith("."))
      {
        paramIntent = new java/lang/StringBuilder;
        paramIntent.<init>();
        paramIntent = str + paramString;
      }
      localIntent.setClassName(ah.getPackageName(), paramIntent);
      Class.forName(paramIntent, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity))
      {
        paramContext.startActivity(localIntent, paramBundle);
        AppMethodBeat.o(114208);
      }
      while (true)
      {
        return;
        localIntent.addFlags(268435456);
        paramContext.startActivity(localIntent, paramBundle);
        AppMethodBeat.o(114208);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.FTS.FTSApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
        AppMethodBeat.o(114208);
      }
    }
  }

  public static final HashMap<String, String> bAi()
  {
    AppMethodBeat.i(114190);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = mCH.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put(localEntry.getKey(), localEntry.getValue());
    }
    AppMethodBeat.o(114190);
    return localHashMap;
  }

  public static final void bW(List<l> paramList)
  {
    AppMethodBeat.i(114191);
    mCH.clear();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      l locall = (l)paramList.next();
      if ((locall.userData instanceof String))
        mCH.put(locall.mDx, (String)locall.userData);
      else
        mCH.put(locall.mDx, "");
    }
    AppMethodBeat.o(114191);
  }

  public static void c(Context paramContext, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(114207);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = ah.doz() + ".plugin.fts";
      localObject = paramString;
      if (paramString.startsWith("."))
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = str + paramString;
      }
      paramIntent.setClassName(ah.getPackageName(), (String)localObject);
      Class.forName((String)localObject, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity))
      {
        paramContext.startActivity(paramIntent);
        AppMethodBeat.o(114207);
      }
      while (true)
      {
        return;
        paramIntent.addFlags(268435456);
        paramContext.startActivity(paramIntent);
        AppMethodBeat.o(114207);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.FTS.FTSApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
        AppMethodBeat.o(114207);
      }
    }
  }

  public static boolean e(int paramInt, int[] paramArrayOfInt)
  {
    boolean bool1 = false;
    int i = paramArrayOfInt.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (paramInt == paramArrayOfInt[j])
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  public static String eu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(114199);
    if ((paramString2 != null) && (paramString2.length() > 0))
      AppMethodBeat.o(114199);
    while (true)
    {
      return paramString2;
      paramString2 = mCI;
      int i = paramString2.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label66;
        if (paramString1.startsWith(paramString2[j]))
        {
          AppMethodBeat.o(114199);
          paramString2 = null;
          break;
        }
      }
      label66: if (paramString1.indexOf('@') >= 0)
      {
        AppMethodBeat.o(114199);
        paramString2 = null;
      }
      else
      {
        AppMethodBeat.o(114199);
        paramString2 = paramString1;
      }
    }
  }

  public static int f(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 2147483647;
    if (paramInt1 == paramInt2)
    {
      paramInt1 = 0;
      return paramInt1;
    }
    if (paramInt1 >= paramArrayOfInt.length)
    {
      paramInt1 = 2147483647;
      label21: if (paramInt2 < paramArrayOfInt.length)
        break label43;
    }
    label43: for (paramInt2 = i; ; paramInt2 = paramArrayOfInt[paramInt2])
    {
      paramInt1 -= paramInt2;
      break;
      paramInt1 = paramArrayOfInt[paramInt1];
      break label21;
    }
  }

  public static boolean h(int[] paramArrayOfInt, int paramInt)
  {
    AppMethodBeat.i(114202);
    boolean bool;
    if (Arrays.binarySearch(paramArrayOfInt, paramInt) >= 0)
    {
      bool = true;
      AppMethodBeat.o(114202);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(114202);
    }
  }

  public static String t(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(114192);
    StringBuilder localStringBuilder = new StringBuilder(32);
    localStringBuilder.append('(');
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
      localStringBuilder.append(paramArrayOfInt[j]).append(',');
    localStringBuilder.setCharAt(localStringBuilder.length() - 1, ')');
    paramArrayOfInt = localStringBuilder.toString();
    AppMethodBeat.o(114192);
    return paramArrayOfInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.d
 * JD-Core Version:    0.6.2
 */
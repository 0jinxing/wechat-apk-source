package com.tencent.d.d.b;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class d
{
  private static String Rb(int paramInt)
  {
    AppMethodBeat.i(114524);
    String str = "";
    try
    {
      localObject = a.eO(String.format(Locale.ENGLISH, "/proc/%d/cmdline", new Object[] { Integer.valueOf(paramInt) }), 100);
      if (localObject != null)
      {
        int i = a((byte[])localObject, 0, '\000');
        str = new java/lang/String;
        str.<init>((byte[])localObject, 0, i);
      }
      localObject = str;
      byte[] arrayOfByte;
      if (TextUtils.isEmpty(str))
      {
        arrayOfByte = a.eO(String.format(Locale.ENGLISH, "/proc/%d/status", new Object[] { Integer.valueOf(paramInt) }), 150);
        localObject = str;
        if (arrayOfByte != null)
        {
          paramInt = a(arrayOfByte, 7, '\n');
          if (paramInt == 0)
          {
            localObject = "";
            AppMethodBeat.o(114524);
          }
        }
      }
      while (true)
      {
        return localObject;
        localObject = new java/lang/String;
        ((String)localObject).<init>(arrayOfByte, 6, paramInt - 6);
        AppMethodBeat.o(114524);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Object localObject = "";
        AppMethodBeat.o(114524);
      }
    }
  }

  private static d.a Rc(int paramInt)
  {
    AppMethodBeat.i(114525);
    try
    {
      str1 = Rb(paramInt);
    }
    catch (Exception localException3)
    {
      try
      {
        localObject2 = a.eO(String.format(Locale.ENGLISH, "/proc/%d/status", new Object[] { Integer.valueOf(paramInt) }), 150);
        if (localObject2 != null)
        {
          i = a((byte[])localObject2, 7, '\n');
          if (i != 0)
          {
            i = a((byte[])localObject2, a((byte[])localObject2, a((byte[])localObject2, i + 1, '\n') + 1, '\n') + 1, '\n');
            if (i != 0)
            {
              j = i + 7;
              i = a((byte[])localObject2, i + 1, '\n');
              if (i != 0)
              {
                str3 = new java/lang/String;
                str3.<init>((byte[])localObject2, j, i - j);
                j = Integer.parseInt(str3);
              }
            }
          }
        }
      }
      catch (Exception localException3)
      {
        while (true)
        {
          try
          {
            String str1;
            Object localObject2;
            String str3;
            i = a((byte[])localObject2, i + 1, '\n');
            if (i != 0)
            {
              int k = i + 6;
              i = a((byte[])localObject2, k + 1, '\t');
              str3 = new java/lang/String;
              str3.<init>((byte[])localObject2, k, i - k);
              i = Integer.parseInt(str3);
              try
              {
                localObject2 = new java/lang/String;
                ((String)localObject2).<init>(a.atR(String.format(Locale.ENGLISH, "/proc/%d/attr/current", new Object[] { Integer.valueOf(paramInt) })));
                localObject2 = ((String)localObject2).trim();
                if ((str1 == null) || (j == -1) || (i == -1))
                {
                  AppMethodBeat.o(114525);
                  str1 = null;
                  return str1;
                  localException1 = localException1;
                  i = -1;
                  localObject1 = null;
                  k = -1;
                  j = i;
                  i = k;
                  continue;
                }
              }
              catch (Exception localException2)
              {
                String str2 = null;
                continue;
                Object localObject1 = new d.a(paramInt, j, (String)localObject1, i, str2);
                AppMethodBeat.o(114525);
                continue;
              }
              localException3 = localException3;
              i = -1;
              continue;
            }
          }
          catch (Exception localException4)
          {
            i = j;
            continue;
            i = -1;
            continue;
          }
          int i = -1;
          int j = -1;
        }
      }
    }
  }

  private static int a(byte[] paramArrayOfByte, int paramInt, char paramChar)
  {
    for (int i = paramInt - 1; ; i = paramInt)
    {
      paramInt = i + 1;
      if (i < paramArrayOfByte.length)
      {
        i = paramInt;
        if (paramInt != paramArrayOfByte.length)
          if (paramArrayOfByte[paramInt] != paramChar)
            continue;
      }
      for (i = paramInt; ; i = 0)
        return i;
    }
  }

  public static List<d.a> dQo()
  {
    int i = 0;
    AppMethodBeat.i(114523);
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = new File("/proc").list();
    if (arrayOfString == null)
      AppMethodBeat.o(114523);
    while (true)
    {
      return localArrayList;
      int j = arrayOfString.length;
      while (true)
        if (i < j)
        {
          Object localObject = arrayOfString[i];
          if (!TextUtils.isEmpty((CharSequence)localObject));
          try
          {
            int k = ((String)localObject).charAt(0);
            if ((k > 57) || (k < 48));
            while (true)
            {
              label82: i++;
              break;
              localObject = Rc(Integer.parseInt((String)localObject));
              if (localObject != null)
                localArrayList.add(localObject);
            }
          }
          catch (Exception localException)
          {
            break label82;
          }
        }
      AppMethodBeat.o(114523);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.b.d
 * JD-Core Version:    0.6.2
 */
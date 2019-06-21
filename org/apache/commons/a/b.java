package org.apache.commons.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public final class b
{
  public static final String BWv;
  private static final char BWw;
  private static final char BWx;

  static
  {
    AppMethodBeat.i(136499);
    BWv = Character.toString('.');
    int i = File.separatorChar;
    BWw = (char)i;
    if (i == 92)
    {
      i = 1;
      if (i == 0)
        break label51;
      BWx = (char)47;
      AppMethodBeat.o(136499);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label51: BWx = (char)92;
      AppMethodBeat.o(136499);
    }
  }

  private static int awG(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(136494);
    if (paramString == null)
    {
      AppMethodBeat.o(136494);
      i = -1;
    }
    while (true)
    {
      return i;
      int j = paramString.length();
      if (j == 0)
      {
        AppMethodBeat.o(136494);
      }
      else
      {
        char c1 = paramString.charAt(0);
        if (c1 == ':')
        {
          AppMethodBeat.o(136494);
          i = -1;
        }
        else if (j == 1)
        {
          if (c1 == '~')
          {
            AppMethodBeat.o(136494);
            i = 2;
          }
          else if (isSeparator(c1))
          {
            AppMethodBeat.o(136494);
            i = 1;
          }
          else
          {
            AppMethodBeat.o(136494);
          }
        }
        else
        {
          int k;
          int m;
          if (c1 == '~')
          {
            k = paramString.indexOf('/', 1);
            m = paramString.indexOf('\\', 1);
            if ((k == -1) && (m == -1))
            {
              i = j + 1;
              AppMethodBeat.o(136494);
            }
            else
            {
              i = k;
              if (k == -1)
                i = m;
              k = m;
              if (m == -1)
                k = i;
              i = Math.min(i, k) + 1;
              AppMethodBeat.o(136494);
            }
          }
          else
          {
            char c2 = paramString.charAt(1);
            if (c2 == ':')
            {
              i = Character.toUpperCase(c1);
              if ((i >= 65) && (i <= 90))
              {
                if ((j == 2) || (!isSeparator(paramString.charAt(2))))
                {
                  AppMethodBeat.o(136494);
                  i = 2;
                }
                else
                {
                  i = 3;
                  AppMethodBeat.o(136494);
                }
              }
              else if (i == 47)
              {
                AppMethodBeat.o(136494);
                i = 1;
              }
              else
              {
                AppMethodBeat.o(136494);
                i = -1;
              }
            }
            else if ((isSeparator(c1)) && (isSeparator(c2)))
            {
              i = paramString.indexOf('/', 2);
              m = paramString.indexOf('\\', 2);
              if (((i == -1) && (m == -1)) || (i == 2) || (m == 2))
              {
                AppMethodBeat.o(136494);
                i = -1;
              }
              else
              {
                if (i == -1)
                  i = m;
                while (true)
                {
                  k = m;
                  if (m == -1)
                    k = i;
                  i = Math.min(i, k) + 1;
                  AppMethodBeat.o(136494);
                  break;
                }
              }
            }
            else if (isSeparator(c1))
            {
              AppMethodBeat.o(136494);
              i = 1;
            }
            else
            {
              AppMethodBeat.o(136494);
            }
          }
        }
      }
    }
  }

  private static int awH(String paramString)
  {
    AppMethodBeat.i(136495);
    int i;
    if (paramString == null)
    {
      i = -1;
      AppMethodBeat.o(136495);
    }
    while (true)
    {
      return i;
      i = Math.max(paramString.lastIndexOf('/'), paramString.lastIndexOf('\\'));
      AppMethodBeat.o(136495);
    }
  }

  private static void awI(String paramString)
  {
    AppMethodBeat.i(136497);
    int i = paramString.length();
    for (int j = 0; j < i; j++)
      if (paramString.charAt(j) == 0)
      {
        paramString = new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
        AppMethodBeat.o(136497);
        throw paramString;
      }
    AppMethodBeat.o(136497);
  }

  public static String awJ(String paramString)
  {
    AppMethodBeat.i(136498);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(136498);
    }
    while (true)
    {
      return paramString;
      int i;
      if (paramString == null)
        i = -1;
      while (true)
      {
        if (i != -1)
          break label62;
        paramString = "";
        AppMethodBeat.o(136498);
        break;
        int j = paramString.lastIndexOf('.');
        i = j;
        if (awH(paramString) > j)
          i = -1;
      }
      label62: paramString = paramString.substring(i + 1);
      AppMethodBeat.o(136498);
    }
  }

  public static String getName(String paramString)
  {
    AppMethodBeat.i(136496);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(136496);
    }
    while (true)
    {
      return paramString;
      awI(paramString);
      paramString = paramString.substring(awH(paramString) + 1);
      AppMethodBeat.o(136496);
    }
  }

  private static boolean isSeparator(char paramChar)
  {
    if ((paramChar == '/') || (paramChar == '\\'));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String jj(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(136493);
    int i = awG(paramString2);
    if (i < 0)
    {
      AppMethodBeat.o(136493);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      if (i > 0)
      {
        paramString1 = normalize(paramString2);
        AppMethodBeat.o(136493);
      }
      else if (paramString1 == null)
      {
        AppMethodBeat.o(136493);
        paramString1 = localObject;
      }
      else
      {
        i = paramString1.length();
        if (i == 0)
        {
          paramString1 = normalize(paramString2);
          AppMethodBeat.o(136493);
        }
        else if (isSeparator(paramString1.charAt(i - 1)))
        {
          paramString1 = normalize(paramString1 + paramString2);
          AppMethodBeat.o(136493);
        }
        else
        {
          paramString1 = normalize(paramString1 + '/' + paramString2);
          AppMethodBeat.o(136493);
        }
      }
    }
  }

  private static String normalize(String paramString)
  {
    AppMethodBeat.i(136492);
    int i = BWw;
    if (paramString == null)
    {
      AppMethodBeat.o(136492);
      paramString = null;
    }
    int j;
    int k;
    while (true)
    {
      return paramString;
      awI(paramString);
      j = paramString.length();
      if (j == 0)
      {
        AppMethodBeat.o(136492);
      }
      else
      {
        k = awG(paramString);
        if (k >= 0)
          break;
        AppMethodBeat.o(136492);
        paramString = null;
      }
    }
    char[] arrayOfChar = new char[j + 2];
    paramString.getChars(0, paramString.length(), arrayOfChar, 0);
    if (i == BWw);
    int n;
    for (int m = BWx; ; m = BWw)
      for (n = 0; n < arrayOfChar.length; n++)
        if (arrayOfChar[n] == m)
          arrayOfChar[n] = ((char)i);
    if (arrayOfChar[(j - 1)] != i)
    {
      m = j + 1;
      arrayOfChar[j] = ((char)i);
      n = 0;
      j = m;
    }
    for (m = n; ; m = 1)
    {
      n = k + 1;
      int i1;
      while (n < j)
      {
        i1 = j;
        i2 = n;
        if (arrayOfChar[n] == i)
        {
          i1 = j;
          i2 = n;
          if (arrayOfChar[(n - 1)] == i)
          {
            System.arraycopy(arrayOfChar, n, arrayOfChar, n - 1, j - n);
            i1 = j - 1;
            i2 = n - 1;
          }
        }
        n = i2 + 1;
        j = i1;
      }
      n = k + 1;
      int i3;
      while (n < j)
      {
        i3 = m;
        i2 = j;
        i1 = n;
        if (arrayOfChar[n] == i)
        {
          i3 = m;
          i2 = j;
          i1 = n;
          if (arrayOfChar[(n - 1)] == '.')
            if (n != k + 1)
            {
              i3 = m;
              i2 = j;
              i1 = n;
              if (arrayOfChar[(n - 2)] != i);
            }
            else
            {
              if (n == j - 1)
                m = 1;
              System.arraycopy(arrayOfChar, n + 1, arrayOfChar, n - 1, j - n);
              i2 = j - 2;
              i1 = n - 1;
              i3 = m;
            }
        }
        n = i1 + 1;
        m = i3;
        j = i2;
      }
      n = k + 2;
      int i2 = j;
      if (n < i2)
      {
        i3 = m;
        j = i2;
        i1 = n;
        if (arrayOfChar[n] == i)
        {
          i3 = m;
          j = i2;
          i1 = n;
          if (arrayOfChar[(n - 1)] == '.')
          {
            i3 = m;
            j = i2;
            i1 = n;
            if (arrayOfChar[(n - 2)] == '.')
              if (n != k + 2)
              {
                i3 = m;
                j = i2;
                i1 = n;
                if (arrayOfChar[(n - 3)] != i);
              }
              else
              {
                if (n == k + 2)
                {
                  AppMethodBeat.o(136492);
                  paramString = null;
                  break;
                }
                if (n == i2 - 1)
                  m = 1;
                j = n - 4;
                label542: if (j < k)
                  break label617;
                if (arrayOfChar[j] != i)
                  break label611;
                System.arraycopy(arrayOfChar, n + 1, arrayOfChar, j + 1, i2 - n);
                n = i2 - (n - j);
                i1 = j + 1;
                j = n;
              }
          }
        }
        for (i3 = m; ; i3 = m)
        {
          n = i1 + 1;
          m = i3;
          i2 = j;
          break;
          label611: j--;
          break label542;
          label617: System.arraycopy(arrayOfChar, n + 1, arrayOfChar, k, i2 - n);
          j = i2 - (n + 1 - k);
          i1 = k + 1;
        }
      }
      if (i2 <= 0)
      {
        paramString = "";
        AppMethodBeat.o(136492);
        break;
      }
      if (i2 <= k)
      {
        paramString = new String(arrayOfChar, 0, i2);
        AppMethodBeat.o(136492);
        break;
      }
      if (m != 0)
      {
        paramString = new String(arrayOfChar, 0, i2);
        AppMethodBeat.o(136492);
        break;
      }
      paramString = new String(arrayOfChar, 0, i2 - 1);
      AppMethodBeat.o(136492);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     org.apache.commons.a.b
 * JD-Core Version:    0.6.2
 */
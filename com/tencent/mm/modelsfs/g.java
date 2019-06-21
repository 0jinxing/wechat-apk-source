package com.tencent.mm.modelsfs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.EnumSet;

final class g
{
  private static int a(String paramString, int paramInt, char paramChar, EnumSet<a> paramEnumSet)
  {
    int i = 0;
    AppMethodBeat.i(93210);
    if (paramInt >= paramString.length())
    {
      AppMethodBeat.o(93210);
      paramInt = -1;
      return paramInt;
    }
    int j = paramString.charAt(paramInt);
    if ((j == 33) || (j == 94));
    int m;
    for (int k = 1; ; k = 0)
    {
      c1 = paramInt;
      if (k != 0)
        c1 = paramInt + 1;
      m = paramChar;
      if (paramEnumSet.contains(a.fOi))
        m = Character.toLowerCase(paramChar);
      paramInt = 0;
      label83: if (c1 < paramString.length())
        break label108;
      AppMethodBeat.o(93210);
      paramInt = -1;
      break;
    }
    label108: j = c1 + '\001';
    char c1 = paramString.charAt(c1);
    char c2;
    if (c1 != ']')
    {
      if ((c1 != '\\') || (paramEnumSet.contains(a.fOe)))
        break label410;
      c1 = j + 1;
      c2 = paramString.charAt(j);
      j = c1;
    }
    label407: label410: for (paramChar = c2; ; paramChar = c1)
    {
      if ((paramChar == '/') && (paramEnumSet.contains(a.fOf)))
      {
        AppMethodBeat.o(93210);
        paramInt = i;
        break;
      }
      c2 = paramChar;
      if (paramEnumSet.contains(a.fOi))
        c2 = Character.toLowerCase(paramChar);
      if ((paramString.charAt(j) == '-') && (j + 1 < paramString.length()))
      {
        paramChar = paramString.charAt(j + 1);
        if (paramChar != ']')
        {
          j += 2;
          if ((paramChar != '\\') || (paramEnumSet.contains(a.fOe)))
            break label407;
          if (j >= paramString.length())
          {
            AppMethodBeat.o(93210);
            paramInt = -1;
            break;
          }
          c1 = j + 1;
          c2 = paramString.charAt(j);
          j = c1;
        }
      }
      while (true)
      {
        if (paramEnumSet.contains(a.fOi));
        for (int n = Character.toLowerCase(paramChar); ; n = paramChar)
        {
          c1 = j;
          if (c2 > m)
            break label83;
          c1 = j;
          if (m > n)
            break label83;
          paramInt = 1;
          c1 = j;
          break label83;
          c1 = j;
          if (c2 != m)
            break label83;
          paramInt = 1;
          c1 = j;
          break label83;
          if (paramInt == k)
          {
            AppMethodBeat.o(93210);
            paramInt = i;
            break;
          }
          AppMethodBeat.o(93210);
          paramInt = j;
          break;
        }
      }
    }
  }

  static boolean a(String paramString1, int paramInt1, String paramString2, int paramInt2, EnumSet<a> paramEnumSet)
  {
    AppMethodBeat.i(93208);
    boolean bool;
    label42: int i;
    int j;
    label132: int k;
    while (true)
    {
      if (paramInt1 >= paramString1.length())
        if ((paramEnumSet.contains(a.fOh)) && (paramString2.charAt(paramInt2) == '/'))
        {
          AppMethodBeat.o(93208);
          bool = true;
        }
      while (true)
      {
        return bool;
        if (paramInt2 == paramString2.length())
        {
          AppMethodBeat.o(93208);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(93208);
          bool = false;
          continue;
          i = paramInt1 + 1;
          j = paramString1.charAt(paramInt1);
          switch (j)
          {
          default:
            paramInt1 = i;
            k = j;
            if (paramInt2 < paramString2.length())
              break label701;
            AppMethodBeat.o(93208);
            bool = false;
            break;
          case 63:
            label139: if (paramInt2 >= paramString2.length())
            {
              AppMethodBeat.o(93208);
              bool = false;
            }
            else if ((paramString2.charAt(paramInt2) == '/') && (paramEnumSet.contains(a.fOf)))
            {
              AppMethodBeat.o(93208);
              bool = false;
            }
            else
            {
              if (!a(paramString2, paramInt2, paramEnumSet))
                break label230;
              AppMethodBeat.o(93208);
              bool = false;
            }
            break;
          case 91:
          case 92:
          case 42:
          }
        }
      }
      label230: paramInt2++;
      paramInt1 = i;
    }
    while (true)
      if (paramInt1 < paramString1.length())
      {
        j = paramString1.charAt(paramInt1);
        i = j;
        if (j == 42)
        {
          paramInt1++;
          i = j;
        }
      }
      else
      {
        if (a(paramString2, paramInt2, paramEnumSet))
        {
          AppMethodBeat.o(93208);
          bool = false;
          break label42;
        }
        if (paramInt1 == paramString1.length())
        {
          if (paramEnumSet.contains(a.fOf))
          {
            if ((paramEnumSet.contains(a.fOh)) || (paramString2.indexOf('/', paramInt2) == -1))
            {
              AppMethodBeat.o(93208);
              bool = true;
              break label42;
            }
            AppMethodBeat.o(93208);
            bool = false;
            break label42;
          }
          AppMethodBeat.o(93208);
          bool = true;
          break label42;
        }
        j = paramInt2;
        EnumSet<a> localEnumSet = paramEnumSet;
        if (i == 47)
        {
          j = paramInt2;
          localEnumSet = paramEnumSet;
          if (paramEnumSet.contains(a.fOf))
          {
            i = paramString2.indexOf('/', paramInt2);
            paramInt2 = i;
            if (i != -1)
              break;
            AppMethodBeat.o(93208);
            bool = false;
            break label42;
          }
        }
        while (true)
          if ((paramString2.charAt(j) != '/') || (!paramEnumSet.contains(a.fOf)))
          {
            j++;
            localEnumSet = paramEnumSet;
            if (j < paramString2.length())
            {
              paramEnumSet = localEnumSet;
              if (localEnumSet.contains(a.fOg))
              {
                paramEnumSet = EnumSet.copyOf(localEnumSet);
                paramEnumSet.remove(a.fOg);
              }
              if (a(paramString1, paramInt1, paramString2, j, paramEnumSet))
              {
                AppMethodBeat.o(93208);
                bool = true;
                break;
              }
            }
          }
        AppMethodBeat.o(93208);
        bool = false;
        break label42;
        if (paramInt2 >= paramString2.length())
        {
          AppMethodBeat.o(93208);
          bool = false;
          break label42;
        }
        if ((paramString2.charAt(paramInt2) == '/') && (paramEnumSet.contains(a.fOf)))
        {
          AppMethodBeat.o(93208);
          bool = false;
          break label42;
        }
        if (a(paramString2, paramInt2, paramEnumSet))
        {
          AppMethodBeat.o(93208);
          bool = false;
          break label42;
        }
        paramInt1 = a(paramString1, i, paramString2.charAt(paramInt2), paramEnumSet);
        if (paramInt1 == -1)
          break label132;
        if (paramInt1 == 0)
        {
          AppMethodBeat.o(93208);
          bool = false;
          break label42;
        }
        paramInt2++;
        break;
        if (paramEnumSet.contains(a.fOe))
          break label132;
        if (i >= paramString1.length())
        {
          j = 92;
          paramInt1 = i;
          k = j;
          break label139;
        }
        paramInt1 = i + 1;
        i = paramString1.charAt(i);
        k = i;
        break label139;
        label701: if ((k != paramString2.charAt(paramInt2)) && ((!paramEnumSet.contains(a.fOi)) || (Character.toLowerCase(k) != Character.toLowerCase(paramString2.charAt(paramInt2)))))
        {
          AppMethodBeat.o(93208);
          bool = false;
          break label42;
        }
        paramInt2++;
        break;
        paramInt1 = i;
        i = j;
      }
  }

  private static boolean a(String paramString, int paramInt, EnumSet<a> paramEnumSet)
  {
    boolean bool = false;
    AppMethodBeat.i(93209);
    if (paramInt > paramString.length() - 1)
      AppMethodBeat.o(93209);
    while (true)
    {
      return bool;
      if (((paramInt == 0) || ((paramEnumSet.contains(a.fOf)) && (paramString.charAt(paramInt - 1) == '/'))) && (paramString.charAt(paramInt) == '.') && (paramEnumSet.contains(a.fOg)))
      {
        bool = true;
        AppMethodBeat.o(93209);
      }
      else
      {
        AppMethodBeat.o(93209);
      }
    }
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(93207);
      fOe = new a("NOESCAPE", 0);
      fOf = new a("PATHNAME", 1);
      fOg = new a("PERIOD", 2);
      fOh = new a("LEADING_DIR", 3);
      fOi = new a("CASEFOLD", 4);
      fOj = new a[] { fOe, fOf, fOg, fOh, fOi };
      AppMethodBeat.o(93207);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.g
 * JD-Core Version:    0.6.2
 */
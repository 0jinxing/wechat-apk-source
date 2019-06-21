package com.google.b.d;

import com.google.b.a;
import com.google.b.b.b;
import com.google.b.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class d extends o
{
  private static int c(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57316);
    a locala1 = d(paramCharSequence, paramInt1);
    if ((locala1 == a.bAp) || (locala1 == a.bAq))
    {
      AppMethodBeat.o(57316);
      paramInt2 = 100;
    }
    while (true)
    {
      return paramInt2;
      if (paramInt2 == 99)
      {
        AppMethodBeat.o(57316);
      }
      else
      {
        a locala2;
        if (paramInt2 == 100)
        {
          if (locala1 == a.bAs)
          {
            AppMethodBeat.o(57316);
          }
          else
          {
            locala2 = d(paramCharSequence, paramInt1 + 2);
            if ((locala2 == a.bAp) || (locala2 == a.bAq))
            {
              AppMethodBeat.o(57316);
            }
            else if (locala2 == a.bAs)
            {
              if (d(paramCharSequence, paramInt1 + 3) == a.bAr)
              {
                AppMethodBeat.o(57316);
                paramInt2 = 99;
              }
              else
              {
                AppMethodBeat.o(57316);
                paramInt2 = 100;
              }
            }
            else
            {
              paramInt1 += 4;
              while (true)
              {
                locala2 = d(paramCharSequence, paramInt1);
                if (locala2 != a.bAr)
                  break;
                paramInt1 += 2;
              }
              if (locala2 == a.bAq)
              {
                AppMethodBeat.o(57316);
                paramInt2 = 100;
              }
              else
              {
                AppMethodBeat.o(57316);
                paramInt2 = 99;
              }
            }
          }
        }
        else
        {
          locala2 = locala1;
          if (locala1 == a.bAs)
            locala2 = d(paramCharSequence, paramInt1 + 1);
          if (locala2 == a.bAr)
          {
            AppMethodBeat.o(57316);
            paramInt2 = 99;
          }
          else
          {
            AppMethodBeat.o(57316);
            paramInt2 = 100;
          }
        }
      }
    }
  }

  private static a d(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(57315);
    int i = paramCharSequence.length();
    if (paramInt >= i)
    {
      paramCharSequence = a.bAp;
      AppMethodBeat.o(57315);
    }
    while (true)
    {
      return paramCharSequence;
      int j = paramCharSequence.charAt(paramInt);
      if (j == 241)
      {
        paramCharSequence = a.bAs;
        AppMethodBeat.o(57315);
      }
      else if ((j < 48) || (j > 57))
      {
        paramCharSequence = a.bAp;
        AppMethodBeat.o(57315);
      }
      else if (paramInt + 1 >= i)
      {
        paramCharSequence = a.bAq;
        AppMethodBeat.o(57315);
      }
      else
      {
        paramInt = paramCharSequence.charAt(paramInt + 1);
        if ((paramInt < 48) || (paramInt > 57))
        {
          paramCharSequence = a.bAq;
          AppMethodBeat.o(57315);
        }
        else
        {
          paramCharSequence = a.bAr;
          AppMethodBeat.o(57315);
        }
      }
    }
  }

  public final b a(String paramString, a parama, int paramInt1, int paramInt2, Map<c, ?> paramMap)
  {
    AppMethodBeat.i(57313);
    if (parama != a.bxF)
    {
      paramString = new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(parama)));
      AppMethodBeat.o(57313);
      throw paramString;
    }
    paramString = super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    AppMethodBeat.o(57313);
    return paramString;
  }

  public final boolean[] bj(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(57314);
    int j = paramString.length();
    if ((j <= 0) || (j > 80))
    {
      paramString = new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(j)));
      AppMethodBeat.o(57314);
      throw paramString;
    }
    for (int k = 0; k < j; k++)
    {
      char c = paramString.charAt(k);
      if ((c < ' ') || (c > '~'))
        switch (c)
        {
        default:
          paramString = new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(c)));
          AppMethodBeat.o(57314);
          throw paramString;
        case 'ñ':
        case 'ò':
        case 'ó':
        case 'ô':
        }
    }
    Object localObject = new ArrayList();
    int m = 0;
    int n = 0;
    int i1 = 1;
    int i2 = 0;
    int i3;
    if (m < j)
    {
      i3 = c(paramString, m, n);
      if (i3 == n)
        switch (paramString.charAt(m))
        {
        default:
          if (n == 100)
          {
            k = paramString.charAt(m) - ' ';
            label238: i3 = m + 1;
            m = n;
            n = i3;
            label252: ((Collection)localObject).add(c.bAo[k]);
            i2 += k * i1;
            if (n == 0)
              break label572;
          }
          break;
        case 'ñ':
        case 'ò':
        case 'ó':
        case 'ô':
        }
    }
    label572: for (k = i1 + 1; ; k = i1)
    {
      i1 = m;
      m = n;
      n = i1;
      i1 = k;
      break;
      k = 102;
      break label238;
      k = 97;
      break label238;
      k = 96;
      break label238;
      k = 100;
      break label238;
      k = Integer.parseInt(paramString.substring(m, m + 2));
      m++;
      break label238;
      if (n == 0)
      {
        if (i3 == 100)
        {
          k = 104;
          n = m;
          m = i3;
          break label252;
        }
        k = 105;
        n = m;
        m = i3;
        break label252;
      }
      k = i3;
      n = m;
      m = i3;
      break label252;
      ((Collection)localObject).add(c.bAo[(i2 % 103)]);
      ((Collection)localObject).add(c.bAo[106]);
      Iterator localIterator = ((Collection)localObject).iterator();
      i1 = 0;
      if (localIterator.hasNext())
      {
        paramString = (int[])localIterator.next();
        n = paramString.length;
        m = 0;
        k = i1;
        while (true)
        {
          i1 = k;
          if (m >= n)
            break;
          k += paramString[m];
          m++;
        }
      }
      paramString = new boolean[i1];
      localObject = ((Collection)localObject).iterator();
      k = i;
      while (((Iterator)localObject).hasNext())
        k += a(paramString, k, (int[])((Iterator)localObject).next(), true);
      AppMethodBeat.o(57314);
      return paramString;
    }
  }

  static enum a
  {
    static
    {
      AppMethodBeat.i(57154);
      bAp = new a("UNCODABLE", 0);
      bAq = new a("ONE_DIGIT", 1);
      bAr = new a("TWO_DIGITS", 2);
      bAs = new a("FNC_1", 3);
      bAt = new a[] { bAp, bAq, bAr, bAs };
      AppMethodBeat.o(57154);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.b.d.d
 * JD-Core Version:    0.6.2
 */
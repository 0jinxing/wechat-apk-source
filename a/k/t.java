package a.k;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"numberFormatError", "", "input", "", "toByteOrNull", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "kotlin-stdlib"}, dWr=1)
public class t extends s
{
  public static final Integer awy(String paramString)
  {
    AppMethodBeat.i(56284);
    j.p(paramString, "receiver$0");
    paramString = m.eX(paramString, 10);
    AppMethodBeat.o(56284);
    return paramString;
  }

  public static final Long awz(String paramString)
  {
    AppMethodBeat.i(56286);
    j.p(paramString, "receiver$0");
    paramString = m.eY(paramString, 10);
    AppMethodBeat.o(56286);
    return paramString;
  }

  public static final Integer eX(String paramString, int paramInt)
  {
    int i = -2147483647;
    int j = 0;
    int k = 0;
    AppMethodBeat.i(56285);
    j.p(paramString, "receiver$0");
    a.UW(paramInt);
    int m = paramString.length();
    if (m == 0)
    {
      AppMethodBeat.o(56285);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      int n = paramString.charAt(0);
      int i1;
      label90: int i2;
      if (n < 48)
      {
        if (m == 1)
        {
          AppMethodBeat.o(56285);
          paramString = null;
        }
        else if (n == 45)
        {
          i = -2147483648;
          n = 1;
          i1 = 1;
          i2 = i / paramInt;
          m--;
          if (n > m)
            break label228;
        }
      }
      else
      {
        while (true)
        {
          j = Character.digit(paramString.charAt(n), paramInt);
          if (j < 0)
          {
            AppMethodBeat.o(56285);
            paramString = null;
            break;
            if (n == 43)
            {
              n = 1;
              i1 = 0;
              break label90;
            }
            AppMethodBeat.o(56285);
            paramString = null;
            break;
            n = 0;
            i1 = 0;
            break label90;
          }
          if (k < i2)
          {
            AppMethodBeat.o(56285);
            paramString = null;
            break;
          }
          k *= paramInt;
          if (k < i + j)
          {
            AppMethodBeat.o(56285);
            paramString = null;
            break;
          }
          k -= j;
          j = k;
          if (n == m)
            break label228;
          n++;
        }
        label228: if (i1 != 0)
        {
          paramString = Integer.valueOf(j);
          AppMethodBeat.o(56285);
        }
        else
        {
          paramString = Integer.valueOf(-j);
          AppMethodBeat.o(56285);
        }
      }
    }
  }

  public static final Long eY(String paramString, int paramInt)
  {
    AppMethodBeat.i(56287);
    j.p(paramString, "receiver$0");
    a.UW(paramInt);
    int i = paramString.length();
    if (i == 0)
    {
      paramString = null;
      AppMethodBeat.o(56287);
    }
    while (true)
    {
      return paramString;
      int j = paramString.charAt(0);
      int k;
      long l1;
      label77: long l2;
      long l3;
      long l4;
      if (j < 48)
      {
        if (i == 1)
        {
          paramString = null;
          AppMethodBeat.o(56287);
        }
        else
        {
          k = 1;
          if (j == 45)
          {
            j = 1;
            l1 = -9223372036854775808L;
            l2 = l1 / paramInt;
            l3 = 0L;
            i--;
            l4 = l3;
            if (k > i)
              break label237;
          }
        }
      }
      else
      {
        while (true)
        {
          int m = Character.digit(paramString.charAt(k), paramInt);
          if (m < 0)
          {
            paramString = null;
            AppMethodBeat.o(56287);
            break;
            if (j == 43)
            {
              j = 0;
              l1 = -9223372036854775807L;
              break label77;
            }
            paramString = null;
            AppMethodBeat.o(56287);
            break;
            k = 0;
            j = 0;
            l1 = -9223372036854775807L;
            break label77;
          }
          if (l3 < l2)
          {
            paramString = null;
            AppMethodBeat.o(56287);
            break;
          }
          l4 = l3 * paramInt;
          if (l4 < m + l1)
          {
            paramString = null;
            AppMethodBeat.o(56287);
            break;
          }
          l3 = l4 - m;
          l4 = l3;
          if (k == i)
            break label237;
          k++;
        }
        label237: if (j != 0)
        {
          paramString = Long.valueOf(l4);
          AppMethodBeat.o(56287);
        }
        else
        {
          paramString = Long.valueOf(-l4);
          AppMethodBeat.o(56287);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.k.t
 * JD-Core Version:    0.6.2
 */
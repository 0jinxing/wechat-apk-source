package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class av
{
  public static aw xAC = null;

  public static String Ps(String paramString)
  {
    AppMethodBeat.i(52203);
    paramString = hR(paramString, null);
    AppMethodBeat.o(52203);
    return paramString;
  }

  private static String aA(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(52211);
    paramString1 = Pattern.compile(paramString1).matcher(paramString3);
    if (paramString1.find())
    {
      paramString3 = paramString1.replaceAll(paramString2);
      AppMethodBeat.o(52211);
    }
    while (true)
    {
      return paramString3;
      AppMethodBeat.o(52211);
    }
  }

  public static String amM(String paramString)
  {
    AppMethodBeat.i(52204);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(52204);
    while (true)
    {
      return paramString;
      if (!bo.ant(paramString).booleanValue())
      {
        AppMethodBeat.o(52204);
      }
      else
      {
        new av();
        String str1 = "86";
        Object localObject = paramString;
        if (paramString.startsWith("+"))
        {
          String str2 = paramString.replace("+", "");
          paramString = hR(str2, null);
          str1 = paramString;
          localObject = str2;
          if (paramString != null)
          {
            localObject = str2.substring(paramString.length());
            str1 = paramString;
          }
        }
        paramString = formatNumber(str1, (String)localObject);
        AppMethodBeat.o(52204);
      }
    }
  }

  public static String amN(String paramString)
  {
    AppMethodBeat.i(52205);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(52205);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replaceAll("[\\.\\-\\ ]", "").trim();
      AppMethodBeat.o(52205);
    }
  }

  public static String amO(String paramString)
  {
    AppMethodBeat.i(52206);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(52206);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replace("+", "");
      AppMethodBeat.o(52206);
    }
  }

  public static String amP(String paramString)
  {
    AppMethodBeat.i(52207);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(52207);
    }
    while (true)
    {
      return paramString;
      if (paramString.startsWith("+"))
      {
        AppMethodBeat.o(52207);
      }
      else
      {
        paramString = "+".concat(String.valueOf(paramString));
        AppMethodBeat.o(52207);
      }
    }
  }

  private static int ei(String paramString, int paramInt)
  {
    AppMethodBeat.i(52210);
    Pattern localPattern = Pattern.compile(paramString);
    paramString = "1";
    for (int i = 0; (i < paramInt) && (!localPattern.matcher(paramString).find()); i++)
      paramString = paramString + "1";
    AppMethodBeat.o(52210);
    return i + 1;
  }

  public static String formatNumber(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52209);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      AppMethodBeat.o(52209);
      paramString1 = paramString2;
    }
    while (true)
    {
      return paramString1;
      if (xAC == null)
        xAC = new aw();
      aw.a locala;
      String str;
      aw.b localb;
      int k;
      int m;
      label389: label553: 
      do
      {
        StringBuffer localStringBuffer;
        do
        {
          Iterator localIterator1 = xAC.xAD.iterator();
          Iterator localIterator2;
          while (!localIterator2.hasNext())
          {
            do
            {
              if (!localIterator1.hasNext())
                break;
              locala = (aw.a)localIterator1.next();
            }
            while ((locala.xAF == null) || (!paramString1.trim().toLowerCase().equals(locala.xAF.trim().toLowerCase())) || (locala.xAI == null));
            str = amN(paramString2);
            if ((str != null) && (str.length() > locala.xAG))
            {
              AppMethodBeat.o(52209);
              paramString1 = str;
              break;
            }
            localIterator2 = locala.xAI.iterator();
          }
          localb = (aw.b)localIterator2.next();
          if (!bo.isNullOrNil(localb.xAJ))
            break label553;
          if (locala.xAI.size() <= 1)
            break label389;
          localStringBuffer = new StringBuffer();
          localStringBuffer.append(str);
          i = str.length();
        }
        while (i > ei(localb.xAL, locala.xAH));
        while (localStringBuffer.toString().length() < locala.xAH)
          localStringBuffer.append("0");
        paramString1 = aA(localb.xAL, localb.xAK, localStringBuffer.toString());
        j = 0;
        k = 0;
        while (j < paramString1.length())
        {
          m = paramString1.charAt(j);
          paramString2 = paramString1;
          if (k >= i)
            paramString2 = paramString1.substring(0, j);
          n = k;
          if (m != 32)
          {
            n = k;
            if (m != 45)
            {
              n = k;
              if (m != 12290)
                n = k + 1;
            }
          }
          j++;
          k = n;
          paramString1 = paramString2;
        }
        AppMethodBeat.o(52209);
        break;
        paramString1 = new StringBuffer();
        paramString1.append(str);
        i = str.length();
        while (paramString1.toString().length() < locala.xAH)
          paramString1.append("0");
        paramString1 = aA(localb.xAL, localb.xAK, paramString1.toString());
        j = 0;
        k = 0;
        while (j < paramString1.length())
        {
          m = paramString1.charAt(j);
          paramString2 = paramString1;
          if (k >= i)
            paramString2 = paramString1.substring(0, j);
          n = k;
          if (m != 32)
          {
            n = k;
            if (m != 45)
            {
              n = k;
              if (m != 12290)
                n = k + 1;
            }
          }
          j++;
          k = n;
          paramString1 = paramString2;
        }
        AppMethodBeat.o(52209);
        break;
      }
      while (!Pattern.compile(localb.xAJ).matcher(str).lookingAt());
      paramString1 = new StringBuffer();
      paramString1.append(str);
      int i = str.length();
      while (paramString1.toString().length() < locala.xAH)
        paramString1.append(str.charAt(i - 1));
      paramString1 = aA(localb.xAL, localb.xAK, paramString1.toString());
      int j = 0;
      int n = 0;
      while (j < paramString1.length())
      {
        m = paramString1.charAt(j);
        paramString2 = paramString1;
        if (n >= i)
          paramString2 = paramString1.substring(0, j);
        k = n;
        if (m != 32)
        {
          k = n;
          if (m != 45)
          {
            k = n;
            if (m != 12290)
              k = n + 1;
          }
        }
        j++;
        n = k;
        paramString1 = paramString2;
      }
      AppMethodBeat.o(52209);
      continue;
      AppMethodBeat.o(52209);
      paramString1 = paramString2;
    }
  }

  public static String hR(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52202);
    paramString1 = amN(paramString1).replace("+", "");
    if (xAC == null)
      xAC = new aw();
    Object localObject;
    int i;
    if (bo.isNullOrNil(paramString2))
    {
      paramString2 = xAC.xAD.iterator();
      while (paramString2.hasNext())
      {
        localObject = (aw.a)paramString2.next();
        if (paramString1.startsWith(((aw.a)localObject).xAF))
        {
          i = paramString1.length() - ((aw.a)localObject).xAF.length();
          if ((i >= ((aw.a)localObject).xAG) && (i <= ((aw.a)localObject).xAH))
          {
            ab.i("MicroMsg.PhoneFormater", "[extractCountryCode] countrycode:%s country isocode: %s country.minlen:%d country.maxlen:%d", new Object[] { ((aw.a)localObject).xAF, ((aw.a)localObject).xAE, Integer.valueOf(((aw.a)localObject).xAH), Integer.valueOf(((aw.a)localObject).xAH) });
            paramString1 = ((aw.a)localObject).xAF;
            AppMethodBeat.o(52202);
          }
        }
      }
    }
    while (true)
    {
      return paramString1;
      localObject = xAC.xAD.iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
        {
          aw.a locala = (aw.a)((Iterator)localObject).next();
          if (paramString1.startsWith(locala.xAF))
          {
            i = paramString1.length() - locala.xAF.length();
            if ((i >= locala.xAG) && (i <= locala.xAH) && (paramString2.equalsIgnoreCase(locala.xAE)))
            {
              ab.i("MicroMsg.PhoneFormater", "[extractCountryCode] countrycode:%s country isocode: %s country.minlen:%d country.maxlen:%d", new Object[] { locala.xAF, locala.xAE, Integer.valueOf(locala.xAH), Integer.valueOf(locala.xAH) });
              paramString1 = locala.xAF;
              AppMethodBeat.o(52202);
              break;
            }
          }
        }
      paramString1 = null;
      AppMethodBeat.o(52202);
    }
  }

  public static String hS(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52208);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      paramString1 = "";
      AppMethodBeat.o(52208);
    }
    while (true)
    {
      return paramString1;
      paramString1 = paramString1 + "（+" + paramString2 + "）";
      AppMethodBeat.o(52208);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.av
 * JD-Core Version:    0.6.2
 */
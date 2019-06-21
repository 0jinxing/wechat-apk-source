package com.b.a.a;

import android.net.wifi.ScanResult;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

final class v
{
  static String a(List<ScanResult> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(55568);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator;
    if (paramList != null)
      localIterator = paramList.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        paramList = localStringBuilder.toString();
        AppMethodBeat.o(55568);
        return paramList;
      }
      paramList = (ScanResult)localIterator.next();
      if ((paramList.capabilities != null) && (!paramList.capabilities.contains("IBSS")))
        try
        {
          String str = paramList.BSSID;
          Object localObject = new java/math/BigInteger;
          ((BigInteger)localObject).<init>(bs(str), 16);
          localObject = ((BigInteger)localObject).toString();
          str = String.valueOf(paramList.level);
          if (paramBoolean)
          {
            paramList = "&WD[]=";
            localStringBuilder.append(paramList);
            localStringBuilder.append((String)localObject);
            localStringBuilder.append(',');
            localStringBuilder.append(str);
            localStringBuilder.append(',');
            localStringBuilder.append(str);
            localStringBuilder.append(',');
            localStringBuilder.append(str);
            localStringBuilder.append(',');
            localStringBuilder.append(1);
            localStringBuilder.append(',');
            localStringBuilder.append(1);
            localStringBuilder.append(',');
            localStringBuilder.append(0);
            localStringBuilder.append(',');
            localStringBuilder.append("");
          }
        }
        catch (NullPointerException paramList)
        {
          while (true)
          {
            break;
            paramList = "|WD,";
          }
        }
        catch (Error paramList)
        {
        }
        catch (NumberFormatException paramList)
        {
        }
    }
  }

  static String b(String paramString1, long paramLong, String paramString2)
  {
    AppMethodBeat.i(55572);
    if ((paramString1 == null) || (!paramString1.startsWith("|")))
    {
      paramString1 = null;
      AppMethodBeat.o(55572);
    }
    while (true)
    {
      return paramString1;
      paramString1 = "&OD[]=ST," + String.valueOf(paramLong) + ',' + paramString2 + paramString1;
      AppMethodBeat.o(55572);
    }
  }

  private static String bs(String paramString)
  {
    AppMethodBeat.i(55567);
    if (paramString == null)
    {
      paramString = new NullPointerException("trying to manipulate null string");
      AppMethodBeat.o(55567);
      throw paramString;
    }
    Object localObject1 = "";
    int i = 0;
    while (true)
    {
      if (i >= paramString.length())
      {
        AppMethodBeat.o(55567);
        return localObject1;
      }
      Object localObject2 = localObject1;
      if (paramString.charAt(i) != ':')
        localObject2 = localObject1 + paramString.charAt(i);
      i++;
      localObject1 = localObject2;
    }
  }

  static String bt(String paramString)
  {
    AppMethodBeat.i(55570);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(55570);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replace("&SD=", "|SD,");
      AppMethodBeat.o(55570);
    }
  }

  static String bu(String paramString)
  {
    AppMethodBeat.i(55571);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(55571);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replace("&GD=", "|GD,");
      AppMethodBeat.o(55571);
    }
  }

  static boolean e(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(55569);
    boolean bool;
    if ((Math.abs(paramDouble1) <= 90.0D) && (Math.abs(paramDouble2) <= 180.0D))
    {
      bool = true;
      AppMethodBeat.o(55569);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(55569);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.b.a.a.v
 * JD-Core Version:    0.6.2
 */
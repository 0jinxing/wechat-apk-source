package com.tencent.luggage.g;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class h
{
  public static String bO(String paramString)
  {
    AppMethodBeat.i(90909);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(90909);
    while (true)
    {
      return paramString;
      int i = paramString.indexOf('?');
      if (i < 0)
      {
        AppMethodBeat.o(90909);
      }
      else
      {
        paramString = paramString.substring(0, i);
        AppMethodBeat.o(90909);
      }
    }
  }

  public static Map<String, String> bP(String paramString)
  {
    AppMethodBeat.i(90910);
    HashMap localHashMap = new HashMap();
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(90910);
    while (true)
    {
      return localHashMap;
      int i = paramString.indexOf('?');
      if (i < 0)
      {
        AppMethodBeat.o(90910);
      }
      else
      {
        int j = i + 1;
        i = paramString.lastIndexOf('&');
        int k = paramString.lastIndexOf('#');
        if ((k >= 0) && (k > i));
        for (paramString = paramString.substring(j, k); ; paramString = paramString.substring(j, paramString.length()))
        {
          if (!TextUtils.isEmpty(paramString))
            break label112;
          AppMethodBeat.o(90910);
          break;
        }
        label112: k = 0;
        int m = paramString.length();
        int n = paramString.indexOf('&', k);
        label140: String str1;
        if (n != -1)
        {
          i = n;
          int i1 = paramString.indexOf('=', k);
          if (i1 <= i)
          {
            j = i1;
            if (i1 != -1);
          }
          else
          {
            j = i;
          }
          str1 = Uri.decode(paramString.substring(k, j));
          if (j != i)
            break label220;
        }
        label220: for (String str2 = ""; ; str2 = paramString.substring(j + 1, i))
        {
          localHashMap.put(str1, str2);
          if (n == -1)
            break label233;
          k = n + 1;
          break;
          i = m;
          break label140;
        }
        label233: AppMethodBeat.o(90910);
      }
    }
  }

  public static boolean t(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(90911);
    if ((paramString1 == null) || (paramString2 == null) || (paramString1.length() < 0) || (paramString2.length() < 0))
      AppMethodBeat.o(90911);
    while (true)
    {
      return bool;
      if (paramString2.length() > paramString1.length())
      {
        AppMethodBeat.o(90911);
      }
      else if (paramString2.equalsIgnoreCase(paramString1.substring(0, paramString2.length())))
      {
        bool = true;
        AppMethodBeat.o(90911);
      }
      else
      {
        AppMethodBeat.o(90911);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.g.h
 * JD-Core Version:    0.6.2
 */
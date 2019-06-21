package com.google.android.exoplayer2.i;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class u
{
  private static String a(StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95950);
    if (paramInt1 >= paramInt2)
    {
      paramStringBuilder = paramStringBuilder.toString();
      AppMethodBeat.o(95950);
    }
    while (true)
    {
      return paramStringBuilder;
      int i = paramInt1;
      if (paramStringBuilder.charAt(paramInt1) == '/')
        i = paramInt1 + 1;
      paramInt1 = i;
      int j = i;
      int k = paramInt2;
      paramInt2 = j;
      while (paramInt1 <= k)
      {
        if (paramInt1 == k)
          j = paramInt1;
        while (true)
          if ((paramInt1 == paramInt2 + 1) && (paramStringBuilder.charAt(paramInt2) == '.'))
          {
            paramStringBuilder.delete(paramInt2, j);
            k -= j - paramInt2;
            paramInt1 = paramInt2;
            break;
            if (paramStringBuilder.charAt(paramInt1) == '/')
            {
              j = paramInt1 + 1;
            }
            else
            {
              paramInt1++;
              break;
            }
          }
        if ((paramInt1 == paramInt2 + 2) && (paramStringBuilder.charAt(paramInt2) == '.') && (paramStringBuilder.charAt(paramInt2 + 1) == '.'))
        {
          paramInt1 = paramStringBuilder.lastIndexOf("/", paramInt2 - 2) + 1;
          if (paramInt1 > i);
          for (paramInt2 = paramInt1; ; paramInt2 = i)
          {
            paramStringBuilder.delete(paramInt2, j);
            j = k - (j - paramInt2);
            k = paramInt1;
            paramInt2 = paramInt1;
            paramInt1 = k;
            k = j;
            break;
          }
        }
        paramInt2 = paramInt1 + 1;
        paramInt1 = paramInt2;
      }
      paramStringBuilder = paramStringBuilder.toString();
      AppMethodBeat.o(95950);
    }
  }

  private static int[] aN(String paramString)
  {
    AppMethodBeat.i(95951);
    int[] arrayOfInt = new int[4];
    if (TextUtils.isEmpty(paramString))
    {
      arrayOfInt[0] = -1;
      AppMethodBeat.o(95951);
      return arrayOfInt;
    }
    int i = paramString.length();
    int j = paramString.indexOf('#');
    if (j == -1);
    while (true)
    {
      int k = paramString.indexOf('?');
      if (k != -1)
      {
        j = k;
        if (k <= i);
      }
      else
      {
        j = i;
      }
      int m = paramString.indexOf('/');
      if (m != -1)
      {
        k = m;
        if (m <= j);
      }
      else
      {
        k = j;
      }
      int n = paramString.indexOf(':');
      m = n;
      if (n > k)
        m = -1;
      if ((m + 2 < j) && (paramString.charAt(m + 1) == '/') && (paramString.charAt(m + 2) == '/'))
      {
        k = 1;
        label155: if (k == 0)
          break label223;
        n = paramString.indexOf('/', m + 3);
        if (n != -1)
        {
          k = n;
          if (n <= j)
            break label191;
        }
      }
      label191: label223: for (k = j; ; k = m + 1)
      {
        arrayOfInt[0] = m;
        arrayOfInt[1] = k;
        arrayOfInt[2] = j;
        arrayOfInt[3] = i;
        AppMethodBeat.o(95951);
        break;
        k = 0;
        break label155;
      }
      i = j;
    }
  }

  public static Uri m(String paramString1, String paramString2)
  {
    AppMethodBeat.i(95948);
    paramString1 = Uri.parse(n(paramString1, paramString2));
    AppMethodBeat.o(95948);
    return paramString1;
  }

  private static String n(String paramString1, String paramString2)
  {
    AppMethodBeat.i(95949);
    StringBuilder localStringBuilder = new StringBuilder();
    String str = paramString1;
    if (paramString1 == null)
      str = "";
    paramString1 = paramString2;
    if (paramString2 == null)
      paramString1 = "";
    paramString2 = aN(paramString1);
    if (paramString2[0] != -1)
    {
      localStringBuilder.append(paramString1);
      a(localStringBuilder, paramString2[1], paramString2[2]);
      paramString1 = localStringBuilder.toString();
      AppMethodBeat.o(95949);
    }
    int[] arrayOfInt;
    while (true)
    {
      return paramString1;
      arrayOfInt = aN(str);
      if (paramString2[3] == 0)
      {
        paramString1 = paramString1;
        AppMethodBeat.o(95949);
      }
      else if (paramString2[2] == 0)
      {
        paramString1 = paramString1;
        AppMethodBeat.o(95949);
      }
      else if (paramString2[1] != 0)
      {
        i = arrayOfInt[0] + 1;
        localStringBuilder.append(str, 0, i).append(paramString1);
        paramString1 = a(localStringBuilder, paramString2[1] + i, i + paramString2[2]);
        AppMethodBeat.o(95949);
      }
      else
      {
        int j;
        if (paramString1.charAt(paramString2[1]) == '/')
        {
          localStringBuilder.append(str, 0, arrayOfInt[1]).append(paramString1);
          j = arrayOfInt[1];
          i = arrayOfInt[1];
          paramString1 = a(localStringBuilder, j, paramString2[2] + i);
          AppMethodBeat.o(95949);
        }
        else
        {
          if ((arrayOfInt[0] + 2 >= arrayOfInt[1]) || (arrayOfInt[1] != arrayOfInt[2]))
            break;
          localStringBuilder.append(str, 0, arrayOfInt[1]).append('/').append(paramString1);
          j = arrayOfInt[1];
          i = arrayOfInt[1];
          paramString1 = a(localStringBuilder, j, paramString2[2] + i + 1);
          AppMethodBeat.o(95949);
        }
      }
    }
    int i = str.lastIndexOf('/', arrayOfInt[2] - 1);
    if (i == -1);
    for (i = arrayOfInt[1]; ; i++)
    {
      localStringBuilder.append(str, 0, i).append(paramString1);
      paramString1 = a(localStringBuilder, arrayOfInt[1], i + paramString2[2]);
      AppMethodBeat.o(95949);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.u
 * JD-Core Version:    0.6.2
 */
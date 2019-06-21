package com.tencent.map.lib.util;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil
{
  private static SimpleDateFormat a;

  static
  {
    AppMethodBeat.i(98227);
    a = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
    AppMethodBeat.o(98227);
  }

  public static CharSequence buildMulColorText(String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(98216);
    SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder();
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(paramArrayOfString[i]);
      localSpannableStringBuilder2.setSpan(new ForegroundColorSpan(paramArrayOfInt[i]), 0, localSpannableStringBuilder2.length(), 33);
      localSpannableStringBuilder1.append(localSpannableStringBuilder2);
    }
    AppMethodBeat.o(98216);
    return localSpannableStringBuilder1;
  }

  public static String bytesToHexString(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98220);
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      StringBuilder localStringBuilder = new StringBuilder(256);
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
        if (str.length() < 2)
          localStringBuilder.append(0);
        localStringBuilder.append(str);
      }
      paramArrayOfByte = localStringBuilder.toString();
      AppMethodBeat.o(98220);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = null;
      AppMethodBeat.o(98220);
    }
  }

  public static int compareVersion(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(98223);
    paramString1 = paramString1.split("\\.");
    paramString2 = paramString2.split("\\.");
    int j = 0;
    int k;
    if (paramString1.length > paramString2.length)
    {
      k = paramString2.length;
      label34: if (j >= k)
        break label96;
      int m = Integer.valueOf(paramString1[j]).intValue();
      k = Integer.valueOf(paramString2[j]).intValue();
      if (m - k == 0)
        break label90;
      j = m - k;
      AppMethodBeat.o(98223);
    }
    while (true)
    {
      return j;
      k = paramString1.length;
      break label34;
      label90: j++;
      break;
      label96: if (paramString1.length != paramString2.length)
      {
        j = paramString1.length - paramString2.length;
        AppMethodBeat.o(98223);
      }
      else
      {
        AppMethodBeat.o(98223);
        j = i;
      }
    }
  }

  public static String fromUTF8(String paramString)
  {
    AppMethodBeat.i(98218);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(98218);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = URLDecoder.decode(paramString, "utf-8");
        AppMethodBeat.o(98218);
      }
      catch (Exception paramString)
      {
        paramString = "";
        AppMethodBeat.o(98218);
      }
    }
  }

  public static boolean isContains(String paramString1, String paramString2)
  {
    AppMethodBeat.i(98215);
    boolean bool;
    if ((paramString2 == null) || (paramString1 == null))
    {
      bool = false;
      AppMethodBeat.o(98215);
    }
    while (true)
    {
      return bool;
      bool = paramString2.contains(paramString1);
      AppMethodBeat.o(98215);
    }
  }

  public static boolean isEmpty(String paramString)
  {
    AppMethodBeat.i(98213);
    boolean bool;
    if ((paramString == null) || (paramString.trim().length() == 0))
    {
      bool = true;
      AppMethodBeat.o(98213);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(98213);
    }
  }

  public static boolean isEqual(String paramString1, String paramString2)
  {
    AppMethodBeat.i(98225);
    boolean bool;
    if (paramString1 == paramString2)
    {
      bool = true;
      AppMethodBeat.o(98225);
    }
    while (true)
    {
      return bool;
      if (paramString1 != null)
      {
        bool = paramString1.equals(paramString2);
        AppMethodBeat.o(98225);
      }
      else if (paramString2 != null)
      {
        bool = paramString2.equals(paramString1);
        AppMethodBeat.o(98225);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(98225);
      }
    }
  }

  public static boolean isMatched(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(98214);
    if ((paramString2 == null) || (paramString1 == null))
      AppMethodBeat.o(98214);
    while (true)
    {
      return bool;
      if (paramString2.indexOf(paramString1) == 0)
      {
        bool = true;
        AppMethodBeat.o(98214);
      }
      else
      {
        AppMethodBeat.o(98214);
      }
    }
  }

  public static boolean isNumber(String paramString)
  {
    AppMethodBeat.i(98222);
    try
    {
      bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
      AppMethodBeat.o(98222);
      return bool;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(98222);
      }
    }
  }

  public static boolean isWordLikeMyLocation(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(98221);
    if (isEmpty(paramString))
      AppMethodBeat.o(98221);
    while (true)
    {
      return bool;
      if ((paramString.equals("我的位置")) || (paramString.equals("当前位置")) || (paramString.equals("我在哪")) || (paramString.equals("我在哪儿")) || (paramString.equals("我在的位置")) || (paramString.equals("我的位置在哪")) || (paramString.equals("我的位置在哪儿")))
      {
        bool = true;
        AppMethodBeat.o(98221);
      }
      else
      {
        AppMethodBeat.o(98221);
      }
    }
  }

  public static String removeSuffix(String paramString)
  {
    AppMethodBeat.i(98226);
    if (isEmpty(paramString))
      AppMethodBeat.o(98226);
    while (true)
    {
      return paramString;
      int i = paramString.lastIndexOf(".");
      if (i > 0)
      {
        paramString = paramString.substring(0, i);
        AppMethodBeat.o(98226);
      }
      else
      {
        AppMethodBeat.o(98226);
      }
    }
  }

  public static String toDateFormat(long paramLong)
  {
    AppMethodBeat.i(98224);
    String str = a.format(Long.valueOf(paramLong));
    AppMethodBeat.o(98224);
    return str;
  }

  public static String toGBK(String paramString)
  {
    AppMethodBeat.i(98219);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(98219);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = URLEncoder.encode(paramString, "gbk");
        AppMethodBeat.o(98219);
      }
      catch (UnsupportedEncodingException paramString)
      {
        paramString = "";
        AppMethodBeat.o(98219);
      }
    }
  }

  public static String toUTF8(String paramString)
  {
    AppMethodBeat.i(98217);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(98217);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = URLEncoder.encode(paramString, "utf-8");
        AppMethodBeat.o(98217);
      }
      catch (Exception paramString)
      {
        paramString = "";
        AppMethodBeat.o(98217);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.util.StringUtil
 * JD-Core Version:    0.6.2
 */
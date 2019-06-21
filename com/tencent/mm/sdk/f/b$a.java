package com.tencent.mm.sdk.f;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b$a
{
  private static final Pattern xDx;
  public final String charset;
  public final String mimeType;

  static
  {
    AppMethodBeat.i(65361);
    xDx = Pattern.compile("([a-zA-Z*-.0-9]+/[a-zA-Z*-.0-9]+)");
    AppMethodBeat.o(65361);
  }

  private b$a(String paramString1, String paramString2)
  {
    this.mimeType = paramString1;
    this.charset = paramString2;
  }

  public static a anJ(String paramString)
  {
    String str1 = null;
    String str2 = null;
    AppMethodBeat.i(65360);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(65360);
      paramString = str2;
    }
    while (true)
    {
      return paramString;
      Matcher localMatcher = xDx.matcher(paramString);
      if (!localMatcher.find())
      {
        AppMethodBeat.o(65360);
        paramString = str2;
      }
      else
      {
        str2 = localMatcher.group(0);
        if (paramString.contains("charset="))
          str1 = paramString.substring(paramString.indexOf("charset=") + 8).trim();
        paramString = str1;
        if (TextUtils.isEmpty(str1))
          paramString = "UTF-8";
        paramString = new a(str2, paramString);
        AppMethodBeat.o(65360);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(65359);
    String str = "ContentType{mimeType='" + this.mimeType + '\'' + ", charset='" + this.charset + '\'' + '}';
    AppMethodBeat.o(65359);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.f.b.a
 * JD-Core Version:    0.6.2
 */
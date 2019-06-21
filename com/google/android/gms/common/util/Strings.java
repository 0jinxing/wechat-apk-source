package com.google.android.gms.common.util;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@VisibleForTesting
public class Strings
{
  private static final Pattern zzaak;

  static
  {
    AppMethodBeat.i(90274);
    zzaak = Pattern.compile("\\$\\{(.*?)\\}");
    AppMethodBeat.o(90274);
  }

  public static String capitalize(String paramString)
  {
    AppMethodBeat.i(90271);
    if (paramString.length() == 0)
      AppMethodBeat.o(90271);
    while (true)
    {
      return paramString;
      char c1 = paramString.charAt(0);
      char c2 = Character.toUpperCase(c1);
      if (c1 == c2)
      {
        AppMethodBeat.o(90271);
      }
      else
      {
        paramString = paramString.substring(1);
        paramString = String.valueOf(paramString).length() + 1 + c2 + paramString;
        AppMethodBeat.o(90271);
      }
    }
  }

  public static String emptyToNull(String paramString)
  {
    AppMethodBeat.i(90270);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = null;
      AppMethodBeat.o(90270);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(90270);
    }
  }

  public static String format(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(90269);
    Matcher localMatcher = zzaak.matcher(paramString);
    StringBuffer localStringBuffer;
    String str;
    if (localMatcher.find())
    {
      localStringBuffer = new StringBuffer();
      str = localMatcher.group(1);
      paramString = paramBundle.get(str);
      if (paramString != null)
      {
        localMatcher.appendReplacement(localStringBuffer, paramString.toString());
        label56: if (localMatcher.find())
          break label110;
        localMatcher.appendTail(localStringBuffer);
        paramString = localStringBuffer.toString();
        AppMethodBeat.o(90269);
      }
    }
    while (true)
    {
      return paramString;
      if (paramBundle.containsKey(str))
      {
        localMatcher.appendReplacement(localStringBuffer, "null");
        break label56;
      }
      localMatcher.appendReplacement(localStringBuffer, "");
      break label56;
      label110: break;
      AppMethodBeat.o(90269);
    }
  }

  public static boolean isEmptyOrWhitespace(String paramString)
  {
    AppMethodBeat.i(90272);
    boolean bool;
    if ((paramString == null) || (paramString.trim().isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(90272);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90272);
    }
  }

  public static String nullToEmpty(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  public static String padEnd(String paramString, int paramInt, char paramChar)
  {
    AppMethodBeat.i(90273);
    Preconditions.checkNotNull(paramString);
    if (paramString.length() >= paramInt)
      AppMethodBeat.o(90273);
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder = new StringBuilder(paramInt);
      localStringBuilder.append(paramString);
      for (int i = paramString.length(); i < paramInt; i++)
        localStringBuilder.append(paramChar);
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(90273);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.Strings
 * JD-Core Version:    0.6.2
 */
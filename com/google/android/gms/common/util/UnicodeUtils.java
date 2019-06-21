package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@VisibleForTesting
public class UnicodeUtils
{
  private static final Pattern zzaal;

  static
  {
    AppMethodBeat.i(90279);
    zzaal = Pattern.compile("\\\\u[0-9a-fA-F]{4}");
    AppMethodBeat.o(90279);
  }

  public static String unescape(String paramString)
  {
    AppMethodBeat.i(90278);
    Matcher localMatcher;
    Object localObject1;
    if (!TextUtils.isEmpty(paramString))
    {
      localMatcher = zzaal.matcher(paramString);
      Object localObject2;
      for (localObject1 = null; localMatcher.find(); localObject1 = localObject2)
      {
        localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = new StringBuffer();
        localMatcher.appendReplacement((StringBuffer)localObject2, new String(Character.toChars(Integer.parseInt(localMatcher.group().substring(2), 16))));
      }
      if (localObject1 == null)
        AppMethodBeat.o(90278);
    }
    while (true)
    {
      return paramString;
      localMatcher.appendTail(localObject1);
      paramString = localObject1.toString();
      AppMethodBeat.o(90278);
      continue;
      AppMethodBeat.o(90278);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.UnicodeUtils
 * JD-Core Version:    0.6.2
 */
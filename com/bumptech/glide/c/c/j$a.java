package com.bumptech.glide.c.c;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j$a
{
  private static final String aEh;
  private static final Map<String, List<i>> aEi;
  boolean aEj = true;
  private boolean aEk = true;
  Map<String, List<i>> headers = aEi;

  static
  {
    AppMethodBeat.i(92076);
    Object localObject = System.getProperty("http.agent");
    if (TextUtils.isEmpty((CharSequence)localObject));
    while (true)
    {
      aEh = (String)localObject;
      localObject = new HashMap(2);
      if (!TextUtils.isEmpty(aEh))
        ((Map)localObject).put("User-Agent", Collections.singletonList(new j.b(aEh)));
      aEi = Collections.unmodifiableMap((Map)localObject);
      AppMethodBeat.o(92076);
      return;
      int i = ((String)localObject).length();
      StringBuilder localStringBuilder = new StringBuilder(((String)localObject).length());
      int j = 0;
      if (j < i)
      {
        char c = ((String)localObject).charAt(j);
        if (((c > '\037') || (c == '\t')) && (c < ''))
          localStringBuilder.append(c);
        while (true)
        {
          j++;
          break;
          localStringBuilder.append('?');
        }
      }
      localObject = localStringBuilder.toString();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.j.a
 * JD-Core Version:    0.6.2
 */
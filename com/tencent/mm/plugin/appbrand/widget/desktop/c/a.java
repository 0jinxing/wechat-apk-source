package com.tencent.mm.plugin.appbrand.widget.desktop.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.f;

public final class a
{
  public static String Ey(String paramString)
  {
    AppMethodBeat.i(134251);
    if (paramString != null);
    while (true)
    {
      try
      {
        int i = f.asg(paramString);
        if (i <= 12)
        {
          AppMethodBeat.o(134251);
          return paramString;
        }
        Object localObject = paramString.toCharArray();
        int j = localObject.length;
        int k = 0;
        i = 0;
        int m = 0;
        if (k < j)
        {
          m += f.asg(String.valueOf(localObject[k]));
          if (m >= 12)
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            localObject = paramString.substring(0, i) + '…';
            paramString = (String)localObject;
            AppMethodBeat.o(134251);
            continue;
          }
          k++;
          i++;
          continue;
        }
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(134251);
        continue;
      }
      AppMethodBeat.o(134251);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.c.a
 * JD-Core Version:    0.6.2
 */
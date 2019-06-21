package com.tencent.mm.cj;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.xweb.e;

final class a$4
  implements e
{
  public final SharedPreferences x(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(80381);
    if (paramBoolean)
    {
      paramString = as.amG(paramString);
      if (paramString != null)
        break label48;
      paramString = null;
      AppMethodBeat.o(80381);
    }
    while (true)
    {
      return paramString;
      if (paramInt == 4);
      for (paramInt = 2; ; paramInt = 1)
      {
        paramString = as.eg(paramString, paramInt);
        break;
      }
      label48: paramString = new b(paramString);
      AppMethodBeat.o(80381);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cj.a.4
 * JD-Core Version:    0.6.2
 */
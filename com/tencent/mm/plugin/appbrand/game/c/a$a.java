package com.tencent.mm.plugin.appbrand.game.c;

import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.b;
import com.tencent.mm.cb.c;
import com.tencent.mm.plugin.appbrand.r.j;

public final class a$a
  implements com.tencent.magicbrush.a.a.a
{
  private static int a(String paramString, int paramInt, j<c> paramj)
  {
    int i = 0;
    AppMethodBeat.i(130127);
    if ((paramString == null) || (paramInt < 0) || (paramInt >= paramString.length()))
    {
      AppMethodBeat.o(130127);
      paramInt = i;
    }
    int j;
    while (true)
    {
      return paramInt;
      j = paramString.codePointAt(paramInt);
      c localc = b.dqD().Mi(j);
      if (localc == null)
        break;
      if (paramj != null)
        paramj.value = localc;
      paramInt = Character.charCount(j);
      AppMethodBeat.o(130127);
    }
    int k = paramInt + Character.charCount(j);
    if (k < paramString.length());
    for (int m = paramString.codePointAt(k); ; m = 0)
    {
      paramString = b.dqD().gY(j, m);
      if (paramString != null)
        break label135;
      AppMethodBeat.o(130127);
      paramInt = i;
      break;
    }
    label135: if (paramString.jil != 0);
    for (m = Character.charCount(m) + k; ; m = k)
    {
      if (paramj != null)
        paramj.value = paramString;
      paramInt = m - paramInt;
      AppMethodBeat.o(130127);
      break;
    }
  }

  public final int n(String paramString, int paramInt)
  {
    AppMethodBeat.i(130125);
    paramInt = a(paramString, paramInt, null);
    AppMethodBeat.o(130125);
    return paramInt;
  }

  public final Drawable o(String paramString, int paramInt)
  {
    AppMethodBeat.i(130126);
    j localj = new j();
    a(paramString, paramInt, localj);
    paramString = b.dqD().a((c)localj.value, true);
    AppMethodBeat.o(130126);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.c.a.a
 * JD-Core Version:    0.6.2
 */
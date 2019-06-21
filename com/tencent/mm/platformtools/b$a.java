package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$a
{
  public static int b(Context paramContext, float paramFloat)
  {
    AppMethodBeat.i(16658);
    new f();
    int i = Math.round(paramContext.getResources().getDisplayMetrics().densityDpi * paramFloat / 160.0F);
    AppMethodBeat.o(16658);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.b.a
 * JD-Core Version:    0.6.2
 */
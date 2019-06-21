package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class c
{
  private static boolean ony = false;

  public static int bNr()
  {
    AppMethodBeat.i(43248);
    int i;
    if (ony)
    {
      i = ah.getContext().getResources().getColor(2131690259);
      AppMethodBeat.o(43248);
    }
    while (true)
    {
      return i;
      i = ah.getContext().getResources().getColor(2131689495);
      AppMethodBeat.o(43248);
    }
  }

  public static void iR(boolean paramBoolean)
  {
    ony = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.c
 * JD-Core Version:    0.6.2
 */
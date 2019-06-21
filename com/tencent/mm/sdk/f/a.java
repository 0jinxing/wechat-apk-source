package com.tencent.mm.sdk.f;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Locale;

public final class a
{
  public static String RL(String paramString)
  {
    AppMethodBeat.i(65357);
    paramString = com.tencent.mm.compatible.util.e.euR + String.format(Locale.US, "%s%d.%s", new Object[] { "mmexport", Long.valueOf(System.currentTimeMillis()), paramString });
    AppMethodBeat.o(65357);
    return paramString;
  }

  public static void a(String paramString, Context paramContext)
  {
    AppMethodBeat.i(65356);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(65356);
    while (true)
    {
      return;
      paramContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", com.tencent.mm.vfs.e.asY(paramString)));
      ab.i("Luggage.AndroidMediaUtil", "refreshing media scanner on path=%s", new Object[] { paramString });
      AppMethodBeat.o(65356);
    }
  }

  public static String dlz()
  {
    AppMethodBeat.i(65358);
    String str = com.tencent.mm.compatible.util.e.euR;
    str = str.substring(str.indexOf("tencent/MicroMsg"));
    AppMethodBeat.o(65358);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.f.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.balance.a.a;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class ab
{
  private static String tgu = "";

  public static void ach(String paramString)
  {
    AppMethodBeat.i(45328);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LqtTraceInfoStore", "trace info: %s", new Object[] { paramString });
    tgu = paramString;
    AppMethodBeat.o(45328);
  }

  public static String aci(String paramString)
  {
    AppMethodBeat.i(45330);
    paramString = Uri.parse(paramString).getQueryParameter("operate_id");
    AppMethodBeat.o(45330);
    return paramString;
  }

  public static String cMM()
  {
    return tgu;
  }

  public static void parseUrl(String paramString)
  {
    AppMethodBeat.i(45329);
    paramString = Uri.parse(paramString).getQueryParameter("trace_info");
    if (!bo.isNullOrNil(paramString))
      ach(paramString);
    AppMethodBeat.o(45329);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.ab
 * JD-Core Version:    0.6.2
 */
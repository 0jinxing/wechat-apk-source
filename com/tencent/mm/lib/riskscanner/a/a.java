package com.tencent.mm.lib.riskscanner.a;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.lib.riskscanner.RiskScannerReqBufferProvider;

public final class a
{
  public static Bundle bN(Context paramContext)
  {
    Object localObject = null;
    AppMethodBeat.i(114463);
    paramContext = paramContext.getContentResolver();
    try
    {
      paramContext = paramContext.call(RiskScannerReqBufferProvider.CONTENT_URI, "prepareReqBuffer", null, null);
      AppMethodBeat.o(114463);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(114463);
        paramContext = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.lib.riskscanner.a.a
 * JD-Core Version:    0.6.2
 */
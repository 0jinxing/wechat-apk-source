package com.tencent.mm.plugin.facedetect.c;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public enum b
{
  static
  {
    AppMethodBeat.i(120);
    lTj = new b("IML");
    lTk = new b[] { lTj };
    AppMethodBeat.o(120);
  }

  public static a a(Context paramContext, f paramf, int paramInt1, int paramInt2, Bundle paramBundle)
  {
    AppMethodBeat.i(119);
    ab.i("MicroMsg.FaceDetectControllerFactory", "alvinluo getController serverScene: %d", new Object[] { Integer.valueOf(paramInt1) });
    switch (paramInt1)
    {
    default:
      paramContext = null;
      AppMethodBeat.o(119);
    case 0:
    case 1:
    case 3:
    case 4:
    case 2:
    case 5:
    case 6:
    }
    while (true)
    {
      return paramContext;
      paramContext = new c(paramContext, paramf, paramInt1, paramInt2);
      AppMethodBeat.o(119);
      continue;
      paramContext = new d(paramContext, paramf, paramInt1, paramInt2, paramBundle);
      AppMethodBeat.o(119);
      continue;
      paramContext = new e(paramContext, paramf, paramInt1, paramInt2);
      AppMethodBeat.o(119);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.c.b
 * JD-Core Version:    0.6.2
 */
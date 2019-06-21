package com.tencent.mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bj;

public class ac<S extends q> extends a<S>
{
  public static final int CTRL_INDEX = 250;
  public static final String NAME = "captureScreen";

  public Bitmap b(final S paramS)
  {
    AppMethodBeat.i(114321);
    paramS = paramS.getCurrentPageView();
    if (paramS == null)
    {
      paramS = null;
      AppMethodBeat.o(114321);
    }
    while (true)
    {
      return paramS;
      paramS = (Bitmap)new bj()
      {
      }
      .b(new ak(Looper.getMainLooper()));
      AppMethodBeat.o(114321);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ac
 * JD-Core Version:    0.6.2
 */
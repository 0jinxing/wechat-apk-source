package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.util.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class q
{
  public static e fT(Context paramContext)
  {
    AppMethodBeat.i(70463);
    if (bo.bc(com.tencent.mm.compatible.e.q.etn.esB, "").equals("surface"))
    {
      ab.i("MicroMsg.VideoViewFactory", "match full type surface");
      paramContext = new VideoSurfaceView(paramContext);
      AppMethodBeat.o(70463);
    }
    while (true)
    {
      return paramContext;
      if (m.Mx())
      {
        ab.i("MicroMsg.VideoViewFactory", "IS MTK platform");
        paramContext = new VideoSightView(paramContext);
        AppMethodBeat.o(70463);
      }
      else
      {
        ab.i("MicroMsg.VideoViewFactory", "default settings, use sightview");
        paramContext = new VideoSightView(paramContext);
        AppMethodBeat.o(70463);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.q
 * JD-Core Version:    0.6.2
 */
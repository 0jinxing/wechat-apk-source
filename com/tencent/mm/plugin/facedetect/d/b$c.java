package com.tencent.mm.plugin.facedetect.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.h.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class b$c
{
  private static String TAG = "MicroMsg.IFaceMotion.Factory";

  public static b a(h.a parama)
  {
    AppMethodBeat.i(296);
    if (parama == null)
    {
      parama = null;
      AppMethodBeat.o(296);
    }
    while (true)
    {
      return parama;
      if (parama.type == 4)
      {
        ab.i(TAG, "hy: is read number");
        parama = new d(parama.lTX);
        AppMethodBeat.o(296);
      }
      else
      {
        ab.i(TAG, "hy: is normal");
        parama = new c(parama.gJH, parama.lTU);
        AppMethodBeat.o(296);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.b.c
 * JD-Core Version:    0.6.2
 */
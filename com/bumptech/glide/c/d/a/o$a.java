package com.bumptech.glide.c.d.a;

import android.graphics.Bitmap;
import com.bumptech.glide.c.b.a.e;
import com.bumptech.glide.h.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

final class o$a
  implements h.a
{
  private final d aFD;
  private final m azw;

  o$a(m paramm, d paramd)
  {
    this.azw = paramm;
    this.aFD = paramd;
  }

  public final void a(e parame, Bitmap paramBitmap)
  {
    AppMethodBeat.i(92262);
    IOException localIOException = this.aFD.aIa;
    if (localIOException != null)
    {
      if (paramBitmap != null)
        parame.g(paramBitmap);
      AppMethodBeat.o(92262);
      throw localIOException;
    }
    AppMethodBeat.o(92262);
  }

  public final void ns()
  {
    AppMethodBeat.i(92261);
    this.azw.nw();
    AppMethodBeat.o(92261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.o.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.e.a;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static b zxo = null;

  public static void a(b paramb)
  {
    zxo = paramb;
  }

  public static void b(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(107321);
    if (zxo != null)
      zxo.b(paramImageView, paramString);
    AppMethodBeat.o(107321);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.a.a
 * JD-Core Version:    0.6.2
 */
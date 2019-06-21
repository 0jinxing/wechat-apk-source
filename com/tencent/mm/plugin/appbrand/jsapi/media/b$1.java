package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

final class b$1
  implements b
{
  public final Bitmap b(InputStream paramInputStream, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(114352);
    paramInputStream = BitmapFactory.decodeStream(paramInputStream, null, paramOptions);
    AppMethodBeat.o(114352);
    return paramInputStream;
  }

  public final Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(114351);
    paramString = BitmapFactory.decodeFile(paramString, paramOptions);
    AppMethodBeat.o(114351);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.b.1
 * JD-Core Version:    0.6.2
 */
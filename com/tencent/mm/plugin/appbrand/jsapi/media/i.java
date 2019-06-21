package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import java.io.InputStream;

public final class i
  implements b
{
  public static final i hQA;

  static
  {
    AppMethodBeat.i(131322);
    hQA = new i();
    AppMethodBeat.o(131322);
  }

  public final Bitmap b(InputStream paramInputStream, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(131321);
    paramInputStream = MMBitmapFactory.decodeStream(paramInputStream, null, paramOptions);
    AppMethodBeat.o(131321);
    return paramInputStream;
  }

  public final Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(131320);
    paramString = MMBitmapFactory.decodeFile(paramString, paramOptions);
    AppMethodBeat.o(131320);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.i
 * JD-Core Version:    0.6.2
 */
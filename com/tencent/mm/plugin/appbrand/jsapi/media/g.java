package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class g extends a
{
  public static final int CTRL_INDEX = 217;
  public static final String NAME = "saveImageToPhotosAlbum";

  final boolean Bk(String paramString)
  {
    AppMethodBeat.i(114367);
    boolean bool = bo.nullAsNil(paramString).toLowerCase().contains("image");
    AppMethodBeat.o(114367);
    return bool;
  }

  final String Bl(String paramString)
  {
    AppMethodBeat.i(114368);
    paramString = com.tencent.mm.sdk.f.a.RL(paramString);
    AppMethodBeat.o(114368);
    return paramString;
  }

  final void Bm(String paramString)
  {
    AppMethodBeat.i(114369);
    al.d(new g.1(this));
    AppMethodBeat.o(114369);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.g
 * JD-Core Version:    0.6.2
 */
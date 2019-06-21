package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class h extends a
{
  public static final int CTRL_INDEX = 216;
  public static final String NAME = "saveVideoToPhotosAlbum";

  final boolean Bk(String paramString)
  {
    AppMethodBeat.i(114371);
    boolean bool = bo.nullAsNil(paramString).toLowerCase().contains("video");
    AppMethodBeat.o(114371);
    return bool;
  }

  final String Bl(String paramString)
  {
    AppMethodBeat.i(114372);
    paramString = com.tencent.mm.sdk.f.a.RL("mp4");
    AppMethodBeat.o(114372);
    return paramString;
  }

  final void Bm(String paramString)
  {
    AppMethodBeat.i(114373);
    al.d(new h.1(this, paramString));
    AppMethodBeat.o(114373);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.h
 * JD-Core Version:    0.6.2
 */
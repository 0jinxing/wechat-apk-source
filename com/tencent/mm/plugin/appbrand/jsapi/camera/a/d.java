package com.tencent.mm.plugin.appbrand.jsapi.camera.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends c
  implements b.a
{
  private a hHy;

  public d()
  {
    AppMethodBeat.i(130980);
    this.hHy = new a(this, "barcode|qrcode");
    AppMethodBeat.o(130980);
  }

  protected final b aDs()
  {
    return this.hHy;
  }

  public final void c(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(130981);
    this.hHx.b(paramInt, paramString, paramArrayOfByte);
    AppMethodBeat.o(130981);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.a.d
 * JD-Core Version:    0.6.2
 */
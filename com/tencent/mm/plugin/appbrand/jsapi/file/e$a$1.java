package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

final class e$a$1
  implements e
{
  private final Charset wu;

  e$a$1()
  {
    AppMethodBeat.i(102759);
    this.wu = Charset.forName("US-ASCII");
    AppMethodBeat.o(102759);
  }

  public final ByteBuffer AY(String paramString)
  {
    AppMethodBeat.i(102761);
    paramString = ByteBuffer.wrap(paramString.getBytes(this.wu));
    AppMethodBeat.o(102761);
    return paramString;
  }

  public final String o(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(102760);
    paramByteBuffer = new String(d.q(paramByteBuffer), this.wu);
    AppMethodBeat.o(102760);
    return paramByteBuffer;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.e.a.1
 * JD-Core Version:    0.6.2
 */
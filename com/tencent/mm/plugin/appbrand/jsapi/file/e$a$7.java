package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

final class e$a$7
  implements e
{
  private final Charset hJK;

  e$a$7()
  {
    AppMethodBeat.i(102772);
    this.hJK = Charset.forName("ISO-8859-1");
    AppMethodBeat.o(102772);
  }

  public final ByteBuffer AY(String paramString)
  {
    AppMethodBeat.i(102774);
    paramString = ByteBuffer.wrap(paramString.getBytes(this.hJK));
    AppMethodBeat.o(102774);
    return paramString;
  }

  public final String o(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(102773);
    paramByteBuffer = new String(d.q(paramByteBuffer), this.hJK);
    AppMethodBeat.o(102773);
    return paramByteBuffer;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.e.a.7
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

final class e$a$4
  implements e
{
  e$a$4(Charset paramCharset)
  {
  }

  public final ByteBuffer AY(String paramString)
  {
    AppMethodBeat.i(102767);
    paramString = ByteBuffer.wrap(paramString.getBytes(this.hJI)).order(ByteOrder.LITTLE_ENDIAN);
    AppMethodBeat.o(102767);
    return paramString;
  }

  public final String o(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(102766);
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramByteBuffer = new String(d.q(paramByteBuffer), this.hJI);
    AppMethodBeat.o(102766);
    return paramByteBuffer;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.e.a.4
 * JD-Core Version:    0.6.2
 */
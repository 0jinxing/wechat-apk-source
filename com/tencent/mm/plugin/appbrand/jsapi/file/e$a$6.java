package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.d;
import java.nio.ByteBuffer;

final class e$a$6
  implements e
{
  public final ByteBuffer AY(String paramString)
  {
    AppMethodBeat.i(102771);
    paramString = ByteBuffer.wrap(paramString.getBytes(UTF_8));
    AppMethodBeat.o(102771);
    return paramString;
  }

  public final String o(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(102770);
    paramByteBuffer = new String(d.q(paramByteBuffer), UTF_8);
    AppMethodBeat.o(102770);
    return paramByteBuffer;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.e.a.6
 * JD-Core Version:    0.6.2
 */
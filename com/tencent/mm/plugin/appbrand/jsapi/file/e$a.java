package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.d;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public final class e$a
{
  static final Map<String, e> hJH;

  static
  {
    AppMethodBeat.i(102775);
    Object localObject = new HashMap();
    hJH = (Map)localObject;
    ((Map)localObject).put("ascii", new e.a.1());
    hJH.put("base64", new e.a.2());
    hJH.put("hex", new e()
    {
      public final ByteBuffer AY(String paramAnonymousString)
      {
        AppMethodBeat.i(102765);
        paramAnonymousString = ByteBuffer.wrap(new BigInteger(paramAnonymousString, 16).toByteArray());
        AppMethodBeat.o(102765);
        return paramAnonymousString;
      }

      public final String o(ByteBuffer paramAnonymousByteBuffer)
      {
        AppMethodBeat.i(102764);
        paramAnonymousByteBuffer = new BigInteger(1, d.q(paramAnonymousByteBuffer)).toString(16);
        AppMethodBeat.o(102764);
        return paramAnonymousByteBuffer;
      }
    });
    localObject = new e.a.4(Charset.forName("ISO-10646-UCS-2"));
    hJH.put("ucs2", localObject);
    hJH.put("ucs-2", localObject);
    localObject = new e()
    {
      public final ByteBuffer AY(String paramAnonymousString)
      {
        AppMethodBeat.i(102769);
        paramAnonymousString = ByteBuffer.wrap(paramAnonymousString.getBytes(this.hJJ)).order(ByteOrder.LITTLE_ENDIAN);
        AppMethodBeat.o(102769);
        return paramAnonymousString;
      }

      public final String o(ByteBuffer paramAnonymousByteBuffer)
      {
        AppMethodBeat.i(102768);
        paramAnonymousByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        paramAnonymousByteBuffer = new String(d.q(paramAnonymousByteBuffer), this.hJJ);
        AppMethodBeat.o(102768);
        return paramAnonymousByteBuffer;
      }
    };
    hJH.put("utf16le", localObject);
    hJH.put("utf-16le", localObject);
    localObject = new e.a.6();
    hJH.put("utf8", localObject);
    hJH.put("utf-8", localObject);
    localObject = new e.a.7();
    hJH.put("latin1", localObject);
    hJH.put("binary", localObject);
    AppMethodBeat.o(102775);
  }

  static void init()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.e.a
 * JD-Core Version:    0.6.2
 */
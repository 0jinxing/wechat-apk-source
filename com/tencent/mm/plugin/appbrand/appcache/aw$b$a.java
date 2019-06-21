package com.tencent.mm.plugin.appbrand.appcache;

import android.webkit.WebResourceResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public final class aw$b$a
{
  static final Map<Class, aw.b> gVh;

  static
  {
    AppMethodBeat.i(86813);
    HashMap localHashMap = new HashMap();
    gVh = localHashMap;
    localHashMap.put(InputStream.class, new aw.c((byte)0));
    gVh.put(WebResourceResponse.class, new aw.e((byte)0));
    gVh.put(String.class, new aw.d((byte)0));
    gVh.put([B.class, new aw.a((byte)0));
    AppMethodBeat.o(86813);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.aw.b.a
 * JD-Core Version:    0.6.2
 */
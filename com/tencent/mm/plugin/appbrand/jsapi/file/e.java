package com.tencent.mm.plugin.appbrand.jsapi.file;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

abstract interface e
{
  public static final Charset UTF_8 = Charset.forName("UTF-8");

  public abstract ByteBuffer AY(String paramString);

  public abstract String o(ByteBuffer paramByteBuffer);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.e
 * JD-Core Version:    0.6.2
 */
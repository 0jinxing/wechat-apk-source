package com.tencent.liteav.network.a.a;

import com.tencent.liteav.network.a.b;
import com.tencent.liteav.network.a.d;
import com.tencent.liteav.network.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.net.InetAddress;

final class a$1
  implements com.tencent.liteav.network.a.c
{
  public final e[] a(b paramb, d paramd)
  {
    AppMethodBeat.i(67638);
    InetAddress[] arrayOfInetAddress1 = a.b();
    InetAddress[] arrayOfInetAddress2 = arrayOfInetAddress1;
    if (arrayOfInetAddress1 == null)
      arrayOfInetAddress2 = a.a();
    if (arrayOfInetAddress2 == null)
    {
      paramb = new IOException("cant get local dns server");
      AppMethodBeat.o(67638);
      throw paramb;
    }
    paramb = new c(arrayOfInetAddress2[0]).a(paramb, paramd);
    AppMethodBeat.o(67638);
    return paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.a.a.a.1
 * JD-Core Version:    0.6.2
 */
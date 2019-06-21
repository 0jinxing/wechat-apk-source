package com.tencent.mm.plugin.appbrand.jsapi.websocket;

import com.tencent.luggage.a.e;
import com.tencent.mars.cdn.AndroidCertVerifyResult;
import com.tencent.mars.cdn.X509Util;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.t.e.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

final class b$1
  implements WcWss.a
{
  b$1(b paramb)
  {
  }

  public final int doCertificateVerify(String paramString, byte[][] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(108103);
    ab.i("MicroMsg.AppBrandWcWssSocket", "certifivate verify for ".concat(String.valueOf(paramString)));
    try
    {
      AndroidCertVerifyResult localAndroidCertVerifyResult1 = X509Util.verifyServerCertificates(paramArrayOfByte, "RSA", paramString, 1, b.b(this.ica));
      ab.i("MicroMsg.AppBrandWcWssSocket", "host %s rsa verify result %d, isknownroots %b, ishostmatched %b", new Object[] { paramString, Integer.valueOf(localAndroidCertVerifyResult1.getStatus()), Boolean.valueOf(localAndroidCertVerifyResult1.isIssuedByKnownRoot()), Boolean.valueOf(localAndroidCertVerifyResult1.isIssuedByHostMatched()) });
      AndroidCertVerifyResult localAndroidCertVerifyResult2 = localAndroidCertVerifyResult1;
      if (localAndroidCertVerifyResult1.getStatus() != 0)
      {
        localAndroidCertVerifyResult2 = X509Util.verifyServerCertificates(paramArrayOfByte, "ECDSA", paramString, 1, b.b(this.ica));
        ab.i("MicroMsg.AppBrandWcWssSocket", "host %s ecdsa verify result %d, isknownroots %b, ishostmatched %b", new Object[] { paramString, Integer.valueOf(localAndroidCertVerifyResult2.getStatus()), Boolean.valueOf(localAndroidCertVerifyResult2.isIssuedByKnownRoot()), Boolean.valueOf(localAndroidCertVerifyResult2.isIssuedByHostMatched()) });
      }
      if (localAndroidCertVerifyResult2.getStatus() != 0)
        ((com.tencent.mm.plugin.appbrand.n.a)e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 7L, 1L);
      if ((localAndroidCertVerifyResult2.getStatus() == 0) && (!localAndroidCertVerifyResult2.isIssuedByHostMatched()))
        ((com.tencent.mm.plugin.appbrand.n.a)e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 8L, 1L);
      if ((localAndroidCertVerifyResult2.getStatus() == 0) && (!localAndroidCertVerifyResult2.isIssuedByKnownRoot()))
        ((com.tencent.mm.plugin.appbrand.n.a)e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 9L, 1L);
      if ((localAndroidCertVerifyResult2.getStatus() == 0) && (localAndroidCertVerifyResult2.isIssuedByKnownRoot()))
        AppMethodBeat.o(108103);
      while (true)
      {
        return i;
        i = -1;
        AppMethodBeat.o(108103);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandWcWssSocket", paramString, "doCertificateVerify Exception", new Object[0]);
        i = -1;
        AppMethodBeat.o(108103);
      }
    }
  }

  public final void onClose(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(108102);
    ab.i("MicroMsg.AppBrandWcWssSocket", "onClose group:%s,id:%s, reason:%s, code:%s", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2, Integer.valueOf(paramInt2) });
    b.a(this.ica, b.a.icf);
    b.a(this.ica).K(paramInt2, paramString2);
    AppMethodBeat.o(108102);
  }

  public final void onHandShake(String paramString, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(108099);
    ab.i("MicroMsg.AppBrandWcWssSocket", "onHandShake group:%s, wssId:%s", new Object[] { paramString, Integer.valueOf(paramInt) });
    paramString = b.a(this.ica, 1, paramArrayOfString1, paramArrayOfString2);
    b.a(this.ica).a((com.tencent.mm.plugin.appbrand.t.e.a)paramString);
    AppMethodBeat.o(108099);
  }

  public final void onMessage(String paramString, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(108101);
    ab.i("MicroMsg.AppBrandWcWssSocket", "onMessage group:%s,wssId:%s,isText:%s", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramBoolean);
    while (true)
    {
      try
      {
        paramString = new java/lang/String;
        paramString.<init>(paramArrayOfByte, "utf-8");
        b.a(this.ica).BB(paramString);
        AppMethodBeat.o(108101);
        return;
      }
      catch (UnsupportedEncodingException paramString)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandWcWssSocket", paramString, "onmessage unsupport encoding UnsupportedEncodingException", new Object[0]);
        AppMethodBeat.o(108101);
        continue;
      }
      paramString = ByteBuffer.wrap(paramArrayOfByte);
      b.a(this.ica).l(paramString);
      AppMethodBeat.o(108101);
    }
  }

  public final void onOpen(String paramString1, int paramInt1, boolean paramBoolean, String[] paramArrayOfString1, String[] paramArrayOfString2, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(108100);
    ab.i("MicroMsg.AppBrandWcWssSocket", "onOpen group:%s,isSuc:%s, msg:%s, code:%s, wssId:%s", new Object[] { paramString1, Boolean.valueOf(paramBoolean), paramString2, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    if (paramBoolean)
    {
      b.a(this.ica, b.a.icd);
      paramString1 = b.a(this.ica, 2, paramArrayOfString1, paramArrayOfString2);
      b.a(this.ica).b((h)paramString1);
      AppMethodBeat.o(108100);
    }
    while (true)
    {
      return;
      b.a(this.ica).zJ("onOpen fail code:" + paramInt2 + ", msg:" + paramString2);
      AppMethodBeat.o(108100);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.websocket.b.1
 * JD-Core Version:    0.6.2
 */
package org.b.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.b.g.c;

public final class a
  implements b
{
  public final String aL(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(77300);
    try
    {
      org.b.g.d.jn(paramString1, "Base string cant be null or empty string");
      org.b.g.d.jn(paramString2, "Api secret cant be null or empty string");
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(String.valueOf(c.encode(paramString2)));
      paramString3 = '&' + c.encode(paramString3);
      paramString2 = new javax/crypto/spec/SecretKeySpec;
      paramString2.<init>(paramString3.getBytes("UTF-8"), "HmacSHA1");
      paramString3 = Mac.getInstance("HmacSHA1");
      paramString3.init(paramString2);
      paramString3 = paramString3.doFinal(paramString1.getBytes("UTF-8"));
      paramString2 = new java/lang/String;
      paramString2.<init>(org.b.g.a.cQ(paramString3));
      paramString2 = paramString2.replace("\r\n", "");
      AppMethodBeat.o(77300);
      return paramString2;
    }
    catch (Exception paramString2)
    {
      paramString1 = new org.b.b.d(paramString1, paramString2);
      AppMethodBeat.o(77300);
    }
    throw paramString1;
  }

  public final String enl()
  {
    return "HMAC-SHA1";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.b.f.a
 * JD-Core Version:    0.6.2
 */
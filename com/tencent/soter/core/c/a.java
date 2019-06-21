package com.tencent.soter.core.c;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

public class a
{
  static
  {
    AppMethodBeat.i(73018);
    if (!a.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(73018);
      return;
    }
  }

  public static String a(Certificate paramCertificate)
  {
    AppMethodBeat.i(73016);
    StringWriter localStringWriter = new StringWriter();
    BufferedWriter localBufferedWriter = new BufferedWriter(localStringWriter);
    localBufferedWriter.write("-----BEGIN " + "CERTIFICATE" + "-----");
    localBufferedWriter.write("\n");
    a(localBufferedWriter, Base64.encode(paramCertificate.getEncoded(), 2));
    localBufferedWriter.write("-----END " + "CERTIFICATE" + "-----");
    localBufferedWriter.write("\n");
    localBufferedWriter.close();
    paramCertificate = localStringWriter.toString();
    AppMethodBeat.o(73016);
    return paramCertificate;
  }

  private static void a(BufferedWriter paramBufferedWriter, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(73015);
    char[] arrayOfChar = new char[64];
    for (int i = 0; i < paramArrayOfByte.length; i += 64)
    {
      for (int j = 0; (j != 64) && (i + j < paramArrayOfByte.length); j++)
        arrayOfChar[j] = ((char)(char)paramArrayOfByte[(i + j)]);
      paramBufferedWriter.write(arrayOfChar, 0, j);
      paramBufferedWriter.write("\n");
    }
    AppMethodBeat.o(73015);
  }

  public static void a(X509Certificate paramX509Certificate, i parami)
  {
    AppMethodBeat.i(73017);
    paramX509Certificate = paramX509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
    if ((paramX509Certificate == null) || (paramX509Certificate.length == 0))
    {
      paramX509Certificate = new Exception("Couldn't find the keystore attestation extension data.");
      AppMethodBeat.o(73017);
      throw paramX509Certificate;
    }
    int m;
    int n;
    try
    {
      int i = "{".getBytes()[0];
      int j = "}".getBytes()[0];
      k = 0;
      m = 0;
      n = 0;
      if (k < paramX509Certificate.length)
      {
        int i1 = paramX509Certificate[k];
        int i2;
        if (i1 == i)
          i2 = k;
        while (true)
        {
          k++;
          n = i2;
          break;
          i2 = n;
          if (i1 == j)
          {
            m = k;
            i2 = n;
          }
        }
      }
      if ((n <= 0) || (n >= m))
        break label299;
      if ((!$assertionsDisabled) && (paramX509Certificate[(n - 1)] != m - n + 1))
      {
        paramX509Certificate = new java/lang/AssertionError;
        paramX509Certificate.<init>();
        AppMethodBeat.o(73017);
        throw paramX509Certificate;
      }
    }
    catch (Exception paramX509Certificate)
    {
      paramX509Certificate = new Exception("Couldn't parse challenge json string in the attestation certificate" + paramX509Certificate.getStackTrace());
      AppMethodBeat.o(73017);
      throw paramX509Certificate;
    }
    int k = m - n + 1;
    Object localObject = new byte[k];
    System.arraycopy(paramX509Certificate, n, localObject, 0, k);
    paramX509Certificate = new java/lang/String;
    paramX509Certificate.<init>((byte[])localObject);
    d.i("Soter.CertUtil", "soter: challenge json in attestation certificate ".concat(String.valueOf(paramX509Certificate)), new Object[0]);
    localObject = new org/json/JSONObject;
    ((JSONObject)localObject).<init>(paramX509Certificate);
    parami.rOh = ((JSONObject)localObject).getString("cpu_id");
    parami.uid = ((JSONObject)localObject).getInt("uid");
    parami.Avl = ((JSONObject)localObject).getLong("counter");
    label299: AppMethodBeat.o(73017);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.c.a
 * JD-Core Version:    0.6.2
 */
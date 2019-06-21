package com.tencent.soter.core.c;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i
{
  long Avl;
  private String Avm;
  public String Avn;
  private ArrayList<String> Avo;
  public String rOh;
  public String signature;
  public int uid;

  public i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(73045);
    this.Avl = -1L;
    this.uid = -1;
    this.rOh = "";
    this.Avm = "";
    this.Avn = "";
    this.Avo = null;
    this.signature = "";
    this.Avn = paramString1;
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString1);
      if (((JSONObject)localObject).has("certs"))
      {
        paramString1 = ((JSONObject)localObject).optJSONArray("certs");
        if (paramString1.length() < 2)
          d.e("Soter.SoterPubKeyModel", "certificates train not enough", new Object[0]);
        d.i("Soter.SoterPubKeyModel", "certs size: [%d]", new Object[] { Integer.valueOf(paramString1.length()) });
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        this.Avo = ((ArrayList)localObject);
        for (int i = 0; i < paramString1.length(); i++)
        {
          localObject = paramString1.getString(i);
          this.Avo.add(localObject);
        }
        localObject = CertificateFactory.getInstance("X.509");
        paramString1 = new java/io/ByteArrayInputStream;
        paramString1.<init>(((String)this.Avo.get(0)).getBytes());
        a((X509Certificate)((CertificateFactory)localObject).generateCertificate(paramString1));
      }
      while (true)
      {
        this.signature = paramString2;
        AppMethodBeat.o(73045);
        return;
        this.Avl = ((JSONObject)localObject).optLong("counter");
        this.uid = ((JSONObject)localObject).optInt("uid");
        this.rOh = ((JSONObject)localObject).optString("cpu_id");
        this.Avm = ((JSONObject)localObject).optString("pub_key");
      }
    }
    catch (Exception paramString1)
    {
      while (true)
        d.e("Soter.SoterPubKeyModel", "soter: pub key model failed", new Object[0]);
    }
  }

  public i(Certificate[] paramArrayOfCertificate)
  {
    AppMethodBeat.i(73046);
    this.Avl = -1L;
    this.uid = -1;
    this.rOh = "";
    this.Avm = "";
    this.Avn = "";
    this.Avo = null;
    this.signature = "";
    if (paramArrayOfCertificate != null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      for (int i = 0; i < paramArrayOfCertificate.length; i++)
      {
        Certificate localCertificate = paramArrayOfCertificate[i];
        Base64.encodeToString(localCertificate.getEncoded(), 2);
        String str = a.a(localCertificate);
        if (i == 0)
          a((X509Certificate)localCertificate);
        localJSONArray.put(str);
        localArrayList.add(str);
      }
      this.Avo = localArrayList;
      paramArrayOfCertificate = new org/json/JSONObject;
      paramArrayOfCertificate.<init>();
      paramArrayOfCertificate.put("certs", localJSONArray);
      this.Avn = paramArrayOfCertificate.toString();
      AppMethodBeat.o(73046);
      return;
    }
    catch (Exception paramArrayOfCertificate)
    {
      while (true)
      {
        d.e("Soter.SoterPubKeyModel", "soter: pub key model failed", new Object[0]);
        AppMethodBeat.o(73046);
      }
    }
  }

  private void a(X509Certificate paramX509Certificate)
  {
    AppMethodBeat.i(73047);
    try
    {
      a.a(paramX509Certificate, this);
      AppMethodBeat.o(73047);
      return;
    }
    catch (Exception paramX509Certificate)
    {
      while (true)
      {
        d.e("Soter.SoterPubKeyModel", "soter: loadDeviceInfo from attestationCert failed" + paramX509Certificate.getStackTrace(), new Object[0]);
        AppMethodBeat.o(73047);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(73044);
    String str = "SoterPubKeyModel{counter=" + this.Avl + ", uid=" + this.uid + ", cpu_id='" + this.rOh + '\'' + ", pub_key_in_x509='" + this.Avm + '\'' + ", rawJson='" + this.Avn + '\'' + ", signature='" + this.signature + '\'' + '}';
    AppMethodBeat.o(73044);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.c.i
 * JD-Core Version:    0.6.2
 */
package com.tencent.soter.core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

public final class j
{
  private long Avl = -1L;
  private String Avp = null;
  public String Avq = null;
  private String Avr = "";
  private String Avs = "";
  private String Avt = "";
  private String Avu = "";
  private String Avv = "";
  public int Avw = 20;
  public String Avx = "";
  public String signature = "";

  public static j aue(String paramString)
  {
    AppMethodBeat.i(73049);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      j localj = new com/tencent/soter/core/c/j;
      localj.<init>();
      localj.Avx = paramString;
      localj.Avp = localJSONObject.optString("raw");
      localj.Avq = localJSONObject.optString("fid");
      localj.Avl = localJSONObject.optLong("counter");
      localj.Avr = localJSONObject.optString("tee_n");
      localj.Avs = localJSONObject.optString("tee_v");
      localj.Avt = localJSONObject.optString("fp_n");
      localj.Avu = localJSONObject.optString("fp_v");
      localj.Avv = localJSONObject.optString("cpu_id");
      localj.Avw = localJSONObject.optInt("rsa_pss_saltlen", 20);
      AppMethodBeat.o(73049);
      paramString = localj;
      return paramString;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        d.e("Soter.SoterSignatureResult", "soter: convert from json failed." + paramString.toString(), new Object[0]);
        paramString = null;
        AppMethodBeat.o(73049);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(73048);
    String str = "SoterSignatureResult{rawValue='" + this.Avp + '\'' + ", fid='" + this.Avq + '\'' + ", counter=" + this.Avl + ", TEEName='" + this.Avr + '\'' + ", TEEVersion='" + this.Avs + '\'' + ", FpName='" + this.Avt + '\'' + ", FpVersion='" + this.Avu + '\'' + ", cpuId='" + this.Avv + '\'' + ", saltLen=" + this.Avw + ", jsonValue='" + this.Avx + '\'' + ", signature='" + this.signature + '\'' + '}';
    AppMethodBeat.o(73048);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.c.j
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet_index.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import org.json.JSONObject;

public final class c
{
  public String gtl;
  public String kWz;
  String mPackageName;
  public String mSignature;
  String tQR;
  public String tQS;
  long tQT;
  int tQU;
  public String tQV;
  public String tQW;
  public String tQX;
  public String tQY;

  public c(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(48171);
    this.tQR = paramString1;
    this.tQW = paramString2;
    paramString2 = new JSONObject(this.tQW);
    this.tQS = paramString2.optString("orderId");
    this.mPackageName = paramString2.optString("packageName");
    this.kWz = paramString2.optString("productId");
    this.tQT = paramString2.optLong("purchaseTime");
    this.tQU = paramString2.optInt("purchaseState");
    paramString1 = paramString2.optString("developerPayload");
    ArrayList localArrayList = adi(paramString1);
    if (localArrayList.size() == 3)
    {
      this.tQV = ((String)localArrayList.get(0));
      this.tQY = ((String)localArrayList.get(1));
      this.tQX = ((String)localArrayList.get(2));
    }
    while (true)
    {
      this.gtl = paramString2.optString("token", paramString2.optString("purchaseToken"));
      this.mSignature = paramString3;
      AppMethodBeat.o(48171);
      return;
      this.tQV = paramString1;
    }
  }

  public c(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.kWz = paramString1;
    this.tQV = paramString2;
    this.tQX = paramString3;
    this.tQY = paramString4;
  }

  private static ArrayList<String> adi(String paramString)
  {
    AppMethodBeat.i(48172);
    ArrayList localArrayList = new ArrayList();
    while (paramString.indexOf("[#]") >= 0)
    {
      String str = paramString.substring(0, paramString.indexOf("[#]"));
      paramString = paramString.substring(str.length() + 3);
      localArrayList.add(str);
    }
    localArrayList.add(paramString);
    AppMethodBeat.o(48172);
    return localArrayList;
  }

  public final String toString()
  {
    AppMethodBeat.i(48173);
    String str = "PurchaseInfo(type:" + this.tQR + "):" + this.tQW;
    AppMethodBeat.o(48173);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.b.a.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.b.a.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class r extends a
{
  public long cSh;
  public String desc;
  public int kCA;
  public int kCv;
  public String kCw;
  public String kCx;
  public String kCy;
  public String kCz;
  public String pPg;
  public String pPh;
  public String pPi;

  public r(String paramString)
  {
    AppMethodBeat.i(44762);
    HashMap localHashMap = new HashMap();
    try
    {
      if (!bo.isNullOrNil(paramString))
        localHashMap.put("qrcode_url", URLEncoder.encode(paramString, "UTF-8"));
      M(localHashMap);
      ab.i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "qrcode_url: %s", new Object[] { paramString });
      AppMethodBeat.o(44762);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferScanQrCode", localUnsupportedEncodingException, "", new Object[0]);
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44763);
    this.pPg = paramJSONObject.optString("recv_username", "");
    this.kCz = paramJSONObject.optString("recv_realname", "");
    this.pPh = paramJSONObject.optString("recv_nickname", "");
    this.desc = paramJSONObject.optString("desc", "");
    this.cSh = paramJSONObject.optLong("amount", 0L);
    this.kCA = paramJSONObject.optInt("set_amount", 0);
    this.kCv = paramJSONObject.optInt("currency", 0);
    this.kCw = paramJSONObject.optString("currencyunit", "");
    this.pPi = paramJSONObject.optString("qrcodeid", "");
    this.kCx = paramJSONObject.optString("notice", "");
    this.kCy = paramJSONObject.optString("notice_url", "");
    ab.i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "recv_username: %s, recv_nickname: %s, desc: %s, amount: %s, setAmount: %s, currencyunit: %s", new Object[] { this.pPg, this.pPh, this.desc, Long.valueOf(this.cSh), Integer.valueOf(this.kCA), this.kCw });
    ab.d("MicroMsg.NetSceneH5F2fTransferScanQrCode", "recv_realname: %s", new Object[] { this.kCz });
    AppMethodBeat.o(44763);
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/h5f2ftransferscanqrcode";
  }

  public final int bgG()
  {
    return 1301;
  }

  public final int getType()
  {
    return 1301;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.r
 * JD-Core Version:    0.6.2
 */
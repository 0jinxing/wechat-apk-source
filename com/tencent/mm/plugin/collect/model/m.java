package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.b.a.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m extends a
{
  public long cSh;
  public String desc;
  public int kCA;
  public int kCl;
  public String kCm;
  public String kCn;
  public int kCo;
  public String kCp;
  public String kCq;
  public String kCr;
  public String kCs;
  public String kCt;
  public String kCu;
  public int kCv;
  public String kCw;
  public String kCx;
  public String kCy;
  public String kCz;

  public m(int paramInt)
  {
    AppMethodBeat.i(40980);
    HashMap localHashMap = new HashMap();
    localHashMap.put("set_amount", "0");
    localHashMap.put("wallet_type", String.valueOf(paramInt));
    M(localHashMap);
    ab.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "setAmount: %s, walletType: %s", new Object[] { Integer.valueOf(0), Integer.valueOf(paramInt) });
    AppMethodBeat.o(40980);
  }

  public m(long paramLong, String paramString, int paramInt)
  {
    AppMethodBeat.i(40981);
    HashMap localHashMap = new HashMap();
    localHashMap.put("amount", String.valueOf(paramLong));
    localHashMap.put("set_amount", "1");
    try
    {
      if (!bo.isNullOrNil(paramString))
        localHashMap.put("desc", URLEncoder.encode(paramString, "UTF-8"));
      localHashMap.put("wallet_type", String.valueOf(paramInt));
      M(localHashMap);
      this.cSh = paramLong;
      this.desc = paramString;
      ab.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "amount: %d, setAmount: %s, desc: %s, walletType: %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(1), paramString, Integer.valueOf(paramInt) });
      AppMethodBeat.o(40981);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferGetQrCode", localUnsupportedEncodingException, "", new Object[0]);
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(40982);
    this.kCl = paramJSONObject.optInt("retcode", 0);
    this.kCm = paramJSONObject.optString("retmsg", "");
    this.kCn = paramJSONObject.optString("qrcode_url", "");
    this.kCo = paramJSONObject.optInt("alert_type", 0);
    this.kCp = paramJSONObject.optString("alert_title", "");
    this.kCq = paramJSONObject.optString("left_button_text", "");
    this.kCr = paramJSONObject.optString("right_button_text", "");
    this.kCs = paramJSONObject.optString("right_button_url", "");
    this.kCt = paramJSONObject.optString("bottom_text", "");
    this.kCu = paramJSONObject.optString("bottom_url", "");
    this.kCv = paramJSONObject.optInt("currency", 0);
    this.kCw = paramJSONObject.optString("currencyunit", "");
    this.kCx = paramJSONObject.optString("notice", "");
    this.kCy = paramJSONObject.optString("notice_url", "");
    this.kCz = paramJSONObject.optString("recv_realname", "");
    this.kCA = paramJSONObject.optInt("set_amount", 0);
    if (this.kCA == 0)
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xRU, this.kCn);
      ab.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "set payurl: %s", new Object[] { this.kCn });
    }
    ab.d("MicroMsg.NetSceneH5F2fTransferGetQrCode", "url: %s, currency: %s", new Object[] { this.kCn, Integer.valueOf(this.kCv) });
    AppMethodBeat.o(40982);
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/h5f2ftransfergetqrcode";
  }

  public final int bgG()
  {
    return 1335;
  }

  public final boolean bgH()
  {
    return true;
  }

  public final int getType()
  {
    return 1335;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.m
 * JD-Core Version:    0.6.2
 */
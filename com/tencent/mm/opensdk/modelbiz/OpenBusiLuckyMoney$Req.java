package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;

public class OpenBusiLuckyMoney$Req extends BaseReq
{
  private static final int MAX_URL_LENGHT = 10240;
  public String appId;
  public String nonceStr;
  public String packageExt;
  public String signType;
  public String signature;
  public String timeStamp;

  public boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(128155);
    if ((this.appId == null) || (this.appId.length() <= 0))
      AppMethodBeat.o(128155);
    while (true)
    {
      return bool;
      if ((this.timeStamp == null) || (this.timeStamp.length() <= 0))
      {
        AppMethodBeat.o(128155);
      }
      else if ((this.nonceStr == null) || (this.nonceStr.length() <= 0))
      {
        AppMethodBeat.o(128155);
      }
      else if ((this.signType == null) || (this.signType.length() <= 0))
      {
        AppMethodBeat.o(128155);
      }
      else if ((this.signature == null) || (this.signature.length() <= 0))
      {
        AppMethodBeat.o(128155);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(128155);
      }
    }
  }

  public int getType()
  {
    return 13;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128156);
    super.toBundle(paramBundle);
    paramBundle.putString("_wxapi_open_busi_lucky_money_appid", this.appId);
    paramBundle.putString("_wxapi_open_busi_lucky_money_timeStamp", this.timeStamp);
    paramBundle.putString("_wxapi_open_busi_lucky_money_nonceStr", this.nonceStr);
    paramBundle.putString("_wxapi_open_busi_lucky_money_signType", this.signType);
    paramBundle.putString("_wxapi_open_busi_lucky_money_signature", this.signature);
    paramBundle.putString("_wxapi_open_busi_lucky_money_package", this.packageExt);
    AppMethodBeat.o(128156);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.OpenBusiLuckyMoney.Req
 * JD-Core Version:    0.6.2
 */
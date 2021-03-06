package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public final class WXNontaxPay$Req extends BaseReq
{
  private static final String TAG = "MicroMsg.SDK.WXNontaxPay.Req";
  private static final int URL_LENGTH_LIMIT = 10240;
  public String url;

  public final boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(128228);
    if (d.b(this.url))
    {
      Log.i("MicroMsg.SDK.WXNontaxPay.Req", "url should not be empty");
      AppMethodBeat.o(128228);
    }
    while (true)
    {
      return bool;
      if (this.url.length() > 10240)
      {
        Log.e("MicroMsg.SDK.WXNontaxPay.Req", "url must be in 10k");
        AppMethodBeat.o(128228);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(128228);
      }
    }
  }

  public final void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128230);
    super.fromBundle(paramBundle);
    this.url = paramBundle.getString("_wxapi_nontax_pay_req_url");
    AppMethodBeat.o(128230);
  }

  public final int getType()
  {
    return 21;
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128229);
    super.fromBundle(paramBundle);
    paramBundle.putString("_wxapi_nontax_pay_req_url", this.url);
    AppMethodBeat.o(128229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.WXNontaxPay.Req
 * JD-Core Version:    0.6.2
 */
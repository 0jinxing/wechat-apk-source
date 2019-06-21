package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public final class WXInvoiceAuthInsert$Req extends BaseReq
{
  private static final String TAG = "MicroMsg.SDK.WXInvoiceAuthInsert.Req";
  private static final int URL_LENGTH_LIMIT = 10240;
  public String url;

  public final boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(128157);
    if (d.b(this.url))
    {
      Log.i("MicroMsg.SDK.WXInvoiceAuthInsert.Req", "url should not be empty");
      AppMethodBeat.o(128157);
    }
    while (true)
    {
      return bool;
      if (this.url.length() > 10240)
      {
        Log.e("MicroMsg.SDK.WXInvoiceAuthInsert.Req", "url must be in 10k");
        AppMethodBeat.o(128157);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(128157);
      }
    }
  }

  public final void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128159);
    super.fromBundle(paramBundle);
    this.url = paramBundle.getString("_wxapi_invoice_auth_insert_req_url");
    AppMethodBeat.o(128159);
  }

  public final int getType()
  {
    return 20;
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128158);
    super.fromBundle(paramBundle);
    paramBundle.putString("_wxapi_invoice_auth_insert_req_url", this.url);
    AppMethodBeat.o(128158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert.Req
 * JD-Core Version:    0.6.2
 */
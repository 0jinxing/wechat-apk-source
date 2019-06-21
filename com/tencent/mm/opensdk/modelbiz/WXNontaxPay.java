package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseResp;

public class WXNontaxPay
{
  public static final class Resp extends BaseResp
  {
    public String wxOrderId;

    public final boolean checkArgs()
    {
      return true;
    }

    public final void fromBundle(Bundle paramBundle)
    {
      AppMethodBeat.i(128222);
      super.fromBundle(paramBundle);
      this.wxOrderId = paramBundle.getString("_wxapi_nontax_pay_order_id");
      AppMethodBeat.o(128222);
    }

    public final int getType()
    {
      return 21;
    }

    public final void toBundle(Bundle paramBundle)
    {
      AppMethodBeat.i(128221);
      super.fromBundle(paramBundle);
      paramBundle.putString("_wxapi_nontax_pay_order_id", this.wxOrderId);
      AppMethodBeat.o(128221);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.WXNontaxPay
 * JD-Core Version:    0.6.2
 */
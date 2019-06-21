package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;

public class SendAuth$Resp extends BaseResp
{
  private static final int LENGTH_LIMIT = 1024;
  private static final String TAG = "MicroMsg.SDK.SendAuth.Resp";
  public String code;
  public String country;
  public String lang;
  public String state;
  public String url;

  public SendAuth$Resp()
  {
  }

  public SendAuth$Resp(Bundle paramBundle)
  {
    AppMethodBeat.i(128263);
    fromBundle(paramBundle);
    AppMethodBeat.o(128263);
  }

  public boolean checkArgs()
  {
    AppMethodBeat.i(128266);
    boolean bool;
    if ((this.state != null) && (this.state.length() > 1024))
    {
      Log.e("MicroMsg.SDK.SendAuth.Resp", "checkArgs fail, state is invalid");
      bool = false;
      AppMethodBeat.o(128266);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(128266);
    }
  }

  public void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128264);
    super.fromBundle(paramBundle);
    this.code = paramBundle.getString("_wxapi_sendauth_resp_token");
    this.state = paramBundle.getString("_wxapi_sendauth_resp_state");
    this.url = paramBundle.getString("_wxapi_sendauth_resp_url");
    this.lang = paramBundle.getString("_wxapi_sendauth_resp_lang");
    this.country = paramBundle.getString("_wxapi_sendauth_resp_country");
    AppMethodBeat.o(128264);
  }

  public int getType()
  {
    return 1;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128265);
    super.toBundle(paramBundle);
    paramBundle.putString("_wxapi_sendauth_resp_token", this.code);
    paramBundle.putString("_wxapi_sendauth_resp_state", this.state);
    paramBundle.putString("_wxapi_sendauth_resp_url", this.url);
    paramBundle.putString("_wxapi_sendauth_resp_lang", this.lang);
    paramBundle.putString("_wxapi_sendauth_resp_country", this.country);
    AppMethodBeat.o(128265);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.SendAuth.Resp
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;

public class SubscribeMiniProgramMsg$Req extends BaseReq
{
  private static final int LENGTH_LIMIT = 1024;
  private static final String TAG = "MicroMsg.SDK.SubscribeMessage.Req";
  public String miniProgramAppId;

  public SubscribeMiniProgramMsg$Req()
  {
  }

  public SubscribeMiniProgramMsg$Req(Bundle paramBundle)
  {
    AppMethodBeat.i(128238);
    fromBundle(paramBundle);
    AppMethodBeat.o(128238);
  }

  public boolean checkArgs()
  {
    AppMethodBeat.i(128241);
    boolean bool;
    if ((this.miniProgramAppId == null) || (this.miniProgramAppId.length() == 0))
    {
      Log.e("MicroMsg.SDK.SubscribeMessage.Req", "checkArgs fail, miniProgramAppId is null");
      bool = false;
      AppMethodBeat.o(128241);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(128241);
    }
  }

  public void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128239);
    super.fromBundle(paramBundle);
    this.miniProgramAppId = paramBundle.getString("_wxapi_subscribeminiprogram_req_miniprogramappid");
    AppMethodBeat.o(128239);
  }

  public int getType()
  {
    return 23;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128240);
    super.toBundle(paramBundle);
    paramBundle.putString("_wxapi_subscribeminiprogram_req_miniprogramappid", this.miniProgramAppId);
    AppMethodBeat.o(128240);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg.Req
 * JD-Core Version:    0.6.2
 */
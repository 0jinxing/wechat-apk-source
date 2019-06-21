package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;

public class JumpToBizWebview$Req extends BaseReq
{
  private static final int EXT_MSG_LENGTH = 1024;
  private static final String TAG = "MicroMsg.SDK.JumpToBizWebview.Req";
  public String extMsg;
  public int scene = 1;
  public String toUserName;
  public int webType;

  public boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(128234);
    if ((this.toUserName == null) || (this.toUserName.length() <= 0))
    {
      Log.e("MicroMsg.SDK.JumpToBizWebview.Req", "checkArgs fail, toUserName is invalid");
      AppMethodBeat.o(128234);
    }
    while (true)
    {
      return bool;
      if ((this.extMsg != null) && (this.extMsg.length() > 1024))
      {
        Log.e("MicroMsg.SDK.JumpToBizWebview.Req", "ext msg is not null, while the length exceed 1024 bytes");
        AppMethodBeat.o(128234);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(128234);
      }
    }
  }

  public int getType()
  {
    return 8;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128235);
    super.toBundle(paramBundle);
    paramBundle.putString("_wxapi_jump_to_biz_webview_req_to_user_name", this.toUserName);
    paramBundle.putString("_wxapi_jump_to_biz_webview_req_ext_msg", this.extMsg);
    paramBundle.putInt("_wxapi_jump_to_biz_webview_req_web_type", this.webType);
    paramBundle.putInt("_wxapi_jump_to_biz_webview_req_scene", this.scene);
    AppMethodBeat.o(128235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.JumpToBizWebview.Req
 * JD-Core Version:    0.6.2
 */
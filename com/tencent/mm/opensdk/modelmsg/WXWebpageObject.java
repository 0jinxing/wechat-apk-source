package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.utils.Log;

public class WXWebpageObject
  implements WXMediaMessage.IMediaObject
{
  private static final int LENGTH_LIMIT = 10240;
  private static final String TAG = "MicroMsg.SDK.WXWebpageObject";
  public String canvasPageXml;
  public String extInfo;
  public String webpageUrl;

  public WXWebpageObject()
  {
  }

  public WXWebpageObject(String paramString)
  {
    this.webpageUrl = paramString;
  }

  public boolean checkArgs()
  {
    AppMethodBeat.i(128323);
    boolean bool;
    if ((this.webpageUrl == null) || (this.webpageUrl.length() == 0) || (this.webpageUrl.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXWebpageObject", "checkArgs fail, webpageUrl is invalid");
      bool = false;
      AppMethodBeat.o(128323);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(128323);
    }
  }

  public void serialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128321);
    paramBundle.putString("_wxwebpageobject_extInfo", this.extInfo);
    paramBundle.putString("_wxwebpageobject_webpageUrl", this.webpageUrl);
    paramBundle.putString("_wxwebpageobject_canvaspagexml", this.canvasPageXml);
    AppMethodBeat.o(128321);
  }

  public int type()
  {
    return 5;
  }

  public void unserialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128322);
    this.extInfo = paramBundle.getString("_wxwebpageobject_extInfo");
    this.webpageUrl = paramBundle.getString("_wxwebpageobject_webpageUrl");
    this.canvasPageXml = paramBundle.getString("_wxwebpageobject_canvaspagexml");
    AppMethodBeat.o(128322);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.WXWebpageObject
 * JD-Core Version:    0.6.2
 */
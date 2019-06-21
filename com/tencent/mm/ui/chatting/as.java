package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ce.a;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Resp;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.sdk.e.l;
import java.util.HashMap;
import java.util.Map;

public final class as
  implements ab
{
  private static l<ab, Bundle> yMP;
  private Context context;
  private final Map<String, ShowMessageFromWX.Req> yMS;

  static
  {
    AppMethodBeat.i(31094);
    yMP = new as.1();
    AppMethodBeat.o(31094);
  }

  public as(Context paramContext)
  {
    AppMethodBeat.i(31089);
    this.yMS = new HashMap();
    this.context = paramContext;
    AppMethodBeat.o(31089);
  }

  public static void az(Bundle paramBundle)
  {
    AppMethodBeat.i(31090);
    yMP.cF(paramBundle);
    yMP.doNotify();
    AppMethodBeat.o(31090);
  }

  public final void a(String paramString1, WXMediaMessage paramWXMediaMessage, String paramString2, String paramString3)
  {
    AppMethodBeat.i(31092);
    a(paramString1, paramWXMediaMessage, paramString2, paramString3, null);
    AppMethodBeat.o(31092);
  }

  public final void a(String paramString1, WXMediaMessage paramWXMediaMessage, String paramString2, String paramString3, aj paramaj)
  {
    AppMethodBeat.i(31093);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WXAppMessageShower", "request pkg = %s, openId = %s", new Object[] { paramString1, paramString3 });
    a.post(new as.2(this, paramWXMediaMessage, paramString3, paramString1, paramString2, paramaj));
    AppMethodBeat.o(31093);
  }

  public final void ay(Bundle paramBundle)
  {
    AppMethodBeat.i(31091);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WXAppMessageShower", "handleResp, appid = ".concat(String.valueOf(Uri.parse(paramBundle.getString("_mmessage_content")).getQueryParameter("appid"))));
    paramBundle = new ShowMessageFromWX.Resp(paramBundle);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WXAppMessageShower", "handleResp, errCode = " + paramBundle.errCode + ", type = " + paramBundle.getType());
    if ((ShowMessageFromWX.Req)this.yMS.get(paramBundle.transaction) == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.WXAppMessageShower", "invalid resp, check transaction failed, transaction=" + paramBundle.transaction);
      AppMethodBeat.o(31091);
    }
    while (true)
    {
      return;
      this.yMS.remove(paramBundle.transaction);
      AppMethodBeat.o(31091);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.as
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.jsapi.share.l;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

final class d$3
  implements Runnable
{
  d$3(d paramd, JsApiChattingTask paramJsApiChattingTask, WxaExposedParams.a parama, w paramw, d.a parama1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131003);
    ab.i("MicroMsg.JsApiEnterContact", "go to the chattingUI");
    Intent localIntent = new Intent();
    localIntent.setFlags(67108864);
    localIntent.putExtra("Chat_User", this.hIA.username);
    localIntent.putExtra("app_brand_chatting_from_scene", 2);
    localIntent.putExtra("app_brand_chatting_expose_params", this.hIB.ayP());
    localIntent.putExtra("key_temp_session_from", this.hIA.sessionFrom);
    localIntent.putExtra("finish_direct", true);
    localIntent.putExtra("key_need_send_video", false);
    if (this.hIu.hIq)
    {
      localIntent.putExtra("sendMessageTitle", this.hIu.hIn);
      localIntent.putExtra("sendMessagePath", this.hIu.hIo);
      localIntent.putExtra("sendMessageImg", this.hIu.hIp);
      localIntent.putExtra("sendMessageLocalImg", l.getRealPath(this.hIu.hIr));
      localIntent.putExtra("needDelThumb", this.hIu.hIs);
    }
    localIntent.putExtra("showMessageCard", this.hIu.hIq);
    MMActivity localMMActivity = (MMActivity)this.hIw.mContext;
    if (localMMActivity == null)
    {
      if (this.hIv != null)
        this.hIv.a(false, "fail:internal error invalid android context", null);
      ab.e("MicroMsg.JsApiEnterContact", "mmActivity is null, invoke fail!");
      AppMethodBeat.o(131003);
    }
    while (true)
    {
      return;
      localMMActivity.ifE = new d.3.1(this);
      com.tencent.mm.bp.d.b(localMMActivity, ".ui.chatting.AppBrandServiceChattingUI", localIntent, 1);
      AppMethodBeat.o(131003);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.d.3
 * JD-Core Version:    0.6.2
 */
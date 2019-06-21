package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

final class e$2
  implements Runnable
{
  e$2(e parame, JsApiChattingTask paramJsApiChattingTask, u paramu, e.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131021);
    ab.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact go to the customized chattingUI");
    Intent localIntent = new Intent();
    localIntent.setFlags(67108864);
    localIntent.putExtra("Chat_User", this.hIA.username);
    localIntent.putExtra("app_brand_chatting_from_scene", 2);
    localIntent.putExtra("key_temp_session_from", this.hIA.sessionFrom);
    localIntent.putExtra("finish_direct", true);
    localIntent.putExtra("key_need_send_video", false);
    Object localObject = new WxaExposedParams.a();
    ((WxaExposedParams.a)localObject).appId = this.hII.hID;
    ((WxaExposedParams.a)localObject).username = this.hII.hIE;
    ((WxaExposedParams.a)localObject).from = 5;
    localIntent.putExtra("app_brand_chatting_expose_params", ((WxaExposedParams.a)localObject).ayP());
    localIntent.putExtra("keyPrivateAppId", this.hII.hID);
    localIntent.putExtra("keyPrivateUserName", this.hII.hIE);
    localIntent.putExtra("keyPrivateTitle", this.hII.hIF);
    localIntent.putExtra("keyPrivateSubTitle", this.hII.hIG);
    localIntent.putExtra("keyPrivateHeadImage", this.hII.hIH);
    localObject = (MMActivity)this.hwF.mContext;
    if (localObject == null)
    {
      if (this.hIJ != null)
        this.hIJ.a(false, "fail:internal error invalid android context", null);
      ab.e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact mmActivity is null, invoke fail!");
      AppMethodBeat.o(131021);
    }
    while (true)
    {
      return;
      ((MMActivity)localObject).ifE = new e.2.1(this);
      d.b((Context)localObject, ".ui.chatting.AppBrandServiceChattingUI", localIntent, 1);
      AppMethodBeat.o(131021);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.e.2
 * JD-Core Version:    0.6.2
 */
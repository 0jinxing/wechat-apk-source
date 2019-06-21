package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class w$1$2$1$1
  implements d.a
{
  w$1$2$1$1(w.1.2.1 param1, String paramString)
  {
  }

  public final void d(WxaAttributes paramWxaAttributes)
  {
    AppMethodBeat.i(33123);
    if (paramWxaAttributes == null)
    {
      t.makeText(this.zfa.zeZ.mqd.getContext(), 2131301848, 0).show();
      AppMethodBeat.o(33123);
    }
    while (true)
    {
      return;
      Object localObject = paramWxaAttributes.field_appId;
      if ((TextUtils.isEmpty((CharSequence)localObject)) || (TextUtils.isEmpty(this.sCm)))
      {
        ab.i("MicroMsg.ChattingItemDyeingTemplate", "appId(%s) or msgId(%s) is null or nil.", new Object[] { localObject, this.sCm });
        t.makeText(this.zfa.zeZ.mqd.getContext(), 2131301848, 0).show();
        AppMethodBeat.o(33123);
      }
      else
      {
        try
        {
          paramWxaAttributes = String.format("https://mp.weixin.qq.com/mp/wacomplain?action=show&appid=%s&msgid=%s&from=%d&version_type=%d&version_code=%d#wechat_redirect", new Object[] { URLEncoder.encode((String)localObject, "utf-8"), URLEncoder.encode(this.sCm, "utf-8"), Integer.valueOf(1), Integer.valueOf(this.zfa.zeZ.zeY), Integer.valueOf(this.zfa.zeZ.hlL) });
          ab.d("MicroMsg.ChattingItemDyeingTemplate", "go to complain page(%s, %s), url:%s", new Object[] { this.sCm, localObject, paramWxaAttributes });
          localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", paramWxaAttributes);
          d.b(w.b(this.zfa.zeZ.zeX.zeW).yTx.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject);
          AppMethodBeat.o(33123);
        }
        catch (UnsupportedEncodingException paramWxaAttributes)
        {
          ab.e("MicroMsg.ChattingItemDyeingTemplate", "Error occurred when encode url.");
          t.makeText(this.zfa.zeZ.mqd.getContext(), 2131301848, 0).show();
          AppMethodBeat.o(33123);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.1.2.1.1
 * JD-Core Version:    0.6.2
 */
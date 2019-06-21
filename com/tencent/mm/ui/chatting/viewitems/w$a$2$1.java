package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelappbrand.s;
import com.tencent.mm.protocal.protobuf.cya;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class w$a$2$1
  implements f
{
  w$a$2$1(w.a.2 param2)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(33152);
    aw.Rg().b(1198, this);
    ab.d("MicroMsg.ChattingItemDyeingTemplate", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.FALSE });
    if (w.a(this.zfq.zfp.zeW) != null)
    {
      w.a(this.zfq.zfp.zeW).dismiss();
      w.a(this.zfq.zfp.zeW, null);
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      t.makeText(this.zfq.mqd.getContext(), 2131301843, 0).show();
      AppMethodBeat.o(33152);
    }
    while (true)
    {
      return;
      if (this.zfq.fku != this.zfq.mqd.getTag())
      {
        ab.w("MicroMsg.ChattingItemDyeingTemplate", "item msg(%s) has changed.", new Object[] { Long.valueOf(this.zfq.fku.field_msgId) });
        AppMethodBeat.o(33152);
      }
      else
      {
        paramString = ((s)paramm).abK();
        if (paramString == null)
        {
          t.makeText(this.zfq.mqd.getContext(), 2131301843, 0).show();
          AppMethodBeat.o(33152);
        }
        else
        {
          paramm = paramString.xtv;
          ab.d("MicroMsg.ChattingItemDyeingTemplate", "more view clicked, menu item COMPLAIN_APP_BRAND selected, sync attr username %s", new Object[] { this.zfq.uHr });
          try
          {
            paramString = String.format("https://mp.weixin.qq.com/mp/infringement?from=8&username=%s&template_id=%s&template_msg_id=%s1#wechat_redirect", new Object[] { this.zfq.uHr, URLEncoder.encode(w.d(this.zfq.zfp.zeW), "utf-8"), URLEncoder.encode(paramm, "utf-8") });
            ab.i("MicroMsg.ChattingItemDyeingTemplate", "go to complain page(%s, %s), url:%s", new Object[] { paramm, w.d(this.zfq.zfp.zeW), paramString });
            paramm = new Intent();
            paramm.putExtra("rawUrl", paramString);
            d.b(w.b(this.zfq.zfp.zeW).yTx.getContext(), "webview", ".ui.tools.WebViewUI", paramm);
            AppMethodBeat.o(33152);
          }
          catch (UnsupportedEncodingException paramString)
          {
            ab.e("MicroMsg.ChattingItemDyeingTemplate", "Error occurred when encode url.");
            t.makeText(this.zfq.mqd.getContext(), 2131301848, 0).show();
            AppMethodBeat.o(33152);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.a.2.1
 * JD-Core Version:    0.6.2
 */
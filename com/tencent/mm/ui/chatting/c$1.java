package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.azo;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedList;

final class c$1
  implements h.c
{
  c$1(c paramc, s.o paramo)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(30379);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(30379);
      while (true)
      {
        return;
        Intent localIntent = new Intent();
        try
        {
          localIntent.putExtra("rawUrl", String.format("https://mp.weixin.qq.com/mp/readtemplate?t=wxm-appmsg-inform&bizusername=%s&tid=%s&mid=%s&mtime=%s&scene=%s#wechat_redirect", new Object[] { URLEncoder.encode(this.yGG.svN, "UTF-8"), URLEncoder.encode(this.yGG.fhu, "UTF-8"), Long.valueOf(this.yGG.cKd.field_msgSvrId), Integer.valueOf((int)(this.yGG.cKd.field_createTime / 1000L)), Integer.valueOf(42) }));
          localIntent.putExtra("show_bottom", false);
          localIntent.putExtra("showShare", false);
          d.b(c.a(this.yGH).yTx.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
          AppMethodBeat.o(30379);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          ab.e("MicroMsg.AppSpamClickListener", "exception in expore, %s", new Object[] { localUnsupportedEncodingException.getMessage() });
          AppMethodBeat.o(30379);
        }
      }
      ab.d("MicroMsg.AppSpamClickListener", "hakon refulse, fromUserName = %s, templateId = %s", new Object[] { this.yGG.svN, this.yGG.fhu });
      aw.Rg().a(1030, this.yGH);
      Object localObject2 = new azo();
      ((azo)localObject2).vEq = 1;
      ((azo)localObject2).wDw = this.yGG.fhu;
      ((azo)localObject2).Title = "";
      Object localObject1 = new LinkedList();
      ((LinkedList)localObject1).add(localObject2);
      localObject2 = new qi();
      ((qi)localObject2).cMy.cKE = this.yGG.svN;
      ((qi)localObject2).cMy.cMz = ((LinkedList)localObject1);
      if (com.tencent.mm.sdk.b.a.xxA.m((b)localObject2))
      {
        localObject1 = this.yGH;
        localObject2 = c.a(this.yGH).yTx.getContext();
        c.a(this.yGH).yTx.getMMResources().getString(2131297061);
        c.a((c)localObject1, h.b((Context)localObject2, c.a(this.yGH).yTx.getMMResources().getString(2131297086), true, new c.1.1(this)));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.1
 * JD-Core Version:    0.6.2
 */
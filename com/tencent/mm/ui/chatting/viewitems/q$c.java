package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.o;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.s.e;

final class q$c extends s.e
{
  private c zbA;

  public q$c(com.tencent.mm.ui.chatting.d.a parama, c paramc)
  {
    super(parama);
    this.zbA = paramc;
  }

  public final void a(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33018);
    j.b localb = j.b.me(bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend));
    if (localb == null)
    {
      ab.w("MicroMsg.WeishiVideoClickListener", "weishi chatItemClick, content is null");
      AppMethodBeat.o(33018);
      return;
    }
    if ((bo.isNullOrNil(localb.fiQ)) && (bo.isNullOrNil(localb.fiP)))
    {
      parambi = new Intent();
      str1 = localb.url;
      if (parama.dFx());
      for (paramView = "groupmessage"; ; paramView = "singlemessage")
      {
        parambi.putExtra("rawUrl", p.B(str1, paramView));
        parambi.putExtra("webpageTitle", localb.title);
        parambi.putExtra("shortUrl", localb.url);
        d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", parambi);
        AppMethodBeat.o(33018);
        break;
      }
    }
    String str1 = parama.getTalkerUserName();
    String str2 = this.zbA.b(parama, parambi);
    Bundle localBundle = new Bundle();
    int i;
    label192: boolean bool;
    if (parama.dFx())
    {
      i = 2;
      localBundle.putInt("stat_scene", i);
      localBundle.putString("stat_msg_id", "msg_" + Long.toString(parambi.field_msgSvrId));
      localBundle.putString("stat_chat_talker_username", str1);
      localBundle.putString("stat_send_msg_user", str2);
      paramView = com.tencent.mm.pluginsdk.model.app.g.dX(localb.appId, localb.axy);
      if ((paramView != null) && (paramView.field_appName != null) && (paramView.field_appName.trim().length() > 0))
        break label539;
      paramView = localb.appName;
      label292: localBundle.putString("stat_weishi_app_name", paramView);
      localBundle.putString("stat_app_id", localb.appId);
      localBundle.putString("stat_weishi_source_username", localb.cMg);
      paramView = (com.tencent.mm.af.a)localb.X(com.tencent.mm.af.a.class);
      if ((paramView == null) || (paramView.ffp != 1))
        break label547;
      bool = true;
      label350: localBundle.putBoolean("stat_weishi_from_opensdk", bool);
      localBundle.putString("stat_weishi_msg_img_path", parambi.field_imgPath);
      localBundle.putString("stat_weishi_thumb_path", o.ahl().c(parambi.field_imgPath, false, true));
      if (paramView == null)
        break label553;
    }
    label539: label547: label553: for (paramView = paramView.appThumbUrl; ; paramView = null)
    {
      localBundle.putString("stat_weishi_thumb_url", paramView);
      h.pYm.e(16979, new Object[] { localb.fiQ, localb.fiO, Integer.valueOf(0), Integer.valueOf(1) });
      ab.i("MicroMsg.WeishiVideoClickListener", "weishi chatItemClick, appbrandAppId:%s, appBrandUsername:%s", new Object[] { localb.fiQ, localb.fiP });
      ((e)com.tencent.mm.kernel.g.K(e.class)).a(parama.yTx.getContext(), str1, str2, parama.dFx(), localb, localBundle);
      AppMethodBeat.o(33018);
      break;
      if (t.mZ(str1))
      {
        i = 7;
        break label192;
      }
      i = 1;
      break label192;
      paramView = paramView.field_appName;
      break label292;
      bool = false;
      break label350;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.q.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.bbom;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.l;
import com.tencent.mm.af.o;
import com.tencent.mm.af.p;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.brandservice.ui.timeline.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.chatting.r;
import com.tencent.mm.ui.chatting.viewitems.ay;
import com.tencent.mm.ui.chatting.viewitems.d.f;
import com.tencent.mm.ui.e.m;

public final class d
  implements com.tencent.mm.plugin.brandservice.a.a
{
  public final void a(int paramInt, Context paramContext, String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(18249);
    r.a(paramInt, paramContext, paramString1, paramString2, paramLong1, paramLong2);
    AppMethodBeat.o(18249);
  }

  public final void a(long paramLong, int paramInt, Context paramContext, Activity paramActivity, bi parambi)
  {
    AppMethodBeat.i(18250);
    r.a(paramLong, paramInt, paramContext, null, paramActivity, parambi);
    AppMethodBeat.o(18250);
  }

  public final void a(View paramView, long paramLong, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(18245);
    d.f localf = new d.f();
    localf.cvx = paramLong;
    localf.zcZ = paramInt;
    localf.cHz = paramString2;
    localf.imgPath = paramString1;
    paramView.setTag(localf);
    AppMethodBeat.o(18245);
  }

  public final void a(p paramp, final q paramq, int paramInt1, o paramo, View paramView, boolean paramBoolean, final int paramInt2, final i parami)
  {
    AppMethodBeat.i(18247);
    String str = s.mJ(paramq.field_talker);
    Object localObject1 = paramp.url;
    Object localObject2 = paramq.field_talker;
    if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (((String)localObject1).contains("http://weixin.qq.com/emoticonstore/")))
    {
      localObject1 = ((String)localObject1).substring(((String)localObject1).lastIndexOf("/") + 1);
      ad localad = ((j)g.K(j.class)).XM().aoO((String)localObject2);
      if ((com.tencent.mm.n.a.jh(localad.field_type)) && (localad.dsf()))
      {
        localObject2 = f.qX((String)localObject2);
        if (localObject2 != null)
        {
          localObject2 = ((com.tencent.mm.aj.d)localObject2).cJ(false);
          if ((localObject2 != null) && (!TextUtils.isEmpty(((d.b)localObject2).aen())) && (((String)localObject1).contains(((d.b)localObject2).aen())))
          {
            if (TextUtils.isEmpty((CharSequence)localObject1))
              break label359;
            paramo = new ay(null, false, paramInt1, paramp.url, paramBoolean, str, paramo.cMg, paramo.cMh, paramp.title, (String)localObject1, null, false, false);
            paramView.setOnClickListener(new d.1(this, paramq));
          }
        }
      }
    }
    while (true)
    {
      if (paramo != null)
      {
        paramo.unn = paramq.field_msgSvrId;
        paramo.uno = paramInt2;
        paramo.ziz = paramq;
        paramView.setTag(paramo);
      }
      if (l.mg(paramp.fjC))
        r.a(paramp, paramView, paramq.field_talker);
      if (((paramInt2 < 2) || (paramq.field_isExpand)) && (((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(1)))
      {
        ab.d("MicroMsg.BizTimeLineServices", "terry trace: preload %s:%s", new Object[] { str, paramp.title });
        ((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).a(paramp.url, paramp.type, 90, new Object[0]);
      }
      AppMethodBeat.o(18247);
      return;
      localObject1 = null;
      break;
      label359: if (!bo.isNullOrNil(paramp.url))
      {
        paramo = new ay(null, false, paramInt1, paramp.url, paramBoolean, str, paramo.cMg, paramo.cMh, paramp.title);
        paramo.cSQ = 56;
        paramo.ziA = paramp.type;
        localObject2 = paramq.field_talker;
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("share_report_pre_msg_url", paramp.url);
        ((Bundle)localObject1).putString("share_report_pre_msg_title", paramp.title);
        ((Bundle)localObject1).putString("share_report_pre_msg_desc", paramp.fjz);
        ((Bundle)localObject1).putString("share_report_pre_msg_icon_url", l.a(paramp));
        ((Bundle)localObject1).putString("share_report_pre_msg_appid", "");
        ((Bundle)localObject1).putInt("share_report_from_scene", 5);
        ((Bundle)localObject1).putString("share_report_biz_username", (String)localObject2);
        paramo.ziy = ((Bundle)localObject1);
        paramView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(18244);
            int i = (int)(System.currentTimeMillis() / 1000L);
            Context localContext = paramAnonymousView.getContext();
            ay localay = (ay)paramAnonymousView.getTag();
            paramAnonymousView = localay.ziz;
            if (paramAnonymousView == null)
              ab.e("MicroMsg.ChattingItemHelper", "onBizTimeLineWebViewClick info is null");
            int j;
            do
            {
              do
              {
                if (parami != null)
                  parami.a(paramq, paramInt2, i);
                AppMethodBeat.o(18244);
                return;
                j = 10000;
                if ((localContext instanceof Activity))
                  j = ((Activity)localContext).getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
                ab.i("MicroMsg.ChattingItemHelper", "onWebViewClick = %d", new Object[] { Integer.valueOf(i) });
              }
              while (com.tencent.mm.ui.chatting.e.a(localay.cRS, localContext, null, paramAnonymousView.field_talker));
              localObject1 = localay.userName;
              localObject2 = localay.zit;
            }
            while ((localObject1 == null) || (((String)localObject1).equals("")));
            Object localObject3 = l.c((String)localObject1, 90, j, i);
            Object localObject1 = new Intent();
            ((Intent)localObject1).putExtra("rawUrl", (String)localObject3);
            ((Intent)localObject1).putExtra("shortUrl", (String)localObject3);
            ((Intent)localObject1).putExtra("webpageTitle", (String)localObject2);
            Object localObject2 = new Bundle();
            aw.ZK();
            localObject3 = c.XM().aoO(paramAnonymousView.field_talker);
            int k;
            if ((localObject3 != null) && (((ad)localObject3).dsf()))
            {
              k = 4;
              ab.d("MicroMsg.ChattingItemHelper", "hakon click biz msg %s", new Object[] { ((ap)localObject3).field_username });
            }
            while (true)
            {
              ((Intent)localObject1).putExtra("msg_id", paramAnonymousView.field_msgId);
              ((Intent)localObject1).putExtra("KPublisherId", "msg_" + Long.toString(paramAnonymousView.field_msgSvrId));
              ((Intent)localObject1).putExtra("pre_username", paramAnonymousView.field_talker);
              ((Intent)localObject1).putExtra("prePublishId", "msg_" + Long.toString(paramAnonymousView.field_msgSvrId));
              ((Intent)localObject1).putExtra("preUsername", paramAnonymousView.field_talker);
              ((Intent)localObject1).putExtra("preChatName", paramAnonymousView.field_talker);
              ((Intent)localObject1).putExtra("preChatTYPE", 7);
              ((Intent)localObject1).putExtra("preMsgIndex", localay.uno);
              localObject3 = localay.ziy;
              if (localObject3 != null)
                ((Intent)localObject1).putExtras((Bundle)localObject3);
              ((Bundle)localObject2).putInt("snsWebSource", k);
              ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject2);
              ((Intent)localObject1).putExtra("geta8key_username", paramAnonymousView.field_talker);
              if (!ah.isNullOrNil(localay.cMg))
              {
                ((Intent)localObject1).putExtra("srcUsername", localay.cMg);
                ((Intent)localObject1).putExtra("srcDisplayname", localay.cMh);
                ((Intent)localObject1).putExtra("mode", 1);
              }
              ((Intent)localObject1).putExtra("message_id", localay.unn);
              ((Intent)localObject1).putExtra("message_index", localay.uno);
              ((Intent)localObject1).putExtra("from_scence", 1);
              ((Intent)localObject1).putExtra("geta8key_scene", localay.cSQ);
              ((Intent)localObject1).addFlags(536870912);
              ((Intent)localObject1).putExtra("start_activity_time", System.currentTimeMillis());
              ((Intent)localObject1).putExtra(e.m.ygo, localay.ziA);
              if ((((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(1)) && (((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).a(localContext, localay.userName, localay.ziA, 90, j, (Intent)localObject1)))
              {
                ab.i("MicroMsg.ChattingItemHelper", "jump to TmplWebview");
                break;
              }
              com.tencent.mm.bp.d.b(localContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
              break;
              k = 0;
            }
          }
        });
      }
      else
      {
        paramo = null;
      }
    }
  }

  public final void a(bi parambi, Activity paramActivity)
  {
    AppMethodBeat.i(18251);
    if (!parambi.bAA())
    {
      cl localcl = new cl();
      com.tencent.mm.pluginsdk.model.e.d(localcl, parambi);
      localcl.cvA.activity = paramActivity;
      localcl.cvA.cvH = 43;
      com.tencent.mm.sdk.b.a.xxA.m(localcl);
      if (localcl.cvB.ret == 0)
        com.tencent.mm.modelstat.b.fRa.D(parambi);
    }
    AppMethodBeat.o(18251);
  }

  public final void a(bi parambi, Context paramContext)
  {
    AppMethodBeat.i(18252);
    r.a(parambi, paramContext, null);
    AppMethodBeat.o(18252);
  }

  public final void b(com.tencent.mm.aj.d paramd, Activity paramActivity, ad paramad)
  {
    AppMethodBeat.i(18248);
    com.tencent.mm.ui.tools.b.a(paramd, paramActivity, paramad, 3);
    AppMethodBeat.o(18248);
  }

  public final long cY(View paramView)
  {
    AppMethodBeat.i(18246);
    r.eK(paramView);
    long l;
    if ((paramView.getTag() instanceof d.f))
    {
      l = ((d.f)paramView.getTag()).cvx;
      AppMethodBeat.o(18246);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(18246);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.d
 * JD-Core Version:    0.6.2
 */
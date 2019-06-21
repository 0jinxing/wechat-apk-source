package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.e;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.g.a.ok;
import com.tencent.mm.g.a.sj;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;

public final class l
  implements View.OnClickListener
{
  private Context context;

  public l(Context paramContext)
  {
    this.context = paramContext;
  }

  public final void onClick(View paramView)
  {
    int i = 1;
    AppMethodBeat.i(27964);
    Object localObject = paramView.getTag();
    int j;
    if ((localObject instanceof l.b))
    {
      localObject = (l.b)localObject;
      if ((localObject == null) || (paramView == null))
      {
        ab.w("MicroMsg.SourceClickListener", "localAppRedirectHandle: but info or v is null");
        j = 0;
        label43: if (j == 0)
        {
          paramView = p.f(this.context, ((l.b)localObject).appId, ((l.b)localObject).cKf);
          localObject = new sj();
          ((sj)localObject).cOF.cOG = paramView;
          ((sj)localObject).cOF.context = this.context;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        }
        AppMethodBeat.o(27964);
      }
    }
    while (true)
    {
      return;
      if ("wx7fa037cc7dfabad5".equals(((l.b)localObject).appId))
      {
        com.tencent.mm.plugin.sport.a.d.kT(33);
        aw.ZK();
        if (com.tencent.mm.n.a.jh(c.XM().aoO("gh_43f2581f6fd6").field_type))
        {
          paramView = new Intent();
          paramView.putExtra("Chat_User", "gh_43f2581f6fd6");
          paramView.putExtra("finish_direct", true);
          com.tencent.mm.bp.d.f(this.context, ".ui.chatting.ChattingUI", paramView);
          j = i;
          break label43;
        }
        paramView = new Intent();
        paramView.putExtra("Contact_User", "gh_43f2581f6fd6");
        com.tencent.mm.bp.d.b(this.context, "profile", ".ui.ContactInfoUI", paramView);
        j = i;
        break label43;
      }
      if ("wx485a97c844086dc9".equals(((l.b)localObject).appId))
      {
        paramView = new Intent();
        paramView.putExtra("shake_music", true);
        com.tencent.mm.bp.d.b(this.context, "shake", ".ui.ShakeReportUI", paramView);
        j = i;
        break label43;
      }
      if ("wxfbc915ff7c30e335".equals(((l.b)localObject).appId))
      {
        j = i;
        if (com.tencent.mm.au.b.ahO())
          break label43;
        paramView = new Intent();
        paramView.putExtra("BaseScanUI_select_scan_mode", 1);
        j = i;
        if (com.tencent.mm.r.a.bI(this.context))
          break label43;
        j = i;
        if (e.akI())
          break label43;
        com.tencent.mm.bp.d.b(this.context, "scanner", ".ui.BaseScanUI", paramView);
        j = i;
        break label43;
      }
      if ("wx482a4001c37e2b74".equals(((l.b)localObject).appId))
      {
        j = i;
        if (com.tencent.mm.au.b.ahO())
          break label43;
        paramView = new Intent();
        paramView.putExtra("BaseScanUI_select_scan_mode", 2);
        j = i;
        if (com.tencent.mm.r.a.bI(this.context))
          break label43;
        j = i;
        if (e.akI())
          break label43;
        com.tencent.mm.bp.d.b(this.context, "scanner", ".ui.BaseScanUI", paramView);
        j = i;
        break label43;
      }
      if ("wx751a1acca5688ba3".equals(((l.b)localObject).appId))
      {
        j = i;
        if (com.tencent.mm.au.b.ahO())
          break label43;
        paramView = new Intent();
        paramView.putExtra("BaseScanUI_select_scan_mode", 5);
        j = i;
        if (com.tencent.mm.r.a.bI(this.context))
          break label43;
        j = i;
        if (e.akI())
          break label43;
        com.tencent.mm.bp.d.b(this.context, "scanner", ".ui.BaseScanUI", paramView);
        j = i;
        break label43;
      }
      if (!"wxaf060266bfa9a35c".equals(((l.b)localObject).appId))
        break;
      paramView = new Intent();
      paramView.putExtra("shake_tv", true);
      com.tencent.mm.bp.d.b(this.context, "shake", ".ui.ShakeReportUI", paramView);
      j = i;
      break label43;
      if ((localObject instanceof l.a))
      {
        paramView = (l.a)localObject;
        localObject = new gt();
        ((gt)localObject).cBv.actionCode = 2;
        ((gt)localObject).cBv.scene = paramView.scene;
        ((gt)localObject).cBv.extMsg = ("chatting_src=" + paramView.scene);
        ((gt)localObject).cBv.appId = paramView.appId;
        ((gt)localObject).cBv.context = this.context;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        localObject = new ok();
        ((ok)localObject).cKI.context = this.context;
        ((ok)localObject).cKI.scene = paramView.scene;
        ((ok)localObject).cKI.csB = paramView.appId;
        ((ok)localObject).cKI.packageName = paramView.ceO;
        ((ok)localObject).cKI.msgType = paramView.voz;
        ((ok)localObject).cKI.cEV = paramView.cKE;
        ((ok)localObject).cKI.cKJ = 5;
        ((ok)localObject).cKI.mediaTagName = paramView.voA;
        ((ok)localObject).cKI.cKK = paramView.cKK;
        ((ok)localObject).cKI.cKL = "";
        ((ok)localObject).cKI.cst = paramView.voB;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
      AppMethodBeat.o(27964);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.l
 * JD-Core Version:    0.6.2
 */
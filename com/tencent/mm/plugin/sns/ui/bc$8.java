package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.g.a.ok;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.at;
import com.tencent.mm.protocal.protobuf.av;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;

final class bc$8
  implements View.OnClickListener
{
  bc$8(bc parambc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39869);
    Object localObject1 = this.rDG;
    int i;
    if ((paramView == null) || (!(paramView.getTag() instanceof TimeLineObject)))
    {
      i = 1;
      if (i != 0)
        break label1011;
      if ((paramView != null) && ((paramView.getTag() instanceof TimeLineObject)))
        break label551;
      AppMethodBeat.o(39869);
    }
    Object localObject2;
    label551: TimeLineObject localTimeLineObject;
    while (true)
    {
      return;
      localObject2 = ((TimeLineObject)paramView.getTag()).xfH.Id;
      if ("wx485a97c844086dc9".equals(localObject2))
      {
        com.tencent.mm.bp.d.b(paramView.getContext(), "shake", ".ui.ShakeReportUI", new Intent().putExtra("shake_music", true));
        i = 1;
        break;
      }
      if ("wx7fa037cc7dfabad5".equals(localObject2))
      {
        com.tencent.mm.plugin.sport.a.d.kT(34);
        g.RQ();
        if (com.tencent.mm.n.a.jh(((j)g.K(j.class)).XM().aoO("gh_43f2581f6fd6").field_type))
        {
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("Chat_User", "gh_43f2581f6fd6");
          ((Intent)localObject2).putExtra("finish_direct", true);
          com.tencent.mm.bp.d.f(((bc)localObject1).context, ".ui.chatting.ChattingUI", (Intent)localObject2);
        }
        while (true)
        {
          i = 1;
          break;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("Contact_User", "gh_43f2581f6fd6");
          com.tencent.mm.bp.d.b(((bc)localObject1).context, "profile", ".ui.ContactInfoUI", (Intent)localObject2);
        }
      }
      if (("wx9181ed3f223e6d76".equals(localObject2)) || ("wx2fe12a395c426fcf".equals(localObject2)))
      {
        ab.i("MicroMsg.TimeLineClickEvent", "hy: shake new year closed. try to go to shake TV");
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("shake_tv", true);
        com.tencent.mm.bp.d.b(paramView.getContext(), "shake", ".ui.ShakeReportUI", (Intent)localObject1);
        i = 1;
        break;
      }
      if ("wx751a1acca5688ba3".equals(localObject2))
      {
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("BaseScanUI_select_scan_mode", 5);
        if ((!com.tencent.mm.r.a.bI(((bc)localObject1).context)) && (!com.tencent.mm.r.a.bH(((bc)localObject1).context)))
          com.tencent.mm.bp.d.b(((bc)localObject1).context, "scanner", ".ui.BaseScanUI", (Intent)localObject2);
        i = 1;
        break;
      }
      if ("wxfbc915ff7c30e335".equals(localObject2))
      {
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("BaseScanUI_select_scan_mode", 1);
        if ((!com.tencent.mm.r.a.bI(((bc)localObject1).context)) && (!com.tencent.mm.r.a.bH(((bc)localObject1).context)))
          com.tencent.mm.bp.d.b(((bc)localObject1).context, "scanner", ".ui.BaseScanUI", (Intent)localObject2);
        i = 1;
        break;
      }
      if ("wx482a4001c37e2b74".equals(localObject2))
      {
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("BaseScanUI_select_scan_mode", 2);
        if ((!com.tencent.mm.r.a.bI(((bc)localObject1).context)) && (!com.tencent.mm.r.a.bH(((bc)localObject1).context)))
          com.tencent.mm.bp.d.b(((bc)localObject1).context, "scanner", ".ui.BaseScanUI", (Intent)localObject2);
        i = 1;
        break;
      }
      if ("wxaf060266bfa9a35c".equals(localObject2))
      {
        if (!com.tencent.mm.aw.d.aim())
        {
          i = 1;
          break;
        }
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("shake_tv", true);
        com.tencent.mm.bp.d.b(((bc)localObject1).context, "shake", ".ui.ShakeReportUI", (Intent)localObject2);
        i = 1;
        break;
      }
      i = 0;
      break;
      localTimeLineObject = (TimeLineObject)paramView.getTag();
      if ((localTimeLineObject != null) && (localTimeLineObject.xfH != null))
        break label588;
      ab.e("MicroMsg.TimeLineClickEvent", "appInfo is null");
      AppMethodBeat.o(39869);
    }
    label588: String str1 = localTimeLineObject.xfH.Id;
    String str2 = com.tencent.mm.plugin.sns.c.a.gkF.df(str1);
    if (!bo.isNullOrNil(str2))
      if (localTimeLineObject == null)
      {
        paramView = null;
        label625: if (localTimeLineObject.xfI.wbJ != 1)
          break label881;
        i = 2;
      }
    while (true)
    {
      localObject2 = null;
      localObject1 = localObject2;
      if (localTimeLineObject.qNO != null)
      {
        localObject1 = localObject2;
        if (localTimeLineObject.qNO.vCy != null)
          localObject1 = localTimeLineObject.qNO.vCy.vCs;
      }
      localObject2 = new ok();
      ((ok)localObject2).cKI.context = this.rDG.context;
      ((ok)localObject2).cKI.scene = 4;
      ((ok)localObject2).cKI.csB = str1;
      ((ok)localObject2).cKI.packageName = str2;
      ((ok)localObject2).cKI.msgType = i;
      ((ok)localObject2).cKI.cEV = paramView;
      ((ok)localObject2).cKI.mediaTagName = ((String)localObject1);
      ((ok)localObject2).cKI.cKJ = 5;
      ((ok)localObject2).cKI.cKK = 0L;
      ((ok)localObject2).cKI.cKL = localTimeLineObject.Id;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject2);
      paramView = new gt();
      paramView.cBv.actionCode = 2;
      paramView.cBv.scene = 3;
      paramView.cBv.extMsg = "timeline_src=3";
      paramView.cBv.appId = str1;
      paramView.cBv.context = this.rDG.context;
      com.tencent.mm.sdk.b.a.xxA.m(paramView);
      AppMethodBeat.o(39869);
      break;
      paramView = localTimeLineObject.jBB;
      break label625;
      label881: if (localTimeLineObject.xfI.wbJ == 3)
      {
        i = 5;
        continue;
        paramView = this.rDG;
        paramView = com.tencent.mm.plugin.sns.c.a.gkF.f(paramView.context, str1, "timeline");
        if ((paramView == null) || (paramView.length() == 0))
        {
          AppMethodBeat.o(39869);
          break;
        }
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", paramView);
        ((Intent)localObject1).putExtra("shortUrl", paramView);
        ((Intent)localObject1).putExtra("useJs", true);
        ((Intent)localObject1).putExtra("type", -255);
        ((Intent)localObject1).putExtra("geta8key_scene", 2);
        com.tencent.mm.plugin.sns.c.a.gkE.i((Intent)localObject1, this.rDG.context);
        label1011: AppMethodBeat.o(39869);
        break;
      }
      i = 2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.8
 * JD-Core Version:    0.6.2
 */
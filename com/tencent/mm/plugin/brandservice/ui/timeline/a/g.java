package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.l;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.t;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.brandservice.ui.timeline.f;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.base.n.d;

public final class g
  implements n.d
{
  private long jPG;
  private boolean jPH = false;
  com.tencent.mm.plugin.brandservice.ui.timeline.a jPm;
  private Context mContext;

  public g(com.tencent.mm.plugin.brandservice.ui.timeline.a parama, Context paramContext)
  {
    this.jPm = parama;
    this.mContext = paramContext;
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(14265);
    if (this.jPm.jNl == null)
    {
      ab.w("MicroMsg.BizTimeLineMMMenuItemListener", "onMMMenuItemSelected mInfo == null");
      AppMethodBeat.o(14265);
      return;
    }
    q localq = this.jPm.jNl;
    this.jPG = bo.anT();
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 10:
    case 11:
    case 3:
    case 4:
    case 5:
    case 7:
    case 6:
    case 8:
    case 9:
    }
    while (true)
    {
      AppMethodBeat.o(14265);
      break;
      paramMenuItem = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(localq.field_talker);
      if (paramMenuItem == null)
      {
        ab.e("MicroMsg.BizTimeLineMMMenuItemListener", "changed biz stick status failed, contact is null, talker = " + localq.field_talker);
        AppMethodBeat.o(14265);
        break;
      }
      if (paramMenuItem.Oe())
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(13307, new Object[] { paramMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3) });
        t.x(localq.field_talker, true);
        com.tencent.mm.ui.base.h.bQ(this.mContext, this.mContext.getString(2131297686));
        this.jPm.jNy.a(localq, false);
        AppMethodBeat.o(14265);
        break;
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(13307, new Object[] { paramMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(3) });
      t.w(localq.field_talker, true);
      com.tencent.mm.ui.base.h.bQ(this.mContext, this.mContext.getString(2131297681));
      this.jPm.jNy.a(localq, true);
      AppMethodBeat.o(14265);
      break;
      paramMenuItem = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(localq.field_talker);
      Object localObject1 = z.aeR().qP(localq.field_talker);
      ((com.tencent.mm.plugin.brandservice.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.a.class)).b((com.tencent.mm.aj.d)localObject1, (Activity)this.mContext, paramMenuItem);
      this.jPm.jNy.d(localq, 2);
      AppMethodBeat.o(14265);
      break;
      com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(2131297685), "", this.mContext.getString(2131296994), this.mContext.getString(2131296868), true, new g.1(this, localq), null, 2131690384);
      AppMethodBeat.o(14265);
      break;
      com.tencent.mm.ui.base.h.bQ(this.mContext, this.mContext.getString(2131297657));
      AppMethodBeat.o(14265);
      break;
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("Contact_User", localq.field_talker);
      paramMenuItem.putExtra("Contact_Scene", 90);
      com.tencent.mm.bp.d.b(this.mContext, "profile", ".ui.ContactInfoUI", paramMenuItem);
      this.jPm.jNy.d(localq, 1);
      AppMethodBeat.o(14265);
      break;
      if (this.jPH)
      {
        ((com.tencent.mm.plugin.brandservice.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.a.class)).a(this.jPm.jNm, this.mContext, localq.field_content, localq.field_talker, localq.field_msgId, localq.field_msgSvrId);
        AppMethodBeat.o(14265);
        break;
      }
      localObject1 = l.a(this.mContext, this.jPm.jNm, localq.field_content, localq.field_talker, localq.field_msgId);
      if (bo.isNullOrNil((String)localObject1))
        continue;
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("Retr_Msg_content", (String)localObject1);
      paramMenuItem.putExtra("Retr_Msg_Type", 2);
      paramMenuItem.putExtra("Retr_Biz_Msg_Selected_Msg_Index", this.jPm.jNm);
      paramMenuItem.putExtra("Retr_Msg_Id", localq.field_msgId);
      paramMenuItem.putExtra("Retr_MsgFromScene", 1);
      localObject1 = localq.field_talker;
      Object localObject2 = v.nW(localq.field_msgSvrId);
      paramMenuItem.putExtra("reportSessionId", (String)localObject2);
      localObject2 = v.Zp().y((String)localObject2, true);
      ((v.b)localObject2).j("prePublishId", "msg_" + localq.field_msgSvrId);
      ((v.b)localObject2).j("preUsername", localObject1);
      ((v.b)localObject2).j("preChatName", localObject1);
      ((v.b)localObject2).j("preMsgIndex", Integer.valueOf(this.jPm.jNm));
      ((v.b)localObject2).j("sendAppMsgScene", Integer.valueOf(1));
      com.tencent.mm.bp.d.f(this.mContext, ".ui.transmit.MsgRetransmitUI", paramMenuItem);
      AppMethodBeat.o(14265);
      break;
      paramMenuItem = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(localq.field_msgId);
      if (paramMenuItem.field_msgId == 0L)
      {
        ab.w("MicroMsg.BizTimeLineMMMenuItemListener", "favAppBrandMsg msg is null");
        AppMethodBeat.o(14265);
        break;
      }
      ((com.tencent.mm.plugin.brandservice.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.a.class)).a(this.jPG, this.jPm.jNm, this.mContext, (Activity)this.mContext, paramMenuItem);
      AppMethodBeat.o(14265);
      break;
      paramMenuItem = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(localq.field_msgId);
      if (paramMenuItem.field_msgId == 0L)
      {
        ab.w("MicroMsg.BizTimeLineMMMenuItemListener", "favAppBrandMsg msg is null");
        AppMethodBeat.o(14265);
        break;
      }
      ((com.tencent.mm.plugin.brandservice.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.a.class)).a(paramMenuItem, (Activity)this.mContext);
      AppMethodBeat.o(14265);
      break;
      paramMenuItem = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(localq.field_msgId);
      if (paramMenuItem.field_msgId == 0L)
      {
        ab.w("MicroMsg.BizTimeLineMMMenuItemListener", "favAppBrandMsg msg is null");
        AppMethodBeat.o(14265);
        break;
      }
      ((com.tencent.mm.plugin.brandservice.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.a.class)).a(paramMenuItem, this.mContext);
      AppMethodBeat.o(14265);
      break;
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("Retr_Msg_content", localq.field_content);
      paramMenuItem.putExtra("Retr_Msg_Type", 4);
      com.tencent.mm.bp.d.f(this.mContext, ".ui.transmit.MsgRetransmitUI", paramMenuItem);
      AppMethodBeat.o(14265);
      break;
      paramMenuItem = (ClipboardManager)ah.getContext().getSystemService("clipboard");
      try
      {
        paramMenuItem.setText(localq.field_content);
        com.tencent.mm.ui.base.h.bQ(this.mContext, this.mContext.getString(2131296876));
        paramMenuItem = com.tencent.mm.plugin.secinforeport.a.a.qjm;
        com.tencent.mm.plugin.secinforeport.a.a.h(1, localq.field_msgSvrId, bo.ana(localq.field_content));
      }
      catch (Exception paramMenuItem)
      {
        while (true)
          ab.e("MicroMsg.BizTimeLineMMMenuItemListener", "clip.setText error ");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.g
 * JD-Core Version:    0.6.2
 */
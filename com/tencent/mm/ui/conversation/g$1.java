package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsimple.y;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.protocal.protobuf.bxk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.base.n.d;

final class g$1
  implements n.d
{
  g$1(g paramg)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    paramInt = 4;
    AppMethodBeat.i(34260);
    label58: label243: Object localObject1;
    label156: Object localObject2;
    switch (paramMenuItem.getItemId())
    {
    default:
      paramInt = -1;
      if (paramInt > 0)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(11090, new Object[] { Integer.valueOf(paramInt) });
        ab.d("MicroMsg.ConversationClickListener", "jacks kv long click: %d", new Object[] { Integer.valueOf(paramInt) });
      }
      AppMethodBeat.o(34260);
      return;
    case 4:
      if (t.kH(g.a(this.zsy)))
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(14553, new Object[] { Integer.valueOf(1), Integer.valueOf(1), g.a(this.zsy) });
        paramMenuItem = g.b(this.zsy).xXq;
        if (paramMenuItem == null)
          break label468;
        ab.i("MicroMsg.ConversationClickListener", "summerdel talker[%s] activity[%s] username[%s] latestInsertMsg[%s, %s, %s]", new Object[] { g.a(this.zsy), g.c(this.zsy), g.b(this.zsy).field_username, Long.valueOf(paramMenuItem.field_msgId), paramMenuItem.field_content, Long.valueOf(paramMenuItem.field_createTime) });
        if (f.qY(g.a(this.zsy)))
        {
          localObject1 = z.afc();
          int i = g.d(this.zsy);
          paramInt = g.b(this.zsy).field_unReadCount;
          localObject2 = g.a(this.zsy);
          ((k)localObject1).fwz = new bxk();
          ((k)localObject1).fwz.wXv = i;
          ((k)localObject1).fwz.wXt = paramInt;
          if (paramMenuItem != null)
            break label1115;
          paramMenuItem = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Rb((String)localObject2);
        }
      }
      break;
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    }
    label468: label1115: 
    while (true)
    {
      if (paramMenuItem != null)
      {
        ((k)localObject1).fwz.wXu = paramMenuItem.getType();
        if (((k)localObject1).fwz.wXt > 0)
          ((k)localObject1).fwz.wXs = ((int)(System.currentTimeMillis() - paramMenuItem.field_createTime) / 1000);
      }
      k.a(((k)localObject1).fwz, (String)localObject2);
      c.a(g.a(this.zsy), g.c(this.zsy), g.b(this.zsy), null, true, false);
      paramInt = 1;
      break label58;
      com.tencent.mm.plugin.report.service.h.pYm.e(14553, new Object[] { Integer.valueOf(0), Integer.valueOf(1), g.a(this.zsy) });
      break label156;
      ab.i("MicroMsg.ConversationClickListener", "summerdel talker[%s] activity[%s] username[%s] latestInsertMsg is null", new Object[] { g.a(this.zsy), g.c(this.zsy), g.b(this.zsy).field_username });
      break label243;
      ab.d("MicroMsg.ConversationClickListener", "placed to the top");
      t.w(g.a(this.zsy), true);
      aw.ZK();
      paramMenuItem = com.tencent.mm.model.c.XM().aoO(g.a(this.zsy));
      if ((paramMenuItem != null) && (paramMenuItem.dsf()))
        com.tencent.mm.plugin.report.service.h.pYm.e(13307, new Object[] { paramMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1) });
      com.tencent.mm.ui.base.h.bQ(g.c(this.zsy), g.c(this.zsy).getString(2131301285));
      com.tencent.mm.modelstat.b.fRa.c(true, g.a(this.zsy), true);
      break label58;
      ab.d("MicroMsg.ConversationClickListener", "unplaced to the top");
      t.x(g.a(this.zsy), true);
      aw.ZK();
      paramMenuItem = com.tencent.mm.model.c.XM().aoO(g.a(this.zsy));
      if ((paramMenuItem != null) && (paramMenuItem.dsf()))
        com.tencent.mm.plugin.report.service.h.pYm.e(13307, new Object[] { paramMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(1) });
      com.tencent.mm.ui.base.h.bQ(g.c(this.zsy), g.c(this.zsy).getString(2131301286));
      com.tencent.mm.modelstat.b.fRa.c(true, g.a(this.zsy), false);
      paramInt = 5;
      break label58;
      ab.d("MicroMsg.ConversationClickListener", "jacks mark read: %s", new Object[] { g.a(this.zsy) });
      aw.ZK();
      com.tencent.mm.model.c.XR().apb(g.a(this.zsy));
      MMAppMgr.cancelNotification(g.a(this.zsy));
      y.ab(g.a(this.zsy), 1);
      com.tencent.mm.modelstat.b.fRa.Q(g.a(this.zsy), false);
      com.tencent.mm.aq.b.agG();
      com.tencent.mm.aq.b.rX(g.a(this.zsy));
      paramInt = 3;
      break label58;
      ab.d("MicroMsg.ConversationClickListener", "jacks set unread: %s", new Object[] { g.a(this.zsy) });
      aw.ZK();
      com.tencent.mm.model.c.XR().apd(g.a(this.zsy));
      com.tencent.mm.modelstat.b.fRa.Q(g.a(this.zsy), true);
      paramInt = 2;
      break label58;
      ab.d("MicroMsg.ConversationClickListener", "jacks clear history: %s", new Object[] { g.a(this.zsy) });
      t.kH(g.a(this.zsy));
      localObject1 = g.a(this.zsy);
      paramMenuItem = g.c(this.zsy);
      localObject2 = new PBool();
      ((PBool)localObject2).value = false;
      paramMenuItem.getString(2131297061);
      bf.a((String)localObject1, new c.6((PBool)localObject2, com.tencent.mm.ui.base.h.b(paramMenuItem, paramMenuItem.getString(2131297086), true, new c.5((PBool)localObject2))));
      paramInt = -1;
      break label58;
      ab.d("MicroMsg.ConversationClickListener", "delete biz service: %s", new Object[] { g.a(this.zsy) });
      aw.ZK();
      paramMenuItem = com.tencent.mm.model.c.XM().aoO(g.a(this.zsy));
      com.tencent.mm.ui.tools.b.a(f.qX(g.a(this.zsy)), g.c(this.zsy), paramMenuItem, 1);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.g.1
 * JD-Core Version:    0.6.2
 */
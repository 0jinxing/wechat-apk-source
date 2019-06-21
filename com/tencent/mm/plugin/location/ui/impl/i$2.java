package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ld;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.location.model.e;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aaz;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;
import java.util.LinkedList;

final class i$2
  implements n.d
{
  i$2(i parami)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(113740);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      AppMethodBeat.o(113740);
      while (true)
      {
        return;
        this.nRu.bKI();
        AppMethodBeat.o(113740);
        continue;
        if (this.nRu.type == 2)
          com.tencent.mm.plugin.fav.a.h.j(this.nRu.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L), 1, 0);
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Retr_Msg_content", e.a(this.nRu.nOJ));
        paramMenuItem.putExtra("Retr_Msg_Type", 9);
        d.f(this.nRu.activity, ".ui.transmit.MsgRetransmitUI", paramMenuItem);
        AppMethodBeat.o(113740);
        continue;
        this.nRu.czL = 0;
        this.nRu.bKK();
        AppMethodBeat.o(113740);
        continue;
        this.nRu.bKJ();
        AppMethodBeat.o(113740);
        continue;
        com.tencent.mm.ui.base.h.a(this.nRu.activity, this.nRu.activity.getString(2131296882), "", new i.2.1(this), null);
        AppMethodBeat.o(113740);
        continue;
        long l = this.nRu.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L);
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("key_fav_item_id", l);
        paramMenuItem.putExtra("key_fav_scene", 2);
        com.tencent.mm.plugin.fav.a.b.b(this.nRu.activity, ".ui.FavTagEditUI", paramMenuItem);
        AppMethodBeat.o(113740);
        continue;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Retr_Msg_content", e.a(this.nRu.nOJ));
        paramMenuItem.putExtra("Retr_Msg_Id", this.nRu.cvx);
        d.f(this.nRu.activity, ".ui.chatting.ChattingSendDataToDeviceUI", paramMenuItem);
        AppMethodBeat.o(113740);
        continue;
        try
        {
          l = this.nRu.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L);
          paramMenuItem = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(l);
          com.tencent.mm.plugin.report.service.h.pYm.e(15378, new Object[] { Integer.valueOf(paramMenuItem.field_id), Integer.valueOf(paramMenuItem.field_type) });
          ab.d("MicroMsg.ViewMapUI", "report 15378, id:%s, type:%s", new Object[] { Integer.valueOf(paramMenuItem.field_id), Integer.valueOf(paramMenuItem.field_type) });
          paramMenuItem.field_flag = 0;
          paramMenuItem.field_updateTime = System.currentTimeMillis();
          paramMenuItem.field_localId = -1L;
          paramMenuItem.field_sourceType = 6;
          if (paramMenuItem.field_favProto.wit != null)
          {
            paramMenuItem.field_favProto.wit.alF("");
            paramMenuItem.field_favProto.wit.LN(6);
            paramMenuItem.field_favProto.wit.alD(r.Yz());
          }
          paramMenuItem.field_fromUser = r.Yz();
          Object localObject1 = new java/util/LinkedList;
          ((LinkedList)localObject1).<init>();
          Object localObject2 = new com/tencent/mm/protocal/protobuf/aar;
          ((aar)localObject2).<init>();
          Object localObject3 = new com/tencent/mm/protocal/protobuf/aas;
          ((aas)localObject3).<init>();
          ((aas)localObject3).a(paramMenuItem.field_favProto.why);
          ((aar)localObject2).a((aas)localObject3);
          ((aar)localObject2).ale("WeNote_0");
          ((aar)localObject2).LE(6);
          ((LinkedList)localObject1).add(0, localObject2);
          paramMenuItem.field_favProto.aE((LinkedList)localObject1);
          paramMenuItem.field_type = 18;
          paramMenuItem.field_xml = com.tencent.mm.plugin.fav.a.g.s(paramMenuItem);
          localObject3 = new com/tencent/mm/protocal/protobuf/abh;
          ((abh)localObject3).<init>();
          localObject1 = this.nRu.activity;
          localObject2 = new com/tencent/mm/g/a/ld;
          ((ld)localObject2).<init>();
          ((ld)localObject2).cGU.field_localId = paramMenuItem.field_localId;
          ((ld)localObject2).cGU.cHa = 5;
          ((ld)localObject2).cGU.cGW = paramMenuItem.field_xml;
          ((ld)localObject2).cGU.context = ((Context)localObject1);
          Bundle localBundle = new android/os/Bundle;
          localBundle.<init>();
          localObject1 = paramMenuItem.field_favProto.vzK;
          if (localObject1 != null)
          {
            localBundle.putString("noteauthor", ((aaz)localObject1).wim);
            localBundle.putString("noteeditor", ((aaz)localObject1).win);
          }
          localBundle.putLong("edittime", paramMenuItem.field_updateTime);
          ((ld)localObject2).cGU.cGZ = localBundle;
          ((ld)localObject2).cGU.field_favProto = paramMenuItem.field_favProto;
          ((ld)localObject2).cGU.type = 2;
          ((ld)localObject2).cGU.cHc = true;
          ((ld)localObject2).cGU.cHd = ((abh)localObject3);
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
          this.nRu.activity.finish();
          AppMethodBeat.o(113740);
        }
        catch (Throwable paramMenuItem)
        {
          Toast.makeText(this.nRu.activity, 2131299725, 0).show();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.i.2
 * JD-Core Version:    0.6.2
 */
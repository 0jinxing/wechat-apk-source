package com.tencent.mm.ui.chatting.viewitems;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class al$b$2
  implements n.d
{
  al$b$2(al.b paramb, al.f paramf, Context paramContext)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(33305);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(33305);
      while (true)
      {
        return;
        ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(al.b.a(this.zgP), al.b.a(this.zgP)));
        if (this.zgL.zgV != null)
        {
          this.zgL.zgV.dLM();
          this.zgL.zgV.zWC = true;
          this.zgL.zgV.zWD = true;
          this.zgL.zgV.dLL();
        }
        Toast.makeText(this.val$context, 2131296876, 0).show();
        AppMethodBeat.o(33305);
        continue;
        if (this.zgL.zgV == null)
          break;
        this.zgL.zgV.zWC = true;
        this.zgL.zgV.dLL();
        this.zgL.zgV.hH(0, this.zgL.zgQ.dPr().length());
        this.zgL.zgV.dLO();
        this.zgL.zgV.dLR();
        AppMethodBeat.o(33305);
        continue;
        paramMenuItem = new Intent(this.val$context, MsgRetransmitUI.class);
        paramMenuItem.putExtra("Retr_Msg_content", al.b.a(this.zgP));
        paramMenuItem.putExtra("Retr_Msg_Type", 4);
        this.val$context.startActivity(paramMenuItem);
        AppMethodBeat.o(33305);
      }
      cl localcl = new cl();
      e.b(localcl, al.b.a(this.zgP).toString(), 1);
      localcl.cvA.fragment = al.b.b(this.zgP).yTx;
      localcl.cvA.cvH = 43;
      if (localcl.cvA.cvC != null)
      {
        paramMenuItem = localcl.cvA.cvC.wit;
        if (paramMenuItem != null)
        {
          ay localay = (ay)this.zgL.zgQ.getTag();
          if (localay != null)
          {
            paramMenuItem.alD(r.Yz());
            paramMenuItem.alE(localay.cKd.field_talker);
            com.tencent.mm.sdk.b.a.xxA.m(localcl);
          }
        }
      }
      if (this.zgL.zgV != null)
      {
        this.zgL.zgV.dLM();
        this.zgL.zgV.zWC = true;
        this.zgL.zgV.zWD = true;
        this.zgL.zgV.dLL();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.b.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.chatting.viewitems;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class al$a$3
  implements n.d
{
  al$a$3(al.a parama, al.f paramf, Context paramContext)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(33289);
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
      AppMethodBeat.o(33289);
      while (true)
      {
        return;
        ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(al.a.a(this.zgM), al.a.a(this.zgM)));
        if (this.zgL.zgV != null)
        {
          this.zgL.zgV.dLM();
          this.zgL.zgV.zWC = true;
          this.zgL.zgV.zWD = true;
          this.zgL.zgV.dLL();
        }
        Toast.makeText(this.val$context, 2131296876, 0).show();
        AppMethodBeat.o(33289);
        continue;
        if (this.zgL.zgV == null)
          break;
        this.zgL.zgV.zWC = true;
        this.zgL.zgV.dLL();
        this.zgL.zgV.hH(0, this.zgL.zgQ.dPr().length());
        this.zgL.zgV.dLO();
        this.zgL.zgV.dLR();
        AppMethodBeat.o(33289);
        continue;
        paramMenuItem = (ay)this.zgL.zgQ.getTag();
        if (paramMenuItem == null)
          break;
        paramMenuItem = bh.s(paramMenuItem.cKd);
        if (bo.isNullOrNil(paramMenuItem))
        {
          paramMenuItem = new Intent(this.val$context, MsgRetransmitUI.class);
          paramMenuItem.putExtra("Retr_Msg_content", al.a.a(this.zgM));
          paramMenuItem.putExtra("Retr_Msg_Type", 4);
          this.val$context.startActivity(paramMenuItem);
          AppMethodBeat.o(33289);
        }
        else
        {
          h.a(this.val$context, 2131305954, 2131305955, 2131297078, 2131305857, true, new al.a.3.1(this, paramMenuItem), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(33288);
              paramAnonymousDialogInterface = new Intent(al.a.3.this.val$context, MsgRetransmitUI.class);
              paramAnonymousDialogInterface.putExtra("Retr_Msg_content", al.a.a(al.a.3.this.zgM));
              paramAnonymousDialogInterface.putExtra("Retr_Msg_Type", 4);
              al.a.3.this.val$context.startActivity(paramAnonymousDialogInterface);
              AppMethodBeat.o(33288);
            }
          });
          AppMethodBeat.o(33289);
        }
      }
      cl localcl = new cl();
      e.b(localcl, al.a.a(this.zgM).toString(), 1);
      localcl.cvA.fragment = al.a.b(this.zgM).yTx;
      localcl.cvA.cvH = 43;
      if (localcl.cvA.cvC != null)
      {
        abl localabl = localcl.cvA.cvC.wit;
        if (localabl != null)
        {
          paramMenuItem = (ay)this.zgL.zgQ.getTag();
          if (paramMenuItem != null)
          {
            localabl.alD(paramMenuItem.cKd.field_talker);
            localabl.alE(r.Yz());
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.a.3
 * JD-Core Version:    0.6.2
 */
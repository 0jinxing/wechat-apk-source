package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.k;
import com.tencent.mm.plugin.wenote.model.nativenote.b.b;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.vfs.e;

public final class c
  implements com.tencent.mm.plugin.wenote.model.b.a, b
{
  View gLe;
  String uNM;
  ImageButton uTK;
  LinearLayout uTL;
  ImageButton uTM;
  ImageButton uTN;
  ImageButton uTO;
  ImageButton uTP;
  LinearLayout uTQ;
  LinearLayout uTR;
  LinearLayout uTS;
  LinearLayout uTT;
  LinearLayout uTU;
  public boolean uTV;
  c uTW;
  boolean uTX;
  boolean uTY;
  boolean uTZ;
  boolean uUa;

  public c()
  {
    AppMethodBeat.i(27128);
    this.uTV = false;
    this.uNM = "";
    this.uTX = false;
    this.uTY = false;
    this.uTZ = false;
    this.uUa = false;
    this.uTW = this;
    AppMethodBeat.o(27128);
  }

  public final void a(com.tencent.mm.plugin.wenote.model.nativenote.b.a parama)
  {
    AppMethodBeat.i(27131);
    this.uTP.setImageResource(2130840813);
    if (!this.uTV)
      AppMethodBeat.o(27131);
    while (true)
    {
      return;
      this.uTV = false;
      k.ddK().ddL();
      String str = k.ddK().ddM();
      int i = (int)k.ddK().duration;
      int j = (int)com.tencent.mm.bk.a.fY(i);
      int k = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().der();
      com.tencent.mm.plugin.wenote.model.a.c localc = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(k);
      if (!e.ct(str))
      {
        ab.e("MicroMsg.WNNoteFootPannel", "voicePath not exist, remove data from datalist and ui");
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().au(k, false);
        if (parama != null)
          parama.JZ(k);
        parama = new i();
        parama.content = "";
        parama.uNT = true;
        parama.uNZ = false;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(k, parama);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().gG(k - 1, k + 1);
        AppMethodBeat.o(27131);
      }
      else
      {
        if ((k != -1) && (localc != null) && (localc.getType() == 4))
        {
          ((l)localc).uOh = Boolean.FALSE;
          ((l)localc).type = 4;
          ((l)localc).uOp = true;
          ((l)localc).uOD = "";
          ((l)localc).length = j;
          ((l)localc).uOC = com.tencent.mm.bk.a.B(ah.getContext(), j).toString();
          ((l)localc).hNN = (an.bvi() + "/fav_fileicon_recording.png");
          ((l)localc).cHg = str;
          ((l)localc).cAP = i;
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Kg(k);
        }
        AppMethodBeat.o(27131);
      }
    }
  }

  public final void ddS()
  {
    AppMethodBeat.i(27130);
    a(null);
    AppMethodBeat.o(27130);
  }

  public final void ddT()
  {
    AppMethodBeat.i(27129);
    com.tencent.mm.ui.base.h.a(this.uTP.getContext(), this.uTP.getContext().getString(2131301752), "", true, new c.3(this), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    });
    AppMethodBeat.o(27129);
  }

  public final void ok(boolean paramBoolean)
  {
    AppMethodBeat.i(27132);
    this.uTX = paramBoolean;
    this.uTQ.setPressed(paramBoolean);
    AppMethodBeat.o(27132);
  }

  public final void ol(boolean paramBoolean)
  {
    AppMethodBeat.i(27133);
    this.uTY = paramBoolean;
    this.uTR.setPressed(paramBoolean);
    AppMethodBeat.o(27133);
  }

  public final void om(boolean paramBoolean)
  {
    AppMethodBeat.i(27134);
    this.uTZ = paramBoolean;
    this.uTS.setPressed(paramBoolean);
    AppMethodBeat.o(27134);
  }

  public final void on(boolean paramBoolean)
  {
    AppMethodBeat.i(27135);
    this.uUa = paramBoolean;
    this.uTU.setPressed(paramBoolean);
    AppMethodBeat.o(27135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.c
 * JD-Core Version:    0.6.2
 */
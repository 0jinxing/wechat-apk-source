package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.g.a.uh;
import com.tencent.mm.g.a.uh.a;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.ui.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.s.e;

public final class ar$h extends s.e
{
  public ar$h(com.tencent.mm.ui.chatting.d.a parama)
  {
    super(parama);
  }

  private void a(ay paramay)
  {
    AppMethodBeat.i(33426);
    paramay.cKd.setStatus(6);
    aw.ZK();
    c.XO().a(paramay.cKd.field_msgId, paramay.cKd);
    ((o)this.yJI.aF(o.class)).dEb();
    Object localObject = new ui();
    ((ui)localObject).cQx.cAd = 5;
    ((ui)localObject).cQx.talker = paramay.cKd.field_talker;
    ((ui)localObject).cQx.context = this.yJI.yTx.getContext();
    ((ui)localObject).cQx.cQs = 2;
    com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
    localObject = com.tencent.mm.plugin.report.service.h.pYm;
    if ((paramay.cKd.dqJ == null) || (paramay.cKd.dqJ.length() <= 0));
    for (int i = 1; ; i = 3)
    {
      ((com.tencent.mm.plugin.report.service.h)localObject).e(11033, new Object[] { Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(i) });
      AppMethodBeat.o(33426);
      return;
    }
  }

  public final void a(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33425);
    paramView = (ay)paramView.getTag();
    String str = parambi.field_content;
    parama = new ui();
    parama.cQx.cAd = 1;
    parama.cQx.content = str;
    com.tencent.mm.sdk.b.a.xxA.m(parama);
    if (parama.cQy.type == 2)
    {
      i = 1;
      if ((i == 0) && (!parambi.field_content.equals(bi.xZc)))
        break label372;
      if (com.tencent.mm.r.a.bH(this.yJI.yTx.getContext()))
        break label364;
      parama = new uh();
      com.tencent.mm.sdk.b.a.xxA.m(parama);
      if ((paramView.cKd.field_talker.equals(parama.cQt.talker)) || ((!parama.cQt.cQv) && (!parama.cQt.cQw)))
        break label215;
      if (!parama.cQt.cQu)
        break label208;
      i = 2131297782;
      label170: Toast.makeText(this.yJI.yTx.getContext(), i, 0).show();
      ab.i("MicroMsg.VoipClickListener", "voip is running, can't do this");
      AppMethodBeat.o(33425);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label208: i = 2131297783;
      break label170;
      label215: parama = new sz();
      parama.cPf.cPh = true;
      com.tencent.mm.sdk.b.a.xxA.m(parama);
      parama = parama.cPg.cPj;
      if (!ah.isNullOrNil(parama))
      {
        ab.v("MicroMsg.VoipClickListener", "Talkroom is on: ".concat(String.valueOf(parama)));
        com.tencent.mm.ui.base.h.d(this.yJI.yTx.getContext(), this.yJI.yTx.getContext().getString(2131303996), "", this.yJI.yTx.getContext().getString(2131296994), this.yJI.yTx.getContext().getString(2131296868), new ar.h.1(this, paramView), new ar.h.2(this));
        AppMethodBeat.o(33425);
      }
      else
      {
        a(paramView);
        label364: AppMethodBeat.o(33425);
      }
    }
    label372: str = parambi.field_content;
    parama = new ui();
    parama.cQx.cAd = 1;
    parama.cQx.content = str;
    com.tencent.mm.sdk.b.a.xxA.m(parama);
    if (parama.cQy.type == 3)
    {
      i = 1;
      label425: if (((i == 0) && (!parambi.field_content.equals(bi.xZb))) || (com.tencent.mm.r.a.bH(this.yJI.yTx.getContext())))
        break label751;
      parama = new uh();
      com.tencent.mm.sdk.b.a.xxA.m(parama);
      if ((paramView.cKd.field_talker.equals(parama.cQt.talker)) || ((!parama.cQt.cQv) && (!parama.cQt.cQw)))
        break label576;
      if (!parama.cQt.cQu)
        break label569;
    }
    label569: for (int i = 2131297782; ; i = 2131297783)
    {
      Toast.makeText(this.yJI.yTx.getContext(), i, 0).show();
      ab.i("MicroMsg.VoipClickListener", "voip is running, can't do this");
      AppMethodBeat.o(33425);
      break;
      i = 0;
      break label425;
    }
    label576: paramView.cKd.setStatus(6);
    aw.ZK();
    c.XO().a(paramView.cKd.field_msgId, paramView.cKd);
    ((o)this.yJI.aF(o.class)).dEb();
    parama = new ui();
    parama.cQx.cAd = 5;
    parama.cQx.talker = paramView.cKd.field_talker;
    parama.cQx.context = this.yJI.yTx.getContext();
    parama.cQx.cQs = 4;
    com.tencent.mm.sdk.b.a.xxA.m(parama);
    parama = com.tencent.mm.plugin.report.service.h.pYm;
    if ((paramView.cKd.dqJ == null) || (paramView.cKd.dqJ.length() <= 0));
    for (i = 1; ; i = 3)
    {
      parama.e(11033, new Object[] { Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(i) });
      label751: AppMethodBeat.o(33425);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ar.h
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.i;
import com.tencent.mm.af.j.b;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.vb;
import com.tencent.mm.g.a.vb.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;

public final class o$b extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;

  private static void a(o.a parama)
  {
    AppMethodBeat.i(32989);
    int i = parama.jPL.getPaddingLeft();
    int j = parama.jPL.getPaddingTop();
    int k = parama.jPL.getPaddingRight();
    int m = parama.jPL.getPaddingBottom();
    parama.jPL.setBackgroundResource(2130838019);
    parama.jPL.setPadding(i, j, k, m);
    AppMethodBeat.o(32989);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32987);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969056);
      ((View)localObject).setTag(new o.a().eZ((View)localObject));
    }
    AppMethodBeat.o(32987);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32988);
    this.yJI = parama1;
    o.a locala = (o.a)parama;
    parama = parambi.field_content;
    if (parama != null);
    for (paramString = j.b.X(parama, parambi.field_reserved); ; paramString = null)
    {
      int i;
      if (paramString != null)
      {
        o.a.an(locala.jPL, locala.zcJ);
        locala.jPL.setBackgroundResource(2130838014);
        locala.jPL.setPadding(com.tencent.mm.bz.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ah.getContext(), 13), 0, parama1.yTx.getContext().getResources().getDimensionPixelOffset(2131428202), 0);
        locala.zec.setSingleLine(true);
        parama = new vb();
        parama.cRW.cEa = paramString.fhy;
        com.tencent.mm.sdk.b.a.xxA.m(parama);
        if (parama.cRX.cRY)
          break label362;
        i = 1;
        if (parama.cRX.status == -2)
          i = 0;
        int j = parama.cRX.status;
        int k = j;
        if (j <= 0)
          k = paramString.fhv;
        switch (k)
        {
        case 2:
        default:
          locala.zeb.setImageResource(2131231040);
          locala.zec.setSingleLine(false);
          locala.zec.setMaxLines(2);
          locala.zed.setText(null);
          locala.zec.setText(paramString.description);
        case 1:
        case 7:
        case 3:
        case 4:
        case 5:
        case 6:
        }
      }
      while (true)
      {
        locala.jPL.setOnClickListener(d(parama1));
        locala.jPL.setOnLongClickListener(c(parama1));
        locala.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
        parama = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
        locala.jPL.setTag(parama);
        AppMethodBeat.o(32988);
        return;
        label362: i = 0;
        break;
        parama = (i)paramString.X(i.class);
        if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString.fiF))
        {
          if (bo.gW(parama.fgg, 1))
            locala.zec.setText(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298131) + com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298132));
          while (true)
          {
            locala.zed.setText(paramString.fhw);
            locala.zeb.setImageResource(2131231040);
            break;
            locala.zec.setText(2131298131);
          }
        }
        if (bo.gW(parama.fgg, 1))
          if (paramString.fiF.length() > 5)
            parama = paramString.fiF.substring(0, 5) + "..." + com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298132);
        label548: for (parama = j.b(parama1.yTx.getContext(), parama); ; parama = j.b(parama1.yTx.getContext(), paramString.fiF))
        {
          locala.zec.setText(parama);
          break;
          parama = paramString.fiF + parama1.yTx.getContext().getString(2131298132);
          break label548;
        }
        if (i != 0)
          if (bo.gW(((i)paramString.X(i.class)).fgg, 1))
            if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString.fiF))
            {
              parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298121) + com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298132);
              label700: locala.zec.setText(j.b(parama1.yTx.getContext(), parama));
            }
        while (true)
        {
          locala.zed.setText(paramString.fhw);
          locala.zeb.setImageResource(2131231041);
          a(locala);
          break;
          String str = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298121) + "-" + paramString.fiF;
          parama = str;
          if (str.length() <= 5)
            break label700;
          parama = str.substring(0, 5) + "..." + com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298132);
          break label700;
          if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString.fiF))
          {
            parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298121);
            break label700;
          }
          parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298121) + "-" + paramString.fiF;
          break label700;
          locala.zec.setText(2131298122);
        }
        locala.zed.setText(paramString.fhw);
        locala.zeb.setImageResource(2131231042);
        if (i != 0)
          if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString.fiF))
          {
            parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298134);
            label971: locala.zec.setText(j.b(parama1.yTx.getContext(), parama));
          }
        while (true)
        {
          a(locala);
          break;
          parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298134) + "-" + paramString.fiF;
          break label971;
          locala.zec.setText(2131298133);
        }
        locala.zed.setText(paramString.fhw);
        locala.zeb.setImageResource(2131231041);
        if (i != 0)
          if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString.fiF))
          {
            parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298128);
            label1102: locala.zec.setText(j.b(parama1.yTx.getContext(), parama));
          }
        while (true)
        {
          a(locala);
          break;
          parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298128) + "-" + paramString.fiF;
          break label1102;
          locala.zec.setText(2131298129);
        }
        locala.zec.setText(2131298123);
        locala.zed.setText(paramString.fhw);
        locala.zeb.setImageResource(2131231039);
        a(locala);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32990);
    int i = ((ay)paramView.getTag()).position;
    if (parambi != null)
      paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
    AppMethodBeat.o(32990);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32991);
    paramMenuItem.getItemId();
    AppMethodBeat.o(32991);
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 419430449));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(32992);
    Object localObject = parambi.field_content;
    paramView = null;
    if (localObject != null)
      paramView = j.b.X((String)localObject, parambi.field_reserved);
    if (paramView != null)
    {
      localObject = new Intent();
      ((Intent)localObject).putExtra("sender_name", parambi.field_talker);
      switch (paramView.fhv)
      {
      case 2:
      default:
        ab.w("MicroMsg.ChattingItemAppMsgRemittanceFrom", "Unrecognized type %d, probably version to low & check update!", new Object[] { Integer.valueOf(paramView.fhv) });
        com.tencent.mm.platformtools.ah.cw(parama.yTx.getContext());
        AppMethodBeat.o(32992);
      case 1:
      case 7:
      case 3:
      case 4:
      case 5:
      case 6:
      }
    }
    while (true)
    {
      return bool;
      ((Intent)localObject).putExtra("invalid_time", paramView.fhz);
      ((Intent)localObject).putExtra("is_sender", false);
      ((Intent)localObject).putExtra("appmsg_type", paramView.fhv);
      ((Intent)localObject).putExtra("transfer_id", paramView.fhy);
      ((Intent)localObject).putExtra("transaction_id", paramView.fhx);
      ((Intent)localObject).putExtra("effective_date", paramView.fhA);
      ((Intent)localObject).putExtra("total_fee", paramView.cKu);
      ((Intent)localObject).putExtra("fee_type", paramView.cuZ);
      if (r.YM())
      {
        d.a(parama.yTx, "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", (Intent)localObject, 221);
        break;
      }
      d.a(parama.yTx, "remittance", ".ui.RemittanceDetailUI", (Intent)localObject, 221);
      break;
      ((Intent)localObject).putExtra("is_sender", true);
      ((Intent)localObject).putExtra("appmsg_type", paramView.fhv);
      ((Intent)localObject).putExtra("transfer_id", paramView.fhy);
      ((Intent)localObject).putExtra("transaction_id", paramView.fhx);
      ((Intent)localObject).putExtra("effective_date", paramView.fhA);
      ((Intent)localObject).putExtra("total_fee", paramView.cKu);
      ((Intent)localObject).putExtra("fee_type", paramView.cuZ);
      if (r.YM())
      {
        d.b(parama.yTx.getContext(), "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", (Intent)localObject);
        break;
      }
      d.b(parama.yTx.getContext(), "remittance", ".ui.RemittanceDetailUI", (Intent)localObject);
      break;
      AppMethodBeat.o(32992);
      bool = false;
    }
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.o.b
 * JD-Core Version:    0.6.2
 */
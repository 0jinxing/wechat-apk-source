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
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;

public final class o$c extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;

  private static void a(o.a parama)
  {
    AppMethodBeat.i(32996);
    int i = parama.jPL.getPaddingLeft();
    int j = parama.jPL.getPaddingTop();
    int k = parama.jPL.getPaddingRight();
    int m = parama.jPL.getPaddingBottom();
    parama.jPL.setBackgroundResource(2130838025);
    parama.jPL.setPadding(i, j, k, m);
    AppMethodBeat.o(32996);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32994);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969093);
      ((View)localObject).setTag(new o.a().eZ((View)localObject));
    }
    AppMethodBeat.o(32994);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32995);
    this.yJI = parama1;
    o.a locala = (o.a)parama;
    parama = parambi.field_content;
    if (parama != null);
    label392: label905: for (paramString = j.b.X(parama, parambi.field_reserved); ; paramString = null)
    {
      boolean bool;
      int j;
      if (paramString != null)
      {
        o.a.an(locala.jPL, locala.zcJ);
        locala.jPL.setBackgroundResource(2130838020);
        locala.jPL.setPadding(parama1.yTx.getContext().getResources().getDimensionPixelSize(2131427796), 0, com.tencent.mm.bz.a.fromDPToPix(parama1.yTx.getContext(), 13), 0);
        locala.zec.setSingleLine(true);
        parama = new vb();
        parama.cRW.cEa = paramString.fhy;
        com.tencent.mm.sdk.b.a.xxA.m(parama);
        bool = parama.cRX.cRY;
        if (parama.cRX.status == -2)
          bool = false;
        int i = parama.cRX.status;
        j = i;
        if (i <= 0)
          j = paramString.fhv;
      }
      Object localObject;
      switch (j)
      {
      case 2:
      default:
        locala.zeb.setImageResource(2131231040);
        locala.zec.setSingleLine(false);
        locala.zec.setMaxLines(2);
        locala.zed.setText(null);
        locala.zec.setText(paramString.description);
        locala.jPL.setOnClickListener(d(parama1));
        locala.jPL.setOnLongClickListener(c(parama1));
        locala.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
        parama = new ay(parambi, this.yJI.dFx(), paramInt, null, '\000');
        locala.jPL.setTag(parama);
        AppMethodBeat.o(32995);
        return;
      case 1:
      case 7:
        aw.ZK();
        parama = com.tencent.mm.model.c.XM().aoN(parambi.field_talker);
        if (parama != null)
        {
          parama = parama.Oj();
          if (!com.tencent.mm.platformtools.ah.isNullOrNil(paramString.fiF))
            break label626;
          localObject = parama1.yTx.getMMResources().getString(2131298130, new Object[] { com.tencent.mm.platformtools.ah.nullAsNil(parama) });
          locala.zec.setText(j.b(parama1.yTx.getContext(), (CharSequence)localObject, locala.zec.getTextSize()));
          label457: localObject = (i)paramString.X(i.class);
          if (!com.tencent.mm.platformtools.ah.isNullOrNil(paramString.fiF))
            break label686;
          parama = parama1.yTx.getMMResources().getString(2131298130, new Object[] { com.tencent.mm.platformtools.ah.nullAsNil(parama) });
          if (!bo.gW(((i)localObject).fgg, 1))
            break label1431;
          if (parama.length() <= 5)
            break label656;
          parama = parama.substring(0, 5) + "..." + com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298132);
        }
        break;
      case 3:
      case 4:
      case 5:
      case 6:
      }
      label656: label1431: 
      while (true)
      {
        locala.zec.setText(j.b(parama1.yTx.getContext(), parama, locala.zec.getTextSize()));
        locala.zed.setText(paramString.fhw);
        locala.zeb.setImageResource(2131231040);
        break;
        parama = parambi.field_talker;
        break label392;
        label626: localObject = j.b(parama1.yTx.getContext(), paramString.fiF);
        locala.zec.setText((CharSequence)localObject);
        break label457;
        parama = parama + com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298132);
        continue;
        label686: if (bo.gW(((i)localObject).fgg, 1))
          if (paramString.fiF.length() > 5)
            parama = paramString.fiF.substring(0, 5) + "..." + com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298132);
        label752: for (parama = j.b(parama1.yTx.getContext(), parama); ; parama = j.b(parama1.yTx.getContext(), paramString.fiF))
        {
          locala.zec.setText(parama);
          break;
          parama = paramString.fiF + parama1.yTx.getContext().getString(2131298132);
          break label752;
        }
        if (bool)
          if (bo.gW(((i)paramString.X(i.class)).fgg, 1))
            if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString.fiF))
            {
              parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298121) + com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298132);
              locala.zec.setText(j.b(parama1.yTx.getContext(), parama));
            }
        while (true)
        {
          locala.zed.setText(paramString.fhw);
          locala.zeb.setImageResource(2131231041);
          a(locala);
          break;
          localObject = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298121) + "-" + paramString.fiF;
          parama = (c.a)localObject;
          if (((String)localObject).length() <= 5)
            break label905;
          parama = ((String)localObject).substring(0, 5) + "..." + com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298132);
          break label905;
          if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString.fiF))
          {
            parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298121);
            break label905;
          }
          parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298121) + "-" + paramString.fiF;
          break label905;
          locala.zec.setText(2131298122);
        }
        locala.zed.setText(paramString.fhw);
        locala.zeb.setImageResource(2131231042);
        if (bool)
          if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString.fiF))
          {
            parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298134);
            label1176: locala.zec.setText(j.b(parama1.yTx.getContext(), parama));
          }
        while (true)
        {
          a(locala);
          break;
          parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298134) + "-" + paramString.fiF;
          break label1176;
          locala.zec.setText(2131298133);
        }
        if (bool)
          if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString.fiF))
          {
            parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298128);
            locala.zec.setText(j.b(parama1.yTx.getContext(), parama));
          }
        while (true)
        {
          locala.zed.setText(paramString.fhw);
          locala.zeb.setImageResource(2131231041);
          a(locala);
          break;
          parama = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131298128) + "-" + paramString.fiF;
          break label1283;
          locala.zec.setText(2131298129);
        }
        locala.zec.setText(2131298123);
        locala.zed.setText(paramString.fhw);
        locala.zeb.setImageResource(2131231039);
        a(locala);
        break;
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32997);
    int i = ((ay)paramView.getTag()).position;
    String str = parambi.field_content;
    paramView = null;
    if (str != null)
      paramView = j.b.X(str, parambi.field_reserved);
    if (paramView != null)
      paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
    AppMethodBeat.o(32997);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 419430449));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(32998);
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
        ab.w("MicroMsg.ChattingItemAppMsgRemittanceTo", "Unrecognized type %d, probably version to low & check update!", new Object[] { Integer.valueOf(paramView.fhv) });
        com.tencent.mm.platformtools.ah.cw(parama.yTx.getContext());
        AppMethodBeat.o(32998);
        bool = true;
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
      ((Intent)localObject).putExtra("is_sender", true);
      ((Intent)localObject).putExtra("appmsg_type", paramView.fhv);
      ((Intent)localObject).putExtra("transfer_id", paramView.fhy);
      ((Intent)localObject).putExtra("transaction_id", paramView.fhx);
      ((Intent)localObject).putExtra("effective_date", paramView.fhA);
      ((Intent)localObject).putExtra("total_fee", paramView.cKu);
      ((Intent)localObject).putExtra("fee_type", paramView.cuZ);
      paramView = new o.c.1(this, parama);
      if (r.YM())
      {
        d.a(parama.yTv, "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", (Intent)localObject, 221, paramView);
        break;
      }
      d.a(parama.yTv, "remittance", ".ui.RemittanceDetailUI", (Intent)localObject, 221, paramView);
      break;
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
      AppMethodBeat.o(32998);
    }
  }

  public final boolean dHk()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.o.c
 * JD-Core Version:    0.6.2
 */
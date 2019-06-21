package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.e;
import com.tencent.mm.ui.chatting.s.n;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

public final class u$c extends c
  implements s.n
{
  private com.tencent.mm.ui.chatting.d.a yJI;
  private String zeJ;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33113);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969097);
      ((View)localObject).setTag(new u.a().z((View)localObject, false));
    }
    AppMethodBeat.o(33113);
    return localObject;
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33118);
    parambi.dtJ();
    aw.ZK();
    com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
    ((e)parama.aF(e.class)).bb(parambi);
    AppMethodBeat.o(33118);
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    int i = 1;
    AppMethodBeat.i(33114);
    this.yJI = parama1;
    u.a locala = (u.a)parama;
    aw.ZK();
    bi.a locala1 = com.tencent.mm.model.c.XO().Rn(parambi.field_content);
    if ((locala1.svN == null) || (locala1.svN.length() <= 0))
      ab.e("MicroMsg.ChattingItemCardTo", "getView : parse possible friend msg failed");
    this.zeJ = locala1.svN;
    ab.d("MicroMsg.ChattingItemCardTo", "dancy is biz: %s, userName: %s ", new Object[] { Boolean.valueOf(t.mZ(this.zeJ)), this.zeJ });
    u.a.an(locala.jPL, locala.zcJ);
    if (t.kv(locala1.ufB))
    {
      locala.zeH.setText(2131298074);
      locala.zeI.setVisibility(8);
      if (d.iW(16))
      {
        locala.zeG.setBackground(null);
        w(locala.zeG, this.zeJ);
        label177: locala.ejp.setText(j.b(parama1.yTx.getContext(), locala1.nickname, locala.ejp.getTextSize()));
        parama = locala1.dFl;
        if (!ah.isNullOrNil(this.zeJ))
        {
          aw.ZK();
          paramString = com.tencent.mm.model.c.XM().aoO(this.zeJ);
          if ((paramString != null) && (com.tencent.mm.n.a.jh(paramString.field_type)))
            break label688;
        }
      }
    }
    label646: label688: for (int j = 1; ; j = 0)
    {
      if ((j == 0) && (ah.isNullOrNil(parama)))
      {
        paramString = this.zeJ;
        j = i;
        parama = paramString;
        if (!ah.isNullOrNil(paramString))
        {
          j = i;
          parama = paramString;
          if (!ad.aoA(paramString))
          {
            if (!t.mX(paramString))
              break label603;
            parama = paramString;
            j = i;
          }
        }
      }
      while (true)
      {
        label324: boolean bool = t.kv(locala1.ufB);
        if ((j != 0) || (bool))
          parama = "";
        if (!ah.isNullOrNil(parama))
        {
          locala.zeI.setVisibility(0);
          locala.zeI.setText(parama);
          label373: u.a(parama1, this.zeJ, locala1, locala);
          locala.jPL.setTag(new ay(parambi, parama1.dFx(), paramInt, null, '\000'));
          locala.jPL.setOnClickListener(d(parama1));
          locala.jPL.setOnLongClickListener(c(parama1));
          locala.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
          if (!dHm())
            break label646;
          if (locala.pyf != null)
            locala.pyf.setVisibility(8);
          if ((parambi.field_status != 2) || (!a((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi.field_msgId)))
            break label625;
          if (locala.zci != null)
            locala.zci.setVisibility(0);
        }
        while (true)
        {
          a(paramInt, locala, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
          AppMethodBeat.o(33114);
          return;
          locala.zeG.setBackgroundDrawable(null);
          break;
          locala.zeH.setText(2131298191);
          locala.zeG.setBackgroundResource(2130838444);
          v(locala.zeG, this.zeJ);
          break label177;
          label603: j = 0;
          parama = paramString;
          break label324;
          locala.zeI.setVisibility(8);
          break label373;
          label625: if (locala.zci != null)
          {
            locala.zci.setVisibility(8);
            continue;
            if (locala.pyf != null)
            {
              locala.pyf.setVisibility(0);
              if (parambi.field_status >= 2)
                locala.pyf.setVisibility(8);
            }
          }
        }
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33115);
    int i = ((ay)paramView.getTag()).position;
    aw.ZK();
    bi.a locala = com.tencent.mm.model.c.XO().Rn(parambi.field_content);
    if ((locala.svN == null) || (locala.svN.length() <= 0))
      ab.e("MicroMsg.ChattingItemCardTo", "getView : parse possible friend msg failed");
    this.zeJ = locala.svN;
    if (t.kv(locala.ufB))
      paramContextMenu.add(i, 118, 0, paramView.getContext().getString(2131302491));
    if ((!parambi.drC()) && ((parambi.field_status == 2) || (parambi.dJz == 1)) && (parambi.dtw()) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)))
      paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
    if (!this.yJI.dFy())
      paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298154));
    AppMethodBeat.o(33115);
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33116);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(33116);
    case 118:
    }
    while (true)
    {
      return false;
      paramMenuItem = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
      paramMenuItem.putExtra("Retr_Msg_content", bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend));
      paramMenuItem.putExtra("Retr_Msg_Type", 8);
      paramMenuItem.putExtra("Retr_Msg_Id", parambi.field_msgId);
      parama.startActivity(paramMenuItem);
      AppMethodBeat.o(33116);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && ((paramInt == 42) || (paramInt == 66)));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33117);
    paramView = (ay)paramView.getTag();
    String str1 = paramView.userName;
    String str2 = parambi.field_content;
    boolean bool1 = paramView.yFW;
    if (parambi.field_isSend == 0);
    for (boolean bool2 = true; ; bool2 = false)
    {
      u.a(parama, str1, str2, bool1, bool2, parambi);
      AppMethodBeat.o(33117);
      return true;
    }
  }

  public final boolean dHk()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.u.c
 * JD-Core Version:    0.6.2
 */
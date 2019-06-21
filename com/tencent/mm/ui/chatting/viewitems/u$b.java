package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import java.util.Map;

public final class u$b extends c
{
  private a yJI;
  private String zeJ;
  private String zeK;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33107);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969060);
      ((View)localObject).setTag(new u.a().z((View)localObject, true));
    }
    AppMethodBeat.o(33107);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33109);
    this.yJI = parama1;
    u.a locala = (u.a)parama;
    bi.a locala1;
    if (parama1.dFx())
    {
      parama = bf.oz(parambi.field_content);
      aw.ZK();
      locala1 = com.tencent.mm.model.c.XO().Rn(parama);
      if ((locala1.svN == null) || (locala1.svN.length() <= 0))
        ab.e("MicroMsg.ChattingItemCardFrom", "getView : parse possible friend msg failed");
      this.zeJ = locala1.svN;
      this.zeK = "";
      if (!ah.isNullOrNil(parama))
      {
        parama = br.z(parama, "msg");
        if (parama.containsKey(".msg.$wechatid"))
          this.zeK = ((String)parama.get(".msg.$wechatid"));
      }
      b.U(this.zeJ, locala1.xZh);
      u.a.an(locala.jPL, locala.zcJ);
      if (!t.kv(locala1.ufB))
        break label436;
      locala.zeH.setText(2131298074);
      locala.zeI.setVisibility(8);
      if (!d.iW(16))
        break label424;
      locala.zeG.setBackground(null);
      label202: w(locala.zeG, this.zeJ);
      label214: parama = this.zeK;
      if ((!ah.isNullOrNil(parama)) && (!ad.aoA(parama)) && (!t.mX(parama)))
        break label489;
    }
    label266: label424: label436: label476: label489: for (int i = 1; ; i = 0)
    {
      boolean bool = t.kv(locala1.ufB);
      if ((i != 0) || (bool))
      {
        parama = "";
        if (ah.isNullOrNil(parama))
          break label476;
        locala.zeI.setVisibility(0);
        locala.zeI.setText(parama);
      }
      while (true)
      {
        locala.ejp.setText(j.b(parama1.yTx.getContext(), locala1.nickname, (int)locala.ejp.getTextSize()));
        u.a(parama1, this.zeJ, locala1, locala);
        locala.jPL.setTag(new ay(parambi, parama1.dFx(), paramInt, paramString, '\000'));
        locala.jPL.setOnClickListener(d(parama1));
        locala.jPL.setOnLongClickListener(c(parama1));
        locala.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
        AppMethodBeat.o(33109);
        return;
        parama = parambi.field_content;
        break;
        locala.zeG.setBackgroundDrawable(null);
        break label202;
        locala.zeH.setText(2131298191);
        locala.zeG.setBackgroundResource(2130838444);
        v(locala.zeG, this.zeJ);
        break label214;
        break label266;
        locala.zeI.setVisibility(8);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33110);
    int i = ((ay)paramView.getTag()).position;
    aw.ZK();
    parambi = com.tencent.mm.model.c.XO().Rn(parambi.field_content);
    if ((parambi.svN == null) || (parambi.svN.length() <= 0))
      ab.e("MicroMsg.ChattingItemCardFrom", "getView : parse possible friend msg failed");
    this.zeJ = parambi.svN;
    if (t.kv(parambi.ufB))
      paramContextMenu.add(i, 118, 0, paramView.getContext().getString(2131302491));
    if (!this.yJI.dFy())
      paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298154));
    AppMethodBeat.o(33110);
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(33111);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(33111);
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
      AppMethodBeat.o(33111);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && ((paramInt == 42) || (paramInt == 66)));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(33112);
    paramView = (ay)paramView.getTag();
    String str1 = paramView.userName;
    String str2 = parambi.field_content;
    boolean bool1 = paramView.yFW;
    if (parambi.field_isSend == 0);
    for (boolean bool2 = true; ; bool2 = false)
    {
      u.a(parama, str1, str2, bool1, bool2, parambi);
      AppMethodBeat.o(33112);
      return true;
    }
  }

  protected final boolean b(a parama)
  {
    AppMethodBeat.i(33108);
    boolean bool = parama.dFx();
    AppMethodBeat.o(33108);
    return bool;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.u.b
 * JD-Core Version:    0.6.2
 */
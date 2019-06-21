package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.fts.a.a.d.a;
import com.tencent.mm.plugin.fts.ui.b.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.e.n;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.TextPreviewUI;
import com.tencent.mm.ui.chatting.ak;
import com.tencent.mm.ui.chatting.c.b.z;
import com.tencent.mm.ui.chatting.s.n;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.widget.MMNeat7extView;
import com.tencent.mm.ui.widget.textview.a.a;
import com.tencent.mm.ui.widget.textview.a.f;
import com.tencent.neattextview.textview.view.NeatTextView.b;

public class al$b extends c
  implements s.n, NeatTextView.b
{
  private static final int zgH = 2131820672;
  private static final int zgI = 2131820585;
  private static final int zgJ = 2131820584;
  private com.tencent.mm.ui.chatting.d.a yJI;
  private CharSequence yMu;
  private al.e zgK;

  private void aU(bi parambi)
  {
    AppMethodBeat.i(33312);
    if (!this.yJI.getTalkerUserName().equals("medianote"))
    {
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new com.tencent.mm.az.e(parambi.field_talker, parambi.field_msgSvrId));
    }
    ak.aU(parambi);
    this.yJI.qp(true);
    AppMethodBeat.o(33312);
  }

  private String bK(bi parambi)
  {
    AppMethodBeat.i(33313);
    if (parambi != null)
    {
      String str = com.tencent.mm.model.v.nW(parambi.field_msgSvrId);
      v.b localb = com.tencent.mm.model.v.Zp().y(str, true);
      localb.j("prePublishId", "msg_" + parambi.field_msgSvrId);
      localb.j("preUsername", b(this.yJI, parambi));
      localb.j("preChatName", c(this.yJI, parambi));
      AppMethodBeat.o(33313);
      parambi = str;
    }
    while (true)
    {
      return parambi;
      parambi = null;
      AppMethodBeat.o(33313);
    }
  }

  private al.e dHo()
  {
    AppMethodBeat.i(33309);
    if (this.zgK == null)
      this.zgK = new al.e(this.yJI);
    al.e locale = this.zgK;
    AppMethodBeat.o(33309);
    return locale;
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33310);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969084);
      ((View)localObject).setTag(new al.f().z((View)localObject, false));
    }
    AppMethodBeat.o(33310);
    return localObject;
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33316);
    parambi.dtJ();
    aw.ZK();
    com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
    if ((parambi.isText()) && (parambi.field_isSend == 1))
      aU(parambi);
    AppMethodBeat.o(33316);
  }

  public void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33311);
    this.yJI = parama1;
    al.f localf = (al.f)parama;
    localf.zgQ.setTag(zgI, Long.valueOf(parambi.field_msgId));
    localf.zgQ.setTag(zgJ, Boolean.TRUE);
    localf.zgQ.setMaxLines(2147483647);
    int i;
    label205: Object localObject;
    if (dHm())
    {
      if (localf.pyf != null)
        localf.pyf.setVisibility(8);
      if ((parambi.field_status == 1) || (parambi.field_status == 5))
      {
        if (localf.zci != null)
          localf.zci.setVisibility(8);
        localf.zgQ.setBackgroundResource(2130838321);
        parambi.xZd = true;
        paramString = parambi.field_content;
        if (bo.isNullOrNil(paramString))
          ab.e("MicroMsg.ChattingItemTextTo", "[carl] text to, content is null! why?? localid : %s, svrid : %s", new Object[] { Long.valueOf(parambi.field_msgId), Long.valueOf(parambi.field_msgSvrId) });
        if ((parambi.dqJ == null) || (!parambi.dtV()))
          break label1147;
        i = 1;
        if (i != 0)
          break label1174;
        parama = j.a(localf.zgQ.getContext(), paramString, (int)localf.zgQ.getTextSize(), 1, null, bK(parambi));
        paramString = (z)parama1.aF(z.class);
        if (!paramString.ng(parambi.field_msgId))
          break label1153;
        paramString = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, paramString.dEM(), d.a.mDL, b.b.mHt));
        localf.zgQ.a(paramString.mDR, TextView.BufferType.SPANNABLE);
        label306: parama = (n[])parama.getSpans(0, parama.length(), n.class);
        int j = parama.length;
        i = 0;
        label329: if (i < j)
        {
          if (parama[i].getType() != 44)
            break label1168;
          com.tencent.mm.plugin.report.service.h.pYm.e(12809, new Object[] { Integer.valueOf(6), "" });
        }
        parama = new ChattingItemTranslate.a(parambi, parama1.dFx(), paramInt);
        parama.zix = false;
        paramString = localf.zgQ.getContext();
        localf.zgQ.setTag(zgH, Boolean.TRUE);
        if (localf.yMt == null)
        {
          localf.yMt = new com.tencent.mm.ui.widget.b.a(paramString, localf.zgQ);
          localf.yMt.zSa = true;
          localf.yMt.zRZ = new al.b.1(this, paramString);
          localf.yMt.rBm = new al.b.2(this, localf, paramString);
        }
        if (localf.zgV != null)
          break label1306;
        paramString = c(parama1);
        localObject = a(c(parama1));
        localObject = new a.a(localf.zgQ, localf.yMt, (a.f)localObject, dHo(), localf.zgW);
        ((a.a)localObject).zWt = 2131690424;
        ((a.a)localObject).zWN = 18;
        ((a.a)localObject).zWu = 2131689912;
        localf.zgV = ((a.a)localObject).dLT();
        localf.zgX = new al.d(localf.zgV);
        localf.zgV.zWl = new al.b.3(this);
        localf.zbi = new al.b.4(this, localf);
        paramString.zbi = localf.zbi;
        label640: localf.zgV.zWJ = localf.zgX;
        localf.zgQ.setTag(parama);
        localf.zgQ.setOnDoubleClickListener(this);
        localf.zgQ.setTextListener(new al.b.5(this, localf));
        paramString = ChattingItemTranslate.b.zhg;
        if (!com.tencent.mm.app.plugin.c.Cj())
          break label1353;
        if ((!parambi.dtF()) || (!parambi.dtM()))
          break label1348;
        parama = parambi.field_transContent;
        label722: paramString = ((com.tencent.mm.ui.chatting.c.b.ah)parama1.aF(com.tencent.mm.ui.chatting.c.b.ah.class)).bl(parambi);
      }
    }
    while (true)
    {
      if ((!bo.isNullOrNil(parama)) || (paramString != ChattingItemTranslate.b.zhg))
      {
        if (localf.zgU == null)
        {
          localf.zgU = ((ChattingItemTranslate)localf.zgT.inflate());
          localf.zgU.init();
        }
        localObject = j.a(localf.zgQ.getContext(), parama, (int)localf.zgQ.getTextSize(), 1, null, bK(parambi));
        localf.zgU.a((CharSequence)localObject, paramString);
        localObject = localf.zgU;
        if (bo.isNullOrNil(parambi.field_transBrandWording))
        {
          paramString = parama1.yTx.getMMResources().getString(2131304047);
          label864: ((ChattingItemTranslate)localObject).setBrandWording(paramString);
          if (!bo.isNullOrNil(parama))
          {
            parama = new ChattingItemTranslate.a(parambi, parama1.dFx(), paramInt);
            parama.klY = 2;
            localf.zgU.setTag(parama);
            localf.zgU.setOnClickListener(dHo());
            localf.zgU.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
            localf.zgU.setOnDoubleClickListener(this);
            localf.zgU.setOnLongClickListener(c(parama1));
            localf.zgU.setVisibility(0);
          }
        }
      }
      while (true)
      {
        a(paramInt, localf, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
        AppMethodBeat.o(33311);
        return;
        localf.zgQ.setBackgroundResource(2130838320);
        if (localf.zci == null)
          break;
        if (a((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi.field_msgId))
        {
          if (parambi.xZd)
          {
            parama = new AlphaAnimation(0.5F, 1.0F);
            parama.setDuration(300L);
            localf.zgQ.startAnimation(parama);
            parambi.xZd = false;
          }
          localf.zci.setVisibility(0);
          break;
        }
        localf.zci.setVisibility(8);
        break;
        if (localf.pyf == null)
          break;
        parama = localf.pyf;
        if (parambi.field_status >= 2);
        for (i = 8; ; i = 0)
        {
          parama.setVisibility(i);
          break;
        }
        label1147: i = 0;
        break label205;
        label1153: localf.zgQ.a(parama, TextView.BufferType.SPANNABLE);
        break label306;
        label1168: i++;
        break label329;
        label1174: if (parambi.dqJ.contains("notify@all"));
        for (parama = ""; ; parama = localf.zgQ.getContext().getString(2131302586, new Object[] { "@" }) + "\n")
        {
          parama = j.a(localf.zgQ.getContext(), parama + paramString, (int)localf.zgQ.getTextSize(), 1, Integer.valueOf(31), bK(parambi));
          localf.zgQ.a(parama, TextView.BufferType.SPANNABLE);
          break;
        }
        label1306: localf.zgV.init();
        break label640;
        paramString = parambi.field_transBrandWording;
        break label864;
        if (localf.zgU != null)
          localf.zgU.setVisibility(8);
      }
      label1348: parama = null;
      break label722;
      label1353: parama = null;
    }
  }

  public boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(33314);
    int i;
    if ((parambi.dqJ != null) && (parambi.dqJ.contains("announcement@all")))
    {
      i = 1;
      if ((parambi.isText()) || (parambi.dtr()))
        break label61;
      AppMethodBeat.o(33314);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label61: ChattingItemTranslate.a locala = (ChattingItemTranslate.a)paramView.getTag();
      int j = locala.position;
      if (locala.klY == 1)
      {
        if (parambi.isText())
          paramContextMenu.add(j, 102, 0, paramView.getContext().getString(2131298151));
        paramContextMenu.add(j, 108, 0, paramView.getContext().getString(2131302491));
        if (parambi.field_status == 5)
          paramContextMenu.add(j, 103, 0, paramView.getContext().getString(2131298217));
        if (com.tencent.mm.bp.d.afj("favorite"))
          paramContextMenu.add(j, 116, 0, paramView.getContext().getString(2131301955));
        if (g.ad(this.yJI.yTx.getContext(), parambi.getType()))
          paramContextMenu.add(j, 129, 0, paramView.getContext().getString(2131298160));
        if ((i == 0) && (!parambi.drC()) && (parambi.isText()) && ((parambi.field_status == 2) || (parambi.dJz == 1)) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)) && (!ad.mg(this.yJI.getTalkerUserName())))
          paramContextMenu.add(j, 123, 0, paramView.getContext().getString(2131298166));
        if (com.tencent.mm.app.plugin.c.Cj())
        {
          if ((parambi.dtF()) && (parambi.dtM()))
            paramContextMenu.add(j, 124, 0, paramView.getContext().getString(2131298171));
        }
        else
        {
          if ((parambi.isText()) && (com.tencent.mm.aj.f.aex()))
            this.yJI.dFy();
          if (!this.yJI.dFy())
            paramContextMenu.add(j, 100, 0, paramView.getContext().getString(2131298154));
        }
      }
      while (locala.klY != 2)
        while (true)
        {
          AppMethodBeat.o(33314);
          break;
          paramContextMenu.add(j, 124, 0, paramView.getContext().getString(2131298173));
        }
      paramContextMenu.add(j, 141, 0, paramView.getContext().getString(2131298151));
      paramContextMenu.add(j, 142, 0, paramView.getContext().getString(2131302491));
      if (com.tencent.mm.bp.d.afj("favorite"))
        paramContextMenu.add(j, 143, 0, paramView.getContext().getString(2131301955));
      if ((com.tencent.mm.app.plugin.c.Ck()) && (parambi.dtP()))
        paramContextMenu.add(j, 125, 0, paramView.getContext().getString(2131298165));
      AppMethodBeat.o(33314);
      bool = false;
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(33315);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 141:
    case 142:
    case 143:
    case 102:
    case 108:
    case 103:
    case 124:
    }
    while (true)
    {
      AppMethodBeat.o(33315);
      while (true)
      {
        return bool;
        paramMenuItem = (android.text.ClipboardManager)com.tencent.mm.sdk.platformtools.ah.getContext().getSystemService("clipboard");
        parambi = parambi.field_transContent;
        if (!bo.isNullOrNil(parambi))
          paramMenuItem.setText(parambi);
        com.tencent.mm.ui.base.h.bQ(parama.yTx.getContext(), parama.yTx.getContext().getString(2131296876));
        AppMethodBeat.o(33315);
        bool = true;
        continue;
        paramMenuItem = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
        Object localObject1 = parambi.field_transContent;
        if (parambi.dtr())
        {
          paramMenuItem.putExtra("Retr_Msg_content", (String)localObject1);
          paramMenuItem.putExtra("Retr_Msg_Type", 6);
        }
        while (true)
        {
          parama.startActivity(paramMenuItem);
          AppMethodBeat.o(33315);
          bool = true;
          break;
          paramMenuItem.putExtra("Retr_Msg_content", (String)localObject1);
          paramMenuItem.putExtra("Retr_Msg_Type", 4);
        }
        localObject1 = new cl();
        com.tencent.mm.pluginsdk.model.e.b((cl)localObject1, parambi.field_transContent, 1);
        ((cl)localObject1).cvA.fragment = parama.yTx;
        ((cl)localObject1).cvA.cvH = 43;
        Object localObject2;
        if (((cl)localObject1).cvA.cvC != null)
        {
          localObject2 = ((cl)localObject1).cvA.cvC.wit;
          if (localObject2 != null)
          {
            ((abl)localObject2).alD(parambi.field_talker);
            ((abl)localObject2).alE(r.Yz());
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          }
          label348: localObject1 = (android.content.ClipboardManager)com.tencent.mm.sdk.platformtools.ah.getContext().getSystemService("clipboard");
          localObject2 = parambi.field_content;
          paramMenuItem = new StringBuilder("groupId = ").append(paramMenuItem.getGroupId()).append(", content length: ");
          if (localObject2 != null)
            break label514;
          ab.d("MicroMsg.ChattingItemTextTo", i);
          paramMenuItem = ((com.tencent.mm.ui.chatting.c.b.ah)parama.aF(com.tencent.mm.ui.chatting.c.b.ah.class)).bm(parambi);
        }
        try
        {
          ((android.content.ClipboardManager)localObject1).setText(paramMenuItem);
          com.tencent.mm.ui.base.h.bQ(parama.yTx.getContext(), parama.yTx.getContext().getString(2131296876));
          parama = com.tencent.mm.plugin.secinforeport.a.a.qjm;
          com.tencent.mm.plugin.secinforeport.a.a.h(1, parambi.field_msgSvrId, bo.ana(paramMenuItem));
          AppMethodBeat.o(33315);
          bool = true;
          continue;
          ab.e("MicroMsg.ChattingItemTextTo", "alvinluo transform text fav failed");
          break label348;
          label514: i = ((String)localObject2).length();
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.ChattingItemTextTo", "clip.setText error ");
        }
      }
      paramMenuItem = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
      String str = ((com.tencent.mm.ui.chatting.c.b.ah)parama.aF(com.tencent.mm.ui.chatting.c.b.ah.class)).bm(parambi);
      if (parambi.dtr())
      {
        paramMenuItem.putExtra("Retr_Msg_content", str);
        paramMenuItem.putExtra("Retr_Msg_Type", 6);
      }
      while (true)
      {
        parama.startActivity(paramMenuItem);
        break;
        paramMenuItem.putExtra("Retr_Msg_content", str);
        paramMenuItem.putExtra("Retr_Msg_Type", 4);
      }
      aU(parambi);
      continue;
      ((com.tencent.mm.ui.chatting.c.b.ah)parama.aF(com.tencent.mm.ui.chatting.c.b.ah.class)).b(paramMenuItem, parambi);
    }
  }

  public boolean aH(int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean)
    {
      paramBoolean = bool;
      if (paramInt != 1)
      {
        paramBoolean = bool;
        if (paramInt != 11)
        {
          paramBoolean = bool;
          if (paramInt != 21)
          {
            paramBoolean = bool;
            if (paramInt != 31)
            {
              paramBoolean = bool;
              if (paramInt != 36)
                if (paramInt != 301989937)
                  break label56;
            }
          }
        }
      }
    }
    label56: for (paramBoolean = bool; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    return false;
  }

  public final boolean dHk()
  {
    return true;
  }

  public final boolean fi(View paramView)
  {
    AppMethodBeat.i(33317);
    Object localObject = ((MMNeat7extView)paramView).dPr();
    Intent localIntent = new Intent(paramView.getContext(), TextPreviewUI.class);
    localIntent.addFlags(67108864);
    localIntent.putExtra("key_chat_text", (CharSequence)localObject);
    if ((paramView.getTag() instanceof ay))
    {
      localObject = (ay)paramView.getTag();
      if (localObject != null)
        localIntent.putExtra("Chat_Msg_Id", ((ay)localObject).cKd.field_msgId);
    }
    paramView.getContext().startActivity(localIntent);
    com.tencent.mm.ui.base.b.hL(paramView.getContext());
    AppMethodBeat.o(33317);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.b
 * JD-Core Version:    0.6.2
 */
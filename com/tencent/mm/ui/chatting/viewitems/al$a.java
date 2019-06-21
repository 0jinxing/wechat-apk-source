package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.r;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.fts.a.a.d.a;
import com.tencent.mm.plugin.fts.ui.b.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.e.n;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.TextPreviewUI;
import com.tencent.mm.ui.chatting.c.b.z;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.widget.MMNeat7extView;
import com.tencent.mm.ui.widget.MMTextView;
import com.tencent.mm.ui.widget.textview.a.a;
import com.tencent.mm.ui.widget.textview.a.f;
import com.tencent.neattextview.textview.view.NeatTextView.b;

public class al$a extends c
  implements NeatTextView.b
{
  private static final int zgH = 2131820672;
  private static final int zgI = 2131820585;
  private static final int zgJ = 2131820584;
  private com.tencent.mm.ui.chatting.d.a yJI;
  private CharSequence yMu;
  private al.e zgK;

  private String bK(bi parambi)
  {
    AppMethodBeat.i(33299);
    if (parambi != null)
    {
      String str = com.tencent.mm.model.v.nW(parambi.field_msgSvrId);
      v.b localb = com.tencent.mm.model.v.Zp().y(str, true);
      localb.j("prePublishId", "msg_" + parambi.field_msgSvrId);
      localb.j("preUsername", b(this.yJI, parambi));
      localb.j("preChatName", c(this.yJI, parambi));
      AppMethodBeat.o(33299);
      parambi = str;
    }
    while (true)
    {
      return parambi;
      parambi = null;
      AppMethodBeat.o(33299);
    }
  }

  private al.e dHo()
  {
    AppMethodBeat.i(33295);
    if (this.zgK == null)
      this.zgK = new al.e(this.yJI);
    al.e locale = this.zgK;
    AppMethodBeat.o(33295);
    return locale;
  }

  public View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33296);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969046);
      ((View)localObject).setTag(new al.f().z((View)localObject, true));
    }
    AppMethodBeat.o(33296);
    return localObject;
  }

  public void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33298);
    this.yJI = parama1;
    final al.f localf = (al.f)parama;
    Object localObject1 = parambi.field_content;
    paramString = parama1.getTalkerUserName();
    localf.zgQ.setTag(zgI, Long.valueOf(parambi.field_msgId));
    localf.zgQ.setTag(zgJ, Boolean.TRUE);
    Object localObject2 = ChattingItemTranslate.b.zhg;
    if (com.tencent.mm.app.plugin.c.Cj())
      if ((parambi.dtF()) && (parambi.dtM()))
      {
        parama = parambi.field_transContent;
        localObject2 = ((com.tencent.mm.ui.chatting.c.b.ah)parama1.aF(com.tencent.mm.ui.chatting.c.b.ah.class)).bl(parambi);
      }
    while (true)
    {
      int i;
      Object localObject3;
      if ((parama1.dFx()) && (!((com.tencent.mm.ui.chatting.c.b.d)parama1.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm()))
      {
        i = bf.ox((String)localObject1);
        if (i != -1)
        {
          localObject3 = ((String)localObject1).substring(0, i).trim();
          if ((localObject3 != null) && (((String)localObject3).length() > 0))
          {
            paramString = (String)localObject3;
            localObject1 = ((String)localObject1).substring(i + 1).trim();
            if (!bo.isNullOrNil(parama))
              parama = parama.substring(i + 1).trim();
          }
        }
      }
      while (true)
      {
        a(localf, parama1, parambi, paramString);
        a(localf, parama1, paramString, parambi);
        if ((parambi.dqJ != null) && (parambi.dtV()))
        {
          i = 1;
          if (i != 0)
            break label1231;
          paramString = j.a(localf.zgQ.getContext(), (CharSequence)localObject1, (int)localf.zgQ.getTextSize(), 1, null, bK(parambi));
          localObject1 = (z)parama1.aF(z.class);
          if (!((z)localObject1).ng(parambi.field_msgId))
            break label1209;
          localObject1 = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(paramString, ((z)localObject1).dEM(), d.a.mDL, b.b.mHs));
          localf.zgQ.a(((com.tencent.mm.plugin.fts.a.a.e)localObject1).mDR, TextView.BufferType.SPANNABLE);
          label357: paramString = (n[])paramString.getSpans(0, paramString.length(), n.class);
          int j = paramString.length;
          i = 0;
          label384: if (i < j)
          {
            if (paramString[i].getType() != 44)
              break label1225;
            com.tencent.mm.plugin.report.service.h.pYm.e(12809, new Object[] { Integer.valueOf(7), "" });
          }
          label431: paramString = new ChattingItemTranslate.a(parambi, parama1.dFx(), paramInt);
          localf.zgS.setOnClickListener(new al.a.1(this, localf));
          localObject1 = localf.zgQ.getContext();
          localf.zgQ.setTag(zgH, Boolean.TRUE);
          if (localf.yMt == null)
          {
            localf.yMt = new com.tencent.mm.ui.widget.b.a((Context)localObject1, localf.zgQ);
            localf.yMt.zSa = true;
            localf.yMt.zRZ = new View.OnCreateContextMenuListener()
            {
              public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
              {
                AppMethodBeat.i(33286);
                paramAnonymousContextMenu.clear();
                paramAnonymousContextMenu.add(0, 0, 0, this.val$context.getResources().getString(2131296875));
                paramAnonymousContextMenuInfo = localf.zgQ.dPr();
                paramAnonymousView = (ay)localf.zgQ.getTag();
                if (paramAnonymousView != null);
                for (int i = bh.t(paramAnonymousView.cKd); ; i = 0)
                {
                  if ((i <= 0) || (i >= paramAnonymousContextMenuInfo.length()))
                    paramAnonymousContextMenu.add(0, 1, 0, this.val$context.getResources().getString(2131301431));
                  paramAnonymousContextMenu.add(0, 2, 0, this.val$context.getResources().getString(2131301430));
                  paramAnonymousContextMenu.add(0, 3, 0, this.val$context.getResources().getString(2131299589));
                  AppMethodBeat.o(33286);
                  return;
                }
              }
            };
            localf.yMt.rBm = new al.a.3(this, localf, (Context)localObject1);
          }
          if (bh.o(parambi))
            break label1373;
          i = bh.t(parambi);
          if ((i > 0) && (i < com.tencent.mm.ui.widget.textview.b.fs(localf.zgQ).length()))
            break label1464;
          i = 0;
        }
        label781: label1464: 
        while (true)
        {
          localObject1 = c(parama1);
          localObject3 = a((c.c)localObject1);
          if (localf.zgV != null)
            localf.zgV.destroy();
          localObject3 = new a.a(localf.zgQ, localf.yMt, (a.f)localObject3, dHo(), localf.zgW);
          ((a.a)localObject3).zWt = 2131690424;
          ((a.a)localObject3).zWN = 18;
          ((a.a)localObject3).zWu = 2131689912;
          localf.zgV = ((a.a)localObject3).dLT();
          localf.zgX = new al.d(localf.zgV);
          localf.zgV.zWl = new al.a.4(this);
          localf.zbi = new al.a.5(this, localf);
          ((c.c)localObject1).zbi = localf.zbi;
          localf.zgV.zWy = i;
          localf.zgV.zWJ = localf.zgX;
          localf.zgQ.setOnDoubleClickListener(this);
          localf.zgQ.setTag(paramString);
          localf.zgQ.setTag(zgI, Long.valueOf(parambi.field_msgId));
          localf.zgQ.setTextListener(new al.a.6(this, localf));
          localf.zgS.setVisibility(8);
          localf.zgR.setVisibility(8);
          localf.zgQ.setMaxLines(2147483647);
          i = com.tencent.mm.m.g.Nu().getInt("InvalidateTextFoldLineNum", 5);
          if (bh.q(parambi))
          {
            paramString = localf.zgQ.QV(localf.zgQ.getContext().getResources().getDimensionPixelSize(2131428222));
            if ((paramString != null) && (paramString.dPe() > i))
            {
              localf.zgQ.setMaxLines(i);
              localf.zgS.setVisibility(0);
              localf.zgR.setVisibility(0);
            }
          }
          if ((!bo.isNullOrNil(parama)) || (localObject2 != ChattingItemTranslate.b.zhg))
          {
            if (localf.zgU == null)
            {
              localf.zgU = ((ChattingItemTranslate)localf.zgT.inflate());
              localf.zgU.init();
            }
            paramString = j.a(localf.zgQ.getContext(), parama, (int)localf.zgQ.getTextSize(), 1, null, bK(parambi));
            localf.zgU.a(paramString, (ChattingItemTranslate.b)localObject2);
            localObject2 = localf.zgU;
            if (bo.isNullOrNil(parambi.field_transBrandWording))
            {
              paramString = parama1.yTx.getMMResources().getString(2131304047);
              label1083: ((ChattingItemTranslate)localObject2).setBrandWording(paramString);
              if (!bo.isNullOrNil(parama))
              {
                parama = new ChattingItemTranslate.a(parambi, parama1.dFx(), paramInt);
                parama.zix = false;
                parama.klY = 2;
                localf.zgU.setTag(parama);
                localf.zgU.setOnClickListener(dHo());
                localf.zgU.setOnDoubleClickListener(this);
                localf.zgU.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
                localf.zgU.setOnLongClickListener(c(parama1));
                localf.zgU.setVisibility(0);
              }
              AppMethodBeat.o(33298);
            }
          }
          while (true)
          {
            return;
            i = 0;
            break;
            label1209: localf.zgQ.a(paramString, TextView.BufferType.SPANNABLE);
            break label357;
            label1225: i++;
            break label384;
            label1231: if (i == 0)
              break label431;
            if (parambi.dqJ.contains("notify@all"));
            for (paramString = ""; ; paramString = localf.zgQ.getContext().getString(2131302586, new Object[] { "@" }) + "\n")
            {
              paramString = j.a(localf.zgQ.getContext(), paramString + localObject1, (int)localf.zgQ.getTextSize(), 1, Integer.valueOf(31), bK(parambi));
              localf.zgQ.a(paramString, TextView.BufferType.SPANNABLE);
              break;
            }
            label1373: localf.zgQ.setTag(zgH, Boolean.FALSE);
            localf.zgQ.setOnTouchListener(localf.zgW);
            localf.zgQ.setOnLongClickListener(c(parama1));
            localf.zgQ.setOnClickListener(dHo());
            break label781;
            paramString = parambi.field_transBrandWording;
            break label1083;
            if (localf.zgU != null)
              localf.zgU.setVisibility(8);
            AppMethodBeat.o(33298);
          }
        }
        continue;
        break;
      }
      parama = null;
      break;
      parama = null;
    }
  }

  public boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33300);
    boolean bool;
    if ((!parambi.isText()) && (!parambi.dtr()))
    {
      AppMethodBeat.o(33300);
      bool = true;
    }
    while (true)
    {
      return bool;
      ChattingItemTranslate.a locala = (ChattingItemTranslate.a)paramView.getTag();
      int i = locala.position;
      if (locala.klY == 1)
      {
        if (parambi.isText())
          paramContextMenu.add(i, 102, 0, paramView.getContext().getString(2131298151));
        paramContextMenu.add(i, 108, 0, paramView.getContext().getString(2131302491));
        if (com.tencent.mm.bp.d.afj("favorite"))
          paramContextMenu.add(i, 116, 0, paramView.getContext().getString(2131301955));
        if (com.tencent.mm.pluginsdk.model.app.g.ad(this.yJI.yTx.getContext(), parambi.getType()))
          paramContextMenu.add(i, 129, 0, paramView.getContext().getString(2131298160));
        if ((parambi.isText()) && (com.tencent.mm.aj.f.aex()))
          this.yJI.dFy();
        if (!this.yJI.dFy())
          paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298154));
        if (com.tencent.mm.app.plugin.c.Cj())
        {
          if ((parambi.dtF()) && (parambi.dtM()))
            paramContextMenu.add(i, 124, 0, paramView.getContext().getString(2131298171));
        }
        else if (bh.o(parambi))
        {
          paramContextMenu.clear();
          if (!this.yJI.dFy())
            paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298154));
        }
      }
      while (locala.klY != 2)
        while (true)
        {
          AppMethodBeat.o(33300);
          bool = true;
          break;
          paramContextMenu.add(i, 124, 0, paramView.getContext().getString(2131298173));
        }
      paramContextMenu.add(i, 141, 0, paramView.getContext().getString(2131298151));
      paramContextMenu.add(i, 142, 0, paramView.getContext().getString(2131302491));
      if (com.tencent.mm.bp.d.afj("favorite"))
        paramContextMenu.add(i, 143, 0, paramView.getContext().getString(2131301955));
      if ((com.tencent.mm.app.plugin.c.Ck()) && (parambi.dtP()))
        paramContextMenu.add(i, 125, 0, paramView.getContext().getString(2131298165));
      AppMethodBeat.o(33300);
      bool = false;
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(33301);
    int i;
    Object localObject1;
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(33301);
      bool = false;
    case 141:
      while (true)
      {
        return bool;
        parambi = parambi.field_transContent;
        paramMenuItem = parambi;
        if (parama.dFx())
        {
          paramMenuItem = parambi;
          if (!((com.tencent.mm.ui.chatting.c.b.d)parama.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm())
          {
            i = bf.ox(parambi);
            paramMenuItem = parambi;
            if (i != -1)
              paramMenuItem = parambi.substring(i + 1).trim();
          }
        }
        parambi = (android.text.ClipboardManager)com.tencent.mm.sdk.platformtools.ah.getContext().getSystemService("clipboard");
        if (!bo.isNullOrNil(paramMenuItem))
          parambi.setText(paramMenuItem);
        com.tencent.mm.ui.base.h.bQ(parama.yTx.getContext(), parama.yTx.getContext().getString(2131296876));
        AppMethodBeat.o(33301);
      }
    case 142:
      localObject1 = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
      paramMenuItem = parambi.field_transContent;
      if ((parama.dFx()) && (!((com.tencent.mm.ui.chatting.c.b.d)parama.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm()))
      {
        i = bf.ox(paramMenuItem);
        if (i != -1)
          paramMenuItem = paramMenuItem.substring(i + 1).trim();
      }
      break;
    case 143:
    case 102:
    case 108:
    case 124:
    case 125:
    }
    while (true)
    {
      if (parambi.dtr())
      {
        ((Intent)localObject1).putExtra("Retr_Msg_content", paramMenuItem);
        ((Intent)localObject1).putExtra("Retr_Msg_Type", 6);
      }
      while (true)
      {
        parama.startActivity((Intent)localObject1);
        AppMethodBeat.o(33301);
        break;
        ((Intent)localObject1).putExtra("Retr_Msg_content", paramMenuItem);
        ((Intent)localObject1).putExtra("Retr_Msg_Type", 4);
      }
      Object localObject2 = new cl();
      localObject1 = parambi.field_transContent;
      if ((parama.dFx()) && (!((com.tencent.mm.ui.chatting.c.b.d)parama.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm()))
      {
        i = bf.ox((String)localObject1);
        if (i != -1)
          localObject1 = ((String)localObject1).substring(i + 1).trim();
      }
      while (true)
      {
        while (true)
        {
          com.tencent.mm.pluginsdk.model.e.b((cl)localObject2, (String)localObject1, 1);
          ((cl)localObject2).cvA.fragment = parama.yTx;
          ((cl)localObject2).cvA.cvH = 43;
          if (((cl)localObject2).cvA.cvC != null)
          {
            localObject1 = ((cl)localObject2).cvA.cvC.wit;
            if (localObject1 != null)
            {
              ((abl)localObject1).alD(parambi.field_talker);
              ((abl)localObject1).alE(r.Yz());
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
            }
            label501: localObject1 = (android.content.ClipboardManager)com.tencent.mm.sdk.platformtools.ah.getContext().getSystemService("clipboard");
            localObject2 = parambi.field_content;
            paramMenuItem = new StringBuilder("groupId = ").append(paramMenuItem.getGroupId()).append(", content length: ");
            if (localObject2 != null)
              break label666;
            i = 0;
            ab.d("MicroMsg.ChattingItemTextFrom", i);
            paramMenuItem = ((com.tencent.mm.ui.chatting.c.b.ah)parama.aF(com.tencent.mm.ui.chatting.c.b.ah.class)).bm(parambi);
          }
          try
          {
            ((android.content.ClipboardManager)localObject1).setText(paramMenuItem);
            com.tencent.mm.ui.base.h.bQ(parama.yTx.getContext(), parama.yTx.getContext().getString(2131296876));
            parama = com.tencent.mm.plugin.secinforeport.a.a.qjm;
            com.tencent.mm.plugin.secinforeport.a.a.h(1, parambi.field_msgSvrId, bo.ana(paramMenuItem));
            AppMethodBeat.o(33301);
            break;
            ab.e("MicroMsg.ChattingItemTextFrom", "alvinluo transform text fav failed");
            break label501;
            label666: i = ((String)localObject2).length();
          }
          catch (Exception localException)
          {
            while (true)
              ab.e("MicroMsg.ChattingItemTextFrom", "clip.setText error ");
          }
        }
        paramMenuItem = bh.s(parambi);
        if (bo.isNullOrNil(paramMenuItem))
        {
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
        }
        com.tencent.mm.ui.base.h.a(parama.yTx.getContext(), 2131305954, 2131305955, 2131297078, 2131305857, true, new al.a.7(this, paramMenuItem, parama), new al.a.8(this, parama, parambi));
        break;
        ((com.tencent.mm.ui.chatting.c.b.ah)parama.aF(com.tencent.mm.ui.chatting.c.b.ah.class)).b(paramMenuItem, parambi);
        break;
      }
    }
  }

  public boolean aH(int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    if (!paramBoolean)
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
    AppMethodBeat.i(33302);
    if ((paramView instanceof MMTextView))
    {
      paramView = (MMTextView)paramView;
      com.tencent.mm.ui.chatting.k.a.a.dHa();
      com.tencent.mm.ui.chatting.k.a.a.a(paramView.getText(), parambi);
    }
    AppMethodBeat.o(33302);
    return true;
  }

  protected final boolean b(com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(33297);
    boolean bool = parama.dFx();
    AppMethodBeat.o(33297);
    return bool;
  }

  protected boolean dHj()
  {
    return false;
  }

  public final boolean dHk()
  {
    return false;
  }

  public final boolean fi(View paramView)
  {
    AppMethodBeat.i(33303);
    Intent localIntent = new Intent(paramView.getContext(), TextPreviewUI.class);
    localIntent.addFlags(67108864);
    ay localay = (ay)paramView.getTag();
    if (localay != null)
    {
      CharSequence localCharSequence = ((MMNeat7extView)paramView).dPr();
      localIntent.putExtra("Chat_Msg_Id", localay.cKd.field_msgId);
      localIntent.putExtra("key_chat_text", localCharSequence);
      paramView.getContext().startActivity(localIntent);
      com.tencent.mm.ui.base.b.hL(paramView.getContext());
    }
    AppMethodBeat.o(33303);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.a
 * JD-Core Version:    0.6.2
 */
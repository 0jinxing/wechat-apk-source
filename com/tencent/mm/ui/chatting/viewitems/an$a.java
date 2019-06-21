package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.modelstat.b;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.base.AnimImageView;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.ag;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.c.b.f;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

public final class an$a extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;
  private View.OnClickListener zhu;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33359);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969071);
      ((View)localObject).setTag(new an.c().d((View)localObject, true, this.yFW));
    }
    AppMethodBeat.o(33359);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33361);
    this.yJI = parama1;
    an.c localc = (an.c)parama;
    localc.zhC.setFromVoice(true);
    localc.zhC.setFromGroup(parama1.dFx());
    com.tencent.mm.ui.chatting.c.b.h localh = (com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class);
    a(localh, parambi.field_msgId);
    an.c.a(localc, parambi, paramInt, parama1, true, c(parama1));
    parama = null;
    paramString = ChattingItemTranslate.b.zhg;
    Object localObject = (ag)parama1.aF(ag.class);
    if (an.c(parambi, parama1))
    {
      localObject = ((ag)localObject).C(parambi.field_msgId, parambi.field_imgPath);
      parama = (c.a)localObject;
      if (!bo.isNullOrNil((String)localObject))
      {
        paramString = ChattingItemTranslate.b.zhj;
        parama = (c.a)localObject;
      }
    }
    label530: label671: label700: 
    while (true)
    {
      if ((!bo.isNullOrNil(parama)) || (paramString != ChattingItemTranslate.b.zhg))
      {
        if (localc.zgU == null)
        {
          localc.zgU = ((ChattingItemTranslate)localc.zgT.inflate());
          localc.zgU.setMinimumWidth(localc.zhz - com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 5));
          localc.zgU.init();
        }
        localc.zgU.a(parama, paramString);
        paramString = new ChattingItemTranslate.a(parambi, parama1.dFx(), paramInt);
        paramString.klY = 2;
        localc.zgU.setTag(paramString);
        paramString = localc.zgU;
        if (this.zhu == null)
          this.zhu = new an.a.3(this);
        paramString.setOnClickListener(this.zhu);
        if (!bo.isNullOrNil(parama))
        {
          localc.zgU.setOnTouchListener(localh.dCZ());
          localc.zgU.setOnDoubleClickListener(new an.a.1(this, parama, parambi));
          localc.zgU.setOnLongClickListener(c(parama1));
          localc.zgU.setVisibility(0);
        }
        label348: parama = new n(parambi.field_content);
        if (parama.time != 0L)
          break label484;
        localc.zby.setVisibility(8);
        label380: parama = parambi.dJv;
        if ((parama != null) && (parama.length() != 0))
          break label671;
        localc.zbU.setVisibility(8);
        AppMethodBeat.o(33361);
      }
      while (true)
      {
        return;
        if (!((ag)localObject).nj(parambi.field_msgId))
          break label700;
        parama = ((ag)localObject).C(parambi.field_msgId, parambi.field_imgPath);
        paramString = ((ag)localObject).ni(parambi.field_msgId);
        break;
        if (localc.zgU == null)
          break label348;
        localc.zgU.setVisibility(8);
        break label348;
        label484: paramString = ((aj)parama1.aF(aj.class)).dFm();
        if (((paramString != null) && (paramString.yGO == parambi.field_msgId)) || (q.K(parambi)))
        {
          paramInt = 1;
          paramString = localc.zby;
          if (paramInt == 0)
            break label610;
        }
        label610: for (int i = 8; ; i = 0)
        {
          paramString.setVisibility(i);
          i = (int)q.fY(parama.time);
          if (paramInt != 0)
            break label616;
          localc.zhB.setContentDescription(String.format(parama1.yTx.getContext().getString(2131304294), new Object[] { Integer.valueOf(i) }));
          break;
          paramInt = 0;
          break label530;
        }
        label616: parama = ((f)parama1.aF(f.class)).arj(parama1.getTalkerUserName());
        paramString = a.a.dzk();
        localObject = localc.zhB;
        if (parama != null)
          parama.toString();
        paramString.ah((View)localObject, i);
        break label380;
        localc.zbU.setVisibility(0);
        b(parama1, localc.zbU, ay.arL(parama));
        AppMethodBeat.o(33361);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33362);
    aw.ZK();
    Object localObject;
    int i;
    int j;
    label192: label241: boolean bool;
    if (com.tencent.mm.model.c.isSDCardAvailable())
    {
      localObject = (ChattingItemTranslate.a)paramView.getTag();
      i = ((ChattingItemTranslate.a)localObject).position;
      if (((ChattingItemTranslate.a)localObject).klY == 1)
      {
        if (((new n(parambi.field_content).time != 0L) || (parambi.field_isSend != 0)) && ((parambi.field_status != 1) || (parambi.field_isSend != 1)))
        {
          aw.ZK();
          Boolean localBoolean = (Boolean)com.tencent.mm.model.c.Ry().get(26, null);
          localObject = localBoolean;
          if (localBoolean == null)
            localObject = Boolean.FALSE;
          if (!((Boolean)localObject).booleanValue())
            break label458;
          paramContextMenu.add(i, 120, 0, 2131298037);
          aw.ZK();
          localObject = com.tencent.mm.model.c.XM().aoO(parambi.field_talker);
          if ((t.nl(parambi.field_talker)) || (t.nI(parambi.field_talker)) || (localObject == null) || (((ad)localObject).dsf()))
            break label476;
          j = 1;
          if (com.tencent.mm.bp.d.afj("favorite"))
            paramContextMenu.add(i, 116, 0, paramView.getContext().getString(2131301955));
          if (j != 0)
          {
            if (com.tencent.mm.aj.z.aeR().lf(2) <= 0)
              break label482;
            j = 1;
            if ((j != 0) && (!this.yJI.dFy()))
              paramContextMenu.add(i, 114, 0, paramView.getContext().getString(2131298150));
          }
          localObject = (ag)this.yJI.aF(ag.class);
          int k = 0;
          if (!an.c(parambi, this.yJI))
            break label496;
          if (bo.isNullOrNil(((ag)localObject).C(parambi.field_msgId, parambi.field_imgPath)))
            break label488;
          j = 2131298172;
          label332: int m = k;
          if (t.mZ(parambi.field_talker))
          {
            m = k;
            if (aa.don())
            {
              m = k;
              if (j != -1)
              {
                paramContextMenu.add(i, 121, 0, j);
                m = 1;
              }
            }
          }
          if (!this.yJI.dFy())
            paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298156));
          if ((m == 0) && (aa.don()) && (j != -1))
            paramContextMenu.add(i, 121, 0, j);
        }
        bool = true;
        AppMethodBeat.o(33362);
      }
    }
    while (true)
    {
      return bool;
      label458: paramContextMenu.add(i, 119, 0, 2131298036);
      break;
      label476: j = 0;
      break label192;
      label482: j = 0;
      break label241;
      label488: j = 2131298174;
      break label332;
      label496: if (((ag)localObject).nj(parambi.field_msgId))
      {
        j = 2131298170;
        break label332;
      }
      j = 2131298174;
      break label332;
      if (((ChattingItemTranslate.a)localObject).klY == 2)
      {
        paramContextMenu.add(i, 141, 0, paramView.getContext().getString(2131298151));
        paramContextMenu.add(i, 142, 0, paramView.getContext().getString(2131302491));
        if (com.tencent.mm.bp.d.afj("favorite"))
          paramContextMenu.add(i, 143, 0, paramView.getContext().getString(2131301955));
        bool = false;
        AppMethodBeat.o(33362);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(33362);
      }
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33363);
    Object localObject = (ag)parama.aF(ag.class);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 119:
    case 120:
    case 121:
    case 141:
    case 142:
    case 143:
    case 100:
    case 103:
    }
    while (true)
    {
      AppMethodBeat.o(33363);
      boolean bool = false;
      while (true)
      {
        return bool;
        ((aj)parama.aF(aj.class)).qu(true);
        AppMethodBeat.o(33363);
        bool = true;
        continue;
        ((aj)parama.aF(aj.class)).qu(false);
        AppMethodBeat.o(33363);
        bool = true;
      }
      an.e(parama, parambi);
      if (((ag)localObject).dFi())
        com.tencent.mm.ui.base.h.a(parama.yTx.getContext(), parama.yTx.getContext().getString(2131304335), "", new an.a.2(this, parambi, (ag)localObject, paramMenuItem));
      while (true)
      {
        b.fRa.G(parambi);
        AppMethodBeat.o(33363);
        bool = true;
        break;
        q.M(parambi);
        ((ag)localObject).a(parambi, true, paramMenuItem.getGroupId(), 0);
      }
      paramMenuItem = (ClipboardManager)ah.getContext().getSystemService("clipboard");
      parama = ((ag)localObject).C(parambi.field_msgId, parambi.field_imgPath);
      if (!bo.isNullOrNil(parama))
        paramMenuItem.setText(parama);
      an.e(8, parambi);
      continue;
      paramMenuItem = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
      localObject = ((ag)localObject).C(parambi.field_msgId, parambi.field_imgPath);
      if (parambi.dtr())
      {
        paramMenuItem.putExtra("Retr_Msg_content", (String)localObject);
        paramMenuItem.putExtra("Retr_Msg_Type", 6);
      }
      while (true)
      {
        parama.startActivity(paramMenuItem);
        an.e(9, parambi);
        break;
        paramMenuItem.putExtra("Retr_Msg_content", (String)localObject);
        paramMenuItem.putExtra("Retr_Msg_Type", 4);
      }
      localObject = ((ag)localObject).C(parambi.field_msgId, parambi.field_imgPath);
      paramMenuItem = new cl();
      com.tencent.mm.pluginsdk.model.e.b(paramMenuItem, (String)localObject, 1);
      paramMenuItem.cvA.fragment = parama.yTx;
      paramMenuItem.cvA.cvH = 43;
      if (paramMenuItem.cvA.cvC != null)
      {
        parama = paramMenuItem.cvA.cvC.wit;
        if (parama != null)
        {
          parama.alD(parambi.field_talker);
          parama.alE(r.Yz());
          com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
        }
      }
      while (true)
      {
        an.e(10, parambi);
        break;
        ab.e("MicroMsg.ChattingItemVoice", "alvinluo transform text fav failed");
      }
      ((aj)parama.aF(aj.class)).bn(parambi);
      continue;
      ((aj)parama.aF(aj.class)).bo(parambi);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 34));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33364);
    paramView = (ay)paramView.getTag();
    b.fRa.F(paramView.cKd);
    an.a(parama, paramView);
    ((ag)parama.aF(ag.class)).OF(2);
    AppMethodBeat.o(33364);
    return true;
  }

  protected final boolean b(com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(33360);
    boolean bool = parama.dFx();
    AppMethodBeat.o(33360);
    return bool;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.an.a
 * JD-Core Version:    0.6.2
 */
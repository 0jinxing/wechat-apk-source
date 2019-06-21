package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.modelstat.b;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.AnimImageView;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.ag;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.s.n;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

public final class an
{
  public static void a(com.tencent.mm.ui.chatting.d.a parama, ay paramay)
  {
    AppMethodBeat.i(33378);
    if ((com.tencent.mm.r.a.bJ(parama.yTx.getContext())) || (com.tencent.mm.r.a.bH(parama.yTx.getContext())))
    {
      ab.d("MicroMsg.ChattingItemVoice", "voip is running, not play voice");
      AppMethodBeat.o(33378);
    }
    while (true)
    {
      return;
      aw.ZK();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.t.hO(parama.yTx.getContext());
        AppMethodBeat.o(33378);
      }
      else
      {
        if ((paramay == null) || (paramay.cKd == null))
          break label553;
        localObject = new n(paramay.cKd.field_content);
        if ((!com.tencent.mm.platformtools.ah.isNullOrNil(paramay.cKd.field_content)) && (((n)localObject).time != 0L))
          break;
        Toast.makeText(parama.yTx.getContext(), 2131298086, 0).show();
        AppMethodBeat.o(33378);
      }
    }
    Object localObject = ((aj)parama.aF(aj.class)).dFm();
    bi localbi;
    int i;
    if ((parama.aF(com.tencent.mm.ui.chatting.c.b.h.class) != null) && (localObject != null))
    {
      localbi = paramay.cKd;
      if (((aj)parama.aF(aj.class)).dFm().yGO != localbi.field_msgId)
      {
        parama = (ag)parama.aF(ag.class);
        if (!parama.nm(localbi.field_msgId))
          break label308;
        i = 7;
      }
    }
    while (true)
    {
      if (i != 0)
      {
        parama = new ft();
        parama.czK.czL = 1;
        parama.czK.scene = i;
        parama.czK.fileName = localbi.field_imgPath;
        com.tencent.mm.sdk.b.a.xxA.m(parama);
      }
      i = paramay.position;
      parama = paramay.cKd;
      if ((parama == null) || (!parama.drD()))
      {
        AppMethodBeat.o(33378);
        break;
        label308: if (!parama.nj(localbi.field_msgId))
          break label561;
        i = 6;
        continue;
      }
      paramay = new n(parama.field_content);
      if (((paramay.time == 0L) && (parama.field_isSend == 0)) || ((parama.field_status == 1) && (parama.field_isSend == 1)))
      {
        AppMethodBeat.o(33378);
        break;
      }
      if ((parama.field_isSend != 0) || (paramay.time != -1L))
      {
        ((com.tencent.mm.ui.chatting.d)localObject).dBw();
        aw.ZK();
        paramay = (Boolean)com.tencent.mm.model.c.Ry().get(4115, null);
        if ((paramay == null) || (!paramay.booleanValue()))
        {
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(4115, Boolean.TRUE);
          ((com.tencent.mm.ui.chatting.d)localObject).dBC();
          ((com.tencent.mm.ui.chatting.d)localObject).yGR = com.tencent.mm.ui.base.t.a(((com.tencent.mm.ui.chatting.d)localObject).cgL.yTx.getActivity(), ((com.tencent.mm.ui.chatting.d)localObject).context.getString(2131298186), 4000L);
        }
        if ((((com.tencent.mm.ui.chatting.d)localObject).mfO.isPlaying()) && (parama.field_msgId == ((com.tencent.mm.ui.chatting.d)localObject).yGO))
        {
          ((com.tencent.mm.ui.chatting.d)localObject).yGX = true;
          ((com.tencent.mm.ui.chatting.d)localObject).dBB();
          AppMethodBeat.o(33378);
          break;
        }
        ((com.tencent.mm.ui.chatting.d)localObject).au(parama);
        if ((parama.field_isSend == 0) && (!q.K(parama)))
          ((com.tencent.mm.ui.chatting.d)localObject).Od(i + 1);
        ((com.tencent.mm.ui.chatting.d)localObject).qn(true);
      }
      label553: AppMethodBeat.o(33378);
      break;
      label561: i = 0;
    }
  }

  public static final class b extends c
    implements s.n
  {
    private int vjo = 3;
    private com.tencent.mm.ui.chatting.d.a yJI;

    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      AppMethodBeat.i(33367);
      Object localObject;
      if (paramView != null)
      {
        localObject = paramView;
        if (paramView.getTag() != null);
      }
      else
      {
        localObject = new v(paramLayoutInflater, 2130969107);
        ((View)localObject).setTag(new an.c().d((View)localObject, false, this.yFW));
      }
      AppMethodBeat.o(33367);
      return localObject;
    }

    public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33372);
      ((aj)parama.aF(aj.class)).bo(parambi);
      AppMethodBeat.o(33372);
    }

    public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
    {
      AppMethodBeat.i(33368);
      this.yJI = parama1;
      an.c localc = (an.c)parama;
      localc.zhC.setFromVoice(false);
      localc.zhC.setFromGroup(parama1.dFx());
      com.tencent.mm.ui.chatting.c.b.h localh = (com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class);
      a(localh, parambi.field_msgId);
      an.c.a(localc, parambi, paramInt, parama1, false, c(parama1));
      Object localObject = (ag)parama1.aF(ag.class);
      parama = null;
      paramString = ChattingItemTranslate.b.zhg;
      if (an.c(parambi, parama1))
      {
        localObject = ((ag)localObject).C(parambi.field_msgId, parambi.field_imgPath);
        parama = (c.a)localObject;
        if (!bo.isNullOrNil((String)localObject))
        {
          paramString = ChattingItemTranslate.b.zhj;
          parama = (c.a)localObject;
        }
        if ((bo.isNullOrNil(parama)) && (paramString == ChattingItemTranslate.b.zhg))
          break label464;
        if (localc.zgU == null)
        {
          localc.zgU = ((ChattingItemTranslate)localc.zgT.inflate());
          localc.zgU.setMinimumWidth(localc.zhz - com.tencent.mm.bz.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ah.getContext(), 5));
          localc.zgU.init();
        }
        localc.zgU.a(parama, paramString);
        if (!bo.isNullOrNil(parama))
        {
          paramString = new ChattingItemTranslate.a(parambi, parama1.dFx(), paramInt);
          paramString.klY = 2;
          localc.zgU.setTag(paramString);
          localc.zgU.setOnTouchListener(localh.dCZ());
          localc.zgU.setOnDoubleClickListener(new an.b.1(this, parama, parambi));
          localc.zgU.setOnLongClickListener(c(parama1));
          localc.zgU.setVisibility(0);
        }
        label313: if (!dHm())
          break label571;
        if (localc.zhH != null)
          localc.zhH.setVisibility(8);
        if (localc.zci != null)
          localc.zci.setVisibility(8);
        if ((parambi.field_status != 1) && (parambi.field_status != 5))
          break label485;
        localc.zhI.setBackgroundResource(2130838321);
        parambi.xZd = true;
      }
      while (true)
      {
        a(paramInt, localc, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
        AppMethodBeat.o(33368);
        return;
        if (!((ag)localObject).nj(parambi.field_msgId))
          break;
        parama = ((ag)localObject).C(parambi.field_msgId, parambi.field_imgPath);
        paramString = ((ag)localObject).ni(parambi.field_msgId);
        break;
        label464: if (localc.zgU == null)
          break label313;
        localc.zgU.setVisibility(8);
        break label313;
        label485: localc.zhI.setBackgroundResource(2130838320);
        if ((localc.zci != null) && (a(localh, parambi.field_msgId)))
        {
          if (parambi.xZd)
          {
            parama = new AlphaAnimation(0.5F, 1.0F);
            parama.setDuration(300L);
            localc.zhI.startAnimation(parama);
            parambi.xZd = false;
          }
          localc.zci.setVisibility(0);
          continue;
          label571: if (localc.zhH != null)
          {
            localc.zhH.setVisibility(0);
            if (parambi.field_status >= 2)
              localc.zhH.setVisibility(8);
          }
        }
      }
    }

    public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
    {
      boolean bool = true;
      AppMethodBeat.i(33369);
      aw.ZK();
      Object localObject;
      int i;
      ag localag;
      int j;
      if (com.tencent.mm.model.c.isSDCardAvailable())
      {
        localObject = (ChattingItemTranslate.a)paramView.getTag();
        i = ((ChattingItemTranslate.a)localObject).position;
        if (((ChattingItemTranslate.a)localObject).klY == 1)
        {
          localObject = new n(parambi.field_content);
          if (((((n)localObject).time != 0L) || (parambi.field_isSend != 0)) && ((parambi.field_status != 1) || (parambi.field_isSend != 1)))
          {
            if (((aj)this.yJI.aF(aj.class)).dFo())
              paramContextMenu.add(i, 120, 0, 2131298037);
          }
          else
          {
            if (parambi.field_status == 5)
              paramContextMenu.add(i, 103, 0, paramView.getContext().getString(2131298217));
            if (com.tencent.mm.bp.d.afj("favorite"))
              paramContextMenu.add(i, 116, 0, paramView.getContext().getString(2131301955));
            if ((!parambi.drC()) && (parambi.drD()) && ((parambi.field_status == 2) || (parambi.dJz == 1)) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)))
              paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
            localag = (ag)this.yJI.aF(ag.class);
            if (!an.c(parambi, this.yJI))
              break label474;
            if (bo.isNullOrNil(localag.C(parambi.field_msgId, parambi.field_imgPath)))
              break label466;
            j = 2131298172;
            label310: if ((!com.tencent.mm.model.t.mZ(parambi.field_talker)) || (!aa.don()))
              break label612;
            paramContextMenu.add(i, 121, 0, j);
          }
        }
      }
      label466: label474: label612: for (int k = 1; ; k = 0)
      {
        if (((((n)localObject).time != 0L) || (parambi.field_isSend != 0)) && ((parambi.field_status != 1) || (parambi.field_isSend != 1)) && (!this.yJI.dFy()))
          paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298156));
        if ((k == 0) && (aa.don()) && (j != -1))
          paramContextMenu.add(i, 121, 0, j);
        AppMethodBeat.o(33369);
        while (true)
        {
          return bool;
          paramContextMenu.add(i, 119, 0, 2131298036);
          break;
          j = 2131298174;
          break label310;
          if (localag.nj(parambi.field_msgId))
          {
            j = 2131298170;
            break label310;
          }
          j = 2131298174;
          break label310;
          if (((ChattingItemTranslate.a)localObject).klY == 2)
          {
            paramContextMenu.add(i, 141, 0, paramView.getContext().getString(2131298151));
            paramContextMenu.add(i, 142, 0, paramView.getContext().getString(2131302491));
            if (com.tencent.mm.bp.d.afj("favorite"))
              paramContextMenu.add(i, 143, 0, paramView.getContext().getString(2131301955));
            AppMethodBeat.o(33369);
            bool = false;
          }
          else
          {
            AppMethodBeat.o(33369);
          }
        }
      }
    }

    public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33370);
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
      case 103:
      }
      while (true)
      {
        AppMethodBeat.o(33370);
        boolean bool = false;
        while (true)
        {
          return bool;
          ((aj)parama.aF(aj.class)).qu(true);
          AppMethodBeat.o(33370);
          bool = true;
          continue;
          ((aj)parama.aF(aj.class)).qu(false);
          AppMethodBeat.o(33370);
          bool = true;
          continue;
          an.e(parama, parambi);
          if (((ag)localObject).dFi())
            com.tencent.mm.ui.base.h.a(parama.yTx.getContext(), parama.yTx.getContext().getString(2131304335), "", new an.b.2(this, (ag)localObject, parambi, paramMenuItem));
          while (true)
          {
            b.fRa.G(parambi);
            AppMethodBeat.o(33370);
            bool = true;
            break;
            ((ag)localObject).a(parambi, true, paramMenuItem.getGroupId(), 0);
          }
          paramMenuItem = (ClipboardManager)com.tencent.mm.sdk.platformtools.ah.getContext().getSystemService("clipboard");
          parama = ((ag)localObject).C(parambi.field_msgId, parambi.field_imgPath);
          if (!bo.isNullOrNil(parama))
            paramMenuItem.setText(parama);
          an.e(8, parambi);
          AppMethodBeat.o(33370);
          bool = true;
        }
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
          AppMethodBeat.o(33370);
          bool = true;
          break;
          paramMenuItem.putExtra("Retr_Msg_content", (String)localObject);
          paramMenuItem.putExtra("Retr_Msg_Type", 4);
        }
        localObject = ((ag)localObject).C(parambi.field_msgId, parambi.field_imgPath);
        paramMenuItem = new cl();
        e.b(paramMenuItem, (String)localObject, 1);
        paramMenuItem.cvA.fragment = parama.yTx;
        paramMenuItem.cvA.cvH = 43;
        if (paramMenuItem.cvA.cvC != null)
        {
          parama = paramMenuItem.cvA.cvC.wit;
          if (parama != null)
          {
            parama.alD(r.Yz());
            parama.alE(parambi.field_talker);
            com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
          }
        }
        while (true)
        {
          an.e(10, parambi);
          AppMethodBeat.o(33370);
          bool = true;
          break;
          ab.e("MicroMsg.ChattingItemVoice", "alvinluo transform text fav failed");
        }
        ((aj)parama.aF(aj.class)).bo(parambi);
      }
    }

    public final boolean aH(int paramInt, boolean paramBoolean)
    {
      if ((paramBoolean) && (paramInt == 34));
      for (paramBoolean = true; ; paramBoolean = false)
        return paramBoolean;
    }

    public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33371);
      paramView = (ay)paramView.getTag();
      b.fRa.F(paramView.cKd);
      an.a(parama, paramView);
      ((ag)parama.aF(ag.class)).OF(2);
      AppMethodBeat.o(33371);
      return true;
    }

    public final boolean dHk()
    {
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.an
 * JD-Core Version:    0.6.2
 */
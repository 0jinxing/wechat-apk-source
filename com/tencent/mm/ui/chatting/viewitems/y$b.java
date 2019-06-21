package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.m;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.s.m;
import com.tencent.mm.ui.chatting.s.n;

public final class y$b extends c
  implements s.n
{
  private a yJI;
  protected y.d zfw;
  private y.c zfx;
  protected s.m zfy;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33195);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969099);
      ((View)localObject).setTag(new y.e().z((View)localObject, false));
    }
    AppMethodBeat.o(33195);
    return localObject;
  }

  public final void a(a parama, bi parambi)
  {
    AppMethodBeat.i(33199);
    parambi.dtJ();
    aw.ZK();
    com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
    ((m)parama.aF(m.class)).bh(parambi);
    AppMethodBeat.o(33199);
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33196);
    this.yJI = parama1;
    paramString = (y.e)parama;
    EmojiInfo localEmojiInfo = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.field_imgPath);
    ImageView localImageView;
    if (localEmojiInfo != null)
    {
      parama = ap.aps(parambi.field_content);
      localEmojiInfo.talker = parambi.field_talker;
      paramString.zdM.a(localEmojiInfo, parambi.field_msgId, parama);
      if (paramString.zfz != null)
      {
        if (!parama.xXK)
          break label696;
        paramString.zfz.setVisibility(0);
        TextView localTextView = (TextView)paramString.mRR.findViewById(2131822664).findViewById(2131822666);
        localTextView.setText(Html.fromHtml(parama1.yTx.getMMResources().getString(2131299034)));
        localImageView = (ImageView)paramString.mRR.findViewById(2131822664).findViewById(2131822667);
        localTextView.setTag(new ay(parambi, false, paramInt, parama1.dFu(), false, "", "", "", "", localEmojiInfo.field_groupId, "", true, false));
        localTextView.setOnClickListener(i(parama1));
        if (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjN())
        {
          localImageView.setVisibility(0);
          localImageView.setTag(new ay(parambi, parama1.dFx(), paramInt, parama1.dFu(), '\000'));
          if (this.zfy == null)
            this.zfy = new s.m(parama1);
          localImageView.setOnClickListener(this.zfy);
        }
      }
      else
      {
        if ((localEmojiInfo.xy()) && (!parama.fWX))
        {
          parama.fWX = true;
          parambi.setContent(parama.dsX());
          aw.ZK();
          parambi.setStatus(com.tencent.mm.model.c.XO().jf(parambi.field_msgId).field_status);
          aw.ZK();
          com.tencent.mm.model.c.XO().ab(parambi);
        }
        if (!dHm())
          break label730;
        paramString.pyf.setVisibility(8);
        if ((parambi.field_status != 2) || (!a((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi.field_msgId)))
          break label709;
        if (paramString.zci != null)
          paramString.zci.setVisibility(0);
        label424: if (!b.y(localEmojiInfo))
          break label787;
        paramString.zfA.setVisibility(0);
        parama = paramString.zfA;
        if (this.zfx == null)
          this.zfx = new y.c(this.yJI);
        parama.setOnClickListener(this.zfx);
      }
    }
    else
    {
      label477: parama = "";
      if ((localEmojiInfo == null) || (!localEmojiInfo.xy()))
        break label907;
      if (!localEmojiInfo.field_name.startsWith("jsb_j"))
        break label800;
      parama = this.yJI.yTx.getContext().getString(2131299063);
    }
    label907: 
    while (true)
    {
      paramString.zdM.setContentDescription(this.yJI.yTx.getContext().getString(2131299163) + parama);
      paramString.zdM.setTag(new ay(parambi, parama1.dFx(), paramInt, parama1.dFu(), '\000'));
      parama = paramString.zdM;
      if (this.zfw == null)
        this.zfw = new y.d(parama1);
      parama.setOnClickListener(this.zfw);
      paramString.zdM.setOnLongClickListener(c(parama1));
      paramString.zdM.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
      a(paramInt, paramString, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
      AppMethodBeat.o(33196);
      return;
      localImageView.setVisibility(8);
      break;
      label696: paramString.zfz.setVisibility(8);
      break;
      label709: if (paramString.zci == null)
        break label424;
      paramString.zci.setVisibility(8);
      break label424;
      label730: if (paramString.zci != null)
        paramString.zci.setVisibility(8);
      if (paramString.pyf == null)
        break label424;
      paramString.pyf.setVisibility(0);
      if (parambi.field_status < 2)
        break label424;
      paramString.pyf.setVisibility(8);
      break label424;
      label787: paramString.zfA.setVisibility(8);
      break label477;
      label800: if (localEmojiInfo.field_name.startsWith("jsb_s"))
      {
        parama = this.yJI.yTx.getContext().getString(2131299064);
      }
      else if (localEmojiInfo.field_name.startsWith("jsb_b"))
      {
        parama = this.yJI.yTx.getContext().getString(2131299062);
      }
      else if (localEmojiInfo.field_name.startsWith("dice"))
      {
        parama = localEmojiInfo.field_name.replace("dice_", "").replace(".png", "");
        continue;
        if (localEmojiInfo != null)
          parama = bo.bc(((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jh(localEmojiInfo.Aq()), "");
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33197);
    int i;
    EmojiInfo localEmojiInfo;
    if (parambi.dtx())
    {
      aw.ZK();
      if (com.tencent.mm.model.c.isSDCardAvailable())
      {
        i = ((ay)paramView.getTag()).position;
        localEmojiInfo = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.field_imgPath);
        if (localEmojiInfo == null)
        {
          ab.w("MicroMsg.emoji.ChattingItemEmojiTo", "emoji is null. md5:%s", new Object[] { parambi.field_imgPath });
          AppMethodBeat.o(33197);
          return true;
        }
        boolean bool = localEmojiInfo.duP();
        if ((localEmojiInfo.field_catalog != EmojiInfo.yal) && (!localEmojiInfo.duS()) && (!localEmojiInfo.duT()))
        {
          if (!bool)
            break label553;
          paramContextMenu.add(i, 104, 0, paramView.getContext().getString(2131298167));
        }
        label153: if ((localEmojiInfo.field_catalog == EmojiInfo.yal) || (bo.isNullOrNil(localEmojiInfo.field_groupId)) || ((!bo.isNullOrNil(localEmojiInfo.field_groupId)) && (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Ji(localEmojiInfo.field_groupId))))
        {
          if (!bool)
            break label565;
          paramContextMenu.add(i, 113, 0, 2131302491);
        }
      }
    }
    while (true)
    {
      if (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjR())
        paramContextMenu.add(i, 135, 0, paramView.getContext().getString(2131298157));
      if ((b.JY(localEmojiInfo.field_groupId)) && (!localEmojiInfo.xy()) && (!localEmojiInfo.duT()))
        paramContextMenu.add(i, 128, 0, 2131298169);
      if ((!parambi.drC()) && (parambi.dtx()) && ((parambi.field_status == 2) || (parambi.dJz == 1)) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)))
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298152));
      if (parambi.field_status == 5)
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(2131298217));
      com.tencent.mm.plugin.report.service.h.pYm.e(12789, new Object[] { Integer.valueOf(0), localEmojiInfo.Aq(), Integer.valueOf(0), localEmojiInfo.field_designerID, localEmojiInfo.field_groupId, "", "", "", "", "", localEmojiInfo.field_activityid });
      AppMethodBeat.o(33197);
      break;
      label553: ab.i("MicroMsg.emoji.ChattingItemEmojiTo", "emoji file no exist. cannot save or resend.");
      break label153;
      label565: ab.i("MicroMsg.emoji.ChattingItemEmojiTo", "emoji file no exist. cannot save or resend.");
    }
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(33198);
    boolean bool = ((m)parama.aF(m.class)).a(paramMenuItem, parama, parambi);
    AppMethodBeat.o(33198);
    return bool;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 47));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    return false;
  }

  public final boolean dHk()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.y.b
 * JD-Core Version:    0.6.2
 */
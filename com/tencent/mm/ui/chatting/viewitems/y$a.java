package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
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

public final class y$a extends c
{
  private a yJI;
  protected y.d zfw;
  private y.c zfx;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33190);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969062);
      ((View)localObject).setTag(new y.e().z((View)localObject, true));
    }
    AppMethodBeat.o(33190);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33191);
    if (parambi == null)
    {
      ab.e("MicroMsg.emoji.ChattingItemEmojiFrom", "msg is null for: %s", new Object[] { paramString });
      AppMethodBeat.o(33191);
      return;
    }
    this.yJI = parama1;
    EmojiInfo localEmojiInfo = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.field_imgPath);
    y.e locale = (y.e)parama;
    boolean bool;
    if (localEmojiInfo == null)
    {
      parama = parambi.field_imgPath;
      if (localEmojiInfo == null)
      {
        bool = true;
        label87: ab.i("MicroMsg.emoji.ChattingItemEmojiFrom", "filling: db emoji %s, %s, msgId %s", new Object[] { parama, Boolean.valueOf(bool), Long.valueOf(parambi.field_msgId) });
      }
    }
    else
    {
      if (localEmojiInfo != null)
      {
        localEmojiInfo.talker = parambi.field_talker;
        parama = ap.aps(parambi.field_content);
        locale.zdM.a(localEmojiInfo, parambi.field_msgId, parama);
        if ((localEmojiInfo.xy()) && (!parama.fWX))
        {
          aw.ZK();
          bi localbi = com.tencent.mm.model.c.XO().jf(parambi.field_msgId);
          parama.fWX = true;
          parambi.setContent(parama.dsX());
          if (localbi.getType() == 10000)
            break label485;
          aw.ZK();
          com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
        }
        label239: if (!b.y(localEmojiInfo))
          break label496;
        locale.zfA.setVisibility(0);
        parama = locale.zfA;
        if (this.zfx == null)
          this.zfx = new y.c(this.yJI);
        parama.setOnClickListener(this.zfx);
      }
      label292: parama = "";
      if ((localEmojiInfo == null) || (!localEmojiInfo.xy()))
        break label616;
      if (!localEmojiInfo.field_name.startsWith("jsb_j"))
        break label509;
      parama = this.yJI.yTx.getContext().getString(2131299063);
    }
    label485: label616: 
    while (true)
    {
      locale.zdM.setContentDescription(this.yJI.yTx.getContext().getString(2131299163) + parama);
      locale.zdM.setTag(new ay(parambi, parama1.dFx(), paramInt, paramString, '\000'));
      parama = locale.zdM;
      if (this.zfw == null)
        this.zfw = new y.d(parama1);
      parama.setOnClickListener(this.zfw);
      locale.zdM.setOnLongClickListener(c(parama1));
      locale.zdM.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
      AppMethodBeat.o(33191);
      break;
      bool = false;
      break label87;
      ab.i("MicroMsg.emoji.ChattingItemEmojiFrom", "filling: emoji revoked!");
      break label239;
      label496: locale.zfA.setVisibility(8);
      break label292;
      label509: if (localEmojiInfo.field_name.startsWith("jsb_s"))
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
    AppMethodBeat.i(33193);
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
          ab.w("MicroMsg.emoji.ChattingItemEmojiFrom", "emoji is null. md5:%s", new Object[] { parambi.field_imgPath });
          AppMethodBeat.o(33193);
          return true;
        }
        boolean bool = localEmojiInfo.duP();
        if ((localEmojiInfo.field_catalog != EmojiInfo.yal) && (!localEmojiInfo.duS()) && (!localEmojiInfo.duT()))
        {
          if (!bool)
            break label443;
          paramContextMenu.add(i, 104, 0, paramView.getContext().getString(2131298167));
        }
        label152: if ((localEmojiInfo.field_catalog == EmojiInfo.yal) || (bo.isNullOrNil(localEmojiInfo.field_groupId)) || ((!bo.isNullOrNil(localEmojiInfo.field_groupId)) && (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Ji(localEmojiInfo.field_groupId))))
        {
          if (!bool)
            break label454;
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
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298152));
      com.tencent.mm.plugin.report.service.h.pYm.e(12789, new Object[] { Integer.valueOf(0), localEmojiInfo.Aq(), Integer.valueOf(0), localEmojiInfo.field_designerID, localEmojiInfo.field_groupId, "", "", "", "", localEmojiInfo.field_activityid });
      AppMethodBeat.o(33193);
      break;
      label443: ab.i("MicroMsg.emoji.ChattingItemEmojiFrom", "file do no exist. cant do add or resend.");
      break label152;
      label454: ab.i("MicroMsg.emoji.ChattingItemEmojiFrom", "file do no exist. cant do add or resend.");
    }
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(33194);
    boolean bool = ((m)parama.aF(m.class)).a(paramMenuItem, parama, parambi);
    AppMethodBeat.o(33194);
    return bool;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 47));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    return false;
  }

  protected final boolean b(a parama)
  {
    AppMethodBeat.i(33192);
    boolean bool = parama.dFx();
    AppMethodBeat.o(33192);
    return bool;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.y.a
 * JD-Core Version:    0.6.2
 */
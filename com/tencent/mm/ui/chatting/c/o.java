package com.tencent.mm.ui.chatting.c;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.az.e;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ak;
import com.tencent.mm.ui.chatting.am;
import com.tencent.mm.ui.chatting.c.b.m;
import com.tencent.mm.ui.chatting.k;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.c.a.a(dFp=m.class)
public class o extends a
  implements m
{
  private com.tencent.mm.sdk.b.c yPA;

  public o()
  {
    AppMethodBeat.i(31396);
    this.yPA = new o.1(this);
    AppMethodBeat.o(31396);
  }

  private void aT(bi parambi)
  {
    AppMethodBeat.i(31403);
    ab.d("MicroMsg.ChattingUI.EmojiComponent", "resendAppMsgEmoji");
    if (!this.cgL.getTalkerUserName().equals("medianote"))
    {
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new e(parambi.field_talker, parambi.field_msgSvrId));
    }
    ak.aT(parambi);
    this.cgL.qp(true);
    AppMethodBeat.o(31403);
  }

  private void bi(bi parambi)
  {
    AppMethodBeat.i(31402);
    aw.ZK();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.t.hO(this.cgL.yTx.getContext());
      AppMethodBeat.o(31402);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.ChattingUI.EmojiComponent", "resendEmoji");
      if (!this.cgL.getTalkerUserName().equals("medianote"))
      {
        aw.ZK();
        com.tencent.mm.model.c.XL().c(new e(parambi.field_talker, parambi.field_msgSvrId));
      }
      ak.aS(parambi);
      AppMethodBeat.o(31402);
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    boolean bool1 = true;
    AppMethodBeat.i(31397);
    boolean bool2;
    label128: Object localObject;
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(31397);
    case 104:
      for (bool2 = false; ; bool2 = bool1)
      {
        return bool2;
        if ((parambi.dtx()) || (parambi.dty()))
        {
          if (!parambi.dtx())
            break;
          paramMenuItem = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.field_imgPath);
          localObject = parambi.field_talker;
          if (!com.tencent.mm.model.t.kH((String)localObject))
            break label1223;
          parambi = bf.oy(parambi.field_content);
          label150: h.pYm.e(12789, new Object[] { Integer.valueOf(3), paramMenuItem.Aq(), Integer.valueOf(0), paramMenuItem.field_designerID, paramMenuItem.field_groupId, "", "", "", "", "", paramMenuItem.field_activityid });
          ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().a(parama.yTx.getContext(), paramMenuItem, 0, parambi);
        }
        label265: AppMethodBeat.o(31397);
      }
      localObject = ap.aps(parambi.field_content);
      paramMenuItem = j.b.X(parambi.field_content, parambi.field_reserved);
      if (paramMenuItem == null)
      {
        paramMenuItem = new j.b();
        paramMenuItem.fgq = ((ap)localObject).cvZ;
      }
      break;
    case 103:
    case 114:
    case 113:
    case 128:
    case 135:
    }
    while (true)
    {
      if ((bo.isNullOrNil(paramMenuItem.fgq)) || (paramMenuItem.fgq.equals("-1")))
        break label265;
      paramMenuItem = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramMenuItem.fgq);
      break label128;
      bool2 = bh(parambi);
      AppMethodBeat.o(31397);
      break;
      if ((parambi.dtx()) || (parambi.dty()))
      {
        am.d(parambi, parama.yTx.getContext());
        AppMethodBeat.o(31397);
        bool2 = bool1;
        break;
      }
      AppMethodBeat.o(31397);
      bool2 = false;
      break;
      if ((parambi.dtx()) || (parambi.dty()))
      {
        paramMenuItem = new LinkedList();
        paramMenuItem.add(parambi);
        if ((!((com.tencent.mm.ui.chatting.c.b.d)parama.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDn()) && (!parama.dFw()))
          break label661;
        bool2 = true;
        label492: k.a(parama.yTx.getContext(), paramMenuItem, bool2, parama.getTalkerUserName(), null);
        if (!parambi.dtx())
          break label667;
      }
      for (paramMenuItem = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.field_imgPath); ; paramMenuItem = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramMenuItem.cvZ))
      {
        if (paramMenuItem != null)
        {
          localObject = parama.getTalkerUserName();
          parama = (com.tencent.mm.ui.chatting.d.a)localObject;
          if (com.tencent.mm.model.t.kH((String)localObject))
            parama = bf.oy(parambi.field_content);
          h.pYm.e(12789, new Object[] { Integer.valueOf(1), paramMenuItem.Aq(), Integer.valueOf(0), paramMenuItem.field_designerID, paramMenuItem.field_groupId, parama, "", "", "", paramMenuItem.field_activityid });
        }
        label661: label667: 
        do
        {
          AppMethodBeat.o(31397);
          bool2 = bool1;
          break;
          bool2 = false;
          break label492;
          paramMenuItem = ap.aps(parambi.field_content);
        }
        while ((bo.isNullOrNil(paramMenuItem.cvZ)) || (paramMenuItem.cvZ.equals("-1")));
      }
      if (parambi.dtx())
      {
        paramMenuItem = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.field_imgPath);
        label753: if (paramMenuItem != null)
          h.pYm.e(12789, new Object[] { Integer.valueOf(2), paramMenuItem.Aq(), Integer.valueOf(0), paramMenuItem.field_designerID, paramMenuItem.field_groupId, "", "", "", "", "", paramMenuItem.field_activityid });
        if (paramMenuItem != null)
          break label979;
      }
      label979: for (paramMenuItem = ""; ; paramMenuItem = paramMenuItem.field_groupId)
      {
        if (!bo.isNullOrNil(paramMenuItem))
        {
          parambi = new Intent();
          parambi.putExtra("preceding_scence", 3);
          parambi.putExtra("download_entrance_scene", 16);
          parambi.putExtra("extra_id", paramMenuItem);
          com.tencent.mm.bp.d.b(parama.yTx.getContext(), "emoji", ".ui.EmojiStoreDetailUI", parambi);
        }
        do
        {
          AppMethodBeat.o(31397);
          bool2 = bool1;
          break;
          paramMenuItem = ap.aps(parambi.field_content);
        }
        while ((bo.isNullOrNil(paramMenuItem.cvZ)) || (paramMenuItem.cvZ.equals("-1")));
        paramMenuItem = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramMenuItem.cvZ);
        break label753;
      }
      if (parambi.dtx())
      {
        paramMenuItem = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.field_imgPath);
        h.pYm.e(12789, new Object[] { Integer.valueOf(5), paramMenuItem.Aq(), Integer.valueOf(0), paramMenuItem.field_designerID, paramMenuItem.field_groupId, "", "", "", "", "", paramMenuItem.field_activityid });
        com.tencent.mm.plugin.emojicapture.api.c.an(parama.yTx.getContext(), paramMenuItem.Aq());
      }
      label1221: 
      while (true)
      {
        AppMethodBeat.o(31397);
        bool2 = bool1;
        break;
        localObject = ap.aps(parambi.field_content);
        paramMenuItem = j.b.X(parambi.field_content, parambi.field_reserved);
        if (paramMenuItem == null)
        {
          paramMenuItem = new j.b();
          paramMenuItem.fgq = ((ap)localObject).cvZ;
        }
        while (true)
        {
          if ((bo.isNullOrNil(paramMenuItem.fgq)) || (paramMenuItem.fgq.equals("-1")))
            break label1221;
          paramMenuItem = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramMenuItem.fgq);
          break;
        }
      }
      label1223: parambi = (bi)localObject;
      break label150;
    }
  }

  public final boolean bh(bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(31401);
    ab.i("MicroMsg.ChattingUI.EmojiComponent", "[resendEmoji] %d", new Object[] { Long.valueOf(parambi.field_msgId) });
    if (parambi.dtx())
    {
      bi(parambi);
      AppMethodBeat.o(31401);
    }
    while (true)
    {
      return bool;
      if (parambi.dty())
      {
        aT(parambi);
        AppMethodBeat.o(31401);
      }
      else
      {
        AppMethodBeat.o(31401);
        bool = false;
      }
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31400);
    super.dDh();
    ab.i("MicroMsg.ChattingUI.EmojiComponent", "[onComponentUnInstall]");
    com.tencent.mm.sdk.b.a.xxA.d(this.yPA);
    AppMethodBeat.o(31400);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31399);
    ab.i("MicroMsg.ChattingUI.EmojiComponent", "[onChattingExitAnimStart]");
    com.tencent.mm.sdk.b.a.xxA.d(this.yPA);
    AppMethodBeat.o(31399);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31398);
    ab.i("MicroMsg.ChattingUI.EmojiComponent", "[onChattingEnterAnimEnd]");
    com.tencent.mm.sdk.b.a.xxA.c(this.yPA);
    AppMethodBeat.o(31398);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.o
 * JD-Core Version:    0.6.2
 */
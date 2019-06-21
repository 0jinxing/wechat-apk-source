package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView;
import com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.j;
import com.tencent.mm.ui.chatting.c.b.m;
import com.tencent.mm.ui.chatting.s.n;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class k$d extends c
  implements s.n
{
  private com.tencent.mm.ui.chatting.d.a yJI;
  protected k.a zdS;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32946);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969088);
      ((View)localObject).setTag(new k.b().z((View)localObject, false));
    }
    AppMethodBeat.o(32946);
    return localObject;
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32950);
    if (parambi.bAA())
    {
      l.al(parambi);
      bf.fm(parambi.field_msgId);
      parama.qp(true);
      AppMethodBeat.o(32950);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(32950);
    }
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32947);
    this.yJI = parama1;
    ((j)parama1.aF(j.class)).bg(parambi);
    k.b localb = (k.b)parama;
    String str1 = null;
    paramString = null;
    String str3;
    if (parambi != null)
    {
      String str2 = parambi.field_content;
      ap localap = ap.aps(parambi.field_content);
      str3 = null;
      parama = str3;
      if (!localap.fWX)
      {
        if (str2 != null)
          paramString = j.b.X(str2, parambi.field_reserved);
        parama = str3;
        str1 = paramString;
        if (paramString != null)
        {
          parama = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramString.fgq);
          str1 = paramString;
        }
      }
      if ((localap.cvZ == null) || (localap.cvZ.equals("-1")) || (parama != null))
        break label716;
      parama = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(localap.cvZ);
    }
    label265: label695: label716: 
    while (true)
    {
      int i;
      if ((parama != null) && (parama.duP()))
      {
        parama.talker = parambi.field_talker;
        localb.zdM.a(parama, parambi.field_msgId);
        paramString = localb.zdM;
        if (paramString.vpQ != null)
          paramString.vpQ.resume();
        if (parambi.field_status != 1)
        {
          i = 1;
          paramString = localb.pyf;
          if (i == 0)
            break label461;
          i = 8;
          paramString.setVisibility(i);
          a(parambi, parama);
          if (dHm())
          {
            if ((parambi == null) || (parambi.field_status != 2) || (!a((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi.field_msgId)))
              break label695;
            if (localb.zci != null)
              localb.zci.setVisibility(0);
          }
        }
      }
      while (true)
      {
        localb.zdM.setTag(new ay(parambi, parama1.dFx(), paramInt, parama1.dFu(), '\000'));
        parama = localb.zdM;
        if (this.zdS == null)
          this.zdS = new k.a(parama1);
        parama.setOnClickListener(this.zdS);
        localb.zdM.setOnLongClickListener(c(parama1));
        localb.zdM.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
        a(paramInt, localb, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
        AppMethodBeat.o(32947);
        return;
        i = 0;
        break;
        label461: i = 0;
        break label265;
        str3 = o.ahl().I(parambi.field_imgPath, true);
        paramString = o.ahp().sB(str3);
        if (paramString != null)
        {
          parama = paramString;
          if (!paramString.isRecycled());
        }
        else
        {
          parama = com.tencent.mm.sdk.platformtools.d.decodeFile(str3, null);
          o.ahp().j(str3, parama);
        }
        localb.pyf.setVisibility(8);
        localb.zdP.setVisibility(0);
        localb.zdO.setVisibility(8);
        paramString = localb.zdQ;
        if (str1 == null);
        for (long l = 0L; ; l = str1.fgo)
        {
          paramString.setText(ah.ga(l));
          localb.zdQ.setVisibility(0);
          localb.zdP.setImageResource(2130838558);
          if (parama != null)
          {
            paramString = parama;
            if (!parama.isRecycled());
          }
          else
          {
            paramString = com.tencent.mm.sdk.platformtools.d.v(this.yJI.yTx.getMMResources().getDrawable(2130837803));
          }
          localb.zdM.setImageBitmap(paramString);
          if ((str1 == null) || (bo.isNullOrNil(str1.fgq)))
            break;
          k.b.zdR.put(str1.fgq, new WeakReference(localb));
          break;
        }
        if (localb.zci != null)
          localb.zci.setVisibility(8);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32948);
    aw.ZK();
    int i;
    Object localObject;
    j.b localb;
    if (com.tencent.mm.model.c.isSDCardAvailable())
    {
      i = ((ay)paramView.getTag()).position;
      localObject = ap.aps(parambi.field_content);
      localb = j.b.X(parambi.field_content, parambi.field_reserved);
      if (localb != null)
        break label566;
      localb = new j.b();
      localb.fgq = ((ap)localObject).cvZ;
    }
    label530: label542: label566: 
    while (true)
    {
      if ((!ah.isNullOrNil(localb.fgq)) && (!localb.fgq.equals("-1")))
      {
        localObject = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(localb.fgq);
        if (localObject == null)
          break label542;
        if ((((EmojiInfo)localObject).field_catalog != EmojiInfo.yal) && (!((EmojiInfo)localObject).duS()))
          paramContextMenu.add(i, 104, 0, paramView.getContext().getString(2131298167));
        com.tencent.mm.plugin.report.service.h.pYm.e(12789, new Object[] { Integer.valueOf(0), ((EmojiInfo)localObject).Aq(), Integer.valueOf(0), ((EmojiInfo)localObject).field_designerID, ((EmojiInfo)localObject).field_groupId, "", "", "", "", ((EmojiInfo)localObject).field_activityid });
        boolean bool = ((EmojiInfo)localObject).duP();
        if ((((EmojiInfo)localObject).field_catalog == EmojiInfo.yal) || (bo.isNullOrNil(((EmojiInfo)localObject).field_groupId)) || ((!bo.isNullOrNil(((EmojiInfo)localObject).field_groupId)) && (((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Ji(((EmojiInfo)localObject).field_groupId))))
        {
          if (!bool)
            break label530;
          paramContextMenu.add(i, 113, 0, 2131302491);
        }
        if (((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjR())
          paramContextMenu.add(i, 135, 0, paramView.getContext().getString(2131298157));
      }
      while (true)
      {
        if (parambi.field_status == 5)
          paramContextMenu.add(i, 103, 0, paramView.getContext().getString(2131298217));
        if ((!parambi.drC()) && (parambi.dty()) && ((parambi.field_status == 2) || (parambi.dJz == 1)) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)))
          paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
        if (!this.yJI.dFy())
          paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298152));
        AppMethodBeat.o(32948);
        return true;
        ab.i("MicroMsg.ChattingItemAppMsgEmojiTo", "emoji file no exist. cannot save or resend.");
        break;
        ab.i("MicroMsg.ChattingItemAppMsgEmojiTo", "emoji is null. app content md5 is :%s", new Object[] { localb.fgq });
      }
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32949);
    boolean bool = ((m)parama.aF(m.class)).a(paramMenuItem, parama, parambi);
    AppMethodBeat.o(32949);
    return bool;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 1048625));
    for (paramBoolean = true; ; paramBoolean = false)
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
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.k.d
 * JD-Core Version:    0.6.2
 */
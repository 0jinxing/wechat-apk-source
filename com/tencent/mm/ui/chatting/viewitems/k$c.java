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
import com.tencent.mm.model.bh;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.j;
import com.tencent.mm.ui.chatting.c.b.m;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class k$c extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;
  protected k.a zdS;

  private k.a j(com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(32940);
    if (this.zdS == null)
      this.zdS = new k.a(parama);
    parama = this.zdS;
    AppMethodBeat.o(32940);
    return parama;
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32941);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969051);
      ((View)localObject).setTag(new k.b().z((View)localObject, true));
    }
    AppMethodBeat.o(32941);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32942);
    this.yJI = parama1;
    ((j)parama1.aF(j.class)).bg(parambi);
    k.b localb = (k.b)parama;
    parama = parambi.field_content;
    if (parama != null);
    for (j.b localb1 = j.b.X(parama, parambi.field_reserved); ; localb1 = null)
    {
      if ((localb1 != null) && (localb1.fgq != null));
      for (Object localObject = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(localb1.fgq); ; localObject = null)
      {
        long l;
        if ((localObject == null) || (!((EmojiInfo)localObject).duP()))
        {
          String str = o.ahl().I(parambi.field_imgPath, true);
          Bitmap localBitmap = o.ahp().sB(str);
          if (localBitmap != null)
          {
            parama = localBitmap;
            if (!localBitmap.isRecycled());
          }
          else
          {
            parama = com.tencent.mm.sdk.platformtools.d.decodeFile(str, null);
            o.ahp().j(str, parama);
          }
          if (localObject == null)
          {
            localb.zdP.setVisibility(0);
            localb.zdO.setVisibility(8);
            localObject = localb.zdQ;
            if (localb1 == null)
            {
              l = 0L;
              ((TextView)localObject).setText(ah.ga(l));
              localb.zdQ.setVisibility(0);
              localb.zdP.setImageResource(2130838558);
              label228: if ((localb1 != null) && (!bo.isNullOrNil(localb1.fgq)))
                k.b.zdR.put(localb1.fgq, new WeakReference(localb));
              if ((parama != null) && (!parama.isRecycled()))
                break label595;
              parama = com.tencent.mm.sdk.platformtools.d.v(this.yJI.yTx.getMMResources().getDrawable(2130837803));
            }
          }
        }
        label595: 
        while (true)
        {
          localb.zdM.setImageBitmap(parama);
          while (true)
          {
            localb.zdM.setTag(new ay(parambi, parama1.dFx(), paramInt, paramString, '\000'));
            localb.zdM.setOnClickListener(j(parama1));
            localb.zdM.setOnLongClickListener(c(parama1));
            localb.zdM.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
            localb.zdP.setOnClickListener(j(parama1));
            localb.zdP.setOnLongClickListener(c(parama1));
            localb.zdP.setTag(localb.zdM.getTag());
            AppMethodBeat.o(32942);
            return;
            l = localb1.fgo;
            break;
            localb.zdO.setVisibility(0);
            localb.zdQ.setVisibility(8);
            localb.zdP.setVisibility(8);
            localb.zdO.setProgress(0);
            localb.zdQ.setVisibility(8);
            break label228;
            ((EmojiInfo)localObject).talker = parambi.field_talker;
            localb.zdM.a((EmojiInfo)localObject, parambi.field_msgId);
            localb.zdP.setVisibility(8);
            localb.zdO.setVisibility(8);
            localb.zdQ.setVisibility(8);
            localb.zdP.setVisibility(8);
            if ((localb1 != null) && (!bo.isNullOrNil(localb1.fgq)))
              k.b.zdR.remove(localb1.fgq);
            a(parambi, (EmojiInfo)localObject);
          }
        }
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32944);
    int i = ((ay)paramView.getTag()).position;
    ap localap = ap.aps(parambi.field_content);
    Object localObject = j.b.X(parambi.field_content, parambi.field_reserved);
    if (localObject == null)
    {
      localObject = new j.b();
      ((j.b)localObject).fgq = localap.cvZ;
    }
    while (true)
    {
      if ((!ah.isNullOrNil(((j.b)localObject).fgq)) && (!((j.b)localObject).fgq.equals("-1")))
      {
        localObject = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(((j.b)localObject).fgq);
        if (localObject != null)
        {
          if ((((EmojiInfo)localObject).field_catalog != EmojiInfo.yal) && (!((EmojiInfo)localObject).duS()))
            paramContextMenu.add(i, 104, 0, paramView.getContext().getString(2131298167));
          if (localObject != null)
            com.tencent.mm.plugin.report.service.h.pYm.e(12789, new Object[] { Integer.valueOf(0), ((EmojiInfo)localObject).Aq(), Integer.valueOf(0), ((EmojiInfo)localObject).field_designerID, ((EmojiInfo)localObject).field_groupId, "", "", "", "", ((EmojiInfo)localObject).field_activityid });
          boolean bool = ((EmojiInfo)localObject).duP();
          if ((((EmojiInfo)localObject).field_catalog == EmojiInfo.yal) || (bo.isNullOrNil(((EmojiInfo)localObject).field_groupId)) || ((!bo.isNullOrNil(((EmojiInfo)localObject).field_groupId)) && (((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Ji(((EmojiInfo)localObject).field_groupId))))
          {
            if (!bool)
              break label436;
            paramContextMenu.add(i, 113, 0, 2131302491);
          }
        }
      }
      while (true)
      {
        if (((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjR())
          paramContextMenu.add(i, 135, 0, paramView.getContext().getString(2131298157));
        if (bh.o(parambi))
          paramContextMenu.clear();
        if (!this.yJI.dFy())
          paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298152));
        AppMethodBeat.o(32944);
        return true;
        label436: ab.i("MicroMsg.ChattingItemAppMsgEmojiFrom", "emoji file no exist. cannot save or resend.");
      }
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32945);
    boolean bool = ((m)parama.aF(m.class)).a(paramMenuItem, parama, parambi);
    AppMethodBeat.o(32945);
    return bool;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 1048625));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    return false;
  }

  protected final boolean b(com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(32943);
    boolean bool = parama.dFx();
    AppMethodBeat.o(32943);
    return bool;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.k.c
 * JD-Core Version:    0.6.2
 */
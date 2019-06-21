package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import java.util.Map;

public final class g$b extends c
{
  private a yJI;
  private final int zdx = 1;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32892);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969049);
      ((View)localObject).setTag(new g.a().eU((View)localObject));
    }
    AppMethodBeat.o(32892);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32893);
    this.yJI = parama1;
    paramString = parambi.field_content;
    if (paramString != null);
    for (paramString = j.b.X(paramString, parambi.field_reserved); ; paramString = null)
    {
      g.a locala = (g.a)parama;
      paramString = (com.tencent.mm.af.d)paramString.X(com.tencent.mm.af.d.class);
      if (paramString.cRV == 0)
      {
        locala.zdv.setBackgroundResource(2130839339);
        locala.zdw.setBackgroundResource(2130839326);
        locala.zdu.setVisibility(8);
      }
      while (true)
      {
        parama.jPL.setOnClickListener(d(parama1));
        parama.jPL.setOnLongClickListener(c(parama1));
        parama.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
        parama1 = new ay(parambi, this.yJI.dFx(), paramInt, null, '\000');
        parama.jPL.setTag(parama1);
        AppMethodBeat.o(32893);
        return;
        locala.zdv.setBackgroundResource(2130839340);
        locala.zdw.setBackgroundResource(2130839325);
        locala.zdu.setVisibility(0);
        if (paramString.cRV == 1)
          locala.zdu.setText(ah.getContext().getString(2131301141));
        else if (paramString.cRV == 2)
          locala.zdu.setText(ah.getContext().getString(2131301143));
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32894);
    paramContextMenu.add(((ay)paramView.getTag()).position, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
    AppMethodBeat.o(32894);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(32895);
    paramMenuItem.getItemId();
    AppMethodBeat.o(32895);
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 469762097));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(32896);
    paramView = parambi.field_content;
    if (paramView != null)
    {
      j.b localb = j.b.X(paramView, parambi.field_reserved);
      if (!bo.isNullOrNil(localb.fhZ))
      {
        ab.d("MicroMsg.ChattingItemAppMsgC2CNewYearFrom", "onItemClick play egg emoj");
        com.tencent.mm.af.d locald = (com.tencent.mm.af.d)localb.X(com.tencent.mm.af.d.class);
        paramView = new Intent();
        paramView.putExtra("key_native_url", localb.fhZ);
        paramView.putExtra("key_username", parama.getTalkerUserName());
        paramView.putExtra("key_image_id", localb.fic);
        paramView.putExtra("key_image_aes_key", localb.fid);
        paramView.putExtra("key_image_length", localb.fie);
        paramView.putExtra("key_msgid", parambi.field_msgId);
        paramView.putExtra("key_msg_newyear_localreceivestatus", locald.cRV);
        if (locald.exP != null)
          paramView.putExtra("key_emoji_md5", locald.exP.field_md5);
        com.tencent.mm.bp.d.b(parama.yTx.getContext(), "luckymoney", ".ui.LuckyMoneyNewYearReceiveUI", paramView);
        localb.fia = 1;
        parambi.setContent(j.b.a(localb, null, null));
        if ((parambi != null) && (parambi.bAA()))
          break label239;
      }
    }
    while (true)
    {
      aw.ZK();
      com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
      AppMethodBeat.o(32896);
      return true;
      try
      {
        label239: parama = parambi.field_content;
        int i = parama.indexOf("<msg>");
        paramView = parama;
        if (i > 0)
        {
          paramView = parama;
          if (i < parama.length())
            paramView = parama.substring(i).trim();
        }
        paramView = br.z(paramView, "msg");
        if ((paramView != null) && (paramView.size() > 0))
          parambi.jw(be.aS(paramView));
      }
      catch (Exception paramView)
      {
        ab.e("MicroMsg.ChattingItemAppMsgC2CNewYearFrom", paramView.getMessage());
      }
    }
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.g.b
 * JD-Core Version:    0.6.2
 */
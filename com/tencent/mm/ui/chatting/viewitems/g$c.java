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
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;

public final class g$c extends c
{
  private a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32897);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969087);
      ((View)localObject).setTag(new g.a().eU((View)localObject));
    }
    AppMethodBeat.o(32897);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32898);
    this.yJI = parama1;
    paramString = parambi.field_content;
    if (paramString != null);
    for (paramString = j.b.X(paramString, parambi.field_reserved); ; paramString = null)
    {
      g.a locala = (g.a)parama;
      paramString = (com.tencent.mm.af.d)paramString.X(com.tencent.mm.af.d.class);
      if (paramString.cRV == 0)
      {
        locala.zdv.setBackgroundResource(2130839356);
        locala.zdw.setBackgroundResource(2130839324);
        locala.zdu.setVisibility(8);
      }
      while (true)
      {
        parama.jPL.setOnClickListener(d(parama1));
        parama.jPL.setOnLongClickListener(c(parama1));
        parama.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
        parama1 = new ay(parambi, this.yJI.dFx(), paramInt, null, '\000');
        parama.jPL.setTag(parama1);
        AppMethodBeat.o(32898);
        return;
        locala.zdv.setBackgroundResource(2130839357);
        locala.zdw.setBackgroundResource(2130839325);
        locala.zdu.setVisibility(0);
        if (paramString.cRV == 1)
          locala.zdu.setText(ah.getContext().getString(2131301141));
        else if (paramString.cRV == 2)
          locala.zdu.setText(ah.getContext().getString(2131301144));
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32899);
    paramContextMenu.add(((ay)paramView.getTag()).position, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
    AppMethodBeat.o(32899);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(32900);
    paramMenuItem.getItemId();
    AppMethodBeat.o(32900);
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 469762097));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(32901);
    paramView = parambi.field_content;
    if (paramView != null)
    {
      j.b localb = j.b.X(paramView, parambi.field_reserved);
      if ((localb != null) && (!bo.isNullOrNil(localb.fhZ)))
      {
        com.tencent.mm.af.d locald = (com.tencent.mm.af.d)localb.X(com.tencent.mm.af.d.class);
        paramView = new Intent();
        paramView.putExtra("key_native_url", localb.fhZ);
        paramView.putExtra("key_image_id", localb.fic);
        paramView.putExtra("key_image_aes_key", localb.fid);
        paramView.putExtra("key_image_length", localb.fie);
        paramView.putExtra("key_username", parama.getTalkerUserName());
        paramView.putExtra("key_msgid", parambi.field_msgId);
        paramView.putExtra("key_msg_newyear_localreceivestatus", locald.cRV);
        if (locald.exP != null)
          paramView.putExtra("key_emoji_md5", locald.exP.field_md5);
        com.tencent.mm.bp.d.b(parama.yTx.getContext(), "luckymoney", ".ui.LuckyMoneyNewYearReceiveUI", paramView);
      }
    }
    AppMethodBeat.o(32901);
    return true;
  }

  public final boolean dHk()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.g.c
 * JD-Core Version:    0.6.2
 */
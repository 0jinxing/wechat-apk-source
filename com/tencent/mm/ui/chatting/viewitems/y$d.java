package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.s.e;

public final class y$d extends s.e
{
  public y$d(a parama)
  {
    super(parama);
  }

  public final void a(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(33201);
    parambi = (ay)paramView.getTag();
    aw.ZK();
    if (c.isSDCardAvailable())
    {
      paramView = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.cKd.field_imgPath);
      if ((paramView == null) || (paramView.xy()))
      {
        AppMethodBeat.o(33201);
        return;
      }
      parama = new Intent();
      parama.putExtra("custom_smiley_preview_md5", parambi.cKd.field_imgPath);
      parama.putExtra("custom_to_talker_name", parambi.cKd.field_talker);
      if ((paramView.field_catalog != EmojiGroupInfo.yae) && (paramView.field_catalog != EmojiGroupInfo.yad) && (paramView.field_catalog != EmojiGroupInfo.yac))
        parama.putExtra("custom_smiley_preview_productid", paramView.field_groupId);
      parama.putExtra("msg_id", parambi.cKd.field_msgSvrId);
      parama.putExtra("msg_content", parambi.cKd.field_content);
      paramView = parambi.cKd.field_talker;
      if (!t.kH(paramView))
        break label268;
      paramView = bf.oy(parambi.cKd.field_content);
      parama.putExtra("room_id", this.yJI.getTalkerUserName());
    }
    label268: 
    while (true)
    {
      parama.putExtra("msg_sender", paramView);
      com.tencent.mm.bp.d.b(this.yJI.yTx.getContext(), "emoji", ".ui.CustomSmileyPreviewUI", parama, 1111);
      h.pYm.e(11592, new Object[] { Integer.valueOf(0) });
      AppMethodBeat.o(33201);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.y.d
 * JD-Core Version:    0.6.2
 */
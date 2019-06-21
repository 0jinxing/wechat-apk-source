package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;

final class SnsCommentFooter$6
  implements View.OnClickListener
{
  SnsCommentFooter$6(SnsCommentFooter paramSnsCommentFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38884);
    if (com.tencent.mm.m.g.Nu().getInt("SnsAdAtFriendRedDot", 0) == 1)
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWx, Boolean.FALSE);
    SnsCommentFooter.g(this.rrD).setVisibility(8);
    paramView = new Intent();
    paramView.putExtra("list_attr", 16391);
    paramView.putExtra("block_contact", r.Yz());
    paramView.putExtra("max_limit_num", 1);
    paramView.putExtra("titile", SnsCommentFooter.h(this.rrD).getString(2131303570));
    d.b(SnsCommentFooter.h(this.rrD), ".ui.contact.SelectContactUI", paramView, 2333);
    AppMethodBeat.o(38884);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentFooter.6
 * JD-Core Version:    0.6.2
 */
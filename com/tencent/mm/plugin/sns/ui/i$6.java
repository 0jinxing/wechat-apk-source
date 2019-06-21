package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;

final class i$6
  implements View.OnLongClickListener
{
  i$6(i parami)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(38183);
    g.RQ();
    if (!((Boolean)g.RP().Ry().get(7490, Boolean.TRUE)).booleanValue())
    {
      paramView = new Intent();
      paramView.setClass(i.c(this.rhF), SnsCommentUI.class);
      paramView.putExtra("sns_comment_type", 1);
      ((MMActivity)i.c(this.rhF)).startActivityForResult(paramView, 9);
    }
    while (true)
    {
      AppMethodBeat.o(38183);
      return true;
      i.c(this.rhF).startActivity(new Intent().setClass(i.c(this.rhF), SnsLongMsgUI.class));
      g.RQ();
      g.RP().Ry().set(7490, Boolean.FALSE);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.i.6
 * JD-Core Version:    0.6.2
 */
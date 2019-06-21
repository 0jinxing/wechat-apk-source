package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.kl;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class MPVideoWriteCommentLayout$a$d
  implements View.OnClickListener
{
  MPVideoWriteCommentLayout$a$d(MPVideoWriteCommentLayout.a parama, kl paramkl)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(15284);
    new c.a(MPVideoWriteCommentLayout.a.a(this.jYk)).asD(MPVideoWriteCommentLayout.a.a(this.jYk).getString(2131305829)).asE("").Qe(MPVideoWriteCommentLayout.a.a(this.jYk).getResources().getColor(2131689603)).Qc(2131296994).a((DialogInterface.OnClickListener)new MPVideoWriteCommentLayout.a.d.a(this)).Qd(2131297763).aMb().show();
    AppMethodBeat.o(15284);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWriteCommentLayout.a.d
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ep;
import com.tencent.mm.protocal.protobuf.kl;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class MPVideoCommentView$a$e
  implements View.OnClickListener
{
  MPVideoCommentView$a$e(MPVideoCommentView.a parama, kl paramkl)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(15231);
    new c.a(MPVideoCommentView.a.a(this.jXe)).asD(MPVideoCommentView.a.a(this.jXe).getString(2131305829)).asE("").Qe(MPVideoCommentView.a.a(this.jXe).getResources().getColor(2131689603)).Qc(2131296994).a((DialogInterface.OnClickListener)new a(this)).Qd(2131297763).aMb().show();
    AppMethodBeat.o(15231);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"})
  static final class a
    implements DialogInterface.OnClickListener
  {
    a(MPVideoCommentView.a.e parame)
    {
    }

    public final void onClick(DialogInterface paramDialogInterface, int paramInt)
    {
      AppMethodBeat.i(15230);
      paramDialogInterface = new ep();
      paramDialogInterface.vGr = this.jXo.jXm.vGr;
      paramDialogInterface.kdC = 2;
      this.jXo.jXe.jWx.a(paramDialogInterface);
      AppMethodBeat.o(15230);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoCommentView.a.e
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.el;
import com.tencent.mm.protocal.protobuf.kl;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class MPVideoCommentView$a$f
  implements View.OnClickListener
{
  MPVideoCommentView$a$f(MPVideoCommentView.a parama, kl paramkl, MPVideoCommentView.a.a parama1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(15232);
    paramView = new el();
    kl localkl;
    if (this.jXm.vMP == 0)
    {
      paramView.vGt = 1;
      this.jXm.vMP = 1;
      localkl = this.jXm;
    }
    for (localkl.vMO += 1; ; localkl.vMO -= 1)
    {
      this.jXm.vMO = Math.max(0, this.jXm.vMO);
      paramView.kdC = 1;
      localkl = this.jXm;
      if (localkl == null)
        j.dWJ();
      paramView.vGs = localkl.vGs;
      localkl = this.jXm;
      if (localkl == null)
        j.dWJ();
      paramView.vGr = localkl.vGr;
      this.jXe.jWx.a(paramView);
      MPVideoCommentView.a.a(this.jXe, this.jXm, this.jXn);
      AppMethodBeat.o(15232);
      return;
      paramView.vGt = 0;
      this.jXm.vMP = 0;
      localkl = this.jXm;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoCommentView.a.f
 * JD-Core Version:    0.6.2
 */
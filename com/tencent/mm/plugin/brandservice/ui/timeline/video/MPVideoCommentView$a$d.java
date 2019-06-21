package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.el;
import com.tencent.mm.protocal.protobuf.kl;
import com.tencent.mm.protocal.protobuf.tp;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class MPVideoCommentView$a$d
  implements View.OnClickListener
{
  MPVideoCommentView$a$d(MPVideoCommentView.a parama, tp paramtp, kl paramkl, MPVideoCommentView.a.a parama1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(15229);
    paramView = new el();
    Object localObject;
    if (this.jXl.waK == 0)
    {
      paramView.vGt = 1;
      this.jXl.waK = 1;
      localObject = this.jXl;
    }
    for (((tp)localObject).waJ += 1; ; ((tp)localObject).waJ -= 1)
    {
      this.jXl.waJ = Math.max(0, this.jXl.waJ);
      paramView.kdC = 2;
      localObject = this.jXm;
      if (localObject == null)
        j.dWJ();
      paramView.vGs = ((kl)localObject).vGs;
      localObject = this.jXm;
      if (localObject == null)
        j.dWJ();
      paramView.vGr = ((kl)localObject).vGr;
      paramView.vGu = this.jXl.vGu;
      this.jXe.jWx.a(paramView);
      MPVideoCommentView.a.a(this.jXe, this.jXl, this.jXn);
      AppMethodBeat.o(15229);
      return;
      paramView.vGt = 0;
      this.jXl.waK = 0;
      localObject = this.jXl;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoCommentView.a.d
 * JD-Core Version:    0.6.2
 */
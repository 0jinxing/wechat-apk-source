package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class MPVideoHeaderView$1
  implements View.OnClickListener
{
  MPVideoHeaderView$1(MPVideoHeaderView paramMPVideoHeaderView, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(15251);
    if ((MPVideoHeaderView.e(this.jXL).fgc & 0x1) != 0)
    {
      ab.w(MPVideoHeaderView.i(this.jXL), "not allow jump to profile " + MPVideoHeaderView.e(this.jXL).fgc);
      AppMethodBeat.o(15251);
    }
    while (true)
    {
      return;
      paramView = new Intent();
      paramView.putExtra("Contact_User", MPVideoHeaderView.c(this.jXL));
      paramView.putExtra("Contact_Scene", 152);
      d.b(this.jWS, "profile", ".ui.ContactInfoUI", paramView);
      AppMethodBeat.o(15251);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoHeaderView.1
 * JD-Core Version:    0.6.2
 */
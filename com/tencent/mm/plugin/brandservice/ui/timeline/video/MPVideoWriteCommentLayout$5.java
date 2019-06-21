package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import a.v;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.widget.MPSmileyFooter;
import com.tencent.mm.protocal.protobuf.ep;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class MPVideoWriteCommentLayout$5
  implements View.OnClickListener
{
  MPVideoWriteCommentLayout$5(MPVideoWriteCommentLayout paramMPVideoWriteCommentLayout, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(15279);
    if (MPVideoWriteCommentLayout.g(this.jYh) != null)
      if (MPVideoWriteCommentLayout.h(this.jYh))
      {
        MPVideoWriteCommentLayout.g(this.jYh).ao(4, MPVideoWriteCommentLayout.e(this.jYh).getText().toString());
        this.jYh.hide();
        AppMethodBeat.o(15279);
      }
    while (true)
    {
      return;
      paramView = this.jWS;
      if (paramView == null)
      {
        paramView = new v("null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        AppMethodBeat.o(15279);
        throw paramView;
      }
      ((MMActivity)paramView).aqX();
      if (MPVideoWriteCommentLayout.b(this.jYh).aYV())
        MPVideoWriteCommentLayout.b(this.jYh).aYW();
      paramView = new ep();
      paramView.content = MPVideoWriteCommentLayout.e(this.jYh).getText().toString();
      paramView.kdC = 1;
      MPVideoWriteCommentLayout.g(this.jYh).a(paramView);
      AppMethodBeat.o(15279);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWriteCommentLayout.5
 * JD-Core Version:    0.6.2
 */
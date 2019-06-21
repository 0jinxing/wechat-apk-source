package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class AbstractVideoView$7
  implements View.OnClickListener
{
  AbstractVideoView$7(AbstractVideoView paramAbstractVideoView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(117940);
    ab.i(this.vgH.TAG, "%s seek bar play button on click ", new Object[] { this.vgH.aZk() });
    paramView = this.vgH;
    if (paramView.klq != null)
      if (paramView.isPlaying())
      {
        paramView.pause();
        AppMethodBeat.o(117940);
      }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramView.klq.getVideoPath()))
      {
        paramView.start();
        AppMethodBeat.o(117940);
      }
      else
      {
        paramView.play();
        AppMethodBeat.o(117940);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.AbstractVideoView.7
 * JD-Core Version:    0.6.2
 */
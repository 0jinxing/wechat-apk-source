package com.tencent.xweb.extension.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;

final class d$15
  implements View.OnClickListener
{
  d$15(d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(84590);
    d.b(this.AOs).evaluateJavascript("xwebVideoBridge.xwebToJS_Video_ExitFullscreen();", new d.15.1(this));
    AppMethodBeat.o(84590);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.d.15
 * JD-Core Version:    0.6.2
 */
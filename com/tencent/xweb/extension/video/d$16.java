package com.tencent.xweb.extension.video;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;

final class d$16
  implements View.OnClickListener
{
  d$16(d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(84591);
    d.b(this.AOs).evaluateJavascript("xwebVideoBridge.xwebToJS_Video_Play();", new ValueCallback()
    {
    });
    this.AOs.dUr();
    AppMethodBeat.o(84591);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.d.16
 * JD-Core Version:    0.6.2
 */
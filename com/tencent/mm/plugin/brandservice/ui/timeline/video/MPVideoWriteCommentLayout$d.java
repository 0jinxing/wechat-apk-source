package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import a.v;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class MPVideoWriteCommentLayout$d
  implements Runnable
{
  MPVideoWriteCommentLayout$d(MPVideoWriteCommentLayout paramMPVideoWriteCommentLayout)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(15296);
    MPVideoWriteCommentLayout.d(this.jYh);
    Object localObject = this.jYh.getContext().getSystemService("input_method");
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
      AppMethodBeat.o(15296);
      throw ((Throwable)localObject);
    }
    localObject = (InputMethodManager)localObject;
    if (localObject != null)
    {
      ((InputMethodManager)localObject).showSoftInput((View)MPVideoWriteCommentLayout.e(this.jYh), 0);
      AppMethodBeat.o(15296);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(15296);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWriteCommentLayout.d
 * JD-Core Version:    0.6.2
 */
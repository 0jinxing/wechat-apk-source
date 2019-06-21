package com.tencent.mm.plugin.topstory.ui.widget;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStoryCommentFloatDialog$4
  implements Runnable
{
  TopStoryCommentFloatDialog$4(TopStoryCommentFloatDialog paramTopStoryCommentFloatDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2246);
    e locale = this.sIq.sIl;
    if ((!locale.isShowing()) && (locale.sIi.getWindowToken() != null))
    {
      locale.setBackgroundDrawable(new ColorDrawable(0));
      locale.showAtLocation(locale.sIi, 0, 0, 0);
    }
    AppMethodBeat.o(2246);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog.4
 * JD-Core Version:    0.6.2
 */
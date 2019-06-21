package com.tencent.mm.plugin.topstory.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStoryCommentFloatDialog$8
  implements View.OnClickListener
{
  TopStoryCommentFloatDialog$8(TopStoryCommentFloatDialog paramTopStoryCommentFloatDialog)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2249);
    if (this.sIq.getVisibility() == 0)
      this.sIq.hide();
    AppMethodBeat.o(2249);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog.8
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.chatting.l.a;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.view.MMChattingListView;
import java.lang.ref.WeakReference;

final class c$a$1
  implements Runnable
{
  c$a$1(c.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32722);
    MMChattingListView localMMChattingListView = (MMChattingListView)this.zav.zar.get();
    if (localMMChattingListView != null)
    {
      localMMChattingListView.getListView().setTranscriptMode(1);
      localMMChattingListView.setIsTopShowAll(this.zat);
      localMMChattingListView.setIsBottomShowAll(this.zau);
    }
    AppMethodBeat.o(32722);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.a.c.a.1
 * JD-Core Version:    0.6.2
 */
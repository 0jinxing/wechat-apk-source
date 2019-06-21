package com.tencent.mm.ui.conversation;

import android.database.DataSetObserver;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ConversationWithAppBrandListView$11 extends DataSetObserver
{
  int zts = -1;

  ConversationWithAppBrandListView$11(ConversationWithAppBrandListView paramConversationWithAppBrandListView, ListAdapter paramListAdapter)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(34277);
    boolean bool;
    if (this.zts != this.ztt.getCount())
    {
      if (this.zts <= this.ztt.getCount())
        break label108;
      bool = true;
      ab.i("MicroMsg.ConversationWithAppBrandListView", "[onChanged] isDelete:%s", new Object[] { Boolean.valueOf(bool) });
      if (this.zts <= this.ztt.getCount())
        break label113;
      ConversationWithAppBrandListView.a(this.ztq, false);
      ConversationWithAppBrandListView.a(this.ztq, true);
    }
    while (true)
    {
      this.zts = this.ztt.getCount();
      AppMethodBeat.o(34277);
      return;
      label108: bool = false;
      break;
      label113: ConversationWithAppBrandListView.a(this.ztq);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView.11
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;

final class GroupCardSelectUI$1
  implements AdapterView.OnItemClickListener
{
  GroupCardSelectUI$1(GroupCardSelectUI paramGroupCardSelectUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(33728);
    paramAdapterView = (ad)GroupCardSelectUI.a(this.zmK).getItem(paramInt);
    if (paramAdapterView == null)
    {
      ab.v("MicroMsg.GroupCardSelectUI", "onItemClick contact null");
      AppMethodBeat.o(33728);
    }
    while (true)
    {
      return;
      GroupCardSelectUI.a(this.zmK, paramAdapterView);
      GroupCardSelectUI.b(this.zmK);
      AppMethodBeat.o(33728);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.GroupCardSelectUI.1
 * JD-Core Version:    0.6.2
 */
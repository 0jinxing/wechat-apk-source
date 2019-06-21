package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.ui.widget.b.a;

final class SettingCheckUnProcessWalletConvUI$4
  implements AdapterView.OnItemLongClickListener
{
  SettingCheckUnProcessWalletConvUI$4(SettingCheckUnProcessWalletConvUI paramSettingCheckUnProcessWalletConvUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(34616);
    paramAdapterView = SettingCheckUnProcessWalletConvUI.b(this.zvJ).Py(paramInt - SettingCheckUnProcessWalletConvUI.c(this.zvJ).getHeaderViewsCount());
    if (paramAdapterView == null)
      AppMethodBeat.o(34616);
    while (true)
    {
      return true;
      String str = paramAdapterView.field_username;
      a locala = new a(this.zvJ);
      locala.zRZ = new SettingCheckUnProcessWalletConvUI.4.1(this);
      locala.a(paramView, paramInt, paramLong, this.zvJ, new SettingCheckUnProcessWalletConvUI.4.2(this, str, paramAdapterView), SettingCheckUnProcessWalletConvUI.a(this.zvJ)[0], SettingCheckUnProcessWalletConvUI.a(this.zvJ)[1]);
      AppMethodBeat.o(34616);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI.4
 * JD-Core Version:    0.6.2
 */
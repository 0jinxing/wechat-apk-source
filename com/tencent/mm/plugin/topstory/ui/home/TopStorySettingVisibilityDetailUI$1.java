package com.tencent.mm.plugin.topstory.ui.home;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import java.util.Iterator;
import java.util.List;

final class TopStorySettingVisibilityDetailUI$1
  implements DialogInterface.OnClickListener
{
  TopStorySettingVisibilityDetailUI$1(TopStorySettingVisibilityDetailUI paramTopStorySettingVisibilityDetailUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(1635);
    Iterator localIterator = this.sCO.sCM.iterator();
    while (localIterator.hasNext())
    {
      paramDialogInterface = (String)localIterator.next();
      this.sCO.kPL.remove(paramDialogInterface);
    }
    if (this.sCO.ehS != null)
    {
      this.sCO.ehS.ci(this.sCO.kPL);
      this.sCO.ehS.notifyChanged();
    }
    this.sCO.sCM.clear();
    TopStorySettingVisibilityDetailUI.a(this.sCO);
    this.sCO.updateTitle();
    AppMethodBeat.o(1635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.account.friend.ui;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.b;
import java.util.HashMap;

final class InviteFriendUI$1$2
  implements n.b
{
  InviteFriendUI$1$2(InviteFriendUI.1 param1, HashMap paramHashMap, PackageManager paramPackageManager)
  {
  }

  public final void a(TextView paramTextView, MenuItem paramMenuItem)
  {
    AppMethodBeat.i(108572);
    paramMenuItem = paramMenuItem.getTitle();
    paramMenuItem = ((ResolveInfo)this.gxz.get(paramMenuItem)).loadLabel(this.gxA);
    if (paramMenuItem != null)
    {
      paramTextView.setText(paramMenuItem.toString());
      AppMethodBeat.o(108572);
    }
    while (true)
    {
      return;
      paramTextView.setText("");
      AppMethodBeat.o(108572);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.InviteFriendUI.1.2
 * JD-Core Version:    0.6.2
 */
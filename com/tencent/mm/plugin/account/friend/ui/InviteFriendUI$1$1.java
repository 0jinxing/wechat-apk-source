package com.tencent.mm.plugin.account.friend.ui;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.a;
import java.util.HashMap;

final class InviteFriendUI$1$1
  implements n.a
{
  InviteFriendUI$1$1(InviteFriendUI.1 param1, HashMap paramHashMap, PackageManager paramPackageManager)
  {
  }

  public final void a(ImageView paramImageView, MenuItem paramMenuItem)
  {
    AppMethodBeat.i(108571);
    paramMenuItem = paramMenuItem.getTitle();
    paramImageView.setImageDrawable(((ResolveInfo)this.gxz.get(paramMenuItem)).loadIcon(this.gxA));
    AppMethodBeat.o(108571);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.InviteFriendUI.1.1
 * JD-Core Version:    0.6.2
 */
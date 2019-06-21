package com.tencent.mm.plugin.account.friend.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.d;
import java.util.HashMap;

final class InviteFriendUI$1$4
  implements n.d
{
  InviteFriendUI$1$4(InviteFriendUI.1 param1, HashMap paramHashMap, Uri paramUri, String paramString)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(108574);
    paramMenuItem = paramMenuItem.getTitle();
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(((ResolveInfo)this.gxz.get(paramMenuItem)).activityInfo.packageName, ((ResolveInfo)this.gxz.get(paramMenuItem)).activityInfo.name));
    localIntent.setAction("android.intent.action.SENDTO");
    localIntent.setData(this.gxC);
    localIntent.putExtra("sms_body", this.gxD);
    this.gxB.gxy.startActivity(localIntent);
    AppMethodBeat.o(108574);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.InviteFriendUI.1.4
 * JD-Core Version:    0.6.2
 */
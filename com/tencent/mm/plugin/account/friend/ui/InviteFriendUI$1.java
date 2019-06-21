package com.tencent.mm.plugin.account.friend.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.account.a.a.a;
import com.tencent.mm.plugin.account.friend.a.o;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.tools.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class InviteFriendUI$1
  implements View.OnClickListener
{
  InviteFriendUI$1(InviteFriendUI paramInviteFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(108577);
    switch (InviteFriendUI.a(this.gxy))
    {
    default:
    case 1:
    case 0:
    case 2:
    }
    label669: 
    while (true)
    {
      AppMethodBeat.o(108577);
      while (true)
      {
        return;
        localObject1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(42, "");
        if (localObject1 != null)
        {
          paramView = (View)localObject1;
          if (((String)localObject1).length() != 0);
        }
        else
        {
          paramView = (String)com.tencent.mm.kernel.g.RP().Ry().get(2, "");
        }
        paramView = this.gxy.getString(2131300655, new Object[] { paramView });
        localObject1 = Uri.parse("smsto:" + InviteFriendUI.b(this.gxy));
        localObject2 = new Intent("android.intent.action.SENDTO", (Uri)localObject1);
        ((Intent)localObject2).putExtra("sms_body", paramView);
        Object localObject3 = this.gxy.getPackageManager();
        Object localObject4 = ((PackageManager)localObject3).queryIntentActivities((Intent)localObject2, 65536);
        localObject2 = new HashMap();
        Iterator localIterator = ((List)localObject4).iterator();
        while (localIterator.hasNext())
        {
          localObject4 = (ResolveInfo)localIterator.next();
          if (!((ResolveInfo)localObject4).activityInfo.packageName.equals("com.whatsapp"))
            ((HashMap)localObject2).put(((ResolveInfo)localObject4).activityInfo.name, localObject4);
        }
        if (((HashMap)localObject2).size() == 1)
        {
          localObject3 = ((HashMap)localObject2).keySet().iterator();
          if (((Iterator)localObject3).hasNext())
          {
            localObject4 = (String)((Iterator)localObject3).next();
            localObject3 = new Intent();
            ((Intent)localObject3).setComponent(new ComponentName(((ResolveInfo)((HashMap)localObject2).get(localObject4)).activityInfo.packageName, ((ResolveInfo)((HashMap)localObject2).get(localObject4)).activityInfo.name));
            ((Intent)localObject3).setAction("android.intent.action.SENDTO");
            ((Intent)localObject3).setData((Uri)localObject1);
            ((Intent)localObject3).putExtra("sms_body", paramView);
            this.gxy.startActivity((Intent)localObject3);
            InviteFriendUI.c(this.gxy);
          }
          AppMethodBeat.o(108577);
        }
        else if (((HashMap)localObject2).size() > 1)
        {
          localObject4 = new j(this.gxy);
          ((j)localObject4).zFT = new InviteFriendUI.1.1(this, (HashMap)localObject2, (PackageManager)localObject3);
          ((j)localObject4).zFU = new InviteFriendUI.1.2(this, (HashMap)localObject2, (PackageManager)localObject3);
          ((j)localObject4).rBl = new InviteFriendUI.1.3(this, (HashMap)localObject2);
          ((j)localObject4).rBm = new InviteFriendUI.1.4(this, (HashMap)localObject2, (Uri)localObject1, paramView);
          ((j)localObject4).cuu();
          InviteFriendUI.c(this.gxy);
          AppMethodBeat.o(108577);
        }
        else
        {
          Toast.makeText(this.gxy, 2131302910, 1).show();
          AppMethodBeat.o(108577);
          continue;
          int i = com.tencent.mm.a.p.cB(InviteFriendUI.b(this.gxy));
          new g(this.gxy, new InviteFriendUI.1.5(this)).m(new int[] { i });
          AppMethodBeat.o(108577);
        }
      }
      paramView = new h(this.gxy, new InviteFriendUI.1.6(this));
      Object localObject2 = InviteFriendUI.e(this.gxy);
      Object localObject1 = InviteFriendUI.b(this.gxy);
      com.tencent.mm.kernel.g.Rg().a(489, paramView);
      localObject2 = ((o)((a)com.tencent.mm.kernel.g.M(a.class)).getGoogleFriendStorage()).wg((String)localObject2);
      if ((localObject2 == null) || (((Cursor)localObject2).getCount() <= 1))
        paramView.wm((String)localObject1);
      while (true)
      {
        if (localObject2 == null)
          break label669;
        ((Cursor)localObject2).close();
        break;
        paramView.e((Cursor)localObject2);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.InviteFriendUI.1
 * JD-Core Version:    0.6.2
 */
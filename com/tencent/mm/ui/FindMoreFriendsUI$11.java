package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bn.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.z;

final class FindMoreFriendsUI$11
  implements DialogInterface.OnClickListener
{
  FindMoreFriendsUI$11(FindMoreFriendsUI paramFindMoreFriendsUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29221);
    if (FindMoreFriendsUI.u(this.yhB) != null)
    {
      aw.ZK();
      paramDialogInterface = c.Ry();
      if (FindMoreFriendsUI.u(this.yhB).isChecked())
        break label94;
    }
    label94: for (boolean bool = true; ; bool = false)
    {
      paramDialogInterface.set(4104, Boolean.valueOf(bool));
      paramDialogInterface = (LauncherUI)this.yhB.getContext();
      if (paramDialogInterface != null)
        paramDialogInterface.yjJ.getMainTabUI().aqG("tab_find_friend");
      a.fy(this.yhB.getContext());
      AppMethodBeat.o(29221);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.11
 * JD-Core Version:    0.6.2
 */
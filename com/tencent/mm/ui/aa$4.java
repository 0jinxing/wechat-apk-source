package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bn.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.z;

final class aa$4
  implements DialogInterface.OnClickListener
{
  aa$4(aa paramaa, CheckBox paramCheckBox)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29842);
    if (this.sSq != null)
    {
      aw.ZK();
      paramDialogInterface = c.Ry();
      if (this.sSq.isChecked())
        break label81;
    }
    label81: for (boolean bool = true; ; bool = false)
    {
      paramDialogInterface.set(4104, Boolean.valueOf(bool));
      paramDialogInterface = LauncherUI.getInstance();
      if (paramDialogInterface != null)
        paramDialogInterface.yjJ.getMainTabUI().aqG("tab_find_friend");
      a.fy(aa.c(this.ypL));
      AppMethodBeat.o(29842);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.aa.4
 * JD-Core Version:    0.6.2
 */
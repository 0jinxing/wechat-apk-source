package org.xwalk.core;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

class XWalkDialogManager$1
  implements DialogInterface.OnShowListener
{
  XWalkDialogManager$1(XWalkDialogManager paramXWalkDialogManager, ArrayList paramArrayList, AlertDialog paramAlertDialog)
  {
  }

  public void onShow(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(85603);
    Iterator localIterator = this.val$actions.iterator();
    while (localIterator.hasNext())
    {
      XWalkDialogManager.ButtonAction localButtonAction = (XWalkDialogManager.ButtonAction)localIterator.next();
      paramDialogInterface = this.val$dialog.getButton(localButtonAction.mWhich);
      if (paramDialogInterface == null)
      {
        if (localButtonAction.mMandatory)
        {
          paramDialogInterface = new RuntimeException("Button " + localButtonAction.mWhich + " is mandatory");
          AppMethodBeat.o(85603);
          throw paramDialogInterface;
        }
      }
      else if (localButtonAction.mClickAction != null)
        paramDialogInterface.setOnClickListener(new XWalkDialogManager.1.1(this, localButtonAction.mClickAction));
    }
    AppMethodBeat.o(85603);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkDialogManager.1
 * JD-Core Version:    0.6.2
 */
package org.xwalk.core;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class XWalkDialogManager$1$1
  implements View.OnClickListener
{
  XWalkDialogManager$1$1(XWalkDialogManager.1 param1, Runnable paramRunnable)
  {
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(85602);
    this.this$1.this$0.dismissDialog();
    this.val$command.run();
    AppMethodBeat.o(85602);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkDialogManager.1.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.conversation;

import android.support.v4.app.FragmentActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MainUI$10
  implements Runnable
{
  MainUI$10(MainUI paramMainUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34503);
    if (this.zvg.thisActivity() != null)
      this.zvg.thisActivity().supportInvalidateOptionsMenu();
    AppMethodBeat.o(34503);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.MainUI.10
 * JD-Core Version:    0.6.2
 */
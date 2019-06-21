package com.tencent.mm.ui;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class FindMoreFriendsUI$1 extends ak
{
  FindMoreFriendsUI$1(FindMoreFriendsUI paramFindMoreFriendsUI, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(29207);
    switch (paramMessage.what)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(29207);
      return;
      if (FindMoreFriendsUI.a(this.yhB) != null)
        FindMoreFriendsUI.b(this.yhB);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.1
 * JD-Core Version:    0.6.2
 */
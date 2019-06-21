package com.tencent.mm.plugin.account.friend.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class QQFriendUI$3
  implements d.a
{
  QQFriendUI$3(QQFriendUI paramQQFriendUI)
  {
  }

  public final void mT(int paramInt)
  {
    AppMethodBeat.i(108615);
    if (QQFriendUI.a(this.gxX))
    {
      if (paramInt <= 0)
        break label46;
      QQFriendUI.b(this.gxX).setVisibility(8);
    }
    while (true)
    {
      QQFriendUI.a(this.gxX, false);
      AppMethodBeat.o(108615);
      return;
      label46: QQFriendUI.b(this.gxX).setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.QQFriendUI.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.chatroom.ui;

import android.os.Build.VERSION;
import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SeeRoomMemberUI$1
  implements Runnable
{
  SeeRoomMemberUI$1(SeeRoomMemberUI paramSeeRoomMemberUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104308);
    if (Build.VERSION.SDK_INT >= 19)
    {
      SeeRoomMemberUI.b(this.elX).scrollListBy(SeeRoomMemberUI.a(this.elX));
      AppMethodBeat.o(104308);
    }
    while (true)
    {
      return;
      GridView localGridView = SeeRoomMemberUI.b(this.elX);
      int i = -SeeRoomMemberUI.a(this.elX);
      int j = -SeeRoomMemberUI.a(this.elX);
      Class localClass1 = Integer.TYPE;
      Class localClass2 = Integer.TYPE;
      SeeRoomMemberUI.a(localGridView, "trackMotionScroll", new Object[] { Integer.valueOf(i), Integer.valueOf(j) }, new Class[] { localClass1, localClass2 });
      AppMethodBeat.o(104308);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomMemberUI.1
 * JD-Core Version:    0.6.2
 */
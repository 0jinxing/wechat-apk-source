package com.tencent.mm.chatroom.ui;

import android.content.res.Resources;
import android.widget.GridView;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SeeRoomManagerUI$2
  implements Runnable
{
  SeeRoomManagerUI$2(SeeRoomManagerUI paramSeeRoomManagerUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104283);
    int i = (int)(this.elM.getResources().getDimension(2131427504) + this.elM.getResources().getDimension(2131427804) + this.elM.getResources().getDimension(2131427864));
    int j = i;
    if (SeeRoomManagerUI.a(this.elM).getCount() / 4 > 0)
      j = i * (SeeRoomManagerUI.a(this.elM).getCount() / 4 + 1);
    SeeRoomManagerUI.b(this.elM).setLayoutParams(new LinearLayout.LayoutParams(SeeRoomManagerUI.b(this.elM).getWidth(), j));
    AppMethodBeat.o(104283);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomManagerUI.2
 * JD-Core Version:    0.6.2
 */
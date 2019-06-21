package com.tencent.mm.chatroom.ui;

import android.content.res.Resources;
import android.widget.GridView;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SeeRoomManagerUI$b$1
  implements Runnable
{
  SeeRoomManagerUI$b$1(SeeRoomManagerUI.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104287);
    int i = (int)(this.elO.elM.getResources().getDimension(2131427504) + this.elO.elM.getResources().getDimension(2131427804) + this.elO.elM.getResources().getDimension(2131427864));
    int j = i;
    if (SeeRoomManagerUI.a(this.elO.elM).getCount() / 4 > 0)
      j = i * (SeeRoomManagerUI.a(this.elO.elM).getCount() / 4 + 1);
    SeeRoomManagerUI.b(this.elO.elM).setLayoutParams(new LinearLayout.LayoutParams(SeeRoomManagerUI.b(this.elO.elM).getWidth(), j));
    AppMethodBeat.o(104287);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomManagerUI.b.1
 * JD-Core Version:    0.6.2
 */
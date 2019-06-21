package com.tencent.mm.chatroom.ui;

import android.content.res.Resources;
import android.widget.GridView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SeeAccessVerifyInfoUI$4
  implements Runnable
{
  SeeAccessVerifyInfoUI$4(SeeAccessVerifyInfoUI paramSeeAccessVerifyInfoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104263);
    int i = 0;
    if (SeeAccessVerifyInfoUI.c(this.elC) != null)
      if (!SeeAccessVerifyInfoUI.d(this.elC))
        break label136;
    label136: for (i = (int)(SeeAccessVerifyInfoUI.c(this.elC).getHeight() * 2 + this.elC.getResources().getDimension(2131427504) + this.elC.getResources().getDimension(2131427804)); ; i = (int)(SeeAccessVerifyInfoUI.c(this.elC).getHeight() + this.elC.getResources().getDimension(2131427504) + this.elC.getResources().getDimension(2131427804)))
    {
      int j = i;
      if (SeeAccessVerifyInfoUI.e(this.elC).getCount() / 4 > 0)
        j = i * (SeeAccessVerifyInfoUI.e(this.elC).getCount() / 4 + 1);
      SeeAccessVerifyInfoUI.f(this.elC).setLayoutParams(new LinearLayout.LayoutParams(SeeAccessVerifyInfoUI.f(this.elC).getWidth(), j));
      AppMethodBeat.o(104263);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI.4
 * JD-Core Version:    0.6.2
 */
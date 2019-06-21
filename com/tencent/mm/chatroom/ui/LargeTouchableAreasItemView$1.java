package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LargeTouchableAreasItemView$1
  implements View.OnClickListener
{
  LargeTouchableAreasItemView$1(LargeTouchableAreasItemView paramLargeTouchableAreasItemView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(104104);
    paramView = this.ejA;
    if (!LargeTouchableAreasItemView.a(this.ejA));
    for (boolean bool = true; ; bool = false)
    {
      paramView.setItemViewSelected(bool);
      if (LargeTouchableAreasItemView.b(this.ejA) != null)
      {
        LargeTouchableAreasItemView.b(this.ejA);
        LargeTouchableAreasItemView.a(this.ejA);
      }
      AppMethodBeat.o(104104);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.LargeTouchableAreasItemView.1
 * JD-Core Version:    0.6.2
 */
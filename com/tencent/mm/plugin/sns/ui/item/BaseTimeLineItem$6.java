package com.tencent.mm.plugin.sns.ui.item;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.d.b;
import com.tencent.mm.ui.widget.b.a;

final class BaseTimeLineItem$6
  implements View.OnLongClickListener
{
  BaseTimeLineItem$6(BaseTimeLineItem paramBaseTimeLineItem, View paramView)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(40120);
    int[] arrayOfInt = new int[2];
    if ((paramView.getTag(2131820679) instanceof int[]));
    for (paramView = (int[])paramView.getTag(2131820679); ; paramView = arrayOfInt)
    {
      this.rHr.qPr.jMO.a(this.rDK, this.rHr.qPr.qOL.rJU, this.rHr.qPr.qOL.rJH, paramView[0], paramView[1]);
      AppMethodBeat.o(40120);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.6
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.sight.encode.ui;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MainSightSelectContactView$1
  implements Runnable
{
  MainSightSelectContactView$1(MainSightSelectContactView paramMainSightSelectContactView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25083);
    if ((MainSightSelectContactView.a(this.qBr) == MainSightSelectContactView.b(this.qBr).getCount()) && (MainSightSelectContactView.c(this.qBr).getViewHeight() >= MainSightSelectContactView.d(this.qBr)))
      AppMethodBeat.o(25083);
    while (true)
    {
      return;
      if (MainSightSelectContactView.e(this.qBr) != null)
        MainSightSelectContactView.f(this.qBr).removeFooterView(MainSightSelectContactView.e(this.qBr));
      int i = MainSightSelectContactView.d(this.qBr);
      if ((MainSightSelectContactView.d(this.qBr) < 0) || (MainSightSelectContactView.d(this.qBr) > MainSightSelectContactView.c(this.qBr).getViewHeight()))
        i = MainSightSelectContactView.c(this.qBr).getViewHeight();
      MainSightSelectContactView.a(this.qBr, MainSightSelectContactView.b(this.qBr).getCount());
      MainSightSelectContactView.b(this.qBr, i);
      int j = 0;
      int k = 0;
      Object localObject;
      while (true)
      {
        if (j >= MainSightSelectContactView.b(this.qBr).getCount())
          break label245;
        localObject = MainSightSelectContactView.b(this.qBr).getView(j, null, MainSightSelectContactView.f(this.qBr));
        ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        k += ((View)localObject).getMeasuredHeight();
        if (k >= i)
        {
          AppMethodBeat.o(25083);
          break;
        }
        j++;
      }
      label245: i -= k;
      if (i > 0)
      {
        MainSightSelectContactView.a(this.qBr, new View(this.qBr.getContext()));
        localObject = new AbsListView.LayoutParams(-1, i);
        MainSightSelectContactView.e(this.qBr).setLayoutParams((ViewGroup.LayoutParams)localObject);
        MainSightSelectContactView.e(this.qBr).setBackgroundResource(2131689761);
        MainSightSelectContactView.f(this.qBr).addFooterView(MainSightSelectContactView.e(this.qBr));
      }
      AppMethodBeat.o(25083);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.MainSightSelectContactView.1
 * JD-Core Version:    0.6.2
 */
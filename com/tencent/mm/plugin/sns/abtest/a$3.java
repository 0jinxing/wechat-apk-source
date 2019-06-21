package com.tencent.mm.plugin.sns.abtest;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.n;

final class a$3
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    AppMethodBeat.i(35646);
    if ((paramView.getTag() instanceof n))
    {
      n localn = (n)paramView.getTag();
      a.a(paramView, paramView.getContext(), localn);
    }
    AppMethodBeat.o(35646);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.abtest.a.3
 * JD-Core Version:    0.6.2
 */
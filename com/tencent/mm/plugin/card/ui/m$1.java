package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class m$1
  implements View.OnClickListener
{
  m$1(m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88683);
    paramView = (String)paramView.getTag();
    if (!TextUtils.isEmpty(paramView))
    {
      if (!paramView.contains(";"))
        break label96;
      paramView = paramView.substring(0, paramView.indexOf(";"));
    }
    label96: 
    while (true)
    {
      h.a(m.a(this.koc), true, paramView, "", m.a(this.koc).getString(2131297827), m.a(this.koc).getString(2131298419), new m.1.1(this, paramView), null);
      AppMethodBeat.o(88683);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.m.1
 * JD-Core Version:    0.6.2
 */
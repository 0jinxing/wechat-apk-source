package com.tencent.mm.plugin.sns.ui.d;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.pluginsdk.n;

final class b$18
  implements View.OnClickListener
{
  b$18(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40266);
    try
    {
      int i = v.Zn((String)paramView.getTag());
      paramView = new android/content/Intent;
      paramView.<init>();
      paramView.putExtra("sns_label_sns_info", i);
      a.gkE.u(paramView, this.rKt.activity);
      AppMethodBeat.o(40266);
      return;
    }
    catch (Exception paramView)
    {
      while (true)
        AppMethodBeat.o(40266);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.18
 * JD-Core Version:    0.6.2
 */
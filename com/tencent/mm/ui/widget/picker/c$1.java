package com.tencent.mm.ui.widget.picker;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112835);
    c localc = this.zSu;
    if (c.a(this.zSu) == null);
    for (paramView = null; ; paramView = String.format(Locale.US, "%02d:%02d", new Object[] { paramView.getCurrentHour(), paramView.getCurrentMinute() }))
    {
      c.a(localc, true, paramView);
      AppMethodBeat.o(112835);
      return;
      paramView = c.a(this.zSu);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.c.1
 * JD-Core Version:    0.6.2
 */
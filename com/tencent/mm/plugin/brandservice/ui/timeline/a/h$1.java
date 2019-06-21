package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class h$1
  implements View.OnClickListener
{
  public h$1(h paramh, q paramq)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14266);
    if (!this.jEl.field_isExpand)
    {
      this.jPM.jPi.setMaxLines(2147483647);
      this.jEl.field_isExpand = true;
      this.jPM.jPK.setText(2131297667);
      AppMethodBeat.o(14266);
    }
    while (true)
    {
      return;
      this.jPM.jPi.setMaxLines(5);
      this.jEl.field_isExpand = false;
      this.jPM.jPK.setText(2131297666);
      AppMethodBeat.o(14266);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.h.1
 * JD-Core Version:    0.6.2
 */
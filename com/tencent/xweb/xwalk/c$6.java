package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.XWalkInitializer;

final class c$6
  implements View.OnClickListener
{
  c$6(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85127);
    ((TextView)this.ARk.ARh.findViewById(2131823250)).setText(this.ARk.rC(true) + "\n" + XWalkInitializer.getXWalkInitializeLog());
    AppMethodBeat.o(85127);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.6
 * JD-Core Version:    0.6.2
 */
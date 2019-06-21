package com.tencent.mm.plugin.webview.luggage;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.luggage.d.e;
import com.tencent.luggage.d.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class k$3
  implements View.OnClickListener
{
  k$3(k paramk, d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(6174);
    if (this.mUr.bPe.xh().peek() == k.a(this.ujg))
      this.ujg.bDy();
    AppMethodBeat.o(6174);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.k.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.widget.textview;

import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

final class a$8
  implements ViewTreeObserver.OnScrollChangedListener
{
  a$8(a parama)
  {
  }

  public final void onScrollChanged()
  {
    AppMethodBeat.i(113125);
    if (this.zWL.zWn != null)
    {
      this.zWL.zWm.removeCallbacks(this.zWL.zWI);
      this.zWL.zWm.getLocationInWindow(this.zWL.yJQ);
      ai.d("SelectableTextHelper", "onScrollChanged, old-y: %d, y: %d.", new Object[] { Integer.valueOf(this.zWL.rGg[1]), Integer.valueOf(this.zWL.yJQ[1]) });
      if (this.zWL.zWE)
      {
        if ((this.zWL.zWF) || (this.zWL.zWG))
          break label260;
        if (this.zWL.rGg[1] == this.zWL.yJQ[1])
          break label238;
        this.zWL.zWF = true;
        this.zWL.zWE = false;
        ai.d("SelectableTextHelper", "judge result, inScrolling.", new Object[0]);
      }
    }
    while (true)
    {
      this.zWL.rGg[1] = this.zWL.yJQ[1];
      if ((!this.zWL.zWB) && ((!this.zWL.zWC) || (!this.zWL.zWD)))
      {
        this.zWL.zWB = true;
        this.zWL.dLL();
      }
      AppMethodBeat.o(113125);
      return;
      label238: this.zWL.zWG = true;
      ai.d("SelectableTextHelper", "need delay judge.", new Object[0]);
      continue;
      label260: if (this.zWL.zWG)
      {
        this.zWL.zWG = false;
        this.zWL.zWE = false;
        if (this.zWL.rGg[1] != this.zWL.yJQ[1])
        {
          this.zWL.zWF = true;
          ai.d("SelectableTextHelper", "judge result(delay), inScrolling.", new Object[0]);
        }
        else
        {
          this.zWL.zWF = false;
          ai.d("SelectableTextHelper", "judge result, click outside.", new Object[0]);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a.8
 * JD-Core Version:    0.6.2
 */
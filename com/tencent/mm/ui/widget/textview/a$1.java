package com.tencent.mm.ui.widget.textview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113118);
    if (this.zWL.zWA)
    {
      ai.d("SelectableTextHelper", "isReInit, return.", new Object[0]);
      AppMethodBeat.o(113118);
    }
    while (true)
    {
      return;
      ai.d("SelectableTextHelper", "in mShowSelectViewRunnable. opener: %s, inScrolling: %s.", new Object[] { Boolean.valueOf(this.zWL.zWE), Boolean.valueOf(this.zWL.zWF) });
      if (this.zWL.zWn != null)
      {
        if (!this.zWL.zWE)
        {
          this.zWL.zWE = true;
          if (this.zWL.zWF)
          {
            ai.d("SelectableTextHelper", "menu is hide: %s, cursor is hide: %s.", new Object[] { Boolean.valueOf(this.zWL.zWC), Boolean.valueOf(this.zWL.zWD) });
            if (!this.zWL.zWC)
              this.zWL.dLS();
            if (!this.zWL.zWD)
            {
              this.zWL.dLO();
              this.zWL.hH(this.zWL.zWk.aqm, this.zWL.zWk.Ls);
            }
            if ((this.zWL.zWn != null) && (this.zWL.zWC) && (!this.zWL.zWD))
              this.zWL.zWn.eQ(this.zWL.zWm);
          }
          this.zWL.zWF = false;
          AppMethodBeat.o(113118);
        }
        else if (this.zWL.zWG)
        {
          this.zWL.zWG = false;
          ai.d("SelectableTextHelper", "judge result(delay), click outside.", new Object[0]);
          if (this.zWL.zWJ != null)
          {
            this.zWL.zWJ.dHp();
            AppMethodBeat.o(113118);
          }
        }
        else
        {
          ai.d("SelectableTextHelper", "Oh, bypass the judge logic! Don't worry, that's reasonable.", new Object[0]);
          AppMethodBeat.o(113118);
        }
      }
      else
      {
        if (!this.zWL.zWC)
          this.zWL.dLS();
        if (!this.zWL.zWD)
          this.zWL.dLO();
        AppMethodBeat.o(113118);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a.1
 * JD-Core Version:    0.6.2
 */
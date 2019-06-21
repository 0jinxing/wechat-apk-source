package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class MMTagPanel$b$3
  implements Runnable
{
  MMTagPanel$b$3(MMTagPanel.b paramb, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106823);
    MMTagPanel.a(this.yxG.yxC).setText("");
    MMTagPanel.a(this.yxG.yxC).append(this.yxH);
    AppMethodBeat.o(106823);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanel.b.3
 * JD-Core Version:    0.6.2
 */
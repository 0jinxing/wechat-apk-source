package com.tencent.mm.plugin.sns.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsCommentCollapseLayout$2
  implements Runnable
{
  SnsCommentCollapseLayout$2(SnsCommentCollapseLayout paramSnsCommentCollapseLayout, CharSequence paramCharSequence, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40480);
    ab.d("MicroMsg.SnsCommentCollapseLayout", "setText text:%s, commentFlag:%s", new Object[] { this.rMY, Integer.valueOf(this.rMZ) });
    SnsCommentCollapseLayout localSnsCommentCollapseLayout = this.rMX;
    Object localObject;
    if (this.rMY == null)
    {
      localObject = "";
      SnsCommentCollapseLayout.a(localSnsCommentCollapseLayout, (CharSequence)localObject);
      if (!d.fF(this.rMZ, 16))
        break label87;
      SnsCommentCollapseLayout.b(this.rMX);
      AppMethodBeat.o(40480);
    }
    while (true)
    {
      return;
      localObject = this.rMY;
      break;
      label87: SnsCommentCollapseLayout.c(this.rMX);
      AppMethodBeat.o(40480);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.2
 * JD-Core Version:    0.6.2
 */
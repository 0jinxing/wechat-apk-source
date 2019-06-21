package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.widget.a.e.a;

final class h$2
  implements Runnable
{
  h$2(h paramh, EmojiInfo paramEmojiInfo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(52887);
    Context localContext = ah.getContext();
    e.a locala = new e.a(localContext);
    locala.asL(localContext.getString(2131299019)).Qg(2131299198).Qh(localContext.getResources().getColor(2131690386));
    locala.c(new h.2.1(this)).show();
    AppMethodBeat.o(52887);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.h.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$2
  implements Runnable
{
  d$2(d paramd, Context paramContext, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26755);
    Toast.makeText(this.val$context, this.val$tips, 0).show();
    AppMethodBeat.o(26755);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.d.2
 * JD-Core Version:    0.6.2
 */
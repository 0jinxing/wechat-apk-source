package com.tencent.mm.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.g;

final class g$4
  implements Runnable
{
  g$4(Context paramContext, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29198);
    g.b(this.val$context, this.val$intent, this.val$context.getString(2131299234));
    AppMethodBeat.o(29198);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.g.4
 * JD-Core Version:    0.6.2
 */
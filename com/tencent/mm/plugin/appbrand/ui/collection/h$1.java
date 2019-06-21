package com.tencent.mm.plugin.appbrand.ui.collection;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$1
  implements Runnable
{
  h$1(Context paramContext, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133321);
    Context localContext = this.val$context;
    if (this.iLK);
    for (String str = this.val$context.getString(2131296582); ; str = this.val$context.getString(2131296580))
    {
      Toast.makeText(localContext, str, 0).show();
      AppMethodBeat.o(133321);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.h.1
 * JD-Core Version:    0.6.2
 */
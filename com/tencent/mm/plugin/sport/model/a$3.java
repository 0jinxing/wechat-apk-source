package com.tencent.mm.plugin.sport.model;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class a$3
  implements Runnable
{
  public a$3(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(93630);
    try
    {
      Uri localUri = Uri.parse("content://com.tencent.mm.plugin.sport");
      ah.getContext().getContentResolver().query(localUri, null, "clearConfig", null, null);
      AppMethodBeat.o(93630);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(93630);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.a.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.sport.model;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class a$2
  implements Runnable
{
  a$2(a parama, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(93629);
    try
    {
      Uri localUri = Uri.parse("content://com.tencent.mm.plugin.sport");
      ah.getContext().getContentResolver().query(localUri, null, "updateConfig", new String[] { this.rPg }, null);
      AppMethodBeat.o(93629);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(93629);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.a.2
 * JD-Core Version:    0.6.2
 */
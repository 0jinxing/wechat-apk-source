package com.tencent.mm.opensdk.utils;

import android.net.Uri;
import android.provider.BaseColumns;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$b
  implements BaseColumns
{
  public static final Uri CONTENT_URI;

  static
  {
    AppMethodBeat.i(128064);
    CONTENT_URI = Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref");
    AppMethodBeat.o(128064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.utils.c.b
 * JD-Core Version:    0.6.2
 */
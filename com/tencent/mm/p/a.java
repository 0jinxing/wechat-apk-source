package com.tencent.mm.p;

import android.net.Uri;
import android.provider.BaseColumns;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public static final class a
    implements BaseColumns
  {
    public static final Uri CONTENT_URI;

    static
    {
      AppMethodBeat.i(125782);
      CONTENT_URI = Uri.parse("content://com.tencent.mm.coolassist.debugprovider/config");
      AppMethodBeat.o(125782);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.p.a
 * JD-Core Version:    0.6.2
 */
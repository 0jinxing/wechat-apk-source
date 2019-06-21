package com.tencent.mm.sdk.platformtools;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;

public final class e
{
  public static void aL(Intent paramIntent)
  {
    AppMethodBeat.i(93387);
    if (d.iW(26))
      paramIntent.setPackage(ah.getPackageName());
    AppMethodBeat.o(93387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.e
 * JD-Core Version:    0.6.2
 */
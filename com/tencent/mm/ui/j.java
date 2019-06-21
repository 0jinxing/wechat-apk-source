package com.tencent.mm.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;

public final class j
{
  public static void a(Activity paramActivity, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(29437);
    d.post(new j.1(paramActivity, paramInt1, paramInt2), paramString);
    AppMethodBeat.o(29437);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.j
 * JD-Core Version:    0.6.2
 */
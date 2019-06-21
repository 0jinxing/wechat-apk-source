package com.tencent.mm.wallet_core.ui;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

public final class b
{
  public static c a(Context paramContext, int paramInt, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(49221);
    paramContext = h.a(paramContext, paramString1, paramString2, ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(paramInt, null), paramOnClickListener);
    AppMethodBeat.o(49221);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.b
 * JD-Core Version:    0.6.2
 */
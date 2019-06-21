package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

public final class m
{
  public String hwA;
  public boolean kDs;
  public int retCode;
  public int tzy;

  public static m a(boolean paramBoolean, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(46781);
    m localm = new m();
    localm.kDs = paramBoolean;
    localm.retCode = paramInt1;
    localm.tzy = paramInt2;
    localm.hwA = paramString;
    AppMethodBeat.o(46781);
    return localm;
  }

  public static m gi(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(46782);
    m localm = a(false, paramInt1, paramInt2, "");
    AppMethodBeat.o(46782);
    return localm;
  }

  public final void y(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(46783);
    if (this.kDs)
    {
      if (bo.isNullOrNil(this.hwA))
        break label78;
      if (paramBoolean)
      {
        Toast.makeText(paramContext, this.hwA, 1).show();
        AppMethodBeat.o(46783);
      }
    }
    while (true)
    {
      return;
      h.b(paramContext, this.hwA, "", false);
      AppMethodBeat.o(46783);
      continue;
      h.b(paramContext, paramContext.getString(2131304945), "", false);
      label78: AppMethodBeat.o(46783);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.m
 * JD-Core Version:    0.6.2
 */
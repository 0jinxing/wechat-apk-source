package com.tencent.mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class aq$b
{
  public Bundle mqu = null;

  public aq$b(aq paramaq, Bundle paramBundle)
  {
    this.mqu = paramBundle;
  }

  public final void putValue(String paramString, Object paramObject)
  {
    AppMethodBeat.i(6760);
    if (this.mqu != null)
      if ((paramObject instanceof String))
      {
        this.mqu.putString(paramString, (String)paramObject);
        AppMethodBeat.o(6760);
      }
    while (true)
    {
      return;
      if ((paramObject instanceof Boolean))
      {
        this.mqu.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
        AppMethodBeat.o(6760);
      }
      else if ((paramObject instanceof Integer))
      {
        this.mqu.putInt(paramString, ((Integer)paramObject).intValue());
        AppMethodBeat.o(6760);
      }
      else
      {
        ab.w("MicroMsg.WebviewReporter", "put unknow type value.");
        AppMethodBeat.o(6760);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.aq.b
 * JD-Core Version:    0.6.2
 */
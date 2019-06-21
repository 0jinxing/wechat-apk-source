package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;

public final class a
{
  public String eIq;
  public String hkV;
  h hkW;

  public a(h paramh)
  {
    this.hkW = paramh;
  }

  public final void aY(String paramString, int paramInt)
  {
    AppMethodBeat.i(10655);
    if ((this.eIq == null) || (this.eIq.length() == 0))
      AppMethodBeat.o(10655);
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putString("id", paramString);
      localBundle.putInt("widgetState", paramInt);
      f.a(i.azC().zV(paramString), localBundle, f.a.class, null);
      AppMethodBeat.o(10655);
    }
  }

  public static class b
    implements com.tencent.mm.ipcinvoker.a<Bundle, Bundle>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.a
 * JD-Core Version:    0.6.2
 */
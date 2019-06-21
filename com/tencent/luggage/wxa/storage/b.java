package com.tencent.luggage.wxa.storage;

import a.f.b.j;
import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/luggage/wxa/storage/CriticalAuthorityResolver;", "", "()V", "resolveAuthority", "", "data-storage_release"})
public final class b
{
  public static final b bSa;

  static
  {
    AppMethodBeat.i(94161);
    bSa = new b();
    AppMethodBeat.o(94161);
  }

  public static final String ym()
  {
    AppMethodBeat.i(94160);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = ah.getContext();
    j.o(localObject, "MMApplicationContext.getContext()");
    localObject = ((Context)localObject).getPackageName() + ".wxa_critical_content";
    AppMethodBeat.o(94160);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.wxa.storage.b
 * JD-Core Version:    0.6.2
 */
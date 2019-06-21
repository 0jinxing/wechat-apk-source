package com.tencent.mm.app;

import android.content.res.Configuration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.f.a;
import com.tencent.mm.sdk.platformtools.ah;

public class TMAssistantProfile extends e
{
  public static final String ceo;

  static
  {
    AppMethodBeat.i(15404);
    ceo = ah.getPackageName() + ":TMAssistantDownloadSDKService";
    AppMethodBeat.o(15404);
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  public final void onCreate()
  {
    AppMethodBeat.i(15403);
    a.bk(ah.getContext());
    l.cT(ceo);
    q.Bz();
    AppMethodBeat.o(15403);
  }

  public String toString()
  {
    return ceo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.TMAssistantProfile
 * JD-Core Version:    0.6.2
 */
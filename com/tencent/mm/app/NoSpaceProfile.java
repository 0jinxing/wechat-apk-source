package com.tencent.mm.app;

import android.content.res.Configuration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;

public class NoSpaceProfile extends e
{
  public static final String ceo;

  static
  {
    AppMethodBeat.i(15389);
    ceo = ah.getPackageName() + ":nospace";
    AppMethodBeat.o(15389);
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  public final void onCreate()
  {
    AppMethodBeat.i(15388);
    l.cT(ceo);
    aa.initLanguage(ah.getContext());
    q.Bz();
    AppMethodBeat.o(15388);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.NoSpaceProfile
 * JD-Core Version:    0.6.2
 */
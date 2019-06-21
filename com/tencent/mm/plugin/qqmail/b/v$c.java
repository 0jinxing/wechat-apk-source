package com.tencent.mm.plugin.qqmail.b;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class v$c
{
  public boolean puO = false;
  public boolean puP = true;
  public boolean puQ = true;

  public final void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(68002);
    this.puO = paramBundle.getBoolean("qqmail_httpoptions_expired");
    this.puP = paramBundle.getBoolean("qqmail_httpoptions_needcache");
    this.puQ = paramBundle.getBoolean("qqmail_httpoptions_needparse");
    AppMethodBeat.o(68002);
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(68001);
    paramBundle.putBoolean("qqmail_httpoptions_expired", this.puO);
    paramBundle.putBoolean("qqmail_httpoptions_needcache", this.puP);
    paramBundle.putBoolean("qqmail_httpoptions_needparse", this.puQ);
    AppMethodBeat.o(68001);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.v.c
 * JD-Core Version:    0.6.2
 */
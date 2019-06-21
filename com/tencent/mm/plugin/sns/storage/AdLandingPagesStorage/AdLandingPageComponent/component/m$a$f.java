package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class m$a$f extends b
{
  m$a$f(m.a parama)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(37127);
    super.enter();
    al.d(new m.a.f.1(this));
    AppMethodBeat.o(37127);
  }

  public final boolean k(Message paramMessage)
  {
    AppMethodBeat.i(37128);
    ab.i("LogStateTransitionState", hashCode() + "[ReDownloadState] recv msg.what " + paramMessage.what);
    boolean bool;
    switch (paramMessage.what)
    {
    default:
      bool = false;
      AppMethodBeat.o(37128);
    case 0:
    }
    while (true)
    {
      return bool;
      this.raa.b(this.raa.qZX);
      bool = true;
      AppMethodBeat.o(37128);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.f
 * JD-Core Version:    0.6.2
 */
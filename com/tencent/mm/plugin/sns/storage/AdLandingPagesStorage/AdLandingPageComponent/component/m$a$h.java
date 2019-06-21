package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class m$a$h extends com.tencent.mm.sdk.d.b
{
  private boolean rai;

  m$a$h(m.a parama)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(37136);
    super.enter();
    if (!AdLandingPagesProxy.getInstance().isApkExist(m.b(this.raa.qZO).csB))
    {
      this.raa.b(this.raa.qZS);
      AppMethodBeat.o(37136);
    }
    while (true)
    {
      return;
      al.d(new m.a.h.1(this));
      this.rai = true;
      AppMethodBeat.o(37136);
    }
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = false;
    AppMethodBeat.i(37137);
    ab.i("LogStateTransitionState", hashCode() + "[ToInstallState] recv msg.what " + paramMessage.what);
    switch (paramMessage.what)
    {
    case 1:
    default:
      AppMethodBeat.o(37137);
    case 0:
    case 2:
    case 3:
    }
    while (true)
    {
      return bool;
      if (AdLandingPagesProxy.getInstance().installApp(this.raa.qZO.context, m.b(this.raa.qZO).csB, m.b(this.raa.qZO).Iw, m.b(this.raa.qZO).cvZ, m.b(this.raa.qZO).downloadUrl))
      {
        this.rai = true;
        AppMethodBeat.o(37137);
        bool = true;
      }
      else
      {
        m.a.a(this.raa, this.raa.qZO.context.getString(2131303575));
        this.raa.b(this.raa.qZW);
        AppMethodBeat.o(37137);
        bool = true;
        continue;
        if (!AdLandingPagesProxy.getInstance().isApkExist(m.b(this.raa.qZO).csB))
          this.raa.b(this.raa.qZS);
        AppMethodBeat.o(37137);
        bool = true;
        continue;
        if (this.rai)
          this.rai = false;
        this.raa.b(this.raa.qZV);
        AppMethodBeat.o(37137);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.h
 * JD-Core Version:    0.6.2
 */
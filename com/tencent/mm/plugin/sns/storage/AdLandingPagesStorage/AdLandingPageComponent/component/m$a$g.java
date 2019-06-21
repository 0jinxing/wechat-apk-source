package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class m$a$g extends com.tencent.mm.sdk.d.b
{
  m$a$g(m.a parama)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(37133);
    super.enter();
    al.d(new m.a.g.1(this));
    if (AdLandingPagesProxy.getInstance().isPkgInstalled(m.b(this.raa.qZO).Iw))
    {
      this.raa.b(this.raa.qZV);
      AppMethodBeat.o(37133);
    }
    while (true)
    {
      return;
      if (AdLandingPagesProxy.getInstance().isApkExist(m.b(this.raa.qZO).csB))
      {
        this.raa.b(this.raa.qZU);
        AppMethodBeat.o(37133);
      }
      else if (AdLandingPagesProxy.getInstance().isDownloading(m.b(this.raa.qZO).csB))
      {
        this.raa.b(this.raa.qZR);
        AppMethodBeat.o(37133);
      }
      else if (AdLandingPagesProxy.getInstance().isPaused(m.b(this.raa.qZO).csB))
      {
        this.raa.b(this.raa.qZT);
        AppMethodBeat.o(37133);
      }
      else
      {
        al.d(new m.a.g.2(this));
        AppMethodBeat.o(37133);
      }
    }
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(37134);
    ab.i("LogStateTransitionState", hashCode() + "[ToDownloadState]recv msg.what " + paramMessage.what);
    switch (paramMessage.what)
    {
    default:
      bool = false;
      AppMethodBeat.o(37134);
    case 0:
    case 3:
    case 11:
    case 12:
    }
    while (true)
    {
      return bool;
      if (AdLandingPagesProxy.getInstance().isDownloading(m.b(this.raa.qZO).csB))
        m.a.a(this.raa, this.raa.qZO.context.getString(2131303571));
      while (true)
      {
        AppMethodBeat.o(37134);
        break;
        al.d(new m.a.g.3(this));
      }
      this.raa.b(this.raa.qZV);
      AppMethodBeat.o(37134);
      continue;
      this.raa.b(this.raa.qZS);
      AppMethodBeat.o(37134);
      continue;
      this.raa.b(this.raa.qZR);
      AppMethodBeat.o(37134);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.g
 * JD-Core Version:    0.6.2
 */
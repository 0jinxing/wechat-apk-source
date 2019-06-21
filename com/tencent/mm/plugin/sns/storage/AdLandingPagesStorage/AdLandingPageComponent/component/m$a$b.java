package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.sdk.platformtools.ab;

final class m$a$b extends com.tencent.mm.sdk.d.b
{
  m$a$b(m.a parama)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(37110);
    super.enter();
    AdLandingPagesProxy.getInstance().doAdChannelScene(m.b(this.raa.qZO).Iw, m.b(this.raa.qZO).channelId, this.raa.qZO.qZN);
    ab.i("LogStateTransitionState", hashCode() + "[DoNetSceneState] appid %s, channelId %s", new Object[] { m.b(this.raa.qZO).Iw, m.b(this.raa.qZO).channelId });
    AppMethodBeat.o(37110);
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(37109);
    ab.i("LogStateTransitionState", hashCode() + "[DoNetSceneState]recv msg.what " + paramMessage.what);
    if (AdLandingPagesProxy.getInstance().isApkExist(m.b(this.raa.qZO).csB))
    {
      this.raa.b(this.raa.qZU);
      AppMethodBeat.o(37109);
    }
    while (true)
    {
      return bool;
      switch (paramMessage.what)
      {
      case 7:
      case 8:
      case 9:
      default:
        bool = false;
        AppMethodBeat.o(37109);
        break;
      case 6:
        this.raa.b(this.raa.qZS);
        AppMethodBeat.o(37109);
        break;
      case 5:
        m.a.a(this.raa, this.raa.qZO.context.getString(2131303573));
        this.raa.b(this.raa.qZW);
        AppMethodBeat.o(37109);
        break;
      case 10:
        this.raa.b(this.raa.qZS);
        AppMethodBeat.o(37109);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.b
 * JD-Core Version:    0.6.2
 */
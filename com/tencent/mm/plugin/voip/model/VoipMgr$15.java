package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.a.c;
import com.tencent.mm.sdk.platformtools.ab;

final class VoipMgr$15
  implements HeadsetPlugReceiver.a
{
  VoipMgr$15(VoipMgr paramVoipMgr)
  {
  }

  public final void fS(boolean paramBoolean)
  {
    AppMethodBeat.i(4477);
    boolean bool = g.KK().KP();
    ab.i("MicroMsg.Voip.VoipMgr", "onHeadsetState, on:%b, bluetooth: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
    if (((paramBoolean) && (3 == VoipMgr.f(this.sSn))) || ((!paramBoolean) && (3 != VoipMgr.f(this.sSn))))
    {
      ab.i("MicroMsg.Voip.VoipMgr", "same status, no changed");
      AppMethodBeat.o(4477);
      return;
    }
    if (com.tencent.mm.plugin.voip.a.b.GO(VoipMgr.a(this.sSn).mState))
      if ((paramBoolean) || (bool))
      {
        VoipMgr.b(this.sSn, false);
        if (paramBoolean)
          VoipMgr.a(this.sSn, 3);
      }
    while (true)
    {
      com.tencent.mm.plugin.voip.b.cIj().jj(paramBoolean);
      VoipMgr.b(this.sSn, VoipMgr.f(this.sSn));
      AppMethodBeat.o(4477);
      break;
      VoipMgr.a(this.sSn, 4);
      continue;
      if (!com.tencent.mm.plugin.voip.b.cIj().sSP.cKq())
      {
        VoipMgr.b(this.sSn, false);
        VoipMgr.a(this.sSn, 2);
      }
      else
      {
        Toast.makeText(VoipMgr.g(this.sSn), VoipMgr.g(this.sSn).getString(2131304486), 0).show();
        VoipMgr.b(this.sSn, true);
        VoipMgr.a(this.sSn, 1);
        continue;
        if ((paramBoolean) || (bool))
        {
          if (1 == VoipMgr.f(this.sSn))
          {
            VoipMgr.b(this.sSn, false);
            VoipMgr.c(this.sSn, true);
          }
          while (true)
          {
            if (!paramBoolean)
              break label311;
            VoipMgr.a(this.sSn, 3);
            break;
            VoipMgr.c(this.sSn, false);
          }
          label311: VoipMgr.a(this.sSn, 4);
        }
        else
        {
          if (com.tencent.mm.plugin.voip.b.cIj().sSP.cKq())
            break label355;
          VoipMgr.b(this.sSn, false);
          VoipMgr.a(this.sSn, 2);
        }
      }
    }
    label355: if ((VoipMgr.h(this.sSn)) || (2 == VoipMgr.i(this.sSn)))
    {
      Toast.makeText(VoipMgr.g(this.sSn), VoipMgr.g(this.sSn).getString(2131304486), 0).show();
      VoipMgr.b(this.sSn, true);
      VoipMgr.a(this.sSn, 1);
    }
    while (true)
    {
      VoipMgr.c(this.sSn, false);
      break;
      Toast.makeText(VoipMgr.g(this.sSn), VoipMgr.g(this.sSn).getString(2131304485), 0).show();
      VoipMgr.a(this.sSn, 2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.15
 * JD-Core Version:    0.6.2
 */
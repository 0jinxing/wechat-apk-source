package com.tencent.mm.plugin.ipcall.a.b;

import android.media.AudioManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public boolean cFy;
  public c kzq;
  public final Object nxa;
  public int nxb;
  public boolean nxc;

  public a()
  {
    AppMethodBeat.i(21800);
    this.kzq = null;
    this.nxa = new Object();
    this.cFy = false;
    this.nxb = 0;
    this.nxc = false;
    AppMethodBeat.o(21800);
  }

  public static boolean KU()
  {
    AppMethodBeat.i(138614);
    boolean bool = aw.ZL().eoY.isSpeakerphoneOn();
    AppMethodBeat.o(138614);
    return bool;
  }

  private void ip(boolean paramBoolean)
  {
    AppMethodBeat.i(21802);
    if ((this.kzq != null) && (this.kzq.sNi))
      this.kzq.mj(paramBoolean);
    AppMethodBeat.o(21802);
  }

  public final void io(boolean paramBoolean)
  {
    AppMethodBeat.i(21801);
    ab.i("MicroMsg.IPCallAudioPlayer", "setSpeakerPhoneOn, old isSpeakerPhoneOn: %b, new isSpeakerPhoneOn: %b", new Object[] { Boolean.valueOf(this.nxc), Boolean.valueOf(paramBoolean) });
    aw.ZL().bF(paramBoolean);
    i.bHr().io(paramBoolean);
    if (paramBoolean != this.nxc)
    {
      this.nxc = paramBoolean;
      ip(paramBoolean);
    }
    AppMethodBeat.o(21801);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.b.a
 * JD-Core Version:    0.6.2
 */
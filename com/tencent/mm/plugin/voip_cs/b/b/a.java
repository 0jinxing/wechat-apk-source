package com.tencent.mm.plugin.voip_cs.b.b;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  boolean nxA;
  private ak nxy;
  private boolean nxz;
  public com.tencent.mm.plugin.voip_cs.b.a tew;
  public a.a tey;

  public a()
  {
    AppMethodBeat.i(135368);
    this.nxz = false;
    this.nxA = false;
    this.tey = null;
    this.nxy = new a.1(this, Looper.getMainLooper());
    this.tew = new com.tencent.mm.plugin.voip_cs.b.a(this.nxy);
    AppMethodBeat.o(135368);
  }

  public static int acg(String paramString)
  {
    AppMethodBeat.i(135370);
    paramString = paramString.split("\\.");
    int i = bo.getInt(paramString[0], 0);
    int j = bo.getInt(paramString[1], 0);
    int k = bo.getInt(paramString[2], 0);
    int m = bo.getInt(paramString[3], 0);
    AppMethodBeat.o(135370);
    return m + ((i << 24) + (j << 16) + (k << 8));
  }

  public final void init()
  {
    AppMethodBeat.i(135369);
    this.nxA = false;
    this.nxz = false;
    if (this.tew.cKK())
    {
      ab.d("MicroMsg.VoipCSEngine", "protocal has init,now uninit!");
      this.tew.mx(false);
      this.tew.reset();
    }
    this.tew.sTY = 1;
    long l = System.currentTimeMillis();
    int i = this.tew.cMc();
    ab.d("MicroMsg.VoipCSEngine", "protocal init finish, ret: %d, used %dms", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
    if (i < 0)
      ab.e("MicroMsg.VoipCSEngine", "engine init failed!");
    AppMethodBeat.o(135369);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.b.a
 * JD-Core Version:    0.6.2
 */
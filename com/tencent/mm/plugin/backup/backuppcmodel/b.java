package com.tencent.mm.plugin.backup.backuppcmodel;

import android.os.Looper;
import android.os.PowerManager.WakeLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;

public final class b extends com.tencent.mm.plugin.backup.b.d
{
  private static b jvU;
  private com.tencent.mm.plugin.backup.c.a jtf;
  private c jvV;
  private e jvW;
  private d jvX;
  private a jvY;
  private PowerManager.WakeLock wakeLock = null;

  public static b aTD()
  {
    AppMethodBeat.i(17490);
    if (jvU == null)
    {
      localb = new b();
      jvU = localb;
      a(localb);
    }
    b localb = jvU;
    AppMethodBeat.o(17490);
    return localb;
  }

  public final void aSp()
  {
    jvU = null;
  }

  public final void aSv()
  {
    AppMethodBeat.i(17497);
    al.d(new b.1(this));
    AppMethodBeat.o(17497);
  }

  public final void aSw()
  {
    AppMethodBeat.i(17498);
    al.d(new b.2(this));
    AppMethodBeat.o(17498);
  }

  public final c aTE()
  {
    AppMethodBeat.i(17493);
    if (this.jvV == null)
      this.jvV = new c();
    c localc = this.jvV;
    AppMethodBeat.o(17493);
    return localc;
  }

  public final e aTF()
  {
    AppMethodBeat.i(17494);
    if (this.jvW == null)
      this.jvW = new e();
    e locale = this.jvW;
    AppMethodBeat.o(17494);
    return locale;
  }

  public final d aTG()
  {
    AppMethodBeat.i(17495);
    if (this.jvX == null)
      this.jvX = new d();
    d locald = this.jvX;
    AppMethodBeat.o(17495);
    return locald;
  }

  public final a aTH()
  {
    AppMethodBeat.i(17496);
    if (this.jvY == null)
      this.jvY = new a();
    a locala = this.jvY;
    AppMethodBeat.o(17496);
    return locala;
  }

  public final com.tencent.mm.plugin.backup.c.a aTa()
  {
    AppMethodBeat.i(17492);
    if (this.jtf == null)
      this.jtf = new com.tencent.mm.plugin.backup.c.a();
    com.tencent.mm.plugin.backup.c.a locala = this.jtf;
    AppMethodBeat.o(17492);
    return locala;
  }

  public final void m(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(17491);
    ((Boolean)paramArrayOfObject[0]).booleanValue();
    paramArrayOfObject = aTD().aTE();
    new ak(Looper.getMainLooper()).postDelayed(new c.5(paramArrayOfObject), 100L);
    AppMethodBeat.o(17491);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.b
 * JD-Core Version:    0.6.2
 */
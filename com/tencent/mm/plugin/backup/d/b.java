package com.tencent.mm.plugin.backup.d;

import android.os.PowerManager.WakeLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

public final class b extends com.tencent.mm.plugin.backup.b.d
{
  private static b jtb;
  private d jtc;
  private c jtd;
  private a jte;
  private com.tencent.mm.plugin.backup.c.a jtf;
  String jtg = "tickit";
  private PowerManager.WakeLock wakeLock = null;

  public static b aSZ()
  {
    AppMethodBeat.i(17238);
    if (jtb == null)
    {
      localb = new b();
      jtb = localb;
      a(localb);
    }
    b localb = jtb;
    AppMethodBeat.o(17238);
    return localb;
  }

  public final void aSp()
  {
    jtb = null;
  }

  public final void aSv()
  {
    AppMethodBeat.i(17244);
    al.d(new b.2(this));
    AppMethodBeat.o(17244);
  }

  public final void aSw()
  {
    AppMethodBeat.i(17245);
    al.d(new b.3(this));
    AppMethodBeat.o(17245);
  }

  public final com.tencent.mm.plugin.backup.c.a aTa()
  {
    AppMethodBeat.i(17240);
    if (this.jtf == null)
      this.jtf = new com.tencent.mm.plugin.backup.c.a();
    com.tencent.mm.plugin.backup.c.a locala = this.jtf;
    AppMethodBeat.o(17240);
    return locala;
  }

  public final d aTb()
  {
    AppMethodBeat.i(17241);
    if (this.jtc == null)
      this.jtc = new d();
    d locald = this.jtc;
    AppMethodBeat.o(17241);
    return locald;
  }

  public final c aTc()
  {
    AppMethodBeat.i(17242);
    if (this.jtd == null)
      this.jtd = new c();
    c localc = this.jtd;
    AppMethodBeat.o(17242);
    return localc;
  }

  public final a aTd()
  {
    AppMethodBeat.i(17243);
    if (this.jte == null)
      this.jte = new a();
    a locala = this.jte;
    AppMethodBeat.o(17243);
    return locala;
  }

  public final void m(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(17239);
    al.d(new b.1(this, (String)paramArrayOfObject[0]));
    AppMethodBeat.o(17239);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.b
 * JD-Core Version:    0.6.2
 */
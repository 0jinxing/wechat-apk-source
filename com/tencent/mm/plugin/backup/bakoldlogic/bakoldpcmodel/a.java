package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends com.tencent.mm.plugin.backup.b.d
{
  private static a jyV;
  private e jyW;
  private c jyX;
  private b jyY;

  public static a aUB()
  {
    AppMethodBeat.i(17802);
    if (jyV == null)
    {
      locala = new a();
      jyV = locala;
      a(locala);
    }
    a locala = jyV;
    AppMethodBeat.o(17802);
    return locala;
  }

  public final void aSp()
  {
    jyV = null;
  }

  public final void aSv()
  {
  }

  public final void aSw()
  {
  }

  public final e aUC()
  {
    AppMethodBeat.i(17804);
    if (this.jyW == null)
      this.jyW = new e();
    e locale = this.jyW;
    AppMethodBeat.o(17804);
    return locale;
  }

  public final c aUD()
  {
    AppMethodBeat.i(17805);
    if (this.jyX == null)
      this.jyX = new c();
    c localc = this.jyX;
    AppMethodBeat.o(17805);
    return localc;
  }

  public final b aUE()
  {
    AppMethodBeat.i(17806);
    if (this.jyY == null)
      this.jyY = new b();
    b localb = this.jyY;
    AppMethodBeat.o(17806);
    return localb;
  }

  public final void m(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(17803);
    paramArrayOfObject = (Context)paramArrayOfObject[0];
    aUB().aUE().aUF();
    com.tencent.mm.plugin.backup.g.b.clear();
    com.tencent.mm.bp.d.aI(new Intent().setClassName(paramArrayOfObject, "com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService"));
    AppMethodBeat.o(17803);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a
 * JD-Core Version:    0.6.2
 */
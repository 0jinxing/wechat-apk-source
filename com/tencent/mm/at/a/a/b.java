package com.tencent.mm.at.a.a;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.b.g;
import com.tencent.mm.at.a.b.i;
import com.tencent.mm.at.a.c.h;
import com.tencent.mm.at.a.c.j;
import com.tencent.mm.at.a.c.k;
import com.tencent.mm.at.a.c.m;
import com.tencent.mm.at.a.c.n;
import java.util.concurrent.Executor;

public final class b
{
  public static final int fGP;
  public final Resources aEH;
  public final int fGQ;
  public final int fGR;
  public final c fGS;
  public final m fGT;
  public final com.tencent.mm.at.a.c.a fGU;
  public final com.tencent.mm.at.a.c.b fGV;
  public final com.tencent.mm.at.a.c.f fGW;
  public final j fGX;
  public final k fGY;
  public final com.tencent.mm.at.a.c.e fGZ;
  public final h fHa;
  public final Executor fHb;
  public final n fHc;
  public final String packageName;

  static
  {
    AppMethodBeat.i(116071);
    fGP = Runtime.getRuntime().availableProcessors();
    AppMethodBeat.o(116071);
  }

  public b(a parama)
  {
    AppMethodBeat.i(116069);
    this.packageName = parama.context.getPackageName();
    this.aEH = parama.context.getResources();
    this.fGQ = parama.fGQ;
    this.fGR = parama.fGR;
    this.fGS = parama.fGS;
    this.fGT = parama.fGT;
    this.fGU = parama.fGU;
    this.fGV = parama.fGV;
    this.fGW = parama.fGW;
    this.fGX = parama.fGX;
    this.fHa = parama.fHa;
    this.fHb = parama.fHb;
    this.fGY = parama.fHd;
    this.fGZ = parama.fGZ;
    this.fHc = parama.fHc;
    AppMethodBeat.o(116069);
  }

  public static b bZ(Context paramContext)
  {
    AppMethodBeat.i(116070);
    paramContext = new a(paramContext).ahx();
    AppMethodBeat.o(116070);
    return paramContext;
  }

  public static final class a
  {
    Context context;
    int fGQ;
    int fGR;
    c fGS;
    public m fGT;
    com.tencent.mm.at.a.c.a fGU;
    public com.tencent.mm.at.a.c.b fGV;
    com.tencent.mm.at.a.c.f fGW;
    j fGX;
    com.tencent.mm.at.a.c.e fGZ;
    public h fHa;
    Executor fHb;
    n fHc;
    k fHd;

    public a(Context paramContext)
    {
      AppMethodBeat.i(116066);
      this.fGQ = b.fGP;
      this.fGR = 5;
      this.fGS = null;
      this.fGT = null;
      this.fGU = null;
      this.fGV = null;
      this.fGW = null;
      this.fGX = null;
      this.fHd = null;
      this.fGZ = null;
      this.fHc = null;
      this.fHa = null;
      this.context = paramContext.getApplicationContext();
      AppMethodBeat.o(116066);
    }

    private void ahy()
    {
      AppMethodBeat.i(116068);
      if (this.fGS == null)
        this.fGS = c.ahz();
      if (this.fGT == null)
        this.fGT = new com.tencent.mm.at.a.b.f();
      if (this.fGU == null)
        this.fGU = new com.tencent.mm.at.a.b.a();
      if (this.fGV == null)
        this.fGV = new com.tencent.mm.at.a.b.b();
      if (this.fGW == null)
        this.fGW = new com.tencent.mm.at.a.b.d();
      if (this.fGX == null)
        this.fGX = new i();
      if (this.fHa == null)
        this.fHa = a.cs(this.fGQ, this.fGR);
      if (this.fHb == null)
        this.fHb = com.tencent.mm.sdk.g.c.d.anP("image_loader_ImageTempFile");
      if (this.fHd == null)
        this.fHd = new com.tencent.mm.at.a.b.e();
      if (this.fGZ == null)
        this.fGZ = new com.tencent.mm.at.a.b.c();
      if (this.fHc == null)
        this.fHc = new g();
      AppMethodBeat.o(116068);
    }

    public final b ahx()
    {
      AppMethodBeat.i(116067);
      ahy();
      b localb = new b(this);
      AppMethodBeat.o(116067);
      return localb;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.a.b
 * JD-Core Version:    0.6.2
 */
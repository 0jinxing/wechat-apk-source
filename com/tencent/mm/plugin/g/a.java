package com.tencent.mm.plugin.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.f;
import com.tencent.mm.model.q;
import com.tencent.mm.protocal.j.f;
import com.tencent.mm.protocal.j.g;
import com.tencent.mm.protocal.protobuf.beh;
import com.tencent.mm.protocal.v.b;
import com.tencent.mm.sdk.platformtools.al;

public final class a extends q
  implements com.tencent.mm.plugin.auth.a.a
{
  private static a ksU;

  private a()
  {
    super(f.class);
  }

  public static a beP()
  {
    try
    {
      AppMethodBeat.i(79085);
      if (ksU == null)
      {
        locala = new com/tencent/mm/plugin/g/a;
        locala.<init>();
        ksU = locala;
      }
      a locala = ksU;
      AppMethodBeat.o(79085);
      return locala;
    }
    finally
    {
    }
  }

  public final void a(j.f paramf, j.g paramg, boolean paramBoolean)
  {
  }

  public final void a(v.b paramb, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(79086);
    if (paramb.vyJ.luF != 0)
      al.d(new a.1(paramb.vyJ.vMl, paramb.vyJ.vMm, paramb.vyJ.vMn));
    AppMethodBeat.o(79086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.g.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.at.a.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;

public final class a
  implements Runnable
{
  private final com.tencent.mm.at.a.a.b fGK;
  private final com.tencent.mm.at.a.a.c fGS;
  private final com.tencent.mm.at.a.c.a fGU;
  private final com.tencent.mm.at.a.c.b fGV;
  private final com.tencent.mm.at.a.b fHp;
  private final com.tencent.mm.at.a.c.c fHq;
  private final String url;

  public a(String paramString, com.tencent.mm.at.a.a.c paramc, com.tencent.mm.at.a.b paramb, com.tencent.mm.at.a.c.c paramc1)
  {
    AppMethodBeat.i(116104);
    this.url = paramString;
    this.fHp = paramb;
    this.fGK = this.fHp.fGK;
    if (paramc == null)
    {
      this.fGS = this.fGK.fGS;
      this.fHq = paramc1;
      if (this.fGS.fGV == null)
        break label97;
    }
    label97: for (this.fGV = this.fGS.fGV; ; this.fGV = this.fGK.fGV)
    {
      this.fGU = this.fGK.fGU;
      AppMethodBeat.o(116104);
      return;
      this.fGS = paramc;
      break;
    }
  }

  public final void run()
  {
    AppMethodBeat.i(116105);
    new com.tencent.mm.at.a.d.b();
    com.tencent.mm.at.a.d.b localb = this.fGV.sE(this.url);
    if (localb == null)
    {
      if (this.fHq == null)
        break label165;
      this.fHq.a(false, this.fGS.eQd);
      AppMethodBeat.o(116105);
    }
    while (true)
    {
      return;
      if (((d.decodeByteArray(localb.data, 10, 10) != null) || (!this.fGS.eQb)) && (this.fGU.a(this.url, localb.data, this.fGS)))
      {
        if (this.fHq != null)
        {
          this.fHq.a(true, this.fGS.eQd);
          AppMethodBeat.o(116105);
        }
      }
      else
      {
        if (this.fHq != null)
          this.fHq.a(false, this.fGS.eQd);
        label165: AppMethodBeat.o(116105);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.f.a
 * JD-Core Version:    0.6.2
 */
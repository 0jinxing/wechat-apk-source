package com.google.android.gms.common.server;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class BaseApi$BaseApiaryOptions$Collector
{
  private boolean zzvx;
  private boolean zzvy;
  private int zzvz;
  private StringBuilder zzwa;

  public BaseApi$BaseApiaryOptions$Collector(BaseApi.BaseApiaryOptions paramBaseApiaryOptions)
  {
    AppMethodBeat.i(61415);
    this.zzwa = new StringBuilder();
    AppMethodBeat.o(61415);
  }

  private final void append(String paramString)
  {
    AppMethodBeat.i(61416);
    if (this.zzvx)
    {
      this.zzvx = false;
      this.zzwa.append(",");
    }
    while (true)
    {
      this.zzwa.append(paramString);
      AppMethodBeat.o(61416);
      return;
      if (this.zzvy)
      {
        this.zzvy = false;
        this.zzwa.append("/");
      }
    }
  }

  public final void addPiece(String paramString)
  {
    AppMethodBeat.i(61417);
    append(paramString);
    this.zzvy = true;
    AppMethodBeat.o(61417);
  }

  public final void beginSubCollection(String paramString)
  {
    AppMethodBeat.i(61419);
    append(paramString);
    this.zzwa.append("(");
    this.zzvz += 1;
    AppMethodBeat.o(61419);
  }

  public final void endSubCollection()
  {
    AppMethodBeat.i(61420);
    this.zzwa.append(")");
    this.zzvz -= 1;
    if (this.zzvz == 0)
    {
      this.zzwb.addField(this.zzwa.toString());
      this.zzwa.setLength(0);
      this.zzvx = false;
      this.zzvy = false;
      AppMethodBeat.o(61420);
    }
    while (true)
    {
      return;
      this.zzvx = true;
      AppMethodBeat.o(61420);
    }
  }

  public final void finishPiece(String paramString)
  {
    AppMethodBeat.i(61418);
    append(paramString);
    if (this.zzvz == 0)
    {
      this.zzwb.addField(this.zzwa.toString());
      this.zzwa.setLength(0);
      AppMethodBeat.o(61418);
    }
    while (true)
    {
      return;
      this.zzvx = true;
      AppMethodBeat.o(61418);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.BaseApi.BaseApiaryOptions.Collector
 * JD-Core Version:    0.6.2
 */
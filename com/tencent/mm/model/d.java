package com.tencent.mm.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class d
{
  private Context Gn;
  private b cqx;
  private b.a fko;
  a fkp;
  private boolean fkq;

  public d()
  {
    AppMethodBeat.i(77795);
    this.fkq = false;
    this.Gn = ah.getContext();
    AppMethodBeat.o(77795);
  }

  public final boolean a(a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(77796);
    this.fkp = parama;
    parama = new b((byte)0);
    if (this.cqx == null)
      this.cqx = new b(this.Gn);
    if (this.fko != parama)
      this.fko = parama;
    this.cqx.a(this.fko);
    if (this.cqx == null)
      AppMethodBeat.o(77796);
    while (true)
    {
      return bool;
      if (this.fkq)
      {
        AppMethodBeat.o(77796);
      }
      else
      {
        this.cqx.requestFocus();
        this.fkq = true;
        bool = this.fkq;
        AppMethodBeat.o(77796);
      }
    }
  }

  public final boolean cy(boolean paramBoolean)
  {
    AppMethodBeat.i(77797);
    if (this.cqx != null);
    for (boolean bool = this.cqx.Mm(); ; bool = false)
    {
      this.fkq = false;
      if (paramBoolean)
      {
        this.cqx = null;
        this.fko = null;
        this.fkp = null;
      }
      AppMethodBeat.o(77797);
      return bool;
    }
  }

  public static abstract interface a
  {
  }

  final class b
    implements b.a
  {
    private b()
    {
    }

    public final void gF(int paramInt)
    {
      AppMethodBeat.i(77794);
      switch (paramInt)
      {
      case 0:
      default:
        ab.v("MicroMsg.AudioHelperTool", "jacks UNKNOW_AUDIOFOCUS_LOSS DEFAULT");
        AppMethodBeat.o(77794);
      case 1:
      case -1:
      case -2:
      case -3:
      }
      while (true)
      {
        return;
        ab.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_GAIN");
        if (d.this.fkp == null)
          break;
        AppMethodBeat.o(77794);
        continue;
        ab.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS");
        if (d.this.fkp == null)
          break;
        AppMethodBeat.o(77794);
        continue;
        ab.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS_TRANSIENT");
        if (d.this.fkp == null)
          break;
        AppMethodBeat.o(77794);
        continue;
        ab.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
        if (d.this.fkp == null)
          break;
        AppMethodBeat.o(77794);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.d
 * JD-Core Version:    0.6.2
 */
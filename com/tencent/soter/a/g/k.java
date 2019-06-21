package com.tencent.soter.a.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.e.b;
import com.tencent.soter.a.e.b.a;
import com.tencent.soter.core.c.d;

public final class k extends c
{
  com.tencent.soter.a.f.e Axc = null;
  private boolean Axd = false;

  public k(com.tencent.soter.a.f.e parame, boolean paramBoolean)
  {
    this.Axc = parame;
    this.Axd = paramBoolean;
  }

  final boolean dRl()
  {
    boolean bool = true;
    AppMethodBeat.i(10562);
    if (!com.tencent.soter.a.c.a.dRe().isInit())
    {
      d.w("Soter.TaskPrepareAppSecureKey", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.soter.a.b.c(14));
      AppMethodBeat.o(10562);
    }
    while (true)
    {
      return bool;
      if (!com.tencent.soter.a.c.a.dRe().dRc())
      {
        d.w("Soter.TaskPrepareAppSecureKey", "soter: not support soter", new Object[0]);
        b(new com.tencent.soter.a.b.c(2));
        AppMethodBeat.o(10562);
      }
      else if ((com.tencent.soter.core.a.dQR()) && (!this.Axd))
      {
        d.i("Soter.TaskPrepareAppSecureKey", "soter: already has ask. do not need generate again", new Object[0]);
        b(new com.tencent.soter.a.b.c(com.tencent.soter.core.a.dQS()));
        AppMethodBeat.o(10562);
      }
      else
      {
        if (this.Axc == null)
          d.w("Soter.TaskPrepareAppSecureKey", "soter: it is strongly recommended that you provide a net wrapper to check and upload ASK validation from server! Please make sure you upload it later", new Object[0]);
        AppMethodBeat.o(10562);
        bool = false;
      }
    }
  }

  final void dRm()
  {
    AppMethodBeat.i(10563);
    d.w("Soter.TaskPrepareAppSecureKey", "soter: cancelled prepare ask", new Object[0]);
    com.tencent.soter.core.a.dQP();
    AppMethodBeat.o(10563);
  }

  final void execute()
  {
    AppMethodBeat.i(10564);
    eQ(com.tencent.soter.core.c.e.dQW().Avi, 1);
    b.a locala = new b.a();
    boolean bool = this.Axd;
    locala.AvR |= 1;
    locala.AvT = bool;
    locala.AvV = new k.1(this);
    locala.dRj().dRi();
    AppMethodBeat.o(10564);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.k
 * JD-Core Version:    0.6.2
 */
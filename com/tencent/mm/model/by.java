package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sv;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public final class by
{
  private by.a fnD;
  private long fnE;
  private long fnF;
  private String fnG;
  private int fnH;

  public by(by.a parama)
  {
    AppMethodBeat.i(58130);
    this.fnD = null;
    this.fnE = 0L;
    this.fnF = 0L;
    this.fnG = "";
    this.fnH = 1;
    Assert.assertTrue(true);
    this.fnD = parama;
    aav();
    AppMethodBeat.o(58130);
  }

  private void aav()
  {
    this.fnH = 1;
    this.fnE = 0L;
    this.fnF = 0L;
    this.fnG = "";
  }

  private void aaz()
  {
    try
    {
      AppMethodBeat.i(58134);
      if ((this.fnH != 1) && (this.fnE + this.fnF < bo.anU()))
        aax();
      AppMethodBeat.o(58134);
      return;
    }
    finally
    {
    }
  }

  public final boolean aaA()
  {
    try
    {
      AppMethodBeat.i(58135);
      aaz();
      boolean bool;
      if (this.fnH == 2)
      {
        bool = true;
        AppMethodBeat.o(58135);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(58135);
      }
    }
    finally
    {
    }
  }

  public final boolean aaB()
  {
    try
    {
      AppMethodBeat.i(58136);
      aaz();
      boolean bool;
      if (this.fnH == 3)
      {
        bool = true;
        AppMethodBeat.o(58136);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(58136);
      }
    }
    finally
    {
    }
  }

  public final boolean aaw()
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(58131);
      long l1 = bo.anU();
      this.fnG = bo.dpG().toString();
      if (this.fnH == 1)
      {
        this.fnF = l1;
        this.fnE = 1800000L;
        ab.i("MicroMsg.SyncPauser", "requestToPause currState:STATE_RUNNING timeout:%d %s", new Object[] { Long.valueOf(1800000L), this.fnG });
        this.fnH = 2;
        if (this.fnD.aaC())
          aay();
        AppMethodBeat.o(58131);
      }
      while (true)
      {
        return bool;
        long l2 = this.fnF + this.fnE;
        l1 += 1800000L;
        if (l1 > l2)
          this.fnE += l1 - l2;
        ab.i("MicroMsg.SyncPauser", "requestToPause currState:%s ParamTimeout:%d diff:%s newTimeout:%s %s", new Object[] { Integer.valueOf(this.fnH), Long.valueOf(1800000L), Long.valueOf(l1 - l2), Long.valueOf(this.fnE), this.fnG });
        AppMethodBeat.o(58131);
        bool = false;
      }
    }
    finally
    {
    }
  }

  public final void aax()
  {
    try
    {
      AppMethodBeat.i(58132);
      ab.d("MicroMsg.SyncPauser", "restartSync currState:%d %s", new Object[] { Integer.valueOf(this.fnH), bo.dpG() });
      if (this.fnH == 1)
      {
        ab.d("MicroMsg.SyncPauser", "warning: restartSync but currState has been STATE_RUNNING %s", new Object[] { bo.dpG() });
        AppMethodBeat.o(58132);
      }
      while (true)
      {
        return;
        aav();
        sv localsv = new com/tencent/mm/g/a/sv;
        localsv.<init>();
        localsv.cOX.status = 1;
        a.xxA.m(localsv);
        AppMethodBeat.o(58132);
      }
    }
    finally
    {
    }
  }

  public final void aay()
  {
    try
    {
      AppMethodBeat.i(58133);
      if (this.fnH != 2)
      {
        ab.e("MicroMsg.SyncPauser", "ERR: setFullPause but currState is %d  %s", new Object[] { Integer.valueOf(this.fnH), bo.dpG() });
        AppMethodBeat.o(58133);
      }
      while (true)
      {
        return;
        ab.d("MicroMsg.SyncPauser", "setFullPause waitTime:%d %s", new Object[] { Long.valueOf(bo.gb(this.fnF)), bo.dpG() });
        this.fnH = 3;
        sv localsv = new com/tencent/mm/g/a/sv;
        localsv.<init>();
        localsv.cOX.status = 3;
        a.xxA.m(localsv);
        AppMethodBeat.o(58133);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.by
 * JD-Core Version:    0.6.2
 */
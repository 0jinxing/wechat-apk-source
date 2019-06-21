package com.tencent.mm.plugin.appbrand.canvas;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.a.i;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Stack;

public final class d
  implements a
{
  public final v.b eIo;
  public com.tencent.mm.plugin.appbrand.canvas.a.a hcE;
  public com.tencent.mm.plugin.appbrand.canvas.a.a hcF;
  private Stack<com.tencent.mm.plugin.appbrand.canvas.a.a> hcG;
  private Stack<com.tencent.mm.plugin.appbrand.canvas.a.a> hcH;
  public Paint hcI;
  public Paint hcJ;
  public e hcK;
  private a hcL;
  public c hcM;
  boolean hcN;

  public d(a parama)
  {
    AppMethodBeat.i(103165);
    this.hcI = new Paint();
    this.eIo = new v.b();
    this.hcN = true;
    this.hcL = parama;
    if (this.hcN)
    {
      parama = i.ayp().ayh();
      this.hcE = parama;
      if (!this.hcN)
        break label196;
    }
    label196: for (parama = com.tencent.mm.plugin.appbrand.canvas.action.arg.a.e.ayl().ayh(); ; parama = new com.tencent.mm.plugin.appbrand.canvas.a.a())
    {
      this.hcF = parama;
      this.hcE.setStyle(Paint.Style.STROKE);
      this.hcF.setStyle(Paint.Style.FILL);
      this.hcE.setAntiAlias(true);
      this.hcF.setAntiAlias(true);
      this.hcE.setStrokeWidth(g.qb(1));
      this.hcF.setStrokeWidth(g.qb(1));
      this.hcG = new Stack();
      this.hcH = new Stack();
      this.hcI.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
      AppMethodBeat.o(103165);
      return;
      parama = new com.tencent.mm.plugin.appbrand.canvas.a.a();
      break;
    }
  }

  public final void invalidate()
  {
    AppMethodBeat.i(103169);
    this.hcL.invalidate();
    AppMethodBeat.o(103169);
  }

  public final void reset()
  {
    AppMethodBeat.i(103166);
    this.hcG.clear();
    this.hcH.clear();
    this.hcE.reset();
    this.hcF.reset();
    this.hcE.setStyle(Paint.Style.STROKE);
    this.hcF.setStyle(Paint.Style.FILL);
    this.hcE.setAntiAlias(true);
    this.hcF.setAntiAlias(true);
    this.hcE.setStrokeWidth(g.qb(1));
    this.hcF.setStrokeWidth(g.qb(1));
    AppMethodBeat.o(103166);
  }

  public final void restore()
  {
    AppMethodBeat.i(103168);
    if (this.hcG.isEmpty())
      AppMethodBeat.o(103168);
    while (true)
    {
      return;
      com.tencent.mm.plugin.appbrand.canvas.a.a locala1 = this.hcE;
      com.tencent.mm.plugin.appbrand.canvas.a.a locala2 = this.hcF;
      this.hcE = ((com.tencent.mm.plugin.appbrand.canvas.a.a)this.hcG.pop());
      this.hcF = ((com.tencent.mm.plugin.appbrand.canvas.a.a)this.hcH.pop());
      if (this.hcN)
      {
        if (this.hcE != locala1)
          i.ayp().a(locala1);
        if (this.hcF != locala2)
          com.tencent.mm.plugin.appbrand.canvas.action.arg.a.e.ayl().a(locala2);
      }
      AppMethodBeat.o(103168);
    }
  }

  public final void save()
  {
    AppMethodBeat.i(103167);
    com.tencent.mm.plugin.appbrand.canvas.a.a locala = this.hcE;
    this.hcG.push(this.hcE);
    if (this.hcN)
    {
      this.hcE = i.ayp().ayh();
      locala.b(this.hcE);
      if (this.hcE == null)
        this.hcE = locala;
      locala = this.hcF;
      this.hcH.push(this.hcF);
      if (!this.hcN)
        break label132;
    }
    label132: for (this.hcF = com.tencent.mm.plugin.appbrand.canvas.action.arg.a.e.ayl().ayh(); ; this.hcF = locala.ayq())
    {
      locala.b(this.hcF);
      if (this.hcF == null)
        this.hcF = locala;
      AppMethodBeat.o(103167);
      return;
      this.hcE = locala.ayq();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.d
 * JD-Core Version:    0.6.2
 */
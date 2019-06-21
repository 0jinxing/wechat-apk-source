package com.tencent.mm.cache;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Stack;

public final class a
  implements d<com.tencent.mm.y.a>
{
  public Stack<com.tencent.mm.y.a> efp;
  private Stack<com.tencent.mm.y.a> efq;
  public Matrix efr;
  private int efs;

  public a()
  {
    AppMethodBeat.i(116215);
    this.efr = new Matrix();
    AppMethodBeat.o(116215);
  }

  public final void CO()
  {
    this.efs += 1;
  }

  public final void Je()
  {
    AppMethodBeat.i(116219);
    ab.i("MicroMsg.CropCache", "[onRestore] size:%s", new Object[] { Integer.valueOf(this.efp.size()) });
    this.efp.clear();
    if (this.efq != null)
    {
      ab.i("MicroMsg.CropCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.efq.size()) });
      this.efp.addAll(this.efq);
    }
    AppMethodBeat.o(116219);
  }

  public final com.tencent.mm.y.a Jf()
  {
    AppMethodBeat.i(116220);
    com.tencent.mm.y.a locala;
    if (this.efp.size() <= 0)
    {
      ab.e("MicroMsg.CropCache", "[pop]");
      locala = null;
      AppMethodBeat.o(116220);
    }
    while (true)
    {
      return locala;
      locala = (com.tencent.mm.y.a)this.efp.pop();
      AppMethodBeat.o(116220);
    }
  }

  public final com.tencent.mm.y.a Jg()
  {
    AppMethodBeat.i(116222);
    com.tencent.mm.y.a locala;
    if ((this.efp != null) && (this.efp.size() > 0))
    {
      locala = (com.tencent.mm.y.a)this.efp.peek();
      AppMethodBeat.o(116222);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(116222);
    }
  }

  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
  }

  public final void a(com.tencent.mm.y.a parama)
  {
    AppMethodBeat.i(116221);
    if (this.efp != null)
      this.efp.push(parama);
    AppMethodBeat.o(116221);
  }

  public final int ac(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(116223);
    if (paramBoolean)
      if (this.efp != null)
      {
        i = this.efp.size();
        AppMethodBeat.o(116223);
      }
    while (true)
    {
      return i;
      AppMethodBeat.o(116223);
      continue;
      if (this.efq != null)
      {
        i = this.efq.size();
        AppMethodBeat.o(116223);
      }
      else
      {
        AppMethodBeat.o(116223);
      }
    }
  }

  public final void b(Canvas paramCanvas)
  {
  }

  public final void by(boolean paramBoolean)
  {
    AppMethodBeat.i(116218);
    ab.i("MicroMsg.CropCache", "[onSave] size:%s", new Object[] { Integer.valueOf(this.efp.size()) });
    if (this.efq != null)
      this.efq.clear();
    this.efq = ((Stack)this.efp.clone());
    if (paramBoolean)
      this.efp.clear();
    AppMethodBeat.o(116218);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(116216);
    ab.i("MicroMsg.CropCache", "[onCreate]");
    this.efp = new Stack();
    AppMethodBeat.o(116216);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(116217);
    if (this.efp != null)
      this.efp.clear();
    if (this.efq != null)
      this.efq.clear();
    this.efr.reset();
    AppMethodBeat.o(116217);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cache.a
 * JD-Core Version:    0.6.2
 */
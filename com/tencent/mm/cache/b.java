package com.tencent.mm.cache;

import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.Stack;

public final class b
  implements d<com.tencent.mm.y.b>
{
  private Stack<com.tencent.mm.y.b> efp;
  public Stack<com.tencent.mm.y.b> efq;
  public int efs;

  public final void CO()
  {
    this.efs += 1;
  }

  public final void Je()
  {
    AppMethodBeat.i(116229);
    ab.i("MicroMsg.DoodleCache", "[onRestore] size:%s", new Object[] { Integer.valueOf(this.efp.size()) });
    this.efp.clear();
    if (this.efq != null)
    {
      ab.i("MicroMsg.DoodleCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.efq.size()) });
      this.efp.addAll(this.efq);
    }
    AppMethodBeat.o(116229);
  }

  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
    AppMethodBeat.i(116230);
    if (paramBoolean)
    {
      paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
      localObject = this.efp.iterator();
      while (((Iterator)localObject).hasNext())
        ((com.tencent.mm.y.b)((Iterator)localObject).next()).draw(paramCanvas);
      AppMethodBeat.o(116230);
      return;
    }
    if ((this.efp != null) && (this.efp.size() > 0));
    for (Object localObject = (com.tencent.mm.y.b)this.efp.peek(); ; localObject = null)
    {
      if (localObject != null)
        ((com.tencent.mm.y.b)localObject).draw(paramCanvas);
      AppMethodBeat.o(116230);
      break;
    }
  }

  public final int ac(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(116232);
    if (paramBoolean)
      if (this.efp != null)
      {
        i = this.efp.size();
        AppMethodBeat.o(116232);
      }
    while (true)
    {
      return i;
      AppMethodBeat.o(116232);
      continue;
      if (this.efq != null)
      {
        i = this.efq.size();
        AppMethodBeat.o(116232);
      }
      else
      {
        AppMethodBeat.o(116232);
      }
    }
  }

  public final void b(Canvas paramCanvas)
  {
    AppMethodBeat.i(116231);
    Iterator localIterator = this.efp.iterator();
    while (localIterator.hasNext())
      ((com.tencent.mm.y.b)localIterator.next()).draw(paramCanvas);
    AppMethodBeat.o(116231);
  }

  public final void by(boolean paramBoolean)
  {
    AppMethodBeat.i(116228);
    ab.i("MicroMsg.DoodleCache", "[onSave] size:%s", new Object[] { Integer.valueOf(this.efp.size()) });
    if (this.efq != null)
      this.efq.clear();
    this.efq = ((Stack)this.efp.clone());
    if (paramBoolean)
      this.efp.clear();
    AppMethodBeat.o(116228);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(116226);
    this.efp = new Stack();
    AppMethodBeat.o(116226);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(116227);
    ab.i("MicroMsg.DoodleCache", "[onDestroy]");
    if (this.efp != null)
      this.efp.clear();
    if (this.efq != null)
      this.efq.clear();
    AppMethodBeat.o(116227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cache.b
 * JD-Core Version:    0.6.2
 */
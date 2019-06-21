package com.tencent.mm.graphics.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Timer;

public enum d
{
  public WeakReference<Context> eCP;
  public HashMap<Integer, a> eCQ;
  public final Object eCR;
  public boolean isRunning;
  public Timer mTimer;

  static
  {
    AppMethodBeat.i(57092);
    eCO = new d("INSTANCE");
    eCS = new d[] { eCO };
    AppMethodBeat.o(57092);
  }

  private d()
  {
    AppMethodBeat.i(57089);
    this.eCP = null;
    this.eCQ = new HashMap();
    this.isRunning = false;
    this.mTimer = null;
    this.eCR = new Object();
    AppMethodBeat.o(57089);
  }

  public final b Py()
  {
    AppMethodBeat.i(57090);
    synchronized (this.eCR)
    {
      if (this.eCQ != null)
      {
        localObject2 = (a)this.eCQ.get(Integer.valueOf(2));
        if ((localObject2 != null) && ((localObject2 instanceof b)))
        {
          ((a)localObject2).Pw();
          localObject2 = (b)localObject2;
          AppMethodBeat.o(57090);
          return localObject2;
        }
      }
      Object localObject2 = null;
      AppMethodBeat.o(57090);
    }
  }

  public final void Pz()
  {
    AppMethodBeat.i(57091);
    synchronized (this.eCR)
    {
      if (!this.isRunning)
      {
        AppMethodBeat.o(57091);
        return;
      }
      if (this.mTimer != null)
        this.mTimer.cancel();
      this.isRunning = false;
      if (this.eCQ != null)
        this.eCQ.clear();
      AppMethodBeat.o(57091);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.graphics.b.d
 * JD-Core Version:    0.6.2
 */
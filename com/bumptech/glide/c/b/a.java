package com.bumptech.glide.c.b;

import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.c.h;
import com.bumptech.glide.h.i;
import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class a
{
  final Handler awA;
  private final boolean awy;
  final Map<h, b> azI;
  o.a azJ;
  ReferenceQueue<o<?>> azK;
  private Thread azL;
  volatile boolean azM;
  volatile a.a azN;

  a(boolean paramBoolean)
  {
    AppMethodBeat.i(91749);
    this.awA = new Handler(Looper.getMainLooper(), new a.1(this));
    this.azI = new HashMap();
    this.awy = paramBoolean;
    AppMethodBeat.o(91749);
  }

  final void a(b paramb)
  {
    AppMethodBeat.i(91751);
    j.om();
    this.azI.remove(paramb.azP);
    if ((!paramb.azQ) || (paramb.azR == null))
      AppMethodBeat.o(91751);
    while (true)
    {
      return;
      o localo = new o(paramb.azR, true, false);
      localo.a(paramb.azP, this.azJ);
      this.azJ.b(paramb.azP, localo);
      AppMethodBeat.o(91751);
    }
  }

  final void a(h paramh, o<?> paramo)
  {
    AppMethodBeat.i(91750);
    if (this.azK == null)
    {
      this.azK = new ReferenceQueue();
      this.azL = new Thread(new a.2(this), "glide-active-resources");
      this.azL.start();
    }
    paramo = new b(paramh, paramo, this.azK, this.awy);
    paramh = (b)this.azI.put(paramh, paramo);
    if (paramh != null)
      paramh.reset();
    AppMethodBeat.o(91750);
  }

  static final class b extends WeakReference<o<?>>
  {
    final h azP;
    final boolean azQ;
    u<?> azR;

    b(h paramh, o<?> paramo, ReferenceQueue<? super o<?>> paramReferenceQueue, boolean paramBoolean)
    {
      super(paramReferenceQueue);
      AppMethodBeat.i(91747);
      this.azP = ((h)i.d(paramh, "Argument must not be null"));
      if ((paramo.azQ) && (paramBoolean));
      for (paramh = (u)i.d(paramo.azR, "Argument must not be null"); ; paramh = null)
      {
        this.azR = paramh;
        this.azQ = paramo.azQ;
        AppMethodBeat.o(91747);
        return;
      }
    }

    final void reset()
    {
      AppMethodBeat.i(91748);
      this.azR = null;
      clear();
      AppMethodBeat.o(91748);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a
 * JD-Core Version:    0.6.2
 */
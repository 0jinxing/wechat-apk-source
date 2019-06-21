package com.bumptech.glide.c.d.e;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.b.a;
import com.bumptech.glide.c;
import com.bumptech.glide.c.h;
import com.bumptech.glide.c.m;
import com.bumptech.glide.g.b;
import com.bumptech.glide.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class g
{
  private m<Bitmap> aCk;
  final a aGb;
  private boolean aGc;
  private boolean aGd;
  private com.bumptech.glide.i<Bitmap> aGe;
  g.a aGf;
  boolean aGg;
  g.a aGh;
  Bitmap aGi;
  g.a aGj;
  final j awX;
  private final com.bumptech.glide.c.b.a.e awf;
  final List<g.b> callbacks;
  private final Handler handler;
  boolean isRunning;

  private g(com.bumptech.glide.c.b.a.e parame, j paramj, a parama, com.bumptech.glide.i<Bitmap> parami, m<Bitmap> paramm, Bitmap paramBitmap)
  {
    AppMethodBeat.i(92345);
    this.callbacks = new ArrayList();
    this.awX = paramj;
    paramj = new Handler(Looper.getMainLooper(), new c());
    this.awf = parame;
    this.handler = paramj;
    this.aGe = parami;
    this.aGb = parama;
    a(paramm, paramBitmap);
    AppMethodBeat.o(92345);
  }

  g(c paramc, a parama, int paramInt1, int paramInt2, m<Bitmap> paramm, Bitmap paramBitmap)
  {
    this(paramc.awf, c.af(paramc.awi.getBaseContext()), parama, c.af(paramc.awi.getBaseContext()).lI().a(com.bumptech.glide.f.e.a(com.bumptech.glide.c.b.i.aBj).nP().nQ().aU(paramInt1, paramInt2)), paramm, paramBitmap);
    AppMethodBeat.i(92344);
    AppMethodBeat.o(92344);
  }

  private void nE()
  {
    AppMethodBeat.i(92351);
    if ((!this.isRunning) || (this.aGc))
      AppMethodBeat.o(92351);
    while (true)
    {
      return;
      if (this.aGd)
        if (this.aGj != null)
          break label91;
      label91: for (boolean bool = true; ; bool = false)
      {
        com.bumptech.glide.h.i.b(bool, "Pending target must be null when starting from the first frame");
        this.aGb.lV();
        this.aGd = false;
        if (this.aGj == null)
          break label96;
        g.a locala = this.aGj;
        this.aGj = null;
        a(locala);
        AppMethodBeat.o(92351);
        break;
      }
      label96: this.aGc = true;
      int i = this.aGb.lT();
      long l1 = SystemClock.uptimeMillis();
      long l2 = i;
      this.aGb.advance();
      this.aGh = new g.a(this.handler, this.aGb.lU(), l2 + l1);
      this.aGe.a(com.bumptech.glide.f.e.e(nG())).Q(this.aGb).b(this.aGh);
      AppMethodBeat.o(92351);
    }
  }

  private static h nG()
  {
    AppMethodBeat.i(92354);
    b localb = new b(Double.valueOf(Math.random()));
    AppMethodBeat.o(92354);
    return localb;
  }

  private void start()
  {
    AppMethodBeat.i(92350);
    if (this.isRunning)
      AppMethodBeat.o(92350);
    while (true)
    {
      return;
      this.isRunning = true;
      this.aGg = false;
      nE();
      AppMethodBeat.o(92350);
    }
  }

  final void a(g.a parama)
  {
    AppMethodBeat.i(92353);
    this.aGc = false;
    if (this.aGg)
    {
      this.handler.obtainMessage(2, parama).sendToTarget();
      AppMethodBeat.o(92353);
    }
    while (true)
    {
      return;
      if (!this.isRunning)
      {
        this.aGj = parama;
        AppMethodBeat.o(92353);
      }
      else
      {
        if (parama.aGl != null)
        {
          nF();
          g.a locala = this.aGf;
          this.aGf = parama;
          for (int i = this.callbacks.size() - 1; i >= 0; i--)
            ((g.b)this.callbacks.get(i)).nC();
          if (locala != null)
            this.handler.obtainMessage(2, locala).sendToTarget();
        }
        nE();
        AppMethodBeat.o(92353);
      }
    }
  }

  final void a(g.b paramb)
  {
    AppMethodBeat.i(92347);
    if (this.aGg)
    {
      paramb = new IllegalStateException("Cannot subscribe to a cleared frame loader");
      AppMethodBeat.o(92347);
      throw paramb;
    }
    if (this.callbacks.contains(paramb))
    {
      paramb = new IllegalStateException("Cannot subscribe twice in a row");
      AppMethodBeat.o(92347);
      throw paramb;
    }
    boolean bool = this.callbacks.isEmpty();
    this.callbacks.add(paramb);
    if (bool)
      start();
    AppMethodBeat.o(92347);
  }

  final void a(m<Bitmap> paramm, Bitmap paramBitmap)
  {
    AppMethodBeat.i(92346);
    this.aCk = ((m)com.bumptech.glide.h.i.d(paramm, "Argument must not be null"));
    this.aGi = ((Bitmap)com.bumptech.glide.h.i.d(paramBitmap, "Argument must not be null"));
    this.aGe = this.aGe.a(new com.bumptech.glide.f.e().a(paramm));
    AppMethodBeat.o(92346);
  }

  final void b(g.b paramb)
  {
    AppMethodBeat.i(92348);
    this.callbacks.remove(paramb);
    if (this.callbacks.isEmpty())
      this.isRunning = false;
    AppMethodBeat.o(92348);
  }

  final int getFrameCount()
  {
    AppMethodBeat.i(92349);
    int i = this.aGb.getFrameCount();
    AppMethodBeat.o(92349);
    return i;
  }

  final Bitmap nD()
  {
    if (this.aGf != null);
    for (Bitmap localBitmap = this.aGf.aGl; ; localBitmap = this.aGi)
      return localBitmap;
  }

  final void nF()
  {
    AppMethodBeat.i(92352);
    if (this.aGi != null)
    {
      this.awf.g(this.aGi);
      this.aGi = null;
    }
    AppMethodBeat.o(92352);
  }

  final class c
    implements Handler.Callback
  {
    c()
    {
    }

    public final boolean handleMessage(Message paramMessage)
    {
      AppMethodBeat.i(92343);
      boolean bool;
      if (paramMessage.what == 1)
      {
        paramMessage = (g.a)paramMessage.obj;
        g.this.a(paramMessage);
        AppMethodBeat.o(92343);
        bool = true;
      }
      while (true)
      {
        return bool;
        if (paramMessage.what == 2)
        {
          paramMessage = (g.a)paramMessage.obj;
          g.this.awX.c(paramMessage);
        }
        bool = false;
        AppMethodBeat.o(92343);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.e.g
 * JD-Core Version:    0.6.2
 */
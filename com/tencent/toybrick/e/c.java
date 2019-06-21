package com.tencent.toybrick.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.toybrick.g.b;
import java.lang.ref.WeakReference;

public final class c
{
  public static volatile c AHh;
  private Handler mMainHandler;

  static
  {
    AppMethodBeat.i(113244);
    AHh = new c();
    AppMethodBeat.o(113244);
  }

  private c()
  {
    AppMethodBeat.i(113240);
    this.mMainHandler = new c.1(this, Looper.getMainLooper());
    AppMethodBeat.o(113240);
  }

  public static void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(138671);
    a.dSz().execute(paramRunnable);
    AppMethodBeat.o(138671);
  }

  public final void a(com.tencent.toybrick.f.a parama, b paramb, ImageView paramImageView)
  {
    AppMethodBeat.i(113242);
    parama = new c(parama, paramb, new c.2(this, new WeakReference(paramImageView)), parama.AHp.hashCode());
    a.dSz().execute(parama);
    AppMethodBeat.o(113242);
  }

  public final void a(com.tencent.toybrick.f.a parama, b paramb, a parama1)
  {
    AppMethodBeat.i(113241);
    parama = new c(parama, paramb, parama1, parama.AHp.hashCode());
    a.dSz().execute(parama);
    AppMethodBeat.o(113241);
  }

  public static abstract interface a<H, T>
  {
    public abstract void H(H paramH, T paramT);
  }

  final class c
    implements Runnable
  {
    private WeakReference<com.tencent.toybrick.f.a> AHk;
    private WeakReference<b> AHl;
    private c.a AHm;
    private int key;
    private Object object;

    public c(com.tencent.toybrick.f.a paramb, b parama, c.a paramInt, int arg5)
    {
      AppMethodBeat.i(113236);
      this.AHk = new WeakReference(paramb);
      this.AHl = new WeakReference(parama);
      this.AHm = paramInt;
      int i;
      this.key = i;
      AppMethodBeat.o(113236);
    }

    public final void run()
    {
      AppMethodBeat.i(113237);
      Object localObject = (com.tencent.toybrick.f.a)this.AHk.get();
      b localb = (b)this.AHl.get();
      if ((localObject != null) && (localb != null))
      {
        this.object = localb.dSA();
        localObject = new Message();
        ((Message)localObject).what = 2;
        ((Message)localObject).obj = this;
        c.a(c.this).sendMessage((Message)localObject);
      }
      AppMethodBeat.o(113237);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.e.c
 * JD-Core Version:    0.6.2
 */
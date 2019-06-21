package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class e extends com.google.android.exoplayer2.a
  implements Handler.Callback
{
  private boolean beE;
  private final c beY;
  private final e.a beZ;
  private final k bef;
  private final Handler bfa;
  private final d bfb;
  private final Metadata[] bfc;
  private final long[] bfd;
  private int bfe;
  private int bff;
  private a bfg;

  public e(e.a parama, Looper paramLooper)
  {
    this(parama, paramLooper, c.beX);
  }

  private e(e.a parama, Looper paramLooper, c paramc)
  {
    super(4);
    AppMethodBeat.i(95349);
    this.beZ = ((e.a)com.google.android.exoplayer2.i.a.checkNotNull(parama));
    if (paramLooper == null);
    for (parama = null; ; parama = new Handler(paramLooper, this))
    {
      this.bfa = parama;
      this.beY = ((c)com.google.android.exoplayer2.i.a.checkNotNull(paramc));
      this.bef = new k();
      this.bfb = new d();
      this.bfc = new Metadata[5];
      this.bfd = new long[5];
      AppMethodBeat.o(95349);
      return;
    }
  }

  private void d(Metadata paramMetadata)
  {
    AppMethodBeat.i(95357);
    this.beZ.b(paramMetadata);
    AppMethodBeat.o(95357);
  }

  private void rN()
  {
    AppMethodBeat.i(95355);
    Arrays.fill(this.bfc, null);
    this.bfe = 0;
    this.bff = 0;
    AppMethodBeat.o(95355);
  }

  public final void a(Format[] paramArrayOfFormat, long paramLong)
  {
    AppMethodBeat.i(95351);
    this.bfg = this.beY.h(paramArrayOfFormat[0]);
    AppMethodBeat.o(95351);
  }

  public final int b(Format paramFormat)
  {
    AppMethodBeat.i(95350);
    int i;
    if (this.beY.g(paramFormat))
    {
      i = 4;
      AppMethodBeat.o(95350);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(95350);
    }
  }

  public final void b(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(95352);
    rN();
    this.beE = false;
    AppMethodBeat.o(95352);
  }

  public final void f(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95353);
    if ((!this.beE) && (this.bff < 5))
    {
      this.bfb.clear();
      if (a(this.bef, this.bfb, false) == -4)
      {
        if (!this.bfb.qG())
          break label150;
        this.beE = true;
      }
    }
    if ((this.bff > 0) && (this.bfd[this.bfe] <= paramLong1))
    {
      Metadata localMetadata = this.bfc[this.bfe];
      if (this.bfa == null)
        break label265;
      this.bfa.obtainMessage(0, localMetadata).sendToTarget();
    }
    while (true)
    {
      label150: com.google.android.exoplayer2.e locale;
      while (true)
      {
        this.bfc[this.bfe] = null;
        this.bfe = ((this.bfe + 1) % 5);
        this.bff -= 1;
        AppMethodBeat.o(95353);
        return;
        if (this.bfb.qF())
          break;
        this.bfb.aOr = this.bef.aOv.aOr;
        this.bfb.qL();
        try
        {
          int i = (this.bfe + this.bff) % 5;
          this.bfc[i] = this.bfg.a(this.bfb);
          this.bfd[i] = this.bfb.aSk;
          this.bff += 1;
        }
        catch (b localb)
        {
          locale = com.google.android.exoplayer2.e.b(localb, this.index);
          AppMethodBeat.o(95353);
          throw locale;
        }
      }
      label265: d(locale);
    }
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(95356);
    switch (paramMessage.what)
    {
    default:
      paramMessage = new IllegalStateException();
      AppMethodBeat.o(95356);
      throw paramMessage;
    case 0:
    }
    d((Metadata)paramMessage.obj);
    AppMethodBeat.o(95356);
    return true;
  }

  public final boolean isReady()
  {
    return true;
  }

  public final void pK()
  {
    AppMethodBeat.i(95354);
    rN();
    this.bfg = null;
    AppMethodBeat.o(95354);
  }

  public final boolean qf()
  {
    return this.beE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.e
 * JD-Core Version:    0.6.2
 */
package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class a$a
{
  public final a bfZ;
  private final long bga;
  public final Handler handler;

  public a$a(Handler paramHandler, a parama)
  {
    this(paramHandler, parama, (byte)0);
  }

  private a$a(Handler paramHandler, a parama, byte paramByte)
  {
    AppMethodBeat.i(95435);
    if (parama != null);
    for (paramHandler = (Handler)com.google.android.exoplayer2.i.a.checkNotNull(paramHandler); ; paramHandler = null)
    {
      this.handler = paramHandler;
      this.bfZ = parama;
      this.bga = 0L;
      AppMethodBeat.o(95435);
      return;
    }
  }

  public final void a(i parami, int paramInt1, int paramInt2, Format paramFormat, int paramInt3, Object paramObject, long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(95436);
    if (this.bfZ != null)
      this.handler.post(new a.a.1(this, parami, paramInt1, paramInt2, paramFormat, paramInt3, paramObject, paramLong1, paramLong2, paramLong3));
    AppMethodBeat.o(95436);
  }

  public final void a(final i parami, final int paramInt1, final int paramInt2, final Format paramFormat, final int paramInt3, final Object paramObject, final long paramLong1, long paramLong2, final long paramLong3, long paramLong4, final long paramLong5)
  {
    AppMethodBeat.i(95438);
    if (this.bfZ != null)
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(95430);
          a locala = a.a.this.bfZ;
          a.a.a(a.a.this, paramLong1);
          a.a.a(a.a.this, paramLong3);
          locala.rO();
          AppMethodBeat.o(95430);
        }
      });
    AppMethodBeat.o(95438);
  }

  public final void a(i parami, int paramInt1, int paramInt2, Format paramFormat, int paramInt3, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, IOException paramIOException, boolean paramBoolean)
  {
    AppMethodBeat.i(95442);
    if (this.bfZ != null)
      this.handler.post(new a.a.4(this, parami, paramInt1, paramInt2, paramFormat, paramInt3, paramObject, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramIOException, paramBoolean));
    AppMethodBeat.o(95442);
  }

  public final void a(i parami, long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(95437);
    a(parami, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3);
    AppMethodBeat.o(95437);
  }

  public final void a(i parami, long paramLong1, long paramLong2, long paramLong3, IOException paramIOException, boolean paramBoolean)
  {
    AppMethodBeat.i(95441);
    a(parami, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3, paramIOException, paramBoolean);
    AppMethodBeat.o(95441);
  }

  public final void b(i parami, int paramInt1, int paramInt2, Format paramFormat, int paramInt3, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    AppMethodBeat.i(95440);
    if (this.bfZ != null)
      this.handler.post(new a.a.3(this, parami, paramInt1, paramInt2, paramFormat, paramInt3, paramObject, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5));
    AppMethodBeat.o(95440);
  }

  public final void b(i parami, long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(95439);
    b(parami, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3);
    AppMethodBeat.o(95439);
  }

  public final void rQ()
  {
    AppMethodBeat.i(95443);
    this.handler.post(new a.a.6(this));
    AppMethodBeat.o(95443);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.a.a
 * JD-Core Version:    0.6.2
 */
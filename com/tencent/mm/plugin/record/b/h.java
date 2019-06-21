package com.tencent.mm.plugin.record.b;

import android.os.SystemClock;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.record.a.b;
import com.tencent.mm.plugin.record.a.c;
import com.tencent.mm.sdk.platformtools.al;
import java.util.LinkedList;
import java.util.List;

public abstract class h<T extends c>
  implements b
{
  private SparseArray<h<T>.a> pJA = new SparseArray();
  private LinkedList<T> pJB = new LinkedList();
  private long pJC = 0L;
  private boolean pJx = false;
  final int pJy = 3;
  private final int pJz = 300000;

  protected abstract List<T> ceF();

  protected final void ceG()
  {
    this.pJx = false;
    run();
  }

  public final void finish()
  {
    this.pJB.clear();
    this.pJA.clear();
    this.pJx = false;
  }

  public final void run()
  {
    g.RQ();
    g.RS().aa(new h.1(this));
  }

  final class a
  {
    int ghB;
    long pJE;

    private a()
    {
      AppMethodBeat.i(135668);
      this.pJE = SystemClock.elapsedRealtime();
      this.ghB = h.this.pJy;
      AppMethodBeat.o(135668);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.h
 * JD-Core Version:    0.6.2
 */
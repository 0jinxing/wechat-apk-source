package com.tencent.mm.plugin.priority.b;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.priority.b.b.a;
import com.tencent.mm.sdk.platformtools.al;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  public List<Object> pgp;
  public al pgq;
  public d.a pgr;

  public d()
  {
    AppMethodBeat.i(54899);
    this.pgp = new LinkedList();
    this.pgq = new al("Priority.PriorityTaskRunner");
    this.pgr = new d.a(this, this.pgq.oAl.getLooper());
    AppMethodBeat.o(54899);
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(54901);
    if (this.pgr != null)
    {
      parama = this.pgr.obtainMessage(1, parama);
      this.pgr.sendMessage(parama);
    }
    AppMethodBeat.o(54901);
  }

  public final void b(a parama)
  {
    AppMethodBeat.i(54902);
    if (this.pgr != null)
    {
      parama = this.pgr.obtainMessage(1, parama);
      this.pgr.sendMessageDelayed(parama, 1000L);
    }
    AppMethodBeat.o(54902);
  }

  public final void ju(long paramLong)
  {
    AppMethodBeat.i(54900);
    if (this.pgr != null)
      if (paramLong == 0L)
      {
        this.pgr.sendEmptyMessage(0);
        AppMethodBeat.o(54900);
      }
    while (true)
    {
      return;
      this.pgr.sendEmptyMessageDelayed(0, paramLong);
      AppMethodBeat.o(54900);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.b.d
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.backup.backupui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class a$a
  implements b.a
{
  private final WeakReference<a> jyI;

  a$a(a parama)
  {
    AppMethodBeat.i(17711);
    this.jyI = new WeakReference(parama);
    AppMethodBeat.o(17711);
  }

  public final void ri(int paramInt)
  {
    AppMethodBeat.i(17712);
    a locala = (a)this.jyI.get();
    if (locala != null)
    {
      a.a(locala, paramInt);
      AppMethodBeat.o(17712);
    }
    while (true)
    {
      return;
      ab.e(a.access$100(), "BackupChatBanner WeakReference is null!");
      AppMethodBeat.o(17712);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupui.a.a
 * JD-Core Version:    0.6.2
 */
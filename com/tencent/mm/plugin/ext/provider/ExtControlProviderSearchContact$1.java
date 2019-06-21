package com.tencent.mm.plugin.ext.provider;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.d.a.b;

final class ExtControlProviderSearchContact$1
  implements Runnable
{
  ExtControlProviderSearchContact$1(ExtControlProviderSearchContact paramExtControlProviderSearchContact, Cursor paramCursor, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20385);
    ExtControlProviderSearchContact.a(this.lQH, ExtControlProviderSearchContact.g(this.haW));
    this.jDX.countDown();
    AppMethodBeat.o(20385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderSearchContact.1
 * JD-Core Version:    0.6.2
 */
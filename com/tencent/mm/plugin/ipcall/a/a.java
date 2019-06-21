package com.tencent.mm.plugin.ipcall.a;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.HashMap;

public final class a
{
  private static a nvl = null;
  private long endTime;
  ak handler;
  private boolean isLoading;
  public ArrayList<a> nvk;
  private long startTime;

  private a()
  {
    AppMethodBeat.i(21706);
    this.isLoading = false;
    this.nvk = new ArrayList();
    this.startTime = -1L;
    this.endTime = -1L;
    this.handler = new a.1(this, Looper.getMainLooper());
    AppMethodBeat.o(21706);
  }

  public static a bHb()
  {
    AppMethodBeat.i(21707);
    if (nvl == null)
      nvl = new a();
    a locala = nvl;
    AppMethodBeat.o(21707);
    return locala;
  }

  public final void a(a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(21708);
    if (parama != null)
      this.nvk.add(parama);
    if (this.isLoading)
    {
      ab.d("MicroMsg.IPCallAddressBookLoader", "loadAllAddressItem, isLoading is true, ignore");
      AppMethodBeat.o(21708);
    }
    while (true)
    {
      return;
      this.startTime = System.currentTimeMillis();
      if ((b.bHW().size() == 0) || (!paramBoolean))
      {
        ab.d("MicroMsg.IPCallAddressBookLoader", "loadFromSystemAddressBook");
        long l = System.currentTimeMillis();
        new b();
        ArrayList localArrayList = b.bHV();
        ab.d("MicroMsg.IPCallAddressBookLoader", "getAllAddressItemFromSystemPhoneBook, used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        parama = this.handler.obtainMessage();
        parama.obj = localArrayList;
        this.handler.sendMessage(parama);
        this.isLoading = true;
        AppMethodBeat.o(21708);
      }
      else
      {
        AppMethodBeat.o(21708);
      }
    }
  }

  public static abstract interface a
  {
    public abstract void aLj();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.a
 * JD-Core Version:    0.6.2
 */
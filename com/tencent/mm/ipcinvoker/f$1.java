package com.tencent.mm.ipcinvoker;

import android.os.Parcelable;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$1
  implements Runnable
{
  f$1(String paramString, Class paramClass, Parcelable paramParcelable, c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114025);
    Object localObject;
    if (e.lg(this.eFP))
    {
      localObject = (a)k.i(this.eGa, a.class);
      if (localObject == null)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.IPCInvoker", "invokeAsync failed, newInstance(%s) return null.", new Object[] { this.eGa });
        AppMethodBeat.o(114025);
      }
    }
    while (true)
    {
      return;
      ((a)localObject).a(this.eGb, this.eFW);
      AppMethodBeat.o(114025);
      continue;
      com.tencent.mm.ipcinvoker.b.a locala = b.PL().ld(this.eFP);
      if (locala == null)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.IPCInvoker", "invokeAsync failed, get bridge is null by process(%s).", new Object[] { this.eFP });
        AppMethodBeat.o(114025);
      }
      else
      {
        localObject = null;
        try
        {
          if (this.eFW != null)
          {
            localObject = new com/tencent/mm/ipcinvoker/f$a;
            ((f.a)localObject).<init>(this.eFP, this.eFW);
          }
          locala.a(f.c(this.eGb), this.eGa.getName(), (com.tencent.mm.ipcinvoker.b.b)localObject);
          AppMethodBeat.o(114025);
        }
        catch (RemoteException localRemoteException)
        {
          com.tencent.mm.ipcinvoker.h.b.d("IPC.IPCInvoker", "invokeAsync failed, ipc invoke error : %s", new Object[] { localRemoteException });
          AppMethodBeat.o(114025);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.f.1
 * JD-Core Version:    0.6.2
 */
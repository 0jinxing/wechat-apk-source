package com.tencent.mm.ipcinvoker;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.b.b.a;

final class f$a extends b.a
  implements com.tencent.mm.ipcinvoker.f.c
{
  String eFV;
  c eGc;

  f$a(String paramString, c paramc)
  {
    AppMethodBeat.i(114026);
    this.eGc = paramc;
    this.eFV = paramString;
    com.tencent.mm.ipcinvoker.f.b.a(paramString, this);
    com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCInvokeCallbackWrapper", "keep ref of callback(%s)", new Object[] { Integer.valueOf(paramc.hashCode()) });
    AppMethodBeat.o(114026);
  }

  protected final void finalize()
  {
    AppMethodBeat.i(114029);
    recycle();
    com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCInvokeCallbackWrapper", "finalize(%s)", new Object[] { Integer.valueOf(hashCode()) });
    super.finalize();
    AppMethodBeat.o(114029);
  }

  public final void l(Bundle paramBundle)
  {
    AppMethodBeat.i(114027);
    c localc = this.eGc;
    if (localc == null)
    {
      com.tencent.mm.ipcinvoker.h.b.w("IPC.IPCInvokeCallbackWrapper", "callback failed, ref has been release", new Object[0]);
      AppMethodBeat.o(114027);
    }
    while (true)
    {
      return;
      if (paramBundle == null)
      {
        localc.ao(null);
        AppMethodBeat.o(114027);
      }
      else
      {
        paramBundle.setClassLoader(f.class.getClassLoader());
        if (paramBundle.getBoolean("__command_release_ref"))
        {
          com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCInvokeCallbackWrapper", "release ref of callback(%s)", new Object[] { Integer.valueOf(localc.hashCode()) });
          recycle();
          AppMethodBeat.o(114027);
        }
        else
        {
          localc.ao(paramBundle.getParcelable("__remote_task_result_data"));
          AppMethodBeat.o(114027);
        }
      }
    }
  }

  public final void recycle()
  {
    AppMethodBeat.i(114028);
    this.eGc = null;
    com.tencent.mm.ipcinvoker.f.b.b(this.eFV, this);
    AppMethodBeat.o(114028);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.f.a
 * JD-Core Version:    0.6.2
 */
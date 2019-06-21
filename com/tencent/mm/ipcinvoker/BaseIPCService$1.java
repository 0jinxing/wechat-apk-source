package com.tencent.mm.ipcinvoker;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.b.a.a;

final class BaseIPCService$1 extends a.a
{
  BaseIPCService$1(BaseIPCService paramBaseIPCService)
  {
  }

  public final void a(Bundle paramBundle, String paramString, com.tencent.mm.ipcinvoker.b.b paramb)
  {
    AppMethodBeat.i(113998);
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeAsync failed, class is null or nil.", new Object[0]);
      AppMethodBeat.o(113998);
    }
    while (true)
    {
      return;
      if (paramBundle == null)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeAsync failed, data is null.", new Object[0]);
        AppMethodBeat.o(113998);
      }
      else
      {
        paramBundle.setClassLoader(BaseIPCService.class.getClassLoader());
        paramBundle = paramBundle.getParcelable("__remote_task_data");
        a locala = (a)k.b(paramString, a.class);
        if (locala == null)
        {
          com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeAsync failed, can not newInstance by class %s.", new Object[] { paramString });
          AppMethodBeat.o(113998);
        }
        else
        {
          m.post(new BaseIPCService.1.1(this, locala, paramBundle, paramb));
          AppMethodBeat.o(113998);
        }
      }
    }
  }

  public final Bundle f(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(113999);
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeSync failed, class is null or nil.", new Object[0]);
      AppMethodBeat.o(113999);
      paramBundle = null;
    }
    while (true)
    {
      return paramBundle;
      if (paramBundle == null)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeSync failed, data is null.", new Object[0]);
        AppMethodBeat.o(113999);
        paramBundle = null;
      }
      else
      {
        i locali = (i)k.b(paramString, i.class);
        if (locali == null)
        {
          com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeSync failed, can not newInstance by class %s.", new Object[] { paramString });
          AppMethodBeat.o(113999);
          paramBundle = null;
        }
        else
        {
          paramBundle.setClassLoader(BaseIPCService.class.getClassLoader());
          paramString = paramBundle.getParcelable("__remote_task_data");
          paramBundle = new Bundle();
          paramBundle.putParcelable("__remote_task_result_data", (Parcelable)locali.am(paramString));
          AppMethodBeat.o(113999);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.BaseIPCService.1
 * JD-Core Version:    0.6.2
 */
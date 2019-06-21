package com.tencent.mm.plugin.appbrand.config;

import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;

final class r$5
  implements Runnable
{
  r$5(String paramString, boolean paramBoolean1, r.b paramb, boolean paramBoolean2)
  {
  }

  public final void run()
  {
    int i = 1;
    AppMethodBeat.i(129917);
    Object localObject = this.eiH;
    boolean bool;
    if ((this.hhG) && (r.zr(this.eiH)))
    {
      bool = true;
      localObject = r.a((String)localObject, bool, new r.a()
      {
        public final String getUsername()
        {
          return r.5.this.eiH;
        }

        public final k zv(String paramAnonymousString)
        {
          AppMethodBeat.i(129914);
          paramAnonymousString = new k(paramAnonymousString, null);
          AppMethodBeat.o(129914);
          return paramAnonymousString;
        }
      });
      if (this.hhH != null)
      {
        if (((Pair)localObject).second != null)
          break label104;
        label59: this.hhH.f(i, ((Pair)localObject).first);
      }
      if (!this.hhI)
        break label141;
    }
    while (true)
    {
      try
      {
        ((HandlerThread)Looper.myLooper().getThread()).quit();
        AppMethodBeat.o(129917);
        return;
        bool = false;
        break;
        label104: if ((((a.a)((Pair)localObject).second).errType != 0) || (((a.a)((Pair)localObject).second).errCode != 0))
        {
          i = 3;
          break label59;
        }
        i = 2;
      }
      catch (Exception localException)
      {
      }
      label141: AppMethodBeat.o(129917);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.r.5
 * JD-Core Version:    0.6.2
 */
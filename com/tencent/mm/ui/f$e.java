package com.tencent.mm.ui;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.LinkedList;

final class f$e
{
  f<K, T>.e.b ygG;
  private f<K, T>.e.c ygH;
  LinkedList<Integer> ygI;
  int ygJ;

  public f$e(f paramf)
  {
    AppMethodBeat.i(29181);
    dwI();
    AppMethodBeat.o(29181);
  }

  private void dwI()
  {
    AppMethodBeat.i(29182);
    this.ygG = new b(Looper.getMainLooper());
    this.ygH = new f.e.c(this, aw.RS().oAl.getLooper());
    AppMethodBeat.o(29182);
  }

  private void dwJ()
  {
    AppMethodBeat.i(29183);
    Object localObject = this.ygH;
    ((f.e.c)localObject).removeMessages(((f.e.c)localObject).ygQ);
    ((f.e.c)localObject).removeMessages(((f.e.c)localObject).ygR);
    localObject = this.ygG;
    ((b)localObject).ygM = true;
    ((b)localObject).removeMessages(1);
    ((b)localObject).removeMessages(2);
    this.ygI.clear();
    this.ygJ = 0;
    AppMethodBeat.o(29183);
  }

  final void MR(int paramInt)
  {
    try
    {
      AppMethodBeat.i(29188);
      if (!this.ygI.contains(Integer.valueOf(paramInt)))
        this.ygI.add(Integer.valueOf(paramInt));
      this.ygJ = dwL();
      f.e.c localc = this.ygH;
      localc.sendEmptyMessage(localc.ygR);
      AppMethodBeat.o(29188);
      return;
    }
    finally
    {
    }
  }

  public final void dwK()
  {
    try
    {
      AppMethodBeat.i(29184);
      ab.i(this.ygC.TAG, "newcursor resetQueue ");
      dwJ();
      dwI();
      AppMethodBeat.o(29184);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final int dwL()
  {
    int i = 0;
    AppMethodBeat.i(29186);
    if (this.ygI.size() > 1)
      i = 2;
    while (true)
    {
      AppMethodBeat.o(29186);
      return i;
      if (this.ygI.size() == 1)
        i = ((Integer)this.ygI.get(0)).intValue();
    }
  }

  public final boolean dwM()
  {
    try
    {
      int i = this.ygJ;
      if (i != 0)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  final void dwN()
  {
    try
    {
      AppMethodBeat.i(29187);
      this.ygH.lastUpdateTime = System.currentTimeMillis();
      AppMethodBeat.o(29187);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final int dwO()
  {
    try
    {
      int i = this.ygJ;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void quit()
  {
    try
    {
      AppMethodBeat.i(29185);
      ab.i(this.ygC.TAG, "newcursor quit ");
      dwJ();
      AppMethodBeat.o(29185);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final class b extends ak
  {
    boolean ygM;
    public final int ygN = 1;
    public final int ygO = 2;

    public b(Looper arg2)
    {
      super();
    }

    public final void handleMessage(Message paramMessage)
    {
      AppMethodBeat.i(29178);
      super.handleMessage(paramMessage);
      if (this.ygM)
        AppMethodBeat.o(29178);
      while (true)
      {
        return;
        synchronized (f.e.this)
        {
          f.e.this.ygJ = f.e.this.dwL();
          ab.i(f.e.this.ygC.TAG, "newcursor updateWorkerRefresh status %d", new Object[] { Integer.valueOf(f.e.this.ygJ) });
          if (paramMessage.what == 1)
          {
            f.d(f.e.this.ygC);
            AppMethodBeat.o(29178);
          }
        }
        if (paramMessage.what == 2)
          f.a(f.e.this.ygC, (f.c)paramMessage.obj, false, true);
        AppMethodBeat.o(29178);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.e
 * JD-Core Version:    0.6.2
 */
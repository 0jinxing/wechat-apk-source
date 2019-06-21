package com.tencent.mm.plugin.fav.a;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;

public final class d
{
  private static d meL = null;
  private long endTime;
  private boolean hZu;
  ak mHandler;
  public ArrayList<d.a> meK;
  private Object meM;
  private Runnable meN;
  private long startTime;

  private d()
  {
    AppMethodBeat.i(102625);
    this.hZu = false;
    this.meK = new ArrayList();
    this.startTime = -1L;
    this.endTime = -1L;
    this.meM = new Object();
    this.meN = new d.1(this);
    this.mHandler = new ak(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(102624);
        Iterator localIterator = d.this.meK.iterator();
        while (localIterator.hasNext())
        {
          paramAnonymousMessage = (d.a)localIterator.next();
          if (paramAnonymousMessage != null)
            paramAnonymousMessage.onFinish();
        }
        d.this.meK.clear();
        AppMethodBeat.o(102624);
      }
    };
    AppMethodBeat.o(102625);
  }

  public static d bur()
  {
    try
    {
      AppMethodBeat.i(102626);
      if (meL == null)
      {
        locald = new com/tencent/mm/plugin/fav/a/d;
        locald.<init>();
        meL = locald;
      }
      d locald = meL;
      AppMethodBeat.o(102626);
      return locald;
    }
    finally
    {
    }
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(102627);
    synchronized (this.meM)
    {
      if (((Boolean)g.RP().Ry().get(ac.a.xLL, Boolean.FALSE)).booleanValue())
      {
        if (parama != null)
          parama.onFinish();
        AppMethodBeat.o(102627);
      }
      while (true)
      {
        return;
        if (parama != null)
          this.meK.add(parama);
        if (!this.hZu)
          break;
        ab.i("MicroMsg.FavCleanFirstLoader", "isLoading is true, ignore");
        AppMethodBeat.o(102627);
      }
      this.hZu = true;
      this.startTime = System.currentTimeMillis();
      com.tencent.mm.sdk.g.d.post(this.meN, "FavCleanFirstLoader_CalFavDataLength");
      AppMethodBeat.o(102627);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.d
 * JD-Core Version:    0.6.2
 */
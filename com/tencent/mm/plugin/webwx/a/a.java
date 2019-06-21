package com.tencent.mm.plugin.webwx.a;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bk;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.util.HashMap;

public final class a
  implements f, t.a
{
  private static int uKZ = 1048576;
  private static int uLa = 26214400;
  private bk uLb;
  private HashMap<String, bi> uLc;

  public a()
  {
    AppMethodBeat.i(26484);
    this.uLc = new HashMap();
    this.uLb = new bk();
    Object localObject = new StringBuilder();
    g.RQ();
    localObject = com.tencent.mm.a.e.f(g.RP().cachePath + "syncmsgid.ini", 0, -1);
    if (!bo.cb((byte[])localObject));
    try
    {
      this.uLb.parseFrom((byte[])localObject);
      o.all().a(this, Looper.getMainLooper());
      g.Rg().a(221, this);
      AppMethodBeat.o(26484);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.w("MicroMsg.MultiTerminalSyncMgr", "task parse Error");
    }
  }

  private void dde()
  {
    AppMethodBeat.i(26488);
    try
    {
      byte[] arrayOfByte = this.uLb.toByteArray();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      g.RQ();
      com.tencent.mm.a.e.b(g.RP().cachePath + "syncmsgid.ini", arrayOfByte, arrayOfByte.length);
      AppMethodBeat.o(26488);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.w("MicroMsg.MultiTerminalSyncMgr", "task to file Error");
        AppMethodBeat.o(26488);
      }
    }
  }

  public final void a(t.a.a parama)
  {
    AppMethodBeat.i(26489);
    bi localbi = (bi)this.uLc.get(parama.fileName);
    if (localbi == null)
      AppMethodBeat.o(26489);
    while (true)
    {
      return;
      parama = u.ut(localbi.field_imgPath);
      if (parama == null)
      {
        AppMethodBeat.o(26489);
      }
      else if ((localbi.dtH()) || (parama.status == 199))
      {
        ab.i("MicroMsg.MultiTerminalSyncMgr", "download video end: %d, status:%d", new Object[] { Long.valueOf(localbi.field_msgId), Integer.valueOf(parama.status) });
        lV(localbi.field_msgId);
        this.uLc.remove(localbi.field_imgPath);
        AppMethodBeat.o(26489);
      }
      else
      {
        if (localbi.field_status == 198)
          this.uLc.remove(localbi.field_imgPath);
        AppMethodBeat.o(26489);
      }
    }
  }

  public final void ddd()
  {
    AppMethodBeat.i(26487);
    new ak(Looper.getMainLooper()).post(new a.3(this));
    AppMethodBeat.o(26487);
  }

  public final void lU(final long paramLong)
  {
    AppMethodBeat.i(26485);
    aw.ZK();
    if (!((Boolean)c.Ry().get(ac.a.xPS, Boolean.TRUE)).booleanValue())
    {
      ab.i("MicroMsg.MultiTerminalSyncMgr", "autoSyncState close");
      AppMethodBeat.o(26485);
    }
    while (true)
    {
      return;
      new ak(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(26480);
          a.a(a.this, paramLong);
          AppMethodBeat.o(26480);
        }
      });
      AppMethodBeat.o(26485);
    }
  }

  public final void lV(long paramLong)
  {
    AppMethodBeat.i(26486);
    new ak(Looper.getMainLooper()).post(new a.2(this, paramLong));
    AppMethodBeat.o(26486);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26490);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof com.tencent.mm.plugin.record.b.e)))
    {
      long l = ((com.tencent.mm.plugin.record.b.e)paramm).cvx;
      lV(l);
      ab.i("MicroMsg.MultiTerminalSyncMgr", "download attach end: %d", new Object[] { Long.valueOf(l) });
    }
    AppMethodBeat.o(26490);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.a.a
 * JD-Core Version:    0.6.2
 */
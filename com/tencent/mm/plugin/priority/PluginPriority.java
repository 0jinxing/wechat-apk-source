package com.tencent.mm.plugin.priority;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.List;

public class PluginPriority extends f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.priority.a.a
{
  private long pfZ;
  private com.tencent.mm.plugin.priority.b.b pga;
  private com.tencent.mm.plugin.priority.b.a.c pgb;
  private com.tencent.mm.plugin.priority.b.a.d pgc;
  private com.tencent.mm.plugin.priority.b.d pgd;
  private com.tencent.mm.plugin.priority.b.a.b pge;
  private com.tencent.mm.plugin.priority.b.a.a pgf;
  private h.a pgg;

  public PluginPriority()
  {
    AppMethodBeat.i(54868);
    this.pgg = new PluginPriority.1(this);
    AppMethodBeat.o(54868);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(54871);
    if (paramg.SG())
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.comm.a.b.class, new a());
    AppMethodBeat.o(54871);
  }

  public float getBgBorderPriority()
  {
    AppMethodBeat.i(54873);
    try
    {
      int i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHH, 10);
      f = i / 100.0F;
      AppMethodBeat.o(54873);
      return f;
    }
    catch (Exception localException)
    {
      while (true)
      {
        float f = 0.1F;
        AppMethodBeat.o(54873);
      }
    }
  }

  public float getBorderPriority()
  {
    AppMethodBeat.i(54872);
    try
    {
      int i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHG, 30);
      f = i / 100.0F;
      AppMethodBeat.o(54872);
      return f;
    }
    catch (Exception localException)
    {
      while (true)
      {
        float f = 0.5F;
        AppMethodBeat.o(54872);
      }
    }
  }

  public com.tencent.mm.plugin.priority.b.a.a getC2CImgAutoDownloader()
  {
    return this.pgf;
  }

  public com.tencent.mm.plugin.priority.b.a.b getC2CMsgAutoDownloadResLogic()
  {
    return this.pge;
  }

  public com.tencent.mm.plugin.priority.b.a.c getC2CMsgAutoDownloadResStorage()
  {
    return this.pgb;
  }

  public com.tencent.mm.plugin.priority.b.a.d getC2CMsgImgUsageStorage()
  {
    return this.pgc;
  }

  public long getInstallPriorityTime()
  {
    return this.pfZ;
  }

  public com.tencent.mm.plugin.priority.b.d getPriorityTaskRunner()
  {
    return this.pgd;
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(54869);
    com.tencent.mm.sdk.g.d.post(new PluginPriority.a(this, (byte)0), "Priority.InitPriorityTask");
    com.tencent.mm.pluginsdk.cmd.b.a(new com.tencent.mm.plugin.priority.b.a(), new String[] { "//priority" });
    AppMethodBeat.o(54869);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(54870);
    ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(this.pgg);
    Object localObject;
    if (this.pgf != null)
    {
      localObject = this.pgf;
      ((com.tencent.mm.plugin.priority.b.a.a)localObject).pgt = 0L;
      o.ahm().a((com.tencent.mm.at.d.a)localObject);
      ((com.tencent.mm.plugin.priority.b.a.a)localObject).fDh.dead();
      this.pgf = null;
    }
    if (this.pge != null)
      this.pge = null;
    if (this.pgd != null)
    {
      localObject = this.pgd;
      ((com.tencent.mm.plugin.priority.b.d)localObject).pgp.clear();
      ((com.tencent.mm.plugin.priority.b.d)localObject).pgr.removeCallbacksAndMessages(null);
      ((com.tencent.mm.plugin.priority.b.d)localObject).pgq.oAl.quit();
      ((com.tencent.mm.plugin.priority.b.d)localObject).pgr = null;
      ((com.tencent.mm.plugin.priority.b.d)localObject).pgq = null;
      this.pgd = null;
    }
    if (this.pgb != null)
    {
      localObject = this.pgb;
      ((com.tencent.mm.plugin.priority.b.a.c)localObject).pgA.close();
      ((com.tencent.mm.plugin.priority.b.a.c)localObject).pgB.close();
      ((com.tencent.mm.plugin.priority.b.a.c)localObject).pgC.close();
      ((com.tencent.mm.plugin.priority.b.a.c)localObject).pgD.close();
      ((com.tencent.mm.plugin.priority.b.a.c)localObject).pgE.close();
      ((com.tencent.mm.plugin.priority.b.a.c)localObject).pgF.close();
      this.pgb = null;
    }
    if (this.pgc != null)
    {
      localObject = this.pgc;
      ((com.tencent.mm.plugin.priority.b.a.d)localObject).pgG.close();
      ((com.tencent.mm.plugin.priority.b.a.d)localObject).pgH.close();
      ((com.tencent.mm.plugin.priority.b.a.d)localObject).pgI.close();
    }
    if (this.pga != null)
    {
      com.tencent.mm.plugin.priority.b.b localb = this.pga;
      localObject = localb.pgl;
      if (localb.pgl == null);
      for (boolean bool = false; ; bool = localb.pgl.isOpen())
      {
        ab.w("MicroMsg.Priority.PriorityDB", "close db:%s isOpen:%b ", new Object[] { localObject, Boolean.valueOf(bool) });
        if ((localb.pgl == null) || (!localb.pgl.isOpen()))
          break label379;
        ab.w("MicroMsg.Priority.PriorityDB", "close in trans :%b ", new Object[] { Boolean.valueOf(localb.pgl.inTransaction()) });
        while (localb.pgl.inTransaction())
          localb.pgl.endTransaction();
      }
      localb.pgm.close();
      localb.pgn.close();
      localb.pgo.close();
      localb.pgl.close();
      localb.pgl = null;
      label379: this.pga = null;
    }
    AppMethodBeat.o(54870);
  }

  public void parallelsDependency()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.PluginPriority
 * JD-Core Version:    0.6.2
 */
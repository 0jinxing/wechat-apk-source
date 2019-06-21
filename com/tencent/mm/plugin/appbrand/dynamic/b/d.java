package com.tencent.mm.plugin.appbrand.dynamic.b;

import android.database.Cursor;
import android.os.SystemClock;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appcache.a.a;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.bb;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.appcache.z.a;
import com.tencent.mm.plugin.appbrand.appcache.z.b;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.sdk.e.f;
import java.util.ArrayList;
import java.util.Locale;

public final class d
  implements z.b
{
  public final z.a a(a parama)
  {
    AppMethodBeat.i(10787);
    if (bb.class == parama.getClass())
    {
      parama = new a((bb)parama, (byte)0);
      AppMethodBeat.o(10787);
    }
    while (true)
    {
      return parama;
      parama = null;
      AppMethodBeat.o(10787);
    }
  }

  static final class a
    implements z.a
  {
    private ArrayList<IDKey> gSZ;
    private long gTa = 0L;
    private long gTb = 0L;
    private final bb hmu;
    private d.a.a hmv;

    private a(bb parambb)
    {
      this.hmu = parambb;
    }

    private void avI()
    {
      AppMethodBeat.i(10780);
      try
      {
        e.pXa.b(this.gSZ, false);
        this.gSZ.clear();
        AppMethodBeat.o(10780);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          AppMethodBeat.o(10780);
      }
    }

    private void nL(int paramInt)
    {
      AppMethodBeat.i(10779);
      if (this.gSZ == null)
        this.gSZ = new ArrayList();
      this.gSZ.add(new IDKey(640, paramInt, 1));
      AppMethodBeat.o(10779);
    }

    public final void a(m paramm)
    {
      int i = 1;
      int j = 2;
      AppMethodBeat.i(10784);
      long l = SystemClock.elapsedRealtime() - this.gTa;
      if (l <= 1000L)
      {
        k = 0;
        label32: e.pXa.a(665L, k, 1L, false);
        e.pXa.a(665L, 6L, 1L, false);
        if ((paramm == null) || (paramm.status != 2))
          break label185;
      }
      label185: for (int k = i; ; k = 0)
        switch (d.1.hmt[this.hmv.ordinal()])
        {
        default:
          avI();
          AppMethodBeat.o(10784);
          return;
          if (l <= 2000L)
          {
            k = 1;
            break label32;
          }
          if (l <= 3000L)
          {
            k = 2;
            break label32;
          }
          if (l <= 4000L)
          {
            k = 3;
            break label32;
          }
          if (l <= 5000L)
          {
            k = 4;
            break label32;
          }
          k = 5;
          break label32;
        case 1:
        case 2:
        }
      if (k != 0);
      for (k = j; ; k = 3)
      {
        nL(k);
        break;
      }
      if (k != 0);
      for (k = 11; ; k = 12)
      {
        nL(k);
        break;
      }
    }

    public final void avp()
    {
      int i = 0;
      AppMethodBeat.i(10781);
      Object localObject;
      if (j.a.np(this.hmu.cBc))
      {
        if (((com.tencent.mm.plugin.appbrand.a.d)g.K(com.tencent.mm.plugin.appbrand.a.d.class)).xF() == null)
          j = 1;
        while (j > 1)
        {
          localObject = d.a.a.hmx;
          label48: this.hmv = ((d.a.a)localObject);
          label53: switch (d.1.hmt[this.hmv.ordinal()])
          {
          default:
            j = i;
            label90: nL(j);
            this.gTa = SystemClock.elapsedRealtime();
            AppMethodBeat.o(10781);
            return;
            ax localax = ((com.tencent.mm.plugin.appbrand.a.d)g.K(com.tencent.mm.plugin.appbrand.a.d.class)).xF();
            localObject = this.hmu.appId;
            j = this.hmu.cBc;
            String str = String.format(Locale.US, "select count(%s) from %s where %s=? and %s=?", new Object[] { "version", "AppBrandWxaPkgManifestRecord", "appId", "debugType" });
            localObject = localax.gVj.a(str, new String[] { localObject, String.valueOf(j) }, 2);
            if (localObject == null)
              j = 0;
            else
              if (!((Cursor)localObject).moveToFirst())
                break label266;
            break;
          case 1:
          case 2:
          }
        }
      }
      label266: for (int j = ((Cursor)localObject).getInt(0); ; j = 0)
      {
        ((Cursor)localObject).close();
        break;
        localObject = d.a.a.hmw;
        break label48;
        this.hmv = d.a.a.hmw;
        break label53;
        j = 1;
        break label90;
        j = 10;
        break label90;
      }
    }

    public final void avq()
    {
      AppMethodBeat.i(10782);
      nL(32);
      AppMethodBeat.o(10782);
    }

    public final void avr()
    {
      AppMethodBeat.i(10783);
      nL(31);
      AppMethodBeat.o(10783);
    }

    public final void avs()
    {
    }

    public final void avt()
    {
    }

    public final void avu()
    {
      AppMethodBeat.i(10785);
      this.gTb = SystemClock.elapsedRealtime();
      switch (d.1.hmt[this.hmv.ordinal()])
      {
      default:
      case 1:
      case 2:
      }
      while (true)
      {
        AppMethodBeat.o(10785);
        while (true)
        {
          return;
          nL(5);
          AppMethodBeat.o(10785);
        }
        nL(14);
      }
    }

    public final void avv()
    {
    }

    public final void dA(boolean paramBoolean)
    {
    }

    public final void dz(boolean paramBoolean)
    {
      AppMethodBeat.i(10786);
      SystemClock.elapsedRealtime();
      int i;
      switch (d.1.hmt[this.hmv.ordinal()])
      {
      default:
        i = 0;
      case 1:
      case 2:
      }
      while (true)
      {
        nL(i);
        avI();
        AppMethodBeat.o(10786);
        return;
        if (paramBoolean)
        {
          i = 6;
        }
        else
        {
          i = 7;
          continue;
          if (paramBoolean)
            i = 15;
          else
            i = 16;
        }
      }
    }

    public final void nq(int paramInt)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.b.d
 * JD-Core Version:    0.6.2
 */
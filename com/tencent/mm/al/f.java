package com.tencent.mm.al;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.c;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ac;
import java.util.HashMap;
import java.util.Random;

public class f
  implements at
{
  private long fzA;
  private ak fzB;
  private com.tencent.mm.ai.f fzC;
  private a fzx;
  private b fzy;
  private c fzz;

  public f()
  {
    AppMethodBeat.i(78077);
    this.fzx = null;
    this.fzy = null;
    this.fzA = 0L;
    this.fzB = new f.2(this, Looper.getMainLooper());
    this.fzC = new f.3(this);
    AppMethodBeat.o(78077);
  }

  public static f afu()
  {
    try
    {
      AppMethodBeat.i(78078);
      f localf = (f)q.Y(f.class);
      AppMethodBeat.o(78078);
      return localf;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static String afv()
  {
    AppMethodBeat.i(78079);
    com.tencent.mm.kernel.g.RN().QU();
    String str = com.tencent.mm.kernel.g.RP().cachePath + "cdndnsinfo/";
    AppMethodBeat.o(78079);
    return str;
  }

  public static c afw()
  {
    AppMethodBeat.i(78080);
    c localc = afu().fzz;
    AppMethodBeat.o(78080);
    return localc;
  }

  public static b afx()
  {
    AppMethodBeat.i(78082);
    if (afu().fzy == null);
    try
    {
      if (afu().fzy == null)
      {
        f localf = afu();
        localb = new com/tencent/mm/al/b;
        localb.<init>();
        localf.fzy = localb;
      }
      b localb = afu().fzy;
      AppMethodBeat.o(78082);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(78082);
    }
  }

  public static a afy()
  {
    try
    {
      AppMethodBeat.i(78083);
      Object localObject1;
      Object localObject3;
      if (afu().fzx == null)
      {
        com.tencent.mm.kernel.g.RN();
        if (!com.tencent.mm.kernel.a.QX())
          break label70;
        localObject1 = afu();
        localObject3 = new com/tencent/mm/al/a;
        ((a)localObject3).<init>(com.tencent.mm.kernel.g.RP().cachePath, afx());
      }
      label70: f localf;
      for (((f)localObject1).fzx = ((a)localObject3); ; localf.fzx = ((a)localObject3))
      {
        localObject1 = afu().fzx;
        AppMethodBeat.o(78083);
        return localObject1;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("mm");
        localObject1 = new java/util/Random;
        ((Random)localObject1).<init>();
        localObject1 = com.tencent.mm.a.g.x(((Random)localObject1).nextLong().getBytes());
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = ac.eSj + (String)localObject1 + "/";
        ab.v("MicroMsg.SubCoreCdnTransport", "hy: cdn temp path: %s", new Object[] { localObject1 });
        localf = afu();
        localObject3 = new com/tencent/mm/al/a;
        ((a)localObject3).<init>((String)localObject1, afx());
      }
    }
    finally
    {
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(78081);
    onAccountRelease();
    com.tencent.mm.kernel.g.RN().QU();
    if (afu().fzy == null)
    {
      afu().fzy = new b();
      ab.i("MicroMsg.SubCoreCdnTransport", "summersafecdn onAccountPostReset new CdnTransportService hash[%s]", new Object[] { Integer.valueOf(afu().fzy.hashCode()) });
    }
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(afv());
    if (!localb.exists())
      localb.mkdirs();
    this.fzz = new f.1(this);
    com.tencent.mm.kernel.g.Rg().a(379, this.fzC);
    ab.i("MicroMsg.SubCoreCdnTransport", "onAccountPostReset, tryToGetCdnDns");
    li(1);
    AppMethodBeat.o(78081);
  }

  public final void iy(int paramInt)
  {
  }

  public final void li(int paramInt)
  {
    AppMethodBeat.i(78085);
    this.fzA = 0L;
    this.fzB.removeMessages(1);
    com.tencent.mm.kernel.g.Rg().a(new d(paramInt), 0);
    AppMethodBeat.o(78085);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(78084);
    this.fzz = null;
    if (this.fzx != null)
    {
      this.fzx.release();
      this.fzx = null;
    }
    if (this.fzy != null)
    {
      this.fzy.release();
      this.fzy = null;
    }
    this.fzA = 0L;
    this.fzB.removeCallbacksAndMessages(null);
    com.tencent.mm.kernel.g.Rg().b(379, this.fzC);
    AppMethodBeat.o(78084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.f
 * JD-Core Version:    0.6.2
 */
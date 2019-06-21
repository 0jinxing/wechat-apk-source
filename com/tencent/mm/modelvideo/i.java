package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.x;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.video.c;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.LinkedList;

public final class i
  implements f.a
{
  LinkedList<bi> fVS;
  long fVT;
  private int fVU;
  private int fVV;
  public boolean fVW;
  public boolean fVX;
  private boolean fVY;
  private boolean fVZ;
  f fWa;
  long fWb;

  public i()
  {
    AppMethodBeat.i(50718);
    this.fVS = new LinkedList();
    this.fVT = 0L;
    this.fVU = 0;
    this.fVV = 0;
    this.fVW = false;
    this.fVX = false;
    this.fVY = false;
    this.fVZ = false;
    this.fWa = null;
    this.fWb = 0L;
    AppMethodBeat.o(50718);
  }

  public final void a(f paramf, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50721);
    if (paramf == null)
    {
      ab.e("MicroMsg.PreloadVideoService", "%d on preload finish but scene is null?", new Object[] { Integer.valueOf(hashCode()) });
      AppMethodBeat.o(50721);
    }
    while (true)
    {
      return;
      if (this.fWa != paramf)
        ab.w("MicroMsg.PreloadVideoService", "%d on preload finish, but scene callback not same object.", new Object[] { Integer.valueOf(hashCode()) });
      ab.i("MicroMsg.PreloadVideoService", "%d preload video[%s] finish success[%b] range[%d, %d]", new Object[] { Integer.valueOf(hashCode()), paramf.alc(), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      g.RS().aa(new i.3(this, paramf));
      AppMethodBeat.o(50721);
    }
  }

  public final void a(String paramString1, int paramInt1, long paramLong, String paramString2, String paramString3, int paramInt2, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(50724);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(bo.anT()).append(",");
    localStringBuffer.append(bo.anT()).append(",");
    localStringBuffer.append(0).append(",");
    localStringBuffer.append(paramString1).append(",");
    localStringBuffer.append(paramInt1).append(",");
    localStringBuffer.append(0).append(",");
    localStringBuffer.append(paramLong).append(",");
    localStringBuffer.append(",");
    localStringBuffer.append(paramString2).append(",");
    localStringBuffer.append(paramString3).append(",");
    localStringBuffer.append(paramInt2).append(",");
    localStringBuffer.append(paramString4).append(",");
    localStringBuffer.append(paramString5).append(",");
    localStringBuffer.append(c.abR(paramString6));
    paramString1 = localStringBuffer.toString();
    ab.d("MicroMsg.PreloadVideoService", "%d rpt content[%s]", new Object[] { Integer.valueOf(hashCode()), paramString1 });
    new x(paramString1).ajK();
    AppMethodBeat.o(50724);
  }

  public final void ald()
  {
    AppMethodBeat.i(50720);
    g.RS().aa(new i.2(this));
    AppMethodBeat.o(50720);
  }

  public final void cW(boolean paramBoolean)
  {
    AppMethodBeat.i(50722);
    if (paramBoolean)
    {
      this.fVU = ((Integer)g.RP().Ry().get(ac.a.xRY, Integer.valueOf(0))).intValue();
      this.fVU += 1;
      g.RP().Ry().set(ac.a.xRY, Integer.valueOf(this.fVU));
      AppMethodBeat.o(50722);
    }
    while (true)
    {
      return;
      this.fVV = ((Integer)g.RP().Ry().get(ac.a.xRZ, Integer.valueOf(0))).intValue();
      this.fVV += 1;
      g.RP().Ry().set(ac.a.xRZ, Integer.valueOf(this.fVV));
      AppMethodBeat.o(50722);
    }
  }

  public final boolean cX(boolean paramBoolean)
  {
    int i = 100;
    AppMethodBeat.i(50723);
    this.fVT = ((Long)g.RP().Ry().get(ac.a.xRX, Long.valueOf(-1L))).longValue();
    if (bo.gb(this.fVT) >= 86400000L)
    {
      this.fVT = bo.anU();
      g.RP().Ry().set(ac.a.xRX, Long.valueOf(this.fVT));
      g.RP().Ry().set(ac.a.xRY, Integer.valueOf(0));
      g.RP().Ry().set(ac.a.xRZ, Integer.valueOf(0));
      this.fVZ = false;
      this.fVY = false;
    }
    this.fVU = ((Integer)g.RP().Ry().get(ac.a.xRY, Integer.valueOf(0))).intValue();
    this.fVV = ((Integer)g.RP().Ry().get(ac.a.xRZ, Integer.valueOf(0))).intValue();
    int j;
    int k;
    if (paramBoolean)
    {
      j = this.fVU;
      k = ((a)g.K(a.class)).Nu().getInt("C2CMaxPreloadVideo", 100);
      if (k > 0)
        break label396;
      k = i;
    }
    label396: 
    while (true)
    {
      boolean bool;
      if (j >= k)
      {
        bool = true;
        label220: ab.i("MicroMsg.PreloadVideoService", "%d check more preload count result[%b] config[%d] hadPreloadCount[%d %d %d] ", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(bool), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(this.fVU), Integer.valueOf(this.fVV) });
        if (bool)
        {
          if (!paramBoolean)
            break label367;
          if (!this.fVY)
          {
            this.fVY = true;
            h.pYm.a(354L, 127L, 1L, false);
          }
        }
      }
      while (true)
      {
        AppMethodBeat.o(50723);
        return bool;
        j = this.fVV;
        k = ((a)g.K(a.class)).Nu().getInt("SnsMaxPreloadVideo", 100);
        break;
        bool = false;
        break label220;
        label367: if (!this.fVZ)
        {
          this.fVZ = true;
          h.pYm.a(354L, 128L, 1L, false);
        }
      }
    }
  }

  public final void stopDownload()
  {
    AppMethodBeat.i(50719);
    ab.i("MicroMsg.PreloadVideoService", "%d stop download", new Object[] { Integer.valueOf(hashCode()) });
    g.RS().aa(new i.1(this));
    AppMethodBeat.o(50719);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.i
 * JD-Core Version:    0.6.2
 */
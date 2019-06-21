package com.tencent.mm.ah;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.r;

final class e$a
  implements az.a
{
  boolean aAR = true;
  String frH;
  String frI;
  h fro;
  boolean frq;

  public e$a(e parame, h paramh, String paramString1, String paramString2)
  {
    this.fro = paramh;
    this.frH = paramString1;
    this.frI = paramString2;
    this.frq = false;
  }

  public final boolean acf()
  {
    AppMethodBeat.i(77905);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (this.frq)
    {
      com.tencent.mm.plugin.report.service.h.pYm.k(138L, 61L, 1L);
      ab.i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: decrypt %s", new Object[] { this.frI });
      localObject1 = UtilsJni.DecryptAvatar(com.tencent.mm.vfs.e.e(this.frI, 0, -1));
      if ((localObject1 != null) && (localObject1.length > 0))
      {
        com.tencent.mm.vfs.e.deleteFile(this.frI);
        com.tencent.mm.vfs.e.b(this.frI, (byte[])localObject1, localObject1.length);
      }
    }
    else
    {
      if (!r.amp(this.frI))
        break label294;
      ab.i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: hevc to pic start");
      com.tencent.mm.plugin.report.service.h.pYm.k(138L, 63L, 1L);
      localObject1 = this.frI + "_hevc";
      com.tencent.mm.vfs.e.aQ(this.frI, (String)localObject1);
      com.tencent.mm.vfs.e.atc(this.frI);
      localObject2 = com.tencent.mm.vfs.e.asY(this.frI);
      localObject3 = com.tencent.mm.vfs.e.asY((String)localObject1);
      if ((localObject2 != null) && (localObject3 != null))
        break label229;
      ab.i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: uri is null %s, %s", new Object[] { localObject2, localObject3 });
      AppMethodBeat.o(77905);
    }
    while (true)
    {
      return true;
      com.tencent.mm.plugin.report.service.h.pYm.k(138L, 62L, 1L);
      ab.i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: decrypt failed");
      AppMethodBeat.o(77905);
      continue;
      label229: localObject2 = ((Uri)localObject2).getPath();
      localObject3 = ((Uri)localObject3).getPath();
      int i = ((c)g.K(c.class)).nativeWxam2Pic((String)localObject3, (String)localObject2);
      com.tencent.mm.vfs.e.deleteFile((String)localObject1);
      if (i != 0)
      {
        com.tencent.mm.plugin.report.service.h.pYm.k(138L, 64L, 1L);
        ab.i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: hevc to pic failed");
        AppMethodBeat.o(77905);
      }
      else
      {
        label294: this.aAR = false;
        AppMethodBeat.o(77905);
      }
    }
  }

  public final boolean acg()
  {
    boolean bool = false;
    AppMethodBeat.i(77906);
    if (this.frJ.frF)
      AppMethodBeat.o(77906);
    while (true)
    {
      return bool;
      if (this.aAR)
      {
        this.frJ.frD.cr(3, -1);
        AppMethodBeat.o(77906);
      }
      else
      {
        com.tencent.mm.vfs.e.deleteFile(this.frH);
        com.tencent.mm.vfs.e.aQ(this.frI, this.frH);
        k.av(this.frH, this.fro.getUsername());
        this.frJ.frD.cr(0, 0);
        bool = true;
        AppMethodBeat.o(77906);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.e.a
 * JD-Core Version:    0.6.2
 */
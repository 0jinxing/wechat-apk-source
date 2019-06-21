package com.tencent.mm.plugin.emoji;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.gif.MMWXGFJNI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;

public final class d
  implements c
{
  private static d kRq;

  public static d biX()
  {
    AppMethodBeat.i(62307);
    if (kRq == null)
      kRq = new d();
    d locald = kRq;
    AppMethodBeat.o(62307);
    return locald;
  }

  private static int bjb()
  {
    AppMethodBeat.i(62314);
    try
    {
      if (at.isWifi(ah.getContext()))
        i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressPicLevelForWifi"), 60);
      while (true)
      {
        i = Math.round(39.0F - i / 5.0F);
        AppMethodBeat.o(62314);
        return i;
        if (at.is2G(ah.getContext()))
          i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressPicLevelFor2G"), 40);
        else if (at.is3G(ah.getContext()))
          i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressPicLevelFor3G"), 40);
        else
          i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressPicLevelFor4G"), 60);
      }
    }
    catch (Exception localException)
    {
      while (true)
        int i = 60;
    }
  }

  public final String IP(String paramString)
  {
    AppMethodBeat.i(62308);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(62308);
    while (true)
    {
      return paramString;
      paramString = paramString + "_hevc";
      AppMethodBeat.o(62308);
    }
  }

  public final byte[] aE(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(62311);
    long l = bo.yz();
    int i = MMWXGFJNI.getErrorCode();
    byte[] arrayOfByte = null;
    int j;
    if (i == 0)
    {
      arrayOfByte = MMWXGFJNI.nativeWxam2PicBuf(paramArrayOfByte);
      if (arrayOfByte == null)
        h.pYm.k(944L, 1L, 1L);
    }
    else
    {
      j = paramArrayOfByte.length;
      if (arrayOfByte != null)
        break label141;
    }
    label141: for (int k = 0; ; k = arrayOfByte.length)
    {
      ab.i("MicroMsg.HevcHelperService", "wxam2pic %d, %d, %d, %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(62311);
      return arrayOfByte;
      h.pYm.k(944L, 5L, 1L);
      h.pYm.k(944L, 6L, bo.az(l));
      break;
    }
  }

  public final boolean biY()
  {
    boolean bool = true;
    AppMethodBeat.i(138079);
    int i = MMWXGFJNI.getErrorCode();
    ab.i("MicroMsg.HevcHelperService", "checkHevcReady: %s", new Object[] { Integer.valueOf(i) });
    if (i == 0)
      AppMethodBeat.o(138079);
    while (true)
    {
      return bool;
      AppMethodBeat.o(138079);
      bool = false;
    }
  }

  public final boolean biZ()
  {
    AppMethodBeat.i(62312);
    boolean bool = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFK, false);
    ab.i("MicroMsg.HevcHelperService", "hevc upload %s", new Object[] { Boolean.valueOf(bool) });
    if ((biY()) && (bool))
      AppMethodBeat.o(62312);
    for (bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(62312);
    }
  }

  public final boolean bja()
  {
    AppMethodBeat.i(62313);
    boolean bool = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFL, false);
    ab.i("MicroMsg.HevcHelperService", "hevc download %s", new Object[] { Boolean.valueOf(bool) });
    if ((biY()) && (bool))
      AppMethodBeat.o(62313);
    for (bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(62313);
    }
  }

  public final int dF(String paramString1, String paramString2)
  {
    AppMethodBeat.i(62309);
    long l = bo.yz();
    String str = r.amq(paramString1);
    int i = 0;
    int k;
    if (".png".equals(str))
    {
      i = 1;
      int j = MMWXGFJNI.getErrorCode();
      k = j;
      if (j == 0)
      {
        k = MMWXGFJNI.nativePic2Wxam(paramString1, paramString2, i, bjb());
        if (k == 0)
          break label154;
        h.pYm.k(944L, 0L, 1L);
      }
    }
    while (true)
    {
      ab.i("MicroMsg.HevcHelperService", "pic2wxam %d, %d, %d, %d, %d", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Long.valueOf(com.tencent.mm.vfs.e.asZ(paramString1)), Long.valueOf(com.tencent.mm.vfs.e.asZ(paramString2)), Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(62309);
      return k;
      if (!".gif".equals(str))
        break;
      i = 3;
      break;
      label154: h.pYm.k(944L, 2L, 1L);
      h.pYm.k(944L, 3L, bo.az(l));
    }
  }

  public final int nativeWxam2Pic(String paramString1, String paramString2)
  {
    AppMethodBeat.i(62310);
    long l = bo.yz();
    int i = MMWXGFJNI.getErrorCode();
    int j = i;
    if (i == 0)
    {
      j = MMWXGFJNI.nativeWxam2Pic(paramString1, paramString2);
      if (j == 0)
        break label103;
      h.pYm.k(944L, 1L, 1L);
    }
    while (true)
    {
      ab.i("MicroMsg.HevcHelperService", "wxam2pic %d, %d, %d, %d", new Object[] { Integer.valueOf(j), Long.valueOf(com.tencent.mm.vfs.e.asZ(paramString1)), Long.valueOf(com.tencent.mm.vfs.e.asZ(paramString2)), Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(62310);
      return j;
      label103: h.pYm.k(944L, 5L, 1L);
      h.pYm.k(944L, 6L, bo.az(l));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.d
 * JD-Core Version:    0.6.2
 */
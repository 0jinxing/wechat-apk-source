package com.tencent.mm.plugin.music.cache;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.BitSet;

public final class d
{
  public String cFI;
  public int count;
  public long gjQ;
  public String mUrl;
  public BitSet oLc;

  public d(String paramString)
  {
    AppMethodBeat.i(137404);
    this.oLc = new BitSet();
    this.gjQ = -1L;
    this.count = 0;
    this.cFI = "";
    this.mUrl = paramString;
    AppMethodBeat.o(137404);
  }

  private boolean bTF()
  {
    boolean bool = true;
    AppMethodBeat.i(137413);
    ab.i("MicroMsg.Music.IndexBitMgr", "isCacheComplete, count:%d, cardinality:%d", new Object[] { Integer.valueOf(this.count), Integer.valueOf(this.oLc.cardinality()) });
    if ((this.count > 0) && (this.count == this.oLc.cardinality()))
      AppMethodBeat.o(137413);
    while (true)
    {
      return bool;
      AppMethodBeat.o(137413);
      bool = false;
    }
  }

  public final void bTE()
  {
    AppMethodBeat.i(137405);
    if (!TextUtils.isEmpty(this.cFI))
    {
      byte[] arrayOfByte = d.a.a(this.oLc);
      e.y(this.cFI, arrayOfByte);
    }
    ab.d("MicroMsg.Music.IndexBitMgr", "saveBitCache bitSet:%s", new Object[] { this.oLc.toString() });
    ab.i("MicroMsg.Music.IndexBitMgr", "saveBitCache bitSet count %d, cardinality:" + this.count + "," + this.oLc.cardinality());
    if (bTF())
      zx(1);
    AppMethodBeat.o(137405);
  }

  public final void clearCache()
  {
    AppMethodBeat.i(137406);
    ab.i("MicroMsg.Music.IndexBitMgr", "clearCache");
    this.oLc = new BitSet(this.count);
    zx(0);
    if (!TextUtils.isEmpty(this.cFI))
      e.y(this.cFI, null);
    AppMethodBeat.o(137406);
  }

  public final boolean eE(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(137412);
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt1 > this.gjQ) || (paramInt1 + paramInt2 > this.gjQ))
    {
      ab.e("MicroMsg.Music.IndexBitMgr", "canReadFromCache offset %d, size %d, fileLength %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(this.gjQ) });
      ab.e("MicroMsg.Music.IndexBitMgr", "canReadFromCache invalid parameter!");
      AppMethodBeat.o(137412);
    }
    while (true)
    {
      return bool;
      int i = getIndex(paramInt1);
      paramInt2 = getIndex(paramInt1 + paramInt2);
      for (paramInt1 = i; ; paramInt1++)
      {
        if (paramInt1 > paramInt2)
          break label150;
        if (!zy(i))
        {
          ab.d("MicroMsg.Music.IndexBitMgr", "index %d, indexBit 0", new Object[] { Integer.valueOf(paramInt1) });
          AppMethodBeat.o(137412);
          break;
        }
      }
      label150: AppMethodBeat.o(137412);
      bool = true;
    }
  }

  public final int getIndex(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(137408);
    if (paramInt > this.gjQ)
    {
      ab.e("MicroMsg.Music.IndexBitMgr", "getIndex, offset is invalid, offset:%d, fileLength:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.gjQ) });
      AppMethodBeat.o(137408);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      paramInt /= 8192;
      AppMethodBeat.o(137408);
    }
  }

  public final void zA(int paramInt)
  {
    AppMethodBeat.i(137411);
    this.oLc.set(paramInt, false);
    AppMethodBeat.o(137411);
  }

  public final void zx(int paramInt)
  {
    AppMethodBeat.i(137407);
    ab.i("MicroMsg.Music.IndexBitMgr", "setFileCacheComplete %d", new Object[] { Integer.valueOf(paramInt) });
    if (!TextUtils.isEmpty(this.cFI))
      e.cH(this.cFI, paramInt);
    AppMethodBeat.o(137407);
  }

  public final boolean zy(int paramInt)
  {
    AppMethodBeat.i(137409);
    boolean bool = this.oLc.get(paramInt);
    AppMethodBeat.o(137409);
    return bool;
  }

  public final void zz(int paramInt)
  {
    AppMethodBeat.i(137410);
    this.oLc.set(paramInt);
    AppMethodBeat.o(137410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.cache.d
 * JD-Core Version:    0.6.2
 */
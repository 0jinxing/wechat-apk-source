package com.tencent.mm.memory;

import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class n
  implements i
{
  private static ConcurrentHashMap<Bitmap, Integer> fdN;
  private boolean DEBUG;
  public Bitmap bitmap;
  private ak fbD;
  private boolean fdL;
  private AtomicInteger fdM;
  private boolean fdO;
  private Runnable fdP;
  private int fdQ;
  private int fdR;

  static
  {
    AppMethodBeat.i(115406);
    fdN = new ConcurrentHashMap();
    AppMethodBeat.o(115406);
  }

  private n(Bitmap paramBitmap)
  {
    AppMethodBeat.i(115392);
    this.bitmap = null;
    this.DEBUG = false;
    this.fbD = new ak(Looper.getMainLooper());
    this.fdL = false;
    this.fdM = new AtomicInteger();
    this.fdO = true;
    this.fdP = new n.1(this);
    this.fdQ = 0;
    this.fdR = 0;
    this.bitmap = paramBitmap;
    this.fdM.set(1);
    if (this.DEBUG)
      ab.i("MicroMsg.ReleasableBitmap", "bitmap " + paramBitmap + " " + this.bitmap.hashCode() + " mm: " + hashCode() + " this: " + this + " " + bo.dpG().toString());
    this.fdL = false;
    getAllocationByteCount();
    AppMethodBeat.o(115392);
  }

  private boolean Xk()
  {
    boolean bool = true;
    AppMethodBeat.i(115399);
    if (this.DEBUG)
      ab.i("MicroMsg.ReleasableBitmap", "recycleImpl~:" + this.fdL + " isMutable:" + this.fdO + " bitmap:" + this.bitmap + " " + hashCode() + " attachCount: " + this.fdM + bo.dpG().toString());
    if ((this.fdL) || (this.fdM.get() > 0))
    {
      bool = false;
      AppMethodBeat.o(115399);
    }
    while (true)
    {
      return bool;
      this.fdL = true;
      if (this.DEBUG)
        fdN.remove(this.bitmap);
      if (this.fdO)
        l.Xf().v(this.bitmap);
      AppMethodBeat.o(115399);
    }
  }

  private final int Xl()
  {
    AppMethodBeat.i(115400);
    int i;
    if ((this.bitmap == null) || (this.bitmap.isRecycled()))
    {
      ab.i("MicroMsg.ReleasableBitmap", "getByteCount recycle " + this.fdQ + " " + toString());
      i = this.fdQ;
      AppMethodBeat.o(115400);
    }
    while (true)
    {
      return i;
      this.fdQ = this.bitmap.getByteCount();
      i = this.fdQ;
      AppMethodBeat.o(115400);
    }
  }

  public static n w(Bitmap paramBitmap)
  {
    AppMethodBeat.i(115393);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(115393);
    }
    while (true)
    {
      return paramBitmap;
      paramBitmap = new n(paramBitmap);
      AppMethodBeat.o(115393);
    }
  }

  public final void Xd()
  {
    AppMethodBeat.i(115394);
    this.fdM.incrementAndGet();
    if (this.DEBUG)
      ab.i("MicroMsg.ReleasableBitmap", "addLiveReference, attachCount:" + this.fdM + " bitmap:" + this.bitmap + " " + this + " " + bo.dpG().toString());
    AppMethodBeat.o(115394);
  }

  public final void Xe()
  {
    AppMethodBeat.i(115395);
    if (this.DEBUG)
      ab.i("MicroMsg.ReleasableBitmap", "removeLiveReference, attachCount:" + this.fdM + " bitmap:" + this.bitmap + " " + this + " " + bo.dpG().toString());
    if (this.fdM.get() > 0)
    {
      this.fdM.decrementAndGet();
      if (this.fdM.get() < 0)
        AppMethodBeat.o(115395);
    }
    while (true)
    {
      return;
      this.fbD.removeCallbacks(this.fdP);
      this.fbD.postDelayed(this.fdP, 500L);
      AppMethodBeat.o(115395);
    }
  }

  public final Bitmap Xh()
  {
    this.fdO = false;
    return this.bitmap;
  }

  public final Bitmap Xi()
  {
    AppMethodBeat.i(115396);
    if (this.DEBUG)
      ab.i("MicroMsg.ReleasableBitmap", "getBitmapReadOnly " + toString() + " " + bo.dpG().toString());
    Bitmap localBitmap = this.bitmap;
    AppMethodBeat.o(115396);
    return localBitmap;
  }

  public final boolean Xj()
  {
    AppMethodBeat.i(115398);
    this.fdM.decrementAndGet();
    if (this.DEBUG)
      ab.i("MicroMsg.ReleasableBitmap", "recycle~:" + this.fdL + " isMutable:" + this.fdO + " bitmap:" + this.bitmap + " " + hashCode() + " attachCount: " + this.fdM + bo.dpG().toString());
    Xk();
    AppMethodBeat.o(115398);
    return true;
  }

  public final String Xm()
  {
    AppMethodBeat.i(115404);
    String str = this + " " + this.bitmap;
    AppMethodBeat.o(115404);
    return str;
  }

  protected void finalize()
  {
    AppMethodBeat.i(115403);
    if (this.DEBUG)
      ab.i("MicroMsg.ReleasableBitmap", "bitmap finalize " + toString());
    AppMethodBeat.o(115403);
  }

  public final int getAllocationByteCount()
  {
    AppMethodBeat.i(115401);
    int i;
    if (d.fP(19))
    {
      i = Xl();
      AppMethodBeat.o(115401);
    }
    while (true)
    {
      return i;
      if ((this.bitmap == null) || (this.bitmap.isRecycled()))
      {
        ab.i("MicroMsg.ReleasableBitmap", "getAllocationByteCount recycle " + this.fdR + " " + toString());
        i = this.fdR;
        AppMethodBeat.o(115401);
      }
      else
      {
        this.fdR = this.bitmap.getAllocationByteCount();
        i = this.fdR;
        AppMethodBeat.o(115401);
      }
    }
  }

  public final boolean isRecycled()
  {
    AppMethodBeat.i(115397);
    boolean bool;
    if ((this.fdL) || (this.bitmap == null) || (this.bitmap.isRecycled()))
    {
      bool = true;
      AppMethodBeat.o(115397);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115397);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(115402);
    String str2;
    if (this.DEBUG)
    {
      String str1 = super.toString() + " code: " + hashCode() + " attachCount: " + this.fdM;
      str2 = str1;
      if (this.bitmap != null)
        str2 = str1 + this.bitmap;
      AppMethodBeat.o(115402);
    }
    while (true)
    {
      return str2;
      str2 = super.toString();
      AppMethodBeat.o(115402);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.n
 * JD-Core Version:    0.6.2
 */
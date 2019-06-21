package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.a.a;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.RandomAccess;

final class i$f extends AbstractList<String>
  implements RandomAccess
{
  private i$f(i parami)
  {
  }

  public final int size()
  {
    return i.a(this.Ayh).Ayt.size;
  }

  public final String zc(int paramInt)
  {
    i.hW(paramInt, i.a(this.Ayh).Ayt.size);
    paramInt = this.Ayh.Rm(i.a(this.Ayh).Ayt.off + paramInt * 4).aEY.getInt();
    return this.Ayh.Rm(paramInt).dRx().value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.a.i.f
 * JD-Core Version:    0.6.2
 */
package com.bumptech.glide.h;

import android.support.v4.f.a;
import android.support.v4.f.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b<K, V> extends a<K, V>
{
  private int aBR;

  public final void a(m<? extends K, ? extends V> paramm)
  {
    AppMethodBeat.i(92556);
    this.aBR = 0;
    super.a(paramm);
    AppMethodBeat.o(92556);
  }

  public final void clear()
  {
    AppMethodBeat.i(92553);
    this.aBR = 0;
    super.clear();
    AppMethodBeat.o(92553);
  }

  public final int hashCode()
  {
    AppMethodBeat.i(92558);
    if (this.aBR == 0)
      this.aBR = super.hashCode();
    int i = this.aBR;
    AppMethodBeat.o(92558);
    return i;
  }

  public final V put(K paramK, V paramV)
  {
    AppMethodBeat.i(92555);
    this.aBR = 0;
    paramK = super.put(paramK, paramV);
    AppMethodBeat.o(92555);
    return paramK;
  }

  public final V removeAt(int paramInt)
  {
    AppMethodBeat.i(92557);
    this.aBR = 0;
    Object localObject = super.removeAt(paramInt);
    AppMethodBeat.o(92557);
    return localObject;
  }

  public final V setValueAt(int paramInt, V paramV)
  {
    AppMethodBeat.i(92554);
    this.aBR = 0;
    paramV = super.setValueAt(paramInt, paramV);
    AppMethodBeat.o(92554);
    return paramV;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.b
 * JD-Core Version:    0.6.2
 */
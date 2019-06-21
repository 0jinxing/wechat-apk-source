package com.tencent.mm.plugin.exdevice.f.b;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import junit.framework.Assert;

public final class a
{
  SparseArray<WeakReference<e>> lwe;

  public final void a(e parame)
  {
    AppMethodBeat.i(19475);
    Assert.assertTrue(true);
    if (this.lwe == null)
      this.lwe = new SparseArray();
    this.lwe.put(parame.hashCode(), new WeakReference(parame));
    AppMethodBeat.o(19475);
  }

  public final void a(String paramString, d paramd)
  {
    AppMethodBeat.i(19477);
    Assert.assertTrue(true);
    if (this.lwe == null)
    {
      ab.d("MicroMsg.ExdeviceRankCallbackManager", "hy: callback pool is null. abort");
      AppMethodBeat.o(19477);
    }
    while (true)
    {
      return;
      for (int i = 0; i < this.lwe.size(); i++)
      {
        int j = this.lwe.keyAt(i);
        e locale = (e)((WeakReference)this.lwe.get(j)).get();
        if (locale != null)
          locale.b(paramString, paramd);
      }
      ab.d("MicroMsg.ExdeviceRankCallbackManager", "hy: publish end");
      AppMethodBeat.o(19477);
    }
  }

  public final void b(e parame)
  {
    AppMethodBeat.i(19476);
    Assert.assertTrue(true);
    if (this.lwe == null)
    {
      ab.d("MicroMsg.ExdeviceRankCallbackManager", "hy: callback pool is null. abort ");
      AppMethodBeat.o(19476);
    }
    while (true)
    {
      return;
      this.lwe.remove(parame.hashCode());
      AppMethodBeat.o(19476);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.b.a
 * JD-Core Version:    0.6.2
 */
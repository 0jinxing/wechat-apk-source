package com.tencent.mm.plugin.luckymoney.f2f;

import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class a$2
  implements SoundPool.OnLoadCompleteListener
{
  public a$2(a parama)
  {
  }

  public final void onLoadComplete(SoundPool paramSoundPool, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(42142);
    if (paramInt2 == 0)
    {
      this.nTW.nTT.put(Integer.valueOf(paramInt1), Boolean.TRUE);
      AppMethodBeat.o(42142);
    }
    while (true)
    {
      return;
      this.nTW.nTT.put(Integer.valueOf(paramInt1), Boolean.FALSE);
      AppMethodBeat.o(42142);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.a.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.luckymoney.f2f;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.media.SoundPool;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a$1
  implements Runnable
{
  public a$1(a parama, Set paramSet, WeakReference paramWeakReference)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42141);
    try
    {
      Iterator localIterator = this.nTU.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label181;
        String str = (String)localIterator.next();
        if ((this.nTV.get() == null) || (this.nTW.jxQ))
          break;
        this.nTW.nTS.put(str, Integer.valueOf(this.nTW.nTR.load(((Context)this.nTV.get()).getResources().getAssets().openFd(str), 0)));
      }
    }
    catch (Exception localException)
    {
      ab.e("AsyncSoundPool", "load sound file error:" + localException.getMessage());
      AppMethodBeat.o(42141);
    }
    while (true)
    {
      return;
      ab.i("AsyncSoundPool", "context = null or soundPool is stopped");
      this.nTW.nTR.release();
      this.nTW.nTS.clear();
      this.nTW.nTT.clear();
      AppMethodBeat.o(42141);
      continue;
      label181: AppMethodBeat.o(42141);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.a.1
 * JD-Core Version:    0.6.2
 */
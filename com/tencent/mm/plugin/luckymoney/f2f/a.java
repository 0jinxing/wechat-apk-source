package com.tencent.mm.plugin.luckymoney.f2f;

import android.media.SoundPool;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public final class a
{
  public volatile boolean jxQ;
  public SoundPool nTR;
  Hashtable<String, Integer> nTS;
  Map<Integer, Boolean> nTT;

  public a()
  {
    AppMethodBeat.i(42143);
    this.jxQ = false;
    this.nTR = new SoundPool(2, 3, 0);
    this.nTS = new Hashtable();
    this.nTT = new HashMap();
    AppMethodBeat.o(42143);
  }

  public final void jU(String paramString)
  {
    AppMethodBeat.i(42144);
    if (this.nTS.containsKey(paramString))
    {
      int i = ((Integer)this.nTS.get(paramString)).intValue();
      if ((i >= 0) && (this.nTT.containsKey(Integer.valueOf(i))) && (((Boolean)this.nTT.get(Integer.valueOf(i))).booleanValue()))
        this.nTR.play(i, 1.0F, 1.0F, 0, 0, 1.0F);
    }
    AppMethodBeat.o(42144);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.a
 * JD-Core Version:    0.6.2
 */
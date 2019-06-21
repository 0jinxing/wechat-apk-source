package com.tencent.mm.sdk.platformtools;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class bm
{
  private boolean itL;
  private String mTag;
  private String xBR;
  ArrayList<Long> xBS;
  ArrayList<String> xBT;

  public bm(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52283);
    this.mTag = paramString1;
    this.xBR = paramString2;
    this.itL = false;
    if (!this.itL)
    {
      if (this.xBS != null)
        break label71;
      this.xBS = new ArrayList();
      this.xBT = new ArrayList();
    }
    while (true)
    {
      addSplit(null);
      AppMethodBeat.o(52283);
      return;
      label71: this.xBS.clear();
      this.xBT.clear();
    }
  }

  public final void addSplit(String paramString)
  {
    AppMethodBeat.i(52284);
    if (this.itL)
      AppMethodBeat.o(52284);
    while (true)
    {
      return;
      long l = SystemClock.elapsedRealtime();
      this.xBS.add(Long.valueOf(l));
      this.xBT.add(paramString);
      AppMethodBeat.o(52284);
    }
  }

  public final void dumpToLog()
  {
    AppMethodBeat.i(52285);
    if (this.itL)
      AppMethodBeat.o(52285);
    while (true)
    {
      return;
      ab.d(this.mTag, this.xBR + ": begin");
      long l1 = ((Long)this.xBS.get(0)).longValue();
      int i = 1;
      long l2 = l1;
      while (i < this.xBS.size())
      {
        l2 = ((Long)this.xBS.get(i)).longValue();
        String str = (String)this.xBT.get(i);
        long l3 = ((Long)this.xBS.get(i - 1)).longValue();
        ab.d(this.mTag, this.xBR + ":      " + (l2 - l3) + " ms, " + str);
        i++;
      }
      ab.d(this.mTag, this.xBR + ": end, " + (l2 - l1) + " ms");
      AppMethodBeat.o(52285);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bm
 * JD-Core Version:    0.6.2
 */
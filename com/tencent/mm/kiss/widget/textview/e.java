package com.tencent.mm.kiss.widget.textview;

import android.text.Layout.Alignment;
import android.text.TextPaint;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e
{
  private final d[] eNK;
  private int gI;
  private final Object mLock;

  public e()
  {
    AppMethodBeat.i(105714);
    this.mLock = new Object();
    this.eNK = new d[3];
    AppMethodBeat.o(105714);
  }

  public final d SP()
  {
    d locald = null;
    synchronized (this.mLock)
    {
      if (this.gI > 0)
      {
        int i = this.gI - 1;
        locald = this.eNK[i];
        this.eNK[i] = null;
        this.gI -= 1;
        return locald;
      }
    }
  }

  public final boolean a(d paramd)
  {
    boolean bool = true;
    AppMethodBeat.i(105715);
    Object localObject = this.mLock;
    int i = 0;
    while (true)
    {
      try
      {
        if (i >= this.gI)
          break label78;
        if (this.eNK[i] == paramd)
        {
          i = 1;
          if (i == 0)
            break;
          paramd = new java/lang/IllegalStateException;
          paramd.<init>("Already in the pool!");
          AppMethodBeat.o(105715);
          throw paramd;
        }
      }
      finally
      {
        AppMethodBeat.o(105715);
      }
      i++;
      continue;
      label78: i = 0;
    }
    paramd.eNx = null;
    paramd.eNy = null;
    paramd.eNz = 0;
    paramd.eNA = 0;
    TextPaint localTextPaint = new android/text/TextPaint;
    localTextPaint.<init>();
    paramd.eNB = localTextPaint;
    paramd.width = 0;
    paramd.eNC = Layout.Alignment.ALIGN_NORMAL;
    paramd.gravity = 51;
    paramd.eND = null;
    paramd.eNE = 0;
    paramd.maxLines = 2147483647;
    paramd.eNF = null;
    paramd.eNG = 0.0F;
    paramd.eNH = 1.0F;
    paramd.eNI = false;
    paramd.maxLength = 0;
    paramd.eNJ = null;
    if (this.gI < this.eNK.length)
    {
      this.eNK[this.gI] = paramd;
      this.gI += 1;
      AppMethodBeat.o(105715);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(105715);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.widget.textview.e
 * JD-Core Version:    0.6.2
 */
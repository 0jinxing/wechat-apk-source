package com.tencent.ttpic.util;

import android.util.SparseArray;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FrameManager
{
  private static FrameManager instance;
  public SparseArray<h> frameSparseArray;

  static
  {
    AppMethodBeat.i(83917);
    instance = new FrameManager();
    AppMethodBeat.o(83917);
  }

  private FrameManager()
  {
    AppMethodBeat.i(83915);
    this.frameSparseArray = new SparseArray();
    AppMethodBeat.o(83915);
  }

  public static FrameManager getInstance()
  {
    return instance;
  }

  public h getFrameByTex(int paramInt)
  {
    AppMethodBeat.i(83916);
    h localh1 = (h)this.frameSparseArray.get(paramInt);
    h localh2 = localh1;
    if (localh1 == null)
    {
      localh2 = new h();
      this.frameSparseArray.put(paramInt, localh2);
    }
    AppMethodBeat.o(83916);
    return localh2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.FrameManager
 * JD-Core Version:    0.6.2
 */
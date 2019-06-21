package com.tencent.mm.plugin.webview.modelcache;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class p
{
  private final k unY;
  public final SparseArray<Object> unZ;
  public final SparseArray<Boolean> uoa;

  private p()
  {
    AppMethodBeat.i(6865);
    this.unY = new k();
    this.unZ = new SparseArray();
    this.uoa = new SparseArray();
    AppMethodBeat.o(6865);
  }

  public static boolean aeI(String paramString)
  {
    AppMethodBeat.i(6866);
    p.a.cYp();
    bo.isNullOrNil(paramString);
    AppMethodBeat.o(6866);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.p
 * JD-Core Version:    0.6.2
 */
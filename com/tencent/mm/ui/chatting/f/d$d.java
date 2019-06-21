package com.tencent.mm.ui.chatting.f;

import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.List;

public final class d$d<T>
{
  public int enb;
  public int selection;
  public d.a yYA;
  public List<T> yYB;
  public int yYC;
  public SparseArray<T> yYD;
  public Bundle yYz;

  d$d(d.a parama)
  {
    AppMethodBeat.i(32483);
    this.selection = -1;
    this.yYA = parama;
    this.yYB = new LinkedList();
    AppMethodBeat.o(32483);
  }

  public final String toString()
  {
    AppMethodBeat.i(32484);
    String str = "LoadedResult{sourceArgs=" + this.yYz + ", mode=" + this.yYA + ", selection=" + this.selection + ", count=" + this.yYC + ", totalCount=" + this.enb + '}';
    AppMethodBeat.o(32484);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.f.d.d
 * JD-Core Version:    0.6.2
 */
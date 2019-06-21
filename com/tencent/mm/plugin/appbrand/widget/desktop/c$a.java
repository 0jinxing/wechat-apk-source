package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a
{
  public RecyclerView.v ahL;
  public RecyclerView.v ahM;
  public int ahN;
  public int ahO;
  public int ahP;
  public int ahQ;

  private c$a(RecyclerView.v paramv1, RecyclerView.v paramv2)
  {
    this.ahL = paramv1;
    this.ahM = paramv2;
  }

  c$a(RecyclerView.v paramv1, RecyclerView.v paramv2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramv1, paramv2);
    this.ahN = paramInt1;
    this.ahO = paramInt2;
    this.ahP = paramInt3;
    this.ahQ = paramInt4;
  }

  public final String toString()
  {
    AppMethodBeat.i(133795);
    String str = "ChangeInfo{oldHolder=" + this.ahL + ", newHolder=" + this.ahM + ", fromX=" + this.ahN + ", fromY=" + this.ahO + ", toX=" + this.ahP + ", toY=" + this.ahQ + '}';
    AppMethodBeat.o(133795);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.c.a
 * JD-Core Version:    0.6.2
 */
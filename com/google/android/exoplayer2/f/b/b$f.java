package com.google.android.exoplayer2.f.b;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$f
{
  public final boolean bmY;
  public final int bmZ;
  public final int bna;
  public final int bnb;
  public final int bnc;
  public final int bnd;
  public final int bne;
  public final SparseArray<b.g> bnf;
  public final int height;
  public final int id;
  public final int width;

  public b$f(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, SparseArray<b.g> paramSparseArray)
  {
    this.id = paramInt1;
    this.bmY = paramBoolean;
    this.width = paramInt2;
    this.height = paramInt3;
    this.bmZ = paramInt4;
    this.bna = paramInt5;
    this.bnb = paramInt6;
    this.bnc = paramInt7;
    this.bnd = paramInt8;
    this.bne = paramInt9;
    this.bnf = paramSparseArray;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(95624);
    if (paramf == null)
      AppMethodBeat.o(95624);
    while (true)
    {
      return;
      paramf = paramf.bnf;
      for (int i = 0; i < paramf.size(); i++)
        this.bnf.put(paramf.keyAt(i), paramf.valueAt(i));
      AppMethodBeat.o(95624);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.b.b.f
 * JD-Core Version:    0.6.2
 */
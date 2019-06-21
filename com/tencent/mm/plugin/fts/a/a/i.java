package com.tencent.mm.plugin.fts.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Comparator;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class i
{
  private static final AtomicInteger mEo;
  public ak handler;
  public int hbo;
  public final int id;
  public String mEp;
  public String mEq;
  public int[] mEr;
  public int[] mEs;
  public int mEt;
  public HashSet<String> mEu;
  public Comparator<l> mEv;
  public com.tencent.mm.plugin.fts.a.l mEw;
  public String query;
  public int scene;
  public String talker;

  static
  {
    AppMethodBeat.i(114271);
    mEo = new AtomicInteger(0);
    AppMethodBeat.o(114271);
  }

  public i()
  {
    AppMethodBeat.i(114267);
    this.hbo = 0;
    this.query = null;
    this.mEp = null;
    this.mEq = null;
    this.talker = null;
    this.mEr = null;
    this.mEs = null;
    this.mEt = 2147483647;
    this.mEu = new HashSet();
    this.mEv = null;
    this.mEw = null;
    this.handler = null;
    this.scene = -1;
    this.id = mEo.incrementAndGet();
    AppMethodBeat.o(114267);
  }

  public static i a(String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt, HashSet<String> paramHashSet, Comparator<l> paramComparator, com.tencent.mm.plugin.fts.a.l paraml, ak paramak)
  {
    AppMethodBeat.i(114268);
    i locali = new i();
    locali.query = paramString;
    locali.mEp = null;
    locali.mEr = paramArrayOfInt1;
    locali.mEs = paramArrayOfInt2;
    locali.mEt = paramInt;
    locali.mEu = paramHashSet;
    locali.mEv = paramComparator;
    locali.mEw = paraml;
    locali.handler = paramak;
    AppMethodBeat.o(114268);
    return locali;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(114269);
    if (this == paramObject)
      AppMethodBeat.o(114269);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(114269);
        bool = false;
      }
      else
      {
        paramObject = (i)paramObject;
        if (this.id != paramObject.id)
        {
          AppMethodBeat.o(114269);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(114269);
        }
      }
    }
  }

  public String toString()
  {
    AppMethodBeat.i(114270);
    String str = String.format("{id: %d, query: %s}", new Object[] { Integer.valueOf(this.id), this.query });
    AppMethodBeat.o(114270);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.i
 * JD-Core Version:    0.6.2
 */
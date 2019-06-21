package com.tencent.mm.plugin.fts.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  public static final int[] mCc;
  public static final int[] mCd;
  public static final int[] mCe;
  public static final int[] mCf;
  public static final int[] mCg;
  public static final int[] mCh;
  public static final int[] mCi;
  public static final int[] mCj;
  public static final int[] mCk;
  public static final int[] mCl;
  public static final int[] mCm;
  public static final int[] mCn;
  public static final int[] mCo;
  public static final int[] mCp;
  public static final Map<Integer, Integer> mCq;
  public static final int[] mCr;
  public static final int[] mCs;
  public static final int[] mCt;
  public static final int[] mCu;
  public static final int[] mCv;
  public static final int[] mCw;
  public static final String mCx;

  static
  {
    int i = 0;
    AppMethodBeat.i(114187);
    mCc = new int[] { 65536 };
    mCd = new int[] { 196608 };
    mCe = new int[] { 262144 };
    mCf = new int[] { 327680 };
    mCg = new int[] { 393216 };
    mCh = new int[] { 458752 };
    mCi = new int[] { 131073, 131074 };
    mCj = new int[] { 131072, 131075, 131076, 131081 };
    mCk = new int[] { 131072, 131075, 131076, 131081 };
    mCl = new int[] { 131072 };
    mCm = new int[] { 131073, 131074 };
    mCn = new int[] { 131077, 131078 };
    mCo = new int[] { 131079, 131080 };
    mCp = new int[] { 5, 6, 7, 1, 2, 3 };
    mCr = new int[] { 2, 3, 6, 7 };
    mCs = new int[] { 29, 30, 31, 34, 35, 36, 33, 32, 37 };
    Object localObject = new int[3];
    Object tmp317_316 = localObject;
    tmp317_316[0] = 8;
    Object tmp322_317 = tmp317_316;
    tmp322_317[1] = 9;
    Object tmp327_322 = tmp322_317;
    tmp327_322[2] = 10;
    tmp327_322;
    mCt = (int[])localObject;
    mCu = (int[])localObject;
    localObject = new HashMap();
    for (int j = 0; j < 9; j++)
      ((HashMap)localObject).put(Integer.valueOf(new int[] { 131072, 131073, 131074, 131075, 131076, 131077, 131078, 131079, 131080 }[j]), Integer.valueOf(j));
    mCq = Collections.unmodifiableMap((Map)localObject);
    mCv = new int[43];
    for (j = 0; j < 43; j++)
      mCv[new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 17, 18, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 0 }[j]] = j;
    mCw = new int[27];
    for (j = i; j < 27; j++)
      mCw[new int[] { 1, 2, 3, 4, 5, 6, 8, 19, 20, 21, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 7, 0 }[j]] = j;
    mCx = b.eSn + "fts/";
    AppMethodBeat.o(114187);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.c
 * JD-Core Version:    0.6.2
 */
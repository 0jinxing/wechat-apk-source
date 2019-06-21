package com.tencent.mm.plugin.fts.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.b.b;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class g
{
  public static HashMap<String, String> ghK;
  public static final g.a mCS;
  public static final g.a mCT;
  public static final g.a mCU;
  public static final g.a mCV;
  public static final g.a mCW;
  public static final g.a mCX;
  public static final g.a mCY;
  public static final g.a mCZ;
  public static final g.a mDa;
  public static final g.a mDc;
  public static final g.a mDd;
  public static final g.a mDe;
  public static final g.a mDf;
  public static final g.a mDg;
  public static final g.a mDh;
  public static final g.a mDi;
  public static final g.a mDj;
  public static final g.a mDk;
  public static final g.a mDl;
  public static b mDm;
  public static HashMap<String, String[]> mDn;

  static
  {
    AppMethodBeat.i(114234);
    mCS = new g.a(19968, 40869);
    mCT = new g.a(40870, 40907);
    mCU = new g.a(13312, 19893);
    mCV = new g.a(131072, 173782);
    mCW = new g.a(173824, 177972);
    mCX = new g.a(177984, 178205);
    mCY = new g.a(12032, 12245);
    mCZ = new g.a(63744, 64217);
    mDa = new g.a(194560, 195101);
    mDc = new g.a(59413, 59503);
    mDd = new g.a(58368, 58856);
    mDe = new g.a(58880, 59087);
    mDf = new g.a(12736, 12771);
    mDg = new g.a(12272, 12283);
    mDh = new g.a(12549, 12576);
    mDi = new g.a(12704, 12730);
    mDj = new g.a(65, 90);
    mDk = new g.a(97, 122);
    mDl = new g.a(48, 57);
    mDm = new b();
    ghK = new HashMap();
    mDn = new HashMap();
    AppMethodBeat.o(114234);
  }

  public static final String Nf(String paramString)
  {
    AppMethodBeat.i(114233);
    StringBuffer localStringBuffer = new StringBuffer();
    paramString = paramString.toCharArray();
    int i = paramString.length;
    int j = 0;
    if (j < i)
    {
      char c = paramString[j];
      if (t(c))
      {
        String str = (String)ghK.get(String.valueOf(c));
        if (!bo.isNullOrNil(str))
          localStringBuffer.append(str);
      }
      while (true)
      {
        j++;
        break;
        localStringBuffer.append(c);
      }
    }
    paramString = localStringBuffer.toString();
    AppMethodBeat.o(114233);
    return paramString;
  }

  public static boolean t(char paramChar)
  {
    AppMethodBeat.i(114230);
    boolean bool;
    if ((mCS.vX(paramChar)) || (mCT.vX(paramChar)) || (mCU.vX(paramChar)) || (mCV.vX(paramChar)) || (mCW.vX(paramChar)) || (mCX.vX(paramChar)))
    {
      bool = true;
      AppMethodBeat.o(114230);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(114230);
    }
  }

  public static boolean u(char paramChar)
  {
    AppMethodBeat.i(114231);
    boolean bool;
    if ((mDj.vX(paramChar)) || (mDk.vX(paramChar)))
    {
      bool = true;
      AppMethodBeat.o(114231);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(114231);
    }
  }

  public static boolean v(char paramChar)
  {
    AppMethodBeat.i(114232);
    boolean bool = mDl.vX(paramChar);
    AppMethodBeat.o(114232);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.g
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.storage.emotion.f;
import com.tencent.mm.storage.emotion.h;
import com.tencent.mm.storage.emotion.j;
import com.tencent.mm.storage.emotion.l;
import com.tencent.mm.storage.emotion.n;
import com.tencent.mm.storage.emotion.p;
import com.tencent.mm.storage.emotion.q;
import com.tencent.mm.storage.emotion.s;
import com.tencent.mm.storage.emotion.u;
import java.util.ArrayList;
import java.util.HashMap;

public final class at
{
  private static int cTa;
  public static boolean xYA;
  private static ArrayList<EmojiGroupInfo> xYB;
  private static HashMap<String, ArrayList<EmojiInfo>> xYC;
  private static at xYH;
  public final k.a xYD;
  public final k.a xYE;
  public final k.a xYF;
  public final com.tencent.mm.sdk.b.c xYG;
  public String xYI;
  public d xYn;
  public com.tencent.mm.storage.emotion.a xYo;
  public com.tencent.mm.storage.emotion.c xYp;
  public p xYq;
  public j xYr;
  public l xYs;
  public h xYt;
  public n xYu;
  public q xYv;
  public s xYw;
  public f xYx;
  public u xYy;
  public com.tencent.mm.emoji.a.a xYz;

  static
  {
    AppMethodBeat.i(62719);
    xYA = false;
    xYB = new ArrayList();
    xYC = new HashMap();
    cTa = -1;
    AppMethodBeat.o(62719);
  }

  private at()
  {
    AppMethodBeat.i(62715);
    this.xYD = new at.1(this);
    this.xYE = new at.2(this);
    this.xYF = new at.3(this);
    this.xYG = new at.4(this);
    ab.i("MicroMsg.emoji.EmojiStorageMgr", "EmojiStorageMgr: %s", new Object[] { bo.dpG() });
    AppMethodBeat.o(62715);
  }

  public static at dsZ()
  {
    try
    {
      AppMethodBeat.i(62714);
      if (xYH == null)
      {
        localat = new com/tencent/mm/storage/at;
        localat.<init>();
        xYH = localat;
      }
      at localat = xYH;
      AppMethodBeat.o(62714);
      return localat;
    }
    finally
    {
    }
  }

  public final d aUp()
  {
    return this.xYn;
  }

  public final ArrayList<EmojiInfo> bY(boolean paramBoolean)
  {
    AppMethodBeat.i(62717);
    ArrayList localArrayList = this.xYz.bY(paramBoolean);
    AppMethodBeat.o(62717);
    return localArrayList;
  }

  public final int bjV()
  {
    AppMethodBeat.i(62716);
    if ((cTa == -1) || (xYA))
      cTa = this.xYo.duC();
    int i = cTa;
    AppMethodBeat.o(62716);
    return i;
  }

  public final boolean dta()
  {
    AppMethodBeat.i(62718);
    if (this.xYI == null)
      this.xYI = ((String)g.RP().Ry().get(ac.a.xVH, ""));
    boolean bool;
    if (!bo.isNullOrNil(this.xYI))
    {
      bool = true;
      AppMethodBeat.o(62718);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62718);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.at
 * JD-Core Version:    0.6.2
 */
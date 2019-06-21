package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.g;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.a.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.plugin.sns.model.ar;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class ae
{
  private bau cNr;
  private String cwT;
  long egA;
  private int fDG;
  String fUL;
  String fUM;
  int fUO;
  int fUP;
  f fUQ;
  int fUR;
  int fUS;
  boolean fUU;
  int fUV;
  private int fUW;
  boolean fUX;
  boolean fUY;
  int progress;
  HashMap<String, Integer> rlC;
  ae.a rlD;
  int rlE;
  private int rlF;
  long rlG;
  private long rlH;
  private long rlI;
  private int rlJ;
  private ae.b rlK;
  int total;

  public ae(ae.a parama)
  {
    AppMethodBeat.i(38451);
    this.fUO = 0;
    this.fUP = 0;
    this.rlC = null;
    this.fUV = 0;
    this.fUX = false;
    this.fUY = false;
    this.rlF = 0;
    this.rlD = parama;
    this.fUQ = new f();
    this.rlC = new HashMap();
    this.rlK = new ae.b((byte)0);
    this.rlK.fVf = g.Nu().getInt("SnsVideoPreloadSec", 5);
    this.rlK.fVg = g.Nu().getInt("SnsVideoDownloadSec", 1);
    this.rlK.rlM = g.Nu().getInt("SnsVideoFullDownloadPercent", 101);
    ab.i("MicroMsg.OnlineVideoViewHelper", "parseConfig preload[%d] downloadSec[%d], needFinish[%d]", new Object[] { Integer.valueOf(this.rlK.fVf), Integer.valueOf(this.rlK.fVg), Integer.valueOf(this.rlK.rlM) });
    reset();
    AppMethodBeat.o(38451);
  }

  private boolean a(int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(38458);
    paramPInt1.value = Math.max(paramInt, this.fUV);
    if (this.fUP == 1)
    {
      paramPInt1.value = paramInt;
      paramPInt1.value += this.fUW;
    }
    if (this.fUP == 2)
    {
      paramPInt1.value = (paramInt - 8);
      if (paramPInt1.value < 0)
        paramPInt1.value = 0;
      paramPInt2.value = (paramPInt1.value + this.fUW + 8);
    }
    if ((this.fUP == 3) || (this.fUP == 4))
    {
      paramPInt1.value = this.fUV;
      paramPInt2.value = (this.fUW + paramInt + 1 + this.rlK.fVg);
    }
    if (paramPInt2.value >= this.fUR + 1)
      paramPInt2.value = (this.fUR + 1);
    if (paramPInt2.value < paramPInt1.value)
    {
      paramPInt1.value += this.rlK.fVg;
      AppMethodBeat.o(38458);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.OnlineVideoViewHelper", "calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d]", new Object[] { Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Integer.valueOf(paramInt), Integer.valueOf(this.fUP), Integer.valueOf(this.fUV), Integer.valueOf(this.fUW) });
      AppMethodBeat.o(38458);
      bool = true;
    }
  }

  private void csm()
  {
    AppMethodBeat.i(38462);
    this.fUU = true;
    if (this.fUV <= 0)
      if (this.fUS == -1)
      {
        this.fUP = 1;
        AppMethodBeat.o(38462);
      }
    while (true)
    {
      return;
      this.fUP = 2;
      AppMethodBeat.o(38462);
      continue;
      ab.i("MicroMsg.OnlineVideoViewHelper", "pause by load data cdnMediaId %s, pauseByLoadDataCount %d, playStatus %d", new Object[] { this.fUL, Integer.valueOf(this.rlF), Integer.valueOf(this.fUP) });
      this.rlI = bo.anU();
      if ((this.fUP != 2) && (this.fUP != 4))
      {
        this.fUW += this.rlK.fVf;
        this.fUW = Math.min(this.fUW, 60);
        this.rlF += 1;
        this.fUP = 4;
      }
      this.rlD.akX();
      AppMethodBeat.o(38462);
    }
  }

  private void csn()
  {
    boolean bool = false;
    AppMethodBeat.i(38463);
    if (this.fUU)
    {
      if ((this.rlF == 0) && (this.rlH == 0L))
        cso();
      while (true)
      {
        ab.i("MicroMsg.OnlineVideoViewHelper", "resume by data gain.pauseByLoadDataCount %d pauseAllTime %d cdnMediaId %s", new Object[] { Integer.valueOf(this.rlF), Integer.valueOf(this.rlJ), this.fUL });
        this.fUP = 3;
        if (this.fUS == -1)
          break;
        this.rlD.yI(this.fUS);
        this.fUS = -1;
        this.fUU = false;
        AppMethodBeat.o(38463);
        label113: return;
        if (this.rlI <= 0L)
          break label228;
        this.rlJ = ((int)(this.rlJ + bo.gb(this.rlI)));
      }
      if (this.rlD.csf());
      while (true)
      {
        this.fUU = bool;
        AppMethodBeat.o(38463);
        break;
        bool = true;
      }
    }
    if (this.fUP != 3)
    {
      ab.i("MicroMsg.OnlineVideoViewHelper", "start to play video playStatus[%d]", new Object[] { Integer.valueOf(this.fUP) });
      if (!this.rlD.csf())
        break label230;
    }
    label228: label230: for (int i = 3; ; i = this.fUP)
    {
      this.fUP = i;
      AppMethodBeat.o(38463);
      break label113;
      break;
    }
  }

  private Object[] csp()
  {
    AppMethodBeat.i(38465);
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.rlD.getPlayVideoDuration());
    if (this.rlH <= 0L)
      this.rlH = bo.anU();
    int i = (int)(this.rlH - this.egA);
    int j = i;
    if (i <= 0)
      j = 0;
    arrayOfObject[1] = Integer.valueOf(j);
    if (this.rlG <= 0L)
      this.rlG = bo.anU();
    i = (int)(this.rlG - this.egA);
    j = i;
    if (i <= 0)
      j = 0;
    arrayOfObject[2] = Integer.valueOf(j);
    arrayOfObject[3] = Integer.valueOf(this.rlF);
    if (this.rlF > 0)
    {
      if (this.rlJ == 0)
        this.rlJ = ((int)(this.rlJ + bo.gb(this.rlI)));
      arrayOfObject[4] = Integer.valueOf(this.rlJ / this.rlF);
    }
    while (true)
    {
      arrayOfObject[5] = Integer.valueOf(this.rlD.getUiStayTime());
      arrayOfObject[6] = Integer.valueOf(this.rlD.getPlayErrorCode());
      AppMethodBeat.o(38465);
      return arrayOfObject;
      arrayOfObject[4] = Integer.valueOf(0);
    }
  }

  private static void csq()
  {
    AppMethodBeat.i(38467);
    h.pYm.a(354L, 203L, 1L, false);
    AppMethodBeat.o(38467);
  }

  private boolean ft(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38460);
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    try
    {
      if (this.fUQ.a(paramInt1, paramInt2, localPInt1, localPInt2))
      {
        localPInt2.value += 81920;
        bool = o.alm().isVideoDataAvailable(this.fUL, localPInt1.value, localPInt2.value);
        if (bool)
          break label322;
        if (!this.rlC.containsKey(this.fUL + 0 + "_-1"))
        {
          String str = this.fUL + localPInt1.value + "_" + localPInt2.value;
          ab.i("MicroMsg.OnlineVideoViewHelper", "request video data [%d, %d] isRequestNow[%b] isSeek[%b]", new Object[] { Integer.valueOf(localPInt1.value), Integer.valueOf(localPInt2.value), Boolean.valueOf(this.fUY), Boolean.FALSE });
          if ((this.rlC.containsKey(str)) || (this.fUY))
            break label303;
          this.fUY = true;
          o.alm();
          com.tencent.mm.al.e.k(this.fUL, localPInt1.value, localPInt2.value);
          this.rlC.put(str, Integer.valueOf(paramInt2));
        }
        AppMethodBeat.o(38460);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.OnlineVideoViewHelper", "check video data error: " + localException.toString());
        boolean bool = false;
        continue;
        label303: ab.i("MicroMsg.OnlineVideoViewHelper", "already request video : ".concat(String.valueOf(localException)));
        continue;
        label322: ab.i("MicroMsg.OnlineVideoViewHelper", "already had video data.");
      }
    }
  }

  private static void le(boolean paramBoolean)
  {
    AppMethodBeat.i(38466);
    if (paramBoolean)
    {
      h.pYm.a(354L, 201L, 1L, false);
      AppMethodBeat.o(38466);
    }
    while (true)
    {
      return;
      h.pYm.a(354L, 202L, 1L, false);
      AppMethodBeat.o(38466);
    }
  }

  private boolean mn(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    AppMethodBeat.i(38459);
    if (this.fUO == 3)
    {
      AppMethodBeat.o(38459);
      bool3 = true;
    }
    while (true)
    {
      return bool3;
      if ((this.fUV - paramInt <= 1) && (this.fUV < this.fUR))
      {
        AppMethodBeat.o(38459);
        continue;
      }
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      bool3 = bool1;
      bool1 = bool2;
      try
      {
        if (this.fUQ.a(paramInt, paramInt + 1, localPInt1, localPInt2))
        {
          bool1 = bool2;
          bool2 = o.alm().isVideoDataAvailable(this.fUL, localPInt1.value, localPInt2.value);
          bool3 = bool2;
          if (!bool2)
          {
            bool1 = bool2;
            this.fUV = paramInt;
            bool3 = bool2;
          }
        }
        AppMethodBeat.o(38459);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.OnlineVideoViewHelper", "check video data error: " + localException.toString());
          bool3 = bool1;
        }
      }
    }
  }

  private void reset()
  {
    AppMethodBeat.i(38453);
    this.fUL = "";
    this.fUS = -1;
    this.fUV = 0;
    this.fUR = 0;
    this.rlF = 0;
    this.fUP = 0;
    this.fUO = 0;
    this.fUU = false;
    this.fUX = false;
    this.fUY = false;
    this.rlC.clear();
    this.cNr = null;
    this.fDG = 0;
    this.cwT = null;
    if (this.rlK != null)
      this.fUW = this.rlK.fVf;
    this.rlG = 0L;
    this.egA = 0L;
    this.rlJ = 0;
    this.rlI = 0L;
    this.rlH = 0L;
    AppMethodBeat.o(38453);
  }

  public final boolean ZA(String paramString)
  {
    AppMethodBeat.i(38456);
    boolean bool = bo.isEqual(this.fUL, paramString);
    AppMethodBeat.o(38456);
    return bool;
  }

  public final boolean a(bau parambau, int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(38454);
    this.cNr = parambau;
    this.fDG = paramInt1;
    this.cwT = paramString;
    this.fUM = aq.D(parambau);
    this.fUL = aq.be(paramInt1, parambau.Url);
    if ((bo.isNullOrNil(this.fUM)) || (bo.isNullOrNil(this.fUL)))
      AppMethodBeat.o(38454);
    for (paramBoolean = false; ; paramBoolean = bool)
    {
      return paramBoolean;
      ab.i("MicroMsg.OnlineVideoViewHelper", "start online download video %s isPlayMode %b", new Object[] { this.fUL, Boolean.valueOf(paramBoolean) });
      af.cnD().a(parambau, paramInt1, paramString, paramBoolean, true, paramInt2);
      this.fUO = 1;
      this.egA = bo.anU();
      le(paramBoolean);
      AppMethodBeat.o(38454);
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(38452);
    ab.i("MicroMsg.OnlineVideoViewHelper", "clear");
    reset();
    this.rlD = null;
    this.fUQ = null;
    AppMethodBeat.o(38452);
  }

  public final boolean csk()
  {
    AppMethodBeat.i(38455);
    if (!bo.isNullOrNil(this.fUL))
      if (this.fUO != 3)
        break label129;
    label129: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.OnlineVideoViewHelper", "stop online download video %s isFinish %b percent %d", new Object[] { this.fUL, Boolean.valueOf(bool), Integer.valueOf(this.rlE) });
      af.cnD().s(this.fUL, csp());
      if ((this.rlE >= this.rlK.rlM) && (!bool))
        af.cnD().a(this.cNr, this.fDG, this.cwT, false, false, 36);
      csq();
      AppMethodBeat.o(38455);
      return true;
    }
  }

  final void csl()
  {
    AppMethodBeat.i(38461);
    ab.i("MicroMsg.OnlineVideoViewHelper", "play offline video %s ", new Object[] { this.fUL });
    cso();
    al.d(new ae.2(this));
    AppMethodBeat.o(38461);
  }

  final void cso()
  {
    AppMethodBeat.i(38464);
    if (this.rlH == 0L)
      this.rlH = bo.anU();
    AppMethodBeat.o(38464);
  }

  public final boolean mm(int paramInt)
  {
    AppMethodBeat.i(38457);
    if (this.fUS != -1);
    for (int i = this.fUS; ; i = paramInt)
    {
      boolean bool1 = true;
      boolean bool2 = true;
      ab.i("MicroMsg.OnlineVideoViewHelper", "check timer playCurrPos %d playTime %d cachePlayTime %d timeDuration %d playStatus %d downloadStatus %d cdnMediaId %s firPlayWait{%d} isPrepareVideo[%b]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(this.fUV), Integer.valueOf(this.fUR), Integer.valueOf(this.fUP), Integer.valueOf(this.fUO), this.fUL, Long.valueOf(this.rlH - this.egA), Boolean.valueOf(this.fUX) });
      switch (this.fUO)
      {
      default:
        ab.w("MicroMsg.OnlineVideoViewHelper", "check time default.");
        bool1 = bool2;
      case 1:
      case 3:
      case 2:
      }
      while (true)
      {
        AppMethodBeat.o(38457);
        return bool1;
        if (!mn(i))
        {
          csm();
          bool1 = false;
        }
        while (true)
        {
          PInt localPInt1 = new PInt();
          PInt localPInt2 = new PInt();
          if (!a(i, localPInt1, localPInt2))
            break label329;
          if (!ft(localPInt1.value, localPInt2.value))
            break;
          this.fUV = Math.max(this.fUV, localPInt2.value);
          bool1 = true;
          break;
          cso();
          if (this.fUX)
          {
            csn();
          }
          else
          {
            ab.i("MicroMsg.OnlineVideoViewHelper", "prepare cdnMediaId [%s]", new Object[] { this.fUL });
            if (this.fUP == 5)
              this.fUP = 1;
            this.rlD.bq(this.fUM, true);
            this.fUX = true;
          }
        }
        label329: ab.d("MicroMsg.OnlineVideoViewHelper", "can not calc download.");
        o.alm();
        com.tencent.mm.al.e.k(this.fUL, 0, -1);
        continue;
        cso();
        if (this.fUX)
        {
          if (this.fUU)
          {
            if (this.fUS == -1)
              break label416;
            this.rlD.yI(this.fUS);
            this.fUS = -1;
            bool1 = false;
          }
          while (true)
          {
            this.fUU = bool1;
            this.fUP = 3;
            bool1 = bool2;
            break;
            label416: if (this.rlD.csf())
              bool1 = false;
            else
              bool1 = true;
          }
        }
        if (this.fUP == 5)
          this.fUP = 1;
        this.rlD.bq(this.fUM, false);
        this.fUX = true;
        bool1 = bool2;
        continue;
        ab.w("MicroMsg.OnlineVideoViewHelper", "download error.");
        bool1 = bool2;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ae
 * JD-Core Version:    0.6.2
 */
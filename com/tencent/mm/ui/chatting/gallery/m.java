package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.g;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.modelvideo.n;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.modelvideo.y.a;
import com.tencent.mm.plugin.a.f;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class m
{
  String cHr;
  long egA;
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
  String filename;
  int gUm;
  HashMap<String, Integer> rlC;
  int rlE;
  int rlF;
  long rlG;
  long rlH;
  private long rlI;
  private int rlJ;
  j yXX;
  a yXY;

  public m(j paramj)
  {
    AppMethodBeat.i(32454);
    this.fUO = 0;
    this.fUP = 0;
    this.fUV = 0;
    this.rlC = new HashMap();
    this.rlF = 0;
    this.fUX = false;
    this.fUY = false;
    this.yXX = paramj;
    reset();
    this.fUQ = new f();
    this.yXY = new a((byte)0);
    paramj = g.Nu().getValue("AndroidOnlineVideoArgs");
    if (!bo.isNullOrNil(paramj))
    {
      ab.i("MicroMsg.OnlineVideoUIHelper", "online video config : ".concat(String.valueOf(paramj)));
      paramj = paramj.split(";");
      if ((paramj != null) && (paramj.length >= 4))
      {
        this.yXY.fVf = bo.getInt(paramj[0], 5);
        this.yXY.fVg = bo.getInt(paramj[1], 1);
        this.yXY.rlM = bo.getInt(paramj[2], 75);
        this.yXY.yYa = (bo.getInt(paramj[3], 1) * 1048576);
      }
    }
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        this.yXY.fVf = 5;
        this.yXY.fVg = 1;
        this.yXY.rlM = 75;
        this.yXY.yYa = 1048576;
      }
      ab.i("MicroMsg.OnlineVideoUIHelper", "parseConfig preload[%d] downloadSec[%d], needFinish[%d], minStreamSize[%d]", new Object[] { Integer.valueOf(this.yXY.fVf), Integer.valueOf(this.yXY.fVg), Integer.valueOf(this.yXY.rlM), Integer.valueOf(this.yXY.yYa) });
      this.fUW = this.yXY.fVf;
      AppMethodBeat.o(32454);
      return;
    }
  }

  private boolean a(int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(32464);
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
      paramPInt2.value = (this.fUW + paramInt + 2 + this.yXY.fVg);
    }
    if (paramPInt2.value >= this.fUR + 1)
      paramPInt2.value = (this.fUR + 1);
    if (paramPInt2.value <= paramPInt1.value)
    {
      paramPInt1.value += this.yXY.fVg;
      AppMethodBeat.o(32464);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.OnlineVideoUIHelper", "calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d]", new Object[] { Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Integer.valueOf(paramInt), Integer.valueOf(this.fUP), Integer.valueOf(this.fUV), Integer.valueOf(this.fUW) });
      AppMethodBeat.o(32464);
      bool = true;
    }
  }

  private static void dGN()
  {
    AppMethodBeat.i(32470);
    com.tencent.mm.plugin.report.service.h.pYm.a(354L, 1L, 1L, false);
    AppMethodBeat.o(32470);
  }

  private static void dGO()
  {
    AppMethodBeat.i(32471);
    com.tencent.mm.plugin.report.service.h.pYm.a(354L, 2L, 1L, false);
    AppMethodBeat.o(32471);
  }

  private static void dGP()
  {
    AppMethodBeat.i(32472);
    com.tencent.mm.plugin.report.service.h.pYm.a(354L, 10L, 1L, false);
    AppMethodBeat.o(32472);
  }

  private static void dGQ()
  {
    AppMethodBeat.i(32473);
    com.tencent.mm.plugin.report.service.h.pYm.a(354L, 17L, 1L, false);
    AppMethodBeat.o(32473);
  }

  private void dGR()
  {
    AppMethodBeat.i(32474);
    com.tencent.mm.plugin.report.service.h.pYm.a(354L, 24L, 1L, false);
    ab.w("MicroMsg.OnlineVideoUIHelper", "%d rpt request all video %s ", new Object[] { Integer.valueOf(hashCode()), this.filename });
    com.tencent.mm.plugin.report.service.h.pYm.e(13836, new Object[] { Integer.valueOf(303), Long.valueOf(bo.anT()), "" });
    AppMethodBeat.o(32474);
  }

  private static void dGS()
  {
    AppMethodBeat.i(32475);
    com.tencent.mm.plugin.report.service.h.pYm.a(354L, 134L, 1L, false);
    AppMethodBeat.o(32475);
  }

  private boolean i(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(32465);
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    try
    {
      if (this.fUQ.a(paramInt1, paramInt2, localPInt1, localPInt2))
      {
        bool = o.alm().isVideoDataAvailable(this.cHr, localPInt1.value, localPInt2.value);
        if (bool)
          break label335;
        if (!this.rlC.containsKey(this.cHr + 0 + "_-1"))
        {
          String str = this.cHr + localPInt1.value + "_" + localPInt2.value;
          ab.i("MicroMsg.OnlineVideoUIHelper", "request video data [%d, %d] isRequestNow[%b] isSeek[%b]", new Object[] { Integer.valueOf(localPInt1.value), Integer.valueOf(localPInt2.value), Boolean.valueOf(this.fUY), Boolean.valueOf(paramBoolean) });
          if ((this.rlC.containsKey(str)) || ((this.fUY) && (!paramBoolean)))
            break label316;
          this.fUY = true;
          o.alm();
          com.tencent.mm.al.e.k(this.cHr, localPInt1.value, localPInt2.value);
          this.rlC.put(str, Integer.valueOf(paramInt2));
        }
        AppMethodBeat.o(32465);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.OnlineVideoUIHelper", localException, "", new Object[0]);
        ab.e("MicroMsg.OnlineVideoUIHelper", "check video data error: " + localException.toString());
        boolean bool = false;
        continue;
        label316: ab.i("MicroMsg.OnlineVideoUIHelper", "already request video : ".concat(String.valueOf(localException)));
        continue;
        label335: ab.i("MicroMsg.OnlineVideoUIHelper", "already had video data.");
      }
    }
  }

  public final boolean ZA(String paramString)
  {
    AppMethodBeat.i(32459);
    boolean bool = bo.isEqual(paramString, this.cHr);
    AppMethodBeat.o(32459);
    return bool;
  }

  public final boolean aG(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(32461);
    switch (this.fUO)
    {
    case 2:
    default:
    case 1:
    case 3:
    }
    for (paramBoolean = true; ; paramBoolean = false)
    {
      ab.i("MicroMsg.OnlineVideoUIHelper", "seek video time %d, download status %d playStatus %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.fUO), Integer.valueOf(this.fUP) });
      com.tencent.mm.plugin.report.service.h.pYm.a(354L, 4L, 1L, false);
      AppMethodBeat.o(32461);
      return paramBoolean;
      this.fUP = 2;
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      a(paramInt, localPInt1, localPInt2);
      if (i(localPInt1.value, localPInt2.value, true))
      {
        this.fUS = -1;
        this.fUU = false;
        this.fUV = localPInt2.value;
        this.fUP = 3;
        this.yXX.ae(paramInt, paramBoolean);
        break;
      }
      this.fUS = paramInt;
      this.fUU = true;
      this.yXX.akX();
    }
  }

  public final boolean arA(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(32456);
    d.afF();
    if (!d.afM())
      AppMethodBeat.o(32456);
    while (true)
    {
      return bool;
      reset();
      Object localObject = u.ut(paramString);
      if (localObject != null)
      {
        int i = ((s)localObject).frO;
        if (i < this.yXY.yYa)
        {
          ab.i("MicroMsg.OnlineVideoUIHelper", "video size[%d] less than config size[%d], do not stream video", new Object[] { Integer.valueOf(i), Integer.valueOf(this.yXY.yYa) });
          u.b((s)localObject, 9);
          dGQ();
          AppMethodBeat.o(32456);
        }
      }
      else
      {
        u.ag(paramString, 1);
        n.alj();
        o.alm();
        localObject = com.tencent.mm.al.e.rQ(paramString);
        if (localObject == null)
        {
          AppMethodBeat.o(32456);
        }
        else
        {
          this.cHr = ((com.tencent.mm.i.h)localObject).field_mediaId;
          this.gUm = ((com.tencent.mm.i.h)localObject).egC;
          this.filename = paramString;
          this.fUO = 1;
          this.fUR = 0;
          bool = o.alq().alG();
          o.alm().a((com.tencent.mm.i.h)localObject, bool);
          this.egA = bo.anU();
          dGN();
          ab.i("MicroMsg.OnlineVideoUIHelper", "download online video.[%s, %s] start time[%d]", new Object[] { this.cHr, paramString, Long.valueOf(this.egA) });
          AppMethodBeat.o(32456);
          bool = true;
        }
      }
    }
  }

  final void csl()
  {
    AppMethodBeat.i(32460);
    ab.i("MicroMsg.OnlineVideoUIHelper", "play offline video %s ", new Object[] { this.filename });
    cso();
    al.d(new m.2(this));
    AppMethodBeat.o(32460);
  }

  final void cso()
  {
    AppMethodBeat.i(32468);
    if (this.rlH == 0L)
      this.rlH = bo.anU();
    AppMethodBeat.o(32468);
  }

  final Object[] csp()
  {
    AppMethodBeat.i(32469);
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.yXX.getPlayVideoDuration());
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
      arrayOfObject[5] = Integer.valueOf(this.yXX.getUiStayTime());
      arrayOfObject[6] = Integer.valueOf(this.yXX.mqi);
      AppMethodBeat.o(32469);
      return arrayOfObject;
      arrayOfObject[4] = Integer.valueOf(0);
    }
  }

  public final void dGK()
  {
    AppMethodBeat.i(32457);
    ab.i("MicroMsg.OnlineVideoUIHelper", "stop stream download video.");
    int i;
    if (this.fUO == 3)
    {
      i = 1;
      this.fUO = 0;
      if (!bo.isNullOrNil(this.cHr))
      {
        if (i == 0)
          break label77;
        dGM();
      }
    }
    while (true)
    {
      o.alm().m(this.cHr, csp());
      dGO();
      AppMethodBeat.o(32457);
      return;
      i = 0;
      break;
      label77: if (this.rlE >= this.yXY.rlM)
      {
        ab.i("MicroMsg.OnlineVideoUIHelper", "start complete video, downloaded (%d) more than config (%d).", new Object[] { Integer.valueOf(this.rlE), Integer.valueOf(this.yXY.rlM) });
        u.af(this.filename, 2);
        dGP();
      }
    }
  }

  public final void dGL()
  {
    AppMethodBeat.i(32466);
    String str = this.cHr + 0 + "_-1";
    if (!this.rlC.containsKey(str))
    {
      ab.i("MicroMsg.OnlineVideoUIHelper", "request all data. [%s]", new Object[] { this.cHr });
      o.alm();
      com.tencent.mm.al.e.k(this.cHr, 0, -1);
      this.rlC.put(str, Integer.valueOf(0));
      dGR();
    }
    this.fUP = 5;
    AppMethodBeat.o(32466);
  }

  final void dGM()
  {
    AppMethodBeat.i(32467);
    o.all();
    if (r.uc(t.uh(this.filename)))
    {
      ab.i("MicroMsg.OnlineVideoUIHelper", "download finish and is hevc need complete %s ", new Object[] { this.filename });
      if (u.uy(this.filename))
        dGS();
    }
    AppMethodBeat.o(32467);
  }

  public final boolean isStreaming()
  {
    boolean bool = true;
    AppMethodBeat.i(32458);
    if ((!bo.isNullOrNil(this.cHr)) && ((this.fUO == 1) || (this.fUO == 3)))
      AppMethodBeat.o(32458);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(32458);
    }
  }

  public final boolean mm(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(32462);
    if (this.fUS != -1);
    for (int i = this.fUS; ; i = paramInt)
    {
      ab.i("MicroMsg.OnlineVideoUIHelper", "check timer playCurrPos %d playTime %d cachePlayTime %d timeDuration %d downloadStatus %d firPlayWait{%d} isPrepareVideo[%b]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(this.fUV), Integer.valueOf(this.fUR), Integer.valueOf(this.fUO), Long.valueOf(this.rlH - this.egA), Boolean.valueOf(this.fUX) });
      boolean bool3 = bool2;
      switch (this.fUO)
      {
      default:
        bool3 = bool2;
      case 2:
      case 1:
      case 3:
      }
      while (true)
      {
        AppMethodBeat.o(32462);
        return bool3;
        if (!mn(i))
        {
          this.fUU = true;
          if (this.fUV <= 0)
            if (this.fUS == -1)
            {
              this.fUP = 1;
              label186: bool3 = false;
            }
        }
        while (true)
        {
          this.yXX.Pg(i);
          PInt localPInt1 = new PInt();
          PInt localPInt2 = new PInt();
          if (!a(i, localPInt1, localPInt2))
            break label683;
          if (!i(localPInt1.value, localPInt2.value, false))
            break label691;
          this.fUV = Math.max(this.fUV, localPInt2.value);
          bool3 = bool2;
          break;
          this.fUP = 2;
          break label186;
          ab.i("MicroMsg.OnlineVideoUIHelper", "pause by load data pauseByLoadDataCount : " + this.rlF + " playStatus : " + this.fUP);
          this.rlI = bo.anU();
          if ((this.fUP != 2) && (this.fUP != 4))
          {
            this.fUW += this.yXY.fVf;
            this.fUW = Math.min(this.fUW, 60);
            this.rlF += 1;
            this.fUP = 4;
          }
          this.yXX.akX();
          break label186;
          if ((this.rlF == 0) && (this.rlH == 0L))
            cso();
          if (this.fUX)
          {
            this.yXX.arz(this.filename);
            if (this.fUU)
              if ((this.rlF == 0) && (this.rlH == 0L))
              {
                cso();
                label457: ab.i("MicroMsg.OnlineVideoUIHelper", "resume by data gain.pauseByLoadDataCount %d pauseAllTime %d", new Object[] { Integer.valueOf(this.rlF), Integer.valueOf(this.rlJ) });
                if (this.fUS == -1)
                  break label566;
                this.yXX.ae(this.fUS, true);
                this.fUS = -1;
                bool3 = false;
                label517: this.fUU = bool3;
                paramInt = 3;
              }
            while (true)
            {
              this.fUP = paramInt;
              label566: 
              do
              {
                bool3 = true;
                break;
                if (this.rlI <= 0L)
                  break label457;
                this.rlJ = ((int)(this.rlJ + bo.gb(this.rlI)));
                break label457;
                if (this.yXX.csf())
                {
                  bool3 = false;
                  break label517;
                }
                bool3 = true;
                break label517;
              }
              while (this.fUP == 3);
              ab.i("MicroMsg.OnlineVideoUIHelper", "start to play video playStatus[%d]", new Object[] { Integer.valueOf(this.fUP) });
              if (this.yXX.csf())
                paramInt = 3;
              else
                paramInt = this.fUP;
            }
          }
          ab.i("MicroMsg.OnlineVideoUIHelper", "prepare video [%s]", new Object[] { this.filename });
          this.yXX.bq(this.filename, true);
          this.fUX = true;
          bool3 = true;
        }
        label683: ab.d("MicroMsg.OnlineVideoUIHelper", "can not calc download.");
        label691: continue;
        cso();
        if (this.fUX)
        {
          if (this.fUU)
          {
            if (this.fUS == -1)
              break label761;
            this.yXX.ae(this.fUS, true);
            this.fUS = -1;
            bool3 = bool1;
          }
          while (true)
          {
            this.fUU = bool3;
            this.yXX.Pg(i);
            bool3 = bool2;
            break;
            label761: if (this.yXX.csf())
              bool3 = bool1;
            else
              bool3 = true;
          }
        }
        this.yXX.bq(this.filename, false);
        this.fUX = true;
        bool3 = bool2;
      }
    }
  }

  public final boolean mn(int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(32463);
    if (this.fUO == 3)
    {
      bool1 = true;
      AppMethodBeat.o(32463);
    }
    while (true)
    {
      return bool1;
      if ((this.fUV - paramInt <= 2) && (this.fUV < this.fUR))
      {
        AppMethodBeat.o(32463);
        continue;
      }
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      try
      {
        if (this.fUQ.a(paramInt, paramInt + 2, localPInt1, localPInt2))
        {
          bool2 = o.alm().isVideoDataAvailable(this.cHr, localPInt1.value, localPInt2.value);
          bool1 = bool2;
          if (bool2);
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          try
          {
            this.fUV = paramInt;
            bool1 = bool2;
            AppMethodBeat.o(32463);
            break;
            localException1 = localException1;
            bool1 = false;
            ab.printErrStackTrace("MicroMsg.OnlineVideoUIHelper", localException1, "", new Object[0]);
            ab.e("MicroMsg.OnlineVideoUIHelper", "check video data error: " + localException1.toString());
            continue;
          }
          catch (Exception localException2)
          {
            boolean bool2;
            bool1 = bool2;
            continue;
          }
          bool1 = false;
        }
      }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(32455);
    this.cHr = "";
    this.filename = "";
    this.fUS = -1;
    this.rlE = 0;
    this.gUm = 0;
    this.fUV = 0;
    this.fUR = 0;
    this.rlF = 0;
    this.fUP = 0;
    this.fUO = 0;
    this.fUU = false;
    this.fUX = false;
    this.fUY = false;
    this.rlC.clear();
    if (this.yXY != null)
      this.fUW = this.yXY.fVf;
    this.rlG = 0L;
    this.egA = 0L;
    this.rlJ = 0;
    this.rlI = 0L;
    this.rlH = 0L;
    AppMethodBeat.o(32455);
  }

  static final class a
  {
    int fVf;
    int fVg;
    int rlM;
    int yYa;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.m
 * JD-Core Version:    0.6.2
 */
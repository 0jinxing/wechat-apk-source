package com.tencent.mm.plugin.scanner.a;

import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qbar.QbarNative;
import com.tencent.qbar.QbarNative.QBarCodeDetectInfo;
import com.tencent.qbar.QbarNative.QBarReportMsg;
import java.util.Iterator;
import java.util.List;

public final class m
{
  public static int pZH;
  public static int pZI;
  public static int pZJ;
  public static m pZK;
  public float decodeScale;
  public int detectTime;
  private int pPD;
  private long pZL;
  public boolean pZM;
  public int pZN;
  private long pZO;
  private Point pZP;
  private String pZQ;
  private String pZR;
  private String pZS;
  private int pZT;
  private String pZU;
  private int pZV;
  private int pZW;
  public int pZX;
  private int pZY;
  private boolean pZZ;
  private int pyramidLv;
  public boolean qaa;
  public List<QbarNative.QBarCodeDetectInfo> qab;
  private int qac;
  private int qad;
  private Object qae;
  private int retryCount;
  public String scaleList;
  public int srTime;

  static
  {
    AppMethodBeat.i(80872);
    pZH = 0;
    pZI = 1;
    pZJ = 2;
    pZK = new m();
    AppMethodBeat.o(80872);
  }

  public m()
  {
    AppMethodBeat.i(80861);
    this.pZL = 0L;
    this.pZM = false;
    this.pZN = 0;
    this.pZO = 0L;
    this.pPD = -1;
    this.pZP = null;
    this.retryCount = 0;
    this.pZV = 0;
    this.pZX = 0;
    this.pZZ = false;
    this.qac = 0;
    this.qad = 0;
    this.qae = new Object();
    AppMethodBeat.o(80861);
  }

  public final void BU(int paramInt)
  {
    AppMethodBeat.i(80865);
    ab.i("MicroMsg.QBarEngineReporter", "setScanScene, scene: %s", new Object[] { Integer.valueOf(paramInt) });
    this.pPD = paramInt;
    AppMethodBeat.o(80865);
  }

  public final void BV(int paramInt)
  {
    if (this.pZY != 2)
      this.pZY = paramInt;
  }

  public final void a(String paramString1, String paramString2, String paramString3, QbarNative.QBarReportMsg paramQBarReportMsg, int paramInt, List<QbarNative.QBarReportMsg> paramList)
  {
    AppMethodBeat.i(80869);
    this.pZQ = paramString1;
    this.pZR = paramString2;
    this.pZS = paramString3;
    this.pZV = paramInt;
    this.pZW = 0;
    if (paramQBarReportMsg != null)
    {
      this.pZT = paramQBarReportMsg.qrcodeVersion;
      this.pyramidLv = paramQBarReportMsg.pyramidLv;
      this.pZU = paramQBarReportMsg.binaryMethod;
      this.scaleList = paramQBarReportMsg.scaleList;
      this.decodeScale = paramQBarReportMsg.decodeScale;
      this.detectTime = paramQBarReportMsg.detectTime;
      this.srTime = paramQBarReportMsg.srTime;
    }
    this.qac = 0;
    this.qad = 0;
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      paramQBarReportMsg = (QbarNative.QBarReportMsg)paramList.next();
      if (paramQBarReportMsg.inWhiteList)
        this.qac += 1;
      else if (paramQBarReportMsg.inBlackList)
        this.qad += 1;
    }
    ab.i("MicroMsg.QBarEngineReporter", "setDecodeResult, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s, resultSize %d, isFilterResult %d,scaleList %s,decodeScale %f,detectTime %d,srTime %d, whiteListHit %d, blackListHit %d", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(this.pZT), Integer.valueOf(this.pyramidLv), this.pZU, Integer.valueOf(paramInt), Integer.valueOf(0), this.scaleList, Float.valueOf(this.decodeScale), Integer.valueOf(this.detectTime), Integer.valueOf(this.srTime), Integer.valueOf(this.qac), Integer.valueOf(this.qad) });
    AppMethodBeat.o(80869);
  }

  public final void bHT()
  {
    AppMethodBeat.i(80870);
    while (true)
    {
      synchronized (this.qae)
      {
        if (this.pZZ)
        {
          ab.i("MicroMsg.QBarEngineReporter", "doReport, already report");
          AppMethodBeat.o(80870);
          return;
        }
        int i = this.pZN;
        long l1 = this.pZL;
        long l2 = this.pZO;
        int j = this.pPD;
        Object localObject2 = this.pZP;
        int k = this.retryCount;
        boolean bool = this.pZM;
        Object localObject4 = this.pZQ;
        str1 = this.pZR;
        Object localObject5 = this.pZS;
        int m = this.pZT;
        int n = this.pyramidLv;
        String str2 = this.pZU;
        if (!bo.isNullOrNil(this.pZR))
        {
          i1 = this.pZR.length();
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          ab.i("MicroMsg.QBarEngineReporter", "doReport, scanTotalFrames: %s, totalScanTime: %s, scanSuccessTime: %s, scanScene: %s, scanResolution: %s, retryCount: %s, scanSuccess: %s, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s,dataContentLen: %d,zoomLog: %s,lightMode: %d", new Object[] { Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(j), localObject2, Integer.valueOf(k), Boolean.valueOf(bool), localObject4, str1, localObject5, Integer.valueOf(m), Integer.valueOf(n), str2, Integer.valueOf(i1), this.pZX, Integer.valueOf(this.pZY) });
          if (this.pZP == null)
            break label960;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str1 = this.pZP.x + "x" + this.pZP.y;
          if ((this.pZM) || (this.qab == null))
            continue;
          m = this.qab.size();
          ab.i("MicroMsg.QBarEngineReporter", "doReport possibleResults %d", new Object[] { Integer.valueOf(m) });
          localObject4 = this.qab.iterator();
          i = 0;
          localObject2 = "";
          localObject6 = localObject2;
          i1 = m;
          if (!((Iterator)localObject4).hasNext())
            continue;
          localObject6 = (QbarNative.QBarCodeDetectInfo)((Iterator)localObject4).next();
          if (i < this.qab.size() - 1)
          {
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject2 = (String)localObject2 + ((QbarNative.QBarCodeDetectInfo)localObject6).prob + "|";
            i++;
            continue;
          }
        }
        else
        {
          i1 = 0;
          continue;
        }
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject2 = (String)localObject2 + ((QbarNative.QBarCodeDetectInfo)localObject6).prob;
        continue;
        Object localObject6 = "";
        int i1 = 0;
        localObject4 = h.pYm;
        n = this.pZN;
        l2 = this.pZL;
        l1 = this.pZO;
        j = this.pPD;
        int i2 = this.retryCount;
        if (this.pZM)
        {
          i = 0;
          localObject2 = this.pZQ;
          localObject5 = this.pZS;
          int i3 = this.pZT;
          int i4 = this.pyramidLv;
          str2 = this.pZU;
          if (bo.isNullOrNil(this.pZR))
            continue;
          m = this.pZR.length();
          Object localObject7 = new java/lang/StringBuilder;
          ((StringBuilder)localObject7).<init>();
          localObject7 = this.pZX;
          int i5 = this.pZY;
          if (!this.qaa)
            continue;
          k = 1;
          ((h)localObject4).e(13233, new Object[] { Integer.valueOf(n), Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(j), str1, Integer.valueOf(i2), Integer.valueOf(i), localObject2, "", localObject5, Integer.valueOf(i3), Integer.valueOf(i4), str2, Integer.valueOf(m), localObject7, Integer.valueOf(i5), Integer.valueOf(k), Integer.valueOf(0), QbarNative.getVersion(), Integer.valueOf(this.pZV), Integer.valueOf(this.pZW), Integer.valueOf(i1), localObject6, this.scaleList, Integer.valueOf((int)(this.decodeScale * 10.0F)), Integer.valueOf(this.detectTime), Integer.valueOf(this.srTime), Integer.valueOf(this.qac), Integer.valueOf(this.qad) });
          this.pZZ = true;
          AppMethodBeat.o(80870);
          continue;
        }
        i = 1;
        continue;
        m = 0;
        continue;
        k = 0;
      }
      label960: String str1 = "";
    }
  }

  public final void cgH()
  {
    AppMethodBeat.i(80863);
    ab.i("MicroMsg.QBarEngineReporter", "markScanSuccess");
    this.pZM = true;
    AppMethodBeat.o(80863);
  }

  public final void cgI()
  {
    AppMethodBeat.i(80864);
    ab.i("MicroMsg.QBarEngineReporter", "addScanFrame, current scan frame: %s", new Object[] { Integer.valueOf(this.pZN) });
    this.pZN += 1;
    AppMethodBeat.o(80864);
  }

  public final void cgJ()
  {
    AppMethodBeat.i(80867);
    ab.i("MicroMsg.QBarEngineReporter", "addRetryTime, current retry count: %s", new Object[] { Integer.valueOf(this.retryCount) });
    this.retryCount += 1;
    AppMethodBeat.o(80867);
  }

  public final void fc(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(80866);
    ab.i("MicroMsg.QBarEngineReporter", "setScanResolution, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.pZP = new Point(paramInt1, paramInt2);
    AppMethodBeat.o(80866);
  }

  public final void jH(long paramLong)
  {
    AppMethodBeat.i(80862);
    ab.i("MicroMsg.QBarEngineReporter", "addScanTime: %s", new Object[] { Long.valueOf(paramLong) });
    this.pZL += paramLong;
    AppMethodBeat.o(80862);
  }

  public final void jI(long paramLong)
  {
    AppMethodBeat.i(80868);
    ab.i("MicroMsg.QBarEngineReporter", "setScanSuccessTime: %s,", new Object[] { Long.valueOf(paramLong) });
    this.pZO = paramLong;
    AppMethodBeat.o(80868);
  }

  public final void reset()
  {
    AppMethodBeat.i(80871);
    synchronized (this.qae)
    {
      this.pZL = 0L;
      this.pZM = false;
      this.pZN = 0;
      this.pPD = -1;
      this.pZP = null;
      this.retryCount = 0;
      this.pZQ = "";
      this.pZR = "";
      this.pZS = "";
      this.pZT = 0;
      this.pyramidLv = 0;
      this.pZU = "";
      this.pZO = 0L;
      this.pZZ = false;
      this.pZX = 0;
      this.pZY = 0;
      this.qaa = false;
      this.pZV = 0;
      this.pZW = 0;
      this.qab = null;
      this.scaleList = "";
      this.decodeScale = 0.0F;
      this.detectTime = 0;
      this.srTime = 0;
      this.qac = 0;
      this.qad = 0;
      ab.i("MicroMsg.QBarEngineReporter", "reset");
      AppMethodBeat.o(80871);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.m
 * JD-Core Version:    0.6.2
 */
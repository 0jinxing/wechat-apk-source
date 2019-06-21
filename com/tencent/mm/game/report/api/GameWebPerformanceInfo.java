package com.tencent.mm.game.report.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public class GameWebPerformanceInfo
  implements Parcelable
{
  public static final Parcelable.Creator<GameWebPerformanceInfo> CREATOR;
  private static Map<String, GameWebPerformanceInfo> eCp;
  public String eBJ;
  public int eBK;
  public int eBL;
  public int eBM;
  public int eBN;
  public int eBO;
  public int eBP;
  public int eBQ;
  public int eBR;
  public String eBS;
  public long eBT;
  public long eBU;
  public long eBV;
  public long eBW;
  public long eBX;
  public long eBY;
  public long eBZ;
  public long eCa;
  public long eCb;
  public long eCc;
  public long eCd;
  public long eCe;
  public long eCf;
  public long eCg;
  public long eCh;
  public long eCi;
  public long eCj;
  public long eCk;
  public long eCl;
  public long eCm;
  public String eCn;
  public String eCo;
  public long startTime;
  public String url;

  static
  {
    AppMethodBeat.i(128618);
    CREATOR = new GameWebPerformanceInfo.1();
    eCp = new HashMap();
    AppMethodBeat.o(128618);
  }

  public GameWebPerformanceInfo()
  {
  }

  private GameWebPerformanceInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(128613);
    this.url = paramParcel.readString();
    this.eBJ = paramParcel.readString();
    this.eBK = paramParcel.readInt();
    this.eBL = paramParcel.readInt();
    this.eBM = paramParcel.readInt();
    this.eBN = paramParcel.readInt();
    this.eBO = paramParcel.readInt();
    this.eBP = paramParcel.readInt();
    this.eBQ = paramParcel.readInt();
    this.eBR = paramParcel.readInt();
    this.eBS = paramParcel.readString();
    this.startTime = paramParcel.readLong();
    this.eBT = paramParcel.readLong();
    this.eBU = paramParcel.readLong();
    this.eBV = paramParcel.readLong();
    this.eBW = paramParcel.readLong();
    this.eBX = paramParcel.readLong();
    this.eBY = paramParcel.readLong();
    this.eBZ = paramParcel.readLong();
    this.eCa = paramParcel.readLong();
    this.eCb = paramParcel.readLong();
    this.eCc = paramParcel.readLong();
    this.eCd = paramParcel.readLong();
    this.eCe = paramParcel.readLong();
    this.eCf = paramParcel.readLong();
    this.eCg = paramParcel.readLong();
    this.eCh = paramParcel.readLong();
    this.eCi = paramParcel.readLong();
    this.eCj = paramParcel.readLong();
    this.eCk = paramParcel.readLong();
    this.eCl = paramParcel.readLong();
    this.eCm = paramParcel.readLong();
    this.eCn = paramParcel.readString();
    this.eCo = paramParcel.readString();
    AppMethodBeat.o(128613);
  }

  public static GameWebPerformanceInfo kU(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(128615);
        if (bo.isNullOrNil(paramString))
        {
          paramString = new com/tencent/mm/game/report/api/GameWebPerformanceInfo;
          paramString.<init>();
          AppMethodBeat.o(128615);
          return paramString;
        }
        if (eCp.containsKey(paramString))
        {
          paramString = (GameWebPerformanceInfo)eCp.get(paramString);
          AppMethodBeat.o(128615);
          continue;
        }
      }
      finally
      {
      }
      GameWebPerformanceInfo localGameWebPerformanceInfo = new com/tencent/mm/game/report/api/GameWebPerformanceInfo;
      localGameWebPerformanceInfo.<init>();
      eCp.put(paramString, localGameWebPerformanceInfo);
      AppMethodBeat.o(128615);
      paramString = localGameWebPerformanceInfo;
    }
  }

  public static GameWebPerformanceInfo kV(String paramString)
  {
    try
    {
      AppMethodBeat.i(128616);
      if (eCp.containsKey(paramString))
        eCp.remove(paramString);
      GameWebPerformanceInfo localGameWebPerformanceInfo = new com/tencent/mm/game/report/api/GameWebPerformanceInfo;
      localGameWebPerformanceInfo.<init>();
      eCp.put(paramString, localGameWebPerformanceInfo);
      AppMethodBeat.o(128616);
      return localGameWebPerformanceInfo;
    }
    finally
    {
    }
    throw paramString;
  }

  public static GameWebPerformanceInfo kW(String paramString)
  {
    AppMethodBeat.i(128617);
    paramString = (GameWebPerformanceInfo)eCp.remove(paramString);
    AppMethodBeat.o(128617);
    return paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(128614);
    String str = String.format("url: %s, isLuggage: %d, isWePkg: %d, isPreloadWebCore: %d, isFirstPage: %d, usedCacheUinKey: %d, jsapiCanUsed: %d, hasFloatLayer: %d, pkgId: %s,startTime: %d, gameCenterUICreate: %d, startWebUI: %d, preloadWePkgBgn: %d,preloadWePkgEnd: %d, preloadWebCoreBgn: %d, preloadWebCoreEnd: %d, webUICreate: %d, webUIOnShowBgn: %d, createViewBgn: %d,createViewEnd: %d, jsbridgeInject: %d, loadUrlBgn: %d, onPageStarted: %d,onPageFinished: %d, getA8keyBgn: %d, getA8keyEnd: %d, webUIInFront: %d, webUIDestroy: %d, commJsVersion: %s, pkgVersion: %s", new Object[] { this.url, Integer.valueOf(this.eBK), Integer.valueOf(this.eBL), Integer.valueOf(this.eBM), Integer.valueOf(this.eBN), Integer.valueOf(this.eBO), Integer.valueOf(this.eBQ), Integer.valueOf(this.eBR), this.eBS, Long.valueOf(this.startTime), Long.valueOf(this.eBT), Long.valueOf(this.eBU), Long.valueOf(this.eBX), Long.valueOf(this.eBW), Long.valueOf(this.eBX), Long.valueOf(this.eBY), Long.valueOf(this.eBZ), Long.valueOf(this.eCa), Long.valueOf(this.eCb), Long.valueOf(this.eCc), Long.valueOf(this.eCd), Long.valueOf(this.eCe), Long.valueOf(this.eCf), Long.valueOf(this.eCg), Long.valueOf(this.eCh), Long.valueOf(this.eCi), Long.valueOf(this.eCj), Long.valueOf(this.eCk), this.eCn, this.eCo });
    AppMethodBeat.o(128614);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(128612);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.eBJ);
    paramParcel.writeInt(this.eBK);
    paramParcel.writeInt(this.eBL);
    paramParcel.writeInt(this.eBM);
    paramParcel.writeInt(this.eBN);
    paramParcel.writeInt(this.eBO);
    paramParcel.writeInt(this.eBP);
    paramParcel.writeInt(this.eBQ);
    paramParcel.writeInt(this.eBR);
    paramParcel.writeString(this.eBS);
    paramParcel.writeLong(this.startTime);
    paramParcel.writeLong(this.eBT);
    paramParcel.writeLong(this.eBU);
    paramParcel.writeLong(this.eBV);
    paramParcel.writeLong(this.eBW);
    paramParcel.writeLong(this.eBX);
    paramParcel.writeLong(this.eBY);
    paramParcel.writeLong(this.eBZ);
    paramParcel.writeLong(this.eCa);
    paramParcel.writeLong(this.eCb);
    paramParcel.writeLong(this.eCc);
    paramParcel.writeLong(this.eCd);
    paramParcel.writeLong(this.eCe);
    paramParcel.writeLong(this.eCf);
    paramParcel.writeLong(this.eCg);
    paramParcel.writeLong(this.eCh);
    paramParcel.writeLong(this.eCi);
    paramParcel.writeLong(this.eCj);
    paramParcel.writeLong(this.eCk);
    paramParcel.writeLong(this.eCl);
    paramParcel.writeLong(this.eCm);
    paramParcel.writeString(this.eCn);
    paramParcel.writeString(this.eCo);
    AppMethodBeat.o(128612);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.game.report.api.GameWebPerformanceInfo
 * JD-Core Version:    0.6.2
 */
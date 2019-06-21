package com.tencent.mm.compatible.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bd;
import com.tencent.mm.sdk.platformtools.bd.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class e extends b
{
  public static final String euO;
  public static String euP;
  public static String euQ;
  public static String euR;
  public static String euS;
  public static String euT;
  public static String euU;
  public static String euV;
  public static String euW;
  public static String euX;
  public static String euY;
  public static String euZ;
  public static String evA;
  public static String evB;
  public static String evC;
  public static String evD;
  public static String eva;
  public static String evb;
  public static String evc;
  public static String evd;
  public static String eve;
  public static String evf;
  public static String evg;
  public static String evh;
  public static String evi;
  public static String evj;
  public static String evk;
  public static String evl;
  public static String evm;
  public static String evn;
  public static String evo;
  public static String evp;
  public static String evq;
  public static String evr;
  public static String evs;
  public static String evt;
  public static String evu;
  public static String evv;
  public static String evw;
  public static String evx;
  public static String evy;
  public static String evz;

  static
  {
    AppMethodBeat.i(93069);
    euO = h.getExternalStorageDirectory().getParent();
    euP = eSn + "appbrand/";
    euQ = eSn + "Download/";
    euS = eSn + "vusericon/";
    euT = eSn + "Game/";
    euU = eSn + "CDNTemp/";
    euV = eSn + "Download/VoiceRemind";
    euW = eSn + "watchdog/";
    euX = eSn + "xlog";
    euY = eSn + "avatar/";
    euZ = eSn + "exdevice/";
    eva = eSn + "newyear/";
    evb = eSn + "expose/";
    evc = eSn + "f2flucky/";
    evd = eSn + "WebviewCache/";
    eve = eSn + "pattern_recognition/";
    evf = eSn + "sniffer/";
    evg = eSn + "browser/";
    evh = eSn + "card/";
    evj = eSn + "CheckResUpdate/";
    evk = eSn + "crash/";
    evl = eSn + "diskcache/";
    evm = eSn + "FailMsgFileCache/";
    evn = eSn + "fts/";
    evo = eSn + "Handler/";
    evp = eSn + "MixAudio/";
    evq = eSn + "preloadedRes/";
    evr = eSn + "recovery/";
    evs = eSn + "share/";
    evt = eSn + "sns_ad_landingpages/";
    evu = eSn + "SQLTrace/";
    evv = eSn + "tracedog/";
    evw = eSn + "vproxy/";
    evx = eSn + "wagamefiles/";
    evy = eSn + "wallet/";
    evz = eSn + "wepkg/";
    evA = eSn + "wxacache/";
    evB = eSn + "wxafiles/";
    evC = eSn + "wxajscahce/";
    evD = eSn + "wxanewfiles/";
    AppMethodBeat.o(93069);
  }

  public static void kw(String paramString)
  {
    AppMethodBeat.i(93068);
    ab.i("MicroMsg.CConstants", "initSdCardPath start SDCARD_ROOT: " + eSl);
    if (bo.isNullOrNil(paramString))
    {
      paramString = bd.dpo();
      int i = paramString.size();
      for (int j = 0; j < i; j++)
        ab.i("MicroMsg.CConstants", "initSdCardPath start list i = " + j + " StatMountParse: " + paramString.get(j));
      if (i > 1)
        Collections.sort(paramString, new Comparator()
        {
        });
      if ((i > 0) && (paramString.get(0) != null) && (!bo.isNullOrNil(((bd.a)paramString.get(0)).xBt)))
      {
        eSl = ((bd.a)paramString.get(0)).xBt;
        for (j = 0; j < i; j++)
          ab.i("MicroMsg.CConstants", "initSdCardPath end list i = " + j + " StatMountParse: " + paramString.get(j));
      }
    }
    else
    {
      eSl = paramString;
    }
    eSn = eSl + eSm;
    euQ = eSn + "Download/";
    euS = eSn + "vusericon/";
    euT = eSn + "Game/";
    euU = eSn + "CDNTemp/";
    euW = eSn + "watchdog/";
    euX = eSn + "xlog";
    eSo = eSn + "crash/";
    euY = eSn + "avatar/";
    evi = eSn + "Cache/";
    String str = eSn + "WeChat/";
    paramString = eSn + "WeiXin/";
    if (!com.tencent.mm.a.e.ct(str))
      if (!com.tencent.mm.a.e.ct(paramString));
    while (true)
    {
      euR = paramString;
      ab.i("MicroMsg.CConstants", "initSdCardPath end SDCARD_ROOT: " + eSl);
      AppMethodBeat.o(93068);
      return;
      if (!aa.dor().equals("zh_CN"))
        paramString = str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.e
 * JD-Core Version:    0.6.2
 */
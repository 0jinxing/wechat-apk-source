package com.tencent.mm.plugin.freewifi;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum k$b
{
  public long muQ;
  String muR;
  public String name;

  static
  {
    AppMethodBeat.i(20611);
    mun = new b("GetFrontPage", 0, 10L, "getFrontPage", "a");
    muo = new b("GetFrontPageReturn", 1, 11L, "getFrontpageReturn", "ar");
    mup = new b("GetFrontPageReturnDataCheck", 2, 12L, "getFrontPageReturnDataCheck", "ard");
    muq = new b("AddNetwork", 3, 20L, "addNetwork", "n");
    mur = new b("GetBackPage", 4, 30L, "getBackPage", "b");
    mus = new b("GetBackPageReturn", 5, 31L, "getBackPageReturn", "br");
    mut = new b("GetBackPage33", 6, 32L, "getBackPage33", "b33");
    muu = new b("GetBackPage33Return", 7, 33L, "getBackPage33Return", "b33r");
    muv = new b("BackpageFinished", 8, 40L, "backpageFinished", "bf");
    muw = new b("QinghuaiBackpageFinished", 9, 50L, "qinghuaiBackpageFinished", "qbf");
    mux = new b("ScanNearFieldWifiAndReport", 10, 110L, "scanNearFieldWifiAndReport", "sc");
    muy = new b("GetThreeOneLock", 11, 290L, "getThreeOneLock", "31lk");
    muz = new b("GetPortalApInfo", 12, 300L, "getPortalApInfo", "o");
    muA = new b("GetPortalApInfoReturn", 13, 301L, "getPortalApInfoReturn", "or");
    muB = new b("GetPortalApInfoReturnDataCheck", 14, 302L, "getPortalApInfoReturnDataCheck", "ord");
    muC = new b("FrontPageUIClosed", 15, 303L, "frontPageUIClosed", "af");
    muD = new b("FrontPageUIClosedByGoBack", 16, 311L, "frontPageUIClosedByGoBack", "afg");
    muE = new b("FrontPageUIClosedByGoSuc", 17, 312L, "frontPageUIClosedByGoSuc", "afs");
    muF = new b("FrontPageUIClosedByGoContactInfoUI", 18, 313L, "frontPageUIClosedByGoContactInfoUI", "afc");
    muG = new b("ThreeOneAuth", 19, 305L, "threeOneAuth", "31a");
    muH = new b("ThreeTwoAuth", 20, 306L, "threeTwoAuth", "32a");
    muI = new b("ThreeTwoBlack", 21, 307L, "threeTwoAuthBlack", "32ab");
    muJ = new b("ThreeThreeAuth", 22, 308L, "threeThreeAuth", "33a");
    muK = new b("GetPcFrontPage", 23, 210L, "getPcFrontPage", "pca");
    muL = new b("GetPcFrontPageReturn", 24, 211L, "getPcFrontPageReturn", "pcar");
    muM = new b("SetPcLoginUserInfo", 25, 212L, "setPcLoginUserInfo", "pcset");
    muN = new b("SetPcLoginUserInfoReturn", 26, 212L, "setPcLoginUserInfoReturn", "pcsetr");
    muO = new b("ManufacturerConnectLoading", 27, 500L, "manufacturerConnectLoading", "mld");
    muP = new b("CopyPwdPageUIClosedByGoBack", 28, 600L, "CopyPwdPageUIClosedByGoBack", "cpg");
    muS = new b[] { mun, muo, mup, muq, mur, mus, mut, muu, muv, muw, mux, muy, muz, muA, muB, muC, muD, muE, muF, muG, muH, muI, muJ, muK, muL, muM, muN, muO, muP };
    AppMethodBeat.o(20611);
  }

  private k$b(long paramLong, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: invokespecial 350	java/lang/Enum:<init>	(Ljava/lang/String;I)V
    //   6: sipush 20610
    //   9: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   12: lload_3
    //   13: ldc2_w 351
    //   16: lcmp
    //   17: ifgt +9 -> 26
    //   20: lload_3
    //   21: lconst_0
    //   22: lcmp
    //   23: ifge +22 -> 45
    //   26: new 354	java/lang/IllegalArgumentException
    //   29: dup
    //   30: ldc_w 356
    //   33: invokespecial 359	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   36: astore_1
    //   37: sipush 20610
    //   40: invokestatic 346	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   43: aload_1
    //   44: athrow
    //   45: aload_0
    //   46: lload_3
    //   47: putfield 361	com/tencent/mm/plugin/freewifi/k$b:muQ	J
    //   50: aload_0
    //   51: aload 5
    //   53: putfield 363	com/tencent/mm/plugin/freewifi/k$b:name	Ljava/lang/String;
    //   56: aload_0
    //   57: aload 6
    //   59: putfield 365	com/tencent/mm/plugin/freewifi/k$b:muR	Ljava/lang/String;
    //   62: sipush 20610
    //   65: invokestatic 346	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   68: return
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.k.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.sns.storage;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  public static int qTr = 0;
  public static int qTs = 1;
  public String cHz;
  public String hnw;
  public String qPj;
  public String qTA;
  public int qTB;
  public String qTC;
  public String qTD;
  public String qTE;
  public int qTF;
  public String qTG;
  public String qTH;
  public LinkedList<String> qTI;
  boolean qTJ;
  public String qTK;
  public String qTL;
  public String qTM;
  public HashMap<String, String> qTN;
  public a.a qTO;
  public a.b qTP;
  public String qTQ;
  public String qTR;
  public String qTS;
  public boolean qTT;
  public String qTU;
  public boolean qTV;
  public int qTt;
  public long qTu;
  public long qTv;
  public int qTw;
  public String qTx;
  public String qTy;
  public String qTz;

  public a()
  {
    AppMethodBeat.i(36897);
    this.cHz = "";
    this.qPj = "";
    this.qTw = 0;
    this.qTx = "";
    this.qTy = "";
    this.qTz = "";
    this.qTA = "";
    this.qTB = 0;
    this.qTC = "";
    this.qTD = "";
    this.qTE = "";
    this.qTF = qTr;
    this.qTG = "";
    this.qTH = "";
    this.qTI = new LinkedList();
    this.qTM = "";
    this.qTP = new a.b();
    this.qTQ = "";
    this.qTR = "";
    this.qTS = "";
    this.qTT = false;
    this.qTU = "";
    this.qTV = false;
    AppMethodBeat.o(36897);
  }

  public a(String paramString)
  {
    AppMethodBeat.i(36898);
    this.cHz = "";
    this.qPj = "";
    this.qTw = 0;
    this.qTx = "";
    this.qTy = "";
    this.qTz = "";
    this.qTA = "";
    this.qTB = 0;
    this.qTC = "";
    this.qTD = "";
    this.qTE = "";
    this.qTF = qTr;
    this.qTG = "";
    this.qTH = "";
    this.qTI = new LinkedList();
    this.qTM = "";
    this.qTP = new a.b();
    this.qTQ = "";
    this.qTR = "";
    this.qTS = "";
    this.qTT = false;
    this.qTU = "";
    this.qTV = false;
    this.qTJ = false;
    YH(paramString);
    AppMethodBeat.o(36898);
  }

  private void YH(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(36899);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(36899);
    Map localMap;
    while (true)
    {
      return;
      ab.i("MicroMsg.ADInfo", "feed xml %s", new Object[] { paramString });
      localMap = br.z(paramString, "ADInfo");
      if (localMap == null)
      {
        AppMethodBeat.o(36899);
      }
      else
      {
        this.hnw = bo.bc((String)localMap.get(".ADInfo.viewid"), "");
        if (localMap.get(".ADInfo.ad_sns_pos") != null)
          break;
        AppMethodBeat.o(36899);
      }
    }
    this.qTt = bo.ank((String)localMap.get(".ADInfo.ad_sns_pos"));
    this.qTu = bo.anl((String)localMap.get(".ADInfo.noExposureExpireTime"));
    this.qTv = bo.anl((String)localMap.get(".ADInfo.exposureNoActionExpireTime"));
    this.qPj = bo.bc((String)localMap.get(".ADInfo.uxInfo"), "");
    this.qTw = bo.ank((String)localMap.get(".ADInfo.adActionType"));
    this.qTx = bo.bc((String)localMap.get(".ADInfo.adActionCardTitle"), "");
    this.qTy = bo.bc((String)localMap.get(".ADInfo.adActionCardTpId"), "");
    this.qTz = bo.bc((String)localMap.get(".ADInfo.adActionCardExt"), "");
    this.qTA = bo.bc((String)localMap.get(".ADInfo.adActionLink"), "");
    this.qTB = bo.ank((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POIType"));
    this.qTC = bo.bc((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POIId"), "");
    this.qTD = bo.bc((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POIName"), "");
    this.qTE = bo.bc((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POILink"), "");
    String str1 = bo.bc((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.Wording"), "");
    this.qTF = bo.ank((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.WordingType"));
    this.qTH = bo.bc((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.WordingLink"), "");
    String str2;
    int i;
    if (this.qTF == qTs)
    {
      str2 = bo.bc((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.WordingRepAndroid"), "");
      this.qTI.clear();
      i = 0;
      if (i == 0);
      for (str3 = bo.bc((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.UserNameList.UserName"), ""); ; str3 = bo.bc((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.UserNameList.UserName" + i), ""))
      {
        if (bo.isNullOrNil(str3))
          break label523;
        this.qTI.add(str3);
        i++;
        break;
      }
      label523: if (str2.indexOf("%s") >= 0)
      {
        i = 1;
        int j = str2.indexOf("%");
        int k = str2.lastIndexOf("%");
        if ((bo.isNullOrNil(str2)) || (i == 0) || (j != k))
          break label744;
        this.qTG = str2;
        label580: this.qTJ = localMap.containsKey(".ADInfo.adCanvasInfo");
        this.qTL = ((String)localMap.get(".ADInfo.session_data.aid"));
        this.qTK = ((String)localMap.get(".ADInfo.session_data.trace_id"));
        this.qTN = new HashMap();
        i = 0;
        label638: if (i != 0)
          break label776;
      }
    }
    label776: for (String str3 = ".ADInfo.adCanvasExt.adCardItemList.cardItem"; ; str3 = ".ADInfo.adCanvasExt.adCardItemList.cardItem" + i)
    {
      str2 = (String)localMap.get(str3 + ".cardTpId");
      str3 = (String)localMap.get(str3 + ".cardExt");
      if (bo.isNullOrNil(str2))
        break label802;
      this.qTN.put(str2, str3);
      i++;
      break label638;
      i = 0;
      break;
      label744: this.qTG = str1;
      this.qTF = qTr;
      break label580;
      this.qTG = str1;
      this.qTF = qTr;
      break label580;
    }
    label802: paramString = Pattern.compile("<adCanvasExt>[\\s\\S]*</adCanvasExt>").matcher(paramString);
    if (paramString.find())
    {
      paramString = paramString.group();
      if (!bo.isNullOrNil(paramString))
        this.qTM = paramString.replaceAll("</?adCanvasExt>", "");
    }
    paramString = (String)localMap.get(".ADInfo.adActionExt.adActionExtWeApp.appUserName");
    if (!TextUtils.isEmpty(paramString))
    {
      this.qTO = new a.a();
      this.qTO.cBb = paramString;
      this.qTO.appVersion = ((String)localMap.get(".ADInfo.adActionExt.adActionExtWeApp.appVersion"));
      this.qTO.csu = ((String)localMap.get(".ADInfo.adActionExt.adActionExtWeApp.relativePagePath"));
    }
    this.qTP = new a.b(localMap, ".ADInfo");
    this.qTQ = bo.bc((String)localMap.get(".ADInfo.dislikeInfo.Title.zh"), "");
    this.qTS = bo.bc((String)localMap.get(".ADInfo.dislikeInfo.Title.tw"), "");
    this.qTR = bo.bc((String)localMap.get(".ADInfo.dislikeInfo.Title.en"), "");
    if (bo.ank((String)localMap.get(".ADInfo.dislikeInfo.forbidClick")) > 0)
    {
      bool2 = true;
      label1021: this.qTT = bool2;
      this.qTU = bo.bc((String)localMap.get(".ADInfo.adInfoSyncBuffer"), "");
      if (bo.ank((String)localMap.get(".ADInfo.adInfoSyncBuffer.$imm")) != 1)
        break label1090;
    }
    label1090: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.qTV = bool2;
      AppMethodBeat.o(36899);
      break;
      bool2 = false;
      break label1021;
    }
  }

  public final boolean coI()
  {
    if ((this.qTw == 4) && (this.qTO != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.luggage.sdk.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.d;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.config.m;
import com.tencent.mm.plugin.appbrand.jsapi.j;
import com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.mm.protocal.protobuf.ey;
import java.util.ArrayList;

public class AppBrandSysConfigLU extends h
  implements Parcelable, j
{
  public static final Parcelable.Creator<AppBrandSysConfigLU> CREATOR;
  public int bQA;
  public boolean bQB;
  public boolean bQC;
  public long bQD;
  public int bQE;
  public ArrayList<String> bQF;
  public ArrayList<String> bQG;
  public ArrayList<String> bQH;
  public ArrayList<String> bQI;
  public ArrayList<String> bQJ;
  public boolean bQK;
  public int bQL;
  public int bQM;
  public long bQN;
  public AppBrandGlobalSystemConfig bQO;
  public boolean bQP;
  public String[] bQQ;
  public ey bQR;
  public boolean bQf;
  public String bQo;
  public boolean bQp;
  public boolean bQq;
  public boolean bQr;
  public boolean bQs;
  public AppRuntimeApiPermissionBundle bQt;
  public String bQu;
  public int bQv;
  public int bQw;
  public int bQx;
  public int bQy;
  public int bQz;
  public String nickname;

  static
  {
    AppMethodBeat.i(101626);
    CREATOR = new AppBrandSysConfigLU.1();
    AppMethodBeat.o(101626);
  }

  public AppBrandSysConfigLU()
  {
    AppMethodBeat.i(101622);
    this.bQp = false;
    this.bQq = false;
    this.bQr = false;
    this.bQs = false;
    this.bQf = false;
    this.bQN = 0L;
    this.bQQ = new String[0];
    this.nickname = "";
    this.hhd = new WxaPkgWrappingInfo();
    AppMethodBeat.o(101622);
  }

  protected AppBrandSysConfigLU(Parcel paramParcel)
  {
    AppMethodBeat.i(101625);
    this.bQp = false;
    this.bQq = false;
    this.bQr = false;
    this.bQs = false;
    this.bQf = false;
    this.bQN = 0L;
    this.bQQ = new String[0];
    this.nickname = "";
    this.cwz = paramParcel.readString();
    this.bQo = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.hgW = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.bQp = bool2;
      if (paramParcel.readByte() == 0)
        break label511;
      bool2 = true;
      label110: this.bQq = bool2;
      if (paramParcel.readByte() == 0)
        break label516;
      bool2 = true;
      label124: this.bQr = bool2;
      this.bQt = ((AppRuntimeApiPermissionBundle)paramParcel.readParcelable(AppRuntimeApiPermissionBundle.class.getClassLoader()));
      this.hgX = paramParcel.readInt();
      this.bQv = paramParcel.readInt();
      this.bQw = paramParcel.readInt();
      this.bQx = paramParcel.readInt();
      this.bQy = paramParcel.readInt();
      this.bQz = paramParcel.readInt();
      this.bQA = paramParcel.readInt();
      if (paramParcel.readByte() == 0)
        break label521;
      bool2 = true;
      label210: this.bQB = bool2;
      if (paramParcel.readByte() == 0)
        break label526;
      bool2 = true;
      label224: this.bQC = bool2;
      this.bQD = paramParcel.readLong();
      this.bQE = paramParcel.readInt();
      this.bQF = paramParcel.createStringArrayList();
      this.bQG = paramParcel.createStringArrayList();
      this.bQH = paramParcel.createStringArrayList();
      this.bQI = paramParcel.createStringArrayList();
      this.bQJ = paramParcel.createStringArrayList();
      this.hhd = ((WxaPkgWrappingInfo)paramParcel.readParcelable(WxaPkgWrappingInfo.class.getClassLoader()));
      this.bQO = ((AppBrandGlobalSystemConfig)paramParcel.readParcelable(AppBrandGlobalSystemConfig.class.getClassLoader()));
      if (paramParcel.readByte() <= 0)
        break label531;
      bool2 = true;
      label326: this.hgY = bool2;
      this.hhb = paramParcel.readInt();
      this.hhc = paramParcel.readInt();
      this.bQL = paramParcel.readInt();
      if (paramParcel.readInt() != 1)
        break label536;
      bool2 = true;
      label365: this.bQK = bool2;
      this.bQN = paramParcel.readLong();
      if (paramParcel.readInt() != 1)
        break label541;
      bool2 = true;
      label388: this.bQP = bool2;
      this.bQu = paramParcel.readString();
      this.bQQ = new String[paramParcel.readInt()];
      paramParcel.readStringArray(this.bQQ);
      this.nickname = paramParcel.readString();
      this.bQM = paramParcel.readInt();
      this.hhe = paramParcel.readInt();
      if (paramParcel.readInt() != 1)
        break label546;
      bool2 = true;
      label454: this.hhf = bool2;
      if (paramParcel.readInt() != 1)
        break label551;
      bool2 = true;
      label469: this.hgZ = bool2;
      if (paramParcel.readInt() != 1)
        break label556;
    }
    label516: label521: label526: label531: label536: label541: label546: label551: label556: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hha = bool2;
      this.bQR = ((ey)d.f(paramParcel));
      AppMethodBeat.o(101625);
      return;
      bool2 = false;
      break;
      label511: bool2 = false;
      break label110;
      bool2 = false;
      break label124;
      bool2 = false;
      break label210;
      bool2 = false;
      break label224;
      bool2 = false;
      break label326;
      bool2 = false;
      break label365;
      bool2 = false;
      break label388;
      bool2 = false;
      break label454;
      bool2 = false;
      break label469;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(101623);
    String str = "AppBrandSysConfigLU{, brandName='" + this.cwz + '\'' + ", appId='" + this.appId + '\'' + ", appIconUrl='" + this.hgW + '\'' + ", debugEnabled=" + this.bQp + ", performancePanelEnabled=" + this.bQq + ", maxWebViewDepth=" + this.hgX + ", maxBackgroundLifeSpan=" + this.bQv + ", maxRequestConcurrent=" + this.bQw + ", maxUploadConcurrent=" + this.bQx + ", maxDownloadConcurrent=" + this.bQy + ", maxWebsocketConnect=" + this.bQz + ", websocketSkipPortCheck=" + this.bQB + ", requestDomains=" + this.bQF + ", socketDomains=" + this.bQG + ", uploadDomains=" + this.bQH + ", downloadDomains=" + this.bQI + ", downloadDomains=" + this.bQJ + ", appPkgInfo=" + this.hhd + ", systemSettings=" + this.bQO + ", runningFlag=" + m.a(this.bQR) + ", operationInfo=" + this.bQu + ", kvStorageScheme=" + this.hhe + ", TLSSkipHostnameCheck=" + this.bQC + ", kvStoragePerformanceReportOn=" + this.hhf + '}';
    AppMethodBeat.o(101623);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(101624);
    paramParcel.writeString(this.cwz);
    paramParcel.writeString(this.bQo);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.hgW);
    int j;
    label74: label94: int k;
    if (this.bQp)
    {
      j = 1;
      byte b = j;
      paramParcel.writeByte(b);
      if (!this.bQq)
        break label473;
      j = 1;
      b = j;
      paramParcel.writeByte(b);
      if (!this.bQr)
        break label483;
      j = 1;
      b = j;
      paramParcel.writeByte(b);
      paramParcel.writeParcelable(this.bQt, paramInt);
      paramParcel.writeInt(this.hgX);
      paramParcel.writeInt(this.bQv);
      paramParcel.writeInt(this.bQw);
      paramParcel.writeInt(this.bQx);
      paramParcel.writeInt(this.bQy);
      paramParcel.writeInt(this.bQz);
      paramParcel.writeInt(this.bQA);
      if (!this.bQB)
        break label493;
      j = 1;
      b = j;
      label179: paramParcel.writeByte(b);
      if (!this.bQC)
        break label503;
      j = 1;
      b = j;
      label199: paramParcel.writeByte(b);
      paramParcel.writeLong(this.bQD);
      paramParcel.writeInt(this.bQE);
      paramParcel.writeStringList(this.bQF);
      paramParcel.writeStringList(this.bQG);
      paramParcel.writeStringList(this.bQH);
      paramParcel.writeStringList(this.bQI);
      paramParcel.writeStringList(this.bQJ);
      paramParcel.writeParcelable(this.hhd, paramInt);
      paramParcel.writeParcelable(this.bQO, paramInt);
      if (!this.hgY)
        break label513;
      paramInt = 1;
      k = paramInt;
      label291: paramParcel.writeByte(k);
      paramParcel.writeInt(this.hhb);
      paramParcel.writeInt(this.hhc);
      paramParcel.writeInt(this.bQL);
      if (!this.bQK)
        break label521;
      paramInt = 1;
      label330: paramParcel.writeInt(paramInt);
      paramParcel.writeLong(this.bQN);
      if (!this.bQP)
        break label526;
      paramInt = 1;
      label352: paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.bQu);
      paramParcel.writeInt(this.bQQ.length);
      paramParcel.writeStringArray(this.bQQ);
      paramParcel.writeString(this.nickname);
      paramParcel.writeInt(this.bQM);
      paramParcel.writeInt(this.hhe);
      if (!this.hhf)
        break label531;
      paramInt = 1;
      label415: paramParcel.writeInt(paramInt);
      if (!this.hgZ)
        break label536;
      paramInt = 1;
      label429: paramParcel.writeInt(paramInt);
      if (!this.hha)
        break label541;
    }
    label513: label521: label526: label531: label536: label541: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      d.a(this.bQR, paramParcel);
      AppMethodBeat.o(101624);
      return;
      j = 0;
      k = j;
      break;
      label473: j = 0;
      k = j;
      break label74;
      label483: j = 0;
      k = j;
      break label94;
      label493: j = 0;
      k = j;
      break label179;
      label503: j = 0;
      k = j;
      break label199;
      paramInt = 0;
      int m = paramInt;
      break label291;
      paramInt = 0;
      break label330;
      paramInt = 0;
      break label352;
      paramInt = 0;
      break label415;
      paramInt = 0;
      break label429;
    }
  }

  public final long xE()
  {
    if (this.bQR == null);
    for (long l = 0L; ; l = this.bQR.vGQ)
      return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.config.AppBrandSysConfigLU
 * JD-Core Version:    0.6.2
 */
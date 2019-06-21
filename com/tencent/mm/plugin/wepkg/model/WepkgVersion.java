package com.tencent.mm.plugin.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.b.e;
import org.json.JSONException;
import org.json.JSONObject;

public class WepkgVersion
  implements Parcelable
{
  public static final Parcelable.Creator<WepkgVersion> CREATOR;
  public String appId;
  public String cSx;
  public int cTb;
  public String charset;
  public long createTime;
  public String cvZ;
  public String downloadUrl;
  public String eBS;
  public String gSP;
  public int uWQ;
  public boolean uXG;
  public long uXH;
  public long uXI;
  public int uXJ;
  public int uXK;
  public long uXL;
  public boolean uXM;
  public boolean uXN;
  public boolean uXO;
  public int uXP;
  public String version;

  static
  {
    AppMethodBeat.i(63605);
    CREATOR = new WepkgVersion.1();
    AppMethodBeat.o(63605);
  }

  public WepkgVersion()
  {
  }

  public WepkgVersion(Parcel paramParcel)
  {
    AppMethodBeat.i(63602);
    this.eBS = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.version = paramParcel.readString();
    this.gSP = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.uXG = bool2;
      this.uXH = paramParcel.readLong();
      this.uXI = paramParcel.readLong();
      this.uXJ = paramParcel.readInt();
      this.cSx = paramParcel.readString();
      this.cvZ = paramParcel.readString();
      this.downloadUrl = paramParcel.readString();
      this.uXK = paramParcel.readInt();
      this.uWQ = paramParcel.readInt();
      this.uXL = paramParcel.readLong();
      this.createTime = paramParcel.readLong();
      this.charset = paramParcel.readString();
      if (paramParcel.readByte() == 0)
        break label214;
      bool2 = true;
      label154: this.uXM = bool2;
      if (paramParcel.readByte() == 0)
        break label219;
      bool2 = true;
      label168: this.uXN = bool2;
      if (paramParcel.readByte() == 0)
        break label224;
    }
    label214: label219: label224: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.uXO = bool2;
      this.uXP = paramParcel.readInt();
      this.cTb = paramParcel.readInt();
      AppMethodBeat.o(63602);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label154;
      bool2 = false;
      break label168;
    }
  }

  public final void a(e parame)
  {
    if (parame != null)
    {
      this.eBS = parame.field_pkgId;
      this.appId = parame.field_appId;
      this.version = parame.field_version;
      this.gSP = parame.field_pkgPath;
      this.uXG = parame.field_disableWvCache;
      this.uXH = parame.field_clearPkgTime;
      this.uXI = parame.field_checkIntervalTime;
      this.uXJ = parame.field_packMethod;
      this.cSx = parame.field_domain;
      this.cvZ = parame.field_md5;
      this.downloadUrl = parame.field_downloadUrl;
      this.uXK = parame.field_pkgSize;
      this.uWQ = parame.field_downloadNetType;
      this.uXL = parame.field_nextCheckTime;
      this.createTime = parame.field_createTime;
      this.charset = parame.field_charset;
      this.uXM = parame.field_bigPackageReady;
      this.uXN = parame.field_preloadFilesReady;
      this.uXO = parame.field_preloadFilesAtomic;
      this.uXP = parame.field_totalDownloadCount;
      this.cTb = parame.field_downloadTriggerType;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final JSONObject dgC()
  {
    AppMethodBeat.i(63603);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("appId", this.appId);
      localJSONObject.put("version", this.version);
      localJSONObject.put("pkgPath", this.gSP);
      localJSONObject.put("disableWvCache", this.uXG);
      localJSONObject.put("clearPkgTime", this.uXH);
      localJSONObject.put("checkIntervalTime", this.uXI);
      localJSONObject.put("packMethod", this.uXJ);
      localJSONObject.put("domain", this.cSx);
      localJSONObject.put("md5", this.cvZ);
      localJSONObject.put("downloadUrl", this.downloadUrl);
      localJSONObject.put("pkgSize", this.uXK);
      localJSONObject.put("downloadNetType", this.uWQ);
      localJSONObject.put("nextCheckTime", this.uXL);
      localJSONObject.put("charset", this.charset);
      localJSONObject.put("bigPackageReady", this.uXM);
      localJSONObject.put("preloadFilesReady", this.uXN);
      localJSONObject.put("preloadFilesAtomic", this.uXO);
      localJSONObject.put("totalDownloadCount", this.uXP);
      localJSONObject.put("downloadTriggerType", this.cTb);
      label222: AppMethodBeat.o(63603);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      break label222;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(63604);
    paramParcel.writeString(this.eBS);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.version);
    paramParcel.writeString(this.gSP);
    if (this.uXG)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.uXH);
      paramParcel.writeLong(this.uXI);
      paramParcel.writeInt(this.uXJ);
      paramParcel.writeString(this.cSx);
      paramParcel.writeString(this.cvZ);
      paramParcel.writeString(this.downloadUrl);
      paramParcel.writeInt(this.uXK);
      paramParcel.writeInt(this.uWQ);
      paramParcel.writeLong(this.uXL);
      paramParcel.writeLong(this.createTime);
      paramParcel.writeString(this.charset);
      if (!this.uXM)
        break label214;
      paramInt = 1;
      label151: paramParcel.writeByte((byte)paramInt);
      if (!this.uXN)
        break label219;
      paramInt = 1;
      label166: paramParcel.writeByte((byte)paramInt);
      if (!this.uXO)
        break label224;
    }
    label214: label219: label224: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.uXP);
      paramParcel.writeInt(this.cTb);
      AppMethodBeat.o(63604);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label151;
      paramInt = 0;
      break label166;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.WepkgVersion
 * JD-Core Version:    0.6.2
 */
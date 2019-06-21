package com.tencent.mm.plugin.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.b.c;
import org.json.JSONException;
import org.json.JSONObject;

public class WepkgPreloadFile
  implements Parcelable
{
  public static final Parcelable.Creator<WepkgPreloadFile> CREATOR;
  public long createTime;
  public String cvZ;
  public String downloadUrl;
  public String eBS;
  public String filePath;
  public String key;
  public String mimeType;
  public int size;
  public int uWQ;
  public String uXe;
  public boolean uXr;
  public String version;

  static
  {
    AppMethodBeat.i(63565);
    CREATOR = new WepkgPreloadFile.1();
    AppMethodBeat.o(63565);
  }

  public WepkgPreloadFile()
  {
  }

  public WepkgPreloadFile(Parcel paramParcel)
  {
    AppMethodBeat.i(63562);
    this.key = paramParcel.readString();
    this.eBS = paramParcel.readString();
    this.version = paramParcel.readString();
    this.filePath = paramParcel.readString();
    this.uXe = paramParcel.readString();
    this.mimeType = paramParcel.readString();
    this.cvZ = paramParcel.readString();
    this.downloadUrl = paramParcel.readString();
    this.size = paramParcel.readInt();
    this.uWQ = paramParcel.readInt();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.uXr = bool;
      this.createTime = paramParcel.readLong();
      AppMethodBeat.o(63562);
      return;
    }
  }

  public final void a(c paramc)
  {
    if (paramc != null)
    {
      this.key = paramc.field_key;
      this.eBS = paramc.field_pkgId;
      this.version = paramc.field_version;
      this.filePath = paramc.field_filePath;
      this.uXe = paramc.field_rid;
      this.mimeType = paramc.field_mimeType;
      this.cvZ = paramc.field_md5;
      this.downloadUrl = paramc.field_downloadUrl;
      this.size = paramc.field_size;
      this.uWQ = paramc.field_downloadNetType;
      this.uXr = paramc.field_completeDownload;
      this.createTime = paramc.field_createTime;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final JSONObject dgC()
  {
    AppMethodBeat.i(63563);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("key", this.key);
      localJSONObject.put("pkgId", this.eBS);
      localJSONObject.put("version", this.version);
      localJSONObject.put("filePath", this.filePath);
      localJSONObject.put("rid", this.uXe);
      localJSONObject.put("mimeType", this.mimeType);
      localJSONObject.put("md5", this.cvZ);
      localJSONObject.put("downloadUrl", this.downloadUrl);
      localJSONObject.put("size", this.size);
      localJSONObject.put("downloadNetType", this.uWQ);
      localJSONObject.put("completeDownload", this.uXr);
      localJSONObject.put("createTime", this.createTime);
      label145: AppMethodBeat.o(63563);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      break label145;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(63564);
    paramParcel.writeString(this.key);
    paramParcel.writeString(this.eBS);
    paramParcel.writeString(this.version);
    paramParcel.writeString(this.filePath);
    paramParcel.writeString(this.uXe);
    paramParcel.writeString(this.mimeType);
    paramParcel.writeString(this.cvZ);
    paramParcel.writeString(this.downloadUrl);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.uWQ);
    if (this.uXr);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.createTime);
      AppMethodBeat.o(63564);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile
 * JD-Core Version:    0.6.2
 */
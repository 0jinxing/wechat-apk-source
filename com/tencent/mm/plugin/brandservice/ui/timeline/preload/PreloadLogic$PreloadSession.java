package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.b.j;
import a.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$PreloadSession;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "url", "", "tmplType", "openScene", "subScene", "aScene", "uid", "fastOpen", "", "cacheData", "zip", "prefixMP", "prefixHttp", "cacheItemShowType", "webCodeCache", "(ILjava/lang/String;IIIILjava/lang/String;ZZZZZZZ)V", "getAScene", "()I", "getCacheData", "()Z", "setCacheData", "(Z)V", "getCacheItemShowType", "setCacheItemShowType", "getFastOpen", "setFastOpen", "getId", "getOpenScene", "getPrefixHttp", "setPrefixHttp", "getPrefixMP", "setPrefixMP", "getSubScene", "getTmplType", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "getUrl", "getWebCodeCache", "setWebCodeCache", "getZip", "setZip", "describeContents", "writeToParcel", "", "flags", "CREATOR", "plugin-brandservice_release"})
public final class PreloadLogic$PreloadSession
  implements Parcelable
{
  public static final a CREATOR;
  final int id;
  final int jSV;
  final int jSW;
  final int jSX;
  String jSY;
  boolean jSZ;
  public boolean jSa;
  public final int jSu;
  boolean jTa;
  public boolean jTb;
  public boolean jTc;
  boolean jTd;
  public boolean jTe;
  final String url;

  static
  {
    AppMethodBeat.i(14876);
    CREATOR = new a((byte)0);
    AppMethodBeat.o(14876);
  }

  private PreloadLogic$PreloadSession(int paramInt1, String paramString1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7)
  {
    AppMethodBeat.i(138514);
    this.id = paramInt1;
    this.url = paramString1;
    this.jSV = paramInt2;
    this.jSu = paramInt3;
    this.jSW = paramInt4;
    this.jSX = paramInt5;
    this.jSY = paramString2;
    this.jSZ = paramBoolean1;
    this.jTa = paramBoolean2;
    this.jTb = paramBoolean3;
    this.jTc = paramBoolean4;
    this.jTd = paramBoolean5;
    this.jSa = paramBoolean6;
    this.jTe = paramBoolean7;
    AppMethodBeat.o(138514);
  }

  public PreloadLogic$PreloadSession(Parcel paramParcel)
  {
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(14872);
    j.p(paramParcel, "parcel");
    paramParcel.writeInt(this.id);
    paramParcel.writeString(this.url);
    paramParcel.writeInt(this.jSV);
    paramParcel.writeInt(this.jSu);
    paramParcel.writeInt(this.jSW);
    paramParcel.writeInt(this.jSX);
    paramParcel.writeString(this.jSY);
    int i;
    if (this.jSZ)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      if (!this.jTa)
        break label209;
      i = 1;
      b = i;
      label100: paramParcel.writeByte(b);
      if (!this.jTb)
        break label217;
      i = 1;
      b = i;
      label118: paramParcel.writeByte(b);
      if (!this.jTc)
        break label225;
      i = 1;
      b = i;
      label136: paramParcel.writeByte(b);
      if (!this.jTd)
        break label233;
      i = 1;
      b = i;
      label154: paramParcel.writeByte(b);
      if (!this.jSa)
        break label241;
      i = 1;
      b = i;
      label172: paramParcel.writeByte(b);
      if (!this.jTe)
        break label249;
    }
    label209: label217: label225: label233: label241: label249: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      AppMethodBeat.o(14872);
      return;
      i = 0;
      j = i;
      break;
      i = 0;
      j = i;
      break label100;
      i = 0;
      j = i;
      break label118;
      i = 0;
      j = i;
      break label136;
      i = 0;
      j = i;
      break label154;
      i = 0;
      j = i;
      break label172;
      paramInt = 0;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$PreloadSession$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$PreloadSession;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$PreloadSession;", "plugin-brandservice_release"})
  public static final class a
    implements Parcelable.Creator<PreloadLogic.PreloadSession>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.PreloadSession
 * JD-Core Version:    0.6.2
 */
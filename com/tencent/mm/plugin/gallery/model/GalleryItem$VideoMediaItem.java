package com.tencent.mm.plugin.gallery.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class GalleryItem$VideoMediaItem extends GalleryItem.MediaItem
{
  public static final Parcelable.Creator<GalleryItem.MediaItem> CREATOR;
  public int eXL = -1;
  public String fPU;
  public String fPV;
  public int fPW = -1;
  public int fPX = -1;
  public int videoBitRate = -1;
  public int videoFrameRate = -1;
  public int videoHeight = -1;
  public int videoWidth = -1;

  static
  {
    AppMethodBeat.i(21296);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(21296);
  }

  public GalleryItem$VideoMediaItem()
  {
  }

  public GalleryItem$VideoMediaItem(long paramLong)
  {
    super(paramLong);
  }

  public GalleryItem$VideoMediaItem(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    super(paramLong, paramString1, paramString2, paramString3);
  }

  public final String Wy()
  {
    AppMethodBeat.i(21293);
    String str;
    if (!bo.isNullOrNil(this.lZg))
    {
      str = this.lZg;
      AppMethodBeat.o(21293);
    }
    while (true)
    {
      return str;
      str = this.fPT;
      AppMethodBeat.o(21293);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final int getType()
  {
    return 2;
  }

  public String toString()
  {
    AppMethodBeat.i(21295);
    String str = "VideoMediaItem{base=" + super.toString() + ", videoTrackMime='" + this.fPU + '\'' + ", audioTrackMime='" + this.fPV + '\'' + ", durationMs=" + this.fPW + ", videoHeight=" + this.videoHeight + ", videoWidth=" + this.videoWidth + ", videoBitRate=" + this.videoBitRate + ", videoIFrameInterval=" + this.fPX + ", videoFrameRate=" + this.videoFrameRate + '}';
    AppMethodBeat.o(21295);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(21294);
    paramParcel.writeString(this.fPT);
    paramParcel.writeString(this.lZg);
    paramParcel.writeLong(this.mOk);
    paramParcel.writeString(this.mMimeType);
    paramParcel.writeInt(this.videoWidth);
    paramParcel.writeInt(this.videoHeight);
    paramParcel.writeInt(this.fPW);
    paramParcel.writeString(this.fPU);
    paramParcel.writeString(this.fPV);
    paramParcel.writeInt(this.fPX);
    paramParcel.writeInt(this.videoFrameRate);
    paramParcel.writeInt(this.videoBitRate);
    paramParcel.writeInt(this.eXL);
    AppMethodBeat.o(21294);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem
 * JD-Core Version:    0.6.2
 */
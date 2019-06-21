package com.tencent.mm.plugin.gallery.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class GalleryItem$ImageMediaItem extends GalleryItem.MediaItem
{
  public static final Parcelable.Creator<GalleryItem.MediaItem> CREATOR;

  static
  {
    AppMethodBeat.i(21291);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(21291);
  }

  public GalleryItem$ImageMediaItem()
  {
  }

  public GalleryItem$ImageMediaItem(long paramLong)
  {
    super(paramLong);
  }

  public GalleryItem$ImageMediaItem(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    super(paramLong, paramString1, paramString2, paramString3);
  }

  public final String Wy()
  {
    AppMethodBeat.i(21289);
    String str;
    if (!bo.isNullOrNil(this.lZg))
    {
      str = this.lZg;
      AppMethodBeat.o(21289);
    }
    while (true)
    {
      return str;
      str = this.fPT;
      AppMethodBeat.o(21289);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final int getType()
  {
    return 1;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(21290);
    paramParcel.writeString(this.fPT);
    paramParcel.writeString(this.lZg);
    paramParcel.writeLong(this.mOk);
    paramParcel.writeLong(this.mOl);
    paramParcel.writeString(this.mMimeType);
    AppMethodBeat.o(21290);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.GalleryItem.ImageMediaItem
 * JD-Core Version:    0.6.2
 */
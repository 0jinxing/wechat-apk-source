package com.tencent.mm.plugin.gallery.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class GalleryItem$AlbumItem
  implements Parcelable
{
  public static final Parcelable.Creator<AlbumItem> CREATOR;
  public int cyR;
  public String mOg;
  public GalleryItem.MediaItem mOh;

  static
  {
    AppMethodBeat.i(21287);
    CREATOR = new GalleryItem.AlbumItem.1();
    AppMethodBeat.o(21287);
  }

  protected GalleryItem$AlbumItem(Parcel paramParcel)
  {
    AppMethodBeat.i(21284);
    this.mOg = paramParcel.readString();
    this.cyR = paramParcel.readInt();
    this.mOh = ((GalleryItem.MediaItem)paramParcel.readParcelable(GalleryItem.MediaItem.class.getClassLoader()));
    AppMethodBeat.o(21284);
  }

  public GalleryItem$AlbumItem(String paramString, int paramInt)
  {
    AppMethodBeat.i(21283);
    this.mOg = bo.nullAsNil(paramString);
    this.cyR = paramInt;
    AppMethodBeat.o(21283);
  }

  public final String Wy()
  {
    AppMethodBeat.i(21285);
    String str;
    if (this.mOh == null)
    {
      str = null;
      AppMethodBeat.o(21285);
    }
    while (true)
    {
      return str;
      str = this.mOh.Wy();
      AppMethodBeat.o(21285);
    }
  }

  public final long bCq()
  {
    if (this.mOh == null);
    for (long l = -1L; ; l = this.mOh.mOk)
      return l;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(21286);
    paramParcel.writeString(this.mOg);
    paramParcel.writeInt(this.cyR);
    paramParcel.writeParcelable(this.mOh, paramInt);
    AppMethodBeat.o(21286);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.GalleryItem.AlbumItem
 * JD-Core Version:    0.6.2
 */
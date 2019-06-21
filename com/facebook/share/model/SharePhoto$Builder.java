package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SharePhoto$Builder extends ShareMedia.Builder<SharePhoto, Builder>
{
  private Bitmap bitmap;
  private String caption;
  private Uri imageUrl;
  private boolean userGenerated;

  static List<SharePhoto> readPhotoListFrom(Parcel paramParcel)
  {
    AppMethodBeat.i(97558);
    Object localObject = readListFrom(paramParcel);
    paramParcel = new ArrayList();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (ShareMedia)localIterator.next();
      if ((localObject instanceof SharePhoto))
        paramParcel.add((SharePhoto)localObject);
    }
    AppMethodBeat.o(97558);
    return paramParcel;
  }

  static void writePhotoListTo(Parcel paramParcel, int paramInt, List<SharePhoto> paramList)
  {
    AppMethodBeat.i(97557);
    ShareMedia[] arrayOfShareMedia = new ShareMedia[paramList.size()];
    for (int i = 0; i < paramList.size(); i++)
      arrayOfShareMedia[i] = ((ShareMedia)paramList.get(i));
    paramParcel.writeParcelableArray(arrayOfShareMedia, paramInt);
    AppMethodBeat.o(97557);
  }

  public final SharePhoto build()
  {
    AppMethodBeat.i(97554);
    SharePhoto localSharePhoto = new SharePhoto(this, null);
    AppMethodBeat.o(97554);
    return localSharePhoto;
  }

  final Bitmap getBitmap()
  {
    return this.bitmap;
  }

  final Uri getImageUrl()
  {
    return this.imageUrl;
  }

  final Builder readFrom(Parcel paramParcel)
  {
    AppMethodBeat.i(97556);
    paramParcel = readFrom((SharePhoto)paramParcel.readParcelable(SharePhoto.class.getClassLoader()));
    AppMethodBeat.o(97556);
    return paramParcel;
  }

  public final Builder readFrom(SharePhoto paramSharePhoto)
  {
    AppMethodBeat.i(97555);
    if (paramSharePhoto == null)
    {
      AppMethodBeat.o(97555);
      paramSharePhoto = this;
    }
    while (true)
    {
      return paramSharePhoto;
      paramSharePhoto = ((Builder)super.readFrom(paramSharePhoto)).setBitmap(paramSharePhoto.getBitmap()).setImageUrl(paramSharePhoto.getImageUrl()).setUserGenerated(paramSharePhoto.getUserGenerated()).setCaption(paramSharePhoto.getCaption());
      AppMethodBeat.o(97555);
    }
  }

  public final Builder setBitmap(Bitmap paramBitmap)
  {
    this.bitmap = paramBitmap;
    return this;
  }

  public final Builder setCaption(String paramString)
  {
    this.caption = paramString;
    return this;
  }

  public final Builder setImageUrl(Uri paramUri)
  {
    this.imageUrl = paramUri;
    return this;
  }

  public final Builder setUserGenerated(boolean paramBoolean)
  {
    this.userGenerated = paramBoolean;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.SharePhoto.Builder
 * JD-Core Version:    0.6.2
 */
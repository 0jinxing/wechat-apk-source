package com.tencent.mm.plugin.emojicapture.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class EmojiCaptureUploadManager$UploadTask
  implements Parcelable
{
  public static final Parcelable.Creator<UploadTask> CREATOR;
  public String lgZ;
  public EmojiCaptureReporter lha;

  static
  {
    AppMethodBeat.i(57467);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(57467);
  }

  public EmojiCaptureUploadManager$UploadTask(Parcel paramParcel)
  {
    AppMethodBeat.i(57465);
    this.lgZ = paramParcel.readString();
    this.lha = ((EmojiCaptureReporter)paramParcel.readParcelable(EmojiCaptureReporter.class.getClassLoader()));
    AppMethodBeat.o(57465);
  }

  public EmojiCaptureUploadManager$UploadTask(String paramString, EmojiCaptureReporter paramEmojiCaptureReporter)
  {
    this.lgZ = paramString;
    this.lha = paramEmojiCaptureReporter;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(57466);
    paramParcel.writeString(this.lgZ);
    paramParcel.writeParcelable(this.lha, paramInt);
    AppMethodBeat.o(57466);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.api.EmojiCaptureUploadManager.UploadTask
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.modelcontrol;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class VideoTransPara
  implements Parcelable
{
  public static final Parcelable.Creator<VideoTransPara> CREATOR;
  public int audioSampleRate;
  public int duration;
  public int fAf;
  public int fps;
  public int fzS;
  public int fzT;
  public int fzU;
  public int fzV;
  public int height;
  public boolean isDefault;
  public int videoBitrate;
  public int width;

  static
  {
    AppMethodBeat.i(117279);
    CREATOR = new VideoTransPara.1();
    AppMethodBeat.o(117279);
  }

  public VideoTransPara()
  {
    this.fAf = 0;
  }

  protected VideoTransPara(Parcel paramParcel)
  {
    AppMethodBeat.i(117276);
    this.fAf = 0;
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
    this.fps = paramParcel.readInt();
    this.videoBitrate = paramParcel.readInt();
    this.duration = paramParcel.readInt();
    this.fzT = paramParcel.readInt();
    this.fzS = paramParcel.readInt();
    this.audioSampleRate = paramParcel.readInt();
    this.fzU = paramParcel.readInt();
    this.fzV = paramParcel.readInt();
    if (paramParcel.readInt() > 0)
      bool = true;
    this.isDefault = bool;
    this.fAf = paramParcel.readInt();
    AppMethodBeat.o(117276);
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(117278);
    String str = "[isDefault " + this.isDefault + " width " + this.width + " height " + this.height + " fps " + this.fps + " video bitrate " + this.videoBitrate + " iFrame " + this.fzT + " audio bitrate " + this.fzS + " audioSampleRate " + this.audioSampleRate + " duration " + this.duration + " profile index " + this.fzU + " preset index " + this.fzV + " thumbSize " + this.fAf + "]";
    AppMethodBeat.o(117278);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(117277);
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
    paramParcel.writeInt(this.fps);
    paramParcel.writeInt(this.videoBitrate);
    paramParcel.writeInt(this.duration);
    paramParcel.writeInt(this.fzT);
    paramParcel.writeInt(this.fzS);
    paramParcel.writeInt(this.audioSampleRate);
    paramParcel.writeInt(this.fzU);
    paramParcel.writeInt(this.fzV);
    if (this.isDefault);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.fAf);
      AppMethodBeat.o(117277);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcontrol.VideoTransPara
 * JD-Core Version:    0.6.2
 */
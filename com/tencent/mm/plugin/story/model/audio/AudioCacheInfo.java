package com.tencent.mm.plugin.story.model.audio;

import a.f.b.j;
import a.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.ui.view.editor.item.d;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "cachePath", "", "getCachePath", "()Ljava/lang/String;", "setCachePath", "(Ljava/lang/String;)V", "cached", "", "getCached", "()Z", "setCached", "(Z)V", "failed", "getFailed", "setFailed", "lyricsList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/MusicLrcBean;", "Lkotlin/collections/ArrayList;", "getLyricsList", "()Ljava/util/ArrayList;", "setLyricsList", "(Ljava/util/ArrayList;)V", "musicId", "", "getMusicId", "()I", "setMusicId", "(I)V", "musicUrl", "getMusicUrl", "setMusicUrl", "position", "getPosition", "setPosition", "request_id", "", "getRequest_id", "()J", "setRequest_id", "(J)V", "singers", "getSingers", "setSingers", "songName", "getSongName", "setSongName", "source", "getSource", "setSource", "type", "getType", "setType", "describeContents", "()Ljava/lang/Integer;", "writeToParcel", "", "flags", "Companion", "plugin-story_release"})
public final class AudioCacheInfo
  implements Parcelable
{
  public static final Parcelable.Creator<AudioCacheInfo> CREATOR;
  private static final String TAG = "MicroMsg.AudioCacheInfo";
  private static final int rUc = 1;
  private static final int rUd = 2;
  private static final int rUe = 3;
  private static final int rUf = 4;
  private static final int rUg = 5;
  private static final int rUh = 0;
  private static final int rUi = 1;
  public static final AudioCacheInfo.a rUj;
  public boolean aIM;
  public String cachePath;
  public int cvd;
  public String musicUrl;
  public int position;
  public int rTW;
  public ArrayList<d> rTX;
  public ArrayList<String> rTY;
  public boolean rTZ;
  public String rUa;
  public long rUb;
  public int type;

  static
  {
    AppMethodBeat.i(109176);
    rUj = new AudioCacheInfo.a((byte)0);
    TAG = "MicroMsg.AudioCacheInfo";
    rUc = 1;
    rUd = 2;
    rUe = 3;
    rUf = 4;
    rUg = 5;
    rUi = 1;
    CREATOR = (Parcelable.Creator)new AudioCacheInfo.b();
    AppMethodBeat.o(109176);
  }

  public AudioCacheInfo()
  {
    AppMethodBeat.i(109174);
    this.rTY = new ArrayList();
    this.rUa = "";
    this.position = -1;
    this.rUb = -1L;
    AppMethodBeat.o(109174);
  }

  public AudioCacheInfo(Parcel paramParcel)
  {
    this();
    AppMethodBeat.i(109175);
    this.rTW = paramParcel.readInt();
    this.musicUrl = paramParcel.readString();
    this.cachePath = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.aIM = bool2;
      if (paramParcel.readByte() == 0)
        break label120;
    }
    label120: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.rTZ = bool2;
      this.position = paramParcel.readInt();
      this.rUb = paramParcel.readLong();
      this.type = paramParcel.readInt();
      paramParcel = paramParcel.readString();
      j.o(paramParcel, "parcel.readString()");
      this.rUa = paramParcel;
      AppMethodBeat.o(109175);
      return;
      bool2 = false;
      break;
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(109173);
    j.p(paramParcel, "parcel");
    paramParcel.writeInt(this.rTW);
    paramParcel.writeString(this.musicUrl);
    paramParcel.writeString(this.cachePath);
    int i;
    if (this.aIM)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      if (!this.rTZ)
        break label117;
    }
    label117: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      paramParcel.writeInt(this.position);
      paramParcel.writeLong(this.rUb);
      paramParcel.writeInt(this.type);
      paramParcel.writeString(this.rUa);
      AppMethodBeat.o(109173);
      return;
      i = 0;
      j = i;
      break;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.audio.AudioCacheInfo
 * JD-Core Version:    0.6.2
 */
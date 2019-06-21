package com.tencent.mm.plugin.appbrand.media.record;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.r.a;
import com.tencent.mm.sdk.platformtools.ab;

class AudioRecordVoIPInterruptListener$CheckInterruptTask extends MainProcessTask
{
  public static final Parcelable.Creator<CheckInterruptTask> CREATOR;
  private e ilB;
  private boolean ilx;

  static
  {
    AppMethodBeat.i(132164);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(132164);
  }

  public AudioRecordVoIPInterruptListener$CheckInterruptTask(Parcel paramParcel)
  {
    AppMethodBeat.i(132160);
    this.ilx = false;
    g(paramParcel);
    AppMethodBeat.o(132160);
  }

  public AudioRecordVoIPInterruptListener$CheckInterruptTask(e parame)
  {
    this.ilx = false;
    this.ilB = parame;
  }

  public final void asP()
  {
    boolean bool1 = false;
    AppMethodBeat.i(132161);
    this.ilx = false;
    boolean bool2 = com.tencent.mm.plugin.voip.e.cIm();
    boolean bool3 = a.Oo();
    ab.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "isVoipUsing:%b, isMultiTalkUsing:%b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
    if ((bool2) || (bool3))
      bool1 = true;
    this.ilx = bool1;
    aCb();
    AppMethodBeat.o(132161);
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(132162);
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.ilx = bool;
      AppMethodBeat.o(132162);
      return;
      bool = false;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(132163);
    if (this.ilx);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(132163);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener.CheckInterruptTask
 * JD-Core Version:    0.6.2
 */
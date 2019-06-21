package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class SampleTask2 extends MainProcessTask
{
  public static final Parcelable.Creator<SampleTask2> CREATOR;

  static
  {
    AppMethodBeat.i(86963);
    CREATOR = new SampleTask2.1();
    AppMethodBeat.o(86963);
  }

  public final void asP()
  {
    AppMethodBeat.i(86962);
    ab.e("SampleTask2", "Run in Main Process");
    AppMethodBeat.o(86962);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.SampleTask2
 * JD-Core Version:    0.6.2
 */
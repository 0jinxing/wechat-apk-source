package com.tencent.mm.plugin.appbrand;

import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

public class AppBrandMainProcessPrepareTask extends MainProcessTask
{
  public static final Parcelable.Creator<AppBrandMainProcessPrepareTask> CREATOR;
  private final Runnable gNv;

  static
  {
    AppMethodBeat.i(128947);
    CREATOR = new AppBrandMainProcessPrepareTask.1();
    AppMethodBeat.o(128947);
  }

  AppBrandMainProcessPrepareTask()
  {
    AppMethodBeat.i(128944);
    this.gNv = null;
    aBV();
    AppMethodBeat.o(128944);
  }

  public final void asP()
  {
    AppMethodBeat.i(128945);
    aCb();
    AppMethodBeat.o(128945);
  }

  public final void asQ()
  {
    AppMethodBeat.i(128946);
    if (this.gNv != null)
      this.gNv.run();
    aBW();
    AppMethodBeat.o(128946);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.AppBrandMainProcessPrepareTask
 * JD-Core Version:    0.6.2
 */
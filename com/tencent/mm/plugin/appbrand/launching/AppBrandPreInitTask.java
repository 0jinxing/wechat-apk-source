package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Locale;

public final class AppBrandPreInitTask extends MainProcessTask
{
  public static final Parcelable.Creator<AppBrandPreInitTask> CREATOR;
  private transient AppBrandPreInitTask.a ifG;
  private ActivityStarterIpcDelegate ifH;
  private LaunchParcel ifI;
  private AppBrandInitConfigWC ifJ;
  private String ifK;

  static
  {
    AppMethodBeat.i(131728);
    CREATOR = new AppBrandPreInitTask.3();
    AppMethodBeat.o(131728);
  }

  public AppBrandPreInitTask(Context paramContext, LaunchParcel paramLaunchParcel, String paramString, AppBrandPreInitTask.a parama)
  {
    AppMethodBeat.i(131721);
    this.ifI = paramLaunchParcel;
    this.ifK = paramString;
    this.ifG = parama;
    if ((paramContext instanceof Activity));
    for (this.ifH = new ActivityStarterIpcDelegate((Activity)paramContext); ; this.ifH = null)
    {
      this.ifI.ifP = this.ifH;
      AppMethodBeat.o(131721);
      return;
    }
  }

  private AppBrandPreInitTask(Parcel paramParcel)
  {
    AppMethodBeat.i(131726);
    g(paramParcel);
    AppMethodBeat.o(131726);
  }

  public final void asP()
  {
    AppMethodBeat.i(131723);
    e locale = new e(this.ifI, this.ifK, new d.a()
    {
    });
    String str = this.ifI.appId;
    int i = this.ifI.har;
    new al(String.format(Locale.US, "AppBrandPreInitTask-%s|%d", new Object[] { str, Integer.valueOf(i) })).aa(new AppBrandPreInitTask.2(this, locale));
    AppMethodBeat.o(131723);
  }

  public final void asQ()
  {
    AppMethodBeat.i(131722);
    if (this.ifG != null)
      this.ifG.b(this.ifJ);
    aBW();
    AppMethodBeat.o(131722);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(131725);
    this.ifI = ((LaunchParcel)paramParcel.readParcelable(LaunchParcel.class.getClassLoader()));
    this.ifK = paramParcel.readString();
    this.ifJ = ((AppBrandInitConfigWC)paramParcel.readParcelable(AppBrandInitConfigWC.class.getClassLoader()));
    this.ifH = ((ActivityStarterIpcDelegate)paramParcel.readParcelable(ActivityStarterIpcDelegate.class.getClassLoader()));
    AppMethodBeat.o(131725);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131724);
    paramParcel.writeParcelable(this.ifI, paramInt);
    paramParcel.writeString(this.ifK);
    paramParcel.writeParcelable(this.ifJ, paramInt);
    paramParcel.writeParcelable(this.ifH, paramInt);
    AppMethodBeat.o(131724);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.h;

final class AppBrandLaunchErrorActionAlert extends AppBrandLaunchErrorAction
{
  final String gsG;
  final String gsH;

  @Keep
  AppBrandLaunchErrorActionAlert(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(131696);
    this.gsG = paramParcel.readString();
    this.gsH = paramParcel.readString();
    AppMethodBeat.o(131696);
  }

  AppBrandLaunchErrorActionAlert(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    super(paramString1, paramInt);
    this.gsG = paramString2;
    this.gsH = paramString3;
  }

  final void cQ(Context paramContext)
  {
    AppMethodBeat.i(131698);
    String str1 = this.gsH;
    String str2 = this.gsG;
    if (!(paramContext instanceof Activity))
    {
      a.a(null, str1, str2, ah.getResources().getString(2131296994), "", null, null, null);
      AppMethodBeat.o(131698);
    }
    while (true)
    {
      return;
      h.a(paramContext, str1, str2, false, null);
      AppMethodBeat.o(131698);
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131697);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.gsG);
    paramParcel.writeString(this.gsH);
    AppMethodBeat.o(131697);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionAlert
 * JD-Core Version:    0.6.2
 */
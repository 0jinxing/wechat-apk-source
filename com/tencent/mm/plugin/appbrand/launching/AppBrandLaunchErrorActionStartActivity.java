package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class AppBrandLaunchErrorActionStartActivity extends AppBrandLaunchErrorAction
{
  final String ifA;
  final Intent ifB;
  final String ifz;

  @Keep
  AppBrandLaunchErrorActionStartActivity(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(131699);
    this.ifz = paramParcel.readString();
    this.ifA = paramParcel.readString();
    this.ifB = ((Intent)paramParcel.readParcelable(Intent.class.getClassLoader()));
    AppMethodBeat.o(131699);
  }

  AppBrandLaunchErrorActionStartActivity(String paramString1, int paramInt, String paramString2, String paramString3, Intent paramIntent)
  {
    super(paramString1, paramInt);
    this.ifz = paramString2;
    this.ifA = paramString3;
    this.ifB = paramIntent;
  }

  final void cQ(Context paramContext)
  {
    AppMethodBeat.i(131701);
    Intent localIntent = this.ifB;
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    while (true)
    {
      d.b(paramContext, this.ifz, this.ifA, localIntent);
      AppMethodBeat.o(131701);
      return;
      localIntent.setFlags(localIntent.getFlags() & 0xEFFFFFFF);
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131700);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.ifz);
    paramParcel.writeString(this.ifA);
    paramParcel.writeParcelable(this.ifB, 0);
    AppMethodBeat.o(131700);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionStartActivity
 * JD-Core Version:    0.6.2
 */
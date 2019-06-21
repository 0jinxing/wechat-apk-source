package com.tencent.mm.plugin.wepkg.utils;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessTask;

public final class WepkgRunCgi$RemoteCgiTask extends WepkgMainProcessTask
  implements w.a
{
  public static final Parcelable.Creator<RemoteCgiTask> CREATOR;
  private String hxN;
  private int lqL;
  private int lqz;
  public int uYc;
  private b uYd;
  public b uYe;
  public WepkgRunCgi.a uYf;

  static
  {
    AppMethodBeat.i(63646);
    CREATOR = new WepkgRunCgi.RemoteCgiTask.1();
    AppMethodBeat.o(63646);
  }

  public WepkgRunCgi$RemoteCgiTask()
  {
    this.uYc = 0;
  }

  WepkgRunCgi$RemoteCgiTask(Parcel paramParcel)
  {
    AppMethodBeat.i(63645);
    this.uYc = 0;
    g(paramParcel);
    AppMethodBeat.o(63645);
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(63641);
    this.lqL = paramInt1;
    this.lqz = paramInt2;
    this.hxN = paramString;
    this.uYd = paramb;
    this.uYc = 2;
    wM();
    AppMethodBeat.o(63641);
    return 0;
  }

  public final void asP()
  {
    AppMethodBeat.i(63640);
    w.a(this.uYe, this, true);
    AppMethodBeat.o(63640);
  }

  public final void asQ()
  {
    AppMethodBeat.i(63642);
    d.at(this);
    if (this.uYf != null)
      this.uYf.a(this.lqL, this.lqz, this.hxN, this.uYd);
    AppMethodBeat.o(63642);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(63644);
    super.g(paramParcel);
    this.uYc = paramParcel.readInt();
    switch (this.uYc)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(63644);
      while (true)
      {
        return;
        this.uYe = WepkgRunCgi.n(paramParcel);
        AppMethodBeat.o(63644);
      }
      this.lqL = paramParcel.readInt();
      this.lqz = paramParcel.readInt();
      this.hxN = paramParcel.readString();
      this.uYd = WepkgRunCgi.n(paramParcel);
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(63643);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.uYc);
    switch (this.uYc)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(63643);
      while (true)
      {
        return;
        WepkgRunCgi.a(this.uYe, paramParcel);
        AppMethodBeat.o(63643);
      }
      paramParcel.writeInt(this.lqL);
      paramParcel.writeInt(this.lqz);
      paramParcel.writeString(this.hxN);
      WepkgRunCgi.a(this.uYd, paramParcel);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi.RemoteCgiTask
 * JD-Core Version:    0.6.2
 */
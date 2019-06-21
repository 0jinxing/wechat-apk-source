package com.tencent.mm.plugin.appbrand.ui.banner;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

final class AppBrandStickyBannerLogic$OperateTask extends MainProcessTask
{
  public static final Parcelable.Creator<OperateTask> CREATOR;
  String hQL;
  boolean iKN;
  int iKO;
  String iKP;
  int op = 0;

  static
  {
    AppMethodBeat.i(133304);
    CREATOR = new AppBrandStickyBannerLogic.OperateTask.1();
    AppMethodBeat.o(133304);
  }

  static OperateTask o(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(133301);
    OperateTask localOperateTask = new OperateTask();
    localOperateTask.op = 2;
    localOperateTask.hQL = paramString1;
    localOperateTask.iKO = paramInt;
    localOperateTask.iKP = paramString2;
    AppMethodBeat.o(133301);
    return localOperateTask;
  }

  public final void asP()
  {
    AppMethodBeat.i(133300);
    switch (this.op)
    {
    default:
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(133300);
      while (true)
      {
        return;
        this.iKN = AppBrandStickyBannerLogic.b.aMP();
        aCb();
        AppMethodBeat.o(133300);
        continue;
        AppBrandStickyBannerLogic.b.aMR();
        AppMethodBeat.o(133300);
      }
      AppBrandStickyBannerLogic.b.b(this);
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(133303);
    this.op = paramParcel.readInt();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.iKN = bool;
      this.hQL = paramParcel.readString();
      this.iKO = paramParcel.readInt();
      this.iKP = paramParcel.readString();
      AppMethodBeat.o(133303);
      return;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(133302);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.op);
    if (this.iKN)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeString(this.hQL);
      paramParcel.writeInt(this.iKO);
      paramParcel.writeString(this.iKP);
      AppMethodBeat.o(133302);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.OperateTask
 * JD-Core Version:    0.6.2
 */
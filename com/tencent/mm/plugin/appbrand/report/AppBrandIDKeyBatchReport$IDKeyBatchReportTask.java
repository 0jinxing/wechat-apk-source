package com.tencent.mm.plugin.appbrand.report;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.b.e.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.protocal.protobuf.cwt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class AppBrandIDKeyBatchReport$IDKeyBatchReportTask extends MainProcessTask
{
  public static final Parcelable.Creator<IDKeyBatchReportTask> CREATOR;
  public int izE;
  int izF;
  public String izG;
  public int izH;
  cwt izI;

  static
  {
    AppMethodBeat.i(132519);
    CREATOR = new AppBrandIDKeyBatchReport.IDKeyBatchReportTask.1();
    AppMethodBeat.o(132519);
  }

  AppBrandIDKeyBatchReport$IDKeyBatchReportTask()
  {
  }

  AppBrandIDKeyBatchReport$IDKeyBatchReportTask(Parcel paramParcel)
  {
    AppMethodBeat.i(132515);
    g(paramParcel);
    AppMethodBeat.o(132515);
  }

  public final void asP()
  {
    AppMethodBeat.i(132516);
    if (1 == this.izE)
      if ((!bo.isNullOrNil(this.izG)) && (g.RN().eJb))
      {
        Pair localPair = ((b)f.E(b.class)).y(this.izG, 5, this.izH);
        if (((Boolean)localPair.first).booleanValue())
        {
          ab.i("MicroMsg.AppBrandIDKeyBatchReport", "report blocked by appid(%s) scene(%d) ", new Object[] { this.izG, Integer.valueOf(this.izH) });
          com.tencent.mm.plugin.appbrand.appcache.b.c.a locala = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
          com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(((Integer)localPair.second).intValue(), 167L);
          AppMethodBeat.o(132516);
        }
      }
    while (true)
    {
      return;
      AppBrandIDKeyBatchReport.b.kN(0);
      AppBrandIDKeyBatchReport.b.BL();
      AppMethodBeat.o(132516);
      continue;
      if (2 == this.izE)
      {
        AppBrandIDKeyBatchReport.b.BM();
        AppMethodBeat.o(132516);
      }
      else
      {
        if (3 == this.izE)
          AppBrandIDKeyBatchReport.b.c(this.izI);
        AppMethodBeat.o(132516);
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(132517);
    this.izE = paramParcel.readInt();
    this.izF = paramParcel.readInt();
    this.izG = paramParcel.readString();
    this.izH = paramParcel.readInt();
    if (3 == this.izE);
    while (true)
    {
      try
      {
        cwt localcwt = new com/tencent/mm/protocal/protobuf/cwt;
        localcwt.<init>();
        this.izI = localcwt;
        this.izI.parseFrom(paramParcel.createByteArray());
        AppMethodBeat.o(132517);
        return;
      }
      catch (Exception paramParcel)
      {
        ab.e("MicroMsg.AppBrandIDKeyBatchReport", "parse WxaAppRecord from parcel, e = %s", new Object[] { paramParcel });
        this.izI = null;
      }
      AppMethodBeat.o(132517);
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(132518);
    paramParcel.writeInt(this.izE);
    paramParcel.writeInt(this.izF);
    paramParcel.writeString(this.izG);
    paramParcel.writeInt(this.izH);
    if (3 == this.izE);
    while (true)
    {
      try
      {
        paramParcel.writeByteArray(this.izI.toByteArray());
        AppMethodBeat.o(132518);
        return;
      }
      catch (Exception paramParcel)
      {
        ab.e("MicroMsg.AppBrandIDKeyBatchReport", "write WxaAppRecord to parcel, e = %s", new Object[] { paramParcel });
      }
      AppMethodBeat.o(132518);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport.IDKeyBatchReportTask
 * JD-Core Version:    0.6.2
 */
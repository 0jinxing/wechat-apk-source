package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.cg;
import com.tencent.mm.plugin.appbrand.jsapi.j;
import com.tencent.mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AppStartupPerformanceReportBundle
  implements Parcelable, j
{
  public static final Parcelable.Creator<AppStartupPerformanceReportBundle> CREATOR;
  public final String igT;
  public final List<cg> igU;
  public final List<kv_14609> igV;
  public boolean igW;

  static
  {
    AppMethodBeat.i(131807);
    CREATOR = new AppStartupPerformanceReportBundle.1();
    AppMethodBeat.o(131807);
  }

  private AppStartupPerformanceReportBundle(Parcel paramParcel)
  {
    AppMethodBeat.i(131806);
    this.igT = paramParcel.readString();
    this.igU = new LinkedList();
    int i = paramParcel.readInt();
    if (i > 0)
      for (int j = 0; j < i; j++)
        this.igU.add(new cg(paramParcel.readString()));
    this.igV = paramParcel.createTypedArrayList(kv_14609.CREATOR);
    if (paramParcel.readByte() > 0)
      bool = true;
    this.igW = bool;
    AppMethodBeat.o(131806);
  }

  public AppStartupPerformanceReportBundle(String paramString)
  {
    AppMethodBeat.i(131805);
    this.igT = paramString;
    this.igU = new LinkedList();
    this.igV = new LinkedList();
    AppMethodBeat.o(131805);
  }

  public final boolean aHk()
  {
    AppMethodBeat.i(131803);
    boolean bool;
    if (this.igV == null)
    {
      AppMethodBeat.o(131803);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = this.igV.iterator();
      label83: 
      while (true)
      {
        if (!localIterator.hasNext())
          break label85;
        kv_14609 localkv_14609 = (kv_14609)localIterator.next();
        if (localkv_14609 != null)
        {
          if (localkv_14609.iCm > 0);
          for (int i = 1; ; i = 0)
          {
            if (i == 0)
              break label83;
            AppMethodBeat.o(131803);
            bool = true;
            break;
          }
        }
      }
      label85: AppMethodBeat.o(131803);
      bool = false;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131804);
    paramParcel.writeString(this.igT);
    if (bo.ek(this.igU))
    {
      paramParcel.writeInt(-1);
      paramParcel.writeTypedList(this.igV);
      if (!this.igW)
        break label108;
    }
    label108: for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(131804);
      return;
      paramParcel.writeInt(this.igU.size());
      Iterator localIterator = this.igU.iterator();
      while (localIterator.hasNext())
        paramParcel.writeString(((cg)localIterator.next()).Fj());
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle
 * JD-Core Version:    0.6.2
 */
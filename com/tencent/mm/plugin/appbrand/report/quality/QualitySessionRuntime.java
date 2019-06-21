package com.tencent.mm.plugin.appbrand.report.quality;

import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle;
import com.tencent.mm.plugin.appbrand.o;

public class QualitySessionRuntime extends QualitySession
{
  public boolean hrs;
  public o htn;
  public long iDb;
  public long iDc;
  public long iDd;
  public AppStartupPerformanceReportBundle iDe;
  public int iDf;
  public final a.a iDg;
  public final e iDh;
  public final j iDi;
  public boolean iDj;
  public long iDk;

  QualitySessionRuntime(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(132708);
    this.iDg = new a.a();
    this.iDh = new e();
    this.iDi = new j();
    this.iDj = false;
    this.iDk = 0L;
    AppMethodBeat.o(132708);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime
 * JD-Core Version:    0.6.2
 */
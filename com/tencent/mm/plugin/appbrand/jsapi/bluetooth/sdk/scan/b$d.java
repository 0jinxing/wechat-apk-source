package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.annotation.TargetApi;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(21)
final class b$d extends ScanCallback
{
  private final WeakReference<e> hFo;

  b$d(e parame)
  {
    AppMethodBeat.i(94300);
    this.hFo = new WeakReference(parame);
    AppMethodBeat.o(94300);
  }

  public final void onBatchScanResults(List<ScanResult> paramList)
  {
    AppMethodBeat.i(94302);
    if ((e)this.hFo.get() == null)
      AppMethodBeat.o(94302);
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext())
        localArrayList.add(new ScanResultCompat((ScanResult)paramList.next()));
      AppMethodBeat.o(94302);
    }
  }

  public final void onScanFailed(int paramInt)
  {
    AppMethodBeat.i(94303);
    e locale = (e)this.hFo.get();
    if (locale != null)
      locale.onScanFailed(paramInt);
    AppMethodBeat.o(94303);
  }

  public final void onScanResult(int paramInt, ScanResult paramScanResult)
  {
    AppMethodBeat.i(94301);
    e locale = (e)this.hFo.get();
    if (locale != null)
      locale.a(paramInt, new ScanResultCompat(paramScanResult));
    AppMethodBeat.o(94301);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.b.d
 * JD-Core Version:    0.6.2
 */
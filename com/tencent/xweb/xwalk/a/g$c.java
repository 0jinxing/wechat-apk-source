package com.tencent.xweb.xwalk.a;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.f;
import org.xwalk.core.XWalkLibraryLoader.DownloadInfo;
import org.xwalk.core.XWalkLibraryLoader.DownloadListener;

public final class g$c
  implements XWalkLibraryLoader.DownloadListener
{
  private g ASM;
  private c ASY;
  private d ASZ;

  g$c(g paramg, c paramc, d paramd)
  {
    this.ASM = paramg;
    this.ASY = paramc;
    this.ASZ = paramd;
  }

  public final void onDownloadCancelled()
  {
    AppMethodBeat.i(85429);
    this.ASM.eW(this.ASY.dVM(), -3);
    if (this.ASY.dVM().equals("FullScreenVideo"))
      f.dVs();
    AppMethodBeat.o(85429);
  }

  public final void onDownloadCompleted(XWalkLibraryLoader.DownloadInfo paramDownloadInfo)
  {
    AppMethodBeat.i(85430);
    if (this.ASY.dVM().equals("FullScreenVideo"))
      f.dVr();
    new AsyncTask()
    {
    }
    .execute(new Void[0]);
    AppMethodBeat.o(85430);
  }

  public final void onDownloadFailed(XWalkLibraryLoader.DownloadInfo paramDownloadInfo)
  {
    AppMethodBeat.i(85431);
    this.ASM.eW(this.ASY.dVM(), -1);
    if (this.ASY.dVM().equals("FullScreenVideo"))
      f.dVs();
    AppMethodBeat.o(85431);
  }

  public final void onDownloadStarted(int paramInt)
  {
    AppMethodBeat.i(85427);
    if (this.ASY.dVM().equals("FullScreenVideo"))
      f.dVq();
    AppMethodBeat.o(85427);
  }

  public final void onDownloadUpdated(int paramInt)
  {
    AppMethodBeat.i(85428);
    g localg = this.ASM;
    String str = this.ASY.dVM();
    if ((localg.ASO.ASX == 3) && (localg.dVU()) && (localg.ASK.equals(str)))
      localg.ASL.Sy(paramInt);
    AppMethodBeat.o(85428);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.a.g.c
 * JD-Core Version:    0.6.2
 */
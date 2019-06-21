package com.tencent.mm.plugin.gallery.ui;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.stub.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class AlbumPreviewUI$1
  implements ServiceConnection
{
  AlbumPreviewUI$1(AlbumPreviewUI paramAlbumPreviewUI)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(21386);
    ab.i("MicroMsg.AlbumPreviewUI", "onServiceConnected");
    AlbumPreviewUI.a(this.mPO, a.a.B(paramIBinder));
    if (AlbumPreviewUI.a(this.mPO) != null)
      AlbumPreviewUI.a(this.mPO).mOG = AlbumPreviewUI.b(this.mPO);
    AppMethodBeat.o(21386);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(21387);
    ab.i("MicroMsg.AlbumPreviewUI", "onServiceDisconnected");
    AlbumPreviewUI.a(this.mPO, null);
    AppMethodBeat.o(21387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.gallery.ui;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.stub.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ImagePreviewUI$1
  implements ServiceConnection
{
  ImagePreviewUI$1(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(21497);
    ab.d("MicroMsg.ImagePreviewUI", "onServiceConnected");
    ImagePreviewUI.a(this.mRu, a.a.B(paramIBinder));
    AppMethodBeat.o(21497);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(21498);
    ab.d("MicroMsg.ImagePreviewUI", "onServiceDisconnected");
    ImagePreviewUI.a(this.mRu, null);
    AppMethodBeat.o(21498);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.1
 * JD-Core Version:    0.6.2
 */
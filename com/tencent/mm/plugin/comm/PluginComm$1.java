package com.tencent.mm.plugin.comm;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.e.a.b;

final class PluginComm$1
  implements b
{
  PluginComm$1(PluginComm paramPluginComm)
  {
  }

  public final void b(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(79087);
    a.b.b(paramImageView, paramString);
    AppMethodBeat.o(79087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.comm.PluginComm.1
 * JD-Core Version:    0.6.2
 */
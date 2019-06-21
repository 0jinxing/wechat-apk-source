package com.tencent.mm.plugin.messenger;

import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.a;
import java.lang.ref.WeakReference;
import java.util.Map;

final class PluginMessenger$6$1 extends a
{
  PluginMessenger$6$1(PluginMessenger.6 param6, Map paramMap, String paramString1, Bundle paramBundle, WeakReference paramWeakReference, String paramString2)
  {
  }

  public final void onClickImp(View paramView)
  {
    AppMethodBeat.i(136881);
    PluginMessenger.access$000(this.opL.opG, this.opJ, this.opK, this.val$params, this.ehd, this.inl, true);
    AppMethodBeat.o(136881);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.PluginMessenger.6.1
 * JD-Core Version:    0.6.2
 */
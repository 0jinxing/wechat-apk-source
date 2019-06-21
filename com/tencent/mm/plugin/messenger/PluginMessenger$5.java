package com.tencent.mm.plugin.messenger;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.b.a.v;
import com.tencent.mm.kernel.g;
import com.tencent.mm.openim.b.q;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.e.c;

final class PluginMessenger$5
  implements e.c
{
  PluginMessenger$5(PluginMessenger paramPluginMessenger, String paramString1, String paramString2, String paramString3, String paramString4, Context paramContext)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(136880);
    if ((paramBoolean) && (ad.aox(this.fwC)))
    {
      paramString = new v();
      paramString.eQ(this.fWr);
      paramString.cXW = 1L;
      paramString.eR(this.inl);
      paramString.cXX = 1L;
      paramString.cXZ = 2L;
      paramString.ajK();
      PluginMessenger.access$202(this.opG, new q(this.fwC, this.mzO));
      PluginMessenger.access$200(this.opG).gfj = this.inl;
      g.Rg().a(PluginMessenger.access$200(this.opG), 0);
      PluginMessenger localPluginMessenger = this.opG;
      paramString = this.val$context;
      this.val$context.getString(2131297061);
      PluginMessenger.access$302(localPluginMessenger, h.b(paramString, this.val$context.getString(2131301892), true, new PluginMessenger.5.1(this)));
    }
    AppMethodBeat.o(136880);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.PluginMessenger.5
 * JD-Core Version:    0.6.2
 */
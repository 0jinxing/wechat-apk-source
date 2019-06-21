package com.tencent.mm.plugin.messenger;

import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.v;
import com.tencent.mm.plugin.messenger.a.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class PluginMessenger$7$1 extends a
{
  PluginMessenger$7$1(PluginMessenger.7 param7, Bundle paramBundle, Map paramMap, String paramString)
  {
  }

  public final void onClickImp(View paramView)
  {
    AppMethodBeat.i(136883);
    try
    {
      paramView = this.val$params.getString("send_msg_username", "");
      Object localObject1 = this.opJ;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = bo.bc((String)((Map)localObject1).get(this.opK + ".chatname"), "");
      localObject1 = new com/tencent/mm/g/b/a/v;
      ((v)localObject1).<init>();
      ((v)localObject1).eR(paramView);
      ((v)localObject1).cXW = 2L;
      ((v)localObject1).cXX = 2L;
      ((v)localObject1).cYa = 1L;
      ((v)localObject1).ajK();
      PluginMessenger.access$100(this.opM.opG, (String)localObject2);
      AppMethodBeat.o(136883);
      return;
    }
    catch (Throwable paramView)
    {
      while (true)
        AppMethodBeat.o(136883);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.PluginMessenger.7.1
 * JD-Core Version:    0.6.2
 */
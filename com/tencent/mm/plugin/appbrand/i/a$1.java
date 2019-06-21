package com.tencent.mm.plugin.appbrand.i;

import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.f;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1 extends com.tencent.mm.plugin.messenger.a.a
{
  a$1(a parama, com.tencent.mm.af.a.a parama1, String paramString1, int paramInt, long paramLong, String paramString2)
  {
  }

  public final void onClickImp(View paramView)
  {
    AppMethodBeat.i(132265);
    ab.i("MicroMsg.WxaSubscribeMsgService", "On Span clicked(title : %s, username : %s, path : %s, talker : %s)", new Object[] { this.ink.content, this.ink.username, this.ink.path, this.inl });
    Object localObject = new Bundle();
    ((Bundle)localObject).putInt("stat_scene", this.fwD);
    ((Bundle)localObject).putString("stat_msg_id", "msg_" + Long.toString(this.fEC));
    ((Bundle)localObject).putString("stat_chat_talker_username", this.inl);
    ((Bundle)localObject).putString("stat_send_msg_user", this.inm);
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1088;
    localAppBrandStatObject.cst = "";
    localAppBrandStatObject.cOq = f.h(localAppBrandStatObject.scene, (Bundle)localObject);
    localAppBrandStatObject.cOr = f.i(localAppBrandStatObject.scene, (Bundle)localObject);
    String str = "";
    localObject = str;
    if (this.ink.path != null)
    {
      localObject = str;
      if (this.ink.path.length() > 0)
      {
        byte[] arrayOfByte = Base64.decode(this.ink.path, 2);
        localObject = str;
        if (arrayOfByte != null)
          localObject = new String(arrayOfByte);
      }
    }
    ((e)g.K(e.class)).a(paramView.getContext(), this.ink.username, null, this.ink.type, 0, (String)localObject, localAppBrandStatObject);
    ((d)g.K(d.class)).a(this.ink.username, new a.1.1(this));
    AppMethodBeat.o(132265);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.a.1
 * JD-Core Version:    0.6.2
 */
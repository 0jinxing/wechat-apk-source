package com.tencent.mm.plugin.appbrand.i;

import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.f;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.messenger.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class d$1 extends a
{
  d$1(d paramd, String paramString1, String paramString2, String paramString3, String paramString4, WeakReference paramWeakReference, int paramInt1, long paramLong, String paramString5, int paramInt2)
  {
  }

  public final void onClickImp(View paramView)
  {
    AppMethodBeat.i(132275);
    ab.i("MicroMsg.WxaSysTemplateMsgHandler", "On Span clicked(title : %s, username : %s, path : %s, talker : %s)", new Object[] { this.chV, this.eiH, this.bSt, this.inl });
    this.inq.get();
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
    if (this.bSt != null)
    {
      localObject = str;
      if (this.bSt.length() > 0)
      {
        byte[] arrayOfByte = Base64.decode(this.bSt, 2);
        localObject = str;
        if (arrayOfByte != null)
          localObject = new String(arrayOfByte);
      }
    }
    ((e)g.K(e.class)).a(paramView.getContext(), this.eiH, null, this.bVv, 0, (String)localObject, localAppBrandStatObject);
    AppMethodBeat.o(132275);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.d.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

final class JsApiChooseWeChatContact$1
  implements MMActivity.a
{
  JsApiChooseWeChatContact$1(JsApiChooseWeChatContact paramJsApiChooseWeChatContact, q paramq, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130991);
    if (100 != paramInt1)
    {
      ab.e("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact requestCode not equal, requestCode = %d", new Object[] { Integer.valueOf(paramInt1) });
      this.hsD.M(this.eIl, this.hIk.j("fail", null));
      AppMethodBeat.o(130991);
    }
    while (true)
    {
      return;
      if ((paramInt2 == 0) || (paramInt2 == 1))
      {
        ab.e("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact user cancel, resultCode = %d", new Object[] { Integer.valueOf(paramInt1) });
        this.hsD.M(this.eIl, this.hIk.j("cancel", null));
        AppMethodBeat.o(130991);
      }
      else
      {
        if (paramInt2 == -1)
        {
          if (paramIntent == null);
          for (paramIntent = null; ; paramIntent = paramIntent.getStringExtra("Select_Conv_User"))
          {
            if ((paramIntent != null) && (paramIntent.length() != 0))
              break label180;
            ab.e("MicroMsg.JsApiChooseWeChatContact", "mmOnActivityResult, selectSingleContact fail, user is null");
            this.hsD.M(this.eIl, this.hIk.j("fail", null));
            AppMethodBeat.o(130991);
            break;
          }
          label180: Object localObject = new JsApiChooseWeChatContact.GetUserDataTask(paramIntent);
          AppBrandMainProcessService.b((MainProcessTask)localObject);
          String str1 = ((JsApiChooseWeChatContact.GetUserDataTask)localObject).bCu;
          String str2 = ((JsApiChooseWeChatContact.GetUserDataTask)localObject).bCv;
          String str3 = ((JsApiChooseWeChatContact.GetUserDataTask)localObject).gEl;
          localObject = new HashMap();
          ((Map)localObject).put("avatarUrl", str3);
          ((Map)localObject).put("userName", paramIntent);
          ((Map)localObject).put("nickName", str1);
          ((Map)localObject).put("remarkName", str2);
          ab.i("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact: nickName:%s, remarkName:%s", new Object[] { str1, str2 });
          this.hsD.M(this.eIl, this.hIk.j("ok", (Map)localObject));
        }
        AppMethodBeat.o(130991);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact.1
 * JD-Core Version:    0.6.2
 */
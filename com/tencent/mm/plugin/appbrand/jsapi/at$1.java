package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

final class at$1
  implements MMActivity.a
{
  at$1(at paramat, c paramc, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130512);
    if (paramInt1 != (this.hye.hashCode() & 0xFFFF))
      AppMethodBeat.o(130512);
    while (true)
    {
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str1 = bo.bc(paramIntent.getStringExtra("nationalCode"), "");
        String str2 = bo.bc(paramIntent.getStringExtra("userName"), "");
        String str3 = bo.bc(paramIntent.getStringExtra("telNumber"), "");
        String str4 = bo.bc(paramIntent.getStringExtra("addressPostalCode"), "");
        String str5 = bo.bc(paramIntent.getStringExtra("proviceFirstStageName"), "");
        String str6 = bo.bc(paramIntent.getStringExtra("addressCitySecondStageName"), "");
        String str7 = bo.bc(paramIntent.getStringExtra("addressCountiesThirdStageName"), "");
        paramIntent = bo.bc(paramIntent.getStringExtra("addressDetailInfo"), "");
        ab.i("MicroMsg.JsApiOpenAddress", "first =  " + str5 + " ; detail =" + paramIntent + "; second = " + str6 + " ; tel = " + str3 + "; third = " + str7);
        if (!bo.isNullOrNil(str2))
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put("nationalCode", str1);
          localHashMap.put("userName", str2);
          localHashMap.put("telNumber", str3);
          localHashMap.put("addressPostalCode", str4);
          localHashMap.put("proviceFirstStageName", str5);
          localHashMap.put("addressCitySecondStageName", str6);
          localHashMap.put("addressCountiesThirdStageName", str7);
          localHashMap.put("addressDetailInfo", paramIntent);
          this.hyd.M(this.eIl, this.hye.j("ok", localHashMap));
          AppMethodBeat.o(130512);
        }
      }
      else if (paramInt2 == 0)
      {
        this.hyd.M(this.eIl, this.hye.j("cancel", null));
        AppMethodBeat.o(130512);
      }
      else
      {
        this.hyd.M(this.eIl, this.hye.j("fail", null));
        AppMethodBeat.o(130512);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.at.1
 * JD-Core Version:    0.6.2
 */
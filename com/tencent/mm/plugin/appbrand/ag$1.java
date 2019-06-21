package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;

final class ag$1
  implements Runnable
{
  ag$1(ag paramag, WxaAttributes paramWxaAttributes, Context paramContext, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129166);
    g.RN();
    int i = a.QF();
    String str1 = this.gQF.field_roundedSquareIconURL;
    String str2 = this.gQF.field_brandIconURL;
    Object localObject = this.gQF.field_bigHeadURL;
    String str3 = this.gQF.field_nickname;
    String str4 = this.gQF.field_appId;
    String str5 = this.gQF.field_username;
    localObject = new u.a(i, new String[] { str1, str2, localObject }, str3, str4, str5);
    u.a(this.val$context, (u.a)localObject, this.gQG, true);
    AppMethodBeat.o(129166);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ag.1
 * JD-Core Version:    0.6.2
 */
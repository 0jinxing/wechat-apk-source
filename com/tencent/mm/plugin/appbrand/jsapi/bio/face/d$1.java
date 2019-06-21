package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;

final class d$1
  implements MMActivity.a
{
  d$1(d paramd, c paramc, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(3202);
    ab.i("MicroMsg.JsApiStartFaceAction", "carson: start mmOnActivityResult（） ");
    int i = paramIntent.getIntExtra("err_code", 0);
    int j = paramIntent.getIntExtra("scene", 0);
    int k = paramIntent.getIntExtra("countFace", 0);
    long l = paramIntent.getLongExtra("totalTime", 0L);
    int m = paramIntent.getIntExtra("err_type", 6);
    ab.i("MicroMsg.JsApiStartFaceAction", "errCode： ".concat(String.valueOf(i)));
    ab.i("MicroMsg.JsApiStartFaceAction", "scene： ".concat(String.valueOf(j)));
    ab.i("MicroMsg.JsApiStartFaceAction", "countFace： ".concat(String.valueOf(k)));
    ab.i("MicroMsg.JsApiStartFaceAction", "totalTime： ".concat(String.valueOf(l)));
    ab.i("MicroMsg.JsApiStartFaceAction", "errorType： ".concat(String.valueOf(m)));
    Object localObject1;
    Object localObject2;
    if (paramInt1 == 63)
    {
      ab.i("MicroMsg.JsApiStartFaceAction", "REQUEST_FACE_VERIFY_FOR_PAY resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
      if (paramInt2 == -1)
      {
        h.pYm.e(15711, new Object[] { Integer.valueOf(j), Integer.valueOf(0), Integer.valueOf(k), Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(i) });
        localObject1 = this.hDa;
        localObject2 = this.hxc;
        paramInt1 = this.eIl;
        if (paramIntent != null);
        for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
        {
          d.a((d)localObject1, (c)localObject2, paramInt1, paramIntent, "ok");
          AppMethodBeat.o(3202);
          return;
        }
      }
      if (paramInt2 == 1)
      {
        h.pYm.e(15711, new Object[] { Integer.valueOf(j), Integer.valueOf(3), Integer.valueOf(k), Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(m), Integer.valueOf(i) });
        localObject2 = this.hDa;
        localObject1 = this.hxc;
        paramInt1 = this.eIl;
        if (paramIntent != null);
        for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
        {
          d.a((d)localObject2, (c)localObject1, paramInt1, paramIntent, "fail");
          AppMethodBeat.o(3202);
          break;
        }
      }
      if (paramInt2 == 0)
      {
        h.pYm.e(15711, new Object[] { Integer.valueOf(j), Integer.valueOf(2), Integer.valueOf(k), Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(i) });
        localObject2 = this.hDa;
        localObject1 = this.hxc;
        paramInt1 = this.eIl;
        if (paramIntent == null)
          break label523;
      }
    }
    label523: for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
    {
      d.a((d)localObject2, (c)localObject1, paramInt1, paramIntent, "cancel");
      AppMethodBeat.o(3202);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.face.d.1
 * JD-Core Version:    0.6.2
 */
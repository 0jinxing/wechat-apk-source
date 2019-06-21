package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;

final class a$1
  implements MMActivity.a
{
  a$1(a parama, c paramc, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    c localc = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    AppMethodBeat.i(3201);
    if (paramIntent != null)
    {
      paramInt2 = paramIntent.getIntExtra("err_code", 90199);
      if (paramInt1 != 1000)
        break label228;
      ab.i("MicroMsg.JsApiFaceAsyncBase", "alvinluo: requestWxFacePictureVerify errCode: %d", new Object[] { Integer.valueOf(paramInt2) });
      if (paramInt2 != 0)
        break label118;
      localObject2 = this.hCZ;
      localObject1 = this.hxc;
      paramInt1 = this.eIl;
      if (paramIntent != null)
        localObject5 = paramIntent.getExtras();
      a.a((a)localObject2, (c)localObject1, paramInt1, (Bundle)localObject5, "ok");
      AppMethodBeat.o(3201);
    }
    label228: 
    while (true)
    {
      return;
      paramInt2 = 90199;
      break;
      label118: if (paramInt2 == 90100)
      {
        localObject2 = this.hCZ;
        localc = this.hxc;
        paramInt1 = this.eIl;
        localObject5 = localObject1;
        if (paramIntent != null)
          localObject5 = paramIntent.getExtras();
        a.a((a)localObject2, localc, paramInt1, (Bundle)localObject5, "cancel");
        AppMethodBeat.o(3201);
      }
      else
      {
        localObject1 = this.hCZ;
        localc = this.hxc;
        paramInt1 = this.eIl;
        localObject5 = localObject2;
        if (paramIntent != null)
          localObject5 = paramIntent.getExtras();
        a.a((a)localObject1, localc, paramInt1, (Bundle)localObject5, "fail");
        AppMethodBeat.o(3201);
        continue;
        if (paramInt1 == 1001)
        {
          ab.i("MicroMsg.JsApiFaceAsyncBase", "hy: REQUEST_FACE_DETECT_WITH_VIDEO errCode: %d", new Object[] { Integer.valueOf(paramInt2) });
          if (paramInt2 == 0)
          {
            localObject2 = this.hCZ;
            localObject1 = this.hxc;
            paramInt1 = this.eIl;
            localObject5 = localc;
            if (paramIntent != null)
              localObject5 = paramIntent.getExtras();
            a.a((a)localObject2, (c)localObject1, paramInt1, (Bundle)localObject5, "ok");
            AppMethodBeat.o(3201);
          }
          else if (paramInt2 == 90100)
          {
            localObject1 = this.hCZ;
            localObject2 = this.hxc;
            paramInt1 = this.eIl;
            localObject5 = localObject3;
            if (paramIntent != null)
              localObject5 = paramIntent.getExtras();
            a.a((a)localObject1, (c)localObject2, paramInt1, (Bundle)localObject5, "cancel");
            AppMethodBeat.o(3201);
          }
          else
          {
            localObject1 = this.hCZ;
            localObject2 = this.hxc;
            paramInt1 = this.eIl;
            localObject5 = localObject4;
            if (paramIntent != null)
              localObject5 = paramIntent.getExtras();
            a.a((a)localObject1, (c)localObject2, paramInt1, (Bundle)localObject5, "fail");
          }
        }
        else
        {
          AppMethodBeat.o(3201);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.face.a.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.avx;
import com.tencent.mm.protocal.protobuf.buj;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.LinkedList;

final class JsApiAuthorize$AuthorizeTask$1
  implements JsApiAuthorize.AuthorizeTask.a
{
  JsApiAuthorize$AuthorizeTask$1(JsApiAuthorize.AuthorizeTask paramAuthorizeTask)
  {
  }

  public final void P(int paramInt, String paramString)
  {
    AppMethodBeat.i(130831);
    ab.e("MicroMsg.JsApiAuthorize", "onFailure !");
    this.hCg.hBV = "fail";
    this.hCg.errCode = paramInt;
    this.hCg.aIm = paramString;
    JsApiAuthorize.AuthorizeTask.b(this.hCg);
    AppMethodBeat.o(130831);
  }

  public final void a(avx paramavx)
  {
    AppMethodBeat.i(130832);
    ab.d("MicroMsg.JsApiAuthorize", "onConfirm !");
    LinkedList localLinkedList = paramavx.wlE;
    this.hCg.hCd = localLinkedList.size();
    int i = 0;
    Object localObject;
    while (true)
      if (i < this.hCg.hCd)
      {
        localObject = (buj)localLinkedList.get(i);
        try
        {
          this.hCg.hCe.putByteArray(String.valueOf(i), ((buj)localObject).toByteArray());
          i++;
        }
        catch (IOException paramavx)
        {
          ab.e("MicroMsg.JsApiAuthorize", "IOException %s", new Object[] { paramavx.getMessage() });
          ab.printErrStackTrace("MicroMsg.JsApiAuthorize", paramavx, "", new Object[0]);
          this.hCg.hBV = "fail";
          JsApiAuthorize.AuthorizeTask.c(this.hCg);
          AppMethodBeat.o(130832);
        }
      }
    while (true)
    {
      return;
      this.hCg.mAppName = paramavx.ncH;
      this.hCg.hBX = paramavx.vDm;
      this.hCg.hBY = paramavx.wzL;
      this.hCg.hCa = paramavx.wzK;
      this.hCg.hBZ = paramavx.wzJ;
      this.hCg.hBV = "needConfirm";
      if ((localLinkedList.size() > 0) && ("scope.userInfo".equals(((buj)localLinkedList.get(0)).vOF)))
      {
        this.hCg.hCc = r.YB();
        localObject = new StringBuilder("userNickName=");
        if (this.hCg.hCc == null);
        for (paramavx = ""; ; paramavx = this.hCg.hCc)
        {
          ab.i("MicroMsg.JsApiAuthorize", paramavx);
          paramavx = r.Yz();
          localObject = e.hBN;
          e.a.a(paramavx, new JsApiAuthorize.AuthorizeTask.1.1(this));
          AppMethodBeat.o(130832);
          break;
        }
      }
      JsApiAuthorize.AuthorizeTask.e(this.hCg);
      AppMethodBeat.o(130832);
    }
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(130830);
    ab.d("MicroMsg.JsApiAuthorize", "onSuccess !");
    this.hCg.hBV = "ok";
    JsApiAuthorize.AuthorizeTask.a(this.hCg);
    AppMethodBeat.o(130830);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize.AuthorizeTask.1
 * JD-Core Version:    0.6.2
 */
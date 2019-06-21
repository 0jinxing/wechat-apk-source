package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.buj;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.LinkedList;

final class JsApiLogin$LoginTask$1
  implements JsApiLogin.LoginTask.a
{
  JsApiLogin$LoginTask$1(JsApiLogin.LoginTask paramLoginTask)
  {
  }

  public final void P(int paramInt, String paramString)
  {
    AppMethodBeat.i(130855);
    ab.i("MicroMsg.JsApiLogin", "onFailure !");
    this.hCl.hBV = "fail";
    this.hCl.errCode = paramInt;
    this.hCl.aIm = paramString;
    JsApiLogin.LoginTask.b(this.hCl);
    AppMethodBeat.o(130855);
  }

  public final void a(LinkedList<buj> paramLinkedList, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(130856);
    ab.i("MicroMsg.JsApiLogin", "onConfirm !");
    this.hCl.hCd = paramLinkedList.size();
    int i = 0;
    while (true)
      if (i < this.hCl.hCd)
      {
        buj localbuj = (buj)paramLinkedList.get(i);
        try
        {
          this.hCl.hCe.putByteArray(String.valueOf(i), localbuj.toByteArray());
          i++;
        }
        catch (IOException paramLinkedList)
        {
          ab.e("MicroMsg.JsApiLogin", "IOException %s", new Object[] { paramLinkedList.getMessage() });
          ab.printErrStackTrace("MicroMsg.JsApiLogin", paramLinkedList, "", new Object[0]);
          this.hCl.hBV = "fail";
          JsApiLogin.LoginTask.c(this.hCl);
          AppMethodBeat.o(130856);
        }
      }
    while (true)
    {
      return;
      this.hCl.hzR = paramString3;
      this.hCl.mAppName = paramString1;
      this.hCl.hBX = paramString2;
      this.hCl.hBV = "needConfirm";
      JsApiLogin.LoginTask.d(this.hCl);
      AppMethodBeat.o(130856);
    }
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(130854);
    ab.i("MicroMsg.JsApiLogin", "onSuccess !");
    this.hCl.code = paramString;
    this.hCl.hBV = "ok";
    JsApiLogin.LoginTask.a(this.hCl);
    AppMethodBeat.o(130854);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin.LoginTask.1
 * JD-Core Version:    0.6.2
 */
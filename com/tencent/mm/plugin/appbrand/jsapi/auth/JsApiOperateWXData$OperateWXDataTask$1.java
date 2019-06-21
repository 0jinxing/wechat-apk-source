package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.buj;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.LinkedList;

final class JsApiOperateWXData$OperateWXDataTask$1
  implements JsApiOperateWXData.OperateWXDataTask.a
{
  JsApiOperateWXData$OperateWXDataTask$1(JsApiOperateWXData.OperateWXDataTask paramOperateWXDataTask)
  {
  }

  public final void a(LinkedList<buj> paramLinkedList, String paramString1, String paramString2)
  {
    AppMethodBeat.i(130878);
    ab.d("MicroMsg.JsApiOperateWXData", "onConfirm !");
    this.hCr.hCd = paramLinkedList.size();
    int i = 0;
    while (true)
      if (i < this.hCr.hCd)
      {
        buj localbuj = (buj)paramLinkedList.get(i);
        try
        {
          this.hCr.hCe.putByteArray(String.valueOf(i), localbuj.toByteArray());
          i++;
        }
        catch (IOException paramLinkedList)
        {
          ab.e("MicroMsg.JsApiOperateWXData", "IOException %s", new Object[] { paramLinkedList.getMessage() });
          ab.printErrStackTrace("MicroMsg.JsApiOperateWXData", paramLinkedList, "", new Object[0]);
          this.hCr.hBV = "fail";
          JsApiOperateWXData.OperateWXDataTask.c(this.hCr);
          AppMethodBeat.o(130878);
        }
      }
    while (true)
    {
      return;
      this.hCr.mAppName = paramString1;
      this.hCr.hBX = paramString2;
      this.hCr.hBV = "needConfirm";
      if ((paramLinkedList.size() > 0) && ("scope.userInfo".equals(((buj)paramLinkedList.get(0)).vOF)))
      {
        this.hCr.hCc = r.YB();
        paramString1 = new StringBuilder("userNickName=");
        if (this.hCr.hCc == null);
        for (paramLinkedList = ""; ; paramLinkedList = this.hCr.hCc)
        {
          ab.i("MicroMsg.JsApiOperateWXData", paramLinkedList);
          paramLinkedList = r.Yz();
          paramString1 = e.hBN;
          e.a.a(paramLinkedList, new JsApiOperateWXData.OperateWXDataTask.1.1(this));
          AppMethodBeat.o(130878);
          break;
        }
      }
      JsApiOperateWXData.OperateWXDataTask.e(this.hCr);
      AppMethodBeat.o(130878);
    }
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(130877);
    ab.e("MicroMsg.JsApiOperateWXData", "onFailure !");
    this.hCr.hBV = "fail:".concat(String.valueOf(paramString));
    JsApiOperateWXData.OperateWXDataTask.b(this.hCr);
    AppMethodBeat.o(130877);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(130876);
    ab.d("MicroMsg.JsApiOperateWXData", "onSuccess !");
    this.hCr.hCp = paramString;
    this.hCr.hBV = "ok";
    JsApiOperateWXData.OperateWXDataTask.a(this.hCr);
    AppMethodBeat.o(130876);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.1
 * JD-Core Version:    0.6.2
 */
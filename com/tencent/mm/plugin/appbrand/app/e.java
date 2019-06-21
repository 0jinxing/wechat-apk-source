package com.tencent.mm.plugin.appbrand.app;

import a.f.b.j;
import a.l;
import android.annotation.SuppressLint;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.ci.g;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event;
import com.tencent.mm.vending.c.a;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/app/ServiceForWebViewAnyProcess;", "Lcom/tencent/mm/plugin/appbrand/app/ServiceForWebView;", "()V", "batchSyncWxaAttr", "", "usernameList", "", "", "preloadEnv", "appId", "privateOpenWeappFunctionalPage", "uuid", "transferJson", "reportMiniProgramPageData", "Lcom/tencent/mm/vending/pipeline/Pipeline;", "", "sendDataToMiniProgram", "data", "webviewId", "BatchSyncWxaAttr", "PreloadCdnEnv", "PrivateOpenFunctionalPage", "SendDataToMiniProgram", "plugin-appbrand-integration_release"})
public final class e extends d
{
  @SuppressLint({"Recycle"})
  public final void ax(List<String> paramList)
  {
    AppMethodBeat.i(134465);
    if (paramList == null)
      AppMethodBeat.o(134465);
    while (true)
    {
      return;
      Parcel localParcel = Parcel.obtain();
      localParcel.setDataPosition(0);
      localParcel.writeStringList(paramList);
      localParcel.setDataPosition(0);
      XIPCInvoker.a("com.tencent.mm", localParcel, e.a.class);
      localParcel.recycle();
      AppMethodBeat.o(134465);
    }
  }

  public final void bq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(134466);
    if (paramString2 == null)
      AppMethodBeat.o(134466);
    while (true)
    {
      return;
      if (paramString1 == null)
      {
        AppMethodBeat.o(134466);
      }
      else
      {
        Parcel localParcel = Parcel.obtain();
        localParcel.setDataPosition(0);
        localParcel.writeString(paramString1);
        localParcel.writeString(paramString2);
        localParcel.setDataPosition(0);
        XIPCInvoker.a("com.tencent.mm", localParcel, e.c.class);
        localParcel.recycle();
        AppMethodBeat.o(134466);
      }
    }
  }

  public final void i(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(134464);
    SendDataToMiniProgramFromH5Event localSendDataToMiniProgramFromH5Event = new SendDataToMiniProgramFromH5Event();
    localSendDataToMiniProgramFromH5Event.hJW = paramString1;
    localSendDataToMiniProgramFromH5Event.data = paramString2;
    localSendDataToMiniProgramFromH5Event.hJX = paramInt;
    XIPCInvoker.a("com.tencent.mm", localSendDataToMiniProgramFromH5Event, e.d.class, null);
    AppMethodBeat.o(134464);
  }

  public final com.tencent.mm.vending.g.e<Integer> xk(String paramString)
  {
    AppMethodBeat.i(134462);
    paramString = g.dOW().b((a)e.gRi);
    j.o(paramString, "pipelineExt().`$ui` {\n  …turn@`$ui` null\n        }");
    paramString = (com.tencent.mm.vending.g.e)paramString;
    AppMethodBeat.o(134462);
    return paramString;
  }

  public final void xl(String paramString)
  {
    AppMethodBeat.i(134463);
    XIPCInvoker.a("com.tencent.mm", new IPCString(paramString), e.b.class, null);
    AppMethodBeat.o(134463);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"})
  static final class e<_Ret, _Var>
    implements a<_Ret, _Var>
  {
    public static final e gRi;

    static
    {
      AppMethodBeat.i(134461);
      gRi = new e();
      AppMethodBeat.o(134461);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.e
 * JD-Core Version:    0.6.2
 */
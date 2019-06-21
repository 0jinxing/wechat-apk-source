package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.modelsimple.h;

final class JsApiScanCode$GetA8KeyTask$1
  implements w.a
{
  JsApiScanCode$GetA8KeyTask$1(JsApiScanCode.GetA8KeyTask paramGetA8KeyTask, h paramh)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(130557);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.hyP.actionCode = -1;
      JsApiScanCode.GetA8KeyTask.a(this.hyP);
      AppMethodBeat.o(130557);
      return 0;
    }
    this.hyP.actionCode = this.hyO.aiV();
    switch (this.hyP.actionCode)
    {
    default:
    case 26:
    }
    for (this.hyP.hyM = ""; ; this.hyP.hyM = this.hyO.aiT())
    {
      JsApiScanCode.GetA8KeyTask.b(this.hyP);
      AppMethodBeat.o(130557);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiScanCode.GetA8KeyTask.1
 * JD-Core Version:    0.6.2
 */
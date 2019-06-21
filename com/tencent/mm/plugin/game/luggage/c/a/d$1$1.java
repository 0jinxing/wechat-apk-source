package com.tencent.mm.plugin.game.luggage.c.a;

import com.tencent.luggage.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask;
import org.json.JSONObject;

final class d$1$1 extends c
{
  d$1$1(d.1 param1)
  {
  }

  public final String name()
  {
    return "onAddShortcutStatus";
  }

  public final JSONObject wQ()
  {
    AppMethodBeat.i(135897);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("success", this.mUt.mUq.success);
      label30: AppMethodBeat.o(135897);
      return localJSONObject;
    }
    catch (Exception localException)
    {
      break label30;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.d.1.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.luggage.bridge;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class n
{
  private o bOA;
  private Handler bOB;

  n(o paramo)
  {
    AppMethodBeat.i(90732);
    this.bOA = paramo;
    paramo = new HandlerThread("AsyncJSThread");
    paramo.start();
    this.bOB = new Handler(paramo.getLooper());
    AppMethodBeat.o(90732);
  }

  private static m bv(String paramString)
  {
    AppMethodBeat.i(90735);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = new com/tencent/luggage/bridge/m;
      paramString.<init>(localJSONObject);
      AppMethodBeat.o(90735);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        d.e("Js2JavaMessageQueue", "Message parse failed, ex = %s", new Object[] { paramString.getMessage() });
        paramString = null;
        AppMethodBeat.o(90735);
      }
    }
  }

  final String h(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(90733);
    if (paramBoolean)
    {
      paramString = i(paramString, true);
      AppMethodBeat.o(90733);
    }
    while (true)
    {
      return paramString;
      this.bOB.post(new n.1(this, paramString));
      paramString = "";
      AppMethodBeat.o(90733);
    }
  }

  final String i(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(90734);
    Object localObject = bv(paramString);
    if (localObject == null)
    {
      paramString = "";
      AppMethodBeat.o(90734);
    }
    while (true)
    {
      return paramString;
      d.i("Js2JavaMessageQueue", "processImpl, jsMsg.type = %s", new Object[] { ((m)localObject).wJ().name() });
      paramString = null;
      switch (n.2.bOE[localObject.wJ().ordinal()])
      {
      default:
        label88: if (paramString != null)
          break;
      case 1:
      case 2:
      case 3:
      case 4:
      }
      for (localObject = "null"; ; localObject = paramString.wJ().name())
      {
        d.v("Js2JavaMessageQueue", "processImpl, javaMsg.type = %s", new Object[] { localObject });
        if (paramString != null)
          break label184;
        paramString = "";
        AppMethodBeat.o(90734);
        break;
        this.bOA.bOH.wL();
        break label88;
        paramString = this.bOA.a((m)localObject, paramBoolean);
        break label88;
        this.bOA.a((m)localObject);
        break label88;
        this.bOA.b((m)localObject);
        break label88;
      }
      label184: paramString = paramString.toString();
      AppMethodBeat.o(90734);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.n
 * JD-Core Version:    0.6.2
 */
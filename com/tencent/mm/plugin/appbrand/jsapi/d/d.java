package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.d.e;
import com.tencent.mm.plugin.appbrand.widget.input.i;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class d extends h
{
  private static final int CTRL_INDEX = 110;
  private static final String NAME = "insertTextArea";

  protected final i a(WeakReference<u> paramWeakReference, String paramString, int paramInt)
  {
    AppMethodBeat.i(123537);
    paramWeakReference = new d.2(this, paramWeakReference, paramInt, paramString);
    AppMethodBeat.o(123537);
    return paramWeakReference;
  }

  public final void a(u paramu, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(123534);
    super.a(paramu, paramJSONObject, paramInt);
    AppMethodBeat.o(123534);
  }

  protected final void a(i parami)
  {
    AppMethodBeat.i(123536);
    super.a(parami);
    parami.jdL = new d.1(this, parami);
    AppMethodBeat.o(123536);
  }

  protected final boolean a(e parame, JSONObject paramJSONObject, u paramu, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(123535);
    if (!super.a(parame, paramJSONObject, paramu, paramInt))
      AppMethodBeat.o(123535);
    while (true)
    {
      return bool;
      parame.jjF = Boolean.TRUE;
      parame.jjj = "emoji";
      parame.jjk = false;
      parame.jjl = false;
      parame.jjL = Boolean.FALSE;
      parame.jjG = Boolean.valueOf(paramJSONObject.optBoolean("confirm", true));
      AppMethodBeat.o(123535);
      bool = true;
    }
  }

  protected final boolean aDy()
  {
    return false;
  }

  protected final boolean aDz()
  {
    return false;
  }

  static final class a extends p
  {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onTextAreaHeightChange";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.d
 * JD-Core Version:    0.6.2
 */
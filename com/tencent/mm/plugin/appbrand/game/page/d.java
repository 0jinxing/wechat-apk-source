package com.tencent.mm.plugin.appbrand.game.page;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.sdk.platformtools.ab;

@SuppressLint({"ViewConstructor"})
public final class d extends n
{
  private f hsH;
  private String mURL;

  public d(Context paramContext, e parame)
  {
    super(paramContext, parame);
    AppMethodBeat.i(130218);
    ab.i("MicroMsg.WAGamePage", "hy: WAGamePage on create");
    AppMethodBeat.o(130218);
  }

  public final boolean Ay(String paramString)
  {
    return true;
  }

  public final View aAQ()
  {
    AppMethodBeat.i(130219);
    Object localObject = new f(getContext(), getContainer().getRuntime());
    this.hsH = ((f)localObject);
    localObject = ((f)localObject).hsL;
    AppMethodBeat.o(130219);
    return localObject;
  }

  public final void aAR()
  {
    AppMethodBeat.i(130223);
    super.aAR();
    this.hsH.onDestroy();
    AppMethodBeat.o(130223);
  }

  public final void aAS()
  {
    AppMethodBeat.i(130224);
    super.aAS();
    this.hsH.wU();
    AppMethodBeat.o(130224);
  }

  public final void aAT()
  {
    AppMethodBeat.i(130225);
    super.aAT();
    this.hsH.wW();
    AppMethodBeat.o(130225);
  }

  public final void b(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(130221);
    this.hsH.h(paramString1, paramString2, 0);
    AppMethodBeat.o(130221);
  }

  public final void cleanup()
  {
    AppMethodBeat.i(130222);
    super.cleanup();
    this.hsH.cleanup();
    AppMethodBeat.o(130222);
  }

  public final f getCurrentPageView()
  {
    return this.hsH;
  }

  public final String getCurrentUrl()
  {
    return this.mURL;
  }

  public final void loadUrl(String paramString)
  {
    AppMethodBeat.i(130220);
    this.mURL = paramString;
    this.hsH.AA(paramString);
    AppMethodBeat.o(130220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.d
 * JD-Core Version:    0.6.2
 */
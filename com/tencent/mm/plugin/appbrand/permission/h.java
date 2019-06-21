package com.tencent.mm.plugin.appbrand.permission;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;

public class h
  implements f
{
  protected final i gPI;

  public h(i parami)
  {
    this.gPI = parami;
  }

  public void Dq(String paramString)
  {
    AppMethodBeat.i(102303);
    Toast.makeText(this.gPI.getContext(), String.format("jsapi banned %s", new Object[] { paramString }), 0).show();
    AppMethodBeat.o(102303);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.h
 * JD-Core Version:    0.6.2
 */
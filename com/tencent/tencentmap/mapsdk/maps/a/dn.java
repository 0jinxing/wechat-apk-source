package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dn extends dk
  implements el
{
  private cl a;
  private List<Object> b;

  public dn()
  {
    AppMethodBeat.i(98724);
    this.a = new cl();
    this.b = new ArrayList();
    bt.j().post(new do(this));
    AppMethodBeat.o(98724);
  }

  private void a()
  {
    try
    {
      AppMethodBeat.i(98728);
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
        localIterator.next();
    }
    finally
    {
    }
    AppMethodBeat.o(98728);
  }

  public final String a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(98727);
    paramString1 = this.a.a(paramString1, paramInt, paramString2, paramString3, paramString4, paramString5);
    AppMethodBeat.o(98727);
    return paramString1;
  }

  public final void a(String paramString1, String arg2)
  {
    AppMethodBeat.i(98726);
    if ((!TextUtils.isEmpty(???)) && (!ds.a().b().equals(???)))
      ds.a().a(???, true);
    if (!TextUtils.isEmpty(paramString1));
    synchronized (this.a)
    {
      this.a.b();
      this.a.a(paramString1);
      er.a("settings_in_client", this.a.a(), true);
      a();
      AppMethodBeat.o(98726);
      return;
    }
  }

  public final String b()
  {
    return "settings";
  }

  public final void c()
  {
    AppMethodBeat.i(98725);
    en.d().b();
    AppMethodBeat.o(98725);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.dn
 * JD-Core Version:    0.6.2
 */
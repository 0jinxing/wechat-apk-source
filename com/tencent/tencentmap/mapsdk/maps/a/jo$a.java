package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

class jo$a extends Thread
{
  private final WeakReference<jo> a;
  private final String b;
  private final int c;

  public jo$a(jo paramjo, String paramString, int paramInt)
  {
    AppMethodBeat.i(100074);
    this.a = new WeakReference(paramjo);
    this.b = paramString;
    this.c = paramInt;
    AppMethodBeat.o(100074);
  }

  public void run()
  {
    AppMethodBeat.i(100075);
    if ((this.a != null) && (this.a.get() != null))
    {
      jo localjo = (jo)this.a.get();
      jo.a(localjo, this.b, this.c);
      jo.a(localjo);
    }
    AppMethodBeat.o(100075);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jo.a
 * JD-Core Version:    0.6.2
 */
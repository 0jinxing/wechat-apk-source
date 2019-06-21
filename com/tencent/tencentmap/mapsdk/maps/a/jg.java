package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.a;
import com.tencent.map.lib.b;
import com.tencent.map.lib.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class jg
  implements a
{
  private gx a;
  private hf b;
  private b c;

  public jg(iz paramiz, String paramString)
  {
    AppMethodBeat.i(100032);
    this.a = new ji(paramiz.i(), paramString);
    this.b = new jf(paramiz);
    this.c = new jh(paramiz.i(), paramString);
    AppMethodBeat.o(100032);
  }

  public gx a()
  {
    return this.a;
  }

  public hf b()
  {
    return this.b;
  }

  public b c()
  {
    return this.c;
  }

  public c d()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jg
 * JD-Core Version:    0.6.2
 */
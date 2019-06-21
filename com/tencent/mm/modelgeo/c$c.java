package com.tencent.mm.modelgeo;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$c
{
  double lat;
  double lng;
  Object tag = "";

  public c$c(c paramc, double paramDouble1, double paramDouble2, Object paramObject)
  {
    this.lat = paramDouble1;
    this.lng = paramDouble2;
    this.tag = paramObject;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(78109);
    boolean bool;
    if ((paramObject == null) || (!(paramObject instanceof c)))
    {
      bool = false;
      AppMethodBeat.o(78109);
    }
    while (true)
    {
      return bool;
      bool = ((c)paramObject).toString().equals(toString());
      AppMethodBeat.o(78109);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(78108);
    StringBuilder localStringBuilder = new StringBuilder().append((int)(this.lat * 1000000.0D)).append((int)(this.lng * 1000000.0D));
    String str;
    if (this.tag == null)
      str = "";
    while (true)
    {
      str = str;
      AppMethodBeat.o(78108);
      return str;
      if (((this.tag instanceof Integer)) || ((this.tag instanceof Long)) || ((this.tag instanceof Double)) || ((this.tag instanceof Float)) || ((this.tag instanceof String)))
        str = this.tag;
      else
        str = this.tag.toString();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.c.c
 * JD-Core Version:    0.6.2
 */
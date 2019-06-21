package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  public String cvZ = "";
  public int id = 0;
  public int tYc = 0;
  f.a tYd;
  public String talker = "";

  protected final Object clone()
  {
    AppMethodBeat.i(26330);
    f localf = new f();
    localf.id = this.id;
    localf.talker = this.talker;
    localf.cvZ = this.cvZ;
    localf.tYc = this.tYc;
    localf.tYd = this.tYd;
    AppMethodBeat.o(26330);
    return localf;
  }

  public final String toString()
  {
    AppMethodBeat.i(26331);
    String str = "WearNotification [talker=" + this.talker + ", id=" + this.id + ", md5=" + this.cvZ + ", ignoreInWatch=" + this.tYc + ", status=" + this.tYd + "]";
    AppMethodBeat.o(26331);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f
 * JD-Core Version:    0.6.2
 */
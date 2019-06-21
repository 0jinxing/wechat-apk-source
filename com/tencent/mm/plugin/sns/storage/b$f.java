package com.tencent.mm.plugin.sns.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class b$f
{
  public String qVu;
  public ArrayList<b.g> qVv;

  public b$f(b paramb)
  {
    AppMethodBeat.i(36904);
    this.qVu = "";
    this.qVv = new ArrayList();
    AppMethodBeat.o(36904);
  }

  public final String Dl(int paramInt)
  {
    AppMethodBeat.i(36905);
    String str;
    if ((paramInt >= 0) && (paramInt < this.qVv.size()))
    {
      str = ((b.g)this.qVv.get(paramInt)).qVy;
      AppMethodBeat.o(36905);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(36905);
    }
  }

  public final String Dm(int paramInt)
  {
    AppMethodBeat.i(36906);
    String str;
    if ((paramInt >= 0) && (paramInt < this.qVv.size()))
    {
      str = ((b.g)this.qVv.get(paramInt)).title;
      AppMethodBeat.o(36906);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(36906);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.b.f
 * JD-Core Version:    0.6.2
 */
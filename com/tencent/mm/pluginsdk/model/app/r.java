package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class r
{
  public String appId;
  public int fOZ;

  public r(String paramString, int paramInt)
  {
    this.appId = paramString;
    this.fOZ = paramInt;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(79360);
    if (paramObject == null)
      AppMethodBeat.o(79360);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof r))
      {
        AppMethodBeat.o(79360);
      }
      else
      {
        paramObject = (r)paramObject;
        if ((paramObject.appId.equals(this.appId)) && (paramObject.fOZ == this.fOZ))
        {
          bool = true;
          AppMethodBeat.o(79360);
        }
        else
        {
          AppMethodBeat.o(79360);
        }
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(79361);
    String str = this.appId + this.fOZ;
    AppMethodBeat.o(79361);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.r
 * JD-Core Version:    0.6.2
 */
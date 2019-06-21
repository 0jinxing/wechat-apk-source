package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class t extends a
{
  public int BVF = 0;

  public t()
  {
    this.BUz = 282;
  }

  public final Boolean emH()
  {
    AppMethodBeat.i(96503);
    Boolean localBoolean;
    if (this.BVj < 5)
    {
      localBoolean = Boolean.FALSE;
      AppMethodBeat.o(96503);
    }
    while (true)
    {
      return localBoolean;
      int i = util.ae(this.BUt, this.BVi + 2 + 1 + 1);
      if (this.BVj < i + 5)
      {
        localBoolean = Boolean.FALSE;
        AppMethodBeat.o(96503);
      }
      else
      {
        this.BVF = i;
        localBoolean = Boolean.TRUE;
        AppMethodBeat.o(96503);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.t
 * JD-Core Version:    0.6.2
 */
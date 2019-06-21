package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class ad extends a
{
  public int BVL = 0;

  public ad()
  {
    this.BUz = 312;
  }

  public final Boolean emH()
  {
    AppMethodBeat.i(96477);
    Boolean localBoolean;
    if (this.BVj < 4)
    {
      localBoolean = Boolean.FALSE;
      AppMethodBeat.o(96477);
    }
    while (true)
    {
      return localBoolean;
      this.BVL = util.ag(this.BUt, this.BVi);
      if (this.BVj < this.BVL * 10 + 4)
      {
        localBoolean = Boolean.FALSE;
        AppMethodBeat.o(96477);
      }
      else
      {
        localBoolean = Boolean.TRUE;
        AppMethodBeat.o(96477);
      }
    }
  }

  public final int emJ()
  {
    int i = 0;
    AppMethodBeat.i(96478);
    for (int j = 0; ; j++)
    {
      if (j >= this.BVL)
      {
        AppMethodBeat.o(96478);
        j = i;
      }
      while (true)
      {
        return j;
        if (util.af(this.BUt, this.BVi + 4 + j * 10) != 266)
          break;
        j = util.ag(this.BUt, j * 10 + (this.BVi + 4) + 2);
        AppMethodBeat.o(96478);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.ad
 * JD-Core Version:    0.6.2
 */
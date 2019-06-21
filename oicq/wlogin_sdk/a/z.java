package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class z extends a
{
  public int BVH = 0;
  public int BVI = 0;

  public z()
  {
    this.BUz = 293;
  }

  public final Boolean emH()
  {
    AppMethodBeat.i(96476);
    Boolean localBoolean;
    if (this.BVj < 2)
    {
      localBoolean = Boolean.FALSE;
      AppMethodBeat.o(96476);
    }
    while (true)
    {
      return localBoolean;
      this.BVH = util.af(this.BUt, this.BVi);
      if (this.BVj < this.BVH + 2 + 2)
      {
        localBoolean = Boolean.FALSE;
        AppMethodBeat.o(96476);
      }
      else
      {
        this.BVI = util.af(this.BUt, this.BVi + 2 + this.BVH);
        localBoolean = Boolean.TRUE;
        AppMethodBeat.o(96476);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.z
 * JD-Core Version:    0.6.2
 */
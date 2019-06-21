package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class g extends a
{
  public int BVt = 0;
  public int BVu = 0;
  public int BVv = 0;
  public int BVw = 0;

  public g()
  {
    this.BUz = 261;
  }

  public final Boolean emH()
  {
    AppMethodBeat.i(96469);
    Boolean localBoolean;
    if (this.BVj < 2)
    {
      localBoolean = Boolean.FALSE;
      AppMethodBeat.o(96469);
    }
    while (true)
    {
      return localBoolean;
      this.BVu = util.af(this.BUt, this.BVi);
      if (this.BVj < this.BVu + 2 + 2)
      {
        localBoolean = Boolean.FALSE;
        AppMethodBeat.o(96469);
      }
      else
      {
        this.BVt = util.af(this.BUt, this.BVi + 2 + this.BVu);
        if (this.BVj < this.BVu + 2 + 2 + this.BVt)
        {
          localBoolean = Boolean.FALSE;
          AppMethodBeat.o(96469);
        }
        else
        {
          this.BVw = (this.BVi + 2);
          this.BVv = (this.BVu + 2 + 2 + this.BVi);
          localBoolean = Boolean.TRUE;
          AppMethodBeat.o(96469);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.g
 * JD-Core Version:    0.6.2
 */
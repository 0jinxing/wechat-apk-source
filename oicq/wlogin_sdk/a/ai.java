package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class ai extends a
{
  public int BVQ = 0;
  public int BVR = 0;
  public int BVS = 0;

  public ai()
  {
    this.BUz = 326;
  }

  public final Boolean emH()
  {
    AppMethodBeat.i(96472);
    Boolean localBoolean;
    if (this.BVj < 12)
    {
      localBoolean = Boolean.FALSE;
      AppMethodBeat.o(96472);
    }
    while (true)
    {
      return localBoolean;
      int i = util.af(this.BUt, this.BVi + 4);
      if (this.BVj < i + 12)
      {
        localBoolean = Boolean.FALSE;
        AppMethodBeat.o(96472);
      }
      else
      {
        this.BVQ = i;
        i = util.af(this.BUt, this.BVi + 6 + this.BVQ);
        if (this.BVj < this.BVQ + 12 + i)
        {
          localBoolean = Boolean.FALSE;
          AppMethodBeat.o(96472);
        }
        else
        {
          this.BVR = i;
          i = util.af(this.BUt, this.BVi + 10 + this.BVQ + this.BVR);
          if (this.BVj < this.BVQ + 12 + this.BVR + i)
          {
            localBoolean = Boolean.FALSE;
            AppMethodBeat.o(96472);
          }
          else
          {
            this.BVS = i;
            localBoolean = Boolean.TRUE;
            AppMethodBeat.o(96472);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.ai
 * JD-Core Version:    0.6.2
 */
package oicq.wlogin_sdk.request;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.a.a;
import oicq.wlogin_sdk.a.f;
import oicq.wlogin_sdk.a.g;

public final class h extends d
{
  public h(i parami)
  {
    this.BUz = 2064;
    this.BUA = 3;
    this.BUC = parami;
  }

  public final int I(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(96437);
    f localf = new f();
    g localg = new g();
    paramInt2 = super.ab(paramArrayOfByte, paramInt1 + 2);
    super.emD();
    int i = paramInt1 + 5;
    switch (paramInt2)
    {
    case 3:
    case 4:
    default:
      H(paramArrayOfByte, i, this.BUo - i - 1);
      paramInt1 = paramInt2;
    case 2:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(96437);
      return paramInt1;
      int j = localf.L(paramArrayOfByte, i, this.BUo - i);
      paramInt1 = j;
      if (j >= 0)
      {
        this.BUC.BUH = localf;
        j = localg.L(paramArrayOfByte, i, this.BUo - i);
        paramInt1 = j;
        if (j >= 0)
        {
          this.BUC.BUI = localg;
          paramInt1 = paramInt2;
          continue;
          super.H(paramArrayOfByte, i, this.BUo - i - 1);
          paramInt1 = paramInt2;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.request.h
 * JD-Core Version:    0.6.2
 */
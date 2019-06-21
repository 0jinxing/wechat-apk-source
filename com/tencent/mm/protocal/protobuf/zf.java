package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zf extends com.tencent.mm.bt.a
{
  public int weA;
  public int weB;
  public int weC;
  public String weD;
  public int weE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73648);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.weA);
      paramArrayOfObject.iz(2, this.weB);
      paramArrayOfObject.iz(3, this.weC);
      if (this.weD != null)
        paramArrayOfObject.e(4, this.weD);
      paramArrayOfObject.iz(5, this.weE);
      AppMethodBeat.o(73648);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.weA) + 0 + e.a.a.b.b.a.bs(2, this.weB) + e.a.a.b.b.a.bs(3, this.weC);
        paramInt = i;
        if (this.weD != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.weD);
        paramInt += e.a.a.b.b.a.bs(5, this.weE);
        AppMethodBeat.o(73648);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73648);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        zf localzf = (zf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73648);
          break;
        case 1:
          localzf.weA = locala.BTU.vd();
          AppMethodBeat.o(73648);
          paramInt = 0;
          break;
        case 2:
          localzf.weB = locala.BTU.vd();
          AppMethodBeat.o(73648);
          paramInt = 0;
          break;
        case 3:
          localzf.weC = locala.BTU.vd();
          AppMethodBeat.o(73648);
          paramInt = 0;
          break;
        case 4:
          localzf.weD = locala.BTU.readString();
          AppMethodBeat.o(73648);
          paramInt = 0;
          break;
        case 5:
          localzf.weE = locala.BTU.vd();
          AppMethodBeat.o(73648);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(73648);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.zf
 * JD-Core Version:    0.6.2
 */
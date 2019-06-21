package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cpy extends com.tencent.mm.bt.a
{
  public int xnY;
  public int xnZ;
  public int xoa;
  public int xob;
  public int xoc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(5264);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xnY);
      paramArrayOfObject.iz(2, this.xnZ);
      paramArrayOfObject.iz(3, this.xoa);
      paramArrayOfObject.iz(4, this.xob);
      paramArrayOfObject.iz(5, this.xoc);
      AppMethodBeat.o(5264);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.xnY) + 0 + e.a.a.b.b.a.bs(2, this.xnZ) + e.a.a.b.b.a.bs(3, this.xoa) + e.a.a.b.b.a.bs(4, this.xob) + e.a.a.b.b.a.bs(5, this.xoc);
        AppMethodBeat.o(5264);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5264);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cpy localcpy = (cpy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5264);
          break;
        case 1:
          localcpy.xnY = locala.BTU.vd();
          AppMethodBeat.o(5264);
          paramInt = 0;
          break;
        case 2:
          localcpy.xnZ = locala.BTU.vd();
          AppMethodBeat.o(5264);
          paramInt = 0;
          break;
        case 3:
          localcpy.xoa = locala.BTU.vd();
          AppMethodBeat.o(5264);
          paramInt = 0;
          break;
        case 4:
          localcpy.xob = locala.BTU.vd();
          AppMethodBeat.o(5264);
          paramInt = 0;
          break;
        case 5:
          localcpy.xoc = locala.BTU.vd();
          AppMethodBeat.o(5264);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(5264);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpy
 * JD-Core Version:    0.6.2
 */
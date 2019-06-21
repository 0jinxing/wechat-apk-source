package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class auo extends com.tencent.mm.bt.a
{
  public int key;
  public int length;
  public long wyJ;
  public int wyK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28535);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.key);
      paramArrayOfObject.ai(2, this.wyJ);
      paramArrayOfObject.iz(3, this.length);
      paramArrayOfObject.iz(4, this.wyK);
      AppMethodBeat.o(28535);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.key) + 0 + e.a.a.b.b.a.o(2, this.wyJ) + e.a.a.b.b.a.bs(3, this.length) + e.a.a.b.b.a.bs(4, this.wyK);
        AppMethodBeat.o(28535);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28535);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        auo localauo = (auo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28535);
          break;
        case 1:
          localauo.key = locala.BTU.vd();
          AppMethodBeat.o(28535);
          paramInt = 0;
          break;
        case 2:
          localauo.wyJ = locala.BTU.ve();
          AppMethodBeat.o(28535);
          paramInt = 0;
          break;
        case 3:
          localauo.length = locala.BTU.vd();
          AppMethodBeat.o(28535);
          paramInt = 0;
          break;
        case 4:
          localauo.wyK = locala.BTU.vd();
          AppMethodBeat.o(28535);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28535);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.auo
 * JD-Core Version:    0.6.2
 */
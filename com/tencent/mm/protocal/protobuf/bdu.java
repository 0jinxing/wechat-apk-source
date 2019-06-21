package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bdu extends com.tencent.mm.bt.a
{
  public int wHA;
  public int wHB;
  public String wHw;
  public String wHx;
  public int wHy;
  public int wHz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58915);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wHw != null)
        paramArrayOfObject.e(1, this.wHw);
      if (this.wHx != null)
        paramArrayOfObject.e(2, this.wHx);
      paramArrayOfObject.iz(3, this.wHy);
      paramArrayOfObject.iz(4, this.wHz);
      paramArrayOfObject.iz(5, this.wHA);
      paramArrayOfObject.iz(7, this.wHB);
      AppMethodBeat.o(58915);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wHw == null)
        break label478;
    label478: for (paramInt = e.a.a.b.b.a.f(1, this.wHw) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wHx != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wHx);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wHy) + e.a.a.b.b.a.bs(4, this.wHz) + e.a.a.b.b.a.bs(5, this.wHA) + e.a.a.b.b.a.bs(7, this.wHB);
      AppMethodBeat.o(58915);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58915);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bdu localbdu = (bdu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 6:
        default:
          paramInt = -1;
          AppMethodBeat.o(58915);
          break;
        case 1:
          localbdu.wHw = locala.BTU.readString();
          AppMethodBeat.o(58915);
          paramInt = i;
          break;
        case 2:
          localbdu.wHx = locala.BTU.readString();
          AppMethodBeat.o(58915);
          paramInt = i;
          break;
        case 3:
          localbdu.wHy = locala.BTU.vd();
          AppMethodBeat.o(58915);
          paramInt = i;
          break;
        case 4:
          localbdu.wHz = locala.BTU.vd();
          AppMethodBeat.o(58915);
          paramInt = i;
          break;
        case 5:
          localbdu.wHA = locala.BTU.vd();
          AppMethodBeat.o(58915);
          paramInt = i;
          break;
        case 7:
          localbdu.wHB = locala.BTU.vd();
          AppMethodBeat.o(58915);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58915);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bdu
 * JD-Core Version:    0.6.2
 */
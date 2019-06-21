package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class om extends com.tencent.mm.bt.a
{
  public String vUO;
  public String vUP;
  public int vUQ;
  public int vUR;
  public int vUS;
  public int vUT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96210);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vUO != null)
        paramArrayOfObject.e(1, this.vUO);
      if (this.vUP != null)
        paramArrayOfObject.e(2, this.vUP);
      paramArrayOfObject.iz(3, this.vUQ);
      paramArrayOfObject.iz(4, this.vUR);
      paramArrayOfObject.iz(5, this.vUS);
      paramArrayOfObject.iz(6, this.vUT);
      AppMethodBeat.o(96210);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vUO == null)
        break label474;
    label474: for (paramInt = e.a.a.b.b.a.f(1, this.vUO) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vUP != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vUP);
      paramInt = i + e.a.a.b.b.a.bs(3, this.vUQ) + e.a.a.b.b.a.bs(4, this.vUR) + e.a.a.b.b.a.bs(5, this.vUS) + e.a.a.b.b.a.bs(6, this.vUT);
      AppMethodBeat.o(96210);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96210);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        om localom = (om)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96210);
          break;
        case 1:
          localom.vUO = locala.BTU.readString();
          AppMethodBeat.o(96210);
          paramInt = i;
          break;
        case 2:
          localom.vUP = locala.BTU.readString();
          AppMethodBeat.o(96210);
          paramInt = i;
          break;
        case 3:
          localom.vUQ = locala.BTU.vd();
          AppMethodBeat.o(96210);
          paramInt = i;
          break;
        case 4:
          localom.vUR = locala.BTU.vd();
          AppMethodBeat.o(96210);
          paramInt = i;
          break;
        case 5:
          localom.vUS = locala.BTU.vd();
          AppMethodBeat.o(96210);
          paramInt = i;
          break;
        case 6:
          localom.vUT = locala.BTU.vd();
          AppMethodBeat.o(96210);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96210);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.om
 * JD-Core Version:    0.6.2
 */
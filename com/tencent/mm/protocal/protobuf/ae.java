package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ae extends com.tencent.mm.bt.a
{
  public String vBj;
  public int vBk;
  public int vBl;
  public int vBm;
  public int vBn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(72837);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vBj != null)
        paramArrayOfObject.e(1, this.vBj);
      paramArrayOfObject.iz(2, this.vBk);
      paramArrayOfObject.iz(3, this.vBl);
      paramArrayOfObject.iz(4, this.vBm);
      paramArrayOfObject.iz(5, this.vBn);
      AppMethodBeat.o(72837);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vBj == null)
        break label411;
    label411: for (paramInt = e.a.a.b.b.a.f(1, this.vBj) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.vBk) + e.a.a.b.b.a.bs(3, this.vBl) + e.a.a.b.b.a.bs(4, this.vBm) + e.a.a.b.b.a.bs(5, this.vBn);
      AppMethodBeat.o(72837);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72837);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ae localae = (ae)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72837);
          break;
        case 1:
          localae.vBj = locala.BTU.readString();
          AppMethodBeat.o(72837);
          paramInt = i;
          break;
        case 2:
          localae.vBk = locala.BTU.vd();
          AppMethodBeat.o(72837);
          paramInt = i;
          break;
        case 3:
          localae.vBl = locala.BTU.vd();
          AppMethodBeat.o(72837);
          paramInt = i;
          break;
        case 4:
          localae.vBm = locala.BTU.vd();
          AppMethodBeat.o(72837);
          paramInt = i;
          break;
        case 5:
          localae.vBn = locala.BTU.vd();
          AppMethodBeat.o(72837);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(72837);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ae
 * JD-Core Version:    0.6.2
 */
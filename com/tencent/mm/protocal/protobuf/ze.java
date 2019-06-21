package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ze extends com.tencent.mm.bt.a
{
  public String Name;
  public String PriceType;
  public int ndE;
  public int vQt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56778);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Name != null)
        paramArrayOfObject.e(1, this.Name);
      paramArrayOfObject.iz(2, this.vQt);
      if (this.PriceType != null)
        paramArrayOfObject.e(3, this.PriceType);
      paramArrayOfObject.iz(4, this.ndE);
      AppMethodBeat.o(56778);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Name == null)
        break label384;
    label384: for (paramInt = e.a.a.b.b.a.f(1, this.Name) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vQt);
      paramInt = i;
      if (this.PriceType != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.PriceType);
      paramInt += e.a.a.b.b.a.bs(4, this.ndE);
      AppMethodBeat.o(56778);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56778);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ze localze = (ze)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56778);
          break;
        case 1:
          localze.Name = locala.BTU.readString();
          AppMethodBeat.o(56778);
          paramInt = i;
          break;
        case 2:
          localze.vQt = locala.BTU.vd();
          AppMethodBeat.o(56778);
          paramInt = i;
          break;
        case 3:
          localze.PriceType = locala.BTU.readString();
          AppMethodBeat.o(56778);
          paramInt = i;
          break;
        case 4:
          localze.ndE = locala.BTU.vd();
          AppMethodBeat.o(56778);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56778);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ze
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class abp extends com.tencent.mm.bt.a
{
  public int bGt;
  public String rMJ;
  public String wiE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51416);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.rMJ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: tagName");
        AppMethodBeat.o(51416);
        throw paramArrayOfObject;
      }
      if (this.wiE == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: tagPinYin");
        AppMethodBeat.o(51416);
        throw paramArrayOfObject;
      }
      if (this.rMJ != null)
        paramArrayOfObject.e(1, this.rMJ);
      if (this.wiE != null)
        paramArrayOfObject.e(2, this.wiE);
      paramArrayOfObject.iz(3, this.bGt);
      AppMethodBeat.o(51416);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.rMJ == null)
        break label433;
    label433: for (paramInt = e.a.a.b.b.a.f(1, this.rMJ) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wiE != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wiE);
      paramInt = i + e.a.a.b.b.a.bs(3, this.bGt);
      AppMethodBeat.o(51416);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.rMJ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: tagName");
          AppMethodBeat.o(51416);
          throw paramArrayOfObject;
        }
        if (this.wiE == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: tagPinYin");
          AppMethodBeat.o(51416);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(51416);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abp localabp = (abp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51416);
          break;
        case 1:
          localabp.rMJ = locala.BTU.readString();
          AppMethodBeat.o(51416);
          paramInt = i;
          break;
        case 2:
          localabp.wiE = locala.BTU.readString();
          AppMethodBeat.o(51416);
          paramInt = i;
          break;
        case 3:
          localabp.bGt = locala.BTU.vd();
          AppMethodBeat.o(51416);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51416);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abp
 * JD-Core Version:    0.6.2
 */
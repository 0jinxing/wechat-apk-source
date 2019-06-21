package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class asa extends com.tencent.mm.bt.a
{
  public String nuQ;
  public String wcQ;
  public int wcR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102381);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcQ != null)
        paramArrayOfObject.e(1, this.wcQ);
      paramArrayOfObject.iz(2, this.wcR);
      if (this.nuQ != null)
        paramArrayOfObject.e(3, this.nuQ);
      AppMethodBeat.o(102381);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wcQ == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.wcQ) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wcR);
      paramInt = i;
      if (this.nuQ != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.nuQ);
      AppMethodBeat.o(102381);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102381);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        asa localasa = (asa)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102381);
          break;
        case 1:
          localasa.wcQ = locala.BTU.readString();
          AppMethodBeat.o(102381);
          paramInt = i;
          break;
        case 2:
          localasa.wcR = locala.BTU.vd();
          AppMethodBeat.o(102381);
          paramInt = i;
          break;
        case 3:
          localasa.nuQ = locala.BTU.readString();
          AppMethodBeat.o(102381);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102381);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.asa
 * JD-Core Version:    0.6.2
 */
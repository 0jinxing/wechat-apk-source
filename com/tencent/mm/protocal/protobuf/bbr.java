package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bbr extends com.tencent.mm.bt.a
{
  public String jBB;
  public String vEf;
  public String vXl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5596);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEf != null)
        paramArrayOfObject.e(1, this.vEf);
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      if (this.vXl != null)
        paramArrayOfObject.e(3, this.vXl);
      AppMethodBeat.o(5596);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vEf == null)
        break label366;
    label366: for (i = e.a.a.b.b.a.f(1, this.vEf) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jBB);
      i = paramInt;
      if (this.vXl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vXl);
      AppMethodBeat.o(5596);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5596);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bbr localbbr = (bbr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5596);
          break;
        case 1:
          localbbr.vEf = locala.BTU.readString();
          AppMethodBeat.o(5596);
          paramInt = i;
          break;
        case 2:
          localbbr.jBB = locala.BTU.readString();
          AppMethodBeat.o(5596);
          paramInt = i;
          break;
        case 3:
          localbbr.vXl = locala.BTU.readString();
          AppMethodBeat.o(5596);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5596);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbr
 * JD-Core Version:    0.6.2
 */
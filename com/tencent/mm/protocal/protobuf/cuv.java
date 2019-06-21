package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cuv extends com.tencent.mm.bt.a
{
  public String xqS;
  public String xqT;
  public String xqU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28763);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xqS == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Plugin");
        AppMethodBeat.o(28763);
        throw paramArrayOfObject;
      }
      if (this.xqT == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ActivityPath");
        AppMethodBeat.o(28763);
        throw paramArrayOfObject;
      }
      if (this.xqS != null)
        paramArrayOfObject.e(1, this.xqS);
      if (this.xqT != null)
        paramArrayOfObject.e(2, this.xqT);
      if (this.xqU != null)
        paramArrayOfObject.e(3, this.xqU);
      AppMethodBeat.o(28763);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xqS == null)
        break label466;
    label466: for (i = e.a.a.b.b.a.f(1, this.xqS) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xqT != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.xqT);
      i = paramInt;
      if (this.xqU != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.xqU);
      AppMethodBeat.o(28763);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xqS == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Plugin");
          AppMethodBeat.o(28763);
          throw paramArrayOfObject;
        }
        if (this.xqT == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ActivityPath");
          AppMethodBeat.o(28763);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28763);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cuv localcuv = (cuv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28763);
          break;
        case 1:
          localcuv.xqS = locala.BTU.readString();
          AppMethodBeat.o(28763);
          paramInt = i;
          break;
        case 2:
          localcuv.xqT = locala.BTU.readString();
          AppMethodBeat.o(28763);
          paramInt = i;
          break;
        case 3:
          localcuv.xqU = locala.BTU.readString();
          AppMethodBeat.o(28763);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28763);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cuv
 * JD-Core Version:    0.6.2
 */
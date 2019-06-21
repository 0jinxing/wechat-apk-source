package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cmg extends com.tencent.mm.bt.a
{
  public String guS;
  public String jBB;
  public String jCH;
  public String vEA;
  public String wbw;
  public String xkl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124372);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(124372);
        throw paramArrayOfObject;
      }
      if (this.xkl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MatchWord");
        AppMethodBeat.o(124372);
        throw paramArrayOfObject;
      }
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.xkl != null)
        paramArrayOfObject.e(2, this.xkl);
      if (this.jCH != null)
        paramArrayOfObject.e(3, this.jCH);
      if (this.wbw != null)
        paramArrayOfObject.e(4, this.wbw);
      if (this.guS != null)
        paramArrayOfObject.e(5, this.guS);
      if (this.vEA != null)
        paramArrayOfObject.e(6, this.vEA);
      AppMethodBeat.o(124372);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label642;
    label642: for (paramInt = e.a.a.b.b.a.f(1, this.jBB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xkl != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.xkl);
      paramInt = i;
      if (this.jCH != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.jCH);
      i = paramInt;
      if (this.wbw != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wbw);
      paramInt = i;
      if (this.guS != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.guS);
      i = paramInt;
      if (this.vEA != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vEA);
      AppMethodBeat.o(124372);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jBB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(124372);
          throw paramArrayOfObject;
        }
        if (this.xkl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MatchWord");
          AppMethodBeat.o(124372);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124372);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cmg localcmg = (cmg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124372);
          break;
        case 1:
          localcmg.jBB = locala.BTU.readString();
          AppMethodBeat.o(124372);
          paramInt = i;
          break;
        case 2:
          localcmg.xkl = locala.BTU.readString();
          AppMethodBeat.o(124372);
          paramInt = i;
          break;
        case 3:
          localcmg.jCH = locala.BTU.readString();
          AppMethodBeat.o(124372);
          paramInt = i;
          break;
        case 4:
          localcmg.wbw = locala.BTU.readString();
          AppMethodBeat.o(124372);
          paramInt = i;
          break;
        case 5:
          localcmg.guS = locala.BTU.readString();
          AppMethodBeat.o(124372);
          paramInt = i;
          break;
        case 6:
          localcmg.vEA = locala.BTU.readString();
          AppMethodBeat.o(124372);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124372);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cmg
 * JD-Core Version:    0.6.2
 */
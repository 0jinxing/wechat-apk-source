package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ctk extends com.tencent.mm.bt.a
{
  public String jBB;
  public String jCH;
  public int jCt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28718);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(28718);
        throw paramArrayOfObject;
      }
      if (this.jCH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(28718);
        throw paramArrayOfObject;
      }
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      paramArrayOfObject.iz(3, this.jCt);
      AppMethodBeat.o(28718);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label446;
    label446: for (paramInt = e.a.a.b.b.a.f(1, this.jBB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jCH != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jCH);
      paramInt = i + e.a.a.b.b.a.bs(3, this.jCt);
      AppMethodBeat.o(28718);
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
          AppMethodBeat.o(28718);
          throw paramArrayOfObject;
        }
        if (this.jCH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(28718);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28718);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ctk localctk = (ctk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28718);
          break;
        case 1:
          localctk.jBB = locala.BTU.readString();
          AppMethodBeat.o(28718);
          paramInt = i;
          break;
        case 2:
          localctk.jCH = locala.BTU.readString();
          AppMethodBeat.o(28718);
          paramInt = i;
          break;
        case 3:
          localctk.jCt = locala.BTU.vd();
          AppMethodBeat.o(28718);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28718);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ctk
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cts extends com.tencent.mm.bt.a
{
  public String jBB;
  public String jCH;
  public String ncM;
  public int ndE;
  public com.tencent.mm.bt.b xqr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28728);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: UserName");
        AppMethodBeat.o(28728);
        throw paramArrayOfObject;
      }
      if (this.jCH == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: NickName");
        AppMethodBeat.o(28728);
        throw paramArrayOfObject;
      }
      if (this.ncM == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Content");
        AppMethodBeat.o(28728);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.ndE);
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      if (this.jCH != null)
        paramArrayOfObject.e(3, this.jCH);
      if (this.ncM != null)
        paramArrayOfObject.e(4, this.ncM);
      if (this.xqr != null)
        paramArrayOfObject.c(5, this.xqr);
      AppMethodBeat.o(28728);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.ndE) + 0;
        paramInt = i;
        if (this.jBB != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.jBB);
        i = paramInt;
        if (this.jCH != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.jCH);
        paramInt = i;
        if (this.ncM != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.ncM);
        i = paramInt;
        if (this.xqr != null)
          i = paramInt + e.a.a.b.b.a.b(5, this.xqr);
        AppMethodBeat.o(28728);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jBB == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: UserName");
          AppMethodBeat.o(28728);
          throw paramArrayOfObject;
        }
        if (this.jCH == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: NickName");
          AppMethodBeat.o(28728);
          throw paramArrayOfObject;
        }
        if (this.ncM == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Content");
          AppMethodBeat.o(28728);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28728);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cts localcts = (cts)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28728);
          break;
        case 1:
          localcts.ndE = locala.BTU.vd();
          AppMethodBeat.o(28728);
          paramInt = 0;
          break;
        case 2:
          localcts.jBB = locala.BTU.readString();
          AppMethodBeat.o(28728);
          paramInt = 0;
          break;
        case 3:
          localcts.jCH = locala.BTU.readString();
          AppMethodBeat.o(28728);
          paramInt = 0;
          break;
        case 4:
          localcts.ncM = locala.BTU.readString();
          AppMethodBeat.o(28728);
          paramInt = 0;
          break;
        case 5:
          localcts.xqr = locala.BTU.emu();
          AppMethodBeat.o(28728);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28728);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cts
 * JD-Core Version:    0.6.2
 */
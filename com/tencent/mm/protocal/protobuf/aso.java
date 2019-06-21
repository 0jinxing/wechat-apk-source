package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aso extends com.tencent.mm.bt.a
{
  public int wwc;
  public com.tencent.mm.bt.b wwd;
  public com.tencent.mm.bt.b wwe;
  public com.tencent.mm.bt.b wwf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(5216);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wwd == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: SPSBuf");
        AppMethodBeat.o(5216);
        throw paramArrayOfObject;
      }
      if (this.wwe == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: PPSBuf");
        AppMethodBeat.o(5216);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wwc);
      if (this.wwd != null)
        paramArrayOfObject.c(2, this.wwd);
      if (this.wwe != null)
        paramArrayOfObject.c(3, this.wwe);
      if (this.wwf != null)
        paramArrayOfObject.c(4, this.wwf);
      AppMethodBeat.o(5216);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wwc) + 0;
        int i = paramInt;
        if (this.wwd != null)
          i = paramInt + e.a.a.b.b.a.b(2, this.wwd);
        paramInt = i;
        if (this.wwe != null)
          paramInt = i + e.a.a.b.b.a.b(3, this.wwe);
        i = paramInt;
        if (this.wwf != null)
          i = paramInt + e.a.a.b.b.a.b(4, this.wwf);
        AppMethodBeat.o(5216);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wwd == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: SPSBuf");
          AppMethodBeat.o(5216);
          throw paramArrayOfObject;
        }
        if (this.wwe == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: PPSBuf");
          AppMethodBeat.o(5216);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5216);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aso localaso = (aso)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5216);
          break;
        case 1:
          localaso.wwc = locala.BTU.vd();
          AppMethodBeat.o(5216);
          paramInt = 0;
          break;
        case 2:
          localaso.wwd = locala.BTU.emu();
          AppMethodBeat.o(5216);
          paramInt = 0;
          break;
        case 3:
          localaso.wwe = locala.BTU.emu();
          AppMethodBeat.o(5216);
          paramInt = 0;
          break;
        case 4:
          localaso.wwf = locala.BTU.emu();
          AppMethodBeat.o(5216);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(5216);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aso
 * JD-Core Version:    0.6.2
 */
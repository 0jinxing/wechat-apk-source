package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cuk extends com.tencent.mm.bt.a
{
  public int xcZ;
  public String xpw;
  public com.tencent.mm.bt.b xqL;
  public com.tencent.mm.bt.b xqM;
  public String xqN;
  public String xqO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28751);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xpw == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Msg");
        AppMethodBeat.o(28751);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.xcZ);
      if (this.xpw != null)
        paramArrayOfObject.e(2, this.xpw);
      if (this.xqL != null)
        paramArrayOfObject.c(3, this.xqL);
      if (this.xqM != null)
        paramArrayOfObject.c(4, this.xqM);
      if (this.xqN != null)
        paramArrayOfObject.e(5, this.xqN);
      if (this.xqO != null)
        paramArrayOfObject.e(6, this.xqO);
      AppMethodBeat.o(28751);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xcZ) + 0;
        paramInt = i;
        if (this.xpw != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.xpw);
        i = paramInt;
        if (this.xqL != null)
          i = paramInt + e.a.a.b.b.a.b(3, this.xqL);
        paramInt = i;
        if (this.xqM != null)
          paramInt = i + e.a.a.b.b.a.b(4, this.xqM);
        i = paramInt;
        if (this.xqN != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.xqN);
        paramInt = i;
        if (this.xqO != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.xqO);
        AppMethodBeat.o(28751);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xpw == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Msg");
          AppMethodBeat.o(28751);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28751);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cuk localcuk = (cuk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28751);
          break;
        case 1:
          localcuk.xcZ = locala.BTU.vd();
          AppMethodBeat.o(28751);
          paramInt = 0;
          break;
        case 2:
          localcuk.xpw = locala.BTU.readString();
          AppMethodBeat.o(28751);
          paramInt = 0;
          break;
        case 3:
          localcuk.xqL = locala.BTU.emu();
          AppMethodBeat.o(28751);
          paramInt = 0;
          break;
        case 4:
          localcuk.xqM = locala.BTU.emu();
          AppMethodBeat.o(28751);
          paramInt = 0;
          break;
        case 5:
          localcuk.xqN = locala.BTU.readString();
          AppMethodBeat.o(28751);
          paramInt = 0;
          break;
        case 6:
          localcuk.xqO = locala.BTU.readString();
          AppMethodBeat.o(28751);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28751);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cuk
 * JD-Core Version:    0.6.2
 */
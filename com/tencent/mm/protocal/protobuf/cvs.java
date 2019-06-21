package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cvs extends com.tencent.mm.bt.a
{
  public String Md5;
  public String vMJ;
  public int xrE;
  public int xrF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(63699);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Md5 == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Md5");
        AppMethodBeat.o(63699);
        throw paramArrayOfObject;
      }
      if (this.vMJ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DownloadUrl");
        AppMethodBeat.o(63699);
        throw paramArrayOfObject;
      }
      if (this.Md5 != null)
        paramArrayOfObject.e(1, this.Md5);
      if (this.vMJ != null)
        paramArrayOfObject.e(2, this.vMJ);
      paramArrayOfObject.iz(3, this.xrE);
      paramArrayOfObject.iz(4, this.xrF);
      AppMethodBeat.o(63699);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Md5 == null)
        break label480;
    label480: for (paramInt = e.a.a.b.b.a.f(1, this.Md5) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vMJ != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vMJ);
      paramInt = i + e.a.a.b.b.a.bs(3, this.xrE) + e.a.a.b.b.a.bs(4, this.xrF);
      AppMethodBeat.o(63699);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Md5 == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Md5");
          AppMethodBeat.o(63699);
          throw paramArrayOfObject;
        }
        if (this.vMJ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DownloadUrl");
          AppMethodBeat.o(63699);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(63699);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cvs localcvs = (cvs)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(63699);
          break;
        case 1:
          localcvs.Md5 = locala.BTU.readString();
          AppMethodBeat.o(63699);
          paramInt = i;
          break;
        case 2:
          localcvs.vMJ = locala.BTU.readString();
          AppMethodBeat.o(63699);
          paramInt = i;
          break;
        case 3:
          localcvs.xrE = locala.BTU.vd();
          AppMethodBeat.o(63699);
          paramInt = i;
          break;
        case 4:
          localcvs.xrF = locala.BTU.vd();
          AppMethodBeat.o(63699);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(63699);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvs
 * JD-Core Version:    0.6.2
 */
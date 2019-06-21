package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cdw extends com.tencent.mm.bt.a
{
  public String cEV;
  public String clientId;
  public String content;
  public String cvF;
  public int fDG;
  public long rUJ;
  public int rVd;
  public String rVl;
  public int rVm;
  public int retryCount;
  public int state;
  public String toUser;
  public int xdD;
  public int xdE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(108907);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cEV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: fromUser");
        AppMethodBeat.o(108907);
        throw paramArrayOfObject;
      }
      if (this.toUser == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: toUser");
        AppMethodBeat.o(108907);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.rUJ);
      paramArrayOfObject.iz(2, this.fDG);
      if (this.cEV != null)
        paramArrayOfObject.e(3, this.cEV);
      if (this.toUser != null)
        paramArrayOfObject.e(4, this.toUser);
      if (this.content != null)
        paramArrayOfObject.e(5, this.content);
      paramArrayOfObject.iz(6, this.state);
      if (this.clientId != null)
        paramArrayOfObject.e(7, this.clientId);
      paramArrayOfObject.iz(8, this.rVd);
      paramArrayOfObject.iz(9, this.xdD);
      paramArrayOfObject.iz(10, this.retryCount);
      paramArrayOfObject.iz(11, this.xdE);
      if (this.cvF != null)
        paramArrayOfObject.e(12, this.cvF);
      if (this.rVl != null)
        paramArrayOfObject.e(13, this.rVl);
      paramArrayOfObject.iz(14, this.rVm);
      AppMethodBeat.o(108907);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.rUJ) + 0 + e.a.a.b.b.a.bs(2, this.fDG);
        paramInt = i;
        if (this.cEV != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.cEV);
        i = paramInt;
        if (this.toUser != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.toUser);
        paramInt = i;
        if (this.content != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.content);
        i = paramInt + e.a.a.b.b.a.bs(6, this.state);
        paramInt = i;
        if (this.clientId != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.clientId);
        i = paramInt + e.a.a.b.b.a.bs(8, this.rVd) + e.a.a.b.b.a.bs(9, this.xdD) + e.a.a.b.b.a.bs(10, this.retryCount) + e.a.a.b.b.a.bs(11, this.xdE);
        paramInt = i;
        if (this.cvF != null)
          paramInt = i + e.a.a.b.b.a.f(12, this.cvF);
        i = paramInt;
        if (this.rVl != null)
          i = paramInt + e.a.a.b.b.a.f(13, this.rVl);
        paramInt = i + e.a.a.b.b.a.bs(14, this.rVm);
        AppMethodBeat.o(108907);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.cEV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: fromUser");
          AppMethodBeat.o(108907);
          throw paramArrayOfObject;
        }
        if (this.toUser == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: toUser");
          AppMethodBeat.o(108907);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(108907);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cdw localcdw = (cdw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(108907);
          break;
        case 1:
          localcdw.rUJ = locala.BTU.ve();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 2:
          localcdw.fDG = locala.BTU.vd();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 3:
          localcdw.cEV = locala.BTU.readString();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 4:
          localcdw.toUser = locala.BTU.readString();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 5:
          localcdw.content = locala.BTU.readString();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 6:
          localcdw.state = locala.BTU.vd();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 7:
          localcdw.clientId = locala.BTU.readString();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 8:
          localcdw.rVd = locala.BTU.vd();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 9:
          localcdw.xdD = locala.BTU.vd();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 10:
          localcdw.retryCount = locala.BTU.vd();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 11:
          localcdw.xdE = locala.BTU.vd();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 12:
          localcdw.cvF = locala.BTU.readString();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 13:
          localcdw.rVl = locala.BTU.readString();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        case 14:
          localcdw.rVm = locala.BTU.vd();
          AppMethodBeat.o(108907);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(108907);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdw
 * JD-Core Version:    0.6.2
 */
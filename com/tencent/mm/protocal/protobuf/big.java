package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class big extends com.tencent.mm.bt.a
{
  public String csB;
  public String fBq;
  public String iAa;
  public String iAe;
  public String izZ;
  public int position;
  public String username;
  public int vFr;
  public int wLx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(134434);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      if (this.izZ != null)
        paramArrayOfObject.e(2, this.izZ);
      if (this.fBq != null)
        paramArrayOfObject.e(3, this.fBq);
      if (this.iAa != null)
        paramArrayOfObject.e(4, this.iAa);
      if (this.csB != null)
        paramArrayOfObject.e(5, this.csB);
      if (this.iAe != null)
        paramArrayOfObject.e(6, this.iAe);
      paramArrayOfObject.iz(7, this.position);
      paramArrayOfObject.iz(8, this.wLx);
      paramArrayOfObject.iz(9, this.vFr);
      AppMethodBeat.o(134434);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label687;
    label687: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.izZ != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.izZ);
      paramInt = i;
      if (this.fBq != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.fBq);
      i = paramInt;
      if (this.iAa != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.iAa);
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.csB);
      i = paramInt;
      if (this.iAe != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.iAe);
      paramInt = i + e.a.a.b.b.a.bs(7, this.position) + e.a.a.b.b.a.bs(8, this.wLx) + e.a.a.b.b.a.bs(9, this.vFr);
      AppMethodBeat.o(134434);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(134434);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        big localbig = (big)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(134434);
          break;
        case 1:
          localbig.username = locala.BTU.readString();
          AppMethodBeat.o(134434);
          paramInt = i;
          break;
        case 2:
          localbig.izZ = locala.BTU.readString();
          AppMethodBeat.o(134434);
          paramInt = i;
          break;
        case 3:
          localbig.fBq = locala.BTU.readString();
          AppMethodBeat.o(134434);
          paramInt = i;
          break;
        case 4:
          localbig.iAa = locala.BTU.readString();
          AppMethodBeat.o(134434);
          paramInt = i;
          break;
        case 5:
          localbig.csB = locala.BTU.readString();
          AppMethodBeat.o(134434);
          paramInt = i;
          break;
        case 6:
          localbig.iAe = locala.BTU.readString();
          AppMethodBeat.o(134434);
          paramInt = i;
          break;
        case 7:
          localbig.position = locala.BTU.vd();
          AppMethodBeat.o(134434);
          paramInt = i;
          break;
        case 8:
          localbig.wLx = locala.BTU.vd();
          AppMethodBeat.o(134434);
          paramInt = i;
          break;
        case 9:
          localbig.vFr = locala.BTU.vd();
          AppMethodBeat.o(134434);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(134434);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.big
 * JD-Core Version:    0.6.2
 */
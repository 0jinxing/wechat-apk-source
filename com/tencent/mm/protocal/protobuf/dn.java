package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class dn extends com.tencent.mm.bt.a
{
  public String csB;
  public String fBq;
  public String iAa;
  public String iAe;
  public int position;
  public String username;
  public int vFr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(134422);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      if (this.fBq != null)
        paramArrayOfObject.e(2, this.fBq);
      if (this.iAa != null)
        paramArrayOfObject.e(3, this.iAa);
      if (this.csB != null)
        paramArrayOfObject.e(4, this.csB);
      if (this.iAe != null)
        paramArrayOfObject.e(5, this.iAe);
      paramArrayOfObject.iz(6, this.position);
      paramArrayOfObject.iz(7, this.vFr);
      AppMethodBeat.o(134422);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label577;
    label577: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fBq != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fBq);
      paramInt = i;
      if (this.iAa != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.iAa);
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.csB);
      paramInt = i;
      if (this.iAe != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.iAe);
      paramInt = paramInt + e.a.a.b.b.a.bs(6, this.position) + e.a.a.b.b.a.bs(7, this.vFr);
      AppMethodBeat.o(134422);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(134422);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        dn localdn = (dn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(134422);
          break;
        case 1:
          localdn.username = locala.BTU.readString();
          AppMethodBeat.o(134422);
          paramInt = i;
          break;
        case 2:
          localdn.fBq = locala.BTU.readString();
          AppMethodBeat.o(134422);
          paramInt = i;
          break;
        case 3:
          localdn.iAa = locala.BTU.readString();
          AppMethodBeat.o(134422);
          paramInt = i;
          break;
        case 4:
          localdn.csB = locala.BTU.readString();
          AppMethodBeat.o(134422);
          paramInt = i;
          break;
        case 5:
          localdn.iAe = locala.BTU.readString();
          AppMethodBeat.o(134422);
          paramInt = i;
          break;
        case 6:
          localdn.position = locala.BTU.vd();
          AppMethodBeat.o(134422);
          paramInt = i;
          break;
        case 7:
          localdn.vFr = locala.BTU.vd();
          AppMethodBeat.o(134422);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(134422);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.dn
 * JD-Core Version:    0.6.2
 */
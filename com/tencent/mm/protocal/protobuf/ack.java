package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ack extends com.tencent.mm.bt.a
{
  public String jBB;
  public int pcX;
  public int vAR;
  public String vEA;
  public String vEy;
  public String wkf;
  public String wkg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51020);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEy != null)
        paramArrayOfObject.e(1, this.vEy);
      paramArrayOfObject.iz(2, this.pcX);
      paramArrayOfObject.iz(3, this.vAR);
      if (this.vEA != null)
        paramArrayOfObject.e(4, this.vEA);
      if (this.wkf != null)
        paramArrayOfObject.e(5, this.wkf);
      if (this.jBB != null)
        paramArrayOfObject.e(6, this.jBB);
      if (this.wkg != null)
        paramArrayOfObject.e(7, this.wkg);
      AppMethodBeat.o(51020);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vEy == null)
        break label577;
    label577: for (paramInt = e.a.a.b.b.a.f(1, this.vEy) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.pcX) + e.a.a.b.b.a.bs(3, this.vAR);
      paramInt = i;
      if (this.vEA != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vEA);
      i = paramInt;
      if (this.wkf != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wkf);
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.jBB);
      i = paramInt;
      if (this.wkg != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wkg);
      AppMethodBeat.o(51020);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51020);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ack localack = (ack)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51020);
          break;
        case 1:
          localack.vEy = locala.BTU.readString();
          AppMethodBeat.o(51020);
          paramInt = i;
          break;
        case 2:
          localack.pcX = locala.BTU.vd();
          AppMethodBeat.o(51020);
          paramInt = i;
          break;
        case 3:
          localack.vAR = locala.BTU.vd();
          AppMethodBeat.o(51020);
          paramInt = i;
          break;
        case 4:
          localack.vEA = locala.BTU.readString();
          AppMethodBeat.o(51020);
          paramInt = i;
          break;
        case 5:
          localack.wkf = locala.BTU.readString();
          AppMethodBeat.o(51020);
          paramInt = i;
          break;
        case 6:
          localack.jBB = locala.BTU.readString();
          AppMethodBeat.o(51020);
          paramInt = i;
          break;
        case 7:
          localack.wkg = locala.BTU.readString();
          AppMethodBeat.o(51020);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51020);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ack
 * JD-Core Version:    0.6.2
 */
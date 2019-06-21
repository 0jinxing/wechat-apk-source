package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class qo extends com.tencent.mm.bt.a
{
  public String vXB;
  public String vXC;
  public String vXD;
  public int vXE;
  public int vXF;
  public String vXG;
  public int vXH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51377);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vXB != null)
        paramArrayOfObject.e(1, this.vXB);
      if (this.vXC != null)
        paramArrayOfObject.e(2, this.vXC);
      if (this.vXD != null)
        paramArrayOfObject.e(3, this.vXD);
      paramArrayOfObject.iz(4, this.vXE);
      paramArrayOfObject.iz(5, this.vXF);
      if (this.vXG != null)
        paramArrayOfObject.e(6, this.vXG);
      paramArrayOfObject.iz(7, this.vXH);
      AppMethodBeat.o(51377);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vXB == null)
        break label561;
    label561: for (i = e.a.a.b.b.a.f(1, this.vXB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vXC != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vXC);
      i = paramInt;
      if (this.vXD != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vXD);
      i = i + e.a.a.b.b.a.bs(4, this.vXE) + e.a.a.b.b.a.bs(5, this.vXF);
      paramInt = i;
      if (this.vXG != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vXG);
      paramInt += e.a.a.b.b.a.bs(7, this.vXH);
      AppMethodBeat.o(51377);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51377);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        qo localqo = (qo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51377);
          break;
        case 1:
          localqo.vXB = locala.BTU.readString();
          AppMethodBeat.o(51377);
          paramInt = i;
          break;
        case 2:
          localqo.vXC = locala.BTU.readString();
          AppMethodBeat.o(51377);
          paramInt = i;
          break;
        case 3:
          localqo.vXD = locala.BTU.readString();
          AppMethodBeat.o(51377);
          paramInt = i;
          break;
        case 4:
          localqo.vXE = locala.BTU.vd();
          AppMethodBeat.o(51377);
          paramInt = i;
          break;
        case 5:
          localqo.vXF = locala.BTU.vd();
          AppMethodBeat.o(51377);
          paramInt = i;
          break;
        case 6:
          localqo.vXG = locala.BTU.readString();
          AppMethodBeat.o(51377);
          paramInt = i;
          break;
        case 7:
          localqo.vXH = locala.BTU.vd();
          AppMethodBeat.o(51377);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51377);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qo
 * JD-Core Version:    0.6.2
 */
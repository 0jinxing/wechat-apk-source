package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cno extends com.tencent.mm.bt.a
{
  public String csB;
  public String cvO;
  public String kmr;
  public String wys;
  public String wzf;
  public String xkV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96315);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB != null)
        paramArrayOfObject.e(1, this.csB);
      if (this.cvO != null)
        paramArrayOfObject.e(2, this.cvO);
      if (this.wzf != null)
        paramArrayOfObject.e(3, this.wzf);
      if (this.xkV != null)
        paramArrayOfObject.e(4, this.xkV);
      if (this.kmr != null)
        paramArrayOfObject.e(5, this.kmr);
      if (this.wys != null)
        paramArrayOfObject.e(6, this.wys);
      AppMethodBeat.o(96315);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.csB == null)
        break label546;
    label546: for (paramInt = e.a.a.b.b.a.f(1, this.csB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cvO != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cvO);
      paramInt = i;
      if (this.wzf != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wzf);
      i = paramInt;
      if (this.xkV != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.xkV);
      paramInt = i;
      if (this.kmr != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.kmr);
      i = paramInt;
      if (this.wys != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wys);
      AppMethodBeat.o(96315);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96315);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cno localcno = (cno)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96315);
          break;
        case 1:
          localcno.csB = locala.BTU.readString();
          AppMethodBeat.o(96315);
          paramInt = i;
          break;
        case 2:
          localcno.cvO = locala.BTU.readString();
          AppMethodBeat.o(96315);
          paramInt = i;
          break;
        case 3:
          localcno.wzf = locala.BTU.readString();
          AppMethodBeat.o(96315);
          paramInt = i;
          break;
        case 4:
          localcno.xkV = locala.BTU.readString();
          AppMethodBeat.o(96315);
          paramInt = i;
          break;
        case 5:
          localcno.kmr = locala.BTU.readString();
          AppMethodBeat.o(96315);
          paramInt = i;
          break;
        case 6:
          localcno.wys = locala.BTU.readString();
          AppMethodBeat.o(96315);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96315);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cno
 * JD-Core Version:    0.6.2
 */
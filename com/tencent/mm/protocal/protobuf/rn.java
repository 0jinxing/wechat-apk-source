package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class rn extends com.tencent.mm.bt.a
{
  public String cEh;
  public String pRD;
  public String pcw;
  public String title;
  public int vYN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48821);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.cEh != null)
        paramArrayOfObject.e(2, this.cEh);
      if (this.pcw != null)
        paramArrayOfObject.e(3, this.pcw);
      if (this.pRD != null)
        paramArrayOfObject.e(4, this.pRD);
      paramArrayOfObject.iz(5, this.vYN);
      AppMethodBeat.o(48821);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label463;
    label463: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cEh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cEh);
      paramInt = i;
      if (this.pcw != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.pcw);
      i = paramInt;
      if (this.pRD != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.pRD);
      paramInt = i + e.a.a.b.b.a.bs(5, this.vYN);
      AppMethodBeat.o(48821);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48821);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        rn localrn = (rn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48821);
          break;
        case 1:
          localrn.title = locala.BTU.readString();
          AppMethodBeat.o(48821);
          paramInt = i;
          break;
        case 2:
          localrn.cEh = locala.BTU.readString();
          AppMethodBeat.o(48821);
          paramInt = i;
          break;
        case 3:
          localrn.pcw = locala.BTU.readString();
          AppMethodBeat.o(48821);
          paramInt = i;
          break;
        case 4:
          localrn.pRD = locala.BTU.readString();
          AppMethodBeat.o(48821);
          paramInt = i;
          break;
        case 5:
          localrn.vYN = locala.BTU.vd();
          AppMethodBeat.o(48821);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48821);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.rn
 * JD-Core Version:    0.6.2
 */
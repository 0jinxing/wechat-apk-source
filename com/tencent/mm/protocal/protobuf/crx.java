package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class crx extends com.tencent.mm.bt.a
{
  public String Desc;
  public String ProductID;
  public String Title;
  public String nzz;
  public int vEq;
  public String wOs;
  public String xpy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28709);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.wOs != null)
        paramArrayOfObject.e(2, this.wOs);
      if (this.nzz != null)
        paramArrayOfObject.e(3, this.nzz);
      if (this.Desc != null)
        paramArrayOfObject.e(4, this.Desc);
      if (this.xpy != null)
        paramArrayOfObject.e(5, this.xpy);
      paramArrayOfObject.iz(6, this.vEq);
      if (this.ProductID != null)
        paramArrayOfObject.e(7, this.ProductID);
      AppMethodBeat.o(28709);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label606;
    label606: for (i = e.a.a.b.b.a.f(1, this.Title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wOs != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wOs);
      i = paramInt;
      if (this.nzz != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.nzz);
      paramInt = i;
      if (this.Desc != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.Desc);
      i = paramInt;
      if (this.xpy != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.xpy);
      i += e.a.a.b.b.a.bs(6, this.vEq);
      paramInt = i;
      if (this.ProductID != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.ProductID);
      AppMethodBeat.o(28709);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28709);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        crx localcrx = (crx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28709);
          break;
        case 1:
          localcrx.Title = locala.BTU.readString();
          AppMethodBeat.o(28709);
          paramInt = i;
          break;
        case 2:
          localcrx.wOs = locala.BTU.readString();
          AppMethodBeat.o(28709);
          paramInt = i;
          break;
        case 3:
          localcrx.nzz = locala.BTU.readString();
          AppMethodBeat.o(28709);
          paramInt = i;
          break;
        case 4:
          localcrx.Desc = locala.BTU.readString();
          AppMethodBeat.o(28709);
          paramInt = i;
          break;
        case 5:
          localcrx.xpy = locala.BTU.readString();
          AppMethodBeat.o(28709);
          paramInt = i;
          break;
        case 6:
          localcrx.vEq = locala.BTU.vd();
          AppMethodBeat.o(28709);
          paramInt = i;
          break;
        case 7:
          localcrx.ProductID = locala.BTU.readString();
          AppMethodBeat.o(28709);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28709);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crx
 * JD-Core Version:    0.6.2
 */
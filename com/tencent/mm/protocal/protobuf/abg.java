package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class abg extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Title;
  public int vEt;
  public String vEu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(118271);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.Desc != null)
        paramArrayOfObject.e(2, this.Desc);
      paramArrayOfObject.iz(3, this.vEt);
      if (this.vEu != null)
        paramArrayOfObject.e(4, this.vEu);
      AppMethodBeat.o(118271);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label400;
    label400: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Desc);
      i += e.a.a.b.b.a.bs(3, this.vEt);
      paramInt = i;
      if (this.vEu != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vEu);
      AppMethodBeat.o(118271);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(118271);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abg localabg = (abg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(118271);
          break;
        case 1:
          localabg.Title = locala.BTU.readString();
          AppMethodBeat.o(118271);
          paramInt = i;
          break;
        case 2:
          localabg.Desc = locala.BTU.readString();
          AppMethodBeat.o(118271);
          paramInt = i;
          break;
        case 3:
          localabg.vEt = locala.BTU.vd();
          AppMethodBeat.o(118271);
          paramInt = i;
          break;
        case 4:
          localabg.vEu = locala.BTU.readString();
          AppMethodBeat.o(118271);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(118271);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abg
 * JD-Core Version:    0.6.2
 */
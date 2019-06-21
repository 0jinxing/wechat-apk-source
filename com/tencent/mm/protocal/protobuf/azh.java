package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class azh extends com.tencent.mm.bt.a
{
  public String type;
  public int vXd;
  public String wDs;
  public String wDt;
  public String woO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(70486);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wDs != null)
        paramArrayOfObject.e(1, this.wDs);
      if (this.woO != null)
        paramArrayOfObject.e(2, this.woO);
      if (this.type != null)
        paramArrayOfObject.e(3, this.type);
      paramArrayOfObject.iz(4, this.vXd);
      if (this.wDt != null)
        paramArrayOfObject.e(5, this.wDt);
      AppMethodBeat.o(70486);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wDs == null)
        break label463;
    label463: for (i = e.a.a.b.b.a.f(1, this.wDs) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.woO != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.woO);
      i = paramInt;
      if (this.type != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.type);
      i += e.a.a.b.b.a.bs(4, this.vXd);
      paramInt = i;
      if (this.wDt != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wDt);
      AppMethodBeat.o(70486);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(70486);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        azh localazh = (azh)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(70486);
          break;
        case 1:
          localazh.wDs = locala.BTU.readString();
          AppMethodBeat.o(70486);
          paramInt = i;
          break;
        case 2:
          localazh.woO = locala.BTU.readString();
          AppMethodBeat.o(70486);
          paramInt = i;
          break;
        case 3:
          localazh.type = locala.BTU.readString();
          AppMethodBeat.o(70486);
          paramInt = i;
          break;
        case 4:
          localazh.vXd = locala.BTU.vd();
          AppMethodBeat.o(70486);
          paramInt = i;
          break;
        case 5:
          localazh.wDt = locala.BTU.readString();
          AppMethodBeat.o(70486);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(70486);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azh
 * JD-Core Version:    0.6.2
 */
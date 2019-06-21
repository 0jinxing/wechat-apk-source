package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class hu extends com.tencent.mm.bt.a
{
  public int ReqType;
  public int vIK;
  public int vKj;
  public LinkedList<String> vKk;

  public hu()
  {
    AppMethodBeat.i(62519);
    this.vKk = new LinkedList();
    AppMethodBeat.o(62519);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62520);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vKj);
      paramArrayOfObject.iz(2, this.ReqType);
      paramArrayOfObject.e(3, 1, this.vKk);
      paramArrayOfObject.iz(4, this.vIK);
      AppMethodBeat.o(62520);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vKj) + 0 + e.a.a.b.b.a.bs(2, this.ReqType) + e.a.a.a.c(3, 1, this.vKk) + e.a.a.b.b.a.bs(4, this.vIK);
        AppMethodBeat.o(62520);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vKk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62520);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        hu localhu = (hu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62520);
          break;
        case 1:
          localhu.vKj = locala.BTU.vd();
          AppMethodBeat.o(62520);
          paramInt = 0;
          break;
        case 2:
          localhu.ReqType = locala.BTU.vd();
          AppMethodBeat.o(62520);
          paramInt = 0;
          break;
        case 3:
          localhu.vKk.add(locala.BTU.readString());
          AppMethodBeat.o(62520);
          paramInt = 0;
          break;
        case 4:
          localhu.vIK = locala.BTU.vd();
          AppMethodBeat.o(62520);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(62520);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hu
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class lj extends com.tencent.mm.bt.a
{
  public String vNb;
  public LinkedList<String> vOW;

  public lj()
  {
    AppMethodBeat.i(11729);
    this.vOW = new LinkedList();
    AppMethodBeat.o(11729);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11730);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vNb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: brand_user_name");
        AppMethodBeat.o(11730);
        throw paramArrayOfObject;
      }
      if (this.vNb != null)
        paramArrayOfObject.e(2, this.vNb);
      paramArrayOfObject.e(3, 1, this.vOW);
      AppMethodBeat.o(11730);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vNb == null)
        break label350;
    label350: for (paramInt = e.a.a.b.b.a.f(2, this.vNb) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(3, 1, this.vOW);
      AppMethodBeat.o(11730);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vOW.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vNb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: brand_user_name");
          AppMethodBeat.o(11730);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11730);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        lj locallj = (lj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11730);
          break;
        case 2:
          locallj.vNb = locala.BTU.readString();
          AppMethodBeat.o(11730);
          paramInt = i;
          break;
        case 3:
          locallj.vOW.add(locala.BTU.readString());
          AppMethodBeat.o(11730);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11730);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.lj
 * JD-Core Version:    0.6.2
 */
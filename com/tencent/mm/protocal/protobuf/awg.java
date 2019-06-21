package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class awg extends com.tencent.mm.bt.a
{
  public String qkh;
  public String scope;
  public int wzW;
  public LinkedList<String> wzX;

  public awg()
  {
    AppMethodBeat.i(10212);
    this.wzX = new LinkedList();
    AppMethodBeat.o(10212);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10213);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.scope != null)
        paramArrayOfObject.e(1, this.scope);
      paramArrayOfObject.iz(2, this.wzW);
      if (this.qkh != null)
        paramArrayOfObject.e(3, this.qkh);
      paramArrayOfObject.e(4, 1, this.wzX);
      AppMethodBeat.o(10213);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.scope == null)
        break label410;
    label410: for (paramInt = e.a.a.b.b.a.f(1, this.scope) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wzW);
      paramInt = i;
      if (this.qkh != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.qkh);
      paramInt += e.a.a.a.c(4, 1, this.wzX);
      AppMethodBeat.o(10213);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wzX.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10213);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        awg localawg = (awg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10213);
          break;
        case 1:
          localawg.scope = locala.BTU.readString();
          AppMethodBeat.o(10213);
          paramInt = i;
          break;
        case 2:
          localawg.wzW = locala.BTU.vd();
          AppMethodBeat.o(10213);
          paramInt = i;
          break;
        case 3:
          localawg.qkh = locala.BTU.readString();
          AppMethodBeat.o(10213);
          paramInt = i;
          break;
        case 4:
          localawg.wzX.add(locala.BTU.readString());
          AppMethodBeat.o(10213);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10213);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.awg
 * JD-Core Version:    0.6.2
 */
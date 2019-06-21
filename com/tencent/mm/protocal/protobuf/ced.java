package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ced extends com.tencent.mm.bt.a
{
  public String xdN;
  public String xdO;
  public String xdP;
  public String xdQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56512);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xdN == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: videoFileMD5");
        AppMethodBeat.o(56512);
        throw paramArrayOfObject;
      }
      if (this.xdN != null)
        paramArrayOfObject.e(1, this.xdN);
      if (this.xdO != null)
        paramArrayOfObject.e(2, this.xdO);
      if (this.xdP != null)
        paramArrayOfObject.e(3, this.xdP);
      if (this.xdQ != null)
        paramArrayOfObject.e(4, this.xdQ);
      AppMethodBeat.o(56512);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xdN == null)
        break label468;
    label468: for (paramInt = e.a.a.b.b.a.f(1, this.xdN) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xdO != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.xdO);
      paramInt = i;
      if (this.xdP != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.xdP);
      i = paramInt;
      if (this.xdQ != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.xdQ);
      AppMethodBeat.o(56512);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xdN == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: videoFileMD5");
          AppMethodBeat.o(56512);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56512);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ced localced = (ced)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56512);
          break;
        case 1:
          localced.xdN = locala.BTU.readString();
          AppMethodBeat.o(56512);
          paramInt = i;
          break;
        case 2:
          localced.xdO = locala.BTU.readString();
          AppMethodBeat.o(56512);
          paramInt = i;
          break;
        case 3:
          localced.xdP = locala.BTU.readString();
          AppMethodBeat.o(56512);
          paramInt = i;
          break;
        case 4:
          localced.xdQ = locala.BTU.readString();
          AppMethodBeat.o(56512);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56512);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ced
 * JD-Core Version:    0.6.2
 */
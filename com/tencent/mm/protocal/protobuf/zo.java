package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class zo extends com.tencent.mm.bt.a
{
  public String weG;
  public String weR;
  public LinkedList<String> weS;
  public boolean weT;

  public zo()
  {
    AppMethodBeat.i(28399);
    this.weS = new LinkedList();
    AppMethodBeat.o(28399);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28400);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.weG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: LoginUrl");
        AppMethodBeat.o(28400);
        throw paramArrayOfObject;
      }
      if (this.weG != null)
        paramArrayOfObject.e(1, this.weG);
      if (this.weR != null)
        paramArrayOfObject.e(2, this.weR);
      paramArrayOfObject.e(3, 1, this.weS);
      paramArrayOfObject.aO(4, this.weT);
      AppMethodBeat.o(28400);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.weG == null)
        break label458;
    label458: for (paramInt = e.a.a.b.b.a.f(1, this.weG) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.weR != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.weR);
      paramInt = i + e.a.a.a.c(3, 1, this.weS) + (e.a.a.b.b.a.fv(4) + 1);
      AppMethodBeat.o(28400);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.weS.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.weG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: LoginUrl");
          AppMethodBeat.o(28400);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28400);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        zo localzo = (zo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28400);
          break;
        case 1:
          localzo.weG = locala.BTU.readString();
          AppMethodBeat.o(28400);
          paramInt = i;
          break;
        case 2:
          localzo.weR = locala.BTU.readString();
          AppMethodBeat.o(28400);
          paramInt = i;
          break;
        case 3:
          localzo.weS.add(locala.BTU.readString());
          AppMethodBeat.o(28400);
          paramInt = i;
          break;
        case 4:
          localzo.weT = locala.BTU.ehX();
          AppMethodBeat.o(28400);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28400);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.zo
 * JD-Core Version:    0.6.2
 */
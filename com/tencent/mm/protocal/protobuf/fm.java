package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class fm extends com.tencent.mm.bt.a
{
  public String cxb;
  public String fLi;
  public String geY;
  public LinkedList<String> vHv;
  public long vHw;

  public fm()
  {
    AppMethodBeat.i(118265);
    this.vHv = new LinkedList();
    AppMethodBeat.o(118265);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(118266);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.geY == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: roomname");
        AppMethodBeat.o(118266);
        throw paramArrayOfObject;
      }
      if (this.geY != null)
        paramArrayOfObject.e(1, this.geY);
      if (this.cxb != null)
        paramArrayOfObject.e(2, this.cxb);
      if (this.fLi != null)
        paramArrayOfObject.e(3, this.fLi);
      paramArrayOfObject.e(4, 1, this.vHv);
      paramArrayOfObject.ai(5, this.vHw);
      AppMethodBeat.o(118266);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.geY == null)
        break label511;
    label511: for (i = e.a.a.b.b.a.f(1, this.geY) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.cxb != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.cxb);
      i = paramInt;
      if (this.fLi != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.fLi);
      paramInt = i + e.a.a.a.c(4, 1, this.vHv) + e.a.a.b.b.a.o(5, this.vHw);
      AppMethodBeat.o(118266);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vHv.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.geY == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: roomname");
          AppMethodBeat.o(118266);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(118266);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        fm localfm = (fm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(118266);
          break;
        case 1:
          localfm.geY = locala.BTU.readString();
          AppMethodBeat.o(118266);
          paramInt = i;
          break;
        case 2:
          localfm.cxb = locala.BTU.readString();
          AppMethodBeat.o(118266);
          paramInt = i;
          break;
        case 3:
          localfm.fLi = locala.BTU.readString();
          AppMethodBeat.o(118266);
          paramInt = i;
          break;
        case 4:
          localfm.vHv.add(locala.BTU.readString());
          AppMethodBeat.o(118266);
          paramInt = i;
          break;
        case 5:
          localfm.vHw = locala.BTU.ve();
          AppMethodBeat.o(118266);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(118266);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fm
 * JD-Core Version:    0.6.2
 */
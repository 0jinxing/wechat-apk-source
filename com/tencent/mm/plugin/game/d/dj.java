package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import java.util.LinkedList;

public final class dj extends bsr
{
  public String mZr;
  public String ndF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111677);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppID");
        AppMethodBeat.o(111677);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.mZr != null)
        paramArrayOfObject.e(2, this.mZr);
      if (this.ndF != null)
        paramArrayOfObject.e(3, this.ndF);
      AppMethodBeat.o(111677);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label501;
    label501: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mZr != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.mZr);
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ndF);
      AppMethodBeat.o(111677);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppID");
          AppMethodBeat.o(111677);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111677);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        dj localdj = (dj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111677);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localdj.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(111677);
          paramInt = i;
          break;
        case 2:
          localdj.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111677);
          paramInt = i;
          break;
        case 3:
          localdj.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111677);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111677);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.dj
 * JD-Core Version:    0.6.2
 */
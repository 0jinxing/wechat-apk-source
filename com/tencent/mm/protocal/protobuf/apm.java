package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class apm extends bsr
{
  public String csB;
  public int cvd;
  public boolean wtw;
  public LinkedList<String> wtx;

  public apm()
  {
    AppMethodBeat.i(102377);
    this.wtx = new LinkedList();
    AppMethodBeat.o(102377);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102378);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      paramArrayOfObject.aO(3, this.wtw);
      paramArrayOfObject.e(4, 1, this.wtx);
      paramArrayOfObject.iz(5, this.cvd);
      AppMethodBeat.o(102378);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label540;
    label540: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.csB);
      paramInt = i + (e.a.a.b.b.a.fv(3) + 1) + e.a.a.a.c(4, 1, this.wtx) + e.a.a.b.b.a.bs(5, this.cvd);
      AppMethodBeat.o(102378);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wtx.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102378);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        apm localapm = (apm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102378);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapm.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(102378);
          paramInt = i;
          break;
        case 2:
          localapm.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102378);
          paramInt = i;
          break;
        case 3:
          localapm.wtw = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(102378);
          paramInt = i;
          break;
        case 4:
          localapm.wtx.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(102378);
          paramInt = i;
          break;
        case 5:
          localapm.cvd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102378);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102378);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.apm
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class xn extends bsr
{
  public int ptD;
  public long ptF;
  public String vEf;
  public String vFF;
  public int vOq;
  public int wdn;
  public long wdo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(116802);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ptD);
      paramArrayOfObject.iz(2, this.vOq);
      paramArrayOfObject.iz(3, this.wdn);
      if (this.vFF != null)
        paramArrayOfObject.e(4, this.vFF);
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(5, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(6, this.ptF);
      if (this.vEf != null)
        paramArrayOfObject.e(7, this.vEf);
      paramArrayOfObject.ai(8, this.wdo);
      AppMethodBeat.o(116802);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ptD) + 0 + e.a.a.b.b.a.bs(2, this.vOq) + e.a.a.b.b.a.bs(3, this.wdn);
        paramInt = i;
        if (this.vFF != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.vFF);
        i = paramInt;
        if (this.BaseRequest != null)
          i = paramInt + e.a.a.a.ix(5, this.BaseRequest.computeSize());
        i += e.a.a.b.b.a.o(6, this.ptF);
        paramInt = i;
        if (this.vEf != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.vEf);
        paramInt += e.a.a.b.b.a.o(8, this.wdo);
        AppMethodBeat.o(116802);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(116802);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xn localxn = (xn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(116802);
          break;
        case 1:
          localxn.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116802);
          paramInt = 0;
          break;
        case 2:
          localxn.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116802);
          paramInt = 0;
          break;
        case 3:
          localxn.wdn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116802);
          paramInt = 0;
          break;
        case 4:
          localxn.vFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116802);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxn.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(116802);
          paramInt = 0;
          break;
        case 6:
          localxn.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(116802);
          paramInt = 0;
          break;
        case 7:
          localxn.vEf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116802);
          paramInt = 0;
          break;
        case 8:
          localxn.wdo = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(116802);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(116802);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xn
 * JD-Core Version:    0.6.2
 */
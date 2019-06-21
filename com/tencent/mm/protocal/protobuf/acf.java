package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class acf extends bsr
{
  public String pdB;
  public String vLs;
  public String wdB;
  public String wjV;
  public String wjW;
  public String wjX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56796);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wjV != null)
        paramArrayOfObject.e(2, this.wjV);
      if (this.vLs != null)
        paramArrayOfObject.e(3, this.vLs);
      if (this.pdB != null)
        paramArrayOfObject.e(4, this.pdB);
      if (this.wjW != null)
        paramArrayOfObject.e(5, this.wjW);
      if (this.wjX != null)
        paramArrayOfObject.e(6, this.wjX);
      if (this.wdB != null)
        paramArrayOfObject.e(7, this.wdB);
      AppMethodBeat.o(56796);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label710;
    label710: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wjV != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wjV);
      i = paramInt;
      if (this.vLs != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vLs);
      paramInt = i;
      if (this.pdB != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.pdB);
      i = paramInt;
      if (this.wjW != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wjW);
      paramInt = i;
      if (this.wjX != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wjX);
      i = paramInt;
      if (this.wdB != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wdB);
      AppMethodBeat.o(56796);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56796);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        acf localacf = (acf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56796);
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
            localacf.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56796);
          paramInt = i;
          break;
        case 2:
          localacf.wjV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56796);
          paramInt = i;
          break;
        case 3:
          localacf.vLs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56796);
          paramInt = i;
          break;
        case 4:
          localacf.pdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56796);
          paramInt = i;
          break;
        case 5:
          localacf.wjW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56796);
          paramInt = i;
          break;
        case 6:
          localacf.wjX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56796);
          paramInt = i;
          break;
        case 7:
          localacf.wdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56796);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56796);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acf
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cot extends bsr
{
  public int vZF;
  public long wOP;
  public int wOQ;
  public String xmv;
  public com.tencent.mm.bt.b xmw;
  public com.tencent.mm.bt.b xmx;
  public String xmy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(135447);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xmv == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: ToBizUserName");
        AppMethodBeat.o(135447);
        throw paramArrayOfObject;
      }
      if (this.xmx == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: CapInfo");
        AppMethodBeat.o(135447);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wOQ);
      if (this.xmv != null)
        paramArrayOfObject.e(3, this.xmv);
      paramArrayOfObject.iz(4, this.vZF);
      if (this.xmw != null)
        paramArrayOfObject.c(5, this.xmw);
      if (this.xmx != null)
        paramArrayOfObject.c(6, this.xmx);
      paramArrayOfObject.ai(7, this.wOP);
      if (this.xmy != null)
        paramArrayOfObject.e(8, this.xmy);
      AppMethodBeat.o(135447);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label821;
    label821: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wOQ);
      paramInt = i;
      if (this.xmv != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.xmv);
      i = paramInt + e.a.a.b.b.a.bs(4, this.vZF);
      paramInt = i;
      if (this.xmw != null)
        paramInt = i + e.a.a.b.b.a.b(5, this.xmw);
      i = paramInt;
      if (this.xmx != null)
        i = paramInt + e.a.a.b.b.a.b(6, this.xmx);
      i += e.a.a.b.b.a.o(7, this.wOP);
      paramInt = i;
      if (this.xmy != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.xmy);
      AppMethodBeat.o(135447);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xmv == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: ToBizUserName");
          AppMethodBeat.o(135447);
          throw paramArrayOfObject;
        }
        if (this.xmx == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: CapInfo");
          AppMethodBeat.o(135447);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(135447);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cot localcot = (cot)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135447);
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
            localcot.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(135447);
          paramInt = i;
          break;
        case 2:
          localcot.wOQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135447);
          paramInt = i;
          break;
        case 3:
          localcot.xmv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135447);
          paramInt = i;
          break;
        case 4:
          localcot.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135447);
          paramInt = i;
          break;
        case 5:
          localcot.xmw = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(135447);
          paramInt = i;
          break;
        case 6:
          localcot.xmx = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(135447);
          paramInt = i;
          break;
        case 7:
          localcot.wOP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135447);
          paramInt = i;
          break;
        case 8:
          localcot.xmy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135447);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(135447);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cot
 * JD-Core Version:    0.6.2
 */
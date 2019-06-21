package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aaj extends bsr
{
  public String csB;
  public int cvd;
  public String wfE;
  public long wfw;
  public String wfx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(843);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.wfw);
      if (this.wfE != null)
        paramArrayOfObject.e(3, this.wfE);
      if (this.csB != null)
        paramArrayOfObject.e(4, this.csB);
      if (this.wfx != null)
        paramArrayOfObject.e(5, this.wfx);
      paramArrayOfObject.iz(6, this.cvd);
      AppMethodBeat.o(843);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label623;
    label623: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.o(2, this.wfw);
      i = paramInt;
      if (this.wfE != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wfE);
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.csB);
      i = paramInt;
      if (this.wfx != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wfx);
      paramInt = i + e.a.a.b.b.a.bs(6, this.cvd);
      AppMethodBeat.o(843);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(843);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aaj localaaj = (aaj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(843);
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
            localaaj.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(843);
          paramInt = i;
          break;
        case 2:
          localaaj.wfw = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(843);
          paramInt = i;
          break;
        case 3:
          localaaj.wfE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(843);
          paramInt = i;
          break;
        case 4:
          localaaj.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(843);
          paramInt = i;
          break;
        case 5:
          localaaj.wfx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(843);
          paramInt = i;
          break;
        case 6:
          localaaj.cvd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(843);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(843);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aaj
 * JD-Core Version:    0.6.2
 */
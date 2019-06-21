package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class avg extends bsr
{
  public String cvO;
  public String mZr;
  public String scope;
  public String signature;
  public String url;
  public String wzd;
  public String wzf;
  public String wzg;
  public b wzh;
  public int wzi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10198);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.mZr != null)
        paramArrayOfObject.e(3, this.mZr);
      if (this.wzd != null)
        paramArrayOfObject.e(4, this.wzd);
      if (this.cvO != null)
        paramArrayOfObject.e(5, this.cvO);
      if (this.wzf != null)
        paramArrayOfObject.e(6, this.wzf);
      if (this.signature != null)
        paramArrayOfObject.e(7, this.signature);
      if (this.wzg != null)
        paramArrayOfObject.e(8, this.wzg);
      if (this.wzh != null)
        paramArrayOfObject.c(9, this.wzh);
      paramArrayOfObject.iz(10, this.wzi);
      if (this.scope != null)
        paramArrayOfObject.e(11, this.scope);
      AppMethodBeat.o(10198);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label967;
    label967: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.url != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.url);
      paramInt = i;
      if (this.mZr != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.mZr);
      i = paramInt;
      if (this.wzd != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wzd);
      paramInt = i;
      if (this.cvO != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.cvO);
      i = paramInt;
      if (this.wzf != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wzf);
      paramInt = i;
      if (this.signature != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.signature);
      i = paramInt;
      if (this.wzg != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wzg);
      paramInt = i;
      if (this.wzh != null)
        paramInt = i + e.a.a.b.b.a.b(9, this.wzh);
      i = paramInt + e.a.a.b.b.a.bs(10, this.wzi);
      paramInt = i;
      if (this.scope != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.scope);
      AppMethodBeat.o(10198);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10198);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avg localavg = (avg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10198);
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
            localavg.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(10198);
          paramInt = i;
          break;
        case 2:
          localavg.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10198);
          paramInt = i;
          break;
        case 3:
          localavg.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10198);
          paramInt = i;
          break;
        case 4:
          localavg.wzd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10198);
          paramInt = i;
          break;
        case 5:
          localavg.cvO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10198);
          paramInt = i;
          break;
        case 6:
          localavg.wzf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10198);
          paramInt = i;
          break;
        case 7:
          localavg.signature = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10198);
          paramInt = i;
          break;
        case 8:
          localavg.wzg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10198);
          paramInt = i;
          break;
        case 9:
          localavg.wzh = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(10198);
          paramInt = i;
          break;
        case 10:
          localavg.wzi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10198);
          paramInt = i;
          break;
        case 11:
          localavg.scope = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10198);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10198);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avg
 * JD-Core Version:    0.6.2
 */
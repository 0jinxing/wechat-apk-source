package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bwt extends bsr
{
  public String csB;
  public String cxb;
  public String pbn;
  public String vId;
  public LinkedList<Integer> wXf;
  public String wXg;

  public bwt()
  {
    AppMethodBeat.i(96285);
    this.wXf = new LinkedList();
    AppMethodBeat.o(96285);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96286);
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
      paramArrayOfObject.e(3, 2, this.wXf);
      if (this.wXg != null)
        paramArrayOfObject.e(4, this.wXg);
      if (this.vId != null)
        paramArrayOfObject.e(5, this.vId);
      if (this.cxb != null)
        paramArrayOfObject.e(6, this.cxb);
      if (this.pbn != null)
        paramArrayOfObject.e(7, this.pbn);
      AppMethodBeat.o(96286);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label709;
    label709: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.csB);
      paramInt = i + e.a.a.a.c(3, 2, this.wXf);
      i = paramInt;
      if (this.wXg != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wXg);
      paramInt = i;
      if (this.vId != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vId);
      i = paramInt;
      if (this.cxb != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.cxb);
      paramInt = i;
      if (this.pbn != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.pbn);
      AppMethodBeat.o(96286);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wXf.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96286);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bwt localbwt = (bwt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96286);
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
            localbwt.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(96286);
          paramInt = i;
          break;
        case 2:
          localbwt.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96286);
          paramInt = i;
          break;
        case 3:
          localbwt.wXf.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(96286);
          paramInt = i;
          break;
        case 4:
          localbwt.wXg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96286);
          paramInt = i;
          break;
        case 5:
          localbwt.vId = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96286);
          paramInt = i;
          break;
        case 6:
          localbwt.cxb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96286);
          paramInt = i;
          break;
        case 7:
          localbwt.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96286);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96286);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bwt
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class arb extends bsr
{
  public String csB;
  public int type;
  public int vOP;
  public String wsY;
  public int wtb;
  public String wuL;
  public int wuM;
  public bie wuN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96234);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.type);
      if (this.csB != null)
        paramArrayOfObject.e(3, this.csB);
      paramArrayOfObject.iz(4, this.vOP);
      if (this.wuL != null)
        paramArrayOfObject.e(5, this.wuL);
      paramArrayOfObject.iz(6, this.wtb);
      paramArrayOfObject.iz(7, this.wuM);
      if (this.wsY != null)
        paramArrayOfObject.e(8, this.wsY);
      if (this.wuN != null)
      {
        paramArrayOfObject.iy(10, this.wuN.computeSize());
        this.wuN.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(96234);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label873;
    label873: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.type);
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.csB);
      i = paramInt + e.a.a.b.b.a.bs(4, this.vOP);
      paramInt = i;
      if (this.wuL != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wuL);
      i = paramInt + e.a.a.b.b.a.bs(6, this.wtb) + e.a.a.b.b.a.bs(7, this.wuM);
      paramInt = i;
      if (this.wsY != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wsY);
      i = paramInt;
      if (this.wuN != null)
        i = paramInt + e.a.a.a.ix(10, this.wuN.computeSize());
      AppMethodBeat.o(96234);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96234);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        arb localarb = (arb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 9:
        default:
          paramInt = -1;
          AppMethodBeat.o(96234);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localarb.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(96234);
          paramInt = i;
          break;
        case 2:
          localarb.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96234);
          paramInt = i;
          break;
        case 3:
          localarb.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96234);
          paramInt = i;
          break;
        case 4:
          localarb.vOP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96234);
          paramInt = i;
          break;
        case 5:
          localarb.wuL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96234);
          paramInt = i;
          break;
        case 6:
          localarb.wtb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96234);
          paramInt = i;
          break;
        case 7:
          localarb.wuM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96234);
          paramInt = i;
          break;
        case 8:
          localarb.wsY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96234);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bie();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bie)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localarb.wuN = ((bie)localObject1);
          }
          AppMethodBeat.o(96234);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96234);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.arb
 * JD-Core Version:    0.6.2
 */
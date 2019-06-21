package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class agl extends bsr
{
  public String cMC;
  public String cMD;
  public int cME;
  public String kde;
  public String vBu;
  public String vBv;
  public int vBw;
  public cdc vBy;
  public String wni;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89077);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cMC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: card_id");
        AppMethodBeat.o(89077);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.cMC != null)
        paramArrayOfObject.e(2, this.cMC);
      paramArrayOfObject.iz(3, this.cME);
      if (this.kde != null)
        paramArrayOfObject.e(4, this.kde);
      if (this.cMD != null)
        paramArrayOfObject.e(5, this.cMD);
      if (this.vBu != null)
        paramArrayOfObject.e(6, this.vBu);
      if (this.vBv != null)
        paramArrayOfObject.e(7, this.vBv);
      paramArrayOfObject.iz(8, this.vBw);
      if (this.wni != null)
        paramArrayOfObject.e(9, this.wni);
      if (this.vBy != null)
      {
        paramArrayOfObject.iy(10, this.vBy.computeSize());
        this.vBy.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(89077);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1015;
    label1015: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cMC != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cMC);
      i += e.a.a.b.b.a.bs(3, this.cME);
      paramInt = i;
      if (this.kde != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kde);
      i = paramInt;
      if (this.cMD != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.cMD);
      paramInt = i;
      if (this.vBu != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vBu);
      i = paramInt;
      if (this.vBv != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vBv);
      i += e.a.a.b.b.a.bs(8, this.vBw);
      paramInt = i;
      if (this.wni != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wni);
      i = paramInt;
      if (this.vBy != null)
        i = paramInt + e.a.a.a.ix(10, this.vBy.computeSize());
      AppMethodBeat.o(89077);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.cMC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: card_id");
          AppMethodBeat.o(89077);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(89077);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        agl localagl = (agl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89077);
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
            localagl.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(89077);
          paramInt = i;
          break;
        case 2:
          localagl.cMC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89077);
          paramInt = i;
          break;
        case 3:
          localagl.cME = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89077);
          paramInt = i;
          break;
        case 4:
          localagl.kde = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89077);
          paramInt = i;
          break;
        case 5:
          localagl.cMD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89077);
          paramInt = i;
          break;
        case 6:
          localagl.vBu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89077);
          paramInt = i;
          break;
        case 7:
          localagl.vBv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89077);
          paramInt = i;
          break;
        case 8:
          localagl.vBw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89077);
          paramInt = i;
          break;
        case 9:
          localagl.wni = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89077);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cdc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagl.vBy = paramArrayOfObject;
          }
          AppMethodBeat.o(89077);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89077);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.agl
 * JD-Core Version:    0.6.2
 */